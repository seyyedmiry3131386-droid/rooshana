package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.qt4;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieCredit implements Parcelable {
    public static final Parcelable.Creator<MovieCredit> CREATOR = new qt4(2);
    public final int a;
    public final int b;

    public MovieCredit(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieCredit)) {
            return false;
        }
        MovieCredit movieCredit = (MovieCredit) obj;
        return this.a == movieCredit.a && this.b == movieCredit.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "MovieCredit(startTime=" + this.a + ", endTime=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
