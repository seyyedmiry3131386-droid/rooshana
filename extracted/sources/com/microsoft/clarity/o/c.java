package com.microsoft.clarity.o;

import android.os.Trace;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Lambda implements bp2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ double b;
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, double d, f fVar) {
        super(0);
        this.a = str;
        this.b = d;
        this.c = fVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        Trace.setCounter(this.a, (long) this.b);
        this.c.b.a(this.a, this.b);
        return tx8.a;
    }
}
