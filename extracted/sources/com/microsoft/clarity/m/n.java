package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.paints.shaders.ImageShader;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public class n extends m {
    public final long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j, Q q, s sVar) {
        super(j, q, sVar);
        js3.p(sVar, "parserFactory");
        this.d = j;
    }

    @Override // com.microsoft.clarity.m.m, com.microsoft.clarity.m.l
    public final boolean b() {
        return true;
    }

    @Override // com.microsoft.clarity.m.m, com.microsoft.clarity.m.l
    public final boolean c() {
        return false;
    }

    @Override // com.microsoft.clarity.m.m
    public long d() {
        return this.d;
    }

    @Override // com.microsoft.clarity.m.m
    public boolean e() {
        return !(this instanceof q);
    }

    @Override // com.microsoft.clarity.m.m, com.microsoft.clarity.m.l
    public final ImageShader c(d dVar) {
        js3.p(dVar, "buffer");
        ImageShader imageShaderC = super.c(dVar);
        return new ImageShader(imageShaderC.getTX(), imageShaderC.getTY(), imageShaderC.getMatrix(), dVar.l() != 0, imageShaderC.getImage(), imageShaderC.getSampling());
    }
}
