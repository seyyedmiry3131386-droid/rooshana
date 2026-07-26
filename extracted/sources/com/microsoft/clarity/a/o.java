package com.microsoft.clarity.a;

import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Lambda implements bp2 {
    public static final o a = new o();

    public o() {
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
                    qVar.r = true;
                    qVar.b();
                }
                I.n = true;
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
