package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l80;
import defpackage.qt4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableByte extends l80 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new qt4(7);
    static final long serialVersionUID = 1;
    public byte j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.j);
    }
}
