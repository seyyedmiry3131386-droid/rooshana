package ir.mservices.market.login.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class UnbindAllBindData implements BindData {
    public static final Parcelable.Creator<UnbindAllBindData> CREATOR = new ao6(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
    }
}
