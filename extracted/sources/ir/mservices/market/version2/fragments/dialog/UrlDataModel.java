package ir.mservices.market.version2.fragments.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import defpackage.js3;
import defpackage.q09;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlDataModel implements Parcelable {
    public static final q09 CREATOR = new q09();
    public final SpannableString a;

    public UrlDataModel(SpannableString spannableString) {
        this.a = spannableString;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "parcel");
        TextUtils.writeToParcel(this.a, parcel, i);
    }
}
