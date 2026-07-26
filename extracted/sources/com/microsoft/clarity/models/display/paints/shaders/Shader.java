package com.microsoft.clarity.models.display.paints.shaders;

import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.models.display.common.Flattenable;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$Shader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Shader extends Flattenable implements IProtoModel<MutationPayload$Shader> {
    public abstract ShaderType getType();
}
