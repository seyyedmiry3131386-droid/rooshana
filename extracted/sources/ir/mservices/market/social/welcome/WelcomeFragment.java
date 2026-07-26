package ir.mservices.market.social.welcome;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.ao2;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c5;
import defpackage.cc7;
import defpackage.d11;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.g27;
import defpackage.g76;
import defpackage.is3;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.mm2;
import defpackage.o79;
import defpackage.og5;
import defpackage.pd9;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.td9;
import defpackage.x79;
import defpackage.yc9;
import defpackage.yq2;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myAccount.dialog.Gender;
import ir.mservices.market.social.welcome.WelcomeAction;
import ir.mservices.market.social.welcome.WelcomeFragment;
import ir.mservices.market.social.welcome.data.Step;
import ir.mservices.market.social.welcome.recycler.WelcomeImageData;
import ir.mservices.market.social.welcome.recycler.WelcomeNameData;
import ir.mservices.market.social.welcome.recycler.a;
import ir.mservices.market.social.welcome.recycler.b;
import ir.mservices.market.social.welcome.recycler.c;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.crop.util.PhotoUtils$PhotoData;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.StepView;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class WelcomeFragment extends Hilt_WelcomeFragment implements mm2 {
    public static final /* synthetic */ int a1 = 0;
    public c5 V0;
    public g76 W0;
    public ao2 X0;
    public final o79 Y0;
    public final bi5 Z0;

    public WelcomeFragment() {
        final WelcomeFragment$special$$inlined$viewModels$default$1 welcomeFragment$special$$inlined$viewModels$default$1 = new WelcomeFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.welcome.WelcomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) welcomeFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.Y0 = new o79(g27.a(WelcomeViewModel.class), new bp2() { // from class: ir.mservices.market.social.welcome.WelcomeFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.welcome.WelcomeFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.social.welcome.WelcomeFragment$special$$inlined$viewModels$default$4
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
        this.Z0 = new bi5(g27.a(td9.class), new yc9(this, 1));
    }

    public static final void k1(WelcomeFragment welcomeFragment, Pair pair) {
        ao2 ao2Var = welcomeFragment.X0;
        js3.m(ao2Var);
        ao2Var.D.setCurrentItem(Step.c.indexOf(pair.a), false);
        int iOrdinal = ((Step) pair.a).ordinal();
        if (iOrdinal == 0) {
            ao2 ao2Var2 = welcomeFragment.X0;
            js3.m(ao2Var2);
            StepView stepView = ao2Var2.y;
            js3.o(stepView, "step1");
            n1(stepView);
            return;
        }
        if (iOrdinal == 1) {
            ao2 ao2Var3 = welcomeFragment.X0;
            js3.m(ao2Var3);
            StepView stepView2 = ao2Var3.y;
            js3.o(stepView2, "step1");
            ao2 ao2Var4 = welcomeFragment.X0;
            js3.m(ao2Var4);
            StepView stepView3 = ao2Var4.z;
            js3.o(stepView3, "step2");
            n1(stepView2, stepView3);
            return;
        }
        if (iOrdinal == 2) {
            ao2 ao2Var5 = welcomeFragment.X0;
            js3.m(ao2Var5);
            StepView stepView4 = ao2Var5.y;
            js3.o(stepView4, "step1");
            ao2 ao2Var6 = welcomeFragment.X0;
            js3.m(ao2Var6);
            StepView stepView5 = ao2Var6.z;
            js3.o(stepView5, "step2");
            ao2 ao2Var7 = welcomeFragment.X0;
            js3.m(ao2Var7);
            StepView stepView6 = ao2Var7.A;
            js3.o(stepView6, "step3");
            n1(stepView4, stepView5, stepView6);
            return;
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ao2 ao2Var8 = welcomeFragment.X0;
        js3.m(ao2Var8);
        StepView stepView7 = ao2Var8.y;
        js3.o(stepView7, "step1");
        ao2 ao2Var9 = welcomeFragment.X0;
        js3.m(ao2Var9);
        StepView stepView8 = ao2Var9.z;
        js3.o(stepView8, "step2");
        ao2 ao2Var10 = welcomeFragment.X0;
        js3.m(ao2Var10);
        StepView stepView9 = ao2Var10.A;
        js3.o(stepView9, "step3");
        ao2 ao2Var11 = welcomeFragment.X0;
        js3.m(ao2Var11);
        StepView stepView10 = ao2Var11.B;
        js3.o(stepView10, "step4");
        n1(stepView7, stepView8, stepView9, stepView10);
    }

    public static void n1(StepView... stepViewArr) {
        int length = stepViewArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StepView stepView = stepViewArr[i];
            int i3 = i2 + 1;
            if (i2 == stepViewArr.length - 1) {
                stepView.setState(StepState.b);
            } else {
                stepView.setState(StepState.a);
            }
            i++;
            i2 = i3;
        }
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        String string;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(l1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if (!"DIALOG_KEY_LINE_MENU".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_CONFIRM".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                    m1().r(WelcomeAction.DeleteAvatarAction.INSTANCE);
                    return;
                }
                return;
            }
            if (dialogDataModel.d != DialogResult.a || (string = bundle.getString("BUNDLE_KEY_ID")) == null) {
                return;
            }
            if (string.equalsIgnoreCase("TAKE_PHOTO")) {
                g76 g76Var = this.W0;
                if (g76Var != null) {
                    g76Var.d(F());
                    return;
                } else {
                    js3.V("photoUtils");
                    throw null;
                }
            }
            if (string.equalsIgnoreCase("LIBRARY_PHOTO")) {
                if (this.W0 != null) {
                    g76.e(F());
                    return;
                } else {
                    js3.V("photoUtils");
                    throw null;
                }
            }
            if (string.equalsIgnoreCase("REMOVE_PHOTO")) {
                DialogDataModel dialogDataModel2 = new DialogDataModel(l1(), "DIALOG_KEY_CONFIRM", null, 12);
                String strL = L(rs6.delete_upload_text);
                js3.o(strL, "getString(...)");
                pk5.g(this.J0, new NavIntentDirections.Confirm(new d11(dialogDataModel2, strL, L(rs6.dismiss), L(rs6.delete_upload_title), sj8.b().c, sj8.b().d, sj8.b())), -1);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_welcome_profile);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int H0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int M0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int R0() {
        return sj8.b().p;
    }

    @Override // androidx.fragment.app.d
    public final void U(int i, int i2, Intent intent) {
        super.U(i, i2, intent);
        if (F() != null) {
            g76 g76Var = this.W0;
            if (g76Var != null) {
                g76Var.c(i2, i, intent, F(), this.J0, new PhotoUtils$PhotoData(this.H0, null));
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

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean X0() {
        return true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = ao2.E;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ao2 ao2Var = (ao2) fa1.c(layoutInflater, js6.fragment_welcome, viewGroup, false);
        this.X0 = ao2Var;
        js3.m(ao2Var);
        ao2Var.D.setUserInputEnabled(false);
        ao2 ao2Var2 = this.X0;
        js3.m(ao2Var2);
        ViewPager2 viewPager2 = ao2Var2.D;
        ao2 ao2Var3 = this.X0;
        js3.m(ao2Var3);
        Context context = ao2Var3.l.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.d = K().getDimensionPixelSize(pq6.space_16);
        ea7Var.b();
        ea7Var.f = 0;
        ea7Var.b();
        ea7Var.g = 0;
        ea7Var.b();
        ea7Var.e = K().getDimensionPixelSize(pq6.space_16);
        ea7Var.b();
        ea7Var.h = 0;
        viewPager2.setBackground(ea7Var.a());
        ao2 ao2Var4 = this.X0;
        js3.m(ao2Var4);
        DialogButtonComponent dialogButtonComponent = ao2Var4.w;
        int dimensionPixelSize = yq2.n0(dialogButtonComponent.getContext()) ? dialogButtonComponent.getResources().getDimensionPixelSize(pq6.space_16) : 0;
        Context context2 = dialogButtonComponent.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.b = sj8.b().l;
        ea7Var2.d = 0;
        ea7Var2.b();
        ea7Var2.f = dimensionPixelSize;
        ea7Var2.b();
        ea7Var2.g = dimensionPixelSize;
        ea7Var2.b();
        ea7Var2.e = 0;
        ea7Var2.b();
        ea7Var2.h = 0;
        dialogButtonComponent.setBackground(ea7Var2.a());
        dialogButtonComponent.setTitles(dialogButtonComponent.getResources().getString(rs6.button_submit), dialogButtonComponent.getResources().getString(rs6.skip));
        dialogButtonComponent.setOnClickListener(new a(this));
        ao2 ao2Var5 = this.X0;
        js3.m(ao2Var5);
        View view = ao2Var5.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        DialogDataModel dialogDataModel = ((td9) this.Z0.getValue()).f;
        dialogDataModel.d = DialogResult.a;
        this.J0.k(is3.g(new Pair("BUNDLE_KEY_DATA", dialogDataModel)), dialogDataModel.a);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [rd9] */
    /* JADX WARN: Type inference failed for: r3v5, types: [rd9] */
    /* JADX WARN: Type inference failed for: r3v6, types: [rd9] */
    /* JADX WARN: Type inference failed for: r3v7, types: [rd9] */
    /* JADX WARN: Type inference failed for: r3v8, types: [rd9] */
    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        cc7.d(view, 0, 0, 0, 7);
        this.J0.d(l1(), this);
        pd9 pd9Var = new pd9(1);
        final int i = 0;
        pd9Var.p = new og5(this) { // from class: rd9
            public final /* synthetic */ WelcomeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                int i2 = i;
                WelcomeFragment welcomeFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((WelcomeImageData) obj, "<unused var>");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", welcomeFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", welcomeFragment.L(rs6.take_photo)));
                        c5 c5Var = welcomeFragment.V0;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        if (c5Var.e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", welcomeFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(welcomeFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(welcomeFragment.l1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    case 1:
                        String str = (String) obj;
                        int i4 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        welcomeFragment.m1().r(new WelcomeAction.ChangeNameAction(str));
                        return;
                    case 2:
                        String str2 = (String) obj;
                        int i5 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((qd9) qg5Var, "<unused var>");
                        js3.p(str2, "date");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeDateAction(str2));
                        ao2 ao2Var = welcomeFragment.X0;
                        js3.m(ao2Var);
                        MyketTextView myketTextView = ao2Var.x;
                        js3.o(myketTextView, "error");
                        myketTextView.setVisibility(8);
                        return;
                    case 3:
                        Gender gender = (Gender) obj;
                        int i6 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(gender, "gender");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeGenderAction(gender));
                        ao2 ao2Var2 = welcomeFragment.X0;
                        js3.m(ao2Var2);
                        MyketTextView myketTextView2 = ao2Var2.x;
                        js3.o(myketTextView2, "error");
                        myketTextView2.setVisibility(8);
                        return;
                    default:
                        int i7 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((WelcomeNameData) obj, "<unused var>");
                        welcomeFragment.m1().r(WelcomeAction.SubmitStepAction.INSTANCE);
                        return;
                }
            }
        };
        final int i2 = 1;
        pd9Var.l = new og5(this) { // from class: rd9
            public final /* synthetic */ WelcomeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                int i22 = i2;
                WelcomeFragment welcomeFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((WelcomeImageData) obj, "<unused var>");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", welcomeFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", welcomeFragment.L(rs6.take_photo)));
                        c5 c5Var = welcomeFragment.V0;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        if (c5Var.e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", welcomeFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(welcomeFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(welcomeFragment.l1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    case 1:
                        String str = (String) obj;
                        int i4 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        welcomeFragment.m1().r(new WelcomeAction.ChangeNameAction(str));
                        return;
                    case 2:
                        String str2 = (String) obj;
                        int i5 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((qd9) qg5Var, "<unused var>");
                        js3.p(str2, "date");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeDateAction(str2));
                        ao2 ao2Var = welcomeFragment.X0;
                        js3.m(ao2Var);
                        MyketTextView myketTextView = ao2Var.x;
                        js3.o(myketTextView, "error");
                        myketTextView.setVisibility(8);
                        return;
                    case 3:
                        Gender gender = (Gender) obj;
                        int i6 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(gender, "gender");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeGenderAction(gender));
                        ao2 ao2Var2 = welcomeFragment.X0;
                        js3.m(ao2Var2);
                        MyketTextView myketTextView2 = ao2Var2.x;
                        js3.o(myketTextView2, "error");
                        myketTextView2.setVisibility(8);
                        return;
                    default:
                        int i7 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((WelcomeNameData) obj, "<unused var>");
                        welcomeFragment.m1().r(WelcomeAction.SubmitStepAction.INSTANCE);
                        return;
                }
            }
        };
        final int i3 = 2;
        pd9Var.m = new og5(this) { // from class: rd9
            public final /* synthetic */ WelcomeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                int i22 = i3;
                WelcomeFragment welcomeFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((WelcomeImageData) obj, "<unused var>");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", welcomeFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", welcomeFragment.L(rs6.take_photo)));
                        c5 c5Var = welcomeFragment.V0;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        if (c5Var.e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", welcomeFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(welcomeFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(welcomeFragment.l1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    case 1:
                        String str = (String) obj;
                        int i4 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        welcomeFragment.m1().r(new WelcomeAction.ChangeNameAction(str));
                        return;
                    case 2:
                        String str2 = (String) obj;
                        int i5 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((qd9) qg5Var, "<unused var>");
                        js3.p(str2, "date");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeDateAction(str2));
                        ao2 ao2Var = welcomeFragment.X0;
                        js3.m(ao2Var);
                        MyketTextView myketTextView = ao2Var.x;
                        js3.o(myketTextView, "error");
                        myketTextView.setVisibility(8);
                        return;
                    case 3:
                        Gender gender = (Gender) obj;
                        int i6 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(gender, "gender");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeGenderAction(gender));
                        ao2 ao2Var2 = welcomeFragment.X0;
                        js3.m(ao2Var2);
                        MyketTextView myketTextView2 = ao2Var2.x;
                        js3.o(myketTextView2, "error");
                        myketTextView2.setVisibility(8);
                        return;
                    default:
                        int i7 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((WelcomeNameData) obj, "<unused var>");
                        welcomeFragment.m1().r(WelcomeAction.SubmitStepAction.INSTANCE);
                        return;
                }
            }
        };
        final int i4 = 3;
        pd9Var.n = new og5(this) { // from class: rd9
            public final /* synthetic */ WelcomeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                int i22 = i4;
                WelcomeFragment welcomeFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((WelcomeImageData) obj, "<unused var>");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", welcomeFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", welcomeFragment.L(rs6.take_photo)));
                        c5 c5Var = welcomeFragment.V0;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        if (c5Var.e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", welcomeFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(welcomeFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(welcomeFragment.l1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    case 1:
                        String str = (String) obj;
                        int i42 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        welcomeFragment.m1().r(new WelcomeAction.ChangeNameAction(str));
                        return;
                    case 2:
                        String str2 = (String) obj;
                        int i5 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((qd9) qg5Var, "<unused var>");
                        js3.p(str2, "date");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeDateAction(str2));
                        ao2 ao2Var = welcomeFragment.X0;
                        js3.m(ao2Var);
                        MyketTextView myketTextView = ao2Var.x;
                        js3.o(myketTextView, "error");
                        myketTextView.setVisibility(8);
                        return;
                    case 3:
                        Gender gender = (Gender) obj;
                        int i6 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(gender, "gender");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeGenderAction(gender));
                        ao2 ao2Var2 = welcomeFragment.X0;
                        js3.m(ao2Var2);
                        MyketTextView myketTextView2 = ao2Var2.x;
                        js3.o(myketTextView2, "error");
                        myketTextView2.setVisibility(8);
                        return;
                    default:
                        int i7 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((WelcomeNameData) obj, "<unused var>");
                        welcomeFragment.m1().r(WelcomeAction.SubmitStepAction.INSTANCE);
                        return;
                }
            }
        };
        final int i5 = 4;
        pd9Var.o = new og5(this) { // from class: rd9
            public final /* synthetic */ WelcomeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                int i22 = i5;
                WelcomeFragment welcomeFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p((WelcomeImageData) obj, "<unused var>");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("LIBRARY_PHOTO", welcomeFragment.L(rs6.photo_library)));
                        arrayList.add(new LineMenuItemData("TAKE_PHOTO", welcomeFragment.L(rs6.take_photo)));
                        c5 c5Var = welcomeFragment.V0;
                        if (c5Var == null) {
                            js3.V("accountManager");
                            throw null;
                        }
                        if (c5Var.e()) {
                            arrayList.add(new LineMenuItemData("REMOVE_PHOTO", welcomeFragment.L(rs6.delete_upload_title), sj8.b().A));
                        }
                        pk5.g(welcomeFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(welcomeFragment.l1(), "DIALOG_KEY_LINE_MENU", null, 12), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    case 1:
                        String str = (String) obj;
                        int i42 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        welcomeFragment.m1().r(new WelcomeAction.ChangeNameAction(str));
                        return;
                    case 2:
                        String str2 = (String) obj;
                        int i52 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((qd9) qg5Var, "<unused var>");
                        js3.p(str2, "date");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeDateAction(str2));
                        ao2 ao2Var = welcomeFragment.X0;
                        js3.m(ao2Var);
                        MyketTextView myketTextView = ao2Var.x;
                        js3.o(myketTextView, "error");
                        myketTextView.setVisibility(8);
                        return;
                    case 3:
                        Gender gender = (Gender) obj;
                        int i6 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(gender, "gender");
                        welcomeFragment.m1().r(new WelcomeAction.ChangeGenderAction(gender));
                        ao2 ao2Var2 = welcomeFragment.X0;
                        js3.m(ao2Var2);
                        MyketTextView myketTextView2 = ao2Var2.x;
                        js3.o(myketTextView2, "error");
                        myketTextView2.setVisibility(8);
                        return;
                    default:
                        int i7 = WelcomeFragment.a1;
                        js3.p(view2, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((WelcomeNameData) obj, "<unused var>");
                        welcomeFragment.m1().r(WelcomeAction.SubmitStepAction.INSTANCE);
                        return;
                }
            }
        };
        ao2 ao2Var = this.X0;
        js3.m(ao2Var);
        ao2Var.D.setAdapter(pd9Var);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new WelcomeFragment$onViewCreated$1(null, pd9Var, this));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new WelcomeFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new WelcomeFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new WelcomeFragment$onViewCreated$4(null, pd9Var, this));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new WelcomeFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new WelcomeFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new WelcomeFragment$onViewCreated$7(this, null));
    }

    public final String l1() {
        return dw1.n("WelcomeFragment_", this.H0);
    }

    public final WelcomeViewModel m1() {
        return (WelcomeViewModel) this.Y0.getValue();
    }
}
