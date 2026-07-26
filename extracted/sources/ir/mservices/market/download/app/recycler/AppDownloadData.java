package ir.mservices.market.download.app.recycler;

import defpackage.bt;
import defpackage.fu7;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.rv6;
import defpackage.vb7;
import defpackage.zr1;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.download.app.data.DownloadListModel;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDownloadData extends MultiSelectRecyclerData implements zr1, g32 {
    public static final int B = js6.holder_multi_select_download;
    public final long A;
    public final vb7 h;
    public final vb7 i;
    public final fu7 j;
    public final DownloadListModel k;
    public final String l;
    public final String m;
    public final int n;
    public final String o;
    public final String p;
    public final long q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final ForceUpdateDto y;
    public final bt z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDownloadData(rv6 rv6Var, vb7 vb7Var, vb7 vb7Var2, pv6 pv6Var, DownloadListModel downloadListModel) {
        super(rv6Var);
        js3.p(rv6Var, "multiselectVisibilityChangeState");
        js3.p(pv6Var, "installStateFlow");
        js3.p(downloadListModel, "model");
        this.h = vb7Var;
        this.i = vb7Var2;
        this.j = pv6Var;
        this.k = downloadListModel;
        long j = is3.p + 1;
        is3.p = j;
        this.l = String.valueOf(j);
        String packageName = downloadListModel.getApp().getPackageName();
        js3.o(packageName, "getPackageName(...)");
        this.m = packageName;
        this.n = downloadListModel.getApp().getVersionCode();
        String iconPath = downloadListModel.getApp().getIconPath();
        js3.o(iconPath, "getIconPath(...)");
        this.o = iconPath;
        String title = downloadListModel.getApp().getTitle();
        js3.o(title, "getTitle(...)");
        this.p = title;
        this.q = downloadListModel.getApp().getFileSize();
        this.r = downloadListModel.getApp().isFree();
        this.s = downloadListModel.getApp().hasMainData();
        this.t = downloadListModel.getApp().hasPatchData();
        this.u = "DownloadList";
        this.v = "";
        this.w = "";
        this.x = downloadListModel.getApp().getCategoryName();
        this.y = downloadListModel.getApp().getForceUpdate();
        this.z = downloadListModel.getAppState();
        this.A = downloadListModel.getNeneTimestamp();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return B;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AppDownloadData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.download.app.recycler.AppDownloadData");
        AppDownloadData appDownloadData = (AppDownloadData) obj;
        return this.A == appDownloadData.A && this.f == appDownloadData.f && ((Boolean) this.e.a.getValue()).booleanValue() == ((Boolean) appDownloadData.e.a.getValue()).booleanValue() && ((Boolean) this.a.getValue()).booleanValue() == ((Boolean) appDownloadData.a.getValue()).booleanValue() && this.g == appDownloadData.g;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.l;
    }

    public final int hashCode() {
        int iHashCode = this.k.hashCode() * 31;
        long j = this.A;
        return ((((((((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.f ? 1231 : 1237)) * 31) + (((Boolean) this.e.a.getValue()).booleanValue() ? 1231 : 1237)) * 31) + (((Boolean) this.a.getValue()).booleanValue() ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }
}
