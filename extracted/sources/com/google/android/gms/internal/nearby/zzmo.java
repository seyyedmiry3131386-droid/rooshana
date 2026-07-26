package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import defpackage.xr9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzmo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmo> CREATOR = new ds9(12);
    public xr9 a;
    public zzlw b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmo) {
            zzmo zzmoVar = (zzmo) obj;
            if (vy2.w(this.a, zzmoVar.a) && vy2.w(this.b, zzmoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.y(parcel, 1, this.a.o);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.K(iJ, parcel);
    }
}
