package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends com.google.protobuf.m implements fv4 {
    public N() {
        super(MutationPayload$DrawPointsCommandPayload.DEFAULT_INSTANCE);
    }

    public final N a(List list) {
        copyOnWrite();
        ((MutationPayload$DrawPointsCommandPayload) this.instance).addAllPoints(list);
        return this;
    }

    public final N b(int i) {
        copyOnWrite();
        ((MutationPayload$DrawPointsCommandPayload) this.instance).setPointMode(i);
        return this;
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$DrawPointsCommandPayload) this.instance).setPaintIndex(i);
    }
}
