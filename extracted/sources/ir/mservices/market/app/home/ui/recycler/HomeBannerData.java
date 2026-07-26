package ir.mservices.market.app.home.ui.recycler;

import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class HomeBannerData implements MyketRecyclerData, g32 {
    public static final int c = js6.home_banner;
    public final HomeBannerDto a;
    public final String b;

    public HomeBannerData(HomeBannerDto homeBannerDto) {
        js3.p(homeBannerDto, "homeBannerDTO");
        this.a = homeBannerDto;
        long j = is3.p + 1;
        is3.p = j;
        this.b = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeBannerData) {
            return js3.i(this.a, ((HomeBannerData) obj).a);
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
