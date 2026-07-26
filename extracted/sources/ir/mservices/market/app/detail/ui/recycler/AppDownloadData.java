package ir.mservices.market.app.detail.ui.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.vb7;
import defpackage.wo2;
import defpackage.xb5;
import ir.mservices.market.app.detail.data.TrafficPriceDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.vpnService.cheetah.data.ApplicationCheetahDto;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDownloadData implements MyketRecyclerData, g32, wo2 {
    public static final int q = js6.holder_app_download;
    public final vb7 a;
    public final vb7 b;
    public final fu7 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final ForceUpdateDto k;
    public final TrafficPriceDto l;
    public final xb5 m;
    public final fu7 n;
    public final ApplicationCheetahDto o;
    public final boolean p;

    public AppDownloadData(vb7 vb7Var, vb7 vb7Var2, pv6 pv6Var, boolean z, boolean z2, boolean z3, String str, String str2, String str3, int i, ForceUpdateDto forceUpdateDto, TrafficPriceDto trafficPriceDto, l lVar, i iVar, ApplicationCheetahDto applicationCheetahDto, boolean z4) {
        js3.p(pv6Var, "installStateFlow");
        js3.p(str, "packageName");
        js3.p(str2, "buttonText");
        js3.p(lVar, "uiProgressUpdateTimeStamp");
        js3.p(iVar, "installStateChangeFlow");
        this.a = vb7Var;
        this.b = vb7Var2;
        this.c = pv6Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = i;
        this.k = forceUpdateDto;
        this.l = trafficPriceDto;
        this.m = lVar;
        this.n = iVar;
        this.o = applicationCheetahDto;
        this.p = z4;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return q;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppDownloadData)) {
            return false;
        }
        AppDownloadData appDownloadData = (AppDownloadData) obj;
        return this.d == appDownloadData.d && this.e == appDownloadData.e && this.f == appDownloadData.f && js3.i(this.g, appDownloadData.g) && js3.i(this.i, appDownloadData.i) && this.j == appDownloadData.j && js3.i(this.k, appDownloadData.k) && js3.i(this.l, appDownloadData.l);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        int iHashCode = ((((((this.g.hashCode() * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31;
        String str = this.i;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.j) * 31;
        ForceUpdateDto forceUpdateDto = this.k;
        int iHashCode3 = (iHashCode2 + (forceUpdateDto != null ? forceUpdateDto.hashCode() : 0)) * 31;
        TrafficPriceDto trafficPriceDto = this.l;
        return iHashCode3 + (trafficPriceDto != null ? trafficPriceDto.hashCode() : 0);
    }
}
