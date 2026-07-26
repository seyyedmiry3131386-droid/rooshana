package ir.mservices.market.app.detail.subReviews;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bt5;
import defpackage.by4;
import defpackage.c24;
import defpackage.d16;
import defpackage.de;
import defpackage.dp3;
import defpackage.dt;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.f88;
import defpackage.fw0;
import defpackage.g27;
import defpackage.ht;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lw;
import defpackage.lw8;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qj8;
import defpackage.ql4;
import defpackage.rn8;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.v48;
import defpackage.x79;
import defpackage.y97;
import defpackage.yd5;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.app.detail.reivews.recycler.OwnReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.b;
import ir.mservices.market.app.detail.reivews.recycler.c;
import ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment;
import ir.mservices.market.app.detail.subReviews.recycler.SubReviewData;
import ir.mservices.market.appDetail.SingleActionToolbarView;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.LikeOrDislikeData;
import ir.mservices.market.common.comment.data.ReplyReviewData;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myReview.common.MyReviewType;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.BuzzProgressImageView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSubReviewsFragment extends Hilt_AppSubReviewsFragment {
    public static final /* synthetic */ int q1 = 0;
    public dp3 i1;
    public lw8 j1;
    public fw0 k1;
    public final o79 l1;
    public final bi5 m1;
    public SingleActionToolbarView n1;
    public by4 o1;
    public final ql4 p1;

    public AppSubReviewsFragment() {
        final AppSubReviewsFragment$special$$inlined$viewModels$default$1 appSubReviewsFragment$special$$inlined$viewModels$default$1 = new AppSubReviewsFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) appSubReviewsFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l1 = new o79(g27.a(AppSubReviewsViewModel.class), new bp2() { // from class: ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        this.m1 = new bi5(g27.a(ht.class), new de(7, this));
        this.p1 = new ql4(6, this);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        v48 v48Var;
        ReviewDto reviewDto;
        by4 by4Var;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(U1()) && (by4Var = this.o1) != null) {
            by4Var.a(bundle);
        }
        if (str.equalsIgnoreCase(V1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_SURVEY".equalsIgnoreCase(str2)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult == DialogResult.a) {
                    AppSubReviewsViewModel appSubReviewsViewModelR1 = R1();
                    lw.c(appSubReviewsViewModelR1.v.a, null);
                    bt2.G(y97.G(appSubReviewsViewModelR1), null, null, new AppSubReviewsViewModel$getAppQuestions$1(appSubReviewsViewModelR1, null), 3);
                    return;
                } else {
                    if (dialogResult == DialogResult.b) {
                        AppSubReviewsViewModel appSubReviewsViewModelR12 = R1();
                        bt2.G(y97.G(appSubReviewsViewModelR12), null, null, new AppSubReviewsViewModel$cancelQuestion$1(appSubReviewsViewModelR12, null), 3);
                        return;
                    }
                    return;
                }
            }
            if (!"DIALOG_KEY_ALERT_EDIT_RATE".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_MORE_REVIEW".equalsIgnoreCase(str2)) {
                    if (dialogDataModel.d != DialogResult.a) {
                        dw1.y("sub_review_write_more_review_cancel");
                        return;
                    }
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("sub_review_write_more_review");
                    clickEventBuilder.a();
                    MyReviewType[] myReviewTypeArr = MyReviewType.c;
                    pk5.g(this.J0, new NavIntentDirections.MyReview(new yd5(0)), -1);
                    return;
                }
                return;
            }
            DialogResult dialogResult2 = dialogDataModel.d;
            if (dialogResult2 != DialogResult.a) {
                if (dialogResult2 == DialogResult.b) {
                    T1();
                    ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                    clickEventBuilder2.b("review_edit_cancel");
                    clickEventBuilder2.a();
                    return;
                }
                return;
            }
            OwnReviewData ownReviewData = (OwnReviewData) dt2.s(dialogDataModel.c, "BUNDLE_KEY_DATA", OwnReviewData.class);
            if (ownReviewData != null && (v48Var = ownReviewData.b) != null && (reviewDto = (ReviewDto) v48Var.getValue()) != null) {
                Q1(reviewDto);
            }
            T1();
            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
            clickEventBuilder3.b("review_edit_ok");
            clickEventBuilder3.a();
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_sub_reviews);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        String id = S1().f;
        if ((id == null || id.length() == 0) && S1().b != null) {
            ReviewDto reviewDto = S1().b;
            id = reviewDto != null ? reviewDto.getId() : null;
        }
        if (f88.n0(S1().a) || id == null || id.length() == 0) {
            return null;
        }
        return dw1.o("Sub Review for PackageName: ", S1().a, ", and ReviewId: ", id);
    }

    public final void Q1(ReviewDto reviewDto) {
        CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(S1().a, reviewDto.getRate(), reviewDto.getComment(), reviewDto.isHasSubComment(), false, S1().c, "_all_reviews", "ALLSUBREVIEW"));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            pk5.c(fragmentActivityF, submitReview);
        }
    }

    public final AppSubReviewsViewModel R1() {
        return (AppSubReviewsViewModel) this.l1.getValue();
    }

    public final ht S1() {
        return (ht) this.m1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        Window window;
        super.T(bundle);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            rn8Var.z(this.n1);
        }
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null && (window = fragmentActivityF.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        y1().setOnCreateContextMenuListener(this);
        by4 by4Var = new by4(S1().a, F(), U1(), this.p1);
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
        dt dtVar = aVar instanceof dt ? (dt) aVar : null;
        if (dtVar != null) {
            dtVar.l = by4Var;
        }
        this.o1 = by4Var;
    }

    public final fw0 T1() {
        fw0 fw0Var = this.k1;
        if (fw0Var != null) {
            return fw0Var;
        }
        js3.V("commentAnalytics");
        throw null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    public final String U1() {
        return t61.i(V1(), "_DIALOG_KEY_MORE_MENU");
    }

    public final String V1() {
        return dw1.n("AppSubReviewsFragment_", this.H0);
    }

    public final void W1(String str, ReviewDto reviewDto, boolean z) {
        CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), z));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            pk5.c(fragmentActivityF, likeOrDislikeReview);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        Window window;
        this.J0.x(U1());
        this.J0.x(V1());
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null && (window = fragmentActivityF.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        if (this.j1 == null) {
            js3.V("uiUtils");
            throw null;
        }
        lw8.b(F());
        this.o1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ft] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ft] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        dt dtVar = new dt(1);
        final int i = 2;
        dtVar.m = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i2 = i;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i2) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i3 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i4 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i5 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i6 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i7 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i8 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i2 = 3;
        dtVar.n = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i2;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i3 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i4 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i5 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i6 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i7 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i8 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i3 = 4;
        dtVar.o = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i3;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i4 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i5 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i6 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i7 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i8 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i4 = 5;
        dtVar.p = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i4;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i42 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i5 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i6 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i7 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i8 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i5 = 6;
        dtVar.q = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i5;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i42 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i52 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i6 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i7 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i8 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i6 = 7;
        dtVar.r = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i6;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i42 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i52 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i62 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i7 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i8 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i7 = 8;
        dtVar.s = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i7;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i42 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i52 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i62 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i72 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i8 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i8 = 9;
        dtVar.t = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i8;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i42 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i52 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i62 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i72 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i82 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i9 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i9 = 0;
        dtVar.u = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i9;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i42 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i52 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i62 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i72 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i82 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i92 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i10 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        dtVar.v = new og5(this) { // from class: ft
            public final /* synthetic */ AppSubReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReviewDto reviewDto;
                ReviewDto reviewDto2;
                int i22 = i10;
                AppSubReviewsFragment appSubReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        OwnReviewData ownReviewData = (OwnReviewData) obj;
                        int i32 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData, "recyclerData");
                        String str = ownReviewData.a;
                        if (((BuzzProgressImageView) view).a() && str != null && (reviewDto = (ReviewDto) ownReviewData.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str, reviewDto, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str, ownReviewData.d);
                        break;
                    case 1:
                        OwnReviewData ownReviewData2 = (OwnReviewData) obj;
                        int i42 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData2, "recyclerData");
                        String str2 = ownReviewData2.a;
                        if (((BuzzProgressImageView) view).a() && str2 != null && (reviewDto2 = (ReviewDto) ownReviewData2.b.getValue()) != null) {
                            appSubReviewsFragment.W1(str2, reviewDto2, false);
                        }
                        appSubReviewsFragment.T1().a("_detail", str2, ownReviewData2.d);
                        break;
                    case 2:
                        SubReviewData subReviewData = (SubReviewData) obj;
                        int i52 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData, "recyclerData");
                        String str3 = subReviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str3, subReviewData.a, true);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str3) ? "review_like_review_installed_user" : "review_like_review_not_installed_user");
                        break;
                    case 3:
                        SubReviewData subReviewData2 = (SubReviewData) obj;
                        int i62 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData2, "recyclerData");
                        String str4 = subReviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str4, subReviewData2.a, false);
                        }
                        dw1.y(appSubReviewsFragment.T1().a.G(str4) ? "review_dislike_review_installed_user" : "review_dislike_review_not_installed_user");
                        break;
                    case 4:
                        SubReviewData subReviewData3 = (SubReviewData) obj;
                        int i72 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.app.detail.subReviews.recycler.b) qg5Var, "<unused var>");
                        js3.p(subReviewData3, "recyclerData");
                        ReviewDto reviewDto3 = subReviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.d);
                        break;
                    case 5:
                        ReviewData reviewData = (ReviewData) obj;
                        int i82 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str5 = reviewData.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str5, reviewData.a, false);
                        }
                        appSubReviewsFragment.T1().a("_review", str5, js3.i(reviewData.g, Boolean.TRUE));
                        break;
                    case 6:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i92 = AppSubReviewsFragment.q1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str6 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            appSubReviewsFragment.W1(str6, reviewData2.a, true);
                        }
                        appSubReviewsFragment.T1().b("_review", str6, js3.i(reviewData2.g, Boolean.TRUE));
                        break;
                    case 7:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i102 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto4 = reviewData3.a;
                        pk5.e(appSubReviewsFragment.F(), reviewDto4.getAccountKey(), reviewDto4.getNickname(), UserProfileRefId.d);
                        break;
                    case 8:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i11 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        String str7 = reviewData4.b;
                        ReviewDto reviewDto5 = reviewData4.a;
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_review", str7, reviewDto5.getId(), reviewDto5));
                        FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                        if (fragmentActivityF != null) {
                            pk5.c(fragmentActivityF, replyReview);
                        }
                        break;
                    default:
                        OwnReviewData ownReviewData3 = (OwnReviewData) obj;
                        int i12 = AppSubReviewsFragment.q1;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(ownReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_edit_review");
                        clickEventBuilder.a();
                        v48 v48Var = ownReviewData3.b;
                        ReviewDto reviewDto6 = (ReviewDto) v48Var.getValue();
                        if (reviewDto6 != null && reviewDto6.isHasSubComment()) {
                            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_ALERT_EDIT_RATE", is3.g(new Pair("BUNDLE_KEY_DATA", ownReviewData3)), 8), null, appSubReviewsFragment.L(rs6.show_edit_confirm), appSubReviewsFragment.L(rs6.edit_rate), appSubReviewsFragment.L(rs6.button_cancel), true)), -1);
                        } else {
                            ReviewDto reviewDto7 = (ReviewDto) v48Var.getValue();
                            if (reviewDto7 != null) {
                                appSubReviewsFragment.Q1(reviewDto7);
                            }
                        }
                        break;
                }
            }
        };
        return dtVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        SingleActionToolbarView singleActionToolbarView;
        js3.p(view, "view");
        super.k0(view, bundle);
        FragmentActivity fragmentActivityF = F();
        AttributeSet attributeSet = null;
        if (fragmentActivityF != null) {
            singleActionToolbarView = new SingleActionToolbarView(fragmentActivityF, attributeSet, 6, 0);
            singleActionToolbarView.setVisibility(8);
            singleActionToolbarView.setBackgroundColor(sj8.b().l);
        } else {
            singleActionToolbarView = null;
        }
        this.n1 = singleActionToolbarView;
        this.J0.d(V1(), this);
        this.J0.d(U1(), this);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppSubReviewsFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new AppSubReviewsFragment$onViewCreated$2(this, null));
    }

    @Override // androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        this.H = true;
        if (this.n1 == null) {
            bt5 bt5VarF = F();
            rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
            if (rn8Var != null) {
                ((BaseContentActivity) rn8Var).c0(L(rs6.all_sub_review_title));
                return;
            }
            return;
        }
        dp3 dp3Var = this.i1;
        if (dp3Var == null) {
            js3.V("installManager");
            throw null;
        }
        boolean zG = dp3Var.G(S1().a);
        SingleActionToolbarView singleActionToolbarView = this.n1;
        if (singleActionToolbarView != null) {
            singleActionToolbarView.setVisibility(0);
            String strL = L(rs6.all_sub_review_title);
            js3.o(strL, "getString(...)");
            singleActionToolbarView.setPageTitle(strL);
            singleActionToolbarView.setButtonVisibility(zG);
            singleActionToolbarView.setButtonText(L(rs6.send_reply));
            final int i = 0;
            singleActionToolbarView.setBackClickListener(new View.OnClickListener(this) { // from class: et
                public final /* synthetic */ AppSubReviewsFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ws5 ws5VarC;
                    int i2 = i;
                    AppSubReviewsFragment appSubReviewsFragment = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = AppSubReviewsFragment.q1;
                            FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                            if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                                ws5VarC.b();
                                break;
                            }
                            break;
                        default:
                            int i4 = AppSubReviewsFragment.q1;
                            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                            clickEventBuilder.b("review_reply_action_bar");
                            clickEventBuilder.a();
                            String str = appSubReviewsFragment.S1().d;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = appSubReviewsFragment.S1().a;
                            String str3 = appSubReviewsFragment.S1().f;
                            CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData(str, str2, str3 != null ? str3 : "", appSubReviewsFragment.S1().b));
                            FragmentActivity fragmentActivityF2 = appSubReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, replyReview);
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            singleActionToolbarView.setButtonClickListener(new View.OnClickListener(this) { // from class: et
                public final /* synthetic */ AppSubReviewsFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ws5 ws5VarC;
                    int i22 = i2;
                    AppSubReviewsFragment appSubReviewsFragment = this.b;
                    switch (i22) {
                        case 0:
                            int i3 = AppSubReviewsFragment.q1;
                            FragmentActivity fragmentActivityF = appSubReviewsFragment.F();
                            if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                                ws5VarC.b();
                                break;
                            }
                            break;
                        default:
                            int i4 = AppSubReviewsFragment.q1;
                            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                            clickEventBuilder.b("review_reply_action_bar");
                            clickEventBuilder.a();
                            String str = appSubReviewsFragment.S1().d;
                            if (str == null) {
                                str = "";
                            }
                            String str2 = appSubReviewsFragment.S1().a;
                            String str3 = appSubReviewsFragment.S1().f;
                            CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData(str, str2, str3 != null ? str3 : "", appSubReviewsFragment.S1().b));
                            FragmentActivity fragmentActivityF2 = appSubReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, replyReview);
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.viewModel.c l1() {
        return R1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment
    public void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        super.onEvent(qj8Var);
        SingleActionToolbarView singleActionToolbarView = this.n1;
        if (singleActionToolbarView != null) {
            singleActionToolbarView.setBackgroundColor(sj8.b().l);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return -1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        int dimensionPixelOffset = K().getDimensionPixelOffset(pq6.horizontal_space_inner) + K().getDimensionPixelOffset(pq6.horizontal_space_outer);
        return new d16(K().getDimensionPixelSize(pq6.space_8), K().getDimensionPixelSize(pq6.space_16), dimensionPixelOffset, dimensionPixelOffset, 0, 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
