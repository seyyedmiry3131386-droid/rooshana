package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c08;
import defpackage.g08;
import defpackage.m08;
import defpackage.n08;
import defpackage.vt2;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableIntState extends n08 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new d(2);

    public ParcelableSnapshotMutableIntState(int i) {
        c08 c08VarJ = g08.j();
        m08 m08Var = new m08(i, c08VarJ.g());
        if (!(c08VarJ instanceof vt2)) {
            m08Var.b = new m08(i, 1);
        }
        this.b = m08Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
