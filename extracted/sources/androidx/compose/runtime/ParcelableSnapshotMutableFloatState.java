package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c08;
import defpackage.g08;
import defpackage.k08;
import defpackage.l08;
import defpackage.vt2;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableFloatState extends l08 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new d(1);

    public ParcelableSnapshotMutableFloatState(float f) {
        c08 c08VarJ = g08.j();
        k08 k08Var = new k08(f, c08VarJ.g());
        if (!(c08VarJ instanceof vt2)) {
            k08Var.b = new k08(f, 1);
        }
        this.b = k08Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
