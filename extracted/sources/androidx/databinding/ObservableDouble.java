package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l80;
import defpackage.qt4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableDouble extends l80 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new qt4(9);
    static final long serialVersionUID = 1;
    public double j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.j);
    }
}
