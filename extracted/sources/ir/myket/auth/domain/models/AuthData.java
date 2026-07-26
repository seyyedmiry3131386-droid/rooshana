package ir.myket.auth.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fr5;
import defpackage.js3;
import defpackage.rm7;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthData implements Parcelable {
    public static final Parcelable.Creator<AuthData> CREATOR = new fr5(6);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public AuthData(String str, String str2, String str3, boolean z) {
        js3.p(str, "token");
        js3.p(str2, "accountId");
        js3.p(str3, "accountKey");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthData)) {
            return false;
        }
        AuthData authData = (AuthData) obj;
        return js3.i(this.a, authData.a) && js3.i(this.b, authData.b) && js3.i(this.c, authData.c) && this.d == authData.d;
    }

    public final int hashCode() {
        return rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AuthData(token=", this.a, ", accountId=", this.b, ", accountKey=");
        sbT.append(this.c);
        sbT.append(", isUserLoggedIn=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
