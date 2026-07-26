package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableList;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zd implements yd {
    public static volatile zd b;
    public final AppMeasurementSdk a;

    public zd(AppMeasurementSdk appMeasurementSdk) {
        rq4.n(appMeasurementSdk);
        this.a = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Bundle bundle, String str) {
        if (pm9.b.contains(AppMeasurement.FCM_ORIGIN) || pm9.a.contains(str)) {
            return;
        }
        ImmutableList immutableList = pm9.c;
        int size = immutableList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i2));
            i2++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str)) {
            if (pm9.b.contains(AppMeasurement.FCM_ORIGIN)) {
                return;
            }
            ImmutableList immutableList2 = pm9.c;
            int size2 = immutableList2.size();
            while (i < size2) {
                boolean zContainsKey2 = bundle.containsKey((String) immutableList2.get(i));
                i++;
                if (zContainsKey2) {
                    return;
                }
            }
            bundle.putString("_cis", "fcm_integration");
        }
        this.a.logEvent(AppMeasurement.FCM_ORIGIN, str, bundle);
    }
}
