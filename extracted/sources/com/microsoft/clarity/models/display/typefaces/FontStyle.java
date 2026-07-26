package com.microsoft.clarity.models.display.typefaces;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FontStyle;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class FontStyle implements IProtoModel<MutationPayload$FontStyle> {
    private final long slant;
    private final long weight;
    private final long width;

    public FontStyle(long j, long j2, long j3) {
        this.weight = j;
        this.width = j2;
        this.slant = j3;
    }

    public final long getSlant() {
        return this.slant;
    }

    public final long getWeight() {
        return this.weight;
    }

    public final long getWidth() {
        return this.width;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$FontStyle toProtobufInstance() {
        o oVarBuild = MutationPayload$FontStyle.newBuilder().a(this.slant).b(this.weight).c(this.width).build();
        js3.o(oVarBuild, "newBuilder()\n           …e())\n            .build()");
        return (MutationPayload$FontStyle) oVarBuild;
    }
}
