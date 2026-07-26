package defpackage;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import ir.mservices.market.version2.ui.recycler.snap.BaseAppSnapHelper$DIRECTION;

/* JADX INFO: loaded from: classes3.dex */
public final class t06 extends a08 {
    public static boolean l = true;
    public final boolean d;
    public final float e;
    public final ba4 f;
    public e g;
    public int i;
    public RecyclerView j;
    public BaseAppSnapHelper$DIRECTION h = BaseAppSnapHelper$DIRECTION.c;
    public final gp k = new gp(14, this);

    public t06(boolean z, float f, ba4 ba4Var) {
        this.d = z;
        this.e = f;
        this.f = ba4Var;
    }

    @Override // defpackage.a08
    public final void a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            gp gpVar = this.k;
            recyclerView.g0(gpVar);
            recyclerView.j(gpVar);
        }
        this.j = recyclerView;
        super.a(recyclerView);
    }

    @Override // defpackage.a08
    public final int[] b(k kVar, View view) {
        int iG;
        js3.p(view, "targetView");
        int[] iArr = new int[2];
        if (kVar.e()) {
            if (this.d) {
                vz1 vz1VarG = g(kVar);
                iG = kVar.F() + (vz1VarG.d(view) - ((k) vz1VarG.b).n);
            } else {
                iG = g(kVar).g(view) - (kVar.E() + 1);
            }
            iArr[0] = iG;
        }
        return iArr;
    }

    @Override // defpackage.a08
    public final a07 c(k kVar) {
        RecyclerView recyclerView;
        if ((kVar instanceof zz6) && (recyclerView = this.j) != null) {
            return new s06(recyclerView, this, recyclerView.getContext());
        }
        return null;
    }

    @Override // defpackage.a08
    public final View d(k kVar) {
        boolean z;
        if (!l) {
            return null;
        }
        BaseAppSnapHelper$DIRECTION baseAppSnapHelper$DIRECTION = this.h;
        BaseAppSnapHelper$DIRECTION baseAppSnapHelper$DIRECTION2 = BaseAppSnapHelper$DIRECTION.b;
        boolean z2 = this.d;
        float f = this.e;
        if ((baseAppSnapHelper$DIRECTION == baseAppSnapHelper$DIRECTION2 && !z2) || (baseAppSnapHelper$DIRECTION == BaseAppSnapHelper$DIRECTION.a && z2)) {
            f = 1 - f;
        }
        if (!z2) {
            vz1 vz1VarG = g(kVar);
            int iE = kVar.E() + 1;
            if (!(kVar instanceof LinearLayoutManager)) {
                return null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar;
            int iR0 = linearLayoutManager.R0();
            int i = linearLayoutManager instanceof GridLayoutManager ? ((GridLayoutManager) linearLayoutManager).F : 1;
            if (iR0 == -1) {
                return null;
            }
            View viewR = linearLayoutManager.r(iR0);
            if (Math.abs(vz1VarG.d(viewR)) == iE) {
                return null;
            }
            float fD = vz1VarG.d(viewR) / vz1VarG.e(viewR);
            z = linearLayoutManager.O0() == 0;
            if (fD > f && !z) {
                return viewR;
            }
            if (z) {
                return null;
            }
            return linearLayoutManager.r(iR0 + i);
        }
        vz1 vz1VarG2 = g(kVar);
        int iF = kVar.F();
        if (!(kVar instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) kVar;
        int iR02 = linearLayoutManager2.R0();
        int i2 = linearLayoutManager2 instanceof GridLayoutManager ? ((GridLayoutManager) linearLayoutManager2).F : 1;
        if (iR02 == -1) {
            return null;
        }
        View viewR2 = linearLayoutManager2.r(iR02);
        if (Math.abs(vz1VarG2.g(viewR2) - ((k) vz1VarG2.b).n) == iF) {
            return null;
        }
        float fG = (r9.n - vz1VarG2.g(viewR2)) / vz1VarG2.e(viewR2);
        z = linearLayoutManager2.S0() == 0;
        if (fG > f && !z) {
            return viewR2;
        }
        if (z) {
            return null;
        }
        return linearLayoutManager2.r(iR02 + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    @Override // defpackage.a08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(androidx.recyclerview.widget.k r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t06.e(androidx.recyclerview.widget.k, int, int):int");
    }

    public final vz1 g(k kVar) {
        e eVar;
        e eVar2 = this.g;
        if (eVar2 != null) {
            if (eVar2.equals(kVar)) {
                eVar = this.g;
            } else {
                eVar = new e(kVar);
                this.g = eVar;
            }
            if (eVar != null) {
                return eVar;
            }
        }
        e eVar3 = new e(kVar);
        this.g = eVar3;
        return eVar3;
    }
}
