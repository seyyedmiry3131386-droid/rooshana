package ir.mservices.market.app.detail.ui;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Tracker implements Parcelable, Serializable {
    public static final Parcelable.Creator<Tracker> CREATOR = new ao6(19);
    public final String a;
    public final String b;
    public final String c;

    public Tracker(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
