package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.bl4;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendationTime implements Parcelable {
    public static final Parcelable.Creator<RecommendationTime> CREATOR = new ao6(5);
    public final int a;

    public RecommendationTime(int i) {
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
        return (obj instanceof RecommendationTime) && this.a == ((RecommendationTime) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return bl4.q(this.a, "RecommendationTime(second=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeInt(this.a);
    }
}
