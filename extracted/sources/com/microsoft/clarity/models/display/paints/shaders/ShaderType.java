package com.microsoft.clarity.models.display.paints.shaders;

import com.microsoft.clarity.protomodels.mutationpayload.g1;

/* JADX INFO: loaded from: classes3.dex */
public enum ShaderType {
    ImageShader,
    LinearGradientShader,
    RadialGradientShader,
    SweepGradientShader,
    LocalMatrixShader,
    Color4Shader;

    public final g1 toProtobufType() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return g1.ImageShader;
        }
        if (iOrdinal == 1) {
            return g1.LinearGradientShader;
        }
        if (iOrdinal == 2) {
            return g1.RadialGradientShader;
        }
        if (iOrdinal == 3) {
            return g1.SweepGradientShader;
        }
        if (iOrdinal == 4) {
            return g1.LocalMatrixShader;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return g1.Color4Shader;
    }
}
