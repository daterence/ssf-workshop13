package com.ssf.workshop13;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

@SpringBootApplication
public class Workshop13Application {

    public static void main(String[] args) {
//        SpringApplication.run(Workshop13Application.class, args);

        // init the spring app
        SpringApplication app = new SpringApplication(Workshop13Application.class);
        // decode the java app args using spring args helper
        ApplicationArguments appArgs = new DefaultApplicationArguments(args);

        // check args contains "dataDir"
        // if no, print Error message
        // if yes, check if directory exist
        if (!appArgs.containsOption("dataDir")) {
            System.out.println("Error");
        } else {
            String path = args[1];
            File dir = new File(path);
            boolean res = dir.mkdir();
            System.out.println("Path is " + path);
            if (res){
                System.out.println(path + " is created");
            } else {
                System.out.println(path + " already exists");
            }
        }

        app.run(args);
    }
}
