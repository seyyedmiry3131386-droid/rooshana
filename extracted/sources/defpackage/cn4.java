package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class cn4 extends um4 {
    public static final int[] U1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean V1;
    public static boolean W1;
    public long A1;
    public int B1;
    public int C1;
    public int D1;
    public gh7 E1;
    public boolean F1;
    public long G1;
    public int H1;
    public long I1;
    public w59 J1;
    public w59 K1;
    public int L1;
    public boolean M1;
    public int N1;
    public bn4 O1;
    public f59 P1;
    public long Q1;
    public long R1;
    public boolean S1;
    public int T1;
    public final Context e1;
    public final boolean f1;
    public final n00 g1;
    public final int h1;
    public final boolean i1;
    public final i59 j1;
    public final fg0 k1;
    public final long l1;
    public final PriorityQueue m1;
    public rz5 n1;
    public boolean o1;
    public boolean p1;
    public v59 q1;
    public boolean r1;
    public int s1;
    public List t1;
    public Surface u1;
    public PlaceholderSurface v1;
    public cy7 w1;
    public boolean x1;
    public int y1;
    public int z1;

    public cn4(an4 an4Var) {
        super(2, an4Var.c, an4Var.e, 30.0f);
        Context applicationContext = an4Var.a.getApplicationContext();
        this.e1 = applicationContext;
        this.h1 = an4Var.h;
        this.q1 = null;
        this.g1 = new n00(an4Var.f, an4Var.g, 1);
        this.f1 = this.q1 == null;
        this.j1 = new i59(applicationContext, this, an4Var.d);
        this.k1 = new fg0();
        this.i1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.w1 = cy7.c;
        this.y1 = 1;
        this.z1 = 0;
        this.J1 = w59.d;
        this.N1 = 0;
        this.K1 = null;
        this.L1 = -1000;
        this.Q1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        this.m1 = new PriorityQueue();
        this.l1 = -9223372036854775807L;
        this.E1 = null;
    }

    public static int A0(sm4 sm4Var, b bVar) {
        int i = bVar.o;
        List list = bVar.q;
        if (i == -1) {
            return y0(sm4Var, bVar);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return bVar.o + length;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean x0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn4.x0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int y0(defpackage.sm4 r11, androidx.media3.common.b r12) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn4.y0(sm4, androidx.media3.common.b):int");
    }

    public static List z0(Context context, y32 y32Var, b bVar, boolean z, boolean z2) {
        String str = bVar.n;
        if (str == null) {
            return ImmutableList.q();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !fz.g(context)) {
            String strB = ym4.b(bVar);
            List listQ = strB == null ? ImmutableList.q() : y32Var.a(strB, z, z2);
            if (!listQ.isEmpty()) {
                return listQ;
            }
        }
        return ym4.f(y32Var, bVar, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface B0(defpackage.sm4 r6) {
        /*
            r5 = this;
            v59 r0 = r5.q1
            if (r0 == 0) goto L9
            android.view.Surface r6 = r0.b()
            return r6
        L9:
            android.view.Surface r0 = r5.u1
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.h
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.K0(r6)
            defpackage.vy2.s(r0)
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r5.v1
            if (r0 == 0) goto L32
            boolean r1 = r0.a
            boolean r3 = r6.f
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.v1 = r2
        L32:
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r5.v1
            if (r0 != 0) goto Lab
            android.content.Context r0 = r5.e1
            boolean r6 = r6.f
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L47
            boolean r0 = androidx.media3.exoplayer.video.PlaceholderSurface.b(r0)
            if (r0 == 0) goto L45
            goto L49
        L45:
            r0 = r2
            goto L4a
        L47:
            int r0 = androidx.media3.exoplayer.video.PlaceholderSurface.d
        L49:
            r0 = r1
        L4a:
            defpackage.vy2.s(r0)
            i96 r0 = new i96
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L59
            int r6 = androidx.media3.exoplayer.video.PlaceholderSurface.d
            goto L5a
        L59:
            r6 = r2
        L5a:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.b = r3
            ty1 r4 = new ty1
            r4.<init>(r3)
            r0.a = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.b     // Catch: java.lang.Throwable -> L89
            android.os.Message r6 = r3.obtainMessage(r1, r6, r2)     // Catch: java.lang.Throwable -> L89
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L89
        L79:
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r0.e     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.RuntimeException r6 = r0.d     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.Error r6 = r0.c     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            r0.wait()     // Catch: java.lang.Throwable -> L89 java.lang.InterruptedException -> L8b
            goto L79
        L89:
            r6 = move-exception
            goto La9
        L8b:
            r2 = r1
            goto L79
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L97
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L97:
            java.lang.RuntimeException r6 = r0.d
            if (r6 != 0) goto La8
            java.lang.Error r6 = r0.c
            if (r6 != 0) goto La7
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r0.e
            r6.getClass()
            r5.v1 = r6
            goto Lab
        La7:
            throw r6
        La8:
            throw r6
        La9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r6
        Lab:
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r5.v1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn4.B0(sm4):android.view.Surface");
    }

    @Override // defpackage.um4
    public final hc1 C(sm4 sm4Var, b bVar, b bVar2) {
        hc1 hc1VarB = sm4Var.b(bVar, bVar2);
        int i = hc1VarB.e;
        rz5 rz5Var = this.n1;
        rz5Var.getClass();
        if (bVar2.u > rz5Var.a || bVar2.v > rz5Var.b) {
            i |= 256;
        }
        if (A0(sm4Var, bVar2) > rz5Var.c) {
            i |= 64;
        }
        int i2 = i;
        return new hc1(sm4Var.a, bVar, bVar2, i2 != 0 ? 0 : hc1VarB.d, i2);
    }

    public final boolean C0(sm4 sm4Var) {
        if (this.q1 != null) {
            return true;
        }
        Surface surface = this.u1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && sm4Var.h) || K0(sm4Var);
        }
        return true;
    }

    @Override // defpackage.um4
    public final MediaCodecDecoderException D(IllegalStateException illegalStateException, sm4 sm4Var) {
        Surface surface = this.u1;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, sm4Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final boolean D0(fc1 fc1Var) {
        if (k() || fc1Var.d(536870912)) {
            return true;
        }
        long j = this.R1;
        return j == -9223372036854775807L || j - (fc1Var.g - this.W0.c) <= 100000;
    }

    public final void E0() {
        if (this.B1 > 0) {
            this.g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.A1;
            int i = this.B1;
            n00 n00Var = this.g1;
            Handler handler = n00Var.b;
            if (handler != null) {
                handler.post(new s59(n00Var, i, j));
            }
            this.B1 = 0;
            this.A1 = jElapsedRealtime;
        }
    }

    public final void F0() {
        if (this.M1) {
            int i = Build.VERSION.SDK_INT;
            pm4 pm4Var = this.M;
            if (pm4Var == null) {
                return;
            }
            this.O1 = new bn4(this, pm4Var);
            if (i >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                pm4Var.b(bundle);
            }
        }
    }

    public final void G0(long j) {
        Surface surface;
        w0(j);
        w59 w59Var = this.J1;
        boolean zEquals = w59Var.equals(w59.d);
        n00 n00Var = this.g1;
        if (!zEquals && !w59Var.equals(this.K1)) {
            this.K1 = w59Var;
            n00Var.c(w59Var);
        }
        this.V0.e++;
        i59 i59Var = this.j1;
        boolean z = i59Var.e != 3;
        i59Var.e = 3;
        i59Var.l.getClass();
        i59Var.g = j29.V(SystemClock.elapsedRealtime());
        if (z && (surface = this.u1) != null) {
            Handler handler = n00Var.b;
            if (handler != null) {
                handler.post(new q59(n00Var, surface, SystemClock.elapsedRealtime()));
            }
            this.x1 = true;
        }
        b0(j);
    }

    public final void H0(pm4 pm4Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        pm4Var.h(i, j);
        Trace.endSection();
        this.V0.e++;
        this.C1 = 0;
        if (this.q1 == null) {
            w59 w59Var = this.J1;
            boolean zEquals = w59Var.equals(w59.d);
            n00 n00Var = this.g1;
            if (!zEquals && !w59Var.equals(this.K1)) {
                this.K1 = w59Var;
                n00Var.c(w59Var);
            }
            i59 i59Var = this.j1;
            boolean z = i59Var.e != 3;
            i59Var.e = 3;
            i59Var.l.getClass();
            i59Var.g = j29.V(SystemClock.elapsedRealtime());
            if (!z || (surface = this.u1) == null) {
                return;
            }
            Handler handler = n00Var.b;
            if (handler != null) {
                handler.post(new q59(n00Var, surface, SystemClock.elapsedRealtime()));
            }
            this.x1 = true;
        }
    }

    public final void I0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.u1;
        n00 n00Var = this.g1;
        if (surface2 == surface) {
            if (surface != null) {
                w59 w59Var = this.K1;
                if (w59Var != null) {
                    n00Var.c(w59Var);
                }
                Surface surface3 = this.u1;
                if (surface3 == null || !this.x1 || (handler = n00Var.b) == null) {
                    return;
                }
                handler.post(new q59(n00Var, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.u1 = surface;
        v59 v59Var = this.q1;
        i59 i59Var = this.j1;
        if (v59Var == null) {
            i59Var.h(surface);
        }
        this.x1 = false;
        int i = this.h;
        pm4 pm4Var = this.M;
        if (pm4Var != null && this.q1 == null) {
            sm4 sm4Var = this.T;
            sm4Var.getClass();
            boolean zC0 = C0(sm4Var);
            int i2 = Build.VERSION.SDK_INT;
            if (!zC0 || this.o1) {
                h0();
                S();
            } else {
                Surface surfaceB0 = B0(sm4Var);
                if (surfaceB0 != null) {
                    pm4Var.o(surfaceB0);
                } else {
                    if (i2 < 35) {
                        throw new IllegalStateException();
                    }
                    pm4Var.g();
                }
            }
        }
        if (surface != null) {
            w59 w59Var2 = this.K1;
            if (w59Var2 != null) {
                n00Var.c(w59Var2);
            }
        } else {
            this.K1 = null;
            v59 v59Var2 = this.q1;
            if (v59Var2 != null) {
                v59Var2.j();
            }
        }
        if (i == 2) {
            v59 v59Var3 = this.q1;
            if (v59Var3 != null) {
                v59Var3.q(true);
            } else {
                i59Var.c(true);
            }
        }
        F0();
    }

    public final boolean J0(long j, long j2, boolean z, boolean z2) {
        if (this.q1 != null && this.f1) {
            j2 -= -this.Q1;
        }
        if (j < -500000 && !z) {
            pc7 pc7Var = this.i;
            pc7Var.getClass();
            int iG = pc7Var.g(j2 - this.k);
            if (iG != 0) {
                PriorityQueue priorityQueue = this.m1;
                if (z2) {
                    ec1 ec1Var = this.V0;
                    int i = ec1Var.d + iG;
                    ec1Var.d = i;
                    ec1Var.f += this.D1;
                    ec1Var.d = priorityQueue.size() + i;
                } else {
                    this.V0.j++;
                    M0(priorityQueue.size() + iG, this.D1);
                }
                if (I()) {
                    S();
                }
                v59 v59Var = this.q1;
                if (v59Var != null) {
                    v59Var.m(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.um4
    public final int K(fc1 fc1Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.E1 == null && !this.M1) || fc1Var.g >= this.l || D0(fc1Var)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean K0(sm4 sm4Var) {
        if (this.M1 || x0(sm4Var.a)) {
            return false;
        }
        return !sm4Var.f || PlaceholderSurface.b(this.e1);
    }

    @Override // defpackage.um4
    public final float L(float f, b bVar, b[] bVarArr) {
        sm4 sm4Var;
        float fMax = -1.0f;
        for (b bVar2 : bVarArr) {
            float f2 = bVar2.y;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.E1 == null || (sm4Var = this.T) == null) {
            return f3;
        }
        int i = bVar.u;
        int i2 = bVar.v;
        float f4 = -3.4028235E38f;
        if (sm4Var.i) {
            float f5 = sm4Var.l;
            if (f5 != -3.4028235E38f && sm4Var.j == i && sm4Var.k == i2) {
                f4 = f5;
            } else {
                float f6 = 1024.0f;
                if (!sm4Var.g(i, i2, 1024.0f)) {
                    f4 = 0.0f;
                    while (true) {
                        float f7 = f6 - f4;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f4;
                        if (sm4Var.g(i, i2, f8)) {
                            f4 = f8;
                        } else {
                            f6 = f8;
                        }
                    }
                } else {
                    f4 = 1024.0f;
                }
                sm4Var.l = f4;
                sm4Var.j = i;
                sm4Var.k = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final void L0(pm4 pm4Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        pm4Var.e(i);
        Trace.endSection();
        this.V0.f++;
    }

    @Override // defpackage.um4
    public final ArrayList M(y32 y32Var, b bVar, boolean z) {
        List listZ0 = z0(this.e1, y32Var, bVar, z, this.M1);
        HashMap map = ym4.a;
        ArrayList arrayList = new ArrayList(listZ0);
        int i = 3;
        Collections.sort(arrayList, new ex0(i, new qs3(i, bVar)));
        return arrayList;
    }

    public final void M0(int i, int i2) {
        ec1 ec1Var = this.V0;
        ec1Var.h += i;
        int i3 = i + i2;
        ec1Var.g += i3;
        this.B1 += i3;
        int i4 = this.C1 + i3;
        this.C1 = i4;
        ec1Var.i = Math.max(i4, ec1Var.i);
        int i5 = this.h1;
        if (i5 <= 0 || this.B1 < i5) {
            return;
        }
        E0();
    }

    public final void N0(long j) {
        ec1 ec1Var = this.V0;
        ec1Var.k += j;
        ec1Var.l++;
        this.G1 += j;
        this.H1++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        r15 = r9;
     */
    @Override // defpackage.um4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.on O(defpackage.sm4 r25, androidx.media3.common.b r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn4.O(sm4, androidx.media3.common.b, android.media.MediaCrypto, float):on");
    }

    @Override // defpackage.um4
    public final void P(fc1 fc1Var) {
        if (this.p1) {
            ByteBuffer byteBuffer = fc1Var.h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        pm4 pm4Var = this.M;
                        pm4Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        pm4Var.b(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.um4
    public final boolean U(b bVar) throws ExoPlaybackException {
        v59 v59Var = this.q1;
        if (v59Var == null || v59Var.isInitialized()) {
            return true;
        }
        try {
            return this.q1.v(bVar);
        } catch (VideoSink$VideoSinkException e) {
            throw a(e, bVar, false, 7000);
        }
    }

    @Override // defpackage.um4
    public final void V(Exception exc) {
        wn5.H("MediaCodecVideoRenderer", "Video codec error", exc);
        n00 n00Var = this.g1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new r59(n00Var, exc, 0));
        }
    }

    @Override // defpackage.um4
    public final void W(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        n00 n00Var = this.g1;
        Handler handler = n00Var.b;
        if (handler != null) {
            str2 = str;
            handler.post(new l00(n00Var, str2, j, j2, 1));
        } else {
            str2 = str;
        }
        this.o1 = x0(str2);
        sm4 sm4Var = this.T;
        sm4Var.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(sm4Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = sm4Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.p1 = z;
        F0();
    }

    @Override // defpackage.um4
    public final void X(String str) {
        n00 n00Var = this.g1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new r59(n00Var, str, 1));
        }
    }

    @Override // defpackage.um4
    public final hc1 Y(hh2 hh2Var) {
        hc1 hc1VarY = super.Y(hh2Var);
        b bVar = (b) hh2Var.c;
        bVar.getClass();
        n00 n00Var = this.g1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new ii(n00Var, bVar, hc1VarY, 19));
        }
        return hc1VarY;
    }

    @Override // defpackage.um4
    public final void Z(b bVar, MediaFormat mediaFormat) {
        int integer;
        int i;
        pm4 pm4Var = this.M;
        if (pm4Var != null) {
            pm4Var.l(this.y1);
        }
        if (this.M1) {
            i = bVar.u;
            integer = bVar.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = bVar.A;
        int i2 = bVar.z;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.J1 = new w59(f, i, integer);
        v59 v59Var = this.q1;
        if (v59Var == null || !this.S1) {
            this.j1.g(bVar.y);
        } else {
            rj2 rj2VarA = bVar.a();
            rj2VarA.t = i;
            rj2VarA.u = integer;
            rj2VarA.z = f;
            b bVar2 = new b(rj2VarA);
            int i4 = this.s1;
            List listQ = this.t1;
            if (listQ == null) {
                listQ = ImmutableList.q();
            }
            v59Var.l(bVar2, this.W0.b, i4, listQ);
            this.s1 = 2;
        }
        this.S1 = false;
    }

    @Override // defpackage.v80
    public final void b() {
        v59 v59Var = this.q1;
        if (v59Var == null) {
            i59 i59Var = this.j1;
            if (i59Var.e == 0) {
                i59Var.e = 1;
                return;
            }
            return;
        }
        int i = this.s1;
        if (i == 0 || i == 1) {
            this.s1 = 0;
        } else {
            v59Var.w();
        }
    }

    @Override // defpackage.um4
    public final void b0(long j) {
        super.b0(j);
        if (this.M1) {
            return;
        }
        this.D1--;
    }

    @Override // defpackage.um4
    public final void c0() {
        v59 v59Var = this.q1;
        if (v59Var != null) {
            v59Var.g();
            if (this.Q1 == -9223372036854775807L) {
                this.Q1 = this.W0.b;
            }
            this.q1.f(-this.Q1);
        } else {
            this.j1.f(2);
        }
        this.S1 = true;
        F0();
    }

    @Override // defpackage.um4
    public final void d0(fc1 fc1Var) {
        this.T1 = 0;
        int iK = K(fc1Var);
        if ((Build.VERSION.SDK_INT < 34 || (iK & 32) == 0) && !this.M1) {
            this.D1++;
        }
    }

    @Override // defpackage.v80, defpackage.ke6
    public final void e(int i, Object obj) {
        if (i == 1) {
            I0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            f59 f59Var = (f59) obj;
            this.P1 = f59Var;
            v59 v59Var = this.q1;
            if (v59Var != null) {
                v59Var.s(f59Var);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.N1 != iIntValue) {
                this.N1 = iIntValue;
                if (this.M1) {
                    h0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.y1 = iIntValue2;
            pm4 pm4Var = this.M;
            if (pm4Var != null) {
                pm4Var.l(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.z1 = iIntValue3;
            v59 v59Var2 = this.q1;
            if (v59Var2 != null) {
                v59Var2.h(iIntValue3);
                return;
            }
            m59 m59Var = this.j1.b;
            if (m59Var.j == iIntValue3) {
                return;
            }
            m59Var.j = iIntValue3;
            m59Var.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(h59.a)) {
                v59 v59Var3 = this.q1;
                if (v59Var3 == null || !v59Var3.isInitialized()) {
                    return;
                }
                this.q1.t();
                return;
            }
            this.t1 = list;
            v59 v59Var4 = this.q1;
            if (v59Var4 != null) {
                v59Var4.n(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            cy7 cy7Var = (cy7) obj;
            if (cy7Var.a == 0 || cy7Var.b == 0) {
                return;
            }
            this.w1 = cy7Var;
            v59 v59Var5 = this.q1;
            if (v59Var5 != null) {
                Surface surface = this.u1;
                vy2.t(surface);
                v59Var5.u(surface, cy7Var);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.L1 = ((Integer) obj).intValue();
                pm4 pm4Var2 = this.M;
                if (pm4Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.L1));
                    pm4Var2.b(bundle);
                }
                break;
            case 17:
                Surface surface2 = this.u1;
                I0(null);
                obj.getClass();
                ((cn4) obj).e(1, surface2);
                break;
            case 18:
                boolean z = this.E1 != null;
                gh7 gh7Var = (gh7) obj;
                this.E1 = gh7Var;
                if (z != (gh7Var != null)) {
                    u0(this.N);
                }
                break;
            default:
                if (i == 11) {
                    h62 h62Var = (h62) obj;
                    h62Var.getClass();
                    this.H = h62Var;
                }
                break;
        }
    }

    @Override // defpackage.um4
    public final boolean f0(long j, long j2, pm4 pm4Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, b bVar) {
        int i4;
        pm4Var.getClass();
        long j4 = j3 - this.W0.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.m1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        M0(i5, 0);
        v59 v59Var = this.q1;
        if (v59Var != null) {
            if (!z || z2) {
                return v59Var.k(j3, new zm4(this, pm4Var, i, j4));
            }
            L0(pm4Var, i);
            return true;
        }
        int iA = this.j1.a(j3, j, j2, this.W0.b, z, z2, this.k1);
        fg0 fg0Var = this.k1;
        if (iA == 0) {
            this.g.getClass();
            long jNanoTime = System.nanoTime();
            f59 f59Var = this.P1;
            if (f59Var != null) {
                f59Var.c(j4, jNanoTime, bVar, this.O);
            }
            H0(pm4Var, i, jNanoTime);
            N0(fg0Var.a);
            return true;
        }
        if (iA == 1) {
            long j5 = fg0Var.b;
            long j6 = fg0Var.a;
            if (j5 == this.I1) {
                L0(pm4Var, i);
            } else {
                f59 f59Var2 = this.P1;
                if (f59Var2 != null) {
                    i4 = i;
                    f59Var2.c(j4, j5, bVar, this.O);
                } else {
                    i4 = i;
                }
                H0(pm4Var, i4, j5);
            }
            N0(j6);
            this.I1 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            pm4Var.e(i);
            Trace.endSection();
            M0(0, 1);
            N0(fg0Var.a);
            return true;
        }
        if (iA == 3) {
            L0(pm4Var, i);
            N0(fg0Var.a);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iA));
    }

    @Override // defpackage.um4
    public final void i0() {
        v59 v59Var = this.q1;
        if (v59Var != null) {
            v59Var.g();
        }
    }

    @Override // defpackage.v80
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.um4
    public final void k0() {
        super.k0();
        this.m1.clear();
        this.D1 = 0;
        this.T1 = 0;
        this.F1 = false;
    }

    @Override // defpackage.v80
    public final boolean l() {
        if (!this.R0) {
            return false;
        }
        v59 v59Var = this.q1;
        return v59Var == null || v59Var.c();
    }

    @Override // defpackage.um4, defpackage.v80
    public final boolean m() {
        boolean zM = super.m();
        v59 v59Var = this.q1;
        if (v59Var != null) {
            return v59Var.r(zM);
        }
        if (zM && (this.M == null || this.M1)) {
            return true;
        }
        return this.j1.b(zM);
    }

    @Override // defpackage.um4, defpackage.v80
    public final void n() {
        n00 n00Var = this.g1;
        this.K1 = null;
        this.R1 = -9223372036854775807L;
        F0();
        this.x1 = false;
        this.O1 = null;
        this.F1 = true;
        try {
            super.n();
            ec1 ec1Var = this.V0;
            n00Var.getClass();
            synchronized (ec1Var) {
            }
            Handler handler = n00Var.b;
            if (handler != null) {
                handler.post(new t59(n00Var, ec1Var, 1));
            }
            n00Var.c(w59.d);
        } catch (Throwable th) {
            n00Var.a(this.V0);
            n00Var.c(w59.d);
            throw th;
        }
    }

    @Override // defpackage.v80
    public final void o(boolean z, boolean z2) {
        v59 v59Var;
        this.V0 = new ec1();
        x37 x37Var = this.d;
        x37Var.getClass();
        boolean z3 = x37Var.b;
        vy2.s((z3 && this.N1 == 0) ? false : true);
        if (this.M1 != z3) {
            this.M1 = z3;
            h0();
        }
        ec1 ec1Var = this.V0;
        n00 n00Var = this.g1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new t59(n00Var, ec1Var, 0));
        }
        boolean z4 = this.r1;
        i59 i59Var = this.j1;
        if (!z4) {
            if (this.t1 != null && this.q1 == null) {
                ag1 ag1Var = new ag1(this.e1, i59Var);
                ag1Var.a = true;
                td8 td8Var = this.g;
                td8Var.getClass();
                ag1Var.f = td8Var;
                vy2.s(!ag1Var.b);
                if (((za6) ag1Var.e) == null) {
                    ag1Var.e = new za6();
                }
                bb6 bb6Var = new bb6(ag1Var);
                ag1Var.b = true;
                bb6Var.n = 1;
                SparseArray sparseArray = bb6Var.c;
                if (j29.k(sparseArray, 0)) {
                    v59Var = (v59) sparseArray.get(0);
                } else {
                    xa6 xa6Var = new xa6(bb6Var, bb6Var.a);
                    bb6Var.g.add(xa6Var);
                    sparseArray.put(0, xa6Var);
                    v59Var = xa6Var;
                }
                this.q1 = v59Var;
            }
            this.r1 = true;
        }
        v59 v59Var2 = this.q1;
        if (v59Var2 == null) {
            td8 td8Var2 = this.g;
            td8Var2.getClass();
            i59Var.l = td8Var2;
            i59Var.f(!z2 ? 1 : 0);
            return;
        }
        v59Var2.o(new pj9(this), e.a());
        f59 f59Var = this.P1;
        if (f59Var != null) {
            this.q1.s(f59Var);
        }
        if (this.u1 != null && !this.w1.equals(cy7.c)) {
            this.q1.u(this.u1, this.w1);
        }
        this.q1.h(this.z1);
        this.q1.i(this.K);
        List list = this.t1;
        if (list != null) {
            this.q1.n(list);
        }
        this.s1 = !z2 ? 1 : 0;
        this.Z0 = true;
    }

    @Override // defpackage.um4
    public final boolean o0(fc1 fc1Var) {
        boolean z = false;
        if (!D0(fc1Var)) {
            boolean z2 = fc1Var.g < this.l;
            if (z2 && !fc1Var.d(268435456)) {
                if (fc1Var.d(67108864)) {
                    fc1Var.f();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.V0.d++;
                    } else {
                        this.m1.add(Long.valueOf(fc1Var.g));
                        this.T1++;
                    }
                }
                return z;
            }
        }
        return false;
    }

    @Override // defpackage.um4, defpackage.v80
    public final void p(long j, boolean z) {
        v59 v59Var = this.q1;
        if (v59Var != null && !z) {
            v59Var.m(true);
        }
        super.p(j, z);
        v59 v59Var2 = this.q1;
        i59 i59Var = this.j1;
        if (v59Var2 == null) {
            m59 m59Var = i59Var.b;
            m59Var.m = 0L;
            m59Var.p = -1L;
            m59Var.n = -1L;
            i59Var.h = -9223372036854775807L;
            i59Var.f = -9223372036854775807L;
            i59Var.e = Math.min(i59Var.e, 1);
            i59Var.i = -9223372036854775807L;
        }
        if (z) {
            v59 v59Var3 = this.q1;
            if (v59Var3 != null) {
                v59Var3.q(false);
            } else {
                i59Var.c(false);
            }
        }
        F0();
        this.C1 = 0;
    }

    @Override // defpackage.um4
    public final boolean p0() {
        b bVar = this.N;
        if (this.E1 == null || this.F1 || this.M1) {
            return true;
        }
        return (bVar != null && bVar.p > 0) || this.a1 || this.P0 != -9223372036854775807L;
    }

    @Override // defpackage.v80
    public final void q() {
        v59 v59Var = this.q1;
        if (v59Var == null || !this.f1) {
            return;
        }
        v59Var.a();
    }

    @Override // defpackage.um4
    public final boolean q0(sm4 sm4Var) {
        return C0(sm4Var);
    }

    @Override // defpackage.v80
    public final void r() {
        try {
            try {
                this.E0 = false;
                j0();
                h0();
                pw1 pw1Var = this.G;
                if (pw1Var != null) {
                    pw1Var.c(null);
                }
                this.G = null;
            } catch (Throwable th) {
                pw1 pw1Var2 = this.G;
                if (pw1Var2 != null) {
                    pw1Var2.c(null);
                }
                this.G = null;
                throw th;
            }
        } finally {
            this.r1 = false;
            this.Q1 = -9223372036854775807L;
            PlaceholderSurface placeholderSurface = this.v1;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.v1 = null;
            }
        }
    }

    @Override // defpackage.um4
    public final boolean r0() {
        sm4 sm4Var = this.T;
        if (this.q1 != null && sm4Var != null) {
            String str = sm4Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.r0();
    }

    @Override // defpackage.v80
    public final void s() {
        this.B1 = 0;
        this.g.getClass();
        this.A1 = SystemClock.elapsedRealtime();
        this.G1 = 0L;
        this.H1 = 0;
        v59 v59Var = this.q1;
        if (v59Var != null) {
            v59Var.e();
        } else {
            this.j1.d();
        }
    }

    @Override // defpackage.v80
    public final void t() {
        E0();
        int i = this.H1;
        if (i != 0) {
            long j = this.G1;
            n00 n00Var = this.g1;
            Handler handler = n00Var.b;
            if (handler != null) {
                handler.post(new s59(n00Var, j, i, 1));
            }
            this.G1 = 0L;
            this.H1 = 0;
        }
        v59 v59Var = this.q1;
        if (v59Var != null) {
            v59Var.d();
        } else {
            this.j1.e();
        }
    }

    @Override // defpackage.um4
    public final int t0(y32 y32Var, b bVar) {
        boolean z;
        int i = 0;
        if (!tv4.l(bVar.n)) {
            return bl4.k(0, 0, 0, 0);
        }
        boolean z2 = bVar.r != null;
        Context context = this.e1;
        List listZ0 = z0(context, y32Var, bVar, z2, false);
        if (z2 && listZ0.isEmpty()) {
            listZ0 = z0(context, y32Var, bVar, false, false);
        }
        if (listZ0.isEmpty()) {
            return bl4.k(1, 0, 0, 0);
        }
        int i2 = bVar.O;
        if (i2 != 0 && i2 != 2) {
            return bl4.k(2, 0, 0, 0);
        }
        sm4 sm4Var = (sm4) listZ0.get(0);
        boolean zE = sm4Var.e(bVar);
        if (zE) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listZ0.size(); i3++) {
                sm4 sm4Var2 = (sm4) listZ0.get(i3);
                if (sm4Var2.e(bVar)) {
                    z = false;
                    zE = true;
                    sm4Var = sm4Var2;
                    break;
                }
            }
            z = true;
        }
        int i4 = 3;
        int i5 = zE ? 4 : 3;
        int i6 = sm4Var.f(bVar) ? 16 : 8;
        int i7 = sm4Var.g ? 64 : 0;
        int i8 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(bVar.n) && !fz.g(context)) {
            i8 = 256;
        }
        if (zE) {
            List listZ02 = z0(context, y32Var, bVar, z2, true);
            if (!listZ02.isEmpty()) {
                HashMap map = ym4.a;
                ArrayList arrayList = new ArrayList(listZ02);
                Collections.sort(arrayList, new ex0(i4, new qs3(i4, bVar)));
                sm4 sm4Var3 = (sm4) arrayList.get(0);
                if (sm4Var3.e(bVar) && sm4Var3.f(bVar)) {
                    i = 32;
                }
            }
        }
        return i5 | i6 | i | i7 | i8;
    }

    @Override // defpackage.um4, defpackage.v80
    public final void u(b[] bVarArr, long j, long j2, ks4 ks4Var) {
        super.u(bVarArr, j, j2, ks4Var);
        bm8 bm8Var = this.p;
        if (bm8Var.p()) {
            this.R1 = -9223372036854775807L;
        } else {
            ks4Var.getClass();
            this.R1 = bm8Var.g(ks4Var.a, new yl8()).d;
        }
    }

    @Override // defpackage.um4, defpackage.v80
    public final void w(long j, long j2) throws ExoPlaybackException {
        v59 v59Var = this.q1;
        if (v59Var != null) {
            try {
                v59Var.p(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw a(e, e.a, false, 7001);
            }
        }
        super.w(j, j2);
    }

    @Override // defpackage.um4, defpackage.v80
    public final void y(float f, float f2) {
        super.y(f, f2);
        v59 v59Var = this.q1;
        if (v59Var != null) {
            v59Var.i(f);
        } else {
            this.j1.i(f);
        }
    }
}
