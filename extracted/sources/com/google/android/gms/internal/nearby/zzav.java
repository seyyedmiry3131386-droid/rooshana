package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pp9;
import defpackage.sk9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new sk9(13);
    public pp9 a;
    public long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzav) {
            zzav zzavVar = (zzav) obj;
            if (vy2.w(this.a, zzavVar.a) && vy2.w(Long.valueOf(this.b), Long.valueOf(zzavVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        pp9 pp9Var = this.a;
        uy6.y(parcel, 1, pp9Var == null ? null : pp9Var.asBinder());
        long j = this.b;
        uy6.I(parcel, 2, 8);
        parcel.writeLong(j);
        uy6.K(iJ, parcel);
    }
}
