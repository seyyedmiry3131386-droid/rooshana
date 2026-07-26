package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionItem implements Parcelable {
    public static final Parcelable.Creator<SubscriptionItem> CREATOR = new ao6(17);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public SubscriptionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        js3.p(str, "title");
        js3.p(str2, "actionText");
        js3.p(str4, PackageListMetaDataDTO.KEY_ACTION);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionItem)) {
            return false;
        }
        SubscriptionItem subscriptionItem = (SubscriptionItem) obj;
        return js3.i(this.a, subscriptionItem.a) && js3.i(this.c, subscriptionItem.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SubscriptionItem(title=", this.a, ", actionText=", this.b, ", subTitle=");
        o40.I(this.c, ", action=", this.d, ", selectedIcon=", sbT);
        o40.I(this.e, ", deselectedIcon=", this.f, ", imageType=", sbT);
        return dw1.p(this.g, ", id=", this.h, ")", sbT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }
}
