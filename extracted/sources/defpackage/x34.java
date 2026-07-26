package defpackage;

import androidx.compose.foundation.lazy.b;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryHorizontalTagsData;
import ir.mservices.market.search.history.ui.recycler.SearchHistoryListTitleData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x34 implements dp2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                e34 e34Var = (e34) obj;
                c08 c08VarK = ql3.k();
                ql3.u(c08VarK, ql3.m(c08VarK), c08VarK != null ? c08VarK.e() : null);
                int i = e34Var.a;
                if (i == -1) {
                    i = 2;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = this.b + i2;
                    g34 g34Var = e34Var.c;
                    ry ryVar = g34Var.c;
                    if (ryVar != null) {
                        e34Var.b.add(new mj6(ryVar, i3, g34Var.b, null));
                    }
                }
                return tx8.a;
            default:
                MyketRecyclerData myketRecyclerData = ((RecyclerItem) obj).c;
                return Boolean.valueOf(!(myketRecyclerData instanceof SearchHistoryListTitleData) ? !(myketRecyclerData instanceof SearchHistoryHorizontalTagsData) : ((SearchHistoryListTitleData) myketRecyclerData).a != this.b);
        }
    }

    public /* synthetic */ x34(b bVar, int i) {
        this.b = i;
    }
}
