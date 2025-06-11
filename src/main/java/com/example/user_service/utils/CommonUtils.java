package com.example.user_service.utils;

import com.example.user_service.application.exceptions.BaseException;
import com.example.user_service.application.exceptions.Error;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class CommonUtils {
    private static final long maxFileSize = 10485760; // TODO: should use value in variable of properties file

    public static String saveFile(String uploadDir, String fileName, byte[] bytes) throws IOException {
        if (fileName == null || fileName.isBlank() || fileName.contains("..")) {
            throw new BaseException(Error.INVALID_FILE);
        }

        if (bytes.length > maxFileSize) {
            throw new BaseException(Error.PAYLOAD_TOO_LARGE);
        }

        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        Path filePath = Paths.get(uploadDir, fileName);
        Files.write(filePath, bytes);

        return filePath.toString();
    }

    public static Boolean isNullOrEmpty(String s){
        return Objects.isNull(s) || s.isEmpty();
    }

    public static Boolean isNullOrEmpty(List list){
        return Objects.isNull(list) || list.isEmpty();
    }

    public static Boolean isNullOrEmpty(Object object){
        return Objects.isNull(object);
    }

    public static String getUserId(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
