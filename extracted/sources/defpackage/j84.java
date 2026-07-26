package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class j84 {
    public ee a;

    public final void a(int i, String str) {
        if (str == null || f88.n0(str)) {
            ee eeVar = this.a;
            if (eeVar != null) {
                eeVar.b("movie_list_item", "position", String.valueOf(i));
                return;
            } else {
                js3.V("analyticsService");
                throw null;
            }
        }
        ee eeVar2 = this.a;
        if (eeVar2 != null) {
            eeVar2.b("movie_list_item", AppMeasurementSdk.ConditionalUserProperty.NAME, str, "position", String.valueOf(i));
        } else {
            js3.V("analyticsService");
            throw null;
        }
    }
}
