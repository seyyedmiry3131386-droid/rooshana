package com.google.common.hash;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class LittleEndianByteArray$UnsafeByteArray {
    public static final /* synthetic */ LittleEndianByteArray$UnsafeByteArray[] a = {new LittleEndianByteArray$UnsafeByteArray() { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.1
    }, new LittleEndianByteArray$UnsafeByteArray() { // from class: com.google.common.hash.LittleEndianByteArray$UnsafeByteArray.2
    }};

    /* JADX INFO: Fake field, exist only in values array */
    LittleEndianByteArray$UnsafeByteArray EF2;

    static {
        Unsafe unsafeA = a();
        unsafeA.arrayBaseOffset(byte[].class);
        if (unsafeA.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }

    public static Unsafe a() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    public static /* synthetic */ Unsafe b() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static LittleEndianByteArray$UnsafeByteArray valueOf(String str) {
        return (LittleEndianByteArray$UnsafeByteArray) Enum.valueOf(LittleEndianByteArray$UnsafeByteArray.class, str);
    }

    public static LittleEndianByteArray$UnsafeByteArray[] values() {
        return (LittleEndianByteArray$UnsafeByteArray[]) a.clone();
    }
}
