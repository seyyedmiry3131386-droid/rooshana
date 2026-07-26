package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.common.recycler.c;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotListData;
import ir.mservices.market.app.detail.ui.recycler.e;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerAppsData;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeExtReviewModuleData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.home.ui.recycler.HomeSingleAppData;
import ir.mservices.market.app.home.ui.recycler.HomeTopBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeVideoListData;
import ir.mservices.market.app.home.ui.recycler.HugeBannerData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class jb3 extends a {
    public ob3 A;
    public ob3 B;
    public ob3 C;
    public ob3 D;
    public ob3 E;
    public ob3 F;
    public pb3 G;
    public qb3 H;
    public ob3 I;
    public ob3 J;
    public ob3 K;
    public ob3 L;
    public ob3 M;
    public ob3 N;
    public ob3 O;
    public ob3 P;
    public ob3 Q;
    public final boolean l;
    public pb3 m;
    public pb3 n;
    public qb3 o;
    public GraphicUtils$Dimension p;
    public ob3 q;
    public ob3 r;
    public ob3 s;
    public ob3 t;
    public ob3 u;
    public ob3 v;
    public ob3 w;
    public ob3 x;
    public qb3 y;
    public ob3 z;

    public jb3(boolean z) {
        super(1);
        this.l = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == AppNestedData.l) {
            c cVar = new c(O().a, view);
            pb3 pb3Var = this.m;
            if (pb3Var == null) {
                js3.V("onHomeAppFastDownloadClickListener");
                throw null;
            }
            cVar.y = pb3Var;
            cVar.w = Q();
            return cVar;
        }
        if (i == AppScreenshotListData.d) {
            return new e(view, O(), T(), U());
        }
        if (i == HomeAppsRowData.m) {
            return new ta3(view, O(), this.l, P(), S(), R(), 7);
        }
        if (i == HomeAppsRowData.n) {
            return new ta3(view, O(), this.l, P(), S(), R(), 6);
        }
        if (i == HomeAppsRowData.q) {
            return new ta3(view, O(), R(), this.l, P(), S(), 1);
        }
        if (i == HomeAppsRowData.r) {
            return new sa3(view, O(), this.l, P(), S(), 2);
        }
        if (i == HomeAppsRowData.s) {
            return new ta3(view, O(), R(), this.l, P(), S(), 0);
        }
        if (i == HomeAppsRowData.t) {
            return new sa3(view, O(), this.l, P(), S(), 3);
        }
        int i2 = HomeAppsRowData.o;
        boolean z = this.l;
        if (i == i2) {
            GraphicUtils$Dimension graphicUtils$DimensionO = O();
            ob3 ob3Var = this.K;
            if (ob3Var != null) {
                return new sa3(view, graphicUtils$DimensionO, z, ob3Var, 1);
            }
            js3.V("onAppDigestedClickListener");
            throw null;
        }
        if (i == HomeAppsRowData.p) {
            GraphicUtils$Dimension graphicUtils$DimensionO2 = O();
            ob3 ob3Var2 = this.K;
            if (ob3Var2 != null) {
                return new sa3(view, graphicUtils$DimensionO2, z, ob3Var2, 0);
            }
            js3.V("onAppDigestedClickListener");
            throw null;
        }
        if (i == HomeAppsRowData.u) {
            return new ta3(view, O(), R(), this.l, P(), S(), 5);
        }
        if (i == HomeAppsRowData.v) {
            return new sa3(view, O(), this.l, P(), S(), 6);
        }
        if (i == HomeAppsRowData.w) {
            return new ta3(view, O(), R(), this.l, P(), S(), 4);
        }
        if (i == HomeAppsRowData.x) {
            return new sa3(view, O(), this.l, P(), S(), 7);
        }
        if (i == HomeAppsRowData.y) {
            return new ta3(view, O(), R(), this.l, P(), S(), 3);
        }
        if (i == HomeAppsRowData.z) {
            return new sa3(view, O(), this.l, P(), S(), 4);
        }
        if (i == HomeAppsRowData.A) {
            return new ta3(view, O(), R(), this.l, P(), S(), 2);
        }
        if (i == HomeAppsRowData.B) {
            return new sa3(view, O(), this.l, P(), S(), 5);
        }
        if (i == HomeBannerData.c) {
            GraphicUtils$Dimension graphicUtils$DimensionO3 = O();
            ob3 ob3Var3 = this.s;
            if (ob3Var3 != null) {
                return new ib3(view, graphicUtils$DimensionO3, ob3Var3);
            }
            js3.V("onBannerClickListener");
            throw null;
        }
        if (i == HomeMoreTitleRowData.j) {
            ob3 ob3Var4 = this.t;
            if (ob3Var4 != null) {
                return new tb3(0, ob3Var4, view);
            }
            js3.V("onHomeMoreClickListener");
            throw null;
        }
        if (i == DividerData.k) {
            return new oq1(view);
        }
        if (i == HomeSingleAppData.j) {
            return new cc3(view, O(), this.l, R(), Q(), T(), U(), 1);
        }
        if (i == HomeSingleAppData.l) {
            return new cc3(view, O(), this.l, R(), Q(), T(), U(), 0);
        }
        if (i == HomeSingleAppData.k) {
            return new bc3(view, O(), this.l, Q(), T(), U());
        }
        if (i == HomeSingleAppData.m) {
            return new bc3(view, O(), this.l, Q(), T(), U());
        }
        if (i == ExtHeaderRowData.l) {
            GraphicUtils$Dimension graphicUtils$DimensionO4 = O();
            ob3 ob3Var5 = this.r;
            if (ob3Var5 != null) {
                return new x62(view, graphicUtils$DimensionO4, this.l, null, ob3Var5);
            }
            js3.V("onShimmerHeaderClickListener");
            throw null;
        }
        if (i == HomeExtReviewModuleData.k) {
            GraphicUtils$Dimension graphicUtils$DimensionO5 = O();
            ob3 ob3Var6 = this.D;
            if (ob3Var6 == null) {
                js3.V("onReviewAppClickListener");
                throw null;
            }
            ob3 ob3Var7 = this.B;
            if (ob3Var7 == null) {
                js3.V("onReviewClickListener");
                throw null;
            }
            ob3 ob3Var8 = this.C;
            if (ob3Var8 != null) {
                return new lb3(view, graphicUtils$DimensionO5, ob3Var6, ob3Var7, ob3Var8, this.l);
            }
            js3.V("onRatingClickListener");
            throw null;
        }
        if (i == HomeTopBannerData.a) {
            O();
            if (this.s == null) {
                js3.V("onBannerClickListener");
                throw null;
            }
            m12 m12Var = new m12(2, view);
            return m12Var;
        }
        if (i == HomeVideoListData.i) {
            GraphicUtils$Dimension graphicUtils$DimensionO6 = O();
            pb3 pb3Var2 = this.n;
            if (pb3Var2 == null) {
                js3.V("onVideoListFastDownloadClickListener");
                throw null;
            }
            ob3 ob3Var9 = this.w;
            if (ob3Var9 == null) {
                js3.V("onVideoListAppClickListener");
                throw null;
            }
            ob3 ob3Var10 = this.x;
            if (ob3Var10 != null) {
                return new ic3(pb3Var2, ob3Var9, ob3Var10, view, graphicUtils$DimensionO6, this.l);
            }
            js3.V("onVideoStartListener");
            throw null;
        }
        if (i == HomeVideoListData.j) {
            GraphicUtils$Dimension graphicUtils$DimensionO7 = O();
            pb3 pb3Var3 = this.n;
            if (pb3Var3 == null) {
                js3.V("onVideoListFastDownloadClickListener");
                throw null;
            }
            ob3 ob3Var11 = this.w;
            if (ob3Var11 == null) {
                js3.V("onVideoListAppClickListener");
                throw null;
            }
            ob3 ob3Var12 = this.x;
            if (ob3Var12 != null) {
                return new ic3(pb3Var3, ob3Var11, ob3Var12, view, graphicUtils$DimensionO7, this.l);
            }
            js3.V("onVideoStartListener");
            throw null;
        }
        if (i == HomeVideoListData.k) {
            GraphicUtils$Dimension graphicUtils$DimensionO8 = O();
            ob3 ob3Var13 = this.w;
            if (ob3Var13 == null) {
                js3.V("onVideoListAppClickListener");
                throw null;
            }
            ob3 ob3Var14 = this.x;
            if (ob3Var14 != null) {
                return new hc3(view, graphicUtils$DimensionO8, this.l, ob3Var13, ob3Var14);
            }
            js3.V("onVideoStartListener");
            throw null;
        }
        if (i == HomeVideoListData.l) {
            GraphicUtils$Dimension graphicUtils$DimensionO9 = O();
            ob3 ob3Var15 = this.w;
            if (ob3Var15 == null) {
                js3.V("onVideoListAppClickListener");
                throw null;
            }
            ob3 ob3Var16 = this.x;
            if (ob3Var16 != null) {
                return new hc3(view, graphicUtils$DimensionO9, this.l, ob3Var15, ob3Var16);
            }
            js3.V("onVideoStartListener");
            throw null;
        }
        if (i == AddaxBoxData.c) {
            ob3 ob3Var17 = this.A;
            if (ob3Var17 != null) {
                return new rc(0, ob3Var17, view);
            }
            js3.V("onActionClickListener");
            throw null;
        }
        if (i == AddaxBoxData.d) {
            ob3 ob3Var18 = this.A;
            if (ob3Var18 != null) {
                return new rc(2, ob3Var18, view);
            }
            js3.V("onActionClickListener");
            throw null;
        }
        if (i == AddaxBoxData.e) {
            ob3 ob3Var19 = this.A;
            if (ob3Var19 != null) {
                return new rc(1, ob3Var19, view);
            }
            js3.V("onActionClickListener");
            throw null;
        }
        if (i == HugeBannerData.c) {
            GraphicUtils$Dimension graphicUtils$DimensionO10 = O();
            ob3 ob3Var20 = this.z;
            if (ob3Var20 == null) {
                js3.V("onHugeBannerClickListener");
                throw null;
            }
            qb3 qb3Var = this.y;
            if (qb3Var == null) {
                js3.V("onHugeBannerFastDownloadClickListener");
                throw null;
            }
            xe3 xe3Var = new xe3(view, graphicUtils$DimensionO10, ob3Var20, qb3Var, 0);
            xe3Var.z = (d04) ((w91) qg5.r()).p.get();
            return xe3Var;
        }
        if (i == HugeBannerData.d) {
            GraphicUtils$Dimension graphicUtils$DimensionO11 = O();
            ob3 ob3Var21 = this.z;
            if (ob3Var21 == null) {
                js3.V("onHugeBannerClickListener");
                throw null;
            }
            qb3 qb3Var2 = this.y;
            if (qb3Var2 == null) {
                js3.V("onHugeBannerFastDownloadClickListener");
                throw null;
            }
            xe3 xe3Var2 = new xe3(view, graphicUtils$DimensionO11, ob3Var21, qb3Var2, 1);
            xe3Var2.z = (d04) ((w91) qg5.r()).p.get();
            return xe3Var2;
        }
        if (i == HomeBannerAppsData.j) {
            GraphicUtils$Dimension graphicUtils$DimensionO12 = O();
            ob3 ob3Var22 = this.E;
            if (ob3Var22 == null) {
                js3.V("onHomeBannerAppClickListener");
                throw null;
            }
            pb3 pb3Var4 = this.G;
            if (pb3Var4 != null) {
                return new cb3(view, graphicUtils$DimensionO12, this.l, ob3Var22, pb3Var4);
            }
            js3.V("onHomeInnerBannerFastDownloadClickListener");
            throw null;
        }
        if (i == HomeBannerAppsData.l) {
            GraphicUtils$Dimension graphicUtils$DimensionO13 = O();
            ob3 ob3Var23 = this.E;
            if (ob3Var23 != null) {
                return new bb3(view, graphicUtils$DimensionO13, z, ob3Var23);
            }
            js3.V("onHomeBannerAppClickListener");
            throw null;
        }
        if (i == HomeBannerAppsData.k) {
            GraphicUtils$Dimension graphicUtils$DimensionO14 = O();
            ob3 ob3Var24 = this.F;
            if (ob3Var24 == null) {
                js3.V("onHomeOuterBannerAppBannerClickListener");
                throw null;
            }
            qb3 qb3Var3 = this.H;
            if (qb3Var3 == null) {
                js3.V("onHomeOuterBannerFastDownloadClickListener");
                throw null;
            }
            ob3 ob3Var25 = this.I;
            if (ob3Var25 != null) {
                return new db3(qb3Var3, ob3Var24, ob3Var25, view, graphicUtils$DimensionO14, this.l);
            }
            js3.V("onHomeOuterBannerAppClickListener");
            throw null;
        }
        if (i == HomeBannerAppsData.m) {
            GraphicUtils$Dimension graphicUtils$DimensionO15 = O();
            ob3 ob3Var26 = this.F;
            if (ob3Var26 == null) {
                js3.V("onHomeOuterBannerAppBannerClickListener");
                throw null;
            }
            ob3 ob3Var27 = this.J;
            if (ob3Var27 != null) {
                return new cb3(view, graphicUtils$DimensionO15, this.l, ob3Var26, ob3Var27);
            }
            js3.V("onHomeOuterBannerAppDigestedClickListener");
            throw null;
        }
        if (i == HomeBannerAppsData.n) {
            GraphicUtils$Dimension graphicUtils$DimensionO16 = O();
            ob3 ob3Var28 = this.F;
            if (ob3Var28 == null) {
                js3.V("onHomeOuterBannerAppBannerClickListener");
                throw null;
            }
            qb3 qb3Var4 = this.H;
            if (qb3Var4 == null) {
                js3.V("onHomeOuterBannerFastDownloadClickListener");
                throw null;
            }
            ob3 ob3Var29 = this.I;
            if (ob3Var29 != null) {
                return new db3(qb3Var4, ob3Var28, ob3Var29, view, graphicUtils$DimensionO16, this.l);
            }
            js3.V("onHomeOuterBannerAppClickListener");
            throw null;
        }
        if (i == HomeBannerAppsData.o) {
            GraphicUtils$Dimension graphicUtils$DimensionO17 = O();
            ob3 ob3Var30 = this.E;
            if (ob3Var30 == null) {
                js3.V("onHomeBannerAppClickListener");
                throw null;
            }
            pb3 pb3Var5 = this.G;
            if (pb3Var5 != null) {
                return new cb3(view, graphicUtils$DimensionO17, this.l, ob3Var30, pb3Var5);
            }
            js3.V("onHomeInnerBannerFastDownloadClickListener");
            throw null;
        }
        if (i == HomeBannerAppsData.p) {
            GraphicUtils$Dimension graphicUtils$DimensionO18 = O();
            ob3 ob3Var31 = this.F;
            if (ob3Var31 == null) {
                js3.V("onHomeOuterBannerAppBannerClickListener");
                throw null;
            }
            ob3 ob3Var32 = this.I;
            if (ob3Var32 != null) {
                return new cb3(view, graphicUtils$DimensionO18, this.l, ob3Var31, ob3Var32);
            }
            js3.V("onHomeOuterBannerAppClickListener");
            throw null;
        }
        if (i == HomeBannerAppsData.q) {
            GraphicUtils$Dimension graphicUtils$DimensionO19 = O();
            ob3 ob3Var33 = this.E;
            if (ob3Var33 != null) {
                return new bb3(view, graphicUtils$DimensionO19, z, ob3Var33);
            }
            js3.V("onHomeBannerAppClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.s) {
            GraphicUtils$Dimension graphicUtils$DimensionO20 = O();
            ob3 ob3Var34 = this.N;
            if (ob3Var34 == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            ob3 ob3Var35 = this.O;
            if (ob3Var35 != null) {
                return new p35(view, graphicUtils$DimensionO20, this.l, ob3Var34, ob3Var35);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.u) {
            GraphicUtils$Dimension graphicUtils$DimensionO21 = O();
            ob3 ob3Var36 = this.N;
            if (ob3Var36 == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            ob3 ob3Var37 = this.O;
            if (ob3Var37 != null) {
                return new q35(view, graphicUtils$DimensionO21, this.l, ob3Var36, ob3Var37);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.t) {
            GraphicUtils$Dimension graphicUtils$DimensionO22 = O();
            ob3 ob3Var38 = this.N;
            if (ob3Var38 == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            ob3 ob3Var39 = this.O;
            if (ob3Var39 != null) {
                return new r35(view, graphicUtils$DimensionO22, this.l, ob3Var38, ob3Var39);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeMoviesRowData.v) {
            GraphicUtils$Dimension graphicUtils$DimensionO23 = O();
            ob3 ob3Var40 = this.N;
            if (ob3Var40 == null) {
                js3.V("onMoviesMoreClickListener");
                throw null;
            }
            ob3 ob3Var41 = this.O;
            if (ob3Var41 != null) {
                return new ir.mservices.market.movie.ui.home.recycler.a(view, graphicUtils$DimensionO23, this.l, ob3Var40, ob3Var41);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.q) {
            i35 i35Var = new i35(view, O(), z);
            ob3 ob3Var42 = this.Q;
            if (ob3Var42 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            i35Var.L = ob3Var42;
            ob3 ob3Var43 = this.P;
            if (ob3Var43 != null) {
                i35Var.K = ob3Var43;
                return i35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.s) {
            j35 j35Var = new j35(view, O(), z);
            ob3 ob3Var44 = this.Q;
            if (ob3Var44 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            j35Var.L = ob3Var44;
            ob3 ob3Var45 = this.P;
            if (ob3Var45 != null) {
                j35Var.K = ob3Var45;
                return j35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i != MovieHomeBannersRowData.r) {
            return null;
        }
        k35 k35Var = new k35(view, O(), z);
        ob3 ob3Var46 = this.Q;
        if (ob3Var46 == null) {
            js3.V("onBannersItemClickListener");
            throw null;
        }
        k35Var.L = ob3Var46;
        ob3 ob3Var47 = this.P;
        if (ob3Var47 != null) {
            k35Var.K = ob3Var47;
            return k35Var;
        }
        js3.V("onBannersMoreClickListener");
        throw null;
    }

    public final GraphicUtils$Dimension O() {
        GraphicUtils$Dimension graphicUtils$Dimension = this.p;
        if (graphicUtils$Dimension != null) {
            return graphicUtils$Dimension;
        }
        js3.V("dimension");
        throw null;
    }

    public final og5 P() {
        ob3 ob3Var = this.u;
        if (ob3Var != null) {
            return ob3Var;
        }
        js3.V("onCardAppClickListener");
        throw null;
    }

    public final og5 Q() {
        ob3 ob3Var = this.q;
        if (ob3Var != null) {
            return ob3Var;
        }
        js3.V("onHomeAppClickListener");
        throw null;
    }

    public final s82 R() {
        qb3 qb3Var = this.o;
        if (qb3Var != null) {
            return qb3Var;
        }
        js3.V("onHomeFastDownloadClickListener");
        throw null;
    }

    public final og5 S() {
        ob3 ob3Var = this.v;
        if (ob3Var != null) {
            return ob3Var;
        }
        js3.V("onNewCardAppClickListener");
        throw null;
    }

    public final og5 T() {
        ob3 ob3Var = this.L;
        if (ob3Var != null) {
            return ob3Var;
        }
        js3.V("onScreenshotClickListener");
        throw null;
    }

    public final og5 U() {
        ob3 ob3Var = this.M;
        if (ob3Var != null) {
            return ob3Var;
        }
        js3.V("onVideoShotClickListener");
        throw null;
    }
}
