package com.microsoft.clarity.protomodels.mutationpayload;

import defpackage.fv4;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0129m0 extends com.google.protobuf.m implements fv4 {
    public C0129m0() {
        super(MutationPayload$Lattice.DEFAULT_INSTANCE);
    }

    public final C0129m0 a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$Lattice) this.instance).setBounds(mutationPayload$Rect);
        return this;
    }

    public final C0129m0 b(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$Lattice) this.instance).addAllXDivs(iterable);
        return this;
    }

    public final C0129m0 c(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$Lattice) this.instance).addAllYDivs(iterable);
        return this;
    }

    public final C0129m0 a(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$Lattice) this.instance).addAllColors(arrayList);
        return this;
    }

    public final C0129m0 a(Iterable iterable) {
        copyOnWrite();
        ((MutationPayload$Lattice) this.instance).addAllRectType(iterable);
        return this;
    }
}
