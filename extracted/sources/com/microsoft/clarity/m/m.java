package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.images.Image;
import com.microsoft.clarity.models.display.images.Sampling;
import com.microsoft.clarity.models.display.paints.shaders.ImageShader;
import defpackage.js3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class m extends l {
    public final long b;
    public final s c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j, Q q, s sVar) {
        super(new t(), q);
        js3.p(sVar, "parserFactory");
        this.b = j;
        this.c = sVar;
    }

    @Override // com.microsoft.clarity.m.l
    public boolean b() {
        return false;
    }

    @Override // com.microsoft.clarity.m.l
    public boolean c() {
        return true;
    }

    public long d() {
        return this.b;
    }

    public boolean e() {
        return true;
    }

    @Override // com.microsoft.clarity.m.l
    public ImageShader c(d dVar) {
        js3.p(dVar, "buffer");
        int iL = dVar.l();
        int iL2 = dVar.l();
        Sampling samplingD = d(dVar);
        ArrayList arrayListE = e() ? dVar.e() : null;
        s sVar = this.c;
        long jD = d();
        sVar.getClass();
        Object objA = (jD < 78 ? new g() : new f()).a(dVar);
        js3.m(objA);
        return new ImageShader(((long) iL) & 4294967295L, 4294967295L & ((long) iL2), arrayListE, false, (Image) objA, samplingD);
    }
}
