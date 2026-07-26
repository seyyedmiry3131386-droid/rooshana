package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n06 implements hd8, ms5, vt5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PagingRecyclerListContentFragment b;

    public /* synthetic */ n06(PagingRecyclerListContentFragment pagingRecyclerListContentFragment, int i) {
        this.a = i;
        this.b = pagingRecyclerListContentFragment;
    }

    @Override // defpackage.hd8
    public void b() {
        int i = PagingRecyclerListContentFragment.e1;
        this.b.l1().i();
    }

    @Override // defpackage.vt5
    public void f() {
        int i = this.a;
        PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.b;
        switch (i) {
            case 2:
                int i2 = PagingRecyclerListContentFragment.e1;
                pagingRecyclerListContentFragment.l1().i();
                break;
            default:
                pagingRecyclerListContentFragment.F1();
                break;
        }
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        int i = PagingRecyclerListContentFragment.e1;
        js3.p(view, "<unused var>");
        PagingRecyclerListContentFragment pagingRecyclerListContentFragment = this.b;
        PaddingLayoutManager$Padding paddingLayoutManager$PaddingU1 = pagingRecyclerListContentFragment.u1();
        Object layoutManager = pagingRecyclerListContentFragment.y1().getLayoutManager();
        ty5 ty5Var = layoutManager instanceof ty5 ? (ty5) layoutManager : null;
        if (ty5Var != null) {
            ty5Var.a(new PaddingLayoutManager$Padding(paddingLayoutManager$PaddingU1.a, paddingLayoutManager$PaddingU1.b, paddingLayoutManager$PaddingU1.c, paddingLayoutManager$PaddingU1.d + lf9Var.a.g(2).d));
        }
        return lf9Var;
    }
}
