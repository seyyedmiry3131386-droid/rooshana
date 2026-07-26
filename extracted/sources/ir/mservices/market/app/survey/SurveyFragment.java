package ir.mservices.market.app.survey;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.bd;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cc7;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa2;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o79;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rs6;
import defpackage.s40;
import defpackage.sc8;
import defpackage.sj8;
import defpackage.ts5;
import defpackage.x79;
import defpackage.yq2;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.survey.SurveyAction;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.DialogButtonComponent;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SurveyFragment extends Hilt_SurveyFragment {
    public static final /* synthetic */ int l1 = 0;
    public final o79 i1;
    public final bi5 j1;
    public DialogButtonComponent k1;

    public SurveyFragment() {
        final SurveyFragment$special$$inlined$viewModels$default$1 surveyFragment$special$$inlined$viewModels$default$1 = new SurveyFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.survey.SurveyFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) surveyFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(SurveyViewModel.class), new bp2() { // from class: ir.mservices.market.app.survey.SurveyFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.survey.SurveyFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.survey.SurveyFragment$special$$inlined$viewModels$default$4
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
        this.j1 = new bi5(g27.a(sc8.class), new yw6(21, this));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
        js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
        DialogDataModel dialogDataModel = (DialogDataModel) objP;
        if ("DIALOG_KEY_CANCEL_SURVEY".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
            Q1().r(SurveyAction.Cancel.INSTANCE);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_survey);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        return dw1.n("packageName: ", ((sc8) this.j1.getValue()).b);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = K().getString(rs6.survey);
        js3.o(string, "getString(...)");
        return string;
    }

    public final SurveyViewModel Q1() {
        return (SurveyViewModel) this.i1.getValue();
    }

    public final void R1() {
        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(dw1.n("SurveyFragment_", this.H0), "DIALOG_KEY_CANCEL_SURVEY", null, 12), null, L(rs6.exit_notice_survey), L(rs6.exit_notice_submitting_survey), L(rs6.continue_survey_button), true)), -1);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        if (viewZ == null) {
            return null;
        }
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_outer) + K().getDimensionPixelSize(pq6.horizontal_space_inner);
        Context context = viewZ.getContext();
        js3.o(context, "getContext(...)");
        DialogButtonComponent dialogButtonComponent = new DialogButtonComponent(context, null);
        cc7.d(dialogButtonComponent, dimensionPixelSize, dialogButtonComponent.getResources().getDimensionPixelSize(pq6.space_16), 0, 4);
        this.k1 = dialogButtonComponent;
        Context context2 = viewZ.getContext();
        js3.o(context2, "getContext(...)");
        QuestionIndicator questionIndicator = new QuestionIndicator(context2, null);
        questionIndicator.setData(((sc8) this.j1.getValue()).a.getQuestions().size(), Q1().E);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewZ;
        int childCount = constraintLayout.getChildCount() - 2;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, constraintLayout.getResources().getDimensionPixelSize(pq6.survey_header_height));
        layoutParams.i = 0;
        constraintLayout.addView(questionIndicator, childCount, layoutParams);
        DialogButtonComponent dialogButtonComponent2 = this.k1;
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams2.l = 0;
        constraintLayout.addView(dialogButtonComponent2, layoutParams2);
        return viewZ;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x("SurveyFragment_" + this.H0);
        this.k1 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        R1();
        return s40.g;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        fa2 fa2Var = new fa2(v1(), 8);
        fa2Var.m = new ts5(23, this);
        return fa2Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d("SurveyFragment_" + this.H0, this);
        DialogButtonComponent dialogButtonComponent = this.k1;
        if (dialogButtonComponent != null) {
            dialogButtonComponent.setCommitButtonEnable(true, sj8.b().d);
            dialogButtonComponent.setCancelButtonEnable(true);
            dialogButtonComponent.setTitles(dialogButtonComponent.getResources().getString(rs6.next), dialogButtonComponent.getResources().getString(rs6.button_cancel));
            dialogButtonComponent.setOnClickListener(new a(this));
            dialogButtonComponent.setBackgroundColor(sj8.b().l);
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SurveyFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SurveyFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SurveyFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SurveyFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SurveyFragment$onViewCreated$6(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return Q1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return -1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new d16(K().getDimensionPixelSize(pq6.survey_header_height), K().getDimensionPixelSize(pq6.space_8) + K().getDimensionPixelSize(pq6.survey_footer_height), dimensionPixelSize, dimensionPixelSize, K().getDimensionPixelSize(pq6.space_4), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.survey_max_span);
    }
}
