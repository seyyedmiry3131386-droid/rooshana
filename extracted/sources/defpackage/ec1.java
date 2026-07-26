package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ec1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = j29.a;
        Locale locale = Locale.US;
        StringBuilder sbB = bl4.B(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        o40.J(sbB, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        o40.J(sbB, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        o40.J(sbB, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        o40.J(sbB, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbB.append(j);
        sbB.append("\n videoFrameProcessingOffsetCount=");
        sbB.append(i11);
        sbB.append("\n}");
        return sbB.toString();
    }
}
