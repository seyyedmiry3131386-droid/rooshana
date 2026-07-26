package ir.mservices.market.app.search.result.ui.recycler;

import defpackage.f88;
import defpackage.js3;
import defpackage.to2;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAppListMoreData extends HomeMoreTitleRowData implements to2 {
    public final String k;

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchAppListMoreData(String str, String str2, AdInfoDto adInfoDto, String str3, ArrayList arrayList, ArrayList arrayList2, String str4) {
        js3.p(str, "title");
        boolean z = !f88.n0(str2);
        ArrayList arrayList3 = f88.n0(str2) ? arrayList : null;
        super(str, str2, adInfoDto, z, null, arrayList3 == null ? new ArrayList() : arrayList3, (arrayList2 == null || !f88.n0(str2)) ? null : arrayList2, str4, 16);
        this.k = str3;
    }
}
