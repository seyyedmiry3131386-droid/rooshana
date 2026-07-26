package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class um4 extends v80 {
    public static final byte[] d1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final MediaCodec.BufferInfo A;
    public int A0;
    public final ArrayDeque B;
    public ByteBuffer B0;
    public final xr5 C;
    public boolean C0;
    public b D;
    public boolean D0;
    public b E;
    public boolean E0;
    public pw1 F;
    public boolean F0;
    public pw1 G;
    public boolean G0;
    public h62 H;
    public boolean H0;
    public MediaCrypto I;
    public int I0;
    public final long J;
    public int J0;
    public float K;
    public int K0;
    public float L;
    public boolean L0;
    public pm4 M;
    public boolean M0;
    public b N;
    public boolean N0;
    public MediaFormat O;
    public long O0;
    public boolean P;
    public long P0;
    public float Q;
    public boolean Q0;
    public ArrayDeque R;
    public boolean R0;
    public MediaCodecRenderer$DecoderInitializationException S;
    public boolean S0;
    public sm4 T;
    public boolean T0;
    public int U;
    public ExoPlaybackException U0;
    public boolean V;
    public ec1 V0;
    public boolean W;
    public tm4 W0;
    public boolean X;
    public long X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public boolean a1;
    public long b1;
    public long c1;
    public final om4 s;
    public final y32 t;
    public final boolean u;
    public final float v;
    public final fc1 w;
    public final fc1 x;
    public long x0;
    public final fc1 y;
    public long y0;
    public final sa0 z;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um4(int i, om4 om4Var, boolean z, float f) {
        super(i);
        y32 y32Var = y32.c;
        this.s = om4Var;
        this.t = y32Var;
        this.u = z;
        this.v = f;
        this.w = new fc1(0);
        this.x = new fc1(0);
        this.y = new fc1(2);
        sa0 sa0Var = new sa0(2);
        sa0Var.l = 32;
        this.z = sa0Var;
        this.A = new MediaCodec.BufferInfo();
        this.K = 1.0f;
        this.L = 1.0f;
        this.J = -9223372036854775807L;
        this.B = new ArrayDeque();
        this.W0 = tm4.e;
        sa0Var.i(0);
        sa0Var.e.order(ByteOrder.nativeOrder());
        xr5 xr5Var = new xr5();
        xr5Var.c = g00.a;
        xr5Var.b = 0;
        xr5Var.a = 2;
        this.C = xr5Var;
        this.Q = -1.0f;
        this.U = 0;
        this.I0 = 0;
        this.z0 = -1;
        this.A0 = -1;
        this.y0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.x0 = -9223372036854775807L;
        this.J0 = 0;
        this.K0 = 0;
        this.V0 = new ec1();
        this.b1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
    }

    @Override // defpackage.v80
    public final int A() {
        return 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.B(long, long):boolean");
    }

    public abstract hc1 C(sm4 sm4Var, b bVar, b bVar2);

    public MediaCodecDecoderException D(IllegalStateException illegalStateException, sm4 sm4Var) {
        return new MediaCodecDecoderException(illegalStateException, sm4Var);
    }

    public final boolean E() throws ExoPlaybackException {
        if (!this.L0) {
            v0();
            return true;
        }
        this.J0 = 1;
        if (this.W) {
            this.K0 = 3;
            return false;
        }
        this.K0 = 2;
        return true;
    }

    public final boolean F(long j, long j2) throws ExoPlaybackException {
        pm4 pm4Var = this.M;
        pm4Var.getClass();
        int i = this.A0;
        MediaCodec.BufferInfo bufferInfo = this.A;
        if (i < 0) {
            int iK = pm4Var.k(bufferInfo);
            if (iK < 0) {
                if (iK == -2) {
                    this.N0 = true;
                    pm4 pm4Var2 = this.M;
                    pm4Var2.getClass();
                    MediaFormat mediaFormatF = pm4Var2.f();
                    if (this.U != 0 && mediaFormatF.getInteger("width") == 32 && mediaFormatF.getInteger("height") == 32) {
                        this.Y = true;
                        return true;
                    }
                    this.O = mediaFormatF;
                    this.P = true;
                    return true;
                }
                if (this.Z && (this.Q0 || this.J0 == 2)) {
                    e0();
                }
                long j3 = this.x0;
                if (j3 != -9223372036854775807L) {
                    long j4 = j3 + 100;
                    this.g.getClass();
                    if (j4 < System.currentTimeMillis()) {
                        e0();
                        return false;
                    }
                }
                return false;
            }
            if (this.Y) {
                this.Y = false;
                pm4Var.e(iK);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                e0();
                return false;
            }
            this.A0 = iK;
            ByteBuffer byteBufferP = pm4Var.p(iK);
            this.B0 = byteBufferP;
            if (byteBufferP != null) {
                byteBufferP.position(bufferInfo.offset);
                this.B0.limit(bufferInfo.offset + bufferInfo.size);
            }
            w0(bufferInfo.presentationTimeUs);
        }
        long j5 = bufferInfo.presentationTimeUs;
        this.C0 = j5 < this.l;
        long j6 = this.P0;
        this.D0 = j6 != -9223372036854775807L && j6 <= j5;
        if (this.a1) {
            long j7 = this.b1;
            if (j7 == -9223372036854775807L || j5 > j7) {
                this.b1 = j5;
                this.C0 = true;
                this.D0 = false;
            } else {
                this.a1 = false;
                this.b1 = -9223372036854775807L;
            }
        }
        ByteBuffer byteBuffer = this.B0;
        int i2 = this.A0;
        int i3 = bufferInfo.flags;
        boolean z = this.C0;
        boolean z2 = this.D0;
        b bVar = this.E;
        bVar.getClass();
        if (!f0(j, j2, pm4Var, byteBuffer, i2, i3, 1, j5, z, z2, bVar)) {
            return false;
        }
        b0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.M0 && this.D0) {
            this.g.getClass();
            this.x0 = System.currentTimeMillis();
        }
        this.A0 = -1;
        this.B0 = null;
        if (!z3) {
            return true;
        }
        e0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.G():boolean");
    }

    public final void H() {
        try {
            pm4 pm4Var = this.M;
            vy2.t(pm4Var);
            pm4Var.flush();
        } finally {
            k0();
        }
    }

    public final boolean I() {
        if (this.M != null) {
            if (r0()) {
                h0();
                return true;
            }
            if (p0()) {
                H();
                return false;
            }
            long j = this.c1;
            if (j != -9223372036854775807L && this.l <= j && this.X0 < j) {
                this.a1 = true;
                this.c1 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List J(boolean z) {
        b bVar = this.D;
        bVar.getClass();
        y32 y32Var = this.t;
        ArrayList arrayListM = M(y32Var, bVar, z);
        if (!arrayListM.isEmpty() || !z) {
            return arrayListM;
        }
        ArrayList arrayListM2 = M(y32Var, bVar, false);
        if (!arrayListM2.isEmpty()) {
            wn5.k0("MediaCodecRenderer", "Drm session requires secure decoder for " + bVar.n + ", but no secure decoder available. Trying to proceed with " + arrayListM2 + ".");
        }
        return arrayListM2;
    }

    public int K(fc1 fc1Var) {
        return 0;
    }

    public abstract float L(float f, b bVar, b[] bVarArr);

    public abstract ArrayList M(y32 y32Var, b bVar, boolean z);

    public long N(long j, long j2) {
        return super.c(j, j2);
    }

    public abstract on O(sm4 sm4Var, b bVar, MediaCrypto mediaCrypto, float f);

    public abstract void P(fc1 fc1Var);

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(defpackage.sm4 r12, android.media.MediaCrypto r13) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.Q(sm4, android.media.MediaCrypto):void");
    }

    public final boolean R(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        b bVar = this.E;
        return bVar == null || !Objects.equals(bVar.n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.S():void");
    }

    public final void T(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        b bVar = this.D;
        bVar.getClass();
        if (this.R == null) {
            try {
                List listJ = J(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.R = arrayDeque;
                if (this.u) {
                    arrayDeque.addAll(listJ);
                } else {
                    ArrayList arrayList = (ArrayList) listJ;
                    if (!arrayList.isEmpty()) {
                        this.R.add((sm4) arrayList.get(0));
                    }
                }
                this.S = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(bVar, e, z, -49998);
            }
        }
        if (this.R.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(bVar, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.R;
        arrayDeque2.getClass();
        while (this.M == null) {
            sm4 sm4Var = (sm4) arrayDeque2.peekFirst();
            sm4Var.getClass();
            if (!U(bVar) || !q0(sm4Var)) {
                return;
            }
            try {
                Q(sm4Var, mediaCrypto);
            } catch (Exception e2) {
                wn5.l0("MediaCodecRenderer", "Failed to initialize decoder: " + sm4Var, e2);
                arrayDeque2.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + sm4Var.a + ", " + bVar, e2, bVar.n, z, sm4Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                V(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.S;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.S = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.S = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.S;
                }
            }
        }
        this.R = null;
    }

    public boolean U(b bVar) {
        return true;
    }

    public abstract void V(Exception exc);

    public abstract void W(long j, long j2, String str);

    public abstract void X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r4.e(r2) != false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.hc1 Y(defpackage.hh2 r13) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.Y(hh2):hc1");
    }

    public abstract void Z(b bVar, MediaFormat mediaFormat);

    public void b0(long j) {
        this.X0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.B;
            if (arrayDeque.isEmpty() || j < ((tm4) arrayDeque.peek()).a) {
                return;
            }
            tm4 tm4Var = (tm4) arrayDeque.poll();
            tm4Var.getClass();
            n0(tm4Var);
            c0();
        }
    }

    @Override // defpackage.v80
    public final long c(long j, long j2) {
        return N(j, j2);
    }

    public abstract void c0();

    public final void e0() throws ExoPlaybackException {
        int i = this.K0;
        if (i == 1) {
            H();
            return;
        }
        if (i == 2) {
            H();
            v0();
        } else if (i != 3) {
            this.R0 = true;
            i0();
        } else {
            h0();
            S();
        }
    }

    public abstract boolean f0(long j, long j2, pm4 pm4Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, b bVar);

    public final boolean g0(int i) throws ExoPlaybackException {
        hh2 hh2Var = this.c;
        hh2Var.g();
        fc1 fc1Var = this.w;
        fc1Var.f();
        int iV = v(hh2Var, fc1Var, i | 4);
        if (iV == -5) {
            Y(hh2Var);
            return true;
        }
        if (iV != -4 || !fc1Var.d(4)) {
            return false;
        }
        this.Q0 = true;
        e0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        try {
            pm4 pm4Var = this.M;
            if (pm4Var != null) {
                pm4Var.a();
                this.V0.b++;
                sm4 sm4Var = this.T;
                sm4Var.getClass();
                X(sm4Var.a);
            }
            this.M = null;
            try {
                MediaCrypto mediaCrypto = this.I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.M = null;
            try {
                MediaCrypto mediaCrypto2 = this.I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void i0();

    public final void j0() {
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.G0 = false;
        this.z.f();
        this.y.f();
        this.F0 = false;
        xr5 xr5Var = this.C;
        xr5Var.getClass();
        xr5Var.c = g00.a;
        xr5Var.b = 0;
        xr5Var.a = 2;
    }

    public void k0() {
        this.z0 = -1;
        this.x.e = null;
        this.A0 = -1;
        this.B0 = null;
        this.O0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.y0 = -9223372036854775807L;
        this.M0 = false;
        this.x0 = -9223372036854775807L;
        this.L0 = false;
        this.X = false;
        this.Y = false;
        this.C0 = false;
        this.D0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.I0 = this.H0 ? 1 : 0;
        this.a1 = false;
        this.b1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
    }

    public final void l0() {
        k0();
        this.U0 = null;
        this.R = null;
        this.T = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.N0 = false;
        this.Q = -1.0f;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.Z = false;
        this.H0 = false;
        this.I0 = 0;
    }

    @Override // defpackage.v80
    public boolean m() {
        boolean zB;
        if (this.D != null) {
            if (k()) {
                zB = this.n;
            } else {
                pc7 pc7Var = this.i;
                pc7Var.getClass();
                zB = pc7Var.b();
            }
            if (!zB) {
                if (!(this.A0 >= 0)) {
                    if (this.y0 != -9223372036854775807L) {
                        this.g.getClass();
                        if (SystemClock.elapsedRealtime() < this.y0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void m0(pw1 pw1Var) {
        pw1 pw1Var2 = this.F;
        if (pw1Var2 != pw1Var) {
            if (pw1Var != null) {
                pw1Var.d(null);
            }
            if (pw1Var2 != null) {
                pw1Var2.c(null);
            }
        }
        this.F = pw1Var;
    }

    @Override // defpackage.v80
    public void n() {
        this.D = null;
        n0(tm4.e);
        this.B.clear();
        if (!this.E0) {
            I();
        } else {
            this.E0 = false;
            j0();
        }
    }

    public final void n0(tm4 tm4Var) {
        this.W0 = tm4Var;
        if (tm4Var.c != -9223372036854775807L) {
            this.Y0 = true;
            a0();
        }
    }

    public boolean o0(fc1 fc1Var) {
        return false;
    }

    @Override // defpackage.v80
    public void p(long j, boolean z) {
        this.Q0 = false;
        this.R0 = false;
        this.T0 = false;
        if (this.E0) {
            j0();
        } else if (I()) {
            S();
        }
        if (this.W0.d.y() > 0) {
            this.S0 = true;
        }
        this.W0.d.e();
        this.B.clear();
    }

    public boolean p0() {
        return true;
    }

    public boolean q0(sm4 sm4Var) {
        return true;
    }

    public boolean r0() {
        int i = this.K0;
        if (i == 3 || ((this.V && !this.N0) || (this.W && this.M0))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            v0();
            return false;
        } catch (ExoPlaybackException e) {
            wn5.l0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean s0(b bVar) {
        return false;
    }

    public abstract int t0(y32 y32Var, b bVar);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.v80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(androidx.media3.common.b[] r12, long r13, long r15, defpackage.ks4 r17) {
        /*
            r11 = this;
            tm4 r12 = r11.W0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            tm4 r4 = new tm4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.n0(r4)
            boolean r12 = r11.Z0
            if (r12 == 0) goto L56
            r11.c0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.B
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.O0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.X0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            tm4 r4 = new tm4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.n0(r4)
            tm4 r12 = r11.W0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.c0()
        L56:
            return
        L57:
            tm4 r0 = new tm4
            long r1 = r11.O0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.u(androidx.media3.common.b[], long, long, ks4):void");
    }

    public final boolean u0(b bVar) {
        if (this.M != null && this.K0 != 3 && this.h != 0) {
            float f = this.L;
            bVar.getClass();
            b[] bVarArr = this.j;
            bVarArr.getClass();
            float fL = L(f, bVar, bVarArr);
            float f2 = this.Q;
            if (f2 != fL) {
                if (fL == -1.0f) {
                    if (this.L0) {
                        this.J0 = 1;
                        this.K0 = 3;
                        return false;
                    }
                    h0();
                    S();
                    return false;
                }
                if (f2 != -1.0f || fL > this.v) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fL);
                    pm4 pm4Var = this.M;
                    pm4Var.getClass();
                    pm4Var.b(bundle);
                    this.Q = fL;
                }
            }
        }
        return true;
    }

    public final void v0() throws ExoPlaybackException {
        pw1 pw1Var = this.G;
        pw1Var.getClass();
        b81 b81VarG = pw1Var.g();
        if (b81VarG instanceof ko2) {
            try {
                MediaCrypto mediaCrypto = this.I;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((ko2) b81VarG).b);
            } catch (MediaCryptoException e) {
                throw a(e, this.D, false, 6006);
            }
        }
        m0(this.G);
        this.J0 = 0;
        this.K0 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // defpackage.v80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r12, long r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um4.w(long, long):void");
    }

    public final void w0(long j) {
        b bVar = (b) this.W0.d.t(j);
        if (bVar == null && this.Y0 && this.O != null) {
            bVar = (b) this.W0.d.s();
        }
        if (bVar != null) {
            this.E = bVar;
        } else if (!this.P || this.E == null) {
            return;
        }
        b bVar2 = this.E;
        bVar2.getClass();
        Z(bVar2, this.O);
        this.P = false;
        this.Y0 = false;
    }

    @Override // defpackage.v80
    public void y(float f, float f2) {
        this.K = f;
        this.L = f2;
        u0(this.N);
    }

    @Override // defpackage.v80
    public final int z(b bVar) throws ExoPlaybackException {
        try {
            return t0(this.t, bVar);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw a(e, bVar, false, 4002);
        }
    }

    public void a0() {
    }

    public void d0(fc1 fc1Var) {
    }
}
