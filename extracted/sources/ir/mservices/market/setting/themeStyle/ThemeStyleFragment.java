package ir.mservices.market.setting.themeStyle;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bp2;
import defpackage.bt5;
import defpackage.c24;
import defpackage.cc7;
import defpackage.co1;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.fa2;
import defpackage.g27;
import defpackage.j71;
import defpackage.jk8;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k04;
import defpackage.kh2;
import defpackage.nk8;
import defpackage.nw7;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qj8;
import defpackage.qz6;
import defpackage.rn8;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t32;
import defpackage.ts5;
import defpackage.ue7;
import defpackage.x79;
import defpackage.yu7;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.setting.themeStyle.ThemeStyleAction;
import ir.mservices.market.views.TryAgainView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ThemeStyleFragment extends Hilt_ThemeStyleFragment {
    public static final /* synthetic */ int Z0 = 0;
    public nk8 V0;
    public jk8 W0;
    public final o79 X0;
    public final c24 Y0;

    public ThemeStyleFragment() {
        final ThemeStyleFragment$special$$inlined$viewModels$default$1 themeStyleFragment$special$$inlined$viewModels$default$1 = new ThemeStyleFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.setting.themeStyle.ThemeStyleFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) themeStyleFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(ThemeStyleViewModel.class), new bp2() { // from class: ir.mservices.market.setting.themeStyle.ThemeStyleFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.setting.themeStyle.ThemeStyleFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.setting.themeStyle.ThemeStyleFragment$special$$inlined$viewModels$default$4
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
        this.Y0 = a.a(new yu7(8, this));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_theme_style);
        js3.o(string, "getString(...)");
        return string;
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

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            nk8 nk8Var = this.V0;
            if (nk8Var != null) {
                rn8Var.z(nk8Var.l);
            } else {
                js3.V("toolbarBinding");
                throw null;
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = jk8.D;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        this.W0 = (jk8) fa1.c(layoutInflater, js6.theme_style_fragment, viewGroup, false);
        int i2 = nk8.z;
        nk8 nk8Var = (nk8) fa1.c(layoutInflater, js6.theme_style_toolbar_view, viewGroup, false);
        js3.o(nk8Var, "inflate(...)");
        this.V0 = nk8Var;
        jk8 jk8Var = this.W0;
        js3.m(jk8Var);
        View view = jk8Var.l;
        js3.o(view, "getRoot(...)");
        view.setLayoutDirection(this.F0.c());
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        k1().r(ThemeStyleAction.SetThemeAction.INSTANCE);
        t32.b().g(new k04(-1, -1));
        t32.b().g(new qj8());
        super.b0();
        this.W0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        jk8 jk8Var = this.W0;
        js3.m(jk8Var);
        ConstraintLayout constraintLayout = jk8Var.x;
        cc7.d(constraintLayout, 0, 0, 0, 7);
        constraintLayout.requestLayout();
        nk8 nk8Var = this.V0;
        if (nk8Var == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        ImageView imageView = nk8Var.v;
        imageView.setColorFilter(new PorterDuffColorFilter(sj8.b().R, PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ue7(5, this));
        SpannableString spannableString = new SpannableString(K().getString(rs6.menu_item_application_color));
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.c.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(K().getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 33);
        nk8 nk8Var2 = this.V0;
        if (nk8Var2 == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        nk8Var2.w.setText(spannableString);
        jk8 jk8Var2 = this.W0;
        js3.m(jk8Var2);
        TryAgainView tryAgainView = jk8Var2.C;
        tryAgainView.setPrimaryColor(sj8.b().c, sj8.b().d);
        tryAgainView.setColors(sj8.b().p);
        tryAgainView.t();
        c24 c24Var = this.Y0;
        fa2 fa2Var = new fa2(((Number) c24Var.getValue()).intValue(), 10);
        fa2Var.m = new ts5(26, this);
        jk8 jk8Var3 = this.W0;
        js3.m(jk8Var3);
        RecyclerView recyclerView = jk8Var3.y;
        Context context = recyclerView.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().P;
        ea7Var.h = 0;
        ea7Var.c(recyclerView.getResources().getDimensionPixelSize(pq6.space_24));
        recyclerView.setBackground(ea7Var.a());
        recyclerView.setLayoutManager(new MyketGridLayoutManager(((Number) c24Var.getValue()).intValue()));
        recyclerView.setAdapter(fa2Var);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(pq6.space_2);
        recyclerView.i(new co1(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, ((Number) c24Var.getValue()).intValue(), this.F0.f()));
        qz6 itemAnimator = recyclerView.getItemAnimator();
        nw7 nw7Var = itemAnimator instanceof nw7 ? (nw7) itemAnimator : null;
        if (nw7Var != null) {
            nw7Var.g = false;
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ThemeStyleFragment$onViewCreated$5(this, fa2Var, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ThemeStyleFragment$onViewCreated$6(this, fa2Var, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ThemeStyleFragment$onViewCreated$7(this, view, null));
    }

    public final ThemeStyleViewModel k1() {
        return (ThemeStyleViewModel) this.X0.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        super.onEvent(qj8Var);
        jk8 jk8Var = this.W0;
        js3.m(jk8Var);
        RecyclerView recyclerView = jk8Var.y;
        jk8 jk8Var2 = this.W0;
        js3.m(jk8Var2);
        recyclerView.setAdapter(jk8Var2.y.getAdapter());
    }
}
