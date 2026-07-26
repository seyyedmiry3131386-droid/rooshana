package ir.mservices.market.myAccount.city;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.b77;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cc7;
import defpackage.d16;
import defpackage.ds6;
import defpackage.em7;
import defpackage.fa1;
import defpackage.fa2;
import defpackage.fs0;
import defpackage.g27;
import defpackage.gp;
import defpackage.hs0;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ts5;
import defpackage.ud4;
import defpackage.ue7;
import defpackage.x79;
import defpackage.yq6;
import defpackage.yw6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.BindAutoCompleteView;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectCityFragment extends Hilt_SelectCityFragment {
    public static final /* synthetic */ int n1 = 0;
    public lw8 i1;
    public final bi5 j1 = new bi5(g27.a(em7.class), new yw6(14, this));
    public final o79 k1;
    public hs0 l1;
    public fs0 m1;

    public SelectCityFragment() {
        final SelectCityFragment$special$$inlined$viewModels$default$1 selectCityFragment$special$$inlined$viewModels$default$1 = new SelectCityFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myAccount.city.SelectCityFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) selectCityFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(SelectCityViewModel.class), new bp2() { // from class: ir.mservices.market.myAccount.city.SelectCityFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.city.SelectCityFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myAccount.city.SelectCityFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_city);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.city);
        js3.o(string, "getString(...)");
        return string;
    }

    public final SelectCityViewModel Q1() {
        return (SelectCityViewModel) this.k1.getValue();
    }

    public final lw8 R1() {
        lw8 lw8Var = this.i1;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        Window window;
        super.T(bundle);
        hs0 hs0Var = this.l1;
        js3.m(hs0Var);
        hs0Var.v.requestFocus();
        R1();
        hs0 hs0Var2 = this.l1;
        js3.m(hs0Var2);
        BindAutoCompleteView bindAutoCompleteView = hs0Var2.v;
        js3.o(bindAutoCompleteView, "city");
        Object systemService = bindAutoCompleteView.getContext().getSystemService("input_method");
        js3.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(bindAutoCompleteView, 1);
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF == null || (window = fragmentActivityF.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable drawable;
        js3.p(layoutInflater, "inflater");
        View viewZ = super.Z(layoutInflater, viewGroup, bundle);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewZ != null ? viewZ.getContext() : null);
        int i = hs0.w;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        this.l1 = (hs0) fa1.c(layoutInflaterFrom, js6.city_header, viewGroup, false);
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(viewZ != null ? viewZ.getContext() : null);
        int i2 = fs0.w;
        fs0 fs0Var = (fs0) fa1.c(layoutInflaterFrom2, js6.city_footer, viewGroup, false);
        cc7.c(K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_xl), 10, fs0Var.l);
        this.m1 = fs0Var;
        hs0 hs0Var = this.l1;
        js3.m(hs0Var);
        BindAutoCompleteView bindAutoCompleteView = hs0Var.v;
        bindAutoCompleteView.setTextColor(sj8.b().m);
        Resources resources = bindAutoCompleteView.getResources();
        js3.o(resources, "getResources(...)");
        int i3 = yq6.ic_location;
        try {
            drawable = q39.a(resources, i3, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i3, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i3, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().m, PorterDuff.Mode.MULTIPLY));
        bindAutoCompleteView.setCompoundDrawablesRelative(null, null, drawable, null);
        bindAutoCompleteView.addTextChangedListener(new a(this));
        bindAutoCompleteView.setOnEditorActionListener(new ud4(4, this));
        js3.n(viewZ, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewZ;
        hs0 hs0Var2 = this.l1;
        js3.m(hs0Var2);
        constraintLayout.addView(hs0Var2.l);
        fs0 fs0Var2 = this.m1;
        js3.m(fs0Var2);
        View view = fs0Var2.l;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.l = 0;
        constraintLayout.addView(view, layoutParams);
        fs0 fs0Var3 = this.m1;
        js3.m(fs0Var3);
        fs0Var3.v.setOnClickListener(new ue7(1, this));
        return viewZ;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        Window window;
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null && (window = fragmentActivityF.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        R1();
        lw8.b(F());
        R1();
        hs0 hs0Var = this.l1;
        js3.m(hs0Var);
        lw8.a(hs0Var.v);
        this.l1 = null;
        this.m1 = null;
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        fa2 fa2Var = new fa2(v1(), 6);
        fa2Var.m = new ts5(16, this);
        return fa2Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SelectCityFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SelectCityFragment$onViewCreated$2(this, null));
        y1().j(new gp(18, this));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return Q1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new d16(K().getDimensionPixelSize(pq6.space_12) + K().getDimensionPixelSize(pq6.bottom_padding), (K().getDimensionPixelSize(pq6.space_xl) * 2) + K().getDimensionPixelSize(pq6.big_button_height), dimensionPixelSize, dimensionPixelSize, 0, K().getDimensionPixelSize(pq6.review_detail_horizontal_item_space), v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.city_max_span);
    }
}
