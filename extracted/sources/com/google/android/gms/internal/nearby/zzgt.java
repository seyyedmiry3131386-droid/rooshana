package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgt> CREATOR = new up9(10);
    public final String a;
    public final PayloadTransferUpdate b;
    public final int c;
    public final zzjk d;
    public final zzo e;

    public zzgt(String str, PayloadTransferUpdate payloadTransferUpdate, int i, zzjk zzjkVar, zzo zzoVar) {
        this.a = str;
        this.b = payloadTransferUpdate;
        this.c = i;
        this.d = zzjkVar;
        this.e = zzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgt) {
            zzgt zzgtVar = (zzgt) obj;
            if (vy2.w(this.a, zzgtVar.a) && vy2.w(this.b, zzgtVar.b) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zzgtVar.c)) && vy2.w(this.d, zzgtVar.d) && vy2.w(this.e, zzgtVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.K(iJ, parcel);
    }
}
