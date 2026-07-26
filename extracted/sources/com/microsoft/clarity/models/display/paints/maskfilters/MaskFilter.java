package com.microsoft.clarity.models.display.paints.maskfilters;

import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Flattenable;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$MaskFilter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MaskFilter extends Flattenable implements IProtoModel<MutationPayload$MaskFilter> {
    public abstract MaskFilterType getType();
}
