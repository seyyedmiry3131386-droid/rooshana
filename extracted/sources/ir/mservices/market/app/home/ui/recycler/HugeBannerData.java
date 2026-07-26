package ir.mservices.market.app.home.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import ir.mservices.market.app.home.data.HugeBannerDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class HugeBannerData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_huge_banner;
    public static final int d = js6.holder_huge_banner_small;
    public final HugeBannerDto a;
    public final String b;

    public HugeBannerData(HugeBannerDto hugeBannerDto) {
        js3.p(hugeBannerDto, "hugeBanner");
        this.a = hugeBannerDto;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return m88.T(this.a.getDisplaySize(), HugeBannerDto.DISPLAY_SIZE_SMALL, true) ? d : c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HugeBannerData) {
            return js3.i(this.a, ((HugeBannerData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
