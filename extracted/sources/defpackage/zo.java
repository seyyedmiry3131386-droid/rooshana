package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.o;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.developer.ui.recycler.DeveloperTitleRowData;
import ir.mservices.market.app.detail.reivews.recycler.AIReviewSummaryData;
import ir.mservices.market.app.detail.reivews.recycler.OwnReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewHeaderData;
import ir.mservices.market.app.detail.ui.recycler.AppBarData;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsData;
import ir.mservices.market.app.detail.ui.recycler.AppMoreDescriptionData;
import ir.mservices.market.app.detail.ui.recycler.AppMyketSocialData;
import ir.mservices.market.app.detail.ui.recycler.AppRatingModuleData;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotListData;
import ir.mservices.market.app.detail.ui.recycler.CommentMoreData;
import ir.mservices.market.app.detail.ui.recycler.LocalMessageBoxData;
import ir.mservices.market.app.detail.ui.recycler.MessageBoxData;
import ir.mservices.market.app.detail.ui.recycler.ReviewEmptyData;
import ir.mservices.market.app.detail.ui.recycler.ReviewsMoreTitleRowData;
import ir.mservices.market.app.detail.ui.recycler.b;
import ir.mservices.market.app.detail.ui.recycler.c;
import ir.mservices.market.app.detail.ui.recycler.d;
import ir.mservices.market.app.detail.ui.recycler.e;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.ui.detail.recycler.HorizontalSummaryData;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zo extends a {
    public cp A;
    public ap B;
    public ap C;
    public ap D;
    public ap E;
    public ap F;
    public ap G;
    public en H;
    public ap I;
    public ap J;
    public ap K;
    public ap L;
    public ap M;
    public ap N;
    public ap O;
    public ap P;
    public ap Q;
    public ap R;
    public ap S;
    public by4 T;
    public ap U;
    public ap V;
    public ap W;
    public ap X;
    public ap Y;
    public ap Z;
    public cp a0;
    public ap b0;
    public cp c0;
    public cp d0;
    public cp e0;
    public cp f0;
    public cp g0;
    public cp h0;
    public cp i0;
    public final GraphicUtils$Dimension l;
    public final boolean m;
    public final boolean n;
    public ap o;
    public ap p;
    public pt2 q;
    public cp r;
    public ap s;
    public ap t;
    public ap u;
    public cp v;
    public cp w;
    public cp x;
    public en y;
    public cp z;

    public zo(GraphicUtils$Dimension graphicUtils$Dimension, int i, boolean z, boolean z2) {
        super(i);
        this.l = graphicUtils$Dimension;
        this.m = z;
        this.n = z2;
        sj8.b();
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == AppBarData.j) {
            cp cpVar = this.r;
            if (cpVar == null) {
                js3.V("onIconClickListener");
                throw null;
            }
            cp cpVar2 = this.c0;
            if (cpVar2 == null) {
                js3.V("onAppSummaryTextClickListener");
                throw null;
            }
            cp cpVar3 = this.d0;
            if (cpVar3 == null) {
                js3.V("onAppSummaryIconClickListener");
                throw null;
            }
            cp cpVar4 = this.e0;
            if (cpVar4 == null) {
                js3.V("onAppSummaryRateClickListener");
                throw null;
            }
            cp cpVar5 = this.f0;
            if (cpVar5 != null) {
                return new ir.mservices.market.app.detail.ui.recycler.a(view, this.l, this.m, cpVar, cpVar2, cpVar3, cpVar4, cpVar5);
            }
            js3.V("onAppSummarySizeClickListener");
            throw null;
        }
        if (i == HorizontalSummaryData.i) {
            cp cpVar6 = this.c0;
            if (cpVar6 == null) {
                js3.V("onAppSummaryTextClickListener");
                throw null;
            }
            cp cpVar7 = this.d0;
            if (cpVar7 == null) {
                js3.V("onAppSummaryIconClickListener");
                throw null;
            }
            cp cpVar8 = this.e0;
            if (cpVar8 == null) {
                js3.V("onAppSummaryRateClickListener");
                throw null;
            }
            cp cpVar9 = this.f0;
            if (cpVar9 != null) {
                return new wc3(view, this.l, this.m, cpVar6, cpVar7, cpVar8, cpVar9);
            }
            js3.V("onAppSummarySizeClickListener");
            throw null;
        }
        if (i == AppDownloadData.q) {
            ap apVar = this.t;
            if (apVar == null) {
                js3.V("onDownloadClickListener");
                throw null;
            }
            ap apVar2 = this.u;
            if (apVar2 == null) {
                js3.V("onPauseClickListener");
                throw null;
            }
            cp cpVar10 = this.v;
            if (cpVar10 == null) {
                js3.V("onInstallClickListener");
                throw null;
            }
            cp cpVar11 = this.w;
            if (cpVar11 == null) {
                js3.V("onUpdateClickListener");
                throw null;
            }
            cp cpVar12 = this.x;
            if (cpVar12 == null) {
                js3.V("onRunClickListener");
                throw null;
            }
            en enVar = this.y;
            if (enVar == null) {
                js3.V("onIncompatibleClickListener");
                throw null;
            }
            ap apVar3 = this.M;
            if (apVar3 != null) {
                return new b(view, apVar, apVar2, cpVar10, cpVar11, cpVar12, enVar, apVar3);
            }
            js3.V("onButtonStateListener");
            throw null;
        }
        if (i == MessageBoxData.c) {
            ap apVar4 = this.s;
            if (apVar4 != null) {
                return new av4(view, apVar4);
            }
            js3.V("onItemClickListener");
            throw null;
        }
        if (i == LocalMessageBoxData.d) {
            return new l5(10, view);
        }
        if (i == AppMoreDescriptionData.f) {
            cp cpVar13 = this.z;
            if (cpVar13 != null) {
                return new ar(view, cpVar13);
            }
            js3.V("onMoreDescriptionClickListener");
            throw null;
        }
        if (i == AddaxBoxData.c) {
            cp cpVar14 = this.A;
            if (cpVar14 != null) {
                return new rc(0, cpVar14, view);
            }
            js3.V("onAddaxClickListener");
            throw null;
        }
        if (i == AddaxBoxData.d) {
            cp cpVar15 = this.A;
            if (cpVar15 != null) {
                return new rc(2, cpVar15, view);
            }
            js3.V("onAddaxClickListener");
            throw null;
        }
        if (i == AddaxBoxData.e) {
            cp cpVar16 = this.A;
            if (cpVar16 != null) {
                return new rc(1, cpVar16, view);
            }
            js3.V("onAddaxClickListener");
            throw null;
        }
        if (i == HomeMoreTitleRowData.j) {
            ap apVar5 = this.E;
            if (apVar5 != null) {
                return new tb3(0, apVar5, view);
            }
            js3.V("onHomeMoreClickListener");
            throw null;
        }
        if (i == HomeAppsRowData.m) {
            return new ta3(view, this.l, this.m, O(), Q(), P(), 7);
        }
        if (i == HomeAppsRowData.n) {
            return new ta3(view, this.l, this.m, O(), Q(), P(), 6);
        }
        if (i == HomeAppsRowData.q) {
            return new ta3(view, this.l, P(), this.m, O(), Q(), 1);
        }
        if (i == HomeAppsRowData.r) {
            return new sa3(view, this.l, this.m, O(), Q(), 2);
        }
        if (i == HomeAppsRowData.s) {
            return new ta3(view, this.l, P(), this.m, O(), Q(), 0);
        }
        if (i == HomeAppsRowData.t) {
            return new sa3(view, this.l, this.m, O(), Q(), 3);
        }
        int i2 = HomeAppsRowData.o;
        boolean z = this.m;
        GraphicUtils$Dimension graphicUtils$Dimension = this.l;
        if (i == i2) {
            ap apVar6 = this.D;
            if (apVar6 != null) {
                return new sa3(view, graphicUtils$Dimension, z, apVar6, 1);
            }
            js3.V("onAppDigestedClickListener");
            throw null;
        }
        if (i == HomeAppsRowData.p) {
            ap apVar7 = this.D;
            if (apVar7 != null) {
                return new sa3(view, graphicUtils$Dimension, z, apVar7, 0);
            }
            js3.V("onAppDigestedClickListener");
            throw null;
        }
        if (i == HomeAppsRowData.u) {
            return new ta3(view, this.l, P(), this.m, O(), Q(), 5);
        }
        if (i == HomeAppsRowData.v) {
            return new sa3(view, this.l, this.m, O(), Q(), 6);
        }
        if (i == HomeAppsRowData.w) {
            return new ta3(view, this.l, P(), this.m, O(), Q(), 4);
        }
        if (i == HomeAppsRowData.x) {
            return new sa3(view, this.l, this.m, O(), Q(), 7);
        }
        if (i == HomeAppsRowData.y) {
            return new ta3(view, this.l, P(), this.m, O(), Q(), 3);
        }
        if (i == HomeAppsRowData.z) {
            return new sa3(view, this.l, this.m, O(), Q(), 4);
        }
        if (i == HomeAppsRowData.A) {
            return new ta3(view, this.l, P(), this.m, O(), Q(), 2);
        }
        if (i == HomeAppsRowData.B) {
            return new sa3(view, this.l, this.m, O(), Q(), 5);
        }
        if (i == AppScreenshotListData.d) {
            ap apVar8 = this.F;
            if (apVar8 == null) {
                js3.V("onScreenshotClickListener");
                throw null;
            }
            ap apVar9 = this.G;
            if (apVar9 != null) {
                return new e(view, graphicUtils$Dimension, apVar8, apVar9);
            }
            js3.V("onVideoShotClickListener");
            throw null;
        }
        if (i == AppHorizontalTagsData.c) {
            en enVar2 = this.H;
            if (enVar2 != null) {
                return new c(view, enVar2);
            }
            js3.V("onTagClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.q) {
            i35 i35Var = new i35(view, graphicUtils$Dimension, z);
            ap apVar10 = this.I;
            if (apVar10 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            i35Var.L = apVar10;
            ap apVar11 = this.J;
            if (apVar11 != null) {
                i35Var.K = apVar11;
                return i35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.s) {
            j35 j35Var = new j35(view, graphicUtils$Dimension, z);
            ap apVar12 = this.I;
            if (apVar12 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            j35Var.L = apVar12;
            ap apVar13 = this.J;
            if (apVar13 != null) {
                j35Var.K = apVar13;
                return j35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i == MovieHomeBannersRowData.r) {
            k35 k35Var = new k35(view, graphicUtils$Dimension, z);
            ap apVar14 = this.I;
            if (apVar14 == null) {
                js3.V("onBannersItemClickListener");
                throw null;
            }
            k35Var.L = apVar14;
            ap apVar15 = this.J;
            if (apVar15 != null) {
                k35Var.K = apVar15;
                return k35Var;
            }
            js3.V("onBannersMoreClickListener");
            throw null;
        }
        if (i == AppMyketSocialData.a) {
            ap apVar16 = this.K;
            if (apVar16 == null) {
                js3.V("onInstagramClickListener");
                throw null;
            }
            ap apVar17 = this.L;
            if (apVar17 != null) {
                return new br(view, apVar16, apVar17);
            }
            js3.V("onTelegramClickListener");
            throw null;
        }
        if (i == ExtHeaderRowData.l) {
            ap apVar18 = this.b0;
            if (apVar18 != null) {
                return new x62(view, this.l, this.m, null, apVar18);
            }
            js3.V("onShimmerHeaderClickListener");
            throw null;
        }
        if (i == DividerData.k) {
            return new oq1(view);
        }
        if (i == DeveloperTitleRowData.c) {
            ap apVar19 = this.p;
            if (apVar19 != null) {
                return new sl1(view, apVar19);
            }
            js3.V("onMoreDeveloperInfoClickListener");
            throw null;
        }
        if (i == AppDeveloperInfoModuleData.b) {
            ap apVar20 = this.o;
            if (apVar20 != null) {
                return new aq(view, apVar20);
            }
            js3.V("onDeveloperInfoClickListener");
            throw null;
        }
        if (i == ReviewsMoreTitleRowData.e) {
            ap apVar21 = this.N;
            if (apVar21 != null) {
                return new f97(view, apVar21);
            }
            js3.V("onReviewTitleClickListener");
            throw null;
        }
        if (i == ReviewHeaderData.i) {
            ap apVar22 = this.O;
            if (apVar22 == null) {
                js3.V("onReviewHeaderClickListener");
                throw null;
            }
            v87 v87Var = new v87(view, apVar22, 0);
            v87Var.y = (lw8) ((w91) qg5.r()).E.get();
            return v87Var;
        }
        if (i == OwnReviewData.i) {
            ap apVar23 = this.P;
            if (apVar23 == null) {
                js3.V("onEditClickListener");
                throw null;
            }
            ap apVar24 = this.Q;
            if (apVar24 == null) {
                js3.V("onSubReviewClickListener");
                throw null;
            }
            ap apVar25 = this.R;
            if (apVar25 == null) {
                js3.V("onDeveloperLikeClickListener");
                throw null;
            }
            ap apVar26 = this.S;
            if (apVar26 != null) {
                return new ir.mservices.market.app.detail.reivews.recycler.b(view, apVar23, apVar24, apVar25, apVar26);
            }
            js3.V("onDeveloperDislikeClickListener");
            throw null;
        }
        if (i == ReviewData.j) {
            by4 by4Var = this.T;
            if (by4Var == null) {
                js3.V("onMenuListener");
                throw null;
            }
            ap apVar27 = this.U;
            if (apVar27 == null) {
                js3.V("onClickListener");
                throw null;
            }
            ap apVar28 = this.V;
            if (apVar28 == null) {
                js3.V("onReplyClickListener");
                throw null;
            }
            ap apVar29 = this.W;
            if (apVar29 == null) {
                js3.V("onLikeClickListener");
                throw null;
            }
            ap apVar30 = this.X;
            if (apVar30 == null) {
                js3.V("onDislikeClickListener");
                throw null;
            }
            ap apVar31 = this.Y;
            if (apVar31 != null) {
                return new ir.mservices.market.app.detail.reivews.recycler.c(view, by4Var, apVar27, apVar28, apVar29, apVar30, apVar31, null);
            }
            js3.V("onProfileClickListener");
            throw null;
        }
        if (i == AppRatingModuleData.f) {
            cp cpVar17 = this.a0;
            if (cpVar17 != null) {
                return new d(view, cpVar17);
            }
            js3.V("onRatingClickListener");
            throw null;
        }
        if (i == CommentMoreData.b) {
            ap apVar32 = this.Z;
            if (apVar32 != null) {
                return new vw0(view, apVar32);
            }
            js3.V("onReviewMoreClickListener");
            throw null;
        }
        if (i == ReviewEmptyData.b) {
            return new m12(5, view);
        }
        if (i != AIReviewSummaryData.d) {
            return null;
        }
        cp cpVar18 = this.g0;
        if (cpVar18 == null) {
            js3.V("onAILikeClickListener");
            throw null;
        }
        cp cpVar19 = this.h0;
        if (cpVar19 == null) {
            js3.V("onAIDislikeClickListener");
            throw null;
        }
        cp cpVar20 = this.i0;
        if (cpVar20 != null) {
            return new ir.mservices.market.app.detail.reivews.recycler.a(view, cpVar18, cpVar19, cpVar20);
        }
        js3.V("onAIMoreClickListener");
        throw null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final boolean J() {
        return this.n;
    }

    public final og5 O() {
        ap apVar = this.B;
        if (apVar != null) {
            return apVar;
        }
        js3.V("onCardAppClickListener");
        throw null;
    }

    public final s82 P() {
        pt2 pt2Var = this.q;
        if (pt2Var != null) {
            return pt2Var;
        }
        js3.V("onDetailFastDownloadClickListener");
        throw null;
    }

    public final og5 Q() {
        ap apVar = this.C;
        if (apVar != null) {
            return apVar;
        }
        js3.V("onNewCardAppClickListener");
        throw null;
    }

    @Override // androidx.recyclerview.widget.g
    public final void m(o oVar, int i, List list) {
        qg5 qg5Var = (qg5) oVar;
        View view = qg5Var.a;
        js3.p(list, "payloads");
        l(qg5Var, i);
        RecyclerItem recyclerItem = (RecyclerItem) z(i);
        if (recyclerItem != null) {
            MyketRecyclerData myketRecyclerData = recyclerItem.c;
            view.setBackgroundColor(myketRecyclerData instanceof AppBarData ? yq2.n0(view.getContext()) ? sj8.b().l : sj8.b().N : myketRecyclerData instanceof AppMyketSocialData ? sj8.b().p : myketRecyclerData instanceof AppDownloadData ? sj8.b().N : sj8.b().l);
            qg5Var.t(myketRecyclerData);
        }
    }
}
