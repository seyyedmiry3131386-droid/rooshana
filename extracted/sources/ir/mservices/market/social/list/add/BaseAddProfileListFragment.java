package ir.mservices.market.social.list.add;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import defpackage.b77;
import defpackage.bd;
import defpackage.bp2;
import defpackage.bt5;
import defpackage.c24;
import defpackage.dt2;
import defpackage.dv2;
import defpackage.fa1;
import defpackage.g27;
import defpackage.g85;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k12;
import defpackage.lw8;
import defpackage.mm2;
import defpackage.n;
import defpackage.o79;
import defpackage.p40;
import defpackage.pk5;
import defpackage.q39;
import defpackage.q79;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s40;
import defpackage.sj8;
import defpackage.t40;
import defpackage.t50;
import defpackage.t61;
import defpackage.wk2;
import defpackage.x79;
import defpackage.yq2;
import defpackage.yq6;
import ir.mservices.market.appDetail.SingleActionToolbarView;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.list.common.ProfileSearchView;
import ir.mservices.market.social.list.items.SelectedItemsAction;
import ir.mservices.market.social.list.items.SelectedItemsFragment;
import ir.mservices.market.social.list.items.SelectedItemsViewModel;
import ir.mservices.market.social.list.search.SearchProfileListFragment;
import ir.mservices.market.social.list.search.SearchProfileListViewModel;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.MyketEditText;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAddProfileListFragment extends Hilt_BaseAddProfileListFragment implements mm2 {
    public static final /* synthetic */ int c1 = 0;
    public lw8 V0;
    public dv2 W0;
    public final o79 X0;
    public final o79 Y0;
    public wk2 Z0;
    public SingleActionToolbarView a1;
    public boolean b1;

    public BaseAddProfileListFragment() {
        final BaseAddProfileListFragment$special$$inlined$viewModels$default$1 baseAddProfileListFragment$special$$inlined$viewModels$default$1 = new BaseAddProfileListFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) baseAddProfileListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(SearchProfileListViewModel.class), new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$4
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
        final BaseAddProfileListFragment$special$$inlined$viewModels$default$6 baseAddProfileListFragment$special$$inlined$viewModels$default$6 = new BaseAddProfileListFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) baseAddProfileListFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.Y0 = new o79(g27.a(SelectedItemsViewModel.class), new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$10
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
        }, new bp2() { // from class: ir.mservices.market.social.list.add.BaseAddProfileListFragment$special$$inlined$viewModels$default$9
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

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(n1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_EXIT".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a) {
                this.J0.q();
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        SearchProfileListFragment searchProfileListFragmentR1 = r1();
        d dVarF = G().F(rr6.search_fragment);
        if (dVarF == null || dVarF.getClass() != SearchProfileListFragment.class) {
            g gVarG = G();
            gVarG.getClass();
            p40 p40Var = new p40(gVarG);
            p40Var.k(rr6.search_fragment, searchProfileListFragmentR1, null);
            p40Var.e();
        }
        SelectedItemsFragment selectedItemsFragmentP1 = p1();
        d dVarF2 = G().F(rr6.selected_list_fragment);
        if (dVarF2 == null || dVarF2.getClass() != SelectedItemsFragment.class) {
            g gVarG2 = G();
            gVarG2.getClass();
            p40 p40Var2 = new p40(gVarG2);
            p40Var2.k(rr6.selected_list_fragment, selectedItemsFragmentP1, null);
            p40Var2.e();
        }
        wk2 wk2Var = this.Z0;
        js3.m(wk2Var);
        ProfileSearchView profileSearchView = wk2Var.x;
        n nVar = new n(15, this);
        profileSearchView.getClass();
        MyketEditText myketEditText = profileSearchView.s.x;
        js3.o(myketEditText, "searchInput");
        myketEditText.addTextChangedListener(new g85(1, profileSearchView, nVar));
        profileSearchView.setText((String) ((SearchProfileListViewModel) this.X0.getValue()).z.a.getValue());
        profileSearchView.setOnClearClickListener(new t50(this, 0));
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            rn8Var.z(this.a1);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = wk2.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        boolean z = false;
        this.Z0 = (wk2) fa1.c(layoutInflater, js6.fragment_add_custom_list, viewGroup, false);
        if (yq2.n0(H())) {
            dv2 dv2Var = this.W0;
            if (dv2Var == null) {
                js3.V("graphicUtils");
                throw null;
            }
            if (dv2Var.c() == 2) {
                z = true;
            }
        }
        this.b1 = z;
        wk2 wk2Var = this.Z0;
        js3.m(wk2Var);
        return wk2Var.l;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(n1());
        this.Z0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        return k1();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        SingleActionToolbarView singleActionToolbarView;
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(n1(), this);
        FragmentActivity fragmentActivityF = F();
        int i = 0;
        AttributeSet attributeSet = null;
        if (fragmentActivityF != null) {
            singleActionToolbarView = new SingleActionToolbarView(fragmentActivityF, attributeSet, 6, i);
            singleActionToolbarView.setVisibility(8);
            singleActionToolbarView.setBackgroundColor(sj8.b().l);
        } else {
            singleActionToolbarView = null;
        }
        this.a1 = singleActionToolbarView;
        t1().r(new SelectedItemsAction.Init(v1()));
        wk2 wk2Var = this.Z0;
        js3.m(wk2Var);
        k12 k12Var = wk2Var.v;
        js3.o(k12Var, "emptyView");
        u1(k12Var);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseAddProfileListFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseAddProfileListFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseAddProfileListFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseAddProfileListFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseAddProfileListFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseAddProfileListFragment$onViewCreated$7(this, null));
    }

    public final yq2 k1() {
        s40 s40Var = s40.g;
        if (!this.b1) {
            wk2 wk2Var = this.Z0;
            js3.m(wk2Var);
            FrameLayout frameLayout = wk2Var.w;
            js3.o(frameLayout, "searchFragment");
            if (frameLayout.getVisibility() == 0) {
                l1();
                return s40Var;
            }
        }
        if (((List) t1().B.a.getValue()).isEmpty()) {
            return t40.g;
        }
        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(n1(), "DIALOG_KEY_EXIT", null, 12), null, L(rs6.profile_list_exit_notice_message), L(rs6.profile_list_exit_notice_commit), L(rs6.profile_list_exit_notice_cancel), true)), -1);
        return s40Var;
    }

    @Override // androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        Drawable drawable;
        int i = 1;
        this.H = true;
        wk2 wk2Var = this.Z0;
        js3.m(wk2Var);
        ProfileSearchView profileSearchView = wk2Var.x;
        js3.o(profileSearchView, "searchView");
        wk2 wk2Var2 = this.Z0;
        js3.m(wk2Var2);
        FrameLayout frameLayout = wk2Var2.w;
        js3.o(frameLayout, "searchFragment");
        profileSearchView.setVisibility((frameLayout.getVisibility() == 0 || this.b1) ? 0 : 8);
        SingleActionToolbarView singleActionToolbarView = this.a1;
        if (singleActionToolbarView != null) {
            singleActionToolbarView.setVisibility(0);
            singleActionToolbarView.setButtonVisibility(true);
            singleActionToolbarView.setBackClickListener(new t50(this, i));
            Resources resources = singleActionToolbarView.getResources();
            js3.o(resources, "getResources(...)");
            int i2 = yq6.ic_action_back;
            try {
                drawable = q39.a(resources, i2, null);
                if (drawable == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable = resources.getDrawable(i2, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            singleActionToolbarView.setBackIconDrawable(drawable);
            singleActionToolbarView.setButtonClickListener(new t50(this, 2));
        }
        w1();
    }

    public final void l1() {
        wk2 wk2Var = this.Z0;
        js3.m(wk2Var);
        FrameLayout frameLayout = wk2Var.w;
        js3.o(frameLayout, "searchFragment");
        frameLayout.setVisibility(8);
        wk2 wk2Var2 = this.Z0;
        js3.m(wk2Var2);
        ProfileSearchView profileSearchView = wk2Var2.x;
        profileSearchView.setText("");
        profileSearchView.setVisibility(8);
        w1();
        if (this.V0 == null) {
            js3.V("uiUtils");
            throw null;
        }
        wk2 wk2Var3 = this.Z0;
        js3.m(wk2Var3);
        lw8.a(wk2Var3.x);
    }

    public abstract DialogDataModel m1();

    public final String n1() {
        return t61.j(getClass().getSimpleName(), "_", this.H0);
    }

    public abstract String o1(int i);

    public abstract SelectedItemsFragment p1();

    public abstract SelectedItemsAction q1();

    public abstract SearchProfileListFragment r1();

    public abstract String s1(String str);

    public final SelectedItemsViewModel t1() {
        return (SelectedItemsViewModel) this.Y0.getValue();
    }

    public abstract void u1(k12 k12Var);

    public abstract boolean v1();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w1() {
        /*
            r3 = this;
            ir.mservices.market.appDetail.SingleActionToolbarView r0 = r3.a1
            if (r0 == 0) goto L2a
            boolean r1 = r3.b1
            if (r1 != 0) goto L21
            wk2 r1 = r3.Z0
            defpackage.js3.m(r1)
            android.widget.FrameLayout r1 = r1.w
            java.lang.String r2 = "searchFragment"
            defpackage.js3.o(r1, r2)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L21
            int r1 = defpackage.rs6.confirm
            java.lang.String r1 = r3.L(r1)
            goto L27
        L21:
            int r1 = defpackage.rs6.save
            java.lang.String r1 = r3.L(r1)
        L27:
            r0.setButtonText(r1)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.list.add.BaseAddProfileListFragment.w1():void");
    }
}
