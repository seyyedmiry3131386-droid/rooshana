package com.google.common.util.concurrent;

import com.google.common.collect.a1;
import defpackage.l91;
import defpackage.mi;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final mi a;

    static {
        a1 a1Var = new a1();
        a1Var.b();
        a1Var.a();
        a = new mi(1);
    }

    public static void a(l91 l91Var) {
        if (((CycleDetectingLockFactory$CycleDetectingReentrantLock) l91Var).isHeldByCurrentThread()) {
            return;
        }
        ArrayList arrayList = (ArrayList) a.get();
        Objects.requireNonNull(arrayList);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
                return;
            }
        }
    }
}
