package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.lr3;

/* JADX INFO: loaded from: classes3.dex */
public enum g1 implements lr3 {
    ImageShader(0),
    LinearGradientShader(1),
    RadialGradientShader(2),
    SweepGradientShader(3),
    LocalMatrixShader(4),
    Color4Shader(5),
    UNRECOGNIZED(-1);

    public final int a;

    g1(int i2) {
        this.a = i2;
    }

    @Override // defpackage.lr3
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
