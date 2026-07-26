package ir.mservices.market.core.analytics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.oo9;
import defpackage.w91;
import defpackage.yo9;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EventBuilder implements Parcelable {
    public final FirebaseAnalytics a;
    public final String b;
    public final Bundle c;
    public boolean d;

    public EventBuilder(String str) {
        this.c = new Bundle();
        this.d = false;
        this.a = (FirebaseAnalytics) ((w91) ApplicationLauncher.o.b()).k.get();
        this.b = str;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        yo9 yo9Var = this.a.a;
        yo9Var.getClass();
        yo9Var.c(new oo9(yo9Var, null, null, this.b, this.c, false, true));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeBundle(this.c);
    }

    public EventBuilder(Parcel parcel) {
        this.c = new Bundle();
        this.d = false;
        this.a = (FirebaseAnalytics) ((w91) ApplicationLauncher.o.b()).k.get();
        this.b = parcel.readString();
        this.c = parcel.readBundle(getClass().getClassLoader());
    }
}
