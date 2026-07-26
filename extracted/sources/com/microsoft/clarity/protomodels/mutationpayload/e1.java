package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends com.google.protobuf.m implements fv4 {
    public e1() {
        super(MutationPayload$Shader.DEFAULT_INSTANCE);
    }

    public final e1 a(boolean z) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setRaw(z);
        return this;
    }

    public final e1 b(double d) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setTX(d);
        return this;
    }

    public final e1 c(double d) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setTY(d);
        return this;
    }

    public final e1 d(double d) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setTileMode(d);
        return this;
    }

    public final void a(MutationPayload$Sampling mutationPayload$Sampling) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setSampling(mutationPayload$Sampling);
    }

    public final e1 b(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).addAllMatrix(iterable);
        return this;
    }

    public final void c(int i) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setMaskedWidth(i);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setImageIndex(i);
    }

    public final void b(int i) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setMaskedHeight(i);
    }

    public final e1 c(MutationPayload$Point mutationPayload$Point) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setStart(mutationPayload$Point);
        return this;
    }

    public final e1 a(double d) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setGradFlags(d);
        return this;
    }

    public final void b(MutationPayload$Color4f mutationPayload$Color4f) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setMaskedColor(mutationPayload$Color4f);
    }

    public final void c(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).addAllPos(iterable);
    }

    public final e1 a(List list) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).addAllColors(list);
        return this;
    }

    public final e1 b(MutationPayload$Point mutationPayload$Point) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setEnd(mutationPayload$Point);
        return this;
    }

    public final e1 c(float f) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setStartAngle(f);
        return this;
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).addAllLocalMatrix(iterable);
    }

    public final e1 b(float f) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setRadius(f);
        return this;
    }

    public final e1 a(MutationPayload$Point mutationPayload$Point) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setCenter(mutationPayload$Point);
        return this;
    }

    public final e1 a(float f) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setEndAngle(f);
        return this;
    }

    public final void a(MutationPayload$Shader mutationPayload$Shader) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setShader(mutationPayload$Shader);
    }

    public final e1 a(MutationPayload$Color4f mutationPayload$Color4f) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setColor4F(mutationPayload$Color4f);
        return this;
    }

    public final void a(MutationPayload$IntList mutationPayload$IntList) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setColor4FSpaceData(mutationPayload$IntList);
    }

    public final e1 a(g1 g1Var) {
        copyOnWrite();
        ((MutationPayload$Shader) this.instance).setTypeEnum(g1Var);
        return this;
    }
}
