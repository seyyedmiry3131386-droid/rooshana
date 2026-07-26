package ir.mservices.market.version2.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.ao6;
import defpackage.ee;
import defpackage.fe;
import ir.mservices.market.loggers.analytics.AnalyticsEventParcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenWatchAnalyticsEvent extends AnalyticsEventParcelable {
    public static final Parcelable.Creator<ScreenWatchAnalyticsEvent> CREATOR = new ao6(12);
    public long d;
    public long e;

    public ScreenWatchAnalyticsEvent(String str) {
        super(new Bundle(), "screen_watch");
        this.d = -1L;
        this.e = -1L;
        this.b.putString("screen_name", str);
    }

    public final void a() {
        long j = this.e;
        if (j >= 0) {
            this.b.putLong("watch_duration", j);
            this.b.putLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.e);
            ee eeVar = this.c;
            eeVar.getClass();
            eeVar.a(this.b, this.a);
        }
    }

    public final void b() {
        if (this.d > 0) {
            long j = this.e;
            this.e = (System.currentTimeMillis() + (j > 0 ? j : 0L)) - this.d;
            this.d = -1L;
        }
    }

    public final void c(FragmentActivity fragmentActivity) {
        String string = this.b.getString("screen_name");
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((fe) it.next()).a(fragmentActivity, string);
        }
        if (this.d < 0) {
            this.d = System.currentTimeMillis();
        }
    }

    @Override // ir.mservices.market.loggers.analytics.AnalyticsEventParcelable, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ir.mservices.market.loggers.analytics.AnalyticsEventParcelable, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
    }
}
