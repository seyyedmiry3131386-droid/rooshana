package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.paints.Color4f;
import com.microsoft.clarity.models.display.paints.colorfilters.ModeColorFilter;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public class p extends o {
    public final long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j, Q q, s sVar) {
        super(j, q, sVar);
        js3.p(sVar, "parserFactory");
        this.f = j;
    }

    @Override // com.microsoft.clarity.m.o, com.microsoft.clarity.m.n, com.microsoft.clarity.m.m
    public long d() {
        return this.f;
    }

    @Override // com.microsoft.clarity.m.l
    public final ModeColorFilter e(d dVar) {
        js3.p(dVar, "buffer");
        return new ModeColorFilter(null, new Color4f(dVar.b(), dVar.b(), dVar.b(), dVar.b()), ((long) dVar.l()) & 4294967295L);
    }
}
