package com.microsoft.clarity.q;

import defpackage.bp2;
import defpackage.dp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Lambda implements bp2 {
    public final /* synthetic */ Lambda a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ bp2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(bp2 bp2Var, boolean z, dp2 dp2Var, bp2 bp2Var2) {
        super(0);
        this.a = (Lambda) bp2Var;
        this.b = z;
        this.c = dp2Var;
        this.d = bp2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bp2, kotlin.jvm.internal.Lambda] */
    @Override // defpackage.bp2
    public final Object invoke() {
        return Boolean.valueOf(g.a((bp2) this.a, this.b, this.c, this.d));
    }
}
