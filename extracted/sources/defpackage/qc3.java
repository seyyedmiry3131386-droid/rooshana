package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.common.recycler.b;
import ir.mservices.market.app.common.recycler.c;

/* JADX INFO: loaded from: classes3.dex */
public final class qc3 extends l06 {
    public og5 m;
    public og5 n;
    public og5 o;
    public s82 p;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == AppNestedData.j) {
            return new mr(this.l, view);
        }
        if (i == AppNestedData.k) {
            return new bq(this.l, view);
        }
        if (i == AppNestedData.l) {
            return new c(this.l, view);
        }
        if (i == AppNestedData.m) {
            return new b(this.l, view);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        int iE = e(i);
        if (iE == AppNestedData.j) {
            mr mrVar = (mr) qg5Var;
            mrVar.x = this.p;
            og5 og5Var = this.n;
            if (og5Var == null) {
                js3.V("appClickListener");
                throw null;
            }
            mrVar.y = og5Var;
        } else if (iE == AppNestedData.k) {
            bq bqVar = (bq) qg5Var;
            og5 og5Var2 = this.o;
            if (og5Var2 == null) {
                js3.V("appDigestedClickListener");
                throw null;
            }
            bqVar.x = og5Var2;
        } else if (iE == AppNestedData.l) {
            c cVar = (c) qg5Var;
            cVar.y = this.p;
            og5 og5Var3 = this.m;
            if (og5Var3 == null) {
                js3.V("multiAppClickListener");
                throw null;
            }
            cVar.w = og5Var3;
        } else if (iE == AppNestedData.m) {
            b bVar = (b) qg5Var;
            og5 og5Var4 = this.m;
            if (og5Var4 == null) {
                js3.V("multiAppClickListener");
                throw null;
            }
            bVar.w = og5Var4;
        }
        super.l(qg5Var, i);
    }
}
