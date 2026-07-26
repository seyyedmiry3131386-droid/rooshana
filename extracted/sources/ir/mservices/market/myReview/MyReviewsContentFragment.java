package ir.mservices.market.myReview;

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
import defpackage.bp2;
import defpackage.c24;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lz5;
import defpackage.nd0;
import defpackage.o79;
import defpackage.p3;
import defpackage.q79;
import defpackage.qs3;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import defpackage.xd5;
import defpackage.yq6;
import defpackage.zd5;
import defpackage.zl;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.myReview.MyReviewsContentAction;
import ir.mservices.market.myReview.common.MyReviewType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MyReviewsContentFragment extends BaseContentFragment {
    public static final /* synthetic */ int V0 = 0;
    public zd5 S0;
    public final o79 T0;
    public zl U0;

    public MyReviewsContentFragment() {
        final MyReviewsContentFragment$special$$inlined$viewModels$default$1 myReviewsContentFragment$special$$inlined$viewModels$default$1 = new MyReviewsContentFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myReview.MyReviewsContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) myReviewsContentFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.T0 = new o79(g27.a(MyReviewsContentViewModel.class), new bp2() { // from class: ir.mservices.market.myReview.MyReviewsContentFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myReview.MyReviewsContentFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.myReview.MyReviewsContentFragment$special$$inlined$viewModels$default$4
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
        String strL = L(rs6.page_name_my_reviews);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_myReviews);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = zd5.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        zd5 zd5Var = (zd5) fa1.c(layoutInflater, js6.my_reviews_list, viewGroup, false);
        this.S0 = zd5Var;
        js3.m(zd5Var);
        View view = zd5Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        MyReviewsContentViewModel myReviewsContentViewModelJ1 = j1();
        zd5 zd5Var = this.S0;
        js3.m(zd5Var);
        myReviewsContentViewModelJ1.r(new MyReviewsContentAction.UpdateSelectedPageAction(zd5Var.w.getCurrentItem()));
        zl zlVar = this.U0;
        if (zlVar != null) {
            zd5 zd5Var2 = this.S0;
            js3.m(zd5Var2);
            zd5Var2.w.removeCallbacks(zlVar);
        }
        this.U0 = null;
        this.S0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    public final MyReviewsContentViewModel j1() {
        return (MyReviewsContentViewModel) this.T0.getValue();
    }

    @Override // androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        this.H = true;
        zd5 zd5Var = this.S0;
        js3.m(zd5Var);
        ViewPager2 viewPager2 = zd5Var.w;
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(new lz5(this, j1().z));
        TabLayout tabLayout = zd5Var.v;
        new ai0(tabLayout, viewPager2, new qs3(23, this)).m();
        int iOrdinal = ((MyReviewType) j1().z.get(((Number) j1().w.a.getValue()).intValue())).ordinal();
        nd0 nd0Var = new nd0(2, this);
        tabLayout.a(nd0Var);
        b bVarJ = tabLayout.j(iOrdinal);
        if (bVarJ != null) {
            nd0Var.b(bVarJ);
        }
        zl zlVar = new zl(iOrdinal, 7, zd5Var);
        viewPager2.post(zlVar);
        this.U0 = zlVar;
        zd5 zd5Var2 = this.S0;
        js3.m(zd5Var2);
        TabLayout tabLayout2 = zd5Var2.v;
        tabLayout2.setTabTextColors(sj8.b().n, sj8.b().c);
        Resources resources = tabLayout2.getResources();
        js3.o(resources, "getResources(...)");
        Drawable drawableK = p3.k(resources, yq6.tab_indicator);
        drawableK.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        tabLayout2.setSelectedTabIndicator(drawableK);
        tabLayout2.setTabRippleColor(ColorStateList.valueOf(p3.a(sj8.b().O.c, 12)));
    }

    public final void onEvent(xd5 xd5Var) {
        js3.p(xd5Var, "event");
        zd5 zd5Var = this.S0;
        js3.m(zd5Var);
        zd5Var.w.setCurrentItem(1, true);
    }
}
