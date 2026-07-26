package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ix9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new ix9(8);
    public long a;
    public int b;
    public long c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            if (vy2.w(Long.valueOf(this.a), Long.valueOf(payloadTransferUpdate.a)) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(payloadTransferUpdate.b)) && vy2.w(Long.valueOf(this.c), Long.valueOf(payloadTransferUpdate.c)) && vy2.w(Long.valueOf(this.d), Long.valueOf(payloadTransferUpdate.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        long j = this.a;
        uy6.I(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        long j2 = this.c;
        uy6.I(parcel, 3, 8);
        parcel.writeLong(j2);
        long j3 = this.d;
        uy6.I(parcel, 4, 8);
        parcel.writeLong(j3);
        uy6.K(iJ, parcel);
    }
}
