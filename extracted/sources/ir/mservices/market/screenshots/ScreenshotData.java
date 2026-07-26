package ir.mservices.market.screenshots;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.xf7;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotData implements Parcelable {
    public static final xf7 CREATOR = new xf7();
    public final String a;
    public final String b;

    public ScreenshotData(String str, String str2) {
        this.a = str;
        this.b = str2;
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
    }
}
