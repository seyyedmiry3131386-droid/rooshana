package com.microsoft.clarity.g;

import defpackage.bp2;
import java.net.URL;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends Lambda implements bp2 {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, String str) {
        super(0);
        this.a = s0Var;
        this.b = str;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        return Boolean.valueOf(this.a.a(new URL(this.b)));
    }
}
