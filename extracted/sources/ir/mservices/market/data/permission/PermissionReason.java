package ir.mservices.market.data.permission;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.qt4;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionReason implements Parcelable {
    public static final Parcelable.Creator<PermissionReason> CREATOR = new qt4(20);
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public PermissionReason(String str, boolean z, String str2, String str3, String str4, String str5, int i, String str6) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.g = str3;
        this.h = str6;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public PermissionReason(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public PermissionReason(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.d = parcel.readByte() != 0;
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
