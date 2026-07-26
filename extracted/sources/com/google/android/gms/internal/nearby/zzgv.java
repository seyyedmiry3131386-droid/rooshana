package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgv> CREATOR = new up9(11);
    public int a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgv) {
            zzgv zzgvVar = (zzgv) obj;
            if (vy2.w(Integer.valueOf(this.a), Integer.valueOf(zzgvVar.a)) && vy2.w(this.b, zzgvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        int i2 = this.a;
        uy6.I(parcel, 1, 4);
        parcel.writeInt(i2);
        uy6.D(parcel, 2, this.b, false);
        uy6.K(iJ, parcel);
    }
}
