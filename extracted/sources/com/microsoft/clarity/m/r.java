package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.images.Image;
import com.microsoft.clarity.models.display.paints.shaders.ImageShader;
import defpackage.js3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends l {
    public final long b;
    public final s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j, Q q, s sVar) {
        super(new t(), q);
        js3.p(sVar, "parserFactory");
        this.b = j;
        this.c = sVar;
    }

    @Override // com.microsoft.clarity.m.l
    public final boolean b() {
        return false;
    }

    @Override // com.microsoft.clarity.m.l
    public final boolean c() {
        return true;
    }

    @Override // com.microsoft.clarity.m.l
    public final ImageShader c(d dVar) {
        js3.p(dVar, "buffer");
        int iL = dVar.l();
        int iL2 = dVar.l();
        ArrayList arrayListE = dVar.e();
        s sVar = this.c;
        long j = this.b;
        sVar.getClass();
        Object objA = (j < 78 ? new g() : new f()).a(dVar);
        js3.m(objA);
        return new ImageShader(((long) iL) & 4294967295L, 4294967295L & ((long) iL2), arrayListE, false, (Image) objA, null);
    }
}
