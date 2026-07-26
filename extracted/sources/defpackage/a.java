package defpackage;

import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final byte[] a;

    static {
        ByteString byteString = ByteString.d;
        a = fv.w("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").a;
        fv.w("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
