package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.microsoft.clarity.Clarity;

/* JADX INFO: loaded from: classes3.dex */
public final class ns0 implements fe {
    @Override // defpackage.fe
    public final void a(Activity activity2, String str) {
        js3.p(activity2, "activity");
        if (str == null || f88.n0(str)) {
            return;
        }
        Clarity.setCurrentScreenName(str);
    }

    @Override // defpackage.fe
    public final void b(String str, String str2) {
        Clarity.setCustomTag(str, str2);
    }

    @Override // defpackage.fe
    public final void c(String str) {
        Clarity.setCustomUserId(str);
    }

    @Override // defpackage.fe
    public final void d(Bundle bundle, String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }
}
