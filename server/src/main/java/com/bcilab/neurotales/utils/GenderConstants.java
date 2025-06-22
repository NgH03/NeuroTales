package com.bcilab.neurotales.utils;
// Description: 性别常量

public class GenderConstants {
    public static final byte MALE = 0;
    public static final byte FEMALE = 1;
    public static final byte UNKNOWN = -1;

    public static boolean isValid(byte gender) {
        return gender == MALE || gender == FEMALE;
    }

    public static String toString(byte gender) {
        return switch (gender) {
            case MALE -> "male";
            case FEMALE -> "female";
            default -> "unknown";
        };
    }

    public static byte fromString(String genderStr) {
        if ("male".equalsIgnoreCase(genderStr)) return MALE;
        if ("female".equalsIgnoreCase(genderStr)) return FEMALE;
        throw new IllegalArgumentException("Invalid gender: " + genderStr);
    }
}
