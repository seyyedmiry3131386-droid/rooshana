package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: loaded from: classes3.dex */
public final class F0 extends com.google.protobuf.m implements H0 {
    public F0() {
        super(MutationPayload$PathVerb.DEFAULT_INSTANCE);
    }

    public final F0 a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setRRect(mutationPayload$Rect);
        return this;
    }

    public final F0 b(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setCpx2(f);
        return this;
    }

    public final F0 c(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setCpy1(f);
        return this;
    }

    public final F0 d(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setCpy2(f);
        return this;
    }

    public final F0 e(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setWeight(f);
        return this;
    }

    public final F0 f(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setX(f);
        return this;
    }

    public final F0 g(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setX1(f);
        return this;
    }

    public final F0 h(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setX2(f);
        return this;
    }

    public final F0 i(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setY(f);
        return this;
    }

    public final F0 j(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setY1(f);
        return this;
    }

    public final F0 k(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setY2(f);
        return this;
    }

    public final F0 a(boolean z) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setIsCCW(z);
        return this;
    }

    public final F0 a(float f) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setCpx1(f);
        return this;
    }

    public final F0 a(I0 i0) {
        copyOnWrite();
        ((MutationPayload$PathVerb) this.instance).setTypeEnum(i0);
        return this;
    }
}
