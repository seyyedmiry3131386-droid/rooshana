package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hy2;
import defpackage.js3;
import defpackage.s08;
import defpackage.t08;
import defpackage.th0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class ParcelableSnapshotMutableState<T> extends s08 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new e();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        th0 th0Var = th0.p;
        t08 t08Var = this.b;
        if (js3.i(t08Var, th0Var)) {
            i2 = 0;
        } else if (js3.i(t08Var, th0.t)) {
            i2 = 1;
        } else {
            if (!js3.i(t08Var, hy2.r)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
