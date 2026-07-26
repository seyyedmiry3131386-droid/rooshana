package com.google.common.hash;

import defpackage.vb8;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final vb8 a;

    static {
        b bVar;
        try {
            new LongAdder();
            bVar = new b(0);
        } catch (Throwable unused) {
            bVar = new b(1);
        }
        a = bVar;
    }
}
