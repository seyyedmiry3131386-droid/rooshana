package ir.mservices.market.myReview.incomplete;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cl1;
import defpackage.d16;
import defpackage.ds6;
import defpackage.g27;
import defpackage.hk3;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.x79;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment;
import ir.mservices.market.myReview.incomplete.recycler.InCompleteReviewData;
import ir.mservices.market.myReview.incomplete.recycler.a;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketRatingBar;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class InCompleteReviewRecyclerListFragment extends Hilt_InCompleteReviewRecyclerListFragment {
    public static final /* synthetic */ int k1 = 0;
    public final o79 i1;
    public final c24 j1;

    public InCompleteReviewRecyclerListFragment() {
        final InCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$1 inCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$1 = new InCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) inCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(InCompleteReviewViewModel.class), new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$4
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
        this.j1 = kotlin.a.a(new hk3(1, this));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_un_reviewed);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean D0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.all_comments_done);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        if (textView != null) {
            textView.setText(rs6.no_item_in_app_reivew_list);
            textView.setVisibility(((Boolean) ((InCompleteReviewViewModel) this.i1.getValue()).z.a.getValue()).booleanValue() ? 0 : 8);
        }
    }

    public final void Q1(InCompleteReviewData inCompleteReviewData, float f) {
        InCompleteReviewDto inCompleteReviewDto = inCompleteReviewData.a;
        String packageName = inCompleteReviewDto.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(packageName, f, null, true, true, new ToolbarData(inCompleteReviewDto), "_incompelete_review", "INCOMPLETE", 4, null));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            pk5.c(fragmentActivityF, submitReview);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean X0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        cl1 cl1Var = new cl1(v1(), 1);
        final int i = 0;
        cl1Var.m = new og5(this) { // from class: cl3
            public final /* synthetic */ InCompleteReviewRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        InCompleteReviewData inCompleteReviewData = (InCompleteReviewData) obj;
                        int i3 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "view");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("incomplete_reviews_stars");
                        clickEventBuilder.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        inCompleteReviewRecyclerListFragment.Q1(inCompleteReviewData, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 1:
                        InCompleteReviewData inCompleteReviewData2 = (InCompleteReviewData) obj;
                        int i4 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("incomplete_reviews_write_review");
                        clickEventBuilder2.a();
                        inCompleteReviewRecyclerListFragment.Q1(inCompleteReviewData2, 0.0f);
                        break;
                    default:
                        InCompleteReviewData inCompleteReviewData3 = (InCompleteReviewData) obj;
                        int i5 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("incomplete_reviews_detail");
                        clickEventBuilder3.a();
                        String packageName = inCompleteReviewData3.a.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(inCompleteReviewRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, null, "verticalList"), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                }
            }
        };
        final int i2 = 1;
        cl1Var.n = new og5(this) { // from class: cl3
            public final /* synthetic */ InCompleteReviewRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        InCompleteReviewData inCompleteReviewData = (InCompleteReviewData) obj;
                        int i3 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "view");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("incomplete_reviews_stars");
                        clickEventBuilder.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        inCompleteReviewRecyclerListFragment.Q1(inCompleteReviewData, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 1:
                        InCompleteReviewData inCompleteReviewData2 = (InCompleteReviewData) obj;
                        int i4 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("incomplete_reviews_write_review");
                        clickEventBuilder2.a();
                        inCompleteReviewRecyclerListFragment.Q1(inCompleteReviewData2, 0.0f);
                        break;
                    default:
                        InCompleteReviewData inCompleteReviewData3 = (InCompleteReviewData) obj;
                        int i5 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("incomplete_reviews_detail");
                        clickEventBuilder3.a();
                        String packageName = inCompleteReviewData3.a.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(inCompleteReviewRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, null, "verticalList"), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                }
            }
        };
        final int i3 = 2;
        cl1Var.o = new og5(this) { // from class: cl3
            public final /* synthetic */ InCompleteReviewRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                InCompleteReviewRecyclerListFragment inCompleteReviewRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        InCompleteReviewData inCompleteReviewData = (InCompleteReviewData) obj;
                        int i32 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "view");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("incomplete_reviews_stars");
                        clickEventBuilder.a();
                        MyketRatingBar myketRatingBar = view instanceof MyketRatingBar ? (MyketRatingBar) view : null;
                        inCompleteReviewRecyclerListFragment.Q1(inCompleteReviewData, myketRatingBar != null ? myketRatingBar.getRating() : 0.0f);
                        break;
                    case 1:
                        InCompleteReviewData inCompleteReviewData2 = (InCompleteReviewData) obj;
                        int i4 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("incomplete_reviews_write_review");
                        clickEventBuilder2.a();
                        inCompleteReviewRecyclerListFragment.Q1(inCompleteReviewData2, 0.0f);
                        break;
                    default:
                        InCompleteReviewData inCompleteReviewData3 = (InCompleteReviewData) obj;
                        int i5 = InCompleteReviewRecyclerListFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(inCompleteReviewData3, "recyclerData");
                        ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                        clickEventBuilder3.b("incomplete_reviews_detail");
                        clickEventBuilder3.a();
                        String packageName = inCompleteReviewData3.a.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        pk5.g(inCompleteReviewRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, null, "verticalList"), false, null, "ReviewIncomplete", null, null, null, null, null, null, null)), -1);
                        break;
                }
            }
        };
        return cl1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new InCompleteReviewRecyclerListFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (InCompleteReviewViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_s), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.my_review_max_span);
    }
}
