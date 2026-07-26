package ir.mservices.market.app.bookmark;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import defpackage.ai0;
import defpackage.bp2;
import defpackage.br9;
import defpackage.c24;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lz5;
import defpackage.md0;
import defpackage.nd0;
import defpackage.o79;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.v4;
import defpackage.vd0;
import defpackage.x79;
import defpackage.yq6;
import defpackage.zl;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.app.bookmark.BookmarkContentAction;
import ir.mservices.market.app.bookmark.common.BookmarkType;
import ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkContentFragment extends BaseContentFragment {
    public static final /* synthetic */ int X0 = 0;
    public vd0 S0;
    public final o79 T0;
    public final o79 U0;
    public final o79 V0;
    public zl W0;

    public BookmarkContentFragment() {
        final BookmarkContentFragment$special$$inlined$viewModels$default$1 bookmarkContentFragment$special$$inlined$viewModels$default$1 = new BookmarkContentFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) bookmarkContentFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.T0 = new o79(g27.a(AppBookmarkViewModel.class), new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$4
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
        final BookmarkContentFragment$special$$inlined$viewModels$default$6 bookmarkContentFragment$special$$inlined$viewModels$default$6 = new BookmarkContentFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) bookmarkContentFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.U0 = new o79(g27.a(MovieBookmarkViewModel.class), new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$10
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
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$9
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
        final BookmarkContentFragment$special$$inlined$viewModels$default$11 bookmarkContentFragment$special$$inlined$viewModels$default$11 = new BookmarkContentFragment$special$$inlined$viewModels$default$11(this);
        final c24 c24VarB3 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$12
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) bookmarkContentFragment$special$$inlined$viewModels$default$11.invoke();
            }
        });
        this.V0 = new o79(g27.a(BookmarkViewModel.class), new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB3.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$15
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB3.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.BookmarkContentFragment$special$$inlined$viewModels$default$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB3.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_bookmarks);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final BaseMultiSelectViewModel J0() {
        List list = j1().x;
        vd0 vd0Var = this.S0;
        js3.m(vd0Var);
        return md0.a[((BookmarkType) list.get(vd0Var.w.getCurrentItem())).ordinal()] == 1 ? (AppBookmarkViewModel) this.T0.getValue() : (MovieBookmarkViewModel) this.U0.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final ViewGroup.LayoutParams K0() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, K().getDimensionPixelSize(pq6.tab_height));
        layoutParams.addRule(10);
        layoutParams.addRule(8, rr6.indicator);
        return layoutParams;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final List L0() {
        return br9.C((AppBookmarkViewModel) this.T0.getValue(), (MovieBookmarkViewModel) this.U0.getValue());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_bookmarks);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = vd0.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        vd0 vd0Var = (vd0) fa1.c(layoutInflater, js6.bookmarks_list, viewGroup, false);
        this.S0 = vd0Var;
        View view = vd0Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        BookmarkViewModel bookmarkViewModelJ1 = j1();
        vd0 vd0Var = this.S0;
        js3.m(vd0Var);
        bookmarkViewModelJ1.r(new BookmarkContentAction.UpdateSelectedPageAction(vd0Var.w.getCurrentItem()));
        zl zlVar = this.W0;
        if (zlVar != null) {
            vd0 vd0Var2 = this.S0;
            js3.m(vd0Var2);
            vd0Var2.w.removeCallbacks(zlVar);
        }
        this.W0 = null;
        this.S0 = null;
    }

    public final BookmarkViewModel j1() {
        return (BookmarkViewModel) this.V0.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        Iterator it = L0().iterator();
        while (it.hasNext()) {
            ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BookmarkContentFragment$onViewCreated$1$1((BaseMultiSelectViewModel) it.next(), this, null));
        }
    }

    @Override // androidx.fragment.app.d
    public final void l0(Bundle bundle) {
        this.H = true;
        vd0 vd0Var = this.S0;
        js3.m(vd0Var);
        ViewPager2 viewPager2 = vd0Var.w;
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(new lz5(this, j1().x));
        TabLayout tabLayout = vd0Var.v;
        new ai0(tabLayout, viewPager2, new v4(9, this)).m();
        int iOrdinal = ((BookmarkType) j1().x.get(((Number) j1().w.a.getValue()).intValue())).ordinal();
        nd0 nd0Var = new nd0(0, this);
        tabLayout.a(nd0Var);
        b bVarJ = tabLayout.j(iOrdinal);
        if (bVarJ != null) {
            nd0Var.b(bVarJ);
        }
        zl zlVar = new zl(iOrdinal, 3, vd0Var);
        viewPager2.post(zlVar);
        this.W0 = zlVar;
        vd0 vd0Var2 = this.S0;
        js3.m(vd0Var2);
        TabLayout tabLayout2 = vd0Var2.v;
        tabLayout2.setTabTextColors(sj8.b().n, sj8.b().c);
        Resources resources = tabLayout2.getResources();
        js3.o(resources, "getResources(...)");
        Drawable drawableK = p3.k(resources, yq6.tab_indicator);
        drawableK.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        tabLayout2.setSelectedTabIndicator(drawableK);
        tabLayout2.setTabRippleColor(ColorStateList.valueOf(p3.a(sj8.b().O.c, 12)));
    }
}
