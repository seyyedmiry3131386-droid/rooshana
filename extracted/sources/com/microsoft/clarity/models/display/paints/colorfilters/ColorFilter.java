package com.microsoft.clarity.models.display.paints.colorfilters;

import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Flattenable;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ColorFilter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ColorFilter extends Flattenable implements IProtoModel<MutationPayload$ColorFilter> {
    public abstract ColorFilterType getType();
}
