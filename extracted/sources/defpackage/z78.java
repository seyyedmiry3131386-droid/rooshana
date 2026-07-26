package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ir.myket.core.utils.StringParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class z78 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        return new StringParcelable(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StringParcelable[i];
    }
}
