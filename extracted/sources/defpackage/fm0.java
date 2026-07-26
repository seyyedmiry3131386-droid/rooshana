package defpackage;

import androidx.media3.common.b;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class fm0 extends v80 {
    public final fc1 s;
    public final h26 t;
    public em0 u;
    public long v;

    public fm0() {
        super(6);
        this.s = new fc1(1);
        this.t = new h26();
    }

    @Override // defpackage.v80, defpackage.ke6
    public final void e(int i, Object obj) {
        if (i == 8) {
            this.u = (em0) obj;
        }
    }

    @Override // defpackage.v80
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.v80
    public final boolean l() {
        return k();
    }

    @Override // defpackage.v80
    public final boolean m() {
        return true;
    }

    @Override // defpackage.v80
    public final void n() {
        em0 em0Var = this.u;
        if (em0Var != null) {
            em0Var.b();
        }
    }

    @Override // defpackage.v80
    public final void p(long j, boolean z) {
        this.v = Long.MIN_VALUE;
        em0 em0Var = this.u;
        if (em0Var != null) {
            em0Var.b();
        }
    }

    @Override // defpackage.v80
    public final void w(long j, long j2) {
        float[] fArr;
        while (!k() && this.v < 100000 + j) {
            fc1 fc1Var = this.s;
            fc1Var.f();
            hh2 hh2Var = this.c;
            hh2Var.g();
            if (v(hh2Var, fc1Var, 0) != -4 || fc1Var.d(4)) {
                return;
            }
            long j3 = fc1Var.g;
            this.v = j3;
            boolean z = j3 < this.l;
            if (this.u != null && !z) {
                fc1Var.j();
                ByteBuffer byteBuffer = fc1Var.e;
                String str = j29.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    h26 h26Var = this.t;
                    h26Var.H(iLimit, bArrArray);
                    h26Var.J(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(h26Var.l());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.u.a(this.v - this.k, fArr);
                }
            }
        }
    }

    @Override // defpackage.v80
    public final int z(b bVar) {
        return "application/x-camera-motion".equals(bVar.n) ? bl4.k(4, 0, 0, 0) : bl4.k(0, 0, 0, 0);
    }
}
