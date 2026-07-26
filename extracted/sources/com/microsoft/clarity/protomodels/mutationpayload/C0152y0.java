package com.microsoft.clarity.protomodels.mutationpayload;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0152y0 extends com.google.protobuf.m implements InterfaceC0154z0 {
    public C0152y0() {
        super(MutationPayload$Paint.DEFAULT_INSTANCE);
    }

    public final C0152y0 a(MutationPayload$Color4f mutationPayload$Color4f) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setColor(mutationPayload$Color4f);
        return this;
    }

    public final C0152y0 b(double d) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setStrokeCap(d);
        return this;
    }

    public final C0152y0 c(double d) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setStrokeJoin(d);
        return this;
    }

    public final C0152y0 d(double d) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setStyle(d);
        return this;
    }

    public final C0152y0 a(double d) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setBlendMode(d);
        return this;
    }

    public final C0152y0 b(float f) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setStrokeWidth(f);
        return this;
    }

    public final C0152y0 a(float f) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setStrokeMiter(f);
        return this;
    }

    public final C0152y0 b(boolean z) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setDither(z);
        return this;
    }

    public final C0152y0 a(boolean z) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setAntiAlias(z);
        return this;
    }

    public final void a(MutationPayload$ColorFilter mutationPayload$ColorFilter) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setColorFilter(mutationPayload$ColorFilter);
    }

    public final void a(MutationPayload$MaskFilter mutationPayload$MaskFilter) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setMaskFilter(mutationPayload$MaskFilter);
    }

    public final void a(MutationPayload$Shader mutationPayload$Shader) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setShader(mutationPayload$Shader);
    }

    public final void a(MutationPayload$Looper mutationPayload$Looper) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setLooper(mutationPayload$Looper);
    }

    public final void a(MutationPayload$PathEffect mutationPayload$PathEffect) {
        copyOnWrite();
        ((MutationPayload$Paint) this.instance).setPathEffect(mutationPayload$PathEffect);
    }
}
