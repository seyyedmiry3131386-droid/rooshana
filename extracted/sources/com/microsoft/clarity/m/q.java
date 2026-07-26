package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends p {
    public final long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j, Q q, s sVar) {
        super(j, q, sVar);
        js3.p(sVar, "parserFactory");
        this.g = j;
    }

    @Override // com.microsoft.clarity.m.p, com.microsoft.clarity.m.o, com.microsoft.clarity.m.n, com.microsoft.clarity.m.m
    public final long d() {
        return this.g;
    }
}
