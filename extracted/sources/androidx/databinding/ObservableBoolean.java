package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l80;
import defpackage.qt4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableBoolean extends l80 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new qt4(6);
    static final long serialVersionUID = 1;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j ? 1 : 0);
    }
}
