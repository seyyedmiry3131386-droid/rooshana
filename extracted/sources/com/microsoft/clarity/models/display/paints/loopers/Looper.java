package com.microsoft.clarity.models.display.paints.loopers;

import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Flattenable;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Looper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Looper extends Flattenable implements IProtoModel<MutationPayload$Looper> {
    public abstract LooperType getType();
}
