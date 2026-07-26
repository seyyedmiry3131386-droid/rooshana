package ir.mservices.market.version2.download;

import defpackage.f88;
import defpackage.js3;
import defpackage.o30;
import defpackage.o40;
import defpackage.rm7;
import ir.mservices.market.app.detail.data.AppDataDto;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.common.data.ForceUpdateDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadDataModel implements Serializable {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    /* JADX WARN: Illegal instructions before constructor call */
    public DownloadDataModel(InAppUpdateData inAppUpdateData, String str, String str2) {
        js3.p(inAppUpdateData, "app");
        String str3 = inAppUpdateData.a;
        int code = inAppUpdateData.b.getCode();
        String str4 = inAppUpdateData.d;
        String str5 = inAppUpdateData.c;
        ForceUpdateDto forceUpdateDto = inAppUpdateData.m;
        this(str3, code, "InAppUpdate", str, str2, "detail", str4, str5, forceUpdateDto != null ? Long.valueOf(forceUpdateDto.getFileLength()) : null, inAppUpdateData.g, inAppUpdateData.p, inAppUpdateData.q, inAppUpdateData.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadDataModel)) {
            return false;
        }
        DownloadDataModel downloadDataModel = (DownloadDataModel) obj;
        return js3.i(this.a, downloadDataModel.a) && this.b == downloadDataModel.b && js3.i(this.c, downloadDataModel.c) && js3.i(this.d, downloadDataModel.d) && js3.i(this.e, downloadDataModel.e) && js3.i(this.f, downloadDataModel.f) && js3.i(this.g, downloadDataModel.g) && js3.i(this.h, downloadDataModel.h) && js3.i(this.i, downloadDataModel.i) && this.j == downloadDataModel.j && this.k == downloadDataModel.k && this.l == downloadDataModel.l && this.m == downloadDataModel.m;
    }

    public final int hashCode() {
        int iK = rm7.k(this.c, ((this.a.hashCode() * 31) + this.b) * 31, 31);
        String str = this.d;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.i;
        int iHashCode6 = l != null ? l.hashCode() : 0;
        long j = this.j;
        return ((((((((iHashCode5 + iHashCode6) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "DownloadDataModel(packageName=", this.a, ", versionCode=", ", refId=");
        o40.I(this.c, ", callbackUrl=", this.d, ", installCallbackUrl=", sbB);
        o40.I(this.e, ", downloadRef=", this.f, ", title=", sbB);
        o40.I(this.g, ", iconPath=", this.h, ", fuFileLength=", sbB);
        sbB.append(this.i);
        sbB.append(", size=");
        sbB.append(this.j);
        sbB.append(", hasMainData=");
        sbB.append(this.k);
        sbB.append(", hasPatchData=");
        sbB.append(this.l);
        sbB.append(", isFree=");
        sbB.append(this.m);
        sbB.append(")");
        return sbB.toString();
    }

    public DownloadDataModel(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, Long l, long j, boolean z, boolean z2, boolean z3) {
        js3.p(str, "packageName");
        js3.p(str2, "refId");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = l;
        this.j = j;
        this.k = z;
        this.l = z2;
        this.m = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DownloadDataModel(o30 o30Var, String str, String str2) {
        js3.p(o30Var, "app");
        String str3 = o30Var.n;
        int i = o30Var.f;
        String str4 = o30Var.h;
        String str5 = o30Var.i;
        ForceUpdateDto forceUpdateDto = o30Var.j;
        this(str3, i, str2, null, null, str, str4, str5, forceUpdateDto != null ? Long.valueOf(forceUpdateDto.getFileLength()) : null, o30Var.g, o30Var.l, o30Var.m, o30Var.k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DownloadDataModel(String str, DownloadTag downloadTag) {
        Long lValueOf;
        js3.p(str, "packageName");
        js3.p(downloadTag, "tag");
        int i = downloadTag.a;
        String str2 = downloadTag.d;
        String str3 = (str2 == null || f88.n0(str2)) ? "ClientUnknown" : str2;
        String str4 = downloadTag.e;
        String str5 = downloadTag.p;
        String str6 = downloadTag.q;
        String str7 = downloadTag.r;
        String str8 = downloadTag.s;
        try {
            lValueOf = Long.valueOf(Long.parseLong(downloadTag.t));
        } catch (Exception unused) {
            lValueOf = null;
        }
        Long l = lValueOf;
        long j = downloadTag.l;
        int i2 = downloadTag.c;
        this(str, i, str3, str4, str5, str6, str7, str8, l, j, i2 == 120 || i2 == 140, i2 == 130 || i2 == 140, downloadTag.u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DownloadDataModel(ApplicationFullDto applicationFullDto, String str, String str2, String str3, String str4) {
        Boolean hasPatch;
        Boolean hasMain;
        js3.p(applicationFullDto, "app");
        js3.p(str2, "refId");
        String packageName = applicationFullDto.getPackageName();
        int code = applicationFullDto.getVersion().getCode();
        String title = applicationFullDto.getTitle();
        String url = applicationFullDto.getIcon().getUrl();
        ForceUpdateDto forceUpdate = applicationFullDto.getForceUpdate();
        Long lValueOf = forceUpdate != null ? Long.valueOf(forceUpdate.getFileLength()) : null;
        long length = applicationFullDto.getSize().getLength();
        AppDataDto appData = applicationFullDto.getAppData();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (appData == null || (hasMain = appData.getHasMain()) == null) ? false : hasMain.booleanValue();
        AppDataDto appData2 = applicationFullDto.getAppData();
        if (appData2 != null && (hasPatch = appData2.getHasPatch()) != null) {
            zBooleanValue = hasPatch.booleanValue();
        }
        this(packageName, code, str2, str3, str4, str, title, url, lValueOf, length, zBooleanValue2, zBooleanValue, applicationFullDto.getPrice().isFree());
    }
}
