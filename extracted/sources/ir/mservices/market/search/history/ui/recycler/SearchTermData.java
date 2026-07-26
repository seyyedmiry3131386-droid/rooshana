package ir.mservices.market.search.history.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.ri7;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchTermData extends ri7 implements MyketRecyclerData, wo2, g32 {
    public static final int e = js6.holder_search_term;
    public final String b;
    public final int c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTermData(int i, int i2, String str, String str2) {
        super(i2);
        js3.p(str, "title");
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (!SearchTermData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.search.history.ui.recycler.SearchTermData");
        SearchTermData searchTermData = (SearchTermData) obj;
        return js3.i(this.b, searchTermData.b) && js3.i(this.d, searchTermData.d);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "SearchTermData";
    }

    public final int hashCode() {
        return Objects.hash(this.d);
    }
}
