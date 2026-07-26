package androidx.compose.ui.layout;

import defpackage.bl8;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.gx4;
import defpackage.j37;
import defpackage.jr5;
import defpackage.li1;
import defpackage.m91;
import defpackage.tx8;

/* JADX INFO: loaded from: classes.dex */
public final class i extends gx4 implements jr5 {
    public bp2 o;
    public bl8 p;
    public li1 q;
    public boolean r;
    public j37 s;
    public final dp2 t = new dp2() { // from class: androidx.compose.ui.layout.OnFirstVisibleNode$rectChanged$1
        {
            super(1);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            this.g.C0((j37) obj);
            return tx8.a;
        }
    };

    public i(bp2 bp2Var) {
        this.o = bp2Var;
    }

    public final void C0(j37 j37Var) {
        li1 li1Var;
        this.s = j37Var;
        long j = j37Var.e;
        int i = (int) (j >> 32);
        long j2 = j37Var.a;
        int iMin = Math.min(Math.max((int) (j2 >> 32), 0), i);
        int iMin2 = Math.min(Math.max((int) j2, 0), (int) j);
        long j3 = j37Var.b;
        int iMax = Math.max(Math.min((int) (j3 >> 32), i), 0);
        int i2 = (int) j3;
        float fMax = Math.max((Math.max(Math.min(i2, r0), 0) - iMin2) * (iMax - iMin), 0) / Math.min((r0 - 0) * (i - 0), (i2 - r3) * (r13 - r5));
        boolean z = fMax > 1.0f || fMax == 1.0f;
        if (z && !this.r) {
            bl8 bl8Var = this.p;
            if (bl8Var != null) {
                bl8Var.b();
            }
            li1 li1Var2 = this.q;
            if (li1Var2 != null) {
                li1Var2.g(null);
            }
            this.o.invoke();
        } else if (!z && this.r && (li1Var = this.q) != null) {
            li1Var.g(null);
        }
        this.r = z;
    }

    @Override // defpackage.jr5
    public final void Y() {
    }

    @Override // defpackage.gx4
    public final void s0() {
        bl8 bl8Var = this.p;
        if (bl8Var != null) {
            bl8Var.b();
        }
        this.p = m91.D(this, this.t);
    }

    @Override // defpackage.gx4
    public final void u0() {
        bl8 bl8Var = this.p;
        if (bl8Var != null) {
            bl8Var.b();
        }
    }

    @Override // defpackage.gx4
    public final void w0() {
        li1 li1Var = this.q;
        if (li1Var != null) {
            li1Var.g(null);
        }
        this.q = null;
        this.r = false;
        this.s = null;
    }
}
