package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.uq9;
import defpackage.uy6;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzjo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjo> CREATOR = new uq9(14);
    public final boolean a;
    public final boolean b;

    public zzjo(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjo)) {
            return false;
        }
        zzjo zzjoVar = (zzjo) obj;
        return this.a == zzjoVar.a && this.b == zzjoVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UwbConnectivityCapability<S-STS: " + this.a + ", P-STS: " + this.b + SimpleComparison.GREATER_THAN_OPERATION;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
