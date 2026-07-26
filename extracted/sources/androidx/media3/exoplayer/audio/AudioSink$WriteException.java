package androidx.media3.exoplayer.audio;

import androidx.media3.common.b;
import defpackage.rm7;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final int a;
    public final boolean b;
    public final b c;

    public AudioSink$WriteException(int i, b bVar, boolean z) {
        super(rm7.n(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = bVar;
    }
}
