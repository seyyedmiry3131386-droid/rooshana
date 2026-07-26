package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.rq4;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new ds9(27);
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = j;
        rq4.n(bArr);
        this.b = bArr;
        rq4.n(bArr2);
        this.c = bArr2;
        rq4.n(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.a == zzqVar.a && Arrays.equals(this.b, zzqVar.b) && Arrays.equals(this.c, zzqVar.c) && Arrays.equals(this.d, zzqVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 8);
        parcel.writeLong(this.a);
        uy6.w(parcel, 2, this.b, false);
        uy6.w(parcel, 3, this.c, false);
        uy6.w(parcel, 4, this.d, false);
        uy6.K(iJ, parcel);
    }
}
