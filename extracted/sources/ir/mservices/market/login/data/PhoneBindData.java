package ir.mservices.market.login.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.qt4;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneBindData implements BindData {
    public static final Parcelable.Creator<PhoneBindData> CREATOR = new qt4(21);
    public String a;

    public PhoneBindData(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
    }
}
