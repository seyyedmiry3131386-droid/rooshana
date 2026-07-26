package com.microsoft.clarity.a;

import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends Lambda implements bp2 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str) {
        super(0);
        this.a = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        Object obj = I.p;
        String str = this.a;
        synchronized (obj) {
            try {
                com.microsoft.clarity.i.t tVar = I.a;
                if (tVar != null) {
                    js3.p(str, "customSessionId");
                    tVar.b.b(str);
                } else {
                    I.g = str;
                }
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
