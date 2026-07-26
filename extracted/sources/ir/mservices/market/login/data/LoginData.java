package ir.mservices.market.login.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fr5;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginData implements BindData {
    public static final Parcelable.Creator<LoginData> CREATOR = new fr5(19);
    public BindData a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginData(PhoneBindData phoneBindData, String str, String str2) {
        this(phoneBindData, str, str2, (String) null, (String) null, (String) null, (String) null, 1016);
        js3.p(str2, "label");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
    }

    public LoginData(BindData bindData, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        js3.p(str2, "label");
        this.a = bindData;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = null;
        this.i = null;
        this.j = z;
    }

    public /* synthetic */ LoginData(BindData bindData, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this(bindData, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, false);
    }
}
