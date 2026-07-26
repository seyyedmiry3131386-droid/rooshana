package ir.mservices.market.data.permission;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Permission implements Parcelable {
    public final int a;
    public final String b;
    public final PermissionReason c;
    public PermissionResult d;
    public final Quality e;
    public final String f;

    public Permission(int i, String str, PermissionReason permissionReason, Quality quality, String str2) {
        this.d = PermissionResult.NOT_SET;
        this.a = i;
        this.b = str;
        this.c = permissionReason;
        this.e = quality;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Permission) && ((Permission) obj).b.equalsIgnoreCase(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d.a);
        parcel.writeInt(this.e.a);
        parcel.writeString(this.f);
    }

    public Permission(Parcel parcel) {
        PermissionResult permissionResult = PermissionResult.NOT_SET;
        this.d = permissionResult;
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = (PermissionReason) parcel.readParcelable(PermissionReason.class.getClassLoader());
        this.d = new PermissionResult[]{permissionResult, PermissionResult.GRANTED, PermissionResult.DENIED, PermissionResult.DENIED_FOREVER}[parcel.readInt()];
        this.e = Quality.values()[parcel.readInt()];
        this.f = parcel.readString();
    }
}
