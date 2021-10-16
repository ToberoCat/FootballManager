package io.github.mczeyrox.footballmanager.utility;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonUtility {

    public static void SaveObject(File file, Object object) {
        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(file, object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object ReadObject(File file, Class clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(file, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
