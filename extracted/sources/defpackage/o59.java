package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.home.ui.recycler.BaseHomeVideoData;
import ir.mservices.market.app.home.ui.recycler.c;
import ir.mservices.market.app.home.ui.recycler.d;

/* JADX INFO: loaded from: classes3.dex */
public final class o59 extends l06 {
    public s82 m;
    public og5 n;
    public og5 o;
    public pt2 p;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == BaseHomeVideoData.c) {
            return new d(this.l, view);
        }
        if (i == BaseHomeVideoData.d) {
            return new c(this.l, view);
        }
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a, androidx.recyclerview.widget.g
    /* JADX INFO: renamed from: K */
    public final void l(qg5 qg5Var, int i) {
        int iE = e(i);
        if (iE == BaseHomeVideoData.c) {
            d dVar = (d) qg5Var;
            s82 s82Var = this.m;
            if (s82Var == null) {
                js3.V("onVideoListFastDownloadClickListener");
                throw null;
            }
            dVar.D = s82Var;
            og5 og5Var = this.n;
            if (og5Var == null) {
                js3.V("onAppClickListener");
                throw null;
            }
            dVar.w = og5Var;
            og5 og5Var2 = this.o;
            if (og5Var2 == null) {
                js3.V("onVideoStartedListener");
                throw null;
            }
            dVar.x = og5Var2;
            pt2 pt2Var = this.p;
            if (pt2Var == null) {
                js3.V("videoStartListener");
                throw null;
            }
            dVar.y = pt2Var;
        } else if (iE == BaseHomeVideoData.d) {
            c cVar = (c) qg5Var;
            og5 og5Var3 = this.n;
            if (og5Var3 == null) {
                js3.V("onAppClickListener");
                throw null;
            }
            cVar.w = og5Var3;
            og5 og5Var4 = this.o;
            if (og5Var4 == null) {
                js3.V("onVideoStartedListener");
                throw null;
            }
            cVar.x = og5Var4;
            pt2 pt2Var2 = this.p;
            if (pt2Var2 == null) {
                js3.V("videoStartListener");
                throw null;
            }
            cVar.y = pt2Var2;
        }
        super.l(qg5Var, i);
    }
}
