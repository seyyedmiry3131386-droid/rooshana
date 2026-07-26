package com.google.gson;

import defpackage.ab2;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldNamingPolicy implements ab2 {
    public static final FieldNamingPolicy a;
    public static final /* synthetic */ FieldNamingPolicy[] b;

    static {
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.1
            @Override // defpackage.ab2
            public final String a(Field field) {
                return field.getName();
            }
        };
        a = fieldNamingPolicy;
        b = new FieldNamingPolicy[]{fieldNamingPolicy, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.2
            @Override // defpackage.ab2
            public final String a(Field field) {
                return FieldNamingPolicy.c(field.getName());
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.3
            @Override // defpackage.ab2
            public final String a(Field field) {
                return FieldNamingPolicy.c(FieldNamingPolicy.b(field.getName(), ' '));
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.4
            @Override // defpackage.ab2
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.5
            @Override // defpackage.ab2
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.6
            @Override // defpackage.ab2
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.7
            @Override // defpackage.ab2
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String b(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) b.clone();
    }
}
