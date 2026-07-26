package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.common.recycler.c;
import ir.mservices.market.app.url.recycler.AppReviewData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersItemData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class w09 extends a {
    public final GraphicUtils$Dimension l;
    public int m;
    public int n;
    public s09 o;
    public s09 p;
    public s09 q;
    public vo4 r;
    public s09 s;
    public s09 t;

    public w09(int i, GraphicUtils$Dimension graphicUtils$Dimension) {
        super(i);
        this.l = graphicUtils$Dimension;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == AppReviewData.g) {
            s09 s09Var = this.o;
            if (s09Var == null) {
                js3.V("onReviewAppClickListener");
                throw null;
            }
            s09 s09Var2 = this.p;
            if (s09Var2 == null) {
                js3.V("onReviewClickListener");
                throw null;
            }
            s09 s09Var3 = this.q;
            if (s09Var3 != null) {
                return new ir.mservices.market.app.url.recycler.a(view, s09Var, s09Var2, s09Var3);
            }
            js3.V("onRatingClickListener");
            throw null;
        }
        if (i != AppNestedData.l) {
            if (i != MovieHomeBannersItemData.c) {
                return null;
            }
            h35 h35Var = new h35(this.n, view);
            s09 s09Var4 = this.t;
            if (s09Var4 != null) {
                h35Var.x = s09Var4;
                return h35Var;
            }
            js3.V("onBannerClickListener");
            throw null;
        }
        c cVar = new c(this.m, view);
        vo4 vo4Var = this.r;
        if (vo4Var == null) {
            js3.V("onFastDownloadClickListener");
            throw null;
        }
        cVar.y = vo4Var;
        s09 s09Var5 = this.s;
        if (s09Var5 != null) {
            cVar.w = s09Var5;
            return cVar;
        }
        js3.V("onAppClickListener");
        throw null;
    }
}
