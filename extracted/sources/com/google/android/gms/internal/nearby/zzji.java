package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;
import defpackage.uq9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzji extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzji> CREATOR = new uq9(11);
    public final int a;

    public zzji(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzji) && this.a == ((zzji) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        return dw1.q(new StringBuilder("PresenceAction[action="), this.a, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}
