package com.smarthome.oven;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int PORT = 50053;
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(PORT)
                .addService(new OvenServiceImpl())
                .build()
                .start();
        
        System.out.println("Oven gRPC server started on port " + PORT);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("*** server shut down");
        }));
        
        server.awaitTermination();
    }
}