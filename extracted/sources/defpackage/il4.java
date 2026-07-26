package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon;

/* JADX INFO: loaded from: classes.dex */
public final class il4 extends MeasurementManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public il4(Context context, int i) {
        switch (i) {
            case 1:
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                js3.o(systemService, "context.getSystemService…ementManager::class.java)");
                super((MeasurementManager) systemService);
                break;
            default:
                MeasurementManager measurementManager = MeasurementManager.get(context);
                js3.o(measurementManager, "get(context)");
                super(measurementManager);
                break;
        }
    }
}
