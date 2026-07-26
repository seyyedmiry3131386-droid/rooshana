package ir.mservices.market.search.history.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchListTitleData implements MyketRecyclerData, g32, wo2 {
    public static final int e = js6.search_list_title;
    public final String a;
    public final String b;
    public final int c;
    public final AdInfoDto d;

    public SearchListTitleData(String str, String str2, int i, AdInfoDto adInfoDto) {
        js3.p(str, "title");
        js3.p(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = adInfoDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchListTitleData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.search.history.ui.recycler.SearchListTitleData");
        return js3.i(this.b, ((SearchListTitleData) obj).b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
