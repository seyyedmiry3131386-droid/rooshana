package com.microsoft.clarity.i;

import com.microsoft.clarity.g.T;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends Lambda implements dp2 {
    public final /* synthetic */ P a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P p) {
        super(1);
        this.a = p;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        T t = (T) obj;
        js3.p(t, "result");
        P p = this.a;
        p.F.add(new F(p, t));
        return tx8.a;
    }
}
