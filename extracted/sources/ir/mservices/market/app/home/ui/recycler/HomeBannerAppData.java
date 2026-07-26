package ir.mservices.market.app.home.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.pv6;
import defpackage.vb7;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeBannerAppData extends BaseHomeBannerAppData implements g32 {
    public final String g;
    public final String h;
    public final AppNestedData i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeBannerAppData(vb7 vb7Var, pv6 pv6Var, HomeBannerAppDto homeBannerAppDto, String str, String str2) {
        super(homeBannerAppDto, str);
        js3.p(pv6Var, "installStateFlow");
        js3.p(str2, "analyticsName");
        this.g = str2;
        long j = is3.p + 1;
        is3.p = j;
        this.h = String.valueOf(j);
        this.i = new AppNestedData(homeBannerAppDto.getApp(), str2, true, false, vb7Var, pv6Var, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeBannerAppData)) {
            return false;
        }
        HomeBannerAppData homeBannerAppData = (HomeBannerAppData) obj;
        return js3.i(this.a, homeBannerAppData.a) && js3.i(this.b, homeBannerAppData.b) && js3.i(this.g, homeBannerAppData.g);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((this.g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31) + 1237;
    }
}
