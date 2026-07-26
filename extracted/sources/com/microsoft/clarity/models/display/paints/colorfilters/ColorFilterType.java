package com.microsoft.clarity.models.display.paints.colorfilters;

import com.microsoft.clarity.protomodels.mutationpayload.EnumC0122j;

/* JADX INFO: loaded from: classes3.dex */
public enum ColorFilterType {
    ModeColorFilter,
    MatrixColorFilter;

    public final EnumC0122j toProtobufType() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return EnumC0122j.ModeColorFilter;
        }
        if (iOrdinal != 1) {
            return null;
        }
        return EnumC0122j.MatrixColorFilter;
    }
}
