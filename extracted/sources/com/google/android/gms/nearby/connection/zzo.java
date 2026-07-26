package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.ds9;
import defpackage.dw1;
import defpackage.rm7;
import defpackage.uy6;
import defpackage.vy2;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new ds9(24);
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final int e;

    public zzo(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzo) {
            zzo zzoVar = (zzo) obj;
            if (vy2.w(this.a, zzoVar.a) && Arrays.equals(this.b, zzoVar.b) && Arrays.equals(this.c, zzoVar.c) && Arrays.equals(this.d, zzoVar.d) && this.e == zzoVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(this.e)});
    }

    public final String toString() {
        byte[] bArr = this.b;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.d;
        String string2 = bArr2 != null ? Arrays.toString(bArr2) : null;
        int i = this.e;
        return dw1.p(string2, ", instanceType : ", i != 0 ? i != 1 ? i != 2 ? "OTHER" : "Secondary" : CommonDataKt.PLAYER_TYPE_MAIN : "UNKNOWN", SimpleComparison.GREATER_THAN_OPERATION, rm7.t("ConnectionsDevice:<endpointId: ", this.a, ", endpointInfo: ", string, ", connectivityBytes: "));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        byte[] bArr = this.b;
        uy6.w(parcel, 2, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.c;
        uy6.w(parcel, 3, bArr2 != null ? (byte[]) bArr2.clone() : null, false);
        uy6.w(parcel, 4, this.d, false);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e);
        uy6.K(iJ, parcel);
    }
}
