package ir.mservices.market.app.detail.reivews;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bt5;
import defpackage.by4;
import defpackage.c24;
import defpackage.cd;
import defpackage.d16;
import defpackage.de;
import defpackage.dp3;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fw0;
import defpackage.g27;
import defpackage.ha4;
import defpackage.ht;
import defpackage.ia4;
import defpackage.j71;
import defpackage.ja4;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lw;
import defpackage.ly5;
import defpackage.m88;
import defpackage.o79;
import defpackage.og5;
import defpackage.pj9;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qj8;
import defpackage.qs6;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.u87;
import defpackage.x2;
import defpackage.x79;
import defpackage.y97;
import defpackage.yd5;
import defpackage.yr;
import ir.mservices.market.app.detail.reivews.AppReviewsFragment;
import ir.mservices.market.app.detail.reivews.AppReviewsViewModel;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.c;
import ir.mservices.market.app.detail.ui.recycler.AppRatingModuleData;
import ir.mservices.market.app.detail.ui.recycler.AppTagData;
import ir.mservices.market.app.detail.ui.recycler.d;
import ir.mservices.market.app.detail.ui.recycler.g;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.appDetail.ToolbarData;
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
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.TryAgainView;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class AppReviewsFragment extends Hilt_AppReviewsFragment {
    public static final /* synthetic */ int o1 = 0;
    public fw0 i1;
    public final o79 j1;
    public final bi5 k1;
    public final c24 l1;
    public by4 m1;
    public final pj9 n1;

    public AppReviewsFragment() {
        final AppReviewsFragment$special$$inlined$viewModels$default$1 appReviewsFragment$special$$inlined$viewModels$default$1 = new AppReviewsFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.detail.reivews.AppReviewsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) appReviewsFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(AppReviewsViewModel.class), new bp2() { // from class: ir.mservices.market.app.detail.reivews.AppReviewsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.reivews.AppReviewsFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.detail.reivews.AppReviewsFragment$special$$inlined$viewModels$default$4
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
        this.k1 = new bi5(g27.a(yr.class), new de(6, this));
        this.l1 = kotlin.a.a(new x2(7, this));
        this.n1 = new pj9(this);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(T1())) {
            by4 by4Var = this.m1;
            if (by4Var == null) {
                js3.V("onMenu");
                throw null;
            }
            by4Var.a(bundle);
        }
        if (str.equalsIgnoreCase(U1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if (m88.T(str2, "DIALOG_KEY_SURVEY", true)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult == DialogResult.a) {
                    AppReviewsViewModel appReviewsViewModelQ1 = Q1();
                    lw.c(appReviewsViewModelQ1.B.a, null);
                    bt2.G(y97.G(appReviewsViewModelQ1), null, null, new AppReviewsViewModel$getAppQuestions$1(appReviewsViewModelQ1, null), 3);
                    return;
                } else {
                    if (dialogResult == DialogResult.b) {
                        AppReviewsViewModel appReviewsViewModelQ12 = Q1();
                        bt2.G(y97.G(appReviewsViewModelQ12), null, null, new AppReviewsViewModel$cancelQuestion$1(appReviewsViewModelQ12, null), 3);
                        return;
                    }
                    return;
                }
            }
            if ("DIALOG_KEY_MORE_REVIEW".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d != DialogResult.a) {
                    dw1.y("review_write_more_review_cancel");
                    return;
                }
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("review_write_more_review");
                clickEventBuilder.a();
                MyReviewType[] myReviewTypeArr = MyReviewType.c;
                pk5.g(this.J0, new NavIntentDirections.MyReview(new yd5(0)), -1);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_reviews);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_comment);
        MyketTextView myketTextView = (MyketTextView) view.findViewById(rr6.empty_title);
        if (myketTextView != null) {
            myketTextView.setVisibility(0);
            myketTextView.setText(rs6.any_user_review_title);
        }
        TextView textView = (TextView) view.findViewById(rr6.empty_message);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(rs6.any_user_review_txt);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void L1(ja4 ja4Var) {
        TryAgainView tryAgainViewC1;
        js3.p(ja4Var, "state");
        ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB1 = B1();
        if (extendedSwipeRefreshLayoutB1 != null) {
            extendedSwipeRefreshLayoutB1.setRefreshing(ja4Var.equals(ha4.b));
        }
        ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
        if (aVar != null && ((ArrayList) aVar.D().d).isEmpty()) {
            super.L1(ja4Var);
        } else {
            if (!(ja4Var instanceof ia4) || (tryAgainViewC1 = C1()) == null) {
                return;
            }
            tryAgainViewC1.v();
        }
    }

    public final AppReviewsViewModel Q1() {
        return (AppReviewsViewModel) this.j1.getValue();
    }

    public final yr R1() {
        return (yr) this.k1.getValue();
    }

    public final fw0 S1() {
        fw0 fw0Var = this.i1;
        if (fw0Var != null) {
            return fw0Var;
        }
        js3.V("commentAnalytics");
        throw null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        c24 c24Var = this.l1;
        if (rn8Var != null) {
            rn8Var.z((DetailToolbarView) c24Var.getValue());
        }
        DetailToolbarView detailToolbarView = (DetailToolbarView) c24Var.getValue();
        if (detailToolbarView != null) {
            detailToolbarView.setOnBackClickListener(new cd(1, this));
        }
        y1().setOnCreateContextMenuListener(this);
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            this.m1 = new by4(R1().a, fragmentActivityF, T1(), this.n1);
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.Z0;
            js3.n(aVar, "null cannot be cast to non-null type ir.mservices.market.app.detail.reivews.ReviewDataAdapter");
            u87 u87Var = (u87) aVar;
            by4 by4Var = this.m1;
            if (by4Var != null) {
                u87Var.l = by4Var;
            } else {
                js3.V("onMenu");
                throw null;
            }
        }
    }

    public final String T1() {
        return t61.i(U1(), "_DIALOG_KEY_MORE_MENU");
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    public final String U1() {
        return dw1.n("AppReviewsFragment_", this.H0);
    }

    public final void V1(String str, ReviewDto reviewDto, String str2) {
        pk5.g(this.J0, new NavIntentDirections.AllSubReviews(new ht(str, reviewDto, R1().g, str2, R1().b, reviewDto.getId())), -1);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(U1());
        this.J0.x(T1());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [wr] */
    /* JADX WARN: Type inference failed for: r1v2, types: [wr] */
    /* JADX WARN: Type inference failed for: r1v3, types: [wr] */
    /* JADX WARN: Type inference failed for: r1v4, types: [wr] */
    /* JADX WARN: Type inference failed for: r1v5, types: [wr] */
    /* JADX WARN: Type inference failed for: r1v6, types: [wr] */
    /* JADX WARN: Type inference failed for: r1v7, types: [wr] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        u87 u87Var = new u87(v1());
        final int i = 0;
        u87Var.n = new og5(this) { // from class: wr
            public final /* synthetic */ AppReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Boolean boolIsShowEditConfirm;
                int i2 = i;
                boolean zBooleanValue = false;
                Integer numValueOf = null;
                AppReviewsFragment appReviewsFragment = this.b;
                switch (i2) {
                    case 0:
                        ReviewData reviewData = (ReviewData) obj;
                        int i3 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str = reviewData.b;
                        BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                        if (buzzProgressImageView != null && buzzProgressImageView.a()) {
                            ReviewDto reviewDto = reviewData.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), true));
                            FragmentActivity fragmentActivityF = appReviewsFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, likeOrDislikeReview);
                            }
                        }
                        Boolean bool = reviewData.g;
                        if (bool != null) {
                            appReviewsFragment.S1().b("_all_reviews", str, bool.booleanValue());
                        }
                        break;
                    case 1:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i4 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str2 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            ReviewDto reviewDto2 = reviewData2.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview2 = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str2, reviewDto2.getId(), reviewDto2.getParentId(), false));
                            FragmentActivity fragmentActivityF2 = appReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, likeOrDislikeReview2);
                            }
                        }
                        Boolean bool2 = reviewData2.g;
                        if (bool2 != null) {
                            appReviewsFragment.S1().a("_all_reviews", str2, bool2.booleanValue());
                        }
                        break;
                    case 2:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i5 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto3 = reviewData3.a;
                        pk5.e(appReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.c);
                        break;
                    case 3:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i6 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        ReviewDto reviewDto4 = reviewData4.a;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_reply_reviews");
                        clickEventBuilder.a();
                        AppReviewsViewModel appReviewsViewModelQ1 = appReviewsFragment.Q1();
                        clickEventBuilder.b(!appReviewsViewModelQ1.v.G(appReviewsViewModelQ1.B.a) ? "review_reply_not_installed" : "review_reply_installed");
                        clickEventBuilder.a();
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData4.b, reviewDto4.getId(), reviewDto4));
                        FragmentActivity fragmentActivityF3 = appReviewsFragment.F();
                        if (fragmentActivityF3 != null) {
                            pk5.c(fragmentActivityF3, replyReview);
                        }
                        break;
                    case 4:
                        ReviewData reviewData5 = (ReviewData) obj;
                        int i7 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData5, "recyclerData");
                        ReviewDto reviewDto5 = reviewData5.a;
                        String str3 = reviewData5.b;
                        if (view.getId() != rr6.show_comment) {
                            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                            clickEventBuilder2.b("review_box_reviews");
                            clickEventBuilder2.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_review");
                        } else {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("review_all_replies_reviews");
                            clickEventBuilder3.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_show_replies");
                        }
                        break;
                    case 5:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i8 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ12 = appReviewsFragment.Q1();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        appReviewsViewModelQ12.r(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("leave_comment");
                        clickEventBuilder4.a();
                        AppReviewsViewModel appReviewsViewModelQ13 = appReviewsFragment.Q1();
                        if (!appReviewsViewModelQ13.v.G(appReviewsViewModelQ13.B.a)) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("review_new_reviews_ni");
                            clickEventBuilder5.a();
                            appReviewsFragment.Q1().r(0.0f);
                            Context contextH = appReviewsFragment.H();
                            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.rate_sub_review_not_installed) : null);
                            hh2Var.G();
                            hh2.H(hh2Var);
                        } else {
                            float fFloatValue = ((Number) appRatingModuleData.b.getValue()).floatValue();
                            ReviewDto reviewDto6 = appReviewsFragment.R1().f;
                            if (reviewDto6 != null && (boolIsShowEditConfirm = reviewDto6.isShowEditConfirm()) != null) {
                                zBooleanValue = boolIsShowEditConfirm.booleanValue();
                            }
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(appReviewsFragment.R1().a, fFloatValue, null, zBooleanValue, true, appReviewsFragment.R1().g, "_all_reviews", "REVIEW", 4, null));
                            FragmentActivity fragmentActivityF4 = appReviewsFragment.F();
                            if (fragmentActivityF4 != null) {
                                pk5.c(fragmentActivityF4, submitReview);
                            }
                            ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                            clickEventBuilder6.b("review_new_reviews");
                            clickEventBuilder6.a();
                            fw0 fw0VarS1 = appReviewsFragment.S1();
                            ToolbarData toolbarData = appReviewsFragment.R1().g;
                            fw0VarS1.d(toolbarData.a, toolbarData.e, toolbarData.g, toolbarData.m);
                        }
                        break;
                    default:
                        AppTagData appTagData = (AppTagData) obj;
                        int i9 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((g) qg5Var, "<unused var>");
                        js3.p(appTagData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ14 = appReviewsFragment.Q1();
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(appTagData.a.getLabel()));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        appReviewsViewModelQ14.D = numValueOf;
                        appReviewsViewModelQ14.e();
                        break;
                }
            }
        };
        final int i2 = 1;
        u87Var.o = new og5(this) { // from class: wr
            public final /* synthetic */ AppReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Boolean boolIsShowEditConfirm;
                int i22 = i2;
                boolean zBooleanValue = false;
                Integer numValueOf = null;
                AppReviewsFragment appReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        ReviewData reviewData = (ReviewData) obj;
                        int i3 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str = reviewData.b;
                        BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                        if (buzzProgressImageView != null && buzzProgressImageView.a()) {
                            ReviewDto reviewDto = reviewData.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), true));
                            FragmentActivity fragmentActivityF = appReviewsFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, likeOrDislikeReview);
                            }
                        }
                        Boolean bool = reviewData.g;
                        if (bool != null) {
                            appReviewsFragment.S1().b("_all_reviews", str, bool.booleanValue());
                        }
                        break;
                    case 1:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i4 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str2 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            ReviewDto reviewDto2 = reviewData2.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview2 = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str2, reviewDto2.getId(), reviewDto2.getParentId(), false));
                            FragmentActivity fragmentActivityF2 = appReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, likeOrDislikeReview2);
                            }
                        }
                        Boolean bool2 = reviewData2.g;
                        if (bool2 != null) {
                            appReviewsFragment.S1().a("_all_reviews", str2, bool2.booleanValue());
                        }
                        break;
                    case 2:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i5 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto3 = reviewData3.a;
                        pk5.e(appReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.c);
                        break;
                    case 3:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i6 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        ReviewDto reviewDto4 = reviewData4.a;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_reply_reviews");
                        clickEventBuilder.a();
                        AppReviewsViewModel appReviewsViewModelQ1 = appReviewsFragment.Q1();
                        clickEventBuilder.b(!appReviewsViewModelQ1.v.G(appReviewsViewModelQ1.B.a) ? "review_reply_not_installed" : "review_reply_installed");
                        clickEventBuilder.a();
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData4.b, reviewDto4.getId(), reviewDto4));
                        FragmentActivity fragmentActivityF3 = appReviewsFragment.F();
                        if (fragmentActivityF3 != null) {
                            pk5.c(fragmentActivityF3, replyReview);
                        }
                        break;
                    case 4:
                        ReviewData reviewData5 = (ReviewData) obj;
                        int i7 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData5, "recyclerData");
                        ReviewDto reviewDto5 = reviewData5.a;
                        String str3 = reviewData5.b;
                        if (view.getId() != rr6.show_comment) {
                            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                            clickEventBuilder2.b("review_box_reviews");
                            clickEventBuilder2.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_review");
                        } else {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("review_all_replies_reviews");
                            clickEventBuilder3.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_show_replies");
                        }
                        break;
                    case 5:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i8 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ12 = appReviewsFragment.Q1();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        appReviewsViewModelQ12.r(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("leave_comment");
                        clickEventBuilder4.a();
                        AppReviewsViewModel appReviewsViewModelQ13 = appReviewsFragment.Q1();
                        if (!appReviewsViewModelQ13.v.G(appReviewsViewModelQ13.B.a)) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("review_new_reviews_ni");
                            clickEventBuilder5.a();
                            appReviewsFragment.Q1().r(0.0f);
                            Context contextH = appReviewsFragment.H();
                            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.rate_sub_review_not_installed) : null);
                            hh2Var.G();
                            hh2.H(hh2Var);
                        } else {
                            float fFloatValue = ((Number) appRatingModuleData.b.getValue()).floatValue();
                            ReviewDto reviewDto6 = appReviewsFragment.R1().f;
                            if (reviewDto6 != null && (boolIsShowEditConfirm = reviewDto6.isShowEditConfirm()) != null) {
                                zBooleanValue = boolIsShowEditConfirm.booleanValue();
                            }
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(appReviewsFragment.R1().a, fFloatValue, null, zBooleanValue, true, appReviewsFragment.R1().g, "_all_reviews", "REVIEW", 4, null));
                            FragmentActivity fragmentActivityF4 = appReviewsFragment.F();
                            if (fragmentActivityF4 != null) {
                                pk5.c(fragmentActivityF4, submitReview);
                            }
                            ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                            clickEventBuilder6.b("review_new_reviews");
                            clickEventBuilder6.a();
                            fw0 fw0VarS1 = appReviewsFragment.S1();
                            ToolbarData toolbarData = appReviewsFragment.R1().g;
                            fw0VarS1.d(toolbarData.a, toolbarData.e, toolbarData.g, toolbarData.m);
                        }
                        break;
                    default:
                        AppTagData appTagData = (AppTagData) obj;
                        int i9 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((g) qg5Var, "<unused var>");
                        js3.p(appTagData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ14 = appReviewsFragment.Q1();
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(appTagData.a.getLabel()));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        appReviewsViewModelQ14.D = numValueOf;
                        appReviewsViewModelQ14.e();
                        break;
                }
            }
        };
        final int i3 = 2;
        u87Var.p = new og5(this) { // from class: wr
            public final /* synthetic */ AppReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Boolean boolIsShowEditConfirm;
                int i22 = i3;
                boolean zBooleanValue = false;
                Integer numValueOf = null;
                AppReviewsFragment appReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        ReviewData reviewData = (ReviewData) obj;
                        int i32 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str = reviewData.b;
                        BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                        if (buzzProgressImageView != null && buzzProgressImageView.a()) {
                            ReviewDto reviewDto = reviewData.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), true));
                            FragmentActivity fragmentActivityF = appReviewsFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, likeOrDislikeReview);
                            }
                        }
                        Boolean bool = reviewData.g;
                        if (bool != null) {
                            appReviewsFragment.S1().b("_all_reviews", str, bool.booleanValue());
                        }
                        break;
                    case 1:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i4 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str2 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            ReviewDto reviewDto2 = reviewData2.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview2 = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str2, reviewDto2.getId(), reviewDto2.getParentId(), false));
                            FragmentActivity fragmentActivityF2 = appReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, likeOrDislikeReview2);
                            }
                        }
                        Boolean bool2 = reviewData2.g;
                        if (bool2 != null) {
                            appReviewsFragment.S1().a("_all_reviews", str2, bool2.booleanValue());
                        }
                        break;
                    case 2:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i5 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto3 = reviewData3.a;
                        pk5.e(appReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.c);
                        break;
                    case 3:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i6 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        ReviewDto reviewDto4 = reviewData4.a;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_reply_reviews");
                        clickEventBuilder.a();
                        AppReviewsViewModel appReviewsViewModelQ1 = appReviewsFragment.Q1();
                        clickEventBuilder.b(!appReviewsViewModelQ1.v.G(appReviewsViewModelQ1.B.a) ? "review_reply_not_installed" : "review_reply_installed");
                        clickEventBuilder.a();
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData4.b, reviewDto4.getId(), reviewDto4));
                        FragmentActivity fragmentActivityF3 = appReviewsFragment.F();
                        if (fragmentActivityF3 != null) {
                            pk5.c(fragmentActivityF3, replyReview);
                        }
                        break;
                    case 4:
                        ReviewData reviewData5 = (ReviewData) obj;
                        int i7 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData5, "recyclerData");
                        ReviewDto reviewDto5 = reviewData5.a;
                        String str3 = reviewData5.b;
                        if (view.getId() != rr6.show_comment) {
                            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                            clickEventBuilder2.b("review_box_reviews");
                            clickEventBuilder2.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_review");
                        } else {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("review_all_replies_reviews");
                            clickEventBuilder3.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_show_replies");
                        }
                        break;
                    case 5:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i8 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ12 = appReviewsFragment.Q1();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        appReviewsViewModelQ12.r(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("leave_comment");
                        clickEventBuilder4.a();
                        AppReviewsViewModel appReviewsViewModelQ13 = appReviewsFragment.Q1();
                        if (!appReviewsViewModelQ13.v.G(appReviewsViewModelQ13.B.a)) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("review_new_reviews_ni");
                            clickEventBuilder5.a();
                            appReviewsFragment.Q1().r(0.0f);
                            Context contextH = appReviewsFragment.H();
                            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.rate_sub_review_not_installed) : null);
                            hh2Var.G();
                            hh2.H(hh2Var);
                        } else {
                            float fFloatValue = ((Number) appRatingModuleData.b.getValue()).floatValue();
                            ReviewDto reviewDto6 = appReviewsFragment.R1().f;
                            if (reviewDto6 != null && (boolIsShowEditConfirm = reviewDto6.isShowEditConfirm()) != null) {
                                zBooleanValue = boolIsShowEditConfirm.booleanValue();
                            }
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(appReviewsFragment.R1().a, fFloatValue, null, zBooleanValue, true, appReviewsFragment.R1().g, "_all_reviews", "REVIEW", 4, null));
                            FragmentActivity fragmentActivityF4 = appReviewsFragment.F();
                            if (fragmentActivityF4 != null) {
                                pk5.c(fragmentActivityF4, submitReview);
                            }
                            ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                            clickEventBuilder6.b("review_new_reviews");
                            clickEventBuilder6.a();
                            fw0 fw0VarS1 = appReviewsFragment.S1();
                            ToolbarData toolbarData = appReviewsFragment.R1().g;
                            fw0VarS1.d(toolbarData.a, toolbarData.e, toolbarData.g, toolbarData.m);
                        }
                        break;
                    default:
                        AppTagData appTagData = (AppTagData) obj;
                        int i9 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((g) qg5Var, "<unused var>");
                        js3.p(appTagData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ14 = appReviewsFragment.Q1();
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(appTagData.a.getLabel()));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        appReviewsViewModelQ14.D = numValueOf;
                        appReviewsViewModelQ14.e();
                        break;
                }
            }
        };
        final int i4 = 3;
        u87Var.m = new og5(this) { // from class: wr
            public final /* synthetic */ AppReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Boolean boolIsShowEditConfirm;
                int i22 = i4;
                boolean zBooleanValue = false;
                Integer numValueOf = null;
                AppReviewsFragment appReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        ReviewData reviewData = (ReviewData) obj;
                        int i32 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str = reviewData.b;
                        BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                        if (buzzProgressImageView != null && buzzProgressImageView.a()) {
                            ReviewDto reviewDto = reviewData.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), true));
                            FragmentActivity fragmentActivityF = appReviewsFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, likeOrDislikeReview);
                            }
                        }
                        Boolean bool = reviewData.g;
                        if (bool != null) {
                            appReviewsFragment.S1().b("_all_reviews", str, bool.booleanValue());
                        }
                        break;
                    case 1:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i42 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str2 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            ReviewDto reviewDto2 = reviewData2.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview2 = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str2, reviewDto2.getId(), reviewDto2.getParentId(), false));
                            FragmentActivity fragmentActivityF2 = appReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, likeOrDislikeReview2);
                            }
                        }
                        Boolean bool2 = reviewData2.g;
                        if (bool2 != null) {
                            appReviewsFragment.S1().a("_all_reviews", str2, bool2.booleanValue());
                        }
                        break;
                    case 2:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i5 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto3 = reviewData3.a;
                        pk5.e(appReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.c);
                        break;
                    case 3:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i6 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        ReviewDto reviewDto4 = reviewData4.a;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_reply_reviews");
                        clickEventBuilder.a();
                        AppReviewsViewModel appReviewsViewModelQ1 = appReviewsFragment.Q1();
                        clickEventBuilder.b(!appReviewsViewModelQ1.v.G(appReviewsViewModelQ1.B.a) ? "review_reply_not_installed" : "review_reply_installed");
                        clickEventBuilder.a();
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData4.b, reviewDto4.getId(), reviewDto4));
                        FragmentActivity fragmentActivityF3 = appReviewsFragment.F();
                        if (fragmentActivityF3 != null) {
                            pk5.c(fragmentActivityF3, replyReview);
                        }
                        break;
                    case 4:
                        ReviewData reviewData5 = (ReviewData) obj;
                        int i7 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData5, "recyclerData");
                        ReviewDto reviewDto5 = reviewData5.a;
                        String str3 = reviewData5.b;
                        if (view.getId() != rr6.show_comment) {
                            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                            clickEventBuilder2.b("review_box_reviews");
                            clickEventBuilder2.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_review");
                        } else {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("review_all_replies_reviews");
                            clickEventBuilder3.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_show_replies");
                        }
                        break;
                    case 5:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i8 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ12 = appReviewsFragment.Q1();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        appReviewsViewModelQ12.r(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("leave_comment");
                        clickEventBuilder4.a();
                        AppReviewsViewModel appReviewsViewModelQ13 = appReviewsFragment.Q1();
                        if (!appReviewsViewModelQ13.v.G(appReviewsViewModelQ13.B.a)) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("review_new_reviews_ni");
                            clickEventBuilder5.a();
                            appReviewsFragment.Q1().r(0.0f);
                            Context contextH = appReviewsFragment.H();
                            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.rate_sub_review_not_installed) : null);
                            hh2Var.G();
                            hh2.H(hh2Var);
                        } else {
                            float fFloatValue = ((Number) appRatingModuleData.b.getValue()).floatValue();
                            ReviewDto reviewDto6 = appReviewsFragment.R1().f;
                            if (reviewDto6 != null && (boolIsShowEditConfirm = reviewDto6.isShowEditConfirm()) != null) {
                                zBooleanValue = boolIsShowEditConfirm.booleanValue();
                            }
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(appReviewsFragment.R1().a, fFloatValue, null, zBooleanValue, true, appReviewsFragment.R1().g, "_all_reviews", "REVIEW", 4, null));
                            FragmentActivity fragmentActivityF4 = appReviewsFragment.F();
                            if (fragmentActivityF4 != null) {
                                pk5.c(fragmentActivityF4, submitReview);
                            }
                            ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                            clickEventBuilder6.b("review_new_reviews");
                            clickEventBuilder6.a();
                            fw0 fw0VarS1 = appReviewsFragment.S1();
                            ToolbarData toolbarData = appReviewsFragment.R1().g;
                            fw0VarS1.d(toolbarData.a, toolbarData.e, toolbarData.g, toolbarData.m);
                        }
                        break;
                    default:
                        AppTagData appTagData = (AppTagData) obj;
                        int i9 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((g) qg5Var, "<unused var>");
                        js3.p(appTagData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ14 = appReviewsFragment.Q1();
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(appTagData.a.getLabel()));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        appReviewsViewModelQ14.D = numValueOf;
                        appReviewsViewModelQ14.e();
                        break;
                }
            }
        };
        final int i5 = 4;
        u87Var.q = new og5(this) { // from class: wr
            public final /* synthetic */ AppReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Boolean boolIsShowEditConfirm;
                int i22 = i5;
                boolean zBooleanValue = false;
                Integer numValueOf = null;
                AppReviewsFragment appReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        ReviewData reviewData = (ReviewData) obj;
                        int i32 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str = reviewData.b;
                        BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                        if (buzzProgressImageView != null && buzzProgressImageView.a()) {
                            ReviewDto reviewDto = reviewData.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), true));
                            FragmentActivity fragmentActivityF = appReviewsFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, likeOrDislikeReview);
                            }
                        }
                        Boolean bool = reviewData.g;
                        if (bool != null) {
                            appReviewsFragment.S1().b("_all_reviews", str, bool.booleanValue());
                        }
                        break;
                    case 1:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i42 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str2 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            ReviewDto reviewDto2 = reviewData2.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview2 = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str2, reviewDto2.getId(), reviewDto2.getParentId(), false));
                            FragmentActivity fragmentActivityF2 = appReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, likeOrDislikeReview2);
                            }
                        }
                        Boolean bool2 = reviewData2.g;
                        if (bool2 != null) {
                            appReviewsFragment.S1().a("_all_reviews", str2, bool2.booleanValue());
                        }
                        break;
                    case 2:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i52 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto3 = reviewData3.a;
                        pk5.e(appReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.c);
                        break;
                    case 3:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i6 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        ReviewDto reviewDto4 = reviewData4.a;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_reply_reviews");
                        clickEventBuilder.a();
                        AppReviewsViewModel appReviewsViewModelQ1 = appReviewsFragment.Q1();
                        clickEventBuilder.b(!appReviewsViewModelQ1.v.G(appReviewsViewModelQ1.B.a) ? "review_reply_not_installed" : "review_reply_installed");
                        clickEventBuilder.a();
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData4.b, reviewDto4.getId(), reviewDto4));
                        FragmentActivity fragmentActivityF3 = appReviewsFragment.F();
                        if (fragmentActivityF3 != null) {
                            pk5.c(fragmentActivityF3, replyReview);
                        }
                        break;
                    case 4:
                        ReviewData reviewData5 = (ReviewData) obj;
                        int i7 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData5, "recyclerData");
                        ReviewDto reviewDto5 = reviewData5.a;
                        String str3 = reviewData5.b;
                        if (view.getId() != rr6.show_comment) {
                            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                            clickEventBuilder2.b("review_box_reviews");
                            clickEventBuilder2.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_review");
                        } else {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("review_all_replies_reviews");
                            clickEventBuilder3.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_show_replies");
                        }
                        break;
                    case 5:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i8 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ12 = appReviewsFragment.Q1();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        appReviewsViewModelQ12.r(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("leave_comment");
                        clickEventBuilder4.a();
                        AppReviewsViewModel appReviewsViewModelQ13 = appReviewsFragment.Q1();
                        if (!appReviewsViewModelQ13.v.G(appReviewsViewModelQ13.B.a)) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("review_new_reviews_ni");
                            clickEventBuilder5.a();
                            appReviewsFragment.Q1().r(0.0f);
                            Context contextH = appReviewsFragment.H();
                            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.rate_sub_review_not_installed) : null);
                            hh2Var.G();
                            hh2.H(hh2Var);
                        } else {
                            float fFloatValue = ((Number) appRatingModuleData.b.getValue()).floatValue();
                            ReviewDto reviewDto6 = appReviewsFragment.R1().f;
                            if (reviewDto6 != null && (boolIsShowEditConfirm = reviewDto6.isShowEditConfirm()) != null) {
                                zBooleanValue = boolIsShowEditConfirm.booleanValue();
                            }
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(appReviewsFragment.R1().a, fFloatValue, null, zBooleanValue, true, appReviewsFragment.R1().g, "_all_reviews", "REVIEW", 4, null));
                            FragmentActivity fragmentActivityF4 = appReviewsFragment.F();
                            if (fragmentActivityF4 != null) {
                                pk5.c(fragmentActivityF4, submitReview);
                            }
                            ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                            clickEventBuilder6.b("review_new_reviews");
                            clickEventBuilder6.a();
                            fw0 fw0VarS1 = appReviewsFragment.S1();
                            ToolbarData toolbarData = appReviewsFragment.R1().g;
                            fw0VarS1.d(toolbarData.a, toolbarData.e, toolbarData.g, toolbarData.m);
                        }
                        break;
                    default:
                        AppTagData appTagData = (AppTagData) obj;
                        int i9 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((g) qg5Var, "<unused var>");
                        js3.p(appTagData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ14 = appReviewsFragment.Q1();
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(appTagData.a.getLabel()));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        appReviewsViewModelQ14.D = numValueOf;
                        appReviewsViewModelQ14.e();
                        break;
                }
            }
        };
        final int i6 = 5;
        u87Var.r = new og5(this) { // from class: wr
            public final /* synthetic */ AppReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Boolean boolIsShowEditConfirm;
                int i22 = i6;
                boolean zBooleanValue = false;
                Integer numValueOf = null;
                AppReviewsFragment appReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        ReviewData reviewData = (ReviewData) obj;
                        int i32 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str = reviewData.b;
                        BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                        if (buzzProgressImageView != null && buzzProgressImageView.a()) {
                            ReviewDto reviewDto = reviewData.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), true));
                            FragmentActivity fragmentActivityF = appReviewsFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, likeOrDislikeReview);
                            }
                        }
                        Boolean bool = reviewData.g;
                        if (bool != null) {
                            appReviewsFragment.S1().b("_all_reviews", str, bool.booleanValue());
                        }
                        break;
                    case 1:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i42 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str2 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            ReviewDto reviewDto2 = reviewData2.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview2 = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str2, reviewDto2.getId(), reviewDto2.getParentId(), false));
                            FragmentActivity fragmentActivityF2 = appReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, likeOrDislikeReview2);
                            }
                        }
                        Boolean bool2 = reviewData2.g;
                        if (bool2 != null) {
                            appReviewsFragment.S1().a("_all_reviews", str2, bool2.booleanValue());
                        }
                        break;
                    case 2:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i52 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto3 = reviewData3.a;
                        pk5.e(appReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.c);
                        break;
                    case 3:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i62 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        ReviewDto reviewDto4 = reviewData4.a;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_reply_reviews");
                        clickEventBuilder.a();
                        AppReviewsViewModel appReviewsViewModelQ1 = appReviewsFragment.Q1();
                        clickEventBuilder.b(!appReviewsViewModelQ1.v.G(appReviewsViewModelQ1.B.a) ? "review_reply_not_installed" : "review_reply_installed");
                        clickEventBuilder.a();
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData4.b, reviewDto4.getId(), reviewDto4));
                        FragmentActivity fragmentActivityF3 = appReviewsFragment.F();
                        if (fragmentActivityF3 != null) {
                            pk5.c(fragmentActivityF3, replyReview);
                        }
                        break;
                    case 4:
                        ReviewData reviewData5 = (ReviewData) obj;
                        int i7 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData5, "recyclerData");
                        ReviewDto reviewDto5 = reviewData5.a;
                        String str3 = reviewData5.b;
                        if (view.getId() != rr6.show_comment) {
                            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                            clickEventBuilder2.b("review_box_reviews");
                            clickEventBuilder2.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_review");
                        } else {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("review_all_replies_reviews");
                            clickEventBuilder3.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_show_replies");
                        }
                        break;
                    case 5:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i8 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ12 = appReviewsFragment.Q1();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        appReviewsViewModelQ12.r(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("leave_comment");
                        clickEventBuilder4.a();
                        AppReviewsViewModel appReviewsViewModelQ13 = appReviewsFragment.Q1();
                        if (!appReviewsViewModelQ13.v.G(appReviewsViewModelQ13.B.a)) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("review_new_reviews_ni");
                            clickEventBuilder5.a();
                            appReviewsFragment.Q1().r(0.0f);
                            Context contextH = appReviewsFragment.H();
                            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.rate_sub_review_not_installed) : null);
                            hh2Var.G();
                            hh2.H(hh2Var);
                        } else {
                            float fFloatValue = ((Number) appRatingModuleData.b.getValue()).floatValue();
                            ReviewDto reviewDto6 = appReviewsFragment.R1().f;
                            if (reviewDto6 != null && (boolIsShowEditConfirm = reviewDto6.isShowEditConfirm()) != null) {
                                zBooleanValue = boolIsShowEditConfirm.booleanValue();
                            }
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(appReviewsFragment.R1().a, fFloatValue, null, zBooleanValue, true, appReviewsFragment.R1().g, "_all_reviews", "REVIEW", 4, null));
                            FragmentActivity fragmentActivityF4 = appReviewsFragment.F();
                            if (fragmentActivityF4 != null) {
                                pk5.c(fragmentActivityF4, submitReview);
                            }
                            ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                            clickEventBuilder6.b("review_new_reviews");
                            clickEventBuilder6.a();
                            fw0 fw0VarS1 = appReviewsFragment.S1();
                            ToolbarData toolbarData = appReviewsFragment.R1().g;
                            fw0VarS1.d(toolbarData.a, toolbarData.e, toolbarData.g, toolbarData.m);
                        }
                        break;
                    default:
                        AppTagData appTagData = (AppTagData) obj;
                        int i9 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((g) qg5Var, "<unused var>");
                        js3.p(appTagData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ14 = appReviewsFragment.Q1();
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(appTagData.a.getLabel()));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        appReviewsViewModelQ14.D = numValueOf;
                        appReviewsViewModelQ14.e();
                        break;
                }
            }
        };
        final int i7 = 6;
        u87Var.s = new og5(this) { // from class: wr
            public final /* synthetic */ AppReviewsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                Boolean boolIsShowEditConfirm;
                int i22 = i7;
                boolean zBooleanValue = false;
                Integer numValueOf = null;
                AppReviewsFragment appReviewsFragment = this.b;
                switch (i22) {
                    case 0:
                        ReviewData reviewData = (ReviewData) obj;
                        int i32 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData, "recyclerData");
                        String str = reviewData.b;
                        BuzzProgressImageView buzzProgressImageView = view instanceof BuzzProgressImageView ? (BuzzProgressImageView) view : null;
                        if (buzzProgressImageView != null && buzzProgressImageView.a()) {
                            ReviewDto reviewDto = reviewData.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str, reviewDto.getId(), reviewDto.getParentId(), true));
                            FragmentActivity fragmentActivityF = appReviewsFragment.F();
                            if (fragmentActivityF != null) {
                                pk5.c(fragmentActivityF, likeOrDislikeReview);
                            }
                        }
                        Boolean bool = reviewData.g;
                        if (bool != null) {
                            appReviewsFragment.S1().b("_all_reviews", str, bool.booleanValue());
                        }
                        break;
                    case 1:
                        ReviewData reviewData2 = (ReviewData) obj;
                        int i42 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData2, "recyclerData");
                        String str2 = reviewData2.b;
                        if (((BuzzProgressImageView) view).a()) {
                            ReviewDto reviewDto2 = reviewData2.a;
                            CommentScenario.LikeOrDislikeReview likeOrDislikeReview2 = new CommentScenario.LikeOrDislikeReview(new LikeOrDislikeData(str2, reviewDto2.getId(), reviewDto2.getParentId(), false));
                            FragmentActivity fragmentActivityF2 = appReviewsFragment.F();
                            if (fragmentActivityF2 != null) {
                                pk5.c(fragmentActivityF2, likeOrDislikeReview2);
                            }
                        }
                        Boolean bool2 = reviewData2.g;
                        if (bool2 != null) {
                            appReviewsFragment.S1().a("_all_reviews", str2, bool2.booleanValue());
                        }
                        break;
                    case 2:
                        ReviewData reviewData3 = (ReviewData) obj;
                        int i52 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData3, "recyclerData");
                        ReviewDto reviewDto3 = reviewData3.a;
                        pk5.e(appReviewsFragment.F(), reviewDto3.getAccountKey(), reviewDto3.getNickname(), UserProfileRefId.c);
                        break;
                    case 3:
                        ReviewData reviewData4 = (ReviewData) obj;
                        int i62 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData4, "recyclerData");
                        ReviewDto reviewDto4 = reviewData4.a;
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("review_reply_reviews");
                        clickEventBuilder.a();
                        AppReviewsViewModel appReviewsViewModelQ1 = appReviewsFragment.Q1();
                        clickEventBuilder.b(!appReviewsViewModelQ1.v.G(appReviewsViewModelQ1.B.a) ? "review_reply_not_installed" : "review_reply_installed");
                        clickEventBuilder.a();
                        CommentScenario.ReplyReview replyReview = new CommentScenario.ReplyReview(new ReplyReviewData("_reply", reviewData4.b, reviewDto4.getId(), reviewDto4));
                        FragmentActivity fragmentActivityF3 = appReviewsFragment.F();
                        if (fragmentActivityF3 != null) {
                            pk5.c(fragmentActivityF3, replyReview);
                        }
                        break;
                    case 4:
                        ReviewData reviewData5 = (ReviewData) obj;
                        int i72 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(reviewData5, "recyclerData");
                        ReviewDto reviewDto5 = reviewData5.a;
                        String str3 = reviewData5.b;
                        if (view.getId() != rr6.show_comment) {
                            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                            clickEventBuilder2.b("review_box_reviews");
                            clickEventBuilder2.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_review");
                        } else {
                            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                            clickEventBuilder3.b("review_all_replies_reviews");
                            clickEventBuilder3.a();
                            appReviewsFragment.V1(str3, reviewDto5, "_show_replies");
                        }
                        break;
                    case 5:
                        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) obj;
                        int i8 = AppReviewsFragment.o1;
                        js3.p(view, "view");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p(appRatingModuleData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ12 = appReviewsFragment.Q1();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        appReviewsViewModelQ12.r(myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        ClickEventBuilder clickEventBuilder4 = new ClickEventBuilder();
                        clickEventBuilder4.b("leave_comment");
                        clickEventBuilder4.a();
                        AppReviewsViewModel appReviewsViewModelQ13 = appReviewsFragment.Q1();
                        if (!appReviewsViewModelQ13.v.G(appReviewsViewModelQ13.B.a)) {
                            ClickEventBuilder clickEventBuilder5 = new ClickEventBuilder();
                            clickEventBuilder5.b("review_new_reviews_ni");
                            clickEventBuilder5.a();
                            appReviewsFragment.Q1().r(0.0f);
                            Context contextH = appReviewsFragment.H();
                            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.rate_sub_review_not_installed) : null);
                            hh2Var.G();
                            hh2.H(hh2Var);
                        } else {
                            float fFloatValue = ((Number) appRatingModuleData.b.getValue()).floatValue();
                            ReviewDto reviewDto6 = appReviewsFragment.R1().f;
                            if (reviewDto6 != null && (boolIsShowEditConfirm = reviewDto6.isShowEditConfirm()) != null) {
                                zBooleanValue = boolIsShowEditConfirm.booleanValue();
                            }
                            CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(appReviewsFragment.R1().a, fFloatValue, null, zBooleanValue, true, appReviewsFragment.R1().g, "_all_reviews", "REVIEW", 4, null));
                            FragmentActivity fragmentActivityF4 = appReviewsFragment.F();
                            if (fragmentActivityF4 != null) {
                                pk5.c(fragmentActivityF4, submitReview);
                            }
                            ClickEventBuilder clickEventBuilder6 = new ClickEventBuilder();
                            clickEventBuilder6.b("review_new_reviews");
                            clickEventBuilder6.a();
                            fw0 fw0VarS1 = appReviewsFragment.S1();
                            ToolbarData toolbarData = appReviewsFragment.R1().g;
                            fw0VarS1.d(toolbarData.a, toolbarData.e, toolbarData.g, toolbarData.m);
                        }
                        break;
                    default:
                        AppTagData appTagData = (AppTagData) obj;
                        int i9 = AppReviewsFragment.o1;
                        js3.p(view, "<unused var>");
                        js3.p((g) qg5Var, "<unused var>");
                        js3.p(appTagData, "recyclerData");
                        AppReviewsViewModel appReviewsViewModelQ14 = appReviewsFragment.Q1();
                        try {
                            numValueOf = Integer.valueOf(Integer.parseInt(appTagData.a.getLabel()));
                            break;
                        } catch (NumberFormatException unused) {
                        }
                        appReviewsViewModelQ14.D = numValueOf;
                        appReviewsViewModelQ14.e();
                        break;
                }
            }
        };
        return u87Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(T1(), this);
        this.J0.d(U1(), this);
        ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB1 = B1();
        if (extendedSwipeRefreshLayoutB1 != null) {
            extendedSwipeRefreshLayoutB1.setDistanceToTriggerSync(Integer.MAX_VALUE);
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppReviewsFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new AppReviewsFragment$onViewCreated$2(this, null));
    }

    @Override // androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        this.H = true;
        DetailToolbarView detailToolbarView = (DetailToolbarView) this.l1.getValue();
        if (detailToolbarView != null) {
            detailToolbarView.setVisibility(0);
            detailToolbarView.setDownloadRef("detail");
            detailToolbarView.setAnalyticsName("toolbar_all_reviews");
            detailToolbarView.setShowDownload(true ^ detailToolbarView.v.G(R1().g.a));
            detailToolbarView.setPageTitle(L(rs6.other_review_title));
            detailToolbarView.setToolbarData(R1().g);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.viewModel.c l1() {
        return Q1();
    }

    public final void onEvent(ly5 ly5Var) {
        DetailToolbarView detailToolbarView;
        js3.p(ly5Var, "event");
        if (!m88.T(ly5Var.a.replace(".m.m.free", ""), dp3.y(R1().a), true) || (detailToolbarView = (DetailToolbarView) this.l1.getValue()) == null) {
            return;
        }
        detailToolbarView.setShowDownload(!detailToolbarView.v.G(R1().a));
        detailToolbarView.A();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return -1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new d16(K().getDimensionPixelSize(pq6.space_16), K().getDimensionPixelSize(pq6.space_24), dimensionPixelSize, dimensionPixelSize, 0, K().getDimensionPixelSize(pq6.review_detail_horizontal_item_space), v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.review_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment
    public void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        super.onEvent(qj8Var);
        DetailToolbarView detailToolbarView = (DetailToolbarView) this.l1.getValue();
        if (detailToolbarView != null) {
            detailToolbarView.setBackgroundColor(sj8.b().l);
            detailToolbarView.A();
        }
    }
}
