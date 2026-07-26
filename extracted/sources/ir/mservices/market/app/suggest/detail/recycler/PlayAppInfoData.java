package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.dw1;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import ir.mservices.market.app.detail.data.CategorySummaryDto;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayAppInfoData implements MyketRecyclerData, g32 {
    public static final int g = js6.holder_play_detail_app_summery;
    public final String a;
    public final float b;
    public final String c;
    public final DownloadSummaryDto d;
    public final CategorySummaryDto e;
    public final DownloadSummaryDto f;

    public PlayAppInfoData(String str, float f, String str2, DownloadSummaryDto downloadSummaryDto, CategorySummaryDto categorySummaryDto, DownloadSummaryDto downloadSummaryDto2) {
        js3.p(str2, "packageName");
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = downloadSummaryDto;
        this.e = categorySummaryDto;
        this.f = downloadSummaryDto2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return g;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PlayAppInfoData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.suggest.detail.recycler.PlayAppInfoData");
        PlayAppInfoData playAppInfoData = (PlayAppInfoData) obj;
        return this.a.equals(playAppInfoData.a) && this.b == playAppInfoData.b && js3.i(this.c, playAppInfoData.c) && js3.i(this.d, playAppInfoData.d) && js3.i(this.e, playAppInfoData.e) && js3.i(this.f, playAppInfoData.f);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c;
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, dw1.g(this.b, this.a.hashCode() * 31, 31), 31);
        DownloadSummaryDto downloadSummaryDto = this.d;
        int iHashCode = (iK + (downloadSummaryDto != null ? downloadSummaryDto.hashCode() : 0)) * 31;
        CategorySummaryDto categorySummaryDto = this.e;
        int iHashCode2 = (iHashCode + (categorySummaryDto != null ? categorySummaryDto.hashCode() : 0)) * 31;
        DownloadSummaryDto downloadSummaryDto2 = this.f;
        return ((iHashCode2 + (downloadSummaryDto2 != null ? downloadSummaryDto2.hashCode() : 0)) * 31) + 1237;
    }
}
