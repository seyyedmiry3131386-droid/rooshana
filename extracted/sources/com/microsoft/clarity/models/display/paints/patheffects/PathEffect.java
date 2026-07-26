package com.microsoft.clarity.models.display.paints.patheffects;

import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Flattenable;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$PathEffect;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PathEffect extends Flattenable implements IProtoModel<MutationPayload$PathEffect> {
    public abstract PathEffectType getType();
}
