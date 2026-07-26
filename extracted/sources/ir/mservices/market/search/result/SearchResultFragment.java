package ir.mservices.market.search.result;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import defpackage.ai0;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.fa1;
import defpackage.g27;
import defpackage.gj7;
import defpackage.hj7;
import defpackage.ij7;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.m88;
import defpackage.o06;
import defpackage.o79;
import defpackage.p3;
import defpackage.pm2;
import defpackage.q79;
import defpackage.sj8;
import defpackage.ts5;
import defpackage.x79;
import defpackage.yq6;
import defpackage.yw6;
import defpackage.zl;
import ir.mservices.market.search.common.SearchType;
import ir.mservices.market.search.history.ui.SearchViewModel;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchResultFragment extends Hilt_SearchResultFragment {
    public static final /* synthetic */ int R0 = 0;
    public lw8 M0;
    public pm2 N0;
    public final bi5 O0 = new bi5(g27.a(ij7.class), new yw6(13, this));
    public final o79 P0;
    public zl Q0;

    public SearchResultFragment() {
        final o06 o06Var = new o06(23, this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.search.result.SearchResultFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) o06Var.invoke();
            }
        });
        this.P0 = new o79(g27.a(SearchViewModel.class), new bp2() { // from class: ir.mservices.market.search.result.SearchResultFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.search.result.SearchResultFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.search.result.SearchResultFragment$special$$inlined$viewModels$default$3
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

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = pm2.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        pm2 pm2Var = (pm2) fa1.c(layoutInflater, js6.fragment_search_result, viewGroup, false);
        this.N0 = pm2Var;
        js3.m(pm2Var);
        View view = pm2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        zl zlVar = this.Q0;
        if (zlVar != null) {
            pm2 pm2Var = this.N0;
            js3.m(pm2Var);
            pm2Var.w.removeCallbacks(zlVar);
        }
        this.Q0 = null;
        this.N0 = null;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        pm2 pm2Var = this.N0;
        js3.m(pm2Var);
        ViewPager2 viewPager2 = pm2Var.w;
        TabLayout tabLayout = pm2Var.v;
        tabLayout.setTabTextColors(sj8.b().n, sj8.b().c);
        Resources resources = tabLayout.getResources();
        js3.o(resources, "getResources(...)");
        Drawable drawableK = p3.k(resources, yq6.tab_indicator);
        drawableK.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        tabLayout.setSelectedTabIndicator(drawableK);
        tabLayout.setTabRippleColor(ColorStateList.valueOf(p3.a(sj8.b().O.c, 12)));
        bi5 bi5Var = this.O0;
        String str = ((ij7) bi5Var.getValue()).c;
        if (str == null) {
            str = "APP";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        String str2 = ((ij7) bi5Var.getValue()).a;
        String str3 = str2 == null ? "" : str2;
        String str4 = ((ij7) bi5Var.getValue()).b;
        String str5 = str4 == null ? "" : str4;
        int i = ((ij7) bi5Var.getValue()).d;
        o79 o79Var = this.P0;
        gj7 gj7Var = new gj7(this, lowerCase, str3, str5, i, ((SearchViewModel) o79Var.getValue()).L);
        int i2 = 1;
        if (m88.T((String) ((SearchViewModel) o79Var.getValue()).E.a.getValue(), "APP", true)) {
            SearchType searchType = SearchType.b;
            i2 = 0;
        } else {
            SearchType searchType2 = SearchType.b;
        }
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setAdapter(gj7Var);
        new ai0(tabLayout, viewPager2, new ts5(13, this)).m();
        hj7 hj7Var = new hj7(gj7Var, this, lowerCase);
        tabLayout.a(hj7Var);
        b bVarJ = tabLayout.j(i2);
        if (bVarJ != null) {
            hj7Var.b(bVarJ);
        }
        zl zlVar = new zl(i2, 9, pm2Var);
        viewPager2.post(zlVar);
        this.Q0 = zlVar;
    }
}
