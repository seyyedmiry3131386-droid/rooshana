package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qt4;
import defpackage.r49;
import defpackage.s49;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new qt4(15);
    public final s49 a;

    public ParcelImpl(s49 s49Var) {
        this.a = s49Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new r49(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new r49(parcel).h();
    }
}
