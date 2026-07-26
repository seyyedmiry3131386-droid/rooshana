package com.microsoft.clarity.models.display.typefaces;

import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$FontCoordinate;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class FontCoordinate implements IProtoModel<MutationPayload$FontCoordinate> {
    private final String axis;
    private final float value;

    public FontCoordinate(String str, float f) {
        js3.p(str, "axis");
        this.axis = str;
        this.value = f;
    }

    public final String getAxis() {
        return this.axis;
    }

    public final float getValue() {
        return this.value;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$FontCoordinate toProtobufInstance() {
        o oVarBuild = MutationPayload$FontCoordinate.newBuilder().a(this.axis).a(this.value).build();
        js3.o(oVarBuild, "newBuilder()\n           …lue)\n            .build()");
        return (MutationPayload$FontCoordinate) oVarBuild;
    }
}
