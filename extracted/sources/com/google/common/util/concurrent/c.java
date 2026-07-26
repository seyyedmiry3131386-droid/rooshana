package com.google.common.util.concurrent;

import defpackage.b44;
import defpackage.i0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends i0 {
    public static final b44 j = new b44(c.class);
    public volatile Set h;
    public volatile int i;

    static {
        try {
            AtomicReferenceFieldUpdater.newUpdater(c.class, Set.class, "h");
            AtomicIntegerFieldUpdater.newUpdater(c.class, "i");
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (th != null) {
            j.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
