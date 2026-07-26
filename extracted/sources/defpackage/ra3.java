package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class ra3 {
    public final ee a;
    public String b;

    public ra3(ee eeVar) {
        js3.p(eeVar, "analyticsService");
        this.a = eeVar;
        this.b = "";
    }

    public final String a(String str) {
        return t61.j(str, "-", this.b);
    }

    public final void b(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a.b("home_banner", AppMeasurementSdk.ConditionalUserProperty.NAME, a(str));
    }

    public final void c(String str, String str2) {
        js3.p(str, "listTitle");
        js3.p(str2, "packageName");
        this.a.b("home_list_item", "list_name", a(str), "item_name", "app:".concat(str2));
    }

    public final void d(String str, String str2, String str3) {
        js3.p(str, "listTitle");
        this.a.b("home_banner_app_item", "list_name", a(str), "item_name", "app:".concat(str2), "type", str3);
    }

    public final void e(String str) {
        js3.p(str, "listTitle");
        this.a.b("home_list_more", "list_name", a(str));
    }
}
