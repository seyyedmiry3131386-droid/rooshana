package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.uq9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new uq9(6);
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public zzi(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (Arrays.equals(this.a, zziVar.a) && Arrays.equals(this.b, zziVar.b) && Arrays.equals(this.c, zziVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        byte[] bArr = this.a;
        Integer numValueOf = bArr == null ? null : Integer.valueOf(Arrays.hashCode(bArr));
        byte[] bArr2 = this.b;
        Integer numValueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.c;
        return "BluetoothConnectivityInfo:<bluetoothMacAddress hash: " + numValueOf + ", bluetoothUuid hash: " + numValueOf2 + ", actions hash: " + (bArr3 != null ? Integer.valueOf(Arrays.hashCode(bArr3)) : null) + SimpleComparison.GREATER_THAN_OPERATION;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        byte[] bArr = this.a;
        uy6.w(parcel, 1, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.b;
        uy6.w(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone(), false);
        byte[] bArr3 = this.c;
        uy6.w(parcel, 3, bArr3 != null ? (byte[]) bArr3.clone() : null, false);
        uy6.K(iJ, parcel);
    }
}
