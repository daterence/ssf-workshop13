package com.ssf.workshop13.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class IOUtil {
    private static final Logger logger = LoggerFactory.getLogger(IOUtil.class);

    public static void createDir(String path) {

        try {
            File dir = new File(path);
            dir.mkdir();
//            set permission for file
            String perm = "rwxrwx---";
            Set<PosixFilePermission> permissions = PosixFilePermissions.fromString(perm);
            Files.setPosixFilePermissions(dir.toPath(), permissions);
            logger.info(path + " has been created!");
        } catch (Exception e) {
            logger.error("Error creating directory", e);
        }

    }
}
