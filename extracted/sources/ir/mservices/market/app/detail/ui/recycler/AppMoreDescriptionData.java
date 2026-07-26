package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.app.detail.data.AppDescriptionDto;
import ir.mservices.market.app.detail.data.MoreDescriptionData;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMoreDescriptionData implements MyketRecyclerData, wo2, g32 {
    public static final int f = js6.include_more_description;
    public final MoreDescriptionData a;
    public final String b;
    public final AppDescriptionDto c;
    public final AppDescriptionDto d;
    public final boolean e;

    public AppMoreDescriptionData(MoreDescriptionData moreDescriptionData, String str, AppDescriptionDto appDescriptionDto, AppDescriptionDto appDescriptionDto2, boolean z, boolean z2, ForceUpdateDto forceUpdateDto) {
        this.a = moreDescriptionData;
        this.b = str;
        this.c = appDescriptionDto;
        this.d = appDescriptionDto2;
        this.e = z;
        if (!z2 || forceUpdateDto == null || appDescriptionDto2 == null) {
            return;
        }
        appDescriptionDto2.setText(forceUpdateDto.getDescription());
        appDescriptionDto2.setShortText(forceUpdateDto.getDescription());
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return f;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMoreDescriptionData)) {
            return false;
        }
        AppMoreDescriptionData appMoreDescriptionData = (AppMoreDescriptionData) obj;
        return js3.i(this.b, appMoreDescriptionData.b) && js3.i(this.c, appMoreDescriptionData.c) && js3.i(this.d, appMoreDescriptionData.d) && this.e == appMoreDescriptionData.e;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        AppDescriptionDto appDescriptionDto = this.c;
        int iHashCode2 = (iHashCode + (appDescriptionDto != null ? appDescriptionDto.hashCode() : 0)) * 31;
        AppDescriptionDto appDescriptionDto2 = this.d;
        return ((iHashCode2 + (appDescriptionDto2 != null ? appDescriptionDto2.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237);
    }
}
