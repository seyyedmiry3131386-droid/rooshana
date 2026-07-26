package ir.mservices.market.app.detail.update.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import ir.mservices.market.app.detail.data.AppDescriptionDto;
import ir.mservices.market.app.detail.data.AppVersionDto;
import ir.mservices.market.app.detail.data.MoneyBackSummaryDto;
import ir.mservices.market.app.detail.data.TrafficPriceDto;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.vpnService.cheetah.data.ApplicationCheetahDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppUpdateData implements Serializable {
    public final String a;
    public final AppVersionDto b;
    public final String c;
    public final String d;
    public final String e;
    public final TrafficPriceDto f;
    public final long g;
    public final String h;
    public final MoneyBackSummaryDto i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final ForceUpdateDto m;
    public final String n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final AppDescriptionDto s;
    public final ApplicationCheetahDto t;

    public InAppUpdateData(String str, AppVersionDto appVersionDto, String str2, String str3, String str4, TrafficPriceDto trafficPriceDto, long j, String str5, MoneyBackSummaryDto moneyBackSummaryDto, boolean z, boolean z2, String str6, ForceUpdateDto forceUpdateDto, String str7, String str8, boolean z3, boolean z4, String str9, AppDescriptionDto appDescriptionDto, ApplicationCheetahDto applicationCheetahDto) {
        js3.p(str, "packageName");
        js3.p(appVersionDto, "version");
        js3.p(str2, "iconUrl");
        js3.p(str3, "title");
        this.a = str;
        this.b = appVersionDto;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = trafficPriceDto;
        this.g = j;
        this.h = str5;
        this.i = moneyBackSummaryDto;
        this.j = z;
        this.k = z2;
        this.l = str6;
        this.m = forceUpdateDto;
        this.n = str7;
        this.o = str8;
        this.p = z3;
        this.q = z4;
        this.r = str9;
        this.s = appDescriptionDto;
        this.t = applicationCheetahDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppUpdateData)) {
            return false;
        }
        InAppUpdateData inAppUpdateData = (InAppUpdateData) obj;
        return js3.i(this.a, inAppUpdateData.a) && js3.i(this.b, inAppUpdateData.b) && js3.i(this.c, inAppUpdateData.c) && js3.i(this.d, inAppUpdateData.d) && js3.i(this.e, inAppUpdateData.e) && js3.i(this.f, inAppUpdateData.f) && this.g == inAppUpdateData.g && js3.i(this.h, inAppUpdateData.h) && js3.i(this.i, inAppUpdateData.i) && this.j == inAppUpdateData.j && this.k == inAppUpdateData.k && js3.i(this.l, inAppUpdateData.l) && js3.i(this.m, inAppUpdateData.m) && js3.i(this.n, inAppUpdateData.n) && js3.i(this.o, inAppUpdateData.o) && this.p == inAppUpdateData.p && this.q == inAppUpdateData.q && js3.i(this.r, inAppUpdateData.r) && js3.i(this.s, inAppUpdateData.s) && js3.i(this.t, inAppUpdateData.t);
    }

    public final int hashCode() {
        int iK = rm7.k(this.d, rm7.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
        String str = this.e;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        TrafficPriceDto trafficPriceDto = this.f;
        int iHashCode2 = trafficPriceDto == null ? 0 : trafficPriceDto.hashCode();
        long j = this.g;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.h;
        int iHashCode3 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        MoneyBackSummaryDto moneyBackSummaryDto = this.i;
        int iHashCode4 = (((((iHashCode3 + (moneyBackSummaryDto == null ? 0 : moneyBackSummaryDto.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31;
        String str3 = this.l;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ForceUpdateDto forceUpdateDto = this.m;
        int iHashCode6 = (iHashCode5 + (forceUpdateDto == null ? 0 : forceUpdateDto.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode8 = (((((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + (this.p ? 1231 : 1237)) * 31) + (this.q ? 1231 : 1237)) * 31;
        String str6 = this.r;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        AppDescriptionDto appDescriptionDto = this.s;
        int iHashCode10 = (iHashCode9 + (appDescriptionDto == null ? 0 : appDescriptionDto.hashCode())) * 31;
        ApplicationCheetahDto applicationCheetahDto = this.t;
        return iHashCode10 + (applicationCheetahDto != null ? applicationCheetahDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppUpdateData(packageName=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        o40.I(this.c, ", title=", this.d, ", tagline=", sb);
        sb.append(this.e);
        sb.append(", trafficPrice=");
        sb.append(this.f);
        sb.append(", length=");
        sb.append(this.g);
        sb.append(", buttonText=");
        sb.append(this.h);
        sb.append(", moneyBackSummary=");
        sb.append(this.i);
        sb.append(", isIncompatible=");
        sb.append(this.j);
        sb.append(", isFree=");
        sb.append(this.k);
        sb.append(", realPrice=");
        sb.append(this.l);
        sb.append(", forceUpdate=");
        sb.append(this.m);
        sb.append(", callbackUrl=");
        sb.append(this.n);
        sb.append(", installCallbackUrl=");
        sb.append(this.o);
        sb.append(", hasMainData=");
        sb.append(this.p);
        sb.append(", hasPatchData=");
        sb.append(this.q);
        sb.append(", categoryName=");
        sb.append(this.r);
        sb.append(", whatsNew=");
        sb.append(this.s);
        sb.append(", cheetah=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
