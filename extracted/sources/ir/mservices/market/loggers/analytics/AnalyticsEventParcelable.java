package ir.mservices.market.loggers.analytics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ee;
import defpackage.fr5;
import defpackage.w91;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public class AnalyticsEventParcelable implements Parcelable {
    public static final Parcelable.Creator<AnalyticsEventParcelable> CREATOR = new fr5(5);
    public final String a;
    public Bundle b;
    public final ee c;

    public AnalyticsEventParcelable(Parcel parcel) {
        this(null, parcel.readString());
        this.b = parcel.readBundle(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeBundle(this.b);
    }

    public AnalyticsEventParcelable(Bundle bundle, String str) {
        this.c = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
        this.a = str;
        this.b = bundle;
    }
}
