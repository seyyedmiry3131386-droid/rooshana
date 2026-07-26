package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new nj9(20);
    public final int a;
    public final String b;
    public final String c;

    public zzac(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzac) && hashCode() == obj.hashCode()) {
            zzac zzacVar = (zzac) obj;
            if (vy2.w(this.b, zzacVar.b) && vy2.w(this.c, zzacVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        return "namespace=" + this.b + ", type=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.b, false);
        uy6.D(parcel, 2, this.c, false);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}
