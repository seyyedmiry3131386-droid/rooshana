package ir.mservices.market.version2.ui.recycler.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fr5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LineMenuItemData implements Serializable, Parcelable {
    public static final Parcelable.Creator<LineMenuItemData> CREATOR = new fr5(18);
    public String a;
    public String b;
    public int c;

    public LineMenuItemData(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    public LineMenuItemData(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = 0;
    }
}
