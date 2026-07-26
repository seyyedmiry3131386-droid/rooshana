package com.microsoft.clarity.models.display.paints.patheffects;

import com.microsoft.clarity.protomodels.mutationpayload.D0;

/* JADX INFO: loaded from: classes3.dex */
public enum PathEffectType {
    DashPathEffect,
    CornerPathEffect,
    Path1DPathEffect;

    public final D0 toProtobufType() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return D0.DashPathEffect;
        }
        if (iOrdinal == 1) {
            return D0.CornerPathEffect;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return D0.Path1DPathEffect;
    }
}
