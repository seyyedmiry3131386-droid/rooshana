package com.microsoft.clarity.a;

import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Lambda implements bp2 {
    public static final q a = new q();

    public q() {
        super(0);
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        synchronized (I.p) {
            try {
                com.microsoft.clarity.i.t tVar = I.a;
                if (tVar != null) {
                    com.microsoft.clarity.i.q qVar = tVar.a;
                    qVar.r = false;
                    qVar.c();
                }
                I.n = false;
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
