package defpackage;

import com.google.protobuf.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public interface dv4 extends fv4, Cloneable {
    ev4 build();

    ev4 buildPartial();

    dv4 mergeFrom(ByteString byteString, h72 h72Var);

    dv4 mergeFrom(ev4 ev4Var);

    dv4 mergeFrom(lu0 lu0Var, h72 h72Var);

    dv4 mergeFrom(byte[] bArr);
}
