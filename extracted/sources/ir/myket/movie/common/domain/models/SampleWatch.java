package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;

/* JADX INFO: loaded from: classes3.dex */
public final class SampleWatch implements Parcelable {
    public static final Parcelable.Creator<SampleWatch> CREATOR = new ao6(11);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final RestrictionButton e;

    public SampleWatch(String str, String str2, String str3, String str4, RestrictionButton restrictionButton) {
        js3.p(str3, "dialogTitle");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = restrictionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SampleWatch)) {
            return false;
        }
        SampleWatch sampleWatch = (SampleWatch) obj;
        return js3.i(this.a, sampleWatch.a) && js3.i(this.b, sampleWatch.b) && js3.i(this.c, sampleWatch.c) && js3.i(this.d, sampleWatch.d) && js3.i(this.e, sampleWatch.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iK = rm7.k(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.d;
        int iHashCode2 = (iK + (str3 == null ? 0 : str3.hashCode())) * 31;
        RestrictionButton restrictionButton = this.e;
        return iHashCode2 + (restrictionButton != null ? restrictionButton.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SampleWatch(boxTitle=", this.a, ", hint=", this.b, ", dialogTitle=");
        o40.I(this.c, ", dialogDescription=", this.d, ", primaryButton=", sbT);
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        RestrictionButton restrictionButton = this.e;
        if (restrictionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            restrictionButton.writeToParcel(parcel, i);
        }
    }
}
