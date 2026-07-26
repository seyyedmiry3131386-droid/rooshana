package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgp> CREATOR = new up9(8);
    public final String a;
    public final int b;
    public final zzo c;

    public zzgp(String str, int i, zzo zzoVar) {
        this.a = str;
        this.b = i;
        this.c = zzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgp) {
            zzgp zzgpVar = (zzgp) obj;
            if (vy2.w(this.a, zzgpVar.a) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzgpVar.b)) && vy2.w(this.c, zzgpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.K(iJ, parcel);
    }
}
