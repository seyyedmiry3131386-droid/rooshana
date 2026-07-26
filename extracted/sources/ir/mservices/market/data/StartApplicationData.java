package ir.mservices.market.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class StartApplicationData implements Serializable {
    private final AppBarSampleData appBarSampleData;
    private String clickCallback;
    private final String installCallbackUrl;

    public StartApplicationData(AppBarSampleData appBarSampleData, String str, String str2) {
        js3.p(appBarSampleData, "appBarSampleData");
        this.appBarSampleData = appBarSampleData;
        this.installCallbackUrl = str;
        this.clickCallback = str2;
    }

    public static /* synthetic */ StartApplicationData copy$default(StartApplicationData startApplicationData, AppBarSampleData appBarSampleData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            appBarSampleData = startApplicationData.appBarSampleData;
        }
        if ((i & 2) != 0) {
            str = startApplicationData.installCallbackUrl;
        }
        if ((i & 4) != 0) {
            str2 = startApplicationData.clickCallback;
        }
        return startApplicationData.copy(appBarSampleData, str, str2);
    }

    public final AppBarSampleData component1() {
        return this.appBarSampleData;
    }

    public final String component2() {
        return this.installCallbackUrl;
    }

    public final String component3() {
        return this.clickCallback;
    }

    public final StartApplicationData copy(AppBarSampleData appBarSampleData, String str, String str2) {
        js3.p(appBarSampleData, "appBarSampleData");
        return new StartApplicationData(appBarSampleData, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartApplicationData)) {
            return false;
        }
        StartApplicationData startApplicationData = (StartApplicationData) obj;
        return js3.i(this.appBarSampleData, startApplicationData.appBarSampleData) && js3.i(this.installCallbackUrl, startApplicationData.installCallbackUrl) && js3.i(this.clickCallback, startApplicationData.clickCallback);
    }

    public final AppBarSampleData getAppBarSampleData() {
        return this.appBarSampleData;
    }

    public final String getClickCallback() {
        return this.clickCallback;
    }

    public final String getInstallCallbackUrl() {
        return this.installCallbackUrl;
    }

    public int hashCode() {
        int iHashCode = this.appBarSampleData.hashCode() * 31;
        String str = this.installCallbackUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clickCallback;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setClickCallback(String str) {
        this.clickCallback = str;
    }

    public String toString() {
        AppBarSampleData appBarSampleData = this.appBarSampleData;
        String str = this.installCallbackUrl;
        String str2 = this.clickCallback;
        StringBuilder sb = new StringBuilder("StartApplicationData(appBarSampleData=");
        sb.append(appBarSampleData);
        sb.append(", installCallbackUrl=");
        sb.append(str);
        sb.append(", clickCallback=");
        return dw1.s(sb, str2, ")");
    }

    public /* synthetic */ StartApplicationData(AppBarSampleData appBarSampleData, String str, String str2, int i, yd1 yd1Var) {
        this(appBarSampleData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
