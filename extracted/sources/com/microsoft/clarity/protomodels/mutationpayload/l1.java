package com.microsoft.clarity.protomodels.mutationpayload;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends com.google.protobuf.m implements m1 {
    public l1() {
        super(MutationPayload$TextBlobRun.DEFAULT_INSTANCE);
    }

    public final l1 a(MutationPayload$Point mutationPayload$Point) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).setPoint(mutationPayload$Point);
        return this;
    }

    public final l1 b(float f) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).setFontSize(f);
        return this;
    }

    public final void c(float f) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).setFontSkewX(f);
    }

    public final void a(float f) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).setFontScaleX(f);
    }

    public final void b(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).addAllGlyphs(arrayList);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).setTypefaceIndex(i);
    }

    public final void a(MutationPayload$FloatList mutationPayload$FloatList) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).addPositions(mutationPayload$FloatList);
    }

    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).addAllClusters(arrayList);
    }

    public final void a(String str) {
        copyOnWrite();
        ((MutationPayload$TextBlobRun) this.instance).setText(str);
    }
}
