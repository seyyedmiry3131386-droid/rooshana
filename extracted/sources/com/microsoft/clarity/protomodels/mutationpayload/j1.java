package com.microsoft.clarity.protomodels.mutationpayload;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends com.google.protobuf.m implements k1 {
    public j1() {
        super(MutationPayload$TextBlob.DEFAULT_INSTANCE);
    }

    public final void a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$TextBlob) this.instance).setBounds(mutationPayload$Rect);
    }

    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$TextBlob) this.instance).addAllRuns(arrayList);
    }
}
