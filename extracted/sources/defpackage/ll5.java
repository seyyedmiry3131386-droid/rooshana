package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ll5 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(kl5 kl5Var) {
        String strM = ct2.m(kl5Var.getClass());
        if (strM.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.a;
        kl5 kl5Var2 = (kl5) linkedHashMap.get(strM);
        if (js3.i(kl5Var2, kl5Var)) {
            return;
        }
        if (kl5Var2 != null && kl5Var2.b) {
            throw new IllegalStateException(("Navigator " + kl5Var + " is replacing an already attached " + kl5Var2).toString());
        }
        if (!kl5Var.b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + kl5Var + " is already attached to another NavController").toString());
    }

    public final kl5 b(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        kl5 kl5Var = (kl5) this.a.get(str);
        if (kl5Var != null) {
            return kl5Var;
        }
        throw new IllegalStateException(o40.y("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
