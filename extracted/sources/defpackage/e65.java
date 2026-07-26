package defpackage;

import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e65 extends y {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e65(int i, Object obj) {
        super(4, false);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.y
    public final int n(int i) {
        switch (this.c) {
            case 0:
                return ((l45) this.d).G(i);
            case 1:
                PagingRecyclerListContentFragment pagingRecyclerListContentFragment = (PagingRecyclerListContentFragment) this.d;
                a aVar = pagingRecyclerListContentFragment.Z0;
                return aVar != null ? aVar.G(i) : pagingRecyclerListContentFragment.v1();
            case 2:
                PagingRecyclerListFragment pagingRecyclerListFragment = (PagingRecyclerListFragment) this.d;
                a aVar2 = pagingRecyclerListFragment.P0;
                return aVar2 != null ? aVar2.G(i) : pagingRecyclerListFragment.I0();
            default:
                return ((lm) this.d).G(i);
        }
    }
}
