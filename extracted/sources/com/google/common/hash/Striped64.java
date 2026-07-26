package com.google.common.hash;

import defpackage.n88;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class Striped64 extends Number {
    public static final ThreadLocal d = new ThreadLocal();
    public static final Random e = new Random();
    public static final int f = Runtime.getRuntime().availableProcessors();
    public static final Unsafe g;
    public static final long h;
    public static final long i;
    public volatile transient d[] a;
    public volatile transient long b;
    public volatile transient int c;

    static {
        try {
            Unsafe unsafeC = c();
            g = unsafeC;
            h = unsafeC.objectFieldOffset(Striped64.class.getDeclaredField("b"));
            i = unsafeC.objectFieldOffset(Striped64.class.getDeclaredField(ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    public static Unsafe c() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new n88());
        }
    }

    public final boolean a(long j, long j2) {
        return g.compareAndSwapLong(this, h, j, j2);
    }

    public final boolean b() {
        return g.compareAndSwapInt(this, i, 0, 1);
    }
}
