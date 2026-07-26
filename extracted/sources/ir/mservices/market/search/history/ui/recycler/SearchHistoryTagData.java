package ir.mservices.market.search.history.ui.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.ri7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchHistoryTagData extends ri7 implements MyketRecyclerData, wo2 {
    public static final int c = js6.tag_view;
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryTagData(String str, int i) {
        super(i);
        js3.p(str, "title");
        this.b = str;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }
}
