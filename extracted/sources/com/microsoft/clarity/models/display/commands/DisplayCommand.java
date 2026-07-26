package com.microsoft.clarity.models.display.commands;

import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DisplayCommand implements IProtoModel<MutationPayload$DisplayCommandV2> {
    public abstract DisplayCommandType getType();
}
