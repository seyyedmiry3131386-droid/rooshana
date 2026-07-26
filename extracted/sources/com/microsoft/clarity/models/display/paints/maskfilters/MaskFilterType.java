package com.microsoft.clarity.models.display.paints.maskfilters;

import com.microsoft.clarity.protomodels.mutationpayload.EnumC0148w0;

/* JADX INFO: loaded from: classes3.dex */
public enum MaskFilterType {
    BlurMaskFilter;

    public final EnumC0148w0 toProtobufType() {
        if (ordinal() != 0) {
            return null;
        }
        return EnumC0148w0.BlurMaskFilter;
    }
}
