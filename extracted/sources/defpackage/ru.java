package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import ir.mservices.market.appUsage.AppsUsageFragment;
import ir.mservices.market.appUsage.AppsUsageViewModel;
import ir.mservices.market.appUsage.data.SortMode;
import ir.mservices.market.appUsage.recycler.InstalledAppUsageData;
import ir.mservices.market.appUsage.recycler.StorageUsageFixedHeaderData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketMultiRadio;
import ir.myket.core.utils.StringParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ru implements og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppsUsageFragment b;

    public /* synthetic */ ru(AppsUsageFragment appsUsageFragment, int i) {
        this.a = i;
        this.b = appsUsageFragment;
    }

    @Override // defpackage.og5
    public final void m(View view, qg5 qg5Var, Object obj) {
        int i = this.a;
        AppsUsageFragment appsUsageFragment = this.b;
        switch (i) {
            case 0:
                int i2 = AppsUsageFragment.m1;
                js3.p(view, "<unused var>");
                js3.p((j68) qg5Var, "<unused var>");
                js3.p((StorageUsageFixedHeaderData) obj, "<unused var>");
                DialogDataModel dialogDataModel = new DialogDataModel(appsUsageFragment.R1(), "DIALOG_KEY_SHOW_SORT", null, 12);
                String strL = appsUsageFragment.L(rs6.size);
                SortMode sortMode = SortMode.b;
                pk5.g(appsUsageFragment.J0, new NavIntentDirections.SingleSelect(new nx7(dialogDataModel, appsUsageFragment.L(rs6.choose_sort_type), new MyketMultiRadio.Item[]{new MyketMultiRadio.Item(strL, new StringParcelable("SIZE"), "", null, 248), new MyketMultiRadio.Item(appsUsageFragment.L(rs6.apps_name), new StringParcelable("NAME"), "", null, 248), new MyketMultiRadio.Item(appsUsageFragment.L(rs6.last_used_time), new StringParcelable("LAST_USED"), "", null, 248)}, ((SortMode) appsUsageFragment.Q1().y.a.getValue()).ordinal(), sj8.b())), -1);
                break;
            case 1:
                InstalledAppUsageData installedAppUsageData = (InstalledAppUsageData) obj;
                int i3 = AppsUsageFragment.m1;
                js3.p(view, "<unused var>");
                js3.p((sp3) qg5Var, "<unused var>");
                js3.p(installedAppUsageData, "recyclerData");
                Context contextH = appsUsageFragment.H();
                if (contextH != null) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", installedAppUsageData.a.a, null));
                    Intent intentV = gu9.v(contextH, intent);
                    if (intentV != null) {
                        appsUsageFragment.y0(intentV);
                    }
                }
                Context contextH2 = appsUsageFragment.H();
                hh2.H(new hh2(contextH2, contextH2 != null ? contextH2.getString(rs6.app_settings_failed_message) : null));
                break;
            default:
                InstalledAppUsageData installedAppUsageData2 = (InstalledAppUsageData) obj;
                int i4 = AppsUsageFragment.m1;
                js3.p(view, "<unused var>");
                js3.p((sp3) qg5Var, "<unused var>");
                js3.p(installedAppUsageData2, "recyclerData");
                AppsUsageViewModel appsUsageViewModelQ1 = appsUsageFragment.Q1();
                String str = installedAppUsageData2.a.a;
                js3.p(str, "packageName");
                appsUsageViewModelQ1.u.Q(str);
                break;
        }
    }
}
