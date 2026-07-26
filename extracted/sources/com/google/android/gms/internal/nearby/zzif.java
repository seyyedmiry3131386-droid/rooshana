package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import defpackage.fp9;
import defpackage.jp9;
import defpackage.pp9;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzif extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzif> CREATOR = new up9(27);
    public pp9 a;
    public String b;
    public long c;
    public DiscoveryOptions d;
    public jp9 e;
    public fp9 f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzif) {
            zzif zzifVar = (zzif) obj;
            if (vy2.w(this.a, zzifVar.a) && vy2.w(this.f, zzifVar.f) && vy2.w(this.b, zzifVar.b) && vy2.w(Long.valueOf(this.c), Long.valueOf(zzifVar.c)) && vy2.w(this.d, zzifVar.d) && vy2.w(this.e, zzifVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f, this.b, Long.valueOf(this.c), this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        pp9 pp9Var = this.a;
        uy6.y(parcel, 1, pp9Var == null ? null : pp9Var.asBinder());
        fp9 fp9Var = this.f;
        uy6.y(parcel, 2, fp9Var == null ? null : fp9Var.o);
        uy6.D(parcel, 3, this.b, false);
        long j = this.c;
        uy6.I(parcel, 4, 8);
        parcel.writeLong(j);
        uy6.C(parcel, 5, this.d, i, false);
        jp9 jp9Var = this.e;
        uy6.y(parcel, 6, jp9Var != null ? jp9Var.asBinder() : null);
        uy6.K(iJ, parcel);
    }
}
