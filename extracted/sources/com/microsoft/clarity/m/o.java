package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.images.AnisoSampling;
import com.microsoft.clarity.models.display.images.Sampling;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public class o extends n {
    public final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j, Q q, s sVar) {
        super(j, q, sVar);
        js3.p(sVar, "parserFactory");
        this.e = j;
    }

    @Override // com.microsoft.clarity.m.n, com.microsoft.clarity.m.m
    public long d() {
        return this.e;
    }

    @Override // com.microsoft.clarity.m.l
    public final Sampling d(d dVar) {
        js3.p(dVar, "buffer");
        int iD = dVar.d();
        AnisoSampling anisoSampling = iD != 0 ? new AnisoSampling(iD) : null;
        return anisoSampling != null ? anisoSampling : dVar.j();
    }
}
