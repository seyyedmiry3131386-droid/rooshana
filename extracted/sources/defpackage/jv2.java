package defpackage;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;

/* JADX INFO: loaded from: classes3.dex */
public final class jv2 {
    public e a;
    public boolean b;
    public gp c;
    public float d;
    public int e;
    public boolean f;
    public boolean g;

    public final View a(k kVar) {
        float f = this.d;
        int i = this.e;
        int i2 = 0;
        if (this.b) {
            vz1 vz1VarB = b(kVar);
            if (!(kVar instanceof LinearLayoutManager)) {
                return null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar;
            boolean z = linearLayoutManager.t;
            int iR0 = z ? linearLayoutManager.R0() : linearLayoutManager.T0();
            int i3 = kVar instanceof GridLayoutManager ? ((GridLayoutManager) kVar).F : 1;
            if (iR0 == -1) {
                return null;
            }
            View viewR = kVar.r(iR0);
            if (Math.abs(vz1VarB.g(viewR) - vz1VarB.n()) == i) {
                return null;
            }
            float fN = (vz1VarB.n() - vz1VarB.g(viewR)) / vz1VarB.e(viewR);
            boolean z2 = (z ? linearLayoutManager.O0() : linearLayoutManager.S0()) == 0;
            if (fN > f && !z2) {
                return viewR;
            }
            if (z2) {
                return null;
            }
            if (z) {
                i2 = i3;
            } else if (i3 > 1) {
                i2 = -i3;
            }
            return kVar.r(iR0 + i2);
        }
        vz1 vz1VarB2 = b(kVar);
        if (!(kVar instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) kVar;
        boolean z3 = linearLayoutManager2.t;
        int iT0 = z3 ? linearLayoutManager2.T0() : linearLayoutManager2.R0();
        int i4 = kVar instanceof GridLayoutManager ? ((GridLayoutManager) kVar).F : 1;
        if (iT0 == -1) {
            return null;
        }
        View viewR2 = kVar.r(iT0);
        if (Math.abs(vz1VarB2.d(viewR2)) == i) {
            return null;
        }
        float fD = vz1VarB2.d(viewR2) / vz1VarB2.e(viewR2);
        boolean z4 = (z3 ? linearLayoutManager2.S0() : linearLayoutManager2.O0()) == kVar.C() - 1;
        if (fD > f && !z4) {
            return viewR2;
        }
        if (z4) {
            return null;
        }
        if (z3) {
            i2 = -i4;
        } else if (i4 > 1) {
            i2 = i4;
        }
        return kVar.r(iT0 + i2);
    }

    public final vz1 b(k kVar) {
        if (this.a == null) {
            this.a = new e(kVar);
        }
        return this.a;
    }
}
