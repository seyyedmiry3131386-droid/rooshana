package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.b;
import defpackage.sm4;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {
    public final String a;
    public final boolean b;
    public final sm4 c;
    public final String d;

    public MediaCodecRenderer$DecoderInitializationException(b bVar, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + bVar, mediaCodecUtil$DecoderQueryException, bVar.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, sm4 sm4Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = sm4Var;
        this.d = str3;
    }
}
