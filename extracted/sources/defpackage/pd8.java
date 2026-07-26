package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class pd8 implements pm4 {
    public final MediaCodec a;
    public final gg4 b;

    public pd8(MediaCodec mediaCodec, gg4 gg4Var) {
        this.a = mediaCodec;
        this.b = gg4Var;
        if (Build.VERSION.SDK_INT < 35 || gg4Var == null) {
            return;
        }
        gg4Var.a(mediaCodec);
    }

    @Override // defpackage.pm4
    public final void a() {
        gg4 gg4Var = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && gg4Var != null) {
                gg4Var.c(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && gg4Var != null) {
                gg4Var.c(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // defpackage.pm4
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.pm4
    public final void c(int i, d81 d81Var, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, d81Var.i, j, i2);
    }

    @Override // defpackage.pm4
    public final void d(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.pm4
    public final void e(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.pm4
    public final MediaFormat f() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.pm4
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.pm4
    public final void g() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.pm4
    public final void h(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.pm4
    public final int i() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.pm4
    public final void j(bn4 bn4Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new rx(this, bn4Var, 1), handler);
    }

    @Override // defpackage.pm4
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.pm4
    public final void l(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.pm4
    public final /* synthetic */ boolean m(r79 r79Var) {
        return false;
    }

    @Override // defpackage.pm4
    public final ByteBuffer n(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.pm4
    public final void o(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.pm4
    public final ByteBuffer p(int i) {
        return this.a.getOutputBuffer(i);
    }
}
