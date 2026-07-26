package ir.mservices.market.myReview.complete;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.b;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.by4;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lm;
import defpackage.m88;
import defpackage.mx0;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.t61;
import defpackage.x2;
import defpackage.x79;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment;
import ir.mservices.market.myReview.complete.data.CompleteReviewDto;
import ir.mservices.market.myReview.complete.recycler.CompleteReview;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class CompleteReviewRecyclerListFragment extends Hilt_CompleteReviewRecyclerListFragment {
    public static final /* synthetic */ int l1 = 0;
    public final o79 i1;
    public final o79 j1;
    public by4 k1;

    public CompleteReviewRecyclerListFragment() {
        final CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$1 completeReviewRecyclerListFragment$special$$inlined$viewModels$default$1 = new CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) completeReviewRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(CompleteReviewViewModel.class), new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$4
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
        final x2 x2Var = new x2(12, this);
        final c24 c24VarB2 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) x2Var.invoke();
            }
        });
        this.j1 = new o79(g27.a(MyReviewsContentViewModel.class), new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.myReview.complete.CompleteReviewRecyclerListFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        CompleteReview completeReview;
        by4 by4Var;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(Q1()) && (by4Var = this.k1) != null) {
            by4Var.a(bundle);
        }
        if (str.equalsIgnoreCase(R1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_LINE_MENU".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a && (completeReview = (CompleteReview) dt2.s(dialogDataModel.c, "BUNDLE_KEY_DATA", CompleteReview.class)) != null && m88.T(bundle.getString("BUNDLE_KEY_ID"), "EDIT_REVIEWED", true)) {
                dw1.y("complete_reviews_more_edit");
                CompleteReviewDto completeReviewDto = completeReview.a;
                String packageName = completeReviewDto.getPackageName();
                if (packageName != null) {
                    CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(packageName, completeReview.c, completeReview.d, false, false, new ToolbarData(completeReviewDto.getPackageName(), completeReviewDto.getIconPath(), completeReviewDto.getTitle(), "ReviewComplete"), "_compelete_review", "COMPLETE"));
                    if (F() != null) {
                        pk5.c(F(), submitReview);
                    }
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_reviewed);
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
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_comment);
        MyketTextView myketTextView = (MyketTextView) view.findViewById(rr6.empty_title);
        myketTextView.setVisibility(0);
        myketTextView.setText(rs6.any_review_title);
        BigFillOvalButton bigFillOvalButton = (BigFillOvalButton) view.findViewById(rr6.action_button);
        bigFillOvalButton.setVisibility(0);
        bigFillOvalButton.setText(bigFillOvalButton.getResources().getString(rs6.submit_comment));
        bigFillOvalButton.setOnClickListener(new mx0());
    }

    public final String Q1() {
        return t61.i(R1(), "_DIALOG_KEY_MORE_MENU");
    }

    public final String R1() {
        return dw1.n("CompleteReviewRecyclerListFragment_", this.H0);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean X0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(R1());
        this.J0.x(Q1());
        this.k1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(v1(), 4);
        final int i = 0;
        lmVar.m = new og5(this) { // from class: nx0
            public final /* synthetic */ CompleteReviewRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        CompleteReview completeReview = (CompleteReview) obj;
                        int i3 = CompleteReviewRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myReview.complete.recycler.a) qg5Var, "<unused var>");
                        js3.p(completeReview, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("complete_reviews_more");
                        clickEventBuilder.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("EDIT_REVIEWED", completeReviewRecyclerListFragment.K().getString(rs6.edit_comment)));
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("BUNDLE_KEY_DATA", completeReview);
                        pk5.g(completeReviewRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(completeReviewRecyclerListFragment.R1(), "DIALOG_KEY_LINE_MENU", bundle, 8), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        break;
                    default:
                        CompleteReview completeReview2 = (CompleteReview) obj;
                        int i4 = CompleteReviewRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myReview.complete.recycler.a) qg5Var, "<unused var>");
                        js3.p(completeReview2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("complete_reviews_detail");
                        clickEventBuilder2.a();
                        String packageName = completeReview2.a.getPackageName();
                        if (packageName != null) {
                            pk5.g(completeReviewRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, null, "verticalList"), false, null, "ReviewComplete", null, null, null, null, null, null, null)), -1);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        lmVar.n = new og5(this) { // from class: nx0
            public final /* synthetic */ CompleteReviewRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                CompleteReviewRecyclerListFragment completeReviewRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        CompleteReview completeReview = (CompleteReview) obj;
                        int i3 = CompleteReviewRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myReview.complete.recycler.a) qg5Var, "<unused var>");
                        js3.p(completeReview, "recyclerData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("complete_reviews_more");
                        clickEventBuilder.a();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("EDIT_REVIEWED", completeReviewRecyclerListFragment.K().getString(rs6.edit_comment)));
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("BUNDLE_KEY_DATA", completeReview);
                        pk5.g(completeReviewRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(completeReviewRecyclerListFragment.R1(), "DIALOG_KEY_LINE_MENU", bundle, 8), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        break;
                    default:
                        CompleteReview completeReview2 = (CompleteReview) obj;
                        int i4 = CompleteReviewRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.myReview.complete.recycler.a) qg5Var, "<unused var>");
                        js3.p(completeReview2, "recyclerData");
                        ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                        clickEventBuilder2.b("complete_reviews_detail");
                        clickEventBuilder2.a();
                        String packageName = completeReview2.a.getPackageName();
                        if (packageName != null) {
                            pk5.g(completeReviewRecyclerListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName, false, new Tracker(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, null, "verticalList"), false, null, "ReviewComplete", null, null, null, null, null, null, null)), -1);
                        }
                        break;
                }
            }
        };
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(R1(), this);
        this.J0.d(Q1(), this);
        this.k1 = new by4("", F(), Q1(), null);
        bt2.G(b.a(N()), null, null, new CompleteReviewRecyclerListFragment$onViewCreated$1(this, null), 3);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (CompleteReviewViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final View p1(ViewGroup viewGroup) {
        View view = fa1.c(LayoutInflater.from(F()), js6.empty_view_button, viewGroup, false).l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(0, K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_s), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.my_review_max_span);
    }
}
