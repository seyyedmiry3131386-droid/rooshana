package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sk9;
import defpackage.uy6;
import defpackage.vy2;
import defpackage.yj9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new sk9(1);
    public int a;
    public yj9 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzak) {
            zzak zzakVar = (zzak) obj;
            if (vy2.w(Integer.valueOf(this.a), Integer.valueOf(zzakVar.a)) && vy2.w(this.b, zzakVar.b)) {
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
        uy6.y(parcel, 2, this.b.o);
        uy6.K(iJ, parcel);
    }
}
