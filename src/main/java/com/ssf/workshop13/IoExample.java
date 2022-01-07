package com.ssf.workshop13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoExample {
    public static void main(String[] args) {

        try {
            InputStream input = new FileInputStream("src/main/resources/input.txt");
            OutputStream output = new FileOutputStream("src/main/resources/output.txt");

            System.out.println("Available bytes in the file: " + input.available());
            // array size is the byte in the input file
            byte[] array = new byte[input.available()];
            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");
            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);
            // Close the input stream
            input.close();

            // OutputStream
            output.write(array);
            System.out.println("Data written to output.txt");
            // Close the output stream
            output.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
