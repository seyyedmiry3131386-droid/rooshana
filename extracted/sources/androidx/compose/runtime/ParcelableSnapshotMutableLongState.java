package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c08;
import defpackage.g08;
import defpackage.o08;
import defpackage.p08;
import defpackage.vt2;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableLongState extends p08 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new d(3);

    public ParcelableSnapshotMutableLongState(long j) {
        c08 c08VarJ = g08.j();
        o08 o08Var = new o08(c08VarJ.g(), j);
        if (!(c08VarJ instanceof vt2)) {
            o08Var.b = new o08(1, j);
        }
        this.b = o08Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
