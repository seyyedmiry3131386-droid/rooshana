package defpackage;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d81 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final c81 j;

    public d81() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = Build.VERSION.SDK_INT >= 24 ? new c81(cryptoInfo) : null;
    }
}
