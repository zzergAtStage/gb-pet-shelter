package com.zergatstage.labs.crud.model;
public class Counter implements AutoCloseable {
    private int count;

    public Counter(){
        count++;
    }
    public void add() {
        if (count < 1) {
            throw new IllegalStateException("Cannot add without initializing the resource in a try-with-resources block.");
        }
        count++;
    }


    @Override
    public void close() throws Exception {
        if (count != 1) {
            throw new IllegalStateException("Resource not properly initialized or was not closed.");
        }
        System.out.println("Resource closed successfully.");
    }
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            // Do something with the counter
            counter.add();
            System.out.println("Resource used in try-with-resources block.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
