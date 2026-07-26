package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class tx implements pm4 {
    public final MediaCodec a;
    public final wx b;
    public final rm4 c;
    public final gg4 d;
    public boolean e;
    public int f = 0;

    public tx(MediaCodec mediaCodec, HandlerThread handlerThread, rm4 rm4Var, gg4 gg4Var) {
        this.a = mediaCodec;
        this.b = new wx(handlerThread);
        this.c = rm4Var;
        this.d = gg4Var;
    }

    public static void q(tx txVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        gg4 gg4Var;
        wx wxVar = txVar.b;
        MediaCodec mediaCodec = txVar.a;
        HandlerThread handlerThread = wxVar.b;
        vy2.s(wxVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(wxVar, handler);
        wxVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        txVar.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (gg4Var = txVar.d) != null) {
            gg4Var.a(mediaCodec);
        }
        txVar.f = 1;
    }

    public static String r(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.pm4
    public final void a() {
        gg4 gg4Var;
        gg4 gg4Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                wx wxVar = this.b;
                synchronized (wxVar.a) {
                    wxVar.m = true;
                    wxVar.b.quit();
                    wxVar.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
                if (i >= 35 && (gg4Var2 = this.d) != null) {
                    gg4Var2.c(this.a);
                }
                this.a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                    if (i2 >= 35 && (gg4Var = this.d) != null) {
                        gg4Var.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.pm4
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.pm4
    public final void c(int i, d81 d81Var, long j, int i2) {
        this.c.c(i, d81Var, j, i2);
    }

    @Override // defpackage.pm4
    public final void d(int i, int i2, int i3, long j) {
        this.c.d(i, i2, i3, j);
    }

    @Override // defpackage.pm4
    public final void e(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.pm4
    public final MediaFormat f() {
        MediaFormat mediaFormat;
        wx wxVar = this.b;
        synchronized (wxVar.a) {
            try {
                mediaFormat = wxVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.pm4
    public final void flush() {
        this.c.flush();
        this.a.flush();
        wx wxVar = this.b;
        synchronized (wxVar.a) {
            wxVar.l++;
            Handler handler = wxVar.c;
            String str = j29.a;
            handler.post(new b7(5, wxVar));
        }
        this.a.start();
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
        this.c.a();
        wx wxVar = this.b;
        synchronized (wxVar.a) {
            try {
                IllegalStateException illegalStateException = wxVar.n;
                if (illegalStateException != null) {
                    wxVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wxVar.j;
                if (codecException != null) {
                    wxVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wxVar.k;
                if (cryptoException != null) {
                    wxVar.k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (wxVar.l > 0 || wxVar.m) {
                    return -1;
                }
                sr0 sr0Var = wxVar.d;
                int i2 = sr0Var.a;
                int i3 = sr0Var.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = sr0Var.c[i2];
                    sr0Var.a = (i2 + 1) & sr0Var.d;
                }
                return i;
            } finally {
            }
        }
    }

    @Override // defpackage.pm4
    public final void j(bn4 bn4Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new rx(this, bn4Var, 0), handler);
    }

    @Override // defpackage.pm4
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        this.c.a();
        wx wxVar = this.b;
        synchronized (wxVar.a) {
            try {
                IllegalStateException illegalStateException = wxVar.n;
                if (illegalStateException != null) {
                    wxVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wxVar.j;
                if (codecException != null) {
                    wxVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wxVar.k;
                if (cryptoException != null) {
                    wxVar.k = null;
                    throw cryptoException;
                }
                if (wxVar.l > 0 || wxVar.m) {
                    return -1;
                }
                sr0 sr0Var = wxVar.e;
                int i = sr0Var.a;
                int i2 = sr0Var.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = sr0Var.c[i];
                sr0Var.a = sr0Var.d & (i + 1);
                if (i3 >= 0) {
                    vy2.t(wxVar.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) wxVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    wxVar.h = (MediaFormat) wxVar.g.remove();
                }
                return i3;
            } finally {
            }
        }
    }

    @Override // defpackage.pm4
    public final void l(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.pm4
    public final boolean m(r79 r79Var) {
        wx wxVar = this.b;
        synchronized (wxVar.a) {
            wxVar.o = r79Var;
        }
        return true;
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
