package com.microsoft.clarity.a;

import com.microsoft.clarity.SessionStartedCallback;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends Lambda implements bp2 {
    public final /* synthetic */ SessionStartedCallback a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(SessionStartedCallback sessionStartedCallback) {
        super(0);
        this.a = sessionStartedCallback;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        tx8 tx8Var;
        Object obj = I.p;
        SessionStartedCallback sessionStartedCallback = this.a;
        synchronized (obj) {
            try {
                com.microsoft.clarity.i.t tVar = I.a;
                if (tVar != null) {
                    tVar.a(sessionStartedCallback);
                } else {
                    I.k = sessionStartedCallback;
                }
                tx8Var = tx8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx8Var;
    }
}
