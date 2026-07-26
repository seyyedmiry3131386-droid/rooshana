package com.microsoft.clarity.i;

import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: renamed from: com.microsoft.clarity.i.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0093o extends Lambda implements bp2 {
    public final /* synthetic */ q a;
    public final /* synthetic */ RunnableC0094p b;
    public final /* synthetic */ Ref$LongRef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093o(q qVar, RunnableC0094p runnableC0094p, Ref$LongRef ref$LongRef) {
        super(0);
        this.a = qVar;
        this.b = runnableC0094p;
        this.c = ref$LongRef;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        this.a.p.postDelayed(this.b, this.c.a);
        return tx8.a;
    }
}
