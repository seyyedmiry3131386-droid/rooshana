package androidx.media3.exoplayer.audio;

import androidx.media3.common.b;
import defpackage.bl4;
import defpackage.o40;

/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final int a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, int i5, b bVar, boolean z, RuntimeException runtimeException) {
        StringBuilder sbB = bl4.B(i, i2, "AudioTrack init failed ", " Config(", ", ");
        o40.J(sbB, i3, ", ", i4, ", ");
        sbB.append(i5);
        sbB.append(") ");
        sbB.append(bVar);
        sbB.append(z ? " (recoverable)" : "");
        super(sbB.toString(), runtimeException);
        this.a = i;
        this.b = z;
    }
}
