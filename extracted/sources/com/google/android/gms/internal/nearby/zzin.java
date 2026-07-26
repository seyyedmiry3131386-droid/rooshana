package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzin extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzin> CREATOR = new uq9(1);
    public final int a;
    public final ParcelUuid b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    public final byte[] h;
    public final byte[] i;

    public zzin(int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.a = i;
        this.b = parcelUuid;
        this.c = parcelUuid2;
        this.d = parcelUuid3;
        this.e = bArr;
        this.f = bArr2;
        this.g = i2;
        this.h = bArr3;
        this.i = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzin.class == obj.getClass()) {
            zzin zzinVar = (zzin) obj;
            if (this.g == zzinVar.g && Arrays.equals(this.h, zzinVar.h) && Arrays.equals(this.i, zzinVar.i) && vy2.w(this.d, zzinVar.d) && Arrays.equals(this.e, zzinVar.e) && Arrays.equals(this.f, zzinVar.f) && vy2.w(this.b, zzinVar.b) && vy2.w(this.c, zzinVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 4, this.b, i, false);
        uy6.C(parcel, 5, this.c, i, false);
        uy6.C(parcel, 6, this.d, i, false);
        uy6.w(parcel, 7, this.e, false);
        uy6.w(parcel, 8, this.f, false);
        uy6.I(parcel, 9, 4);
        parcel.writeInt(this.g);
        uy6.w(parcel, 10, this.h, false);
        uy6.w(parcel, 11, this.i, false);
        uy6.K(iJ, parcel);
    }
}
