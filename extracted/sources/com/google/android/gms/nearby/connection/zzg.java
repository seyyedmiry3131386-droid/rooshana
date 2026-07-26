package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.up9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new up9(13);
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;

    public zzg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = bArr4;
        this.e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (Arrays.equals(this.a, zzgVar.a) && Arrays.equals(this.b, zzgVar.b) && Arrays.equals(this.c, zzgVar.c) && Arrays.equals(this.d, zzgVar.d) && Arrays.equals(this.e, zzgVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final String toString() {
        String string;
        byte[] bArr = this.a;
        if (bArr != null && bArr.length == 6) {
            StringBuilder sb = new StringBuilder(18);
            int i = 0;
            for (int i2 = 0; i2 < 6; i2++) {
                byte b = bArr[i2];
                if (sb.length() > 0) {
                    sb.append(':');
                }
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            string = sb.toString();
            while (true) {
                int length = string.length();
                if (i >= length) {
                    break;
                }
                char cCharAt = string.charAt(i);
                if (cCharAt < 'a' || cCharAt > 'z') {
                    i++;
                } else {
                    char[] charArray = string.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (c >= 'a' && c <= 'z') {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    string = String.valueOf(charArray);
                }
            }
        } else {
            string = null;
        }
        byte[] bArr2 = this.b;
        Integer numValueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.c;
        Integer numValueOf2 = bArr3 == null ? null : Integer.valueOf(Arrays.hashCode(bArr3));
        byte[] bArr4 = this.d;
        Integer numValueOf3 = bArr4 == null ? null : Integer.valueOf(Arrays.hashCode(bArr4));
        byte[] bArr5 = this.e;
        return "BleConnectivityInfo:<bleMacAddress hash: " + string + ", bleGattCharacteristic hash: " + numValueOf + ", actions hash: " + numValueOf2 + ", psm hash: " + numValueOf3 + ", deviceToken hash : " + (bArr5 != null ? Integer.valueOf(Arrays.hashCode(bArr5)) : null) + SimpleComparison.GREATER_THAN_OPERATION;
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
        uy6.w(parcel, 4, bArr4 == null ? null : (byte[]) bArr4.clone(), false);
        byte[] bArr5 = this.e;
        uy6.w(parcel, 5, bArr5 != null ? (byte[]) bArr5.clone() : null, false);
        uy6.K(iJ, parcel);
    }
}
