package ir.mservices.market.common.comment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.b;
import defpackage.am2;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js8;
import defpackage.jx2;
import defpackage.mm2;
import defpackage.o79;
import defpackage.p40;
import defpackage.q79;
import defpackage.rs6;
import defpackage.wl2;
import defpackage.x79;
import defpackage.y97;
import ir.mservices.market.activity.CommentContentActivity;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.common.comment.data.request.ReportCommentRequestDto;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentFlowFragment extends Hilt_CommentFlowFragment implements mm2 {
    public static final /* synthetic */ int P0 = 0;
    public final o79 N0;
    public final o79 O0;

    public CommentFlowFragment() {
        final CommentFlowFragment$special$$inlined$viewModels$default$1 commentFlowFragment$special$$inlined$viewModels$default$1 = new CommentFlowFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) commentFlowFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.N0 = new o79(g27.a(CommentViewModel.class), new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$4
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
        final CommentFlowFragment$special$$inlined$viewModels$default$6 commentFlowFragment$special$$inlined$viewModels$default$6 = new CommentFlowFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) commentFlowFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.O0 = new o79(g27.a(CommentFlowViewModel.class), new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$10
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
        }, new bp2() { // from class: ir.mservices.market.common.comment.CommentFlowFragment$special$$inlined$viewModels$default$9
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

    public static final void E0(CommentFlowFragment commentFlowFragment, SubmitReviewData submitReviewData, boolean z) {
        FragmentActivity fragmentActivityF = commentFlowFragment.F();
        if (fragmentActivityF != null) {
            fragmentActivityF.startActivity(new Intent(commentFlowFragment.F(), (Class<?>) CommentContentActivity.class).putExtra("packageName", submitReviewData.getPackageName()).putExtra("BUNDLE_KEY_DESCRIPTION", submitReviewData.getComment()).putExtra("BUNDLE_KEY_APPLICATION", submitReviewData.getToolbarData()).putExtra("BUNDLE_KEY_RATING", submitReviewData.getRating()).putExtra("IS_NEW_RATE", submitReviewData.isNewRate()).putExtra("BUNDLE_KEY_EDITABLE", z).putExtra("BUNDLE_KEY_LAUNCH_SOURCE", submitReviewData.getLaunchSource()).putExtra("COMMENT_SOURCE", submitReviewData.getCommentSource()));
        }
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        CommentScenario.ReportReview reportReview;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(I0())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_LOGIN".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    bt2.G(b.a(this), null, null, new CommentFlowFragment$onFragmentResult$1(this, null), 3);
                    return;
                } else {
                    F0();
                    return;
                }
            }
            if ("DIALOG_KEY_NICKNAME_REPLY".equalsIgnoreCase(str2)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult == DialogResult.a) {
                    bt2.G(b.a(this), null, null, new CommentFlowFragment$onFragmentResult$2(this, null), 3);
                    return;
                } else {
                    if (dialogResult == DialogResult.b) {
                        F0();
                        return;
                    }
                    return;
                }
            }
            if ("DIALOG_KEY_NOT_INSTALLED".equals(str2)) {
                String str3 = G0().e;
                if (str3 != null) {
                    if (dialogDataModel.d != DialogResult.a) {
                        F0();
                        return;
                    }
                    Context contextH = H();
                    Uri.Builder builderScheme = new Uri.Builder().scheme(LinkDTO.LINK_TYPE_MYKET_INTENT);
                    Context contextH2 = H();
                    Uri uriBuild = builderScheme.authority(contextH2 != null ? contextH2.getString(rs6.external_intent_filters_host_download) : null).appendPath(str3).appendQueryParameter("ls", ReviewResultDto.REVIEW_POST_ACTION_REVIEW).build();
                    js3.o(uriBuild, "build(...)");
                    js8.q(contextH, uriBuild, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
                    return;
                }
                return;
            }
            if (!"DIALOG_KEY_COMMENT_REPORT".equalsIgnoreCase(str2)) {
                if (!"DIALOG_ACTION_REMOVE_COMMENT".equalsIgnoreCase(str2) || dialogDataModel.d != DialogResult.a) {
                    if ("DIALOG_DEVELOPER_COMMENT".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.b) {
                        F0();
                        return;
                    }
                    return;
                }
                CommentScenario.RemoveComment removeComment = (CommentScenario.RemoveComment) dt2.s(bundle2, "comment_scenario", CommentScenario.RemoveComment.class);
                if (removeComment != null) {
                    CommentViewModel commentViewModelH0 = H0();
                    bt2.G(y97.G(commentViewModelH0), null, null, new CommentViewModel$removeSubComment$1(removeComment, commentViewModelH0, null), 3);
                    return;
                }
                return;
            }
            if (dialogDataModel.d != DialogResult.a || (reportReview = (CommentScenario.ReportReview) dt2.s(bundle2, "comment_scenario", CommentScenario.ReportReview.class)) == null) {
                return;
            }
            int i = bundle.getInt("SELECT_INDEX");
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, "Comment");
            sparseArray.put(1, "CommentUnrelated");
            sparseArray.put(2, "CommentFake");
            String str4 = (String) sparseArray.get(i);
            js3.o(str4, "let(...)");
            ReportCommentRequestDto reportCommentRequestDto = new ReportCommentRequestDto(str4, bundle.getString("BUNDLE_KEY_DESCRIPTION"));
            CommentViewModel commentViewModelH02 = H0();
            String reviewId = reportReview.getValue().getReviewId();
            String parentId = reportReview.getValue().getParentId();
            js3.p(reviewId, "reviewId");
            bt2.G(y97.G(commentViewModelH02), null, null, new CommentViewModel$reportComment$1(commentViewModelH02, reviewId, parentId, reportCommentRequestDto, null), 3);
        }
    }

    public final void F0() {
        wl2 wl2VarL;
        String str = G0().e;
        if (str != null) {
            H0().g(str);
        }
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF == null || (wl2VarL = fragmentActivityF.L()) == null) {
            return;
        }
        p40 p40Var = new p40(wl2VarL);
        p40Var.j(this);
        p40Var.e();
    }

    public final CommentFlowViewModel G0() {
        return (CommentFlowViewModel) this.O0.getValue();
    }

    public final CommentViewModel H0() {
        return (CommentViewModel) this.N0.getValue();
    }

    public final String I0() {
        return dw1.n("CommentFlowFragment_", this.H0);
    }

    public final void J0() {
        am2 am2VarC0 = C0();
        if (am2VarC0 != null) {
            am2VarC0.d(I0(), this);
        }
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$1(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$2(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$3(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$4(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$5(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$6(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$7(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$8(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$9(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$10(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$11(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$12(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$13(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$14(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$15(this, null));
        ir.mservices.market.version2.core.utils.a.f(this, new CommentFlowFragment$startFragment$16(this, null));
    }

    @Override // androidx.fragment.app.d
    public final void a0() {
        am2 am2VarC0 = C0();
        if (am2VarC0 != null) {
            am2VarC0.x(I0());
        }
        this.H = true;
    }
}
