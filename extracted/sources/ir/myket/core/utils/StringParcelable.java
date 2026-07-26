package ir.myket.core.utils;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.z78;

/* JADX INFO: loaded from: classes3.dex */
public final class StringParcelable implements Parcelable {
    public static final z78 CREATOR = new z78();
    public final String a;

    public StringParcelable(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "parcel");
        parcel.writeString(this.a);
    }
}
