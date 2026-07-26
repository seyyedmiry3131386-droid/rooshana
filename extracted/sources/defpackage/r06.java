package defpackage;

import android.view.View;
import androidx.recyclerview.widget.k;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r06 implements ms5, vt5 {
    public final /* synthetic */ PagingRecyclerListFragment a;

    public /* synthetic */ r06(PagingRecyclerListFragment pagingRecyclerListFragment) {
        this.a = pagingRecyclerListFragment;
    }

    @Override // defpackage.vt5
    public void f() {
        int i = PagingRecyclerListFragment.U0;
        this.a.E0().i();
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        int i = PagingRecyclerListFragment.U0;
        js3.p(view, "<unused var>");
        k layoutManager = this.a.J0().getLayoutManager();
        js3.n(layoutManager, "null cannot be cast to non-null type ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager");
        ((MyketGridLayoutManager) layoutManager).Q = new PaddingLayoutManager$Padding(0, 0, 0, lf9Var.a.g(2).d);
        return lf9Var;
    }
}
