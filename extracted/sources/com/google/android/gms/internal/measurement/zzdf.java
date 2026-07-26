package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.uy6;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new hm9(19);
    public final int a;
    public final String b;
    public final Intent c;

    public zzdf(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static zzdf u(Activity activity2) {
        return new zzdf(activity2.hashCode(), activity2.getClass().getCanonicalName(), activity2.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.a == zzdfVar.a && Objects.equals(this.b, zzdfVar.b) && Objects.equals(this.c, zzdfVar.c);
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.K(iJ, parcel);
    }
}
