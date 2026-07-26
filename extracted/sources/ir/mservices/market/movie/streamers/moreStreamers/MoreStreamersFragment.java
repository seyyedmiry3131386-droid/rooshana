package ir.mservices.market.movie.streamers.moreStreamers;

import androidx.recyclerview.widget.h;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dy4;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.o79;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs3;
import defpackage.rs6;
import defpackage.t61;
import defpackage.x79;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreStreamersFragment extends Hilt_MoreStreamersFragment {
    public static final /* synthetic */ int j1 = 0;
    public final o79 i1;

    public MoreStreamersFragment() {
        final MoreStreamersFragment$special$$inlined$viewModels$default$1 moreStreamersFragment$special$$inlined$viewModels$default$1 = new MoreStreamersFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) moreStreamersFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(MoreStreamersViewModel.class), new bp2() { // from class: ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersFragment$special$$inlined$viewModels$default$4
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
        String strL = L(rs6.page_name_more_streamers);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = K().getString(rs6.more_streamers_title);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        dy4 dy4Var = new dy4(v1(), (K().getDimensionPixelSize(pq6.item_space) + t61.e(K(), pq6.horizontal_space_outer, 2, p3.g(F()).a)) / v1(), 0);
        dy4Var.n = new qs3(12, this);
        return dy4Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (MoreStreamersViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(0, 0, 0, 0, 0, 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.space_m);
        int dimensionPixelSize2 = K().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize3 = K().getDimensionPixelSize(pq6.horizontal_space_outer);
        if (this.F0.f()) {
            dimensionPixelSize2 -= K().getDimensionPixelSize(pq6.item_space);
        } else {
            dimensionPixelSize3 -= K().getDimensionPixelSize(pq6.item_space);
        }
        return new PaddingLayoutManager$Padding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.more_streamers_max_span);
    }
}
