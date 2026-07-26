package ir.mservices.market.reels.home.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.k;
import defpackage.bp2;
import defpackage.c24;
import defpackage.ds6;
import defpackage.g27;
import defpackage.i17;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lm;
import defpackage.o79;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketStaggeredLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.reels.home.data.ReelsHomeDisplayMode;
import ir.mservices.market.reels.home.ui.ReelsHomeFragment;
import ir.mservices.market.reels.home.ui.recycler.ReelHomeData;
import ir.mservices.market.reels.ui.ReelsActivity;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsHomeFragment extends Hilt_ReelsHomeFragment {
    public static final /* synthetic */ int j1 = 0;
    public final o79 i1;

    public ReelsHomeFragment() {
        final ReelsHomeFragment$special$$inlined$viewModels$default$1 reelsHomeFragment$special$$inlined$viewModels$default$1 = new ReelsHomeFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.reels.home.ui.ReelsHomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) reelsHomeFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(ReelsHomeViewModel.class), new bp2() { // from class: ir.mservices.market.reels.home.ui.ReelsHomeFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.reels.home.ui.ReelsHomeFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.reels.home.ui.ReelsHomeFragment$special$$inlined$viewModels$default$4
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
        String string = K().getString(rs6.page_name_reels_home);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = K().getString(rs6.reels);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(v1(), 7);
        final int i = 0;
        lmVar.m = new og5(this) { // from class: h17
            public final /* synthetic */ ReelsHomeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                ReelsHomeFragment reelsHomeFragment = this.b;
                switch (i2) {
                    case 0:
                        ReelHomeData reelHomeData = (ReelHomeData) obj;
                        int i3 = ReelsHomeFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((r17) qg5Var, "<unused var>");
                        js3.p(reelHomeData, "recyclerData");
                        Intent intent = new Intent(reelsHomeFragment.F(), (Class<?>) ReelsActivity.class);
                        intent.putExtra("reel_dto", reelHomeData.a);
                        reelsHomeFragment.y0(intent);
                        break;
                    default:
                        ReelHomeData reelHomeData2 = (ReelHomeData) obj;
                        int i4 = ReelsHomeFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((q17) qg5Var, "<unused var>");
                        js3.p(reelHomeData2, "recyclerData");
                        Intent intent2 = new Intent(reelsHomeFragment.F(), (Class<?>) ReelsActivity.class);
                        intent2.putExtra("reel_dto", reelHomeData2.a);
                        reelsHomeFragment.y0(intent2);
                        break;
                }
            }
        };
        final int i2 = 1;
        lmVar.n = new og5(this) { // from class: h17
            public final /* synthetic */ ReelsHomeFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                ReelsHomeFragment reelsHomeFragment = this.b;
                switch (i22) {
                    case 0:
                        ReelHomeData reelHomeData = (ReelHomeData) obj;
                        int i3 = ReelsHomeFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((r17) qg5Var, "<unused var>");
                        js3.p(reelHomeData, "recyclerData");
                        Intent intent = new Intent(reelsHomeFragment.F(), (Class<?>) ReelsActivity.class);
                        intent.putExtra("reel_dto", reelHomeData.a);
                        reelsHomeFragment.y0(intent);
                        break;
                    default:
                        ReelHomeData reelHomeData2 = (ReelHomeData) obj;
                        int i4 = ReelsHomeFragment.j1;
                        js3.p(view, "<unused var>");
                        js3.p((q17) qg5Var, "<unused var>");
                        js3.p(reelHomeData2, "recyclerData");
                        Intent intent2 = new Intent(reelsHomeFragment.F(), (Class<?>) ReelsActivity.class);
                        intent2.putExtra("reel_dto", reelHomeData2.a);
                        reelsHomeFragment.y0(intent2);
                        break;
                }
            }
        };
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ReelsHomeFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final k k1() {
        MyketStaggeredLayoutManager myketStaggeredLayoutManager = new MyketStaggeredLayoutManager(v1());
        myketStaggeredLayoutManager.N = u1();
        return myketStaggeredLayoutManager;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (ReelsHomeViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final /* bridge */ /* synthetic */ h t1() {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.space_s);
        return new PaddingLayoutManager$Padding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        ReelsHomeDisplayMode reelsHomeDisplayMode = (ReelsHomeDisplayMode) ((ReelsHomeViewModel) this.i1.getValue()).y.a.getValue();
        int i = reelsHomeDisplayMode == null ? -1 : i17.a[reelsHomeDisplayMode.ordinal()];
        if (i == -1) {
            return 1;
        }
        if (i == 1) {
            return K().getInteger(ds6.reels_home_page_max_span_large);
        }
        if (i == 2) {
            return K().getInteger(ds6.reels_home_page_max_span_small);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int w1() {
        return sj8.b().j;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int x1() {
        return sj8.b().k;
    }
}
