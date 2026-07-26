package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.js3;
import defpackage.rm7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class RestrictionInfo implements Parcelable {
    public static final Parcelable.Creator<RestrictionInfo> CREATOR = new ao6(9);
    public final String a;
    public final String b;
    public final String c;
    public final RestrictionButton d;
    public final RestrictionButton e;

    public RestrictionInfo(String str, String str2, String str3, RestrictionButton restrictionButton, RestrictionButton restrictionButton2) {
        js3.p(str3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = restrictionButton;
        this.e = restrictionButton2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestrictionInfo)) {
            return false;
        }
        RestrictionInfo restrictionInfo = (RestrictionInfo) obj;
        return js3.i(this.a, restrictionInfo.a) && js3.i(this.b, restrictionInfo.b) && js3.i(this.c, restrictionInfo.c) && js3.i(this.d, restrictionInfo.d) && js3.i(this.e, restrictionInfo.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iK = rm7.k(this.c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        RestrictionButton restrictionButton = this.d;
        int iHashCode2 = (iK + (restrictionButton == null ? 0 : restrictionButton.hashCode())) * 31;
        RestrictionButton restrictionButton2 = this.e;
        return iHashCode2 + (restrictionButton2 != null ? restrictionButton2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("RestrictionInfo(iconUrl=", this.a, ", title=", this.b, ", description=");
        sbT.append(this.c);
        sbT.append(", primaryButton=");
        sbT.append(this.d);
        sbT.append(", secondaryButton=");
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
        RestrictionButton restrictionButton = this.d;
        if (restrictionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            restrictionButton.writeToParcel(parcel, i);
        }
        RestrictionButton restrictionButton2 = this.e;
        if (restrictionButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            restrictionButton2.writeToParcel(parcel, i);
        }
    }
}
