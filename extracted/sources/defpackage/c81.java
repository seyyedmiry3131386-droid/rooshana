package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final class c81 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = d1.c();

    public c81(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(c81 c81Var, int i, int i2) {
        c81Var.b.set(i, i2);
        c81Var.a.setPattern(c81Var.b);
    }
}
