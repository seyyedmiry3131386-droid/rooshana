package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class qm4 extends um4 implements nm4 {
    public final Context e1;
    public final n00 f1;
    public final rd1 g1;
    public final gg4 h1;
    public int i1;
    public boolean j1;
    public boolean k1;
    public b l1;
    public b m1;
    public long n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public int r1;
    public boolean s1;
    public long t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm4(Context context, om4 om4Var, boolean z, Handler handler, b62 b62Var, rd1 rd1Var) {
        super(1, om4Var, z, 44100.0f);
        gg4 gg4Var = Build.VERSION.SDK_INT >= 35 ? new gg4() : null;
        this.e1 = context.getApplicationContext();
        this.g1 = rd1Var;
        this.h1 = gg4Var;
        this.r1 = -1000;
        this.f1 = new n00(handler, b62Var, 0);
        this.t1 = -9223372036854775807L;
        rd1Var.s = new qm5(27, this);
    }

    @Override // defpackage.um4
    public final hc1 C(sm4 sm4Var, b bVar, b bVar2) {
        hc1 hc1VarB = sm4Var.b(bVar, bVar2);
        int i = hc1VarB.e;
        if (this.G == null && s0(bVar2)) {
            i |= 32768;
        }
        if (y0(sm4Var, bVar2) > this.i1) {
            i |= 64;
        }
        int i2 = i;
        return new hc1(sm4Var.a, bVar, bVar2, i2 != 0 ? 0 : hc1VarB.d, i2);
    }

    @Override // defpackage.um4
    public final float L(float f, b bVar, b[] bVarArr) {
        int iMax = -1;
        for (b bVar2 : bVarArr) {
            int i = bVar2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.um4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList M(defpackage.y32 r4, androidx.media3.common.b r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.n
            if (r0 != 0) goto L9
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.q()
            goto L31
        L9:
            rd1 r0 = r3.g1
            int r0 = r0.i(r5)
            r1 = 0
            if (r0 == 0) goto L2d
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = defpackage.ym4.d(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L20
            r0 = 0
            goto L26
        L20:
            java.lang.Object r0 = r0.get(r1)
            sm4 r0 = (defpackage.sm4) r0
        L26:
            if (r0 == 0) goto L2d
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.s(r0)
            goto L31
        L2d:
            java.util.List r4 = defpackage.ym4.f(r4, r5, r6, r1)
        L31:
            java.util.HashMap r6 = defpackage.ym4.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            qs3 r4 = new qs3
            r0 = 3
            r4.<init>(r0, r5)
            ex0 r5 = new ex0
            r5.<init>(r0, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.M(y32, androidx.media3.common.b, boolean):java.util.ArrayList");
    }

    @Override // defpackage.um4
    public final long N(long j, long j2) {
        long jD0;
        boolean z = this.t1 != -9223372036854775807L;
        if (this.s1) {
            rd1 rd1Var = this.g1;
            if (rd1Var.o()) {
                AudioTrack audioTrack = rd1Var.w;
                kd1 kd1Var = rd1Var.u;
                if (kd1Var.c == 0) {
                    jD0 = j29.b0(kd1Var.e, audioTrack.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int iE = hs9.E(kd1Var.g);
                    vy2.s(iE != -2147483647);
                    jD0 = j29.d0(bufferSizeInFrames, 1000000L, iE, RoundingMode.DOWN);
                }
            } else {
                jD0 = -9223372036854775807L;
            }
            if (z && jD0 != -9223372036854775807L) {
                float fMin = Math.min(jD0, this.t1 - j);
                ua6 ua6Var = rd1Var.D;
                float f = ua6Var != null ? ua6Var.a : 1.0f;
                this.g.getClass();
                return Math.max(10000L, ((long) ((fMin / f) / 2.0f)) - (j29.V(SystemClock.elapsedRealtime()) - j2));
            }
        } else if (z || this.R0) {
            return 1000000L;
        }
        return 10000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    @Override // defpackage.um4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.on O(defpackage.sm4 r13, androidx.media3.common.b r14, android.media.MediaCrypto r15, float r16) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.O(sm4, androidx.media3.common.b, android.media.MediaCrypto, float):on");
    }

    @Override // defpackage.um4
    public final void P(fc1 fc1Var) {
        b bVar;
        if (Build.VERSION.SDK_INT < 29 || (bVar = fc1Var.c) == null || !Objects.equals(bVar.n, "audio/opus") || !this.E0) {
            return;
        }
        ByteBuffer byteBuffer = fc1Var.h;
        byteBuffer.getClass();
        b bVar2 = fc1Var.c;
        bVar2.getClass();
        int i = bVar2.I;
        if (byteBuffer.remaining() == 8) {
            this.g1.w(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // defpackage.um4
    public final void V(Exception exc) {
        wn5.H("MediaCodecAudioRenderer", "Audio codec error", exc);
        n00 n00Var = this.f1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new h00(n00Var, exc, 0));
        }
    }

    @Override // defpackage.um4
    public final void W(long j, long j2, String str) {
        n00 n00Var = this.f1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new l00(n00Var, str, j, j2, 0));
        }
    }

    @Override // defpackage.um4
    public final void X(String str) {
        n00 n00Var = this.f1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new g7(n00Var, str, 4));
        }
    }

    @Override // defpackage.um4
    public final hc1 Y(hh2 hh2Var) {
        b bVar = (b) hh2Var.c;
        bVar.getClass();
        this.l1 = bVar;
        hc1 hc1VarY = super.Y(hh2Var);
        n00 n00Var = this.f1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new ii(n00Var, bVar, hc1VarY, 2));
        }
        return hc1VarY;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0104 A[Catch: AudioSink$ConfigurationException -> 0x0102, TryCatch #0 {AudioSink$ConfigurationException -> 0x0102, blocks: (B:44:0x00d9, B:47:0x00e1, B:49:0x00e5, B:51:0x00ee, B:55:0x00fc, B:58:0x0104, B:62:0x010b, B:63:0x0110), top: B:67:0x00d9 }] */
    @Override // defpackage.um4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(androidx.media3.common.b r9, android.media.MediaFormat r10) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.Z(androidx.media3.common.b, android.media.MediaFormat):void");
    }

    @Override // defpackage.um4
    public final void a0() {
        this.g1.getClass();
    }

    @Override // defpackage.um4
    public final void c0() {
        this.g1.M = true;
    }

    @Override // defpackage.nm4
    public final void d(ua6 ua6Var) {
        rd1 rd1Var = this.g1;
        rd1Var.getClass();
        rd1Var.D = new ua6(j29.h(ua6Var.a, 0.1f, 8.0f), j29.h(ua6Var.b, 0.1f, 8.0f));
        kd1 kd1Var = rd1Var.u;
        if (kd1Var != null && kd1Var.j) {
            rd1Var.v();
            return;
        }
        ld1 ld1Var = new ld1(ua6Var, -9223372036854775807L, -9223372036854775807L);
        if (rd1Var.o()) {
            rd1Var.B = ld1Var;
        } else {
            rd1Var.C = ld1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    @Override // defpackage.v80, defpackage.ke6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.e(int, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    @Override // defpackage.um4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f0(long r1, long r3, defpackage.pm4 r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, androidx.media3.common.b r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r0 = this;
            r6.getClass()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.t1 = r1
            androidx.media3.common.b r1 = r0.m1
            r2 = 1
            if (r1 == 0) goto L1a
            r1 = r8 & 2
            if (r1 == 0) goto L1a
            r5.getClass()
            r5.e(r7)
            return r2
        L1a:
            rd1 r1 = r0.g1
            if (r12 == 0) goto L2d
            if (r5 == 0) goto L23
            r5.e(r7)
        L23:
            ec1 r3 = r0.V0
            int r4 = r3.f
            int r4 = r4 + r9
            r3.f = r4
            r1.M = r2
            return r2
        L2d:
            boolean r1 = r1.l(r6, r10, r9)     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L44 androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L5e
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.e(r7)
        L38:
            ec1 r1 = r0.V0
            int r3 = r1.e
            int r3 = r3 + r9
            r1.e = r3
            return r2
        L40:
            r0.t1 = r10
            r1 = 0
            return r1
        L44:
            r1 = move-exception
            boolean r2 = r0.E0
            if (r2 == 0) goto L55
            x37 r2 = r0.d
            r2.getClass()
            int r2 = r2.a
            if (r2 == 0) goto L55
            r2 = 5003(0x138b, float:7.01E-42)
            goto L57
        L55:
            r2 = 5002(0x138a, float:7.009E-42)
        L57:
            boolean r3 = r1.b
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.a(r1, r14, r3, r2)
            throw r1
        L5e:
            r1 = move-exception
            androidx.media3.common.b r2 = r0.l1
            boolean r3 = r0.E0
            if (r3 == 0) goto L71
            x37 r3 = r0.d
            r3.getClass()
            int r3 = r3.a
            if (r3 == 0) goto L71
            r3 = 5004(0x138c, float:7.012E-42)
            goto L73
        L71:
            r3 = 5001(0x1389, float:7.008E-42)
        L73:
            boolean r4 = r1.b
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.a(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.f0(long, long, pm4, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, androidx.media3.common.b):boolean");
    }

    @Override // defpackage.nm4
    public final ua6 g() {
        return this.g1.D;
    }

    @Override // defpackage.nm4
    public final long h() {
        if (this.h == 2) {
            z0();
        }
        return this.n1;
    }

    @Override // defpackage.nm4
    public final boolean i() {
        boolean z = this.q1;
        this.q1 = false;
        return z;
    }

    @Override // defpackage.um4
    public final void i0() throws ExoPlaybackException {
        try {
            rd1 rd1Var = this.g1;
            if (!rd1Var.T && rd1Var.o() && rd1Var.f()) {
                rd1Var.s();
                rd1Var.T = true;
            }
            long j = this.P0;
            if (j != -9223372036854775807L) {
                this.t1 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw a(e, e.c, e.b, this.E0 ? 5003 : 5002);
        }
    }

    @Override // defpackage.v80
    public final String j() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.v80
    public final boolean l() {
        if (!this.R0) {
            return false;
        }
        rd1 rd1Var = this.g1;
        if (rd1Var.o()) {
            return rd1Var.T && !rd1Var.m();
        }
        return true;
    }

    @Override // defpackage.um4, defpackage.v80
    public final boolean m() {
        return this.g1.m() || super.m();
    }

    @Override // defpackage.um4, defpackage.v80
    public final void n() {
        n00 n00Var = this.f1;
        this.p1 = true;
        this.l1 = null;
        this.t1 = -9223372036854775807L;
        try {
            this.g1.g();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.n();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.v80
    public final void o(boolean z, boolean z2) {
        ec1 ec1Var = new ec1();
        this.V0 = ec1Var;
        n00 n00Var = this.f1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new i00(n00Var, ec1Var, 1));
        }
        x37 x37Var = this.d;
        x37Var.getClass();
        boolean z3 = x37Var.b;
        rd1 rd1Var = this.g1;
        if (z3) {
            vy2.s(rd1Var.X);
            if (!rd1Var.c0) {
                rd1Var.c0 = true;
                rd1Var.g();
            }
        } else if (rd1Var.c0) {
            rd1Var.c0 = false;
            rd1Var.g();
        }
        ee6 ee6Var = this.f;
        ee6Var.getClass();
        rd1Var.r = ee6Var;
        td8 td8Var = this.g;
        td8Var.getClass();
        rd1Var.h.G = td8Var;
    }

    @Override // defpackage.um4, defpackage.v80
    public final void p(long j, boolean z) {
        super.p(j, z);
        this.g1.g();
        this.n1 = j;
        this.t1 = -9223372036854775807L;
        this.q1 = false;
        this.o1 = true;
    }

    @Override // defpackage.v80
    public final void q() {
        gg4 gg4Var;
        zy zyVar = this.g1.y;
        if (zyVar != null) {
            Context context = zyVar.a;
            if (zyVar.j) {
                zyVar.g = null;
                xy xyVar = zyVar.d;
                if (xyVar != null) {
                    fz.i(context).unregisterAudioDeviceCallback(xyVar);
                }
                context.unregisterReceiver(zyVar.e);
                yy yyVar = zyVar.f;
                if (yyVar != null) {
                    yyVar.a.unregisterContentObserver(yyVar);
                }
                zyVar.j = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (gg4Var = this.h1) == null) {
            return;
        }
        gg4Var.b();
    }

    @Override // defpackage.v80
    public final void r() {
        rd1 rd1Var = this.g1;
        this.q1 = false;
        this.t1 = -9223372036854775807L;
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
            if (this.p1) {
                this.p1 = false;
                rd1Var.u();
            }
        }
    }

    @Override // defpackage.v80
    public final void s() {
        this.g1.r();
        this.s1 = true;
    }

    @Override // defpackage.um4
    public final boolean s0(b bVar) {
        x37 x37Var = this.d;
        x37Var.getClass();
        if (x37Var.a != 0) {
            int iX0 = x0(bVar);
            if ((iX0 & 512) != 0) {
                x37 x37Var2 = this.d;
                x37Var2.getClass();
                if (x37Var2.a == 2 || (iX0 & 1024) != 0 || (bVar.I == 0 && bVar.J == 0)) {
                    return true;
                }
            }
        }
        return this.g1.i(bVar) != 0;
    }

    @Override // defpackage.v80
    public final void t() {
        z0();
        this.s1 = false;
        rd1 rd1Var = this.g1;
        rd1Var.W = false;
        if (rd1Var.o()) {
            t00 t00Var = rd1Var.h;
            t00Var.f();
            if (t00Var.x == -9223372036854775807L) {
                r00 r00Var = t00Var.e;
                r00Var.getClass();
                r00Var.a(0);
            }
            t00Var.z = t00Var.b();
            if (!rd1Var.U || rd1.p(rd1Var.w)) {
                rd1Var.w.pause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    @Override // defpackage.um4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t0(defpackage.y32 r19, androidx.media3.common.b r20) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm4.t0(y32, androidx.media3.common.b):int");
    }

    public final int x0(b bVar) {
        hz hzVarH = this.g1.h(bVar);
        if (!hzVarH.a) {
            return 0;
        }
        int i = hzVarH.b ? 1536 : 512;
        return hzVarH.c ? i | 2048 : i;
    }

    public final int y0(sm4 sm4Var, b bVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(sm4Var.a) || (i = Build.VERSION.SDK_INT) >= 24 || (i == 23 && j29.T(this.e1))) {
            return bVar.o;
        }
        return -1;
    }

    public final void z0() {
        long j;
        long jMax;
        long j2;
        l();
        rd1 rd1Var = this.g1;
        wv8 wv8Var = rd1Var.b;
        if (!rd1Var.o() || rd1Var.N) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(rd1Var.h.a(), j29.b0(rd1Var.u.e, rd1Var.k()));
            ArrayDeque arrayDeque = rd1Var.i;
            while (!arrayDeque.isEmpty() && jMin >= ((ld1) arrayDeque.getFirst()).c) {
                rd1Var.C = (ld1) arrayDeque.remove();
            }
            ld1 ld1Var = rd1Var.C;
            long jD0 = jMin - ld1Var.c;
            long jC = j29.C(ld1Var.a.a, jD0);
            if (arrayDeque.isEmpty()) {
                o18 o18Var = (o18) wv8Var.d;
                if (o18Var.b()) {
                    if (o18Var.o >= 1024) {
                        long j3 = o18Var.n;
                        n18 n18Var = o18Var.j;
                        n18Var.getClass();
                        long j4 = j3 - ((long) ((n18Var.k * n18Var.b) * 2));
                        int i = o18Var.h.a;
                        int i2 = o18Var.g.a;
                        if (i == i2) {
                            jD0 = j29.d0(jD0, j4, o18Var.o, RoundingMode.DOWN);
                            j = Long.MIN_VALUE;
                        } else {
                            j = Long.MIN_VALUE;
                            jD0 = j29.d0(jD0, j4 * ((long) i), o18Var.o * ((long) i2), RoundingMode.DOWN);
                        }
                    } else {
                        j = Long.MIN_VALUE;
                        jD0 = (long) (((double) o18Var.c) * jD0);
                    }
                    ld1 ld1Var2 = rd1Var.C;
                    j2 = ld1Var2.b + jD0;
                    ld1Var2.d = jD0 - jC;
                } else {
                    j = Long.MIN_VALUE;
                    ld1 ld1Var22 = rd1Var.C;
                    j2 = ld1Var22.b + jD0;
                    ld1Var22.d = jD0 - jC;
                }
            } else {
                j = Long.MIN_VALUE;
                ld1 ld1Var3 = rd1Var.C;
                j2 = ld1Var3.b + jC + ld1Var3.d;
            }
            long j5 = ((dw7) wv8Var.c).q;
            jMax = j29.b0(rd1Var.u.e, j5) + j2;
            long j6 = rd1Var.i0;
            if (j5 > j6) {
                long jB0 = j29.b0(rd1Var.u.e, j5 - j6);
                rd1Var.i0 = j5;
                rd1Var.j0 += jB0;
                if (rd1Var.k0 == null) {
                    rd1Var.k0 = new Handler(Looper.myLooper());
                }
                rd1Var.k0.removeCallbacksAndMessages(null);
                rd1Var.k0.postDelayed(new b7(13, rd1Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.o1) {
                jMax = Math.max(this.n1, jMax);
            }
            this.n1 = jMax;
            this.o1 = false;
        }
    }

    @Override // defpackage.v80
    public final nm4 f() {
        return this;
    }
}
