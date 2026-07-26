package androidx.paging.compose;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dw1;
import defpackage.qt4;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PagingPlaceholderKey implements Parcelable {
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new qt4(14);
    public final int a;

    public PagingPlaceholderKey(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagingPlaceholderKey) && this.a == ((PagingPlaceholderKey) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return dw1.q(new StringBuilder("PagingPlaceholderKey(index="), this.a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
