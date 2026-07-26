package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fr5;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class Credits implements Parcelable {
    public static final Parcelable.Creator<Credits> CREATOR = new fr5(9);
    public final MovieCredit a;
    public final MovieCredit b;

    public Credits(MovieCredit movieCredit, MovieCredit movieCredit2) {
        this.a = movieCredit;
        this.b = movieCredit2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credits)) {
            return false;
        }
        Credits credits = (Credits) obj;
        return js3.i(this.a, credits.a) && js3.i(this.b, credits.b);
    }

    public final int hashCode() {
        MovieCredit movieCredit = this.a;
        int iHashCode = (movieCredit == null ? 0 : movieCredit.hashCode()) * 31;
        MovieCredit movieCredit2 = this.b;
        return iHashCode + (movieCredit2 != null ? movieCredit2.hashCode() : 0);
    }

    public final String toString() {
        return "Credits(openingCredit=" + this.a + ", closingCredit=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        MovieCredit movieCredit = this.a;
        if (movieCredit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            movieCredit.writeToParcel(parcel, i);
        }
        MovieCredit movieCredit2 = this.b;
        if (movieCredit2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            movieCredit2.writeToParcel(parcel, i);
        }
    }
}
