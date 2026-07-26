package ir.mservices.market.movie.ui.home;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.ba7;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.d56;
import defpackage.ds6;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.l35;
import defpackage.lk2;
import defpackage.lu7;
import defpackage.nb3;
import defpackage.o79;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qa3;
import defpackage.s7;
import defpackage.x79;
import ir.mservices.market.movie.ui.home.MovieHomeAction;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HomeFragment extends Hilt_HomeFragment {
    public static final /* synthetic */ int z1 = 0;
    public qa3 u1;
    public d56 v1;
    public lu7 w1;
    public lk2 x1;
    public final o79 y1;

    public HomeFragment() {
        final HomeFragment$special$$inlined$viewModels$default$1 homeFragment$special$$inlined$viewModels$default$1 = new HomeFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.movie.ui.home.HomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) homeFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.y1 = new o79(g27.a(MovieHomeViewModel.class), new bp2() { // from class: ir.mservices.market.movie.ui.home.HomeFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.ui.home.HomeFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.ui.home.HomeFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean M1() {
        return y1().computeVerticalScrollOffset() != 0;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void b0() throws Exception {
        super.b0();
        lk2 lk2Var = this.x1;
        if (lk2Var != null) {
            lk2Var.b();
        }
        this.x1 = null;
    }

    public final qa3 e2() {
        qa3 qa3Var = this.u1;
        if (qa3Var != null) {
            return qa3Var;
        }
        js3.V("homeAnalytics");
        throw null;
    }

    public abstract String f2();

    public final MovieHomeViewModel g2() {
        return (MovieHomeViewModel) this.y1.getValue();
    }

    public abstract boolean h2();

    public abstract boolean i2();

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        l35 l35Var = new l35(p3.g(F()), this.F0.f(), v1());
        l35Var.r = new nb3(this, 2);
        l35Var.u = new nb3(this, 5);
        l35Var.v = new nb3(this, 6);
        l35Var.n = new nb3(this, 7);
        l35Var.w = new nb3(this, 8);
        l35Var.l = new nb3(this, 9);
        l35Var.m = new nb3(this, 10);
        l35Var.x = new nb3(this, 11);
        l35Var.p = new nb3(this, 1);
        l35Var.o = new nb3(this, 3);
        l35Var.q = new nb3(this, 4);
        return l35Var;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        g2().B = f2();
        super.k0(view, bundle);
        g2().r(new MovieHomeAction.InitAction(h2()));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new HomeFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new HomeFragment$onViewCreated$2(this, null));
        this.x1 = (lk2) n0(new nb3(this, 0), new s7(1));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return g2();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int n1() {
        return K().getDimensionPixelSize(pq6.actionbar_size) + (this instanceof ba7 ? K().getDimensionPixelSize(pq6.bottom_navigation_height) : 0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_m), 0, K().getDimensionPixelSize(pq6.space_m), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.movie_home_max_span);
    }
}
