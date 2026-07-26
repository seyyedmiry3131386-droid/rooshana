package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.k;

/* JADX INFO: loaded from: classes.dex */
public class mz5 extends a08 {
    public f d;
    public e e;

    public static int g(View view, vz1 vz1Var) {
        return ((vz1Var.e(view) / 2) + vz1Var.g(view)) - ((vz1Var.n() / 2) + vz1Var.m());
    }

    public static View h(k kVar, vz1 vz1Var) {
        int iW = kVar.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iN = (vz1Var.n() / 2) + vz1Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = kVar.v(i2);
            int iAbs = Math.abs(((vz1Var.e(viewV) / 2) + vz1Var.g(viewV)) - iN);
            if (iAbs < i) {
                view = viewV;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // defpackage.a08
    public int[] b(k kVar, View view) {
        int[] iArr = new int[2];
        if (kVar.e()) {
            iArr[0] = g(view, i(kVar));
        } else {
            iArr[0] = 0;
        }
        if (kVar.f()) {
            iArr[1] = g(view, j(kVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // defpackage.a08
    public final a07 c(k kVar) {
        if (kVar instanceof zz6) {
            return new fn0(this, this.a.getContext(), 3);
        }
        return null;
    }

    @Override // defpackage.a08
    public View d(k kVar) {
        if (kVar.f()) {
            return h(kVar, j(kVar));
        }
        if (kVar.e()) {
            return h(kVar, i(kVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a08
    public int e(k kVar, int i, int i2) {
        PointF pointFB;
        int iC = kVar.C();
        if (iC != 0) {
            View view = null;
            vz1 vz1VarJ = kVar.f() ? j(kVar) : kVar.e() ? i(kVar) : null;
            if (vz1VarJ != null) {
                int iW = kVar.w();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iW; i5++) {
                    View viewV = kVar.v(i5);
                    if (viewV != null) {
                        int iG = g(viewV, vz1VarJ);
                        if (iG <= 0 && iG > i4) {
                            view2 = viewV;
                            i4 = iG;
                        }
                        if (iG >= 0 && iG < i3) {
                            view = viewV;
                            i3 = iG;
                        }
                    }
                }
                boolean z2 = !kVar.e() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return k.H(view);
                }
                if (!z2 && view2 != null) {
                    return k.H(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int iH = k.H(view);
                    int iC2 = kVar.C();
                    if ((kVar instanceof zz6) && (pointFB = ((zz6) kVar).b(iC2 - 1)) != null && (pointFB.x < 0.0f || pointFB.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iH + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iC) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public final vz1 i(k kVar) {
        e eVar = this.e;
        if (eVar == null || ((k) eVar.b) != kVar) {
            this.e = new e(kVar);
        }
        return this.e;
    }

    public final vz1 j(k kVar) {
        f fVar = this.d;
        if (fVar == null || ((k) fVar.b) != kVar) {
            this.d = new f(kVar);
        }
        return this.d;
    }
}
