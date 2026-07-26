package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.rq4;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new nj9(28);
    public final byte[][] a;

    public zzai(byte[][] bArr) {
        rq4.i(bArr != null);
        rq4.i(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            rq4.i(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            rq4.i(bArr[i2] != null);
            int length = bArr[i2].length;
            rq4.i(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.a, ((zzai) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.a) {
            iHashCode ^= Arrays.hashCode(new Object[]{bArr});
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        byte[][] bArr = this.a;
        if (bArr != null) {
            int iJ2 = uy6.J(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            uy6.K(iJ2, parcel);
        }
        uy6.K(iJ, parcel);
    }
}
