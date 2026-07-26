package androidx.recyclerview.widget;

import android.view.View;
import defpackage.bl4;
import defpackage.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public vz1 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public a() {
        d();
    }

    public final void a() {
        this.c = this.d ? this.a.i() : this.a.m();
    }

    public final void b(int i, View view) {
        if (this.d) {
            int iD = this.a.d(view);
            vz1 vz1Var = this.a;
            this.c = (Integer.MIN_VALUE == vz1Var.a ? 0 : vz1Var.n() - vz1Var.a) + iD;
        } else {
            this.c = this.a.g(view);
        }
        this.b = i;
    }

    public final void c(int i, View view) {
        vz1 vz1Var = this.a;
        int iN = Integer.MIN_VALUE == vz1Var.a ? 0 : vz1Var.n() - vz1Var.a;
        if (iN >= 0) {
            b(i, view);
            return;
        }
        this.b = i;
        if (!this.d) {
            int iG = this.a.g(view);
            int iM = iG - this.a.m();
            this.c = iG;
            if (iM > 0) {
                int i2 = (this.a.i() - Math.min(0, (this.a.i() - iN) - this.a.d(view))) - (this.a.e(view) + iG);
                if (i2 < 0) {
                    this.c -= Math.min(iM, -i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = (this.a.i() - iN) - this.a.d(view);
        this.c = this.a.i() - i3;
        if (i3 > 0) {
            int iE = this.c - this.a.e(view);
            int iM2 = this.a.m();
            int iMin = iE - (Math.min(this.a.g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(i3, -iMin) + this.c;
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.d);
        sb.append(", mValid=");
        return bl4.A(sb, this.e, '}');
    }
}
