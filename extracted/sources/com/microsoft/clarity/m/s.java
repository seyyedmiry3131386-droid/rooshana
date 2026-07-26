package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.g.k0;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public final k0 a;
    public final com.microsoft.clarity.p.e b;

    public s(k0 k0Var, com.microsoft.clarity.p.e eVar) {
        js3.p(k0Var, "typefaceCollection");
        js3.p(eVar, "typefaceStore");
        this.a = k0Var;
        this.b = eVar;
    }

    public final l a(long j, Q q) {
        return j < 86 ? new r(j, q, this) : j < 91 ? new m(j, q, this) : j < 92 ? new n(j, q, this) : j < 93 ? new o(j, q, this) : j < 94 ? new p(j, q, this) : new q(j, q, this);
    }
}
