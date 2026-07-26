package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.o40;
import defpackage.rq4;
import defpackage.uq9;
import defpackage.uy6;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzjc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjc> CREATOR = new uq9(8);
    public final String a;

    public zzjc(String str) {
        rq4.h("Cast id should be at most 32 characters.", str.length() <= 32);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjc)) {
            return false;
        }
        return Objects.equals(this.a, ((zzjc) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(17, this.a);
    }

    public final String toString() {
        Locale locale = Locale.US;
        return o40.y("DataElement<type: CastId, Id: ", this.a, SimpleComparison.GREATER_THAN_OPERATION);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.K(iJ, parcel);
    }
}
