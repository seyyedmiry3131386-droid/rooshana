package com.microsoft.clarity.protomodels.mutationpayload;

import com.google.protobuf.ByteString;

/* JADX INFO: renamed from: com.microsoft.clarity.protomodels.mutationpayload.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0119h0 extends com.google.protobuf.m implements InterfaceC0121i0 {
    public C0119h0() {
        super(MutationPayload$Image.DEFAULT_INSTANCE);
    }

    public final void a(MutationPayload$Rect mutationPayload$Rect) {
        copyOnWrite();
        ((MutationPayload$Image) this.instance).setSubset(mutationPayload$Rect);
    }

    public final void a(String str) {
        copyOnWrite();
        ((MutationPayload$Image) this.instance).setDataHash(str);
    }

    public final void a(ByteString byteString) {
        copyOnWrite();
        ((MutationPayload$Image) this.instance).setMipmap(byteString);
    }
}
