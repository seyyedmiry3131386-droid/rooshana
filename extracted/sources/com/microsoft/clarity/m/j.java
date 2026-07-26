package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.images.AnisoSampling;
import com.microsoft.clarity.models.display.images.Sampling;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {
    public final Q d;

    public j(long j, Q q) {
        super(q);
        this.d = q;
    }

    @Override // com.microsoft.clarity.m.i, com.microsoft.clarity.m.c
    public final com.microsoft.clarity.l.a a() {
        return this.d;
    }

    @Override // com.microsoft.clarity.m.h
    public final Sampling e(d dVar) {
        js3.p(dVar, "buffer");
        int iD = dVar.d();
        AnisoSampling anisoSampling = iD != 0 ? new AnisoSampling(iD) : null;
        return anisoSampling != null ? anisoSampling : dVar.j();
    }
}
