package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.bl4;
import defpackage.nj9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new nj9(22);
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public zzae(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = bArr4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzae) {
            zzae zzaeVar = (zzae) obj;
            if (Arrays.equals(this.a, zzaeVar.a) && Arrays.equals(this.b, zzaeVar.b) && Arrays.equals(this.c, zzaeVar.c) && Arrays.equals(this.d, zzaeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        int iHashCode = Arrays.hashCode(this.a);
        int iHashCode2 = Arrays.hashCode(this.b);
        int iHashCode3 = Arrays.hashCode(this.c);
        int iHashCode4 = Arrays.hashCode(this.d);
        StringBuilder sbB = bl4.B(iHashCode, iHashCode2, "WifiLanConnectivityInfo:<wifiLanPort hash: ", ">, <wifiLanIp hash: ", ">, <BSSID hash: ");
        sbB.append(iHashCode3);
        sbB.append(">, <actions hash: ");
        sbB.append(iHashCode4);
        sbB.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sbB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        byte[] bArr = this.a;
        uy6.w(parcel, 1, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.b;
        uy6.w(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone(), false);
        byte[] bArr3 = this.c;
        uy6.w(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone(), false);
        byte[] bArr4 = this.d;
        uy6.w(parcel, 4, bArr4 != null ? (byte[]) bArr4.clone() : null, false);
        uy6.K(iJ, parcel);
    }
}
