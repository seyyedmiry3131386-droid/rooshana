package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.hm9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzeu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeu> CREATOR = new hm9(24);
    public String a;
    public final int b;
    public final zzjk c;
    public final zzo d;

    public zzeu() {
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeu) {
            zzeu zzeuVar = (zzeu) obj;
            if (vy2.w(this.a, zzeuVar.a) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzeuVar.b)) && vy2.w(this.c, zzeuVar.c) && vy2.w(this.d, zzeuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.K(iJ, parcel);
    }

    public zzeu(String str, int i, zzjk zzjkVar, zzo zzoVar) {
        this.a = str;
        this.b = i;
        this.c = zzjkVar;
        this.d = zzoVar;
    }
}
