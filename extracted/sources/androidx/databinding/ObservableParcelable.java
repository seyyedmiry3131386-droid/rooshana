package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fr5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ObservableParcelable<T extends Parcelable> extends ObservableField<T> implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new fr5(0);
    static final long serialVersionUID = 1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.j, 0);
    }
}
