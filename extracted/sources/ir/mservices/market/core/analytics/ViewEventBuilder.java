package ir.mservices.market.core.analytics;

import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.ao6;

/* JADX INFO: loaded from: classes3.dex */
public class ViewEventBuilder extends EventBuilder {
    public static final Parcelable.Creator<ViewEventBuilder> CREATOR = new ao6(22);

    public ViewEventBuilder() {
        super("view");
    }

    public final void b(String str) {
        this.c.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
    }
}
