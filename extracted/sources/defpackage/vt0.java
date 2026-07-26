package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vt0 extends tg9 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final am8 s;
    public ut0 t;
    public ClippingMediaSource$IllegalClippingException u;
    public long v;
    public long w;

    public vt0(tt0 tt0Var) {
        super(tt0Var.a);
        this.l = tt0Var.b;
        this.m = tt0Var.c;
        this.n = tt0Var.d;
        this.o = tt0Var.e;
        this.p = tt0Var.f;
        this.q = tt0Var.g;
        this.r = new ArrayList();
        this.s = new am8();
    }

    public final void C(bm8 bm8Var) {
        long j;
        long j2;
        long j3;
        am8 am8Var = this.s;
        bm8Var.n(0, am8Var);
        long j4 = am8Var.p;
        ut0 ut0Var = this.t;
        long j5 = this.m;
        ArrayList arrayList = this.r;
        if (ut0Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = am8Var.l;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.v = j4 + j;
            this.w = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                st0 st0Var = (st0) arrayList.get(i);
                long j7 = this.v;
                long j8 = this.w;
                st0Var.e = j7;
                st0Var.f = j8;
            }
            j3 = j2;
        } else {
            j = this.v - j4;
            j3 = j5 != Long.MIN_VALUE ? this.w - j4 : Long.MIN_VALUE;
        }
        try {
            ut0 ut0Var2 = new ut0(bm8Var, j, j3, this.q);
            this.t = ut0Var2;
            m(ut0Var2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.u = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((st0) arrayList.get(i2)).g = this.u;
            }
        }
    }

    @Override // defpackage.x70
    public final boolean a(jp4 jp4Var) {
        x70 x70Var = this.k;
        return x70Var.h().e.equals(jp4Var.e) && x70Var.a(jp4Var);
    }

    @Override // defpackage.x70
    public final zp4 b(ks4 ks4Var, qc1 qc1Var, long j) {
        st0 st0Var = new st0(this.k.b(ks4Var, qc1Var, j), this.n, this.v, this.w);
        this.r.add(st0Var);
        return st0Var;
    }

    @Override // defpackage.yz0, defpackage.x70
    public final void j() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.u;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.j();
    }

    @Override // defpackage.x70
    public final void n(zp4 zp4Var) {
        ArrayList arrayList = this.r;
        vy2.s(arrayList.remove(zp4Var));
        this.k.n(((st0) zp4Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        ut0 ut0Var = this.t;
        ut0Var.getClass();
        C(ut0Var.e);
    }

    @Override // defpackage.yz0, defpackage.x70
    public final void p() {
        super.p();
        this.u = null;
        this.t = null;
    }

    @Override // defpackage.tg9
    public final void z(bm8 bm8Var) {
        if (this.u != null) {
            return;
        }
        C(bm8Var);
    }
}
