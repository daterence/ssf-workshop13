package com.ssf.workshop13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.ssf.workshop13.util.IOUtil.createDir;

@SpringBootApplication
public class Workshop13Application {

    private static final Logger logger = LoggerFactory.getLogger(Workshop13Application.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Workshop13Application.class);
        ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
        logger.info("Path > " + cliOpts.getOptionValues("dataDir").get(0));

        if (cliOpts.containsOption("dataDir")) {
            String path = cliOpts.getOptionValues("dataDir").get(0);
            logger.info("Path is " + path);
            createDir(path);
        } else {
            logger.warn("No data directory is provided!");
            System.exit(1);
        }
        app.run(args);
    }
}
