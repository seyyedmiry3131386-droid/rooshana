package com.google.common.hash;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Unsafe b;
    public static final long c;
    public volatile long a;

    static {
        try {
            Unsafe unsafeC = Striped64.c();
            b = unsafeC;
            c = unsafeC.objectFieldOffset(d.class.getDeclaredField("a"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public d(long j) {
        this.a = j;
    }

    public final boolean a(long j, long j2) {
        return b.compareAndSwapLong(this, c, j, j2);
    }
}
