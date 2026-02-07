package org.example;

public class ExersiceTwo {
    public static void main(String[] args) {

        int iterations = 1000000000;
        long startTimeBuffer = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            buffer.append("J");
        }

        long endTimeBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTimeBuffer - startTimeBuffer) + " ms");


        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append("J");
        }
        long endTimeBuilder = System.currentTimeMillis();

        System.out.println("StringBuilder time: " + (endTimeBuilder - startTimeBuilder) + " ms");

    }
}
