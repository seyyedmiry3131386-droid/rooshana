package com.microsoft.clarity.i;

import defpackage.a77;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends Lambda implements bp2 {
    public final /* synthetic */ P a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p) {
        super(0);
        this.a = p;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        com.microsoft.clarity.q.l.b("Enqueuing setting network disconnected tag.");
        this.a.a("Network Disconnected", a77.p("true"));
        return tx8.a;
    }
}
