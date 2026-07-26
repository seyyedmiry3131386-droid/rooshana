package com.microsoft.clarity.i;

import com.microsoft.clarity.models.LogLevel;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends Lambda implements bp2 {
    public final /* synthetic */ P a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(P p) {
        super(0);
        this.a = p;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        bp2 bp2Var = (bp2) this.a.F.take();
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        com.microsoft.clarity.q.l.b("Task deque size: " + this.a.F.size() + '.');
        bp2Var.invoke();
        return tx8.a;
    }
}
