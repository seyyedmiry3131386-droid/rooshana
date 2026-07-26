package com.microsoft.clarity.models.display.paths;

import com.microsoft.clarity.protomodels.mutationpayload.I0;

/* JADX INFO: loaded from: classes3.dex */
public enum PathVerbType {
    AddRRectPathVerb,
    ClosePathVerb,
    ConicPathVerb,
    CubicPathVerb,
    DonePathVerb,
    LinePathVerb,
    MovePathVerb,
    QuadPathVerb;

    public final I0 toProtobufType() {
        return I0.a(ordinal());
    }
}
