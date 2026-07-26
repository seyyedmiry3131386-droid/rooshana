package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.screenshots.ScreenshotData;

/* JADX INFO: loaded from: classes3.dex */
public final class xf7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        return new ScreenshotData(string, string2 != null ? string2 : "");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ScreenshotData[i];
    }
}
