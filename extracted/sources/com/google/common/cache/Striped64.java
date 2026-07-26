package com.google.common.cache;

import defpackage.o88;
import defpackage.ry7;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class Striped64 extends Number {
    public volatile transient ry7[] a;
    public volatile transient long b;
    public volatile transient int c;

    static {
        new ThreadLocal();
        new Random();
        Runtime.getRuntime().availableProcessors();
        try {
            Unsafe unsafeA = a();
            unsafeA.objectFieldOffset(Striped64.class.getDeclaredField("b"));
            unsafeA.objectFieldOffset(Striped64.class.getDeclaredField(ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME));
        } catch (Exception e) {
            throw new Error(e);
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
            return (Unsafe) AccessController.doPrivileged(new o88());
        }
    }
}
