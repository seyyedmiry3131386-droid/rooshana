package com.microsoft.clarity.models.display.images;

import com.microsoft.clarity.protomodels.mutationpayload.X0;

/* JADX INFO: loaded from: classes3.dex */
public enum SamplingType {
    CubicSampling,
    NonCubicSampling,
    AnisoSampling;

    public final X0 toProtobufType() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return X0.CubicSampling;
        }
        if (iOrdinal == 1) {
            return X0.NonCubicSampling;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return X0.AnisoSampling;
    }
}
