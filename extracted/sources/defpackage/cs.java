package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.search.result.ui.recycler.RestrictedApplicationData;
import ir.mservices.market.app.search.result.ui.recycler.SearchAdsAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchNormalAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchScreenshotAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchScrollableScreenshotAppData;
import ir.mservices.market.app.search.result.ui.recycler.SearchSummaryAppData;
import ir.mservices.market.app.search.result.ui.recycler.c;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class cs extends a {
    public gs A;
    public gs B;
    public final boolean l;
    public final GraphicUtils$Dimension m;
    public gs n;
    public hs o;
    public hs p;
    public hs q;
    public hs r;
    public ir.mservices.market.app.search.result.ui.a s;
    public hs t;
    public gs u;
    public gs v;
    public gs w;
    public gs x;
    public gs y;
    public gs z;

    public cs(int i, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(i);
        this.l = z;
        this.m = graphicUtils$Dimension;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == RestrictedApplicationData.c) {
            return new l5(20, view);
        }
        if (i == SearchNormalAppData.k) {
            hs hsVar = this.q;
            if (hsVar == null) {
                js3.V("normalFastDownloadClickListener");
                throw null;
            }
            kh7 kh7Var = new kh7(view, hsVar, O());
            kh7Var.y = (xf5) ((w91) qg5.r()).F.get();
            return kh7Var;
        }
        if (i == SearchAdsAppData.k) {
            hs hsVar2 = this.r;
            if (hsVar2 == null) {
                js3.V("adsFastDownloadClickListener");
                throw null;
            }
            kh7 kh7Var2 = new kh7(view, hsVar2, O());
            kh7Var2.y = (xf5) ((w91) qg5.r()).F.get();
            return kh7Var2;
        }
        int i2 = SearchScreenshotAppData.n;
        GraphicUtils$Dimension graphicUtils$Dimension = this.m;
        if (i == i2) {
            hs hsVar3 = this.p;
            if (hsVar3 == null) {
                js3.V("screenshotFastDownloadClickListener");
                throw null;
            }
            og5 og5VarO = O();
            js3.p(graphicUtils$Dimension, "dimension");
            mj7 mj7Var = new mj7(view, hsVar3, og5VarO, graphicUtils$Dimension, null, 240);
            w91 w91Var = (w91) qg5.r();
            mj7Var.y = (xf5) w91Var.F.get();
            mj7Var.H = w91Var.Z();
            mj7Var.I = (d04) w91Var.p.get();
            return mj7Var;
        }
        if (i == SearchSummaryAppData.j) {
            hs hsVar4 = this.o;
            if (hsVar4 != null) {
                return new qj7(view, hsVar4, O());
            }
            js3.V("summaryFastDownloadClickListener");
            throw null;
        }
        if (i == SearchScrollableScreenshotAppData.n) {
            hs hsVar5 = this.p;
            if (hsVar5 == null) {
                js3.V("screenshotFastDownloadClickListener");
                throw null;
            }
            og5 og5VarO2 = O();
            ir.mservices.market.app.search.result.ui.a aVar = this.s;
            if (aVar == null) {
                js3.V("videoStartListener");
                throw null;
            }
            js3.p(graphicUtils$Dimension, "dimension");
            c cVar = new c(view, hsVar5, og5VarO2, graphicUtils$Dimension, aVar, 112);
            w91 w91Var2 = (w91) qg5.r();
            cVar.y = (xf5) w91Var2.F.get();
            cVar.H = w91Var2.Z();
            cVar.I = (d04) w91Var2.p.get();
            return cVar;
        }
        if (i == HomeAppsRowData.m) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getResources().getDimensionPixelSize(pq6.space_8);
            hs hsVar6 = this.t;
            if (hsVar6 == null) {
                js3.V("onHomeFastDownloadClickListener");
                throw null;
            }
            gs gsVar = this.u;
            if (gsVar == null) {
                js3.V("onCardAppClickListener");
                throw null;
            }
            js3.p(graphicUtils$Dimension, "dimension");
            return new ph7(view, graphicUtils$Dimension, this.l, hsVar6, gsVar, null, 1);
        }
        if (i == HomeAppsRowData.o) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            js3.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = view.getResources().getDimensionPixelSize(pq6.space_8);
            gs gsVar2 = this.v;
            if (gsVar2 == null) {
                js3.V("onAppDigestedClickListener");
                throw null;
            }
            js3.p(graphicUtils$Dimension, "dimension");
            return new ph7(view, graphicUtils$Dimension, this.l, null, null, gsVar2, 0);
        }
        if (i == HomeMoreTitleRowData.j) {
            gs gsVar3 = this.w;
            if (gsVar3 == null) {
                js3.V("onHomeMoreClickListener");
                throw null;
            }
            tb3 tb3Var = new tb3(1, gsVar3, view);
            tb3Var.x = (d04) ((w91) qg5.r()).p.get();
            return tb3Var;
        }
        if (i == MovieHomeMoviesRowData.s) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            js3.n(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((GridLayoutManager.LayoutParams) layoutParams3)).bottomMargin = view.getResources().getDimensionPixelSize(pq6.space_8);
            gs gsVar4 = this.y;
            if (gsVar4 == null) {
                js3.V("onMoreClickListener");
                throw null;
            }
            gs gsVar5 = this.x;
            if (gsVar5 != null) {
                return new p35(view, this.m, this.l, gsVar4, gsVar5);
            }
            js3.V("onMovieSearchClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.t) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            js3.n(layoutParams4, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((GridLayoutManager.LayoutParams) layoutParams4)).bottomMargin = view.getResources().getDimensionPixelSize(pq6.space_8);
            gs gsVar6 = this.y;
            if (gsVar6 == null) {
                js3.V("onMoreClickListener");
                throw null;
            }
            gs gsVar7 = this.x;
            if (gsVar7 != null) {
                return new r35(view, this.m, this.l, gsVar6, gsVar7);
            }
            js3.V("onMovieSearchClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.u) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            js3.n(layoutParams5, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((GridLayoutManager.LayoutParams) layoutParams5)).bottomMargin = view.getResources().getDimensionPixelSize(pq6.space_8);
            gs gsVar8 = this.y;
            if (gsVar8 == null) {
                js3.V("onMoreClickListener");
                throw null;
            }
            gs gsVar9 = this.x;
            if (gsVar9 != null) {
                return new q35(view, this.m, this.l, gsVar8, gsVar9);
            }
            js3.V("onMovieSearchClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.v) {
            gs gsVar10 = this.y;
            if (gsVar10 == null) {
                js3.V("onMoreClickListener");
                throw null;
            }
            gs gsVar11 = this.x;
            if (gsVar11 != null) {
                return new ir.mservices.market.movie.ui.home.recycler.a(view, this.m, this.l, gsVar10, gsVar11);
            }
            js3.V("onMovieSearchClickListener");
            throw null;
        }
        if (i == HomeBannerData.c) {
            gs gsVar12 = this.z;
            if (gsVar12 != null) {
                return new ib3(view, graphicUtils$Dimension, gsVar12);
            }
            js3.V("onAppBannerClickListener");
            throw null;
        }
        if (i == MovieHomeBannerData.e) {
            gs gsVar13 = this.A;
            if (gsVar13 != null) {
                return new e35(view, graphicUtils$Dimension, gsVar13);
            }
            js3.V("onMovieBannerClickListener");
            throw null;
        }
        if (i != MovieHomeBannerData.f) {
            return null;
        }
        gs gsVar14 = this.B;
        if (gsVar14 != null) {
            return new b45(view, graphicUtils$Dimension, gsVar14);
        }
        js3.V("onMovieSingleBannerClickListener");
        throw null;
    }

    public final og5 O() {
        gs gsVar = this.n;
        if (gsVar != null) {
            return gsVar;
        }
        js3.V("onSpecialAppClickListener");
        throw null;
    }
}
