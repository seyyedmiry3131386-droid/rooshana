package com.microsoft.clarity.models.display.paints.loopers;

import com.microsoft.clarity.protomodels.mutationpayload.EnumC0142t0;

/* JADX INFO: loaded from: classes3.dex */
public enum LooperType {
    LayerDrawLooper;

    public final EnumC0142t0 toProtobufType() {
        if (ordinal() != 0) {
            return null;
        }
        return EnumC0142t0.LayerDrawLooper;
    }
}
