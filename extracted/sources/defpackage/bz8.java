package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.app.update.recycler.UpdateEmptyListData;
import ir.mservices.market.app.update.recycler.UpdateHeaderData;
import ir.mservices.market.app.update.recycler.b;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class bz8 extends a {
    public final GraphicUtils$Dimension l;
    public final boolean m;
    public r79 n;
    public s90 o;
    public s90 p;
    public qq4 q;
    public s90 r;
    public s90 s;
    public s90 t;
    public s90 u;
    public s90 v;
    public ir.mservices.market.app.update.a w;
    public bn6 x;
    public s90 y;
    public s90 z;

    public bz8(int i, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(i);
        this.l = graphicUtils$Dimension;
        this.m = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == AppUpdateData.o) {
            s90 s90Var = this.r;
            if (s90Var == null) {
                js3.V("onMoreClickListener");
                throw null;
            }
            s90 s90Var2 = this.s;
            if (s90Var2 == null) {
                js3.V("onUpdateItemClickListener");
                throw null;
            }
            s90 s90Var3 = this.v;
            if (s90Var3 == null) {
                js3.V("onAppMoreClickListener");
                throw null;
            }
            s90 s90Var4 = this.t;
            if (s90Var4 == null) {
                js3.V("onRatingClickListener");
                throw null;
            }
            s90 s90Var5 = this.u;
            if (s90Var5 == null) {
                js3.V("onReviewClickListener");
                throw null;
            }
            qq4 qq4Var = this.q;
            if (qq4Var == null) {
                js3.V("onFastDownloadClickListener");
                throw null;
            }
            au auVar = new au(view, s90Var, s90Var2, s90Var3, s90Var4, s90Var5, qq4Var, 0);
            w91 w91Var = (w91) qg5.r();
            auVar.C = (lw8) w91Var.E.get();
            auVar.D = (xf5) w91Var.F.get();
            auVar.E = (dp3) w91Var.v.get();
            auVar.F = (d04) w91Var.p.get();
            return auVar;
        }
        if (i == AppUpdateData.p) {
            s90 s90Var6 = this.r;
            if (s90Var6 == null) {
                js3.V("onMoreClickListener");
                throw null;
            }
            s90 s90Var7 = this.s;
            if (s90Var7 == null) {
                js3.V("onUpdateItemClickListener");
                throw null;
            }
            s90 s90Var8 = this.v;
            if (s90Var8 == null) {
                js3.V("onAppMoreClickListener");
                throw null;
            }
            s90 s90Var9 = this.t;
            if (s90Var9 == null) {
                js3.V("onRatingClickListener");
                throw null;
            }
            s90 s90Var10 = this.u;
            if (s90Var10 == null) {
                js3.V("onReviewClickListener");
                throw null;
            }
            qq4 qq4Var2 = this.q;
            if (qq4Var2 == null) {
                js3.V("onFastDownloadClickListener");
                throw null;
            }
            au auVar2 = new au(view, s90Var6, s90Var7, s90Var8, s90Var9, s90Var10, qq4Var2, 1);
            w91 w91Var2 = (w91) qg5.r();
            auVar2.C = (lw8) w91Var2.E.get();
            auVar2.D = (xf5) w91Var2.F.get();
            auVar2.E = (dp3) w91Var2.v.get();
            auVar2.F = (d04) w91Var2.p.get();
            return auVar2;
        }
        if (i == UpdateHeaderData.d) {
            ir.mservices.market.app.update.a aVar = this.w;
            if (aVar != null) {
                return new b(view, aVar);
            }
            js3.V("onActionClickListener");
            throw null;
        }
        if (i == HomeAppsRowData.o) {
            s90 s90Var11 = this.p;
            if (s90Var11 != null) {
                return new sa3(view, this.l, this.m, s90Var11, 1);
            }
            js3.V("onDigestedRecommendationAppClickListener");
            throw null;
        }
        if (i == HomeAppsRowData.m) {
            s90 s90Var12 = this.o;
            if (s90Var12 == null) {
                js3.V("onRecommendationAppClickListener");
                throw null;
            }
            p58 p58Var = new p58(25);
            r79 r79Var = this.n;
            if (r79Var != null) {
                return new ta3(view, this.l, this.m, s90Var12, p58Var, r79Var, 7);
            }
            js3.V("onRecommendedAppFastDownloadClickListener");
            throw null;
        }
        if (i == ExtHeaderRowData.l) {
            s90 s90Var13 = this.z;
            if (s90Var13 != null) {
                return new x62(view, this.l, this.m, null, s90Var13);
            }
            js3.V("onShimmerHeaderClickListener");
            throw null;
        }
        if (i != AppData.d) {
            if (i == UpdateEmptyListData.a) {
                return new l5(24, view);
            }
            if (i == HomeMoreTitleRowData.j) {
                return new tb3(0, (og5) null, view);
            }
            if (i == DividerData.k) {
                return new oq1(view);
            }
            return null;
        }
        s90 s90Var14 = this.y;
        if (s90Var14 == null) {
            js3.V("onEmptyListRecommClickListener");
            throw null;
        }
        bn6 bn6Var = this.x;
        if (bn6Var != null) {
            return new ir.mservices.market.app.common.recycler.a(view, s90Var14, bn6Var, Integer.valueOf(sj8.b().q));
        }
        js3.V("emptyListRecommFastDownloadClickListener");
        throw null;
    }
}
