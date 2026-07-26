package ir.mservices.market.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.aa2;
import defpackage.ba2;
import defpackage.bd;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c5;
import defpackage.c56;
import defpackage.ca2;
import defpackage.cc7;
import defpackage.cd;
import defpackage.d16;
import defpackage.d56;
import defpackage.dd;
import defpackage.de;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.g76;
import defpackage.ga2;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.m92;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.r92;
import defpackage.rs6;
import defpackage.s40;
import defpackage.sj8;
import defpackage.t40;
import defpackage.x79;
import defpackage.xn7;
import defpackage.yq2;
import defpackage.yq6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.uploadImage.UploadImageAction;
import ir.mservices.market.common.uploadImage.UploadImageViewModel;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.SpinnerItem;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.feedback.FeedbackAction;
import ir.mservices.market.feedback.FeedbackFragment;
import ir.mservices.market.feedback.FeedbackViewModel;
import ir.mservices.market.feedback.data.TransactionData;
import ir.mservices.market.feedback.recycler.FeedbackAttachContentData;
import ir.mservices.market.feedback.recycler.FeedbackChooseTopicData;
import ir.mservices.market.feedback.recycler.FeedbackChooseTransactionData;
import ir.mservices.market.feedback.recycler.FeedbackChosenTransactionData;
import ir.mservices.market.feedback.recycler.c;
import ir.mservices.market.feedback.recycler.d;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.crop.util.PhotoUtils$PhotoData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackFragment extends Hilt_FeedbackFragment {
    public static final /* synthetic */ int r1 = 0;
    public final o79 i1;
    public final o79 j1;
    public final bi5 k1;
    public lw8 l1;
    public c5 m1;
    public g76 n1;
    public d56 o1;
    public a p1;
    public xn7 q1;

    public FeedbackFragment() {
        final FeedbackFragment$special$$inlined$viewModels$default$1 feedbackFragment$special$$inlined$viewModels$default$1 = new FeedbackFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) feedbackFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(FeedbackViewModel.class), new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$4
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
        final FeedbackFragment$special$$inlined$viewModels$default$6 feedbackFragment$special$$inlined$viewModels$default$6 = new FeedbackFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) feedbackFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.j1 = new o79(g27.a(UploadImageViewModel.class), new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$10
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
        }, new bp2() { // from class: ir.mservices.market.feedback.FeedbackFragment$special$$inlined$viewModels$default$9
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
        this.k1 = new bi5(g27.a(r92.class), new de(17, this));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        TransactionData transactionData;
        Object value;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(Q1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_ALERT_DISCARD".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    R1().v();
                    this.J0.q();
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_THANKS_REPORT".equalsIgnoreCase(str2)) {
                R1().v();
                this.J0.q();
                return;
            }
            if ("DIALOG_KEY_ALERT_REMOVE_IMAGE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    R1().r(FeedbackAction.RemoveImageAction.INSTANCE);
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_SINGLE_CHOICE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    l lVar = R1().O;
                    do {
                        value = lVar.getValue();
                    } while (!lVar.n(value, new ba2(((ca2) value).a)));
                    FeedbackViewModel feedbackViewModelR1 = R1();
                    int i = bundle.getInt("BUNDLE_KEY_SELECTED_ITEM");
                    if (i != -1) {
                        feedbackViewModelR1.K.o(feedbackViewModelR1.B.get(i));
                    }
                    feedbackViewModelR1.A = i;
                    return;
                }
                return;
            }
            if (!"DIALOG_KEY_TRANSACTION".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_LOGIN_TRANSACTION".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                    S1();
                    R1().w();
                    return;
                }
                return;
            }
            if (dialogDataModel.d != DialogResult.a || (transactionData = (TransactionData) dt2.p(bundle, "TRANSACTION_DATA", TransactionData.class)) == null) {
                return;
            }
            FeedbackViewModel feedbackViewModelR12 = R1();
            l lVar2 = feedbackViewModelR12.F;
            lVar2.getClass();
            lVar2.p(null, transactionData);
            feedbackViewModelR12.w();
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_feedback);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean G1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_feedback);
        js3.o(string, "getString(...)");
        return string;
    }

    public final String Q1() {
        return dw1.n("FeedbackFragment_", this.H0);
    }

    public final FeedbackViewModel R1() {
        return (FeedbackViewModel) this.i1.getValue();
    }

    public final void S1() {
        if (this.l1 == null) {
            js3.V("uiUtils");
            throw null;
        }
        lw8.b(F());
        pk5.g(this.J0, new NavIntentDirections.FeedbackTransaction(new ga2(new DialogDataModel(Q1(), "DIALOG_KEY_TRANSACTION", new Bundle(), 8))), -1);
    }

    @Override // androidx.fragment.app.d
    public final void U(int i, int i2, Intent intent) {
        super.U(i, i2, intent);
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            g76 g76Var = this.n1;
            if (g76Var != null) {
                g76Var.c(i2, i, intent, fragmentActivityF, this.J0, new PhotoUtils$PhotoData(this.H0, "FREE"));
            } else {
                js3.V("photoUtils");
                throw null;
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = xn7.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        xn7 xn7Var = (xn7) fa1.c(layoutInflater, js6.send_feedback_button_item, viewGroup, false);
        this.q1 = xn7Var;
        js3.m(xn7Var);
        xn7Var.v.setBackgroundColor(sj8.b().l);
        xn7 xn7Var2 = this.q1;
        js3.m(xn7Var2);
        View view = xn7Var2.l;
        cc7.c(view.getResources().getDimensionPixelSize(pq6.space_16), view.getResources().getDimensionPixelSize(pq6.space_16), 10, view);
        view.setOnClickListener(new cd(11, this));
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        js3.n(viewZ, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        xn7 xn7Var3 = this.q1;
        js3.m(xn7Var3);
        View view2 = xn7Var3.l;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.l = 0;
        ((ConstraintLayout) viewZ).addView(view2, layoutParams);
        return viewZ;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(Q1());
        this.q1 = null;
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
        if (!((Boolean) R1().R.a.getValue()).booleanValue()) {
            return t40.g;
        }
        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(Q1(), "DIALOG_KEY_ALERT_DISCARD", null, 12), null, L(rs6.discard_changes_text), L(rs6.discard_changes_title), L(rs6.feedback_alert_dialog_return_change), true)), -1);
        return s40.g;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        final int i = 0;
        m92 m92Var = new m92(1, i);
        m92Var.m = new og5(this) { // from class: p92
            public final /* synthetic */ FeedbackFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                FeedbackFragment feedbackFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTopicData) obj, "<unused var>");
                        String[] stringArray = feedbackFragment.K().getStringArray(mp6.feedback_spinner_titles);
                        js3.o(stringArray, "getStringArray(...)");
                        String[] stringArray2 = feedbackFragment.K().getStringArray(mp6.feedback_spinner_values);
                        js3.o(stringArray2, "getStringArray(...)");
                        FeedbackViewModel feedbackViewModelR1 = feedbackFragment.R1();
                        ArrayList arrayList = feedbackViewModelR1.B;
                        lw.f(null, null, stringArray.length == stringArray2.length);
                        arrayList.clear();
                        Iterator it = new uq3(0, stringArray.length - 1, 1).iterator();
                        while (((tq3) it).c) {
                            int iNextInt = ((mq3) it).nextInt();
                            arrayList.add(new SpinnerItem(stringArray[iNextInt], stringArray2[iNextInt]));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i4 = -1;
                            } else if (!m88.T(((SpinnerItem) it2.next()).getValue(), feedbackViewModelR1.E.d, true)) {
                                i4++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i4);
                        if (i4 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != -1) {
                                feedbackViewModelR1.K.o(arrayList.get(iIntValue));
                            }
                            feedbackViewModelR1.A = iIntValue;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_SINGLE_CHOICE", null, 12);
                        String strL = feedbackFragment.L(rs6.select_feedback_subject);
                        js3.o(strL, "getString(...)");
                        String strL2 = feedbackFragment.L(rs6.choose_txt);
                        js3.o(strL2, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel, strL, strL2, stringArray, feedbackFragment.R1().A, null, true)), -1);
                        return;
                    case 1:
                        int i5 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((l92) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTransactionData) obj, "<unused var>");
                        c5 c5Var = feedbackFragment.m1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String str = (String) c5Var.h.f;
                        if (str != null && !f88.n0(str)) {
                            feedbackFragment.S1();
                            return;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel2 = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_LOGIN_TRANSACTION", null, 12);
                        PhoneBindData phoneBindData = new PhoneBindData("");
                        String strL3 = feedbackFragment.L(rs6.bind_message_transactions);
                        String strL4 = feedbackFragment.L(rs6.login_label_purchase_history);
                        js3.o(strL4, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, strL3, strL4, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                        return;
                    case 2:
                        int i6 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF = feedbackFragment.F();
                        if (fragmentActivityF != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 3:
                        int i7 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF2 = feedbackFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF2);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 4:
                        int i8 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_IMAGE", null, 12), null, feedbackFragment.L(rs6.remove_image_confirm), feedbackFragment.L(rs6.remove_image_txt), feedbackFragment.L(rs6.return_change), true)), -1);
                        return;
                    case 5:
                        int i9 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        FeedbackViewModel feedbackViewModelR12 = feedbackFragment.R1();
                        feedbackViewModelR12.F.o(null);
                        feedbackViewModelR12.w();
                        return;
                    default:
                        int i10 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        feedbackFragment.S1();
                        return;
                }
            }
        };
        final int i2 = 1;
        m92Var.n = new og5(this) { // from class: p92
            public final /* synthetic */ FeedbackFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                FeedbackFragment feedbackFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTopicData) obj, "<unused var>");
                        String[] stringArray = feedbackFragment.K().getStringArray(mp6.feedback_spinner_titles);
                        js3.o(stringArray, "getStringArray(...)");
                        String[] stringArray2 = feedbackFragment.K().getStringArray(mp6.feedback_spinner_values);
                        js3.o(stringArray2, "getStringArray(...)");
                        FeedbackViewModel feedbackViewModelR1 = feedbackFragment.R1();
                        ArrayList arrayList = feedbackViewModelR1.B;
                        lw.f(null, null, stringArray.length == stringArray2.length);
                        arrayList.clear();
                        Iterator it = new uq3(0, stringArray.length - 1, 1).iterator();
                        while (((tq3) it).c) {
                            int iNextInt = ((mq3) it).nextInt();
                            arrayList.add(new SpinnerItem(stringArray[iNextInt], stringArray2[iNextInt]));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i4 = -1;
                            } else if (!m88.T(((SpinnerItem) it2.next()).getValue(), feedbackViewModelR1.E.d, true)) {
                                i4++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i4);
                        if (i4 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != -1) {
                                feedbackViewModelR1.K.o(arrayList.get(iIntValue));
                            }
                            feedbackViewModelR1.A = iIntValue;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_SINGLE_CHOICE", null, 12);
                        String strL = feedbackFragment.L(rs6.select_feedback_subject);
                        js3.o(strL, "getString(...)");
                        String strL2 = feedbackFragment.L(rs6.choose_txt);
                        js3.o(strL2, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel, strL, strL2, stringArray, feedbackFragment.R1().A, null, true)), -1);
                        return;
                    case 1:
                        int i5 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((l92) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTransactionData) obj, "<unused var>");
                        c5 c5Var = feedbackFragment.m1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String str = (String) c5Var.h.f;
                        if (str != null && !f88.n0(str)) {
                            feedbackFragment.S1();
                            return;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel2 = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_LOGIN_TRANSACTION", null, 12);
                        PhoneBindData phoneBindData = new PhoneBindData("");
                        String strL3 = feedbackFragment.L(rs6.bind_message_transactions);
                        String strL4 = feedbackFragment.L(rs6.login_label_purchase_history);
                        js3.o(strL4, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, strL3, strL4, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                        return;
                    case 2:
                        int i6 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF = feedbackFragment.F();
                        if (fragmentActivityF != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 3:
                        int i7 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF2 = feedbackFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF2);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 4:
                        int i8 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_IMAGE", null, 12), null, feedbackFragment.L(rs6.remove_image_confirm), feedbackFragment.L(rs6.remove_image_txt), feedbackFragment.L(rs6.return_change), true)), -1);
                        return;
                    case 5:
                        int i9 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        FeedbackViewModel feedbackViewModelR12 = feedbackFragment.R1();
                        feedbackViewModelR12.F.o(null);
                        feedbackViewModelR12.w();
                        return;
                    default:
                        int i10 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        feedbackFragment.S1();
                        return;
                }
            }
        };
        final int i3 = 2;
        m92Var.o = new og5(this) { // from class: p92
            public final /* synthetic */ FeedbackFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                FeedbackFragment feedbackFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTopicData) obj, "<unused var>");
                        String[] stringArray = feedbackFragment.K().getStringArray(mp6.feedback_spinner_titles);
                        js3.o(stringArray, "getStringArray(...)");
                        String[] stringArray2 = feedbackFragment.K().getStringArray(mp6.feedback_spinner_values);
                        js3.o(stringArray2, "getStringArray(...)");
                        FeedbackViewModel feedbackViewModelR1 = feedbackFragment.R1();
                        ArrayList arrayList = feedbackViewModelR1.B;
                        lw.f(null, null, stringArray.length == stringArray2.length);
                        arrayList.clear();
                        Iterator it = new uq3(0, stringArray.length - 1, 1).iterator();
                        while (((tq3) it).c) {
                            int iNextInt = ((mq3) it).nextInt();
                            arrayList.add(new SpinnerItem(stringArray[iNextInt], stringArray2[iNextInt]));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i4 = -1;
                            } else if (!m88.T(((SpinnerItem) it2.next()).getValue(), feedbackViewModelR1.E.d, true)) {
                                i4++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i4);
                        if (i4 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != -1) {
                                feedbackViewModelR1.K.o(arrayList.get(iIntValue));
                            }
                            feedbackViewModelR1.A = iIntValue;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_SINGLE_CHOICE", null, 12);
                        String strL = feedbackFragment.L(rs6.select_feedback_subject);
                        js3.o(strL, "getString(...)");
                        String strL2 = feedbackFragment.L(rs6.choose_txt);
                        js3.o(strL2, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel, strL, strL2, stringArray, feedbackFragment.R1().A, null, true)), -1);
                        return;
                    case 1:
                        int i5 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((l92) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTransactionData) obj, "<unused var>");
                        c5 c5Var = feedbackFragment.m1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String str = (String) c5Var.h.f;
                        if (str != null && !f88.n0(str)) {
                            feedbackFragment.S1();
                            return;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel2 = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_LOGIN_TRANSACTION", null, 12);
                        PhoneBindData phoneBindData = new PhoneBindData("");
                        String strL3 = feedbackFragment.L(rs6.bind_message_transactions);
                        String strL4 = feedbackFragment.L(rs6.login_label_purchase_history);
                        js3.o(strL4, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, strL3, strL4, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                        return;
                    case 2:
                        int i6 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF = feedbackFragment.F();
                        if (fragmentActivityF != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 3:
                        int i7 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF2 = feedbackFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF2);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 4:
                        int i8 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_IMAGE", null, 12), null, feedbackFragment.L(rs6.remove_image_confirm), feedbackFragment.L(rs6.remove_image_txt), feedbackFragment.L(rs6.return_change), true)), -1);
                        return;
                    case 5:
                        int i9 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        FeedbackViewModel feedbackViewModelR12 = feedbackFragment.R1();
                        feedbackViewModelR12.F.o(null);
                        feedbackViewModelR12.w();
                        return;
                    default:
                        int i10 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        feedbackFragment.S1();
                        return;
                }
            }
        };
        final int i4 = 3;
        m92Var.q = new og5(this) { // from class: p92
            public final /* synthetic */ FeedbackFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i4;
                FeedbackFragment feedbackFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTopicData) obj, "<unused var>");
                        String[] stringArray = feedbackFragment.K().getStringArray(mp6.feedback_spinner_titles);
                        js3.o(stringArray, "getStringArray(...)");
                        String[] stringArray2 = feedbackFragment.K().getStringArray(mp6.feedback_spinner_values);
                        js3.o(stringArray2, "getStringArray(...)");
                        FeedbackViewModel feedbackViewModelR1 = feedbackFragment.R1();
                        ArrayList arrayList = feedbackViewModelR1.B;
                        lw.f(null, null, stringArray.length == stringArray2.length);
                        arrayList.clear();
                        Iterator it = new uq3(0, stringArray.length - 1, 1).iterator();
                        while (((tq3) it).c) {
                            int iNextInt = ((mq3) it).nextInt();
                            arrayList.add(new SpinnerItem(stringArray[iNextInt], stringArray2[iNextInt]));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i42 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i42 = -1;
                            } else if (!m88.T(((SpinnerItem) it2.next()).getValue(), feedbackViewModelR1.E.d, true)) {
                                i42++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i42);
                        if (i42 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != -1) {
                                feedbackViewModelR1.K.o(arrayList.get(iIntValue));
                            }
                            feedbackViewModelR1.A = iIntValue;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_SINGLE_CHOICE", null, 12);
                        String strL = feedbackFragment.L(rs6.select_feedback_subject);
                        js3.o(strL, "getString(...)");
                        String strL2 = feedbackFragment.L(rs6.choose_txt);
                        js3.o(strL2, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel, strL, strL2, stringArray, feedbackFragment.R1().A, null, true)), -1);
                        return;
                    case 1:
                        int i5 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((l92) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTransactionData) obj, "<unused var>");
                        c5 c5Var = feedbackFragment.m1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String str = (String) c5Var.h.f;
                        if (str != null && !f88.n0(str)) {
                            feedbackFragment.S1();
                            return;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel2 = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_LOGIN_TRANSACTION", null, 12);
                        PhoneBindData phoneBindData = new PhoneBindData("");
                        String strL3 = feedbackFragment.L(rs6.bind_message_transactions);
                        String strL4 = feedbackFragment.L(rs6.login_label_purchase_history);
                        js3.o(strL4, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, strL3, strL4, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                        return;
                    case 2:
                        int i6 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF = feedbackFragment.F();
                        if (fragmentActivityF != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 3:
                        int i7 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF2 = feedbackFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF2);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 4:
                        int i8 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_IMAGE", null, 12), null, feedbackFragment.L(rs6.remove_image_confirm), feedbackFragment.L(rs6.remove_image_txt), feedbackFragment.L(rs6.return_change), true)), -1);
                        return;
                    case 5:
                        int i9 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        FeedbackViewModel feedbackViewModelR12 = feedbackFragment.R1();
                        feedbackViewModelR12.F.o(null);
                        feedbackViewModelR12.w();
                        return;
                    default:
                        int i10 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        feedbackFragment.S1();
                        return;
                }
            }
        };
        final int i5 = 4;
        m92Var.p = new og5(this) { // from class: p92
            public final /* synthetic */ FeedbackFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i5;
                FeedbackFragment feedbackFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTopicData) obj, "<unused var>");
                        String[] stringArray = feedbackFragment.K().getStringArray(mp6.feedback_spinner_titles);
                        js3.o(stringArray, "getStringArray(...)");
                        String[] stringArray2 = feedbackFragment.K().getStringArray(mp6.feedback_spinner_values);
                        js3.o(stringArray2, "getStringArray(...)");
                        FeedbackViewModel feedbackViewModelR1 = feedbackFragment.R1();
                        ArrayList arrayList = feedbackViewModelR1.B;
                        lw.f(null, null, stringArray.length == stringArray2.length);
                        arrayList.clear();
                        Iterator it = new uq3(0, stringArray.length - 1, 1).iterator();
                        while (((tq3) it).c) {
                            int iNextInt = ((mq3) it).nextInt();
                            arrayList.add(new SpinnerItem(stringArray[iNextInt], stringArray2[iNextInt]));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i42 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i42 = -1;
                            } else if (!m88.T(((SpinnerItem) it2.next()).getValue(), feedbackViewModelR1.E.d, true)) {
                                i42++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i42);
                        if (i42 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != -1) {
                                feedbackViewModelR1.K.o(arrayList.get(iIntValue));
                            }
                            feedbackViewModelR1.A = iIntValue;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_SINGLE_CHOICE", null, 12);
                        String strL = feedbackFragment.L(rs6.select_feedback_subject);
                        js3.o(strL, "getString(...)");
                        String strL2 = feedbackFragment.L(rs6.choose_txt);
                        js3.o(strL2, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel, strL, strL2, stringArray, feedbackFragment.R1().A, null, true)), -1);
                        return;
                    case 1:
                        int i52 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((l92) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTransactionData) obj, "<unused var>");
                        c5 c5Var = feedbackFragment.m1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String str = (String) c5Var.h.f;
                        if (str != null && !f88.n0(str)) {
                            feedbackFragment.S1();
                            return;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel2 = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_LOGIN_TRANSACTION", null, 12);
                        PhoneBindData phoneBindData = new PhoneBindData("");
                        String strL3 = feedbackFragment.L(rs6.bind_message_transactions);
                        String strL4 = feedbackFragment.L(rs6.login_label_purchase_history);
                        js3.o(strL4, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, strL3, strL4, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                        return;
                    case 2:
                        int i6 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF = feedbackFragment.F();
                        if (fragmentActivityF != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 3:
                        int i7 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF2 = feedbackFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF2);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 4:
                        int i8 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_IMAGE", null, 12), null, feedbackFragment.L(rs6.remove_image_confirm), feedbackFragment.L(rs6.remove_image_txt), feedbackFragment.L(rs6.return_change), true)), -1);
                        return;
                    case 5:
                        int i9 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        FeedbackViewModel feedbackViewModelR12 = feedbackFragment.R1();
                        feedbackViewModelR12.F.o(null);
                        feedbackViewModelR12.w();
                        return;
                    default:
                        int i10 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        feedbackFragment.S1();
                        return;
                }
            }
        };
        final int i6 = 5;
        m92Var.s = new og5(this) { // from class: p92
            public final /* synthetic */ FeedbackFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i6;
                FeedbackFragment feedbackFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTopicData) obj, "<unused var>");
                        String[] stringArray = feedbackFragment.K().getStringArray(mp6.feedback_spinner_titles);
                        js3.o(stringArray, "getStringArray(...)");
                        String[] stringArray2 = feedbackFragment.K().getStringArray(mp6.feedback_spinner_values);
                        js3.o(stringArray2, "getStringArray(...)");
                        FeedbackViewModel feedbackViewModelR1 = feedbackFragment.R1();
                        ArrayList arrayList = feedbackViewModelR1.B;
                        lw.f(null, null, stringArray.length == stringArray2.length);
                        arrayList.clear();
                        Iterator it = new uq3(0, stringArray.length - 1, 1).iterator();
                        while (((tq3) it).c) {
                            int iNextInt = ((mq3) it).nextInt();
                            arrayList.add(new SpinnerItem(stringArray[iNextInt], stringArray2[iNextInt]));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i42 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i42 = -1;
                            } else if (!m88.T(((SpinnerItem) it2.next()).getValue(), feedbackViewModelR1.E.d, true)) {
                                i42++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i42);
                        if (i42 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != -1) {
                                feedbackViewModelR1.K.o(arrayList.get(iIntValue));
                            }
                            feedbackViewModelR1.A = iIntValue;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_SINGLE_CHOICE", null, 12);
                        String strL = feedbackFragment.L(rs6.select_feedback_subject);
                        js3.o(strL, "getString(...)");
                        String strL2 = feedbackFragment.L(rs6.choose_txt);
                        js3.o(strL2, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel, strL, strL2, stringArray, feedbackFragment.R1().A, null, true)), -1);
                        return;
                    case 1:
                        int i52 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((l92) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTransactionData) obj, "<unused var>");
                        c5 c5Var = feedbackFragment.m1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String str = (String) c5Var.h.f;
                        if (str != null && !f88.n0(str)) {
                            feedbackFragment.S1();
                            return;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel2 = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_LOGIN_TRANSACTION", null, 12);
                        PhoneBindData phoneBindData = new PhoneBindData("");
                        String strL3 = feedbackFragment.L(rs6.bind_message_transactions);
                        String strL4 = feedbackFragment.L(rs6.login_label_purchase_history);
                        js3.o(strL4, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, strL3, strL4, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                        return;
                    case 2:
                        int i62 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF = feedbackFragment.F();
                        if (fragmentActivityF != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 3:
                        int i7 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF2 = feedbackFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF2);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 4:
                        int i8 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_IMAGE", null, 12), null, feedbackFragment.L(rs6.remove_image_confirm), feedbackFragment.L(rs6.remove_image_txt), feedbackFragment.L(rs6.return_change), true)), -1);
                        return;
                    case 5:
                        int i9 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        FeedbackViewModel feedbackViewModelR12 = feedbackFragment.R1();
                        feedbackViewModelR12.F.o(null);
                        feedbackViewModelR12.w();
                        return;
                    default:
                        int i10 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        feedbackFragment.S1();
                        return;
                }
            }
        };
        final int i7 = 6;
        m92Var.r = new og5(this) { // from class: p92
            public final /* synthetic */ FeedbackFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i7;
                FeedbackFragment feedbackFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTopicData) obj, "<unused var>");
                        String[] stringArray = feedbackFragment.K().getStringArray(mp6.feedback_spinner_titles);
                        js3.o(stringArray, "getStringArray(...)");
                        String[] stringArray2 = feedbackFragment.K().getStringArray(mp6.feedback_spinner_values);
                        js3.o(stringArray2, "getStringArray(...)");
                        FeedbackViewModel feedbackViewModelR1 = feedbackFragment.R1();
                        ArrayList arrayList = feedbackViewModelR1.B;
                        lw.f(null, null, stringArray.length == stringArray2.length);
                        arrayList.clear();
                        Iterator it = new uq3(0, stringArray.length - 1, 1).iterator();
                        while (((tq3) it).c) {
                            int iNextInt = ((mq3) it).nextInt();
                            arrayList.add(new SpinnerItem(stringArray[iNextInt], stringArray2[iNextInt]));
                        }
                        Iterator it2 = arrayList.iterator();
                        int i42 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i42 = -1;
                            } else if (!m88.T(((SpinnerItem) it2.next()).getValue(), feedbackViewModelR1.E.d, true)) {
                                i42++;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i42);
                        if (i42 == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != -1) {
                                feedbackViewModelR1.K.o(arrayList.get(iIntValue));
                            }
                            feedbackViewModelR1.A = iIntValue;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_SINGLE_CHOICE", null, 12);
                        String strL = feedbackFragment.L(rs6.select_feedback_subject);
                        js3.o(strL, "getString(...)");
                        String strL2 = feedbackFragment.L(rs6.choose_txt);
                        js3.o(strL2, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.SingleChoice(new yw7(dialogDataModel, strL, strL2, stringArray, feedbackFragment.R1().A, null, true)), -1);
                        return;
                    case 1:
                        int i52 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((l92) qg5Var, "<unused var>");
                        js3.p((FeedbackChooseTransactionData) obj, "<unused var>");
                        c5 c5Var = feedbackFragment.m1;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        String str = (String) c5Var.h.f;
                        if (str != null && !f88.n0(str)) {
                            feedbackFragment.S1();
                            return;
                        }
                        if (feedbackFragment.l1 == null) {
                            js3.V("uiUtils");
                            throw null;
                        }
                        lw8.b(feedbackFragment.F());
                        DialogDataModel dialogDataModel2 = new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_LOGIN_TRANSACTION", null, 12);
                        PhoneBindData phoneBindData = new PhoneBindData("");
                        String strL3 = feedbackFragment.L(rs6.bind_message_transactions);
                        String strL4 = feedbackFragment.L(rs6.login_label_purchase_history);
                        js3.o(strL4, "getString(...)");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, strL3, strL4, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                        return;
                    case 2:
                        int i62 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF = feedbackFragment.F();
                        if (fragmentActivityF != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 3:
                        int i72 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        FragmentActivity fragmentActivityF2 = feedbackFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (feedbackFragment.n1 != null) {
                                g76.e(fragmentActivityF2);
                                return;
                            } else {
                                js3.V("photoUtils");
                                throw null;
                            }
                        }
                        return;
                    case 4:
                        int i8 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.feedback.recycler.a) qg5Var, "<unused var>");
                        js3.p((FeedbackAttachContentData) obj, "<unused var>");
                        pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_IMAGE", null, 12), null, feedbackFragment.L(rs6.remove_image_confirm), feedbackFragment.L(rs6.remove_image_txt), feedbackFragment.L(rs6.return_change), true)), -1);
                        return;
                    case 5:
                        int i9 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        FeedbackViewModel feedbackViewModelR12 = feedbackFragment.R1();
                        feedbackViewModelR12.F.o(null);
                        feedbackViewModelR12.w();
                        return;
                    default:
                        int i10 = FeedbackFragment.r1;
                        js3.p(view, "<unused var>");
                        js3.p((d) qg5Var, "<unused var>");
                        js3.p((FeedbackChosenTransactionData) obj, "<unused var>");
                        feedbackFragment.S1();
                        return;
                }
            }
        };
        return m92Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Object value;
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(Q1(), this);
        UploadImageViewModel uploadImageViewModel = (UploadImageViewModel) this.j1.getValue();
        String str = this.H0;
        js3.o(str, "getSubscriberId(...)");
        uploadImageViewModel.r(new UploadImageAction.SubscriberIdAction(str));
        if (((r92) this.k1.getValue()).e) {
            FeedbackViewModel feedbackViewModelR1 = R1();
            aa2 aa2Var = new aa2(null);
            l lVar = feedbackViewModelR1.M;
            do {
                value = lVar.getValue();
            } while (!lVar.n(value, aa2Var));
            ir.mservices.market.version2.core.utils.a.c(this, 1000L, new FeedbackFragment$onViewCreated$1(this, null));
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new FeedbackFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new FeedbackFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new FeedbackFragment$onViewCreated$4(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.viewModel.c l1() {
        return R1();
    }

    public final void onEvent(c56 c56Var) {
        Permission permission;
        js3.p(c56Var, "event");
        Permission[] permissionArr = c56Var.a;
        if (permissionArr != null) {
            int length = permissionArr.length;
            for (int i = 0; i < length; i++) {
                permission = permissionArr[i];
                PermissionResult permissionResult = permission.d;
                if (permissionResult == PermissionResult.DENIED || permissionResult == PermissionResult.DENIED_FOREVER) {
                    break;
                }
            }
            permission = null;
        } else {
            permission = null;
        }
        if (permission != null) {
            a aVar = this.p1;
            if (aVar == null) {
                js3.V("notificationController");
                throw null;
            }
            if (a.d(aVar.i, "download")) {
                R1().v();
                this.J0.q();
                return;
            }
        }
        pk5.g(this.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(Q1(), "DIALOG_KEY_THANKS_REPORT", null, 12), L(rs6.feedback), yq6.ic_report_support, null, K().getString(rs6.feedback_thanks), null, L(rs6.button_ok), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return -1;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new d16(K().getDimensionPixelSize(pq6.space_16), K().getDimensionPixelSize(pq6.feedback_send_button_item_height), dimensionPixelSize, dimensionPixelSize, K().getDimensionPixelSize(pq6.space_8), 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
