package ir.mservices.market.movie.ui.bookmark;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.g;
import defpackage.bp2;
import defpackage.br9;
import defpackage.c24;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.la5;
import defpackage.o79;
import defpackage.p40;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.x79;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.movie.ui.bookmark.FilmBookmarkContentFragment;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class FilmBookmarkContentFragment extends BaseContentFragment {
    public static final /* synthetic */ int V0 = 0;
    public la5 S0;
    public ValueAnimator T0;
    public final o79 U0;

    public FilmBookmarkContentFragment() {
        final FilmBookmarkContentFragment$special$$inlined$viewModels$default$1 filmBookmarkContentFragment$special$$inlined$viewModels$default$1 = new FilmBookmarkContentFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.movie.ui.bookmark.FilmBookmarkContentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) filmBookmarkContentFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.U0 = new o79(g27.a(MovieBookmarkViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.bookmark.FilmBookmarkContentFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.bookmark.FilmBookmarkContentFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.ui.bookmark.FilmBookmarkContentFragment$special$$inlined$viewModels$default$4
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
        String strL = L(rs6.page_name_bookmarks);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final BaseMultiSelectViewModel J0() {
        return (MovieBookmarkViewModel) this.U0.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final List L0() {
        return br9.B((MovieBookmarkViewModel) this.U0.getValue());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_bookmarks);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean W0() {
        return true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = la5.w;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        la5 la5Var = (la5) fa1.c(layoutInflater, js6.multiselect_content_fragment, viewGroup, false);
        this.S0 = la5Var;
        js3.m(la5Var);
        View view = la5Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        ValueAnimator valueAnimator = this.T0;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        this.T0 = null;
        this.S0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void h1(boolean z) {
        if (!z) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(K().getDimensionPixelSize(pq6.tab_height), 0);
            valueAnimatorOfInt.setDuration(150L);
            final int i = 1;
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jc2
                public final /* synthetic */ FilmBookmarkContentFragment b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int i2 = i;
                    FilmBookmarkContentFragment filmBookmarkContentFragment = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = FilmBookmarkContentFragment.V0;
                            js3.p(valueAnimator2, "it");
                            la5 la5Var = filmBookmarkContentFragment.S0;
                            js3.m(la5Var);
                            FrameLayout frameLayout = la5Var.v;
                            Object animatedValue = valueAnimator2.getAnimatedValue();
                            js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            frameLayout.setPadding(0, ((Integer) animatedValue).intValue(), 0, 0);
                            break;
                        default:
                            int i4 = FilmBookmarkContentFragment.V0;
                            js3.p(valueAnimator2, "it");
                            la5 la5Var2 = filmBookmarkContentFragment.S0;
                            js3.m(la5Var2);
                            FrameLayout frameLayout2 = la5Var2.v;
                            Object animatedValue2 = valueAnimator2.getAnimatedValue();
                            js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                            frameLayout2.setPadding(0, ((Integer) animatedValue2).intValue(), 0, 0);
                            break;
                    }
                }
            });
            valueAnimatorOfInt.start();
            this.T0 = valueAnimatorOfInt;
            return;
        }
        ValueAnimator valueAnimator2 = this.T0;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            valueAnimator2.cancel();
        }
        la5 la5Var = this.S0;
        js3.m(la5Var);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(la5Var.v.getPaddingTop(), K().getDimensionPixelSize(pq6.tab_height));
        valueAnimatorOfInt2.setDuration(100L);
        final int i2 = 0;
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jc2
            public final /* synthetic */ FilmBookmarkContentFragment b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                int i22 = i2;
                FilmBookmarkContentFragment filmBookmarkContentFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = FilmBookmarkContentFragment.V0;
                        js3.p(valueAnimator22, "it");
                        la5 la5Var2 = filmBookmarkContentFragment.S0;
                        js3.m(la5Var2);
                        FrameLayout frameLayout = la5Var2.v;
                        Object animatedValue = valueAnimator22.getAnimatedValue();
                        js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        frameLayout.setPadding(0, ((Integer) animatedValue).intValue(), 0, 0);
                        break;
                    default:
                        int i4 = FilmBookmarkContentFragment.V0;
                        js3.p(valueAnimator22, "it");
                        la5 la5Var22 = filmBookmarkContentFragment.S0;
                        js3.m(la5Var22);
                        FrameLayout frameLayout2 = la5Var22.v;
                        Object animatedValue2 = valueAnimator22.getAnimatedValue();
                        js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                        frameLayout2.setPadding(0, ((Integer) animatedValue2).intValue(), 0, 0);
                        break;
                }
            }
        });
        valueAnimatorOfInt2.start();
        this.T0 = valueAnimatorOfInt2;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        if (G().F(rr6.content) instanceof MovieBookmarkRecyclerListFragment) {
            return;
        }
        g gVarG = G();
        gVarG.getClass();
        p40 p40Var = new p40(gVarG);
        int i = rr6.content;
        MovieBookmarkRecyclerListFragment movieBookmarkRecyclerListFragment = new MovieBookmarkRecyclerListFragment();
        movieBookmarkRecyclerListFragment.u0(new Bundle());
        p40Var.k(i, movieBookmarkRecyclerListFragment, null);
        p40Var.e();
    }
}
