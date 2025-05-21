package com.example.user_service.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class CommonUtils {

    public static Boolean isNullOrEmpty(String s){
        return Objects.isNull(s) || s.isEmpty();
    }

    public static Boolean isNullOrEmpty(List list){
        return Objects.isNull(list) || list.isEmpty();
    }

    public static Boolean isNullOrEmpty(Object object){
        return Objects.isNull(object);
    }
}
