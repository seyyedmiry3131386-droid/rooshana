package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.bl4;
import defpackage.uq9;
import defpackage.uy6;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzjg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjg> CREATOR = new uq9(10);
    public final int a;

    public zzjg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjg) {
            if (this.a == ((zzjg) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(22, Integer.valueOf(this.a));
    }

    public final String toString() {
        Locale locale = Locale.US;
        return bl4.q(this.a, "DataElement<type: DeviceType, value: ", SimpleComparison.GREATER_THAN_OPERATION);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}
