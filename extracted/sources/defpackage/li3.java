package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class li3 extends v80 {
    public int A;
    public int B;
    public b C;
    public kc0 D;
    public fc1 E;
    public ImageOutput F;
    public Bitmap G;
    public boolean H;
    public tn0 I;
    public tn0 J;
    public int K;
    public boolean L;
    public final jc0 s;
    public final fc1 t;
    public final ArrayDeque u;
    public boolean v;
    public boolean w;
    public ki3 x;
    public long y;
    public long z;

    public li3(jc0 jc0Var) {
        super(4);
        this.s = jc0Var;
        this.F = ImageOutput.a;
        this.t = new fc1(0);
        this.x = ki3.c;
        this.u = new ArrayDeque();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = 0;
        this.B = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(long r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li3.B(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(long r13) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li3.C(long):boolean");
    }

    public final void D() throws ExoPlaybackException {
        if (this.L) {
            b bVar = this.C;
            bVar.getClass();
            jc0 jc0Var = this.s;
            jc0Var.getClass();
            int iA = jc0.a(bVar);
            if (iA != bl4.k(4, 0, 0, 0) && iA != bl4.k(3, 0, 0, 0)) {
                throw a(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.C, false, 4005);
            }
            kc0 kc0Var = this.D;
            if (kc0Var != null) {
                kc0Var.a();
            }
            this.D = new kc0(jc0Var.a);
            this.L = false;
        }
    }

    public final void E() {
        this.E = null;
        this.A = 0;
        this.z = -9223372036854775807L;
        kc0 kc0Var = this.D;
        if (kc0Var != null) {
            kc0Var.a();
            this.D = null;
        }
    }

    @Override // defpackage.v80, defpackage.ke6
    public final void e(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.F = imageOutput;
    }

    @Override // defpackage.v80
    public final String j() {
        return "ImageRenderer";
    }

    @Override // defpackage.v80
    public final boolean l() {
        return this.w;
    }

    @Override // defpackage.v80
    public final boolean m() {
        int i = this.B;
        if (i != 3) {
            return i == 0 && this.H;
        }
        return true;
    }

    @Override // defpackage.v80
    public final void n() {
        this.C = null;
        this.x = ki3.c;
        this.u.clear();
        E();
        this.F.a();
    }

    @Override // defpackage.v80
    public final void o(boolean z, boolean z2) {
        this.B = z2 ? 1 : 0;
    }

    @Override // defpackage.v80
    public final void p(long j, boolean z) {
        this.B = Math.min(this.B, 1);
        this.w = false;
        this.v = false;
        this.G = null;
        this.I = null;
        this.J = null;
        this.H = false;
        this.E = null;
        kc0 kc0Var = this.D;
        if (kc0Var != null) {
            kc0Var.flush();
        }
        this.u.clear();
    }

    @Override // defpackage.v80
    public final void q() {
        E();
    }

    @Override // defpackage.v80
    public final void r() {
        E();
        this.B = Math.min(this.B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.v80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(androidx.media3.common.b[] r5, long r6, long r8, defpackage.ks4 r10) {
        /*
            r4 = this;
            ki3 r5 = r4.x
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.u
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            ki3 r6 = new ki3
            long r0 = r4.z
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            ki3 r5 = new ki3
            r5.<init>(r0, r8)
            r4.x = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li3.u(androidx.media3.common.b[], long, long, ks4):void");
    }

    @Override // defpackage.v80
    public final void w(long j, long j2) throws ExoPlaybackException {
        if (this.w) {
            return;
        }
        if (this.C == null) {
            hh2 hh2Var = this.c;
            hh2Var.g();
            fc1 fc1Var = this.t;
            fc1Var.f();
            int iV = v(hh2Var, fc1Var, 2);
            if (iV != -5) {
                if (iV == -4) {
                    vy2.s(fc1Var.d(4));
                    this.v = true;
                    this.w = true;
                    return;
                }
                return;
            }
            b bVar = (b) hh2Var.c;
            vy2.t(bVar);
            this.C = bVar;
            this.L = true;
        }
        if (this.D == null) {
            D();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (B(j)) {
            }
            while (C(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw a(e, null, false, 4003);
        }
    }

    @Override // defpackage.v80
    public final int z(b bVar) {
        this.s.getClass();
        return jc0.a(bVar);
    }
}
