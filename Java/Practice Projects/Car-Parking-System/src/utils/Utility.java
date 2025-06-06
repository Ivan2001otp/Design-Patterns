package utils;

import java.util.UUID;

public class Utility {
    public static String autoGenerateId() {
        return UUID.randomUUID().toString();
    }
}
