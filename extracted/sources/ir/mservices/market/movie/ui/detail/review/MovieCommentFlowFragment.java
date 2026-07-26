package ir.mservices.market.movie.ui.detail.review;

import android.os.Bundle;
import android.util.SparseArray;
import defpackage.bp2;
import defpackage.c24;
import defpackage.dt2;
import defpackage.g27;
import defpackage.hk3;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.mm2;
import defpackage.o79;
import defpackage.q79;
import defpackage.s47;
import defpackage.x79;
import ir.mservices.market.movie.data.webapi.ReportCommentRequestDTO;
import ir.mservices.market.movie.ui.detail.review.ReviewAction;
import ir.mservices.market.movie.ui.detail.review.data.OpenReportReviewData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieCommentFlowFragment extends Hilt_MovieCommentFlowFragment implements mm2 {
    public static final /* synthetic */ int P0 = 0;
    public final c24 N0 = kotlin.a.a(new hk3(14, this));
    public final o79 O0;

    public MovieCommentFlowFragment() {
        final MovieCommentFlowFragment$special$$inlined$viewModels$default$1 movieCommentFlowFragment$special$$inlined$viewModels$default$1 = new MovieCommentFlowFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) movieCommentFlowFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.O0 = new o79(g27.a(MovieCommentFlowViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        OpenReportReviewData value;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(E0())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_LOGIN_REVIEW".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    F0().r(ReviewAction.RunPreviousAction.INSTANCE);
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_LOGIN_REPORT".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    F0().r(ReviewAction.RunPreviousAction.INSTANCE);
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_LOGIN_LIKE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    F0().r(ReviewAction.RunPreviousAction.INSTANCE);
                    return;
                } else {
                    F0().r(ReviewAction.EmitLikeOrDislikeEventAction.INSTANCE);
                    return;
                }
            }
            if (!"DIALOG_KEY_REVIEW_REPORT".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_NICKNAME_COMMENT".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                    F0().r(ReviewAction.RunPreviousAction.INSTANCE);
                    return;
                }
                return;
            }
            DialogResult dialogResult = dialogDataModel.d;
            if (dialogResult != DialogResult.a) {
                if (dialogResult == DialogResult.b) {
                    F0().r(ReviewAction.CancelReportReviewAction.INSTANCE);
                    return;
                }
                return;
            }
            Object value2 = F0().C.a.getValue();
            ReviewAction.OpenReportReviewAction openReportReviewAction = value2 instanceof ReviewAction.OpenReportReviewAction ? (ReviewAction.OpenReportReviewAction) value2 : null;
            if (openReportReviewAction == null || (value = openReportReviewAction.getValue()) == null) {
                return;
            }
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, "Comment");
            sparseArray.put(1, "CommentUnrelated");
            sparseArray.put(2, "CommentFake");
            Object obj = sparseArray.get(bundle.getInt("SELECT_INDEX"));
            js3.o(obj, "get(...)");
            F0().r(new ReviewAction.ReportReviewAction(new s47(value.b, value.a, new ReportCommentRequestDTO((String) obj))));
        }
    }

    public final String E0() {
        return (String) this.N0.getValue();
    }

    public final MovieCommentFlowViewModel F0() {
        return (MovieCommentFlowViewModel) this.O0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        ir.mservices.market.version2.core.utils.a.f(this, new MovieCommentFlowFragment$onCreate$1(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new MovieCommentFlowFragment$onCreate$2(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new MovieCommentFlowFragment$onCreate$3(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new MovieCommentFlowFragment$onCreate$4(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new MovieCommentFlowFragment$onCreate$5(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new MovieCommentFlowFragment$onCreate$6(this, null));
    }
}
