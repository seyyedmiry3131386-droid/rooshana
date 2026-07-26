package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.bl4;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class RestrictionButton implements Parcelable {
    public static final Parcelable.Creator<RestrictionButton> CREATOR = new ao6(8);
    public final String a;
    public final String b;

    public RestrictionButton(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictionButton)) {
            return false;
        }
        RestrictionButton restrictionButton = (RestrictionButton) obj;
        return js3.i(this.a, restrictionButton.a) && js3.i(this.b, restrictionButton.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return bl4.w("RestrictionButton(actionText=", this.a, ", action=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
