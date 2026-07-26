package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class nq2 extends y {
    public final /* synthetic */ int c;
    public final /* synthetic */ RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq2(RecyclerView recyclerView, int i) {
        super(4, false);
        this.c = i;
        this.d = recyclerView;
    }

    @Override // defpackage.y
    public final int n(int i) {
        switch (this.c) {
            case 0:
                g adapter = this.d.getAdapter();
                js3.n(adapter, "null cannot be cast to non-null type ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter");
                return ((a) adapter).G(i);
            default:
                g adapter2 = this.d.getAdapter();
                js3.n(adapter2, "null cannot be cast to non-null type ir.mservices.market.version2.ui.recycler.adapter.BasePagingAdapter");
                return ((a) adapter2).G(i);
        }
    }
}
