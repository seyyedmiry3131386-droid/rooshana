package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import defpackage.nj9;
import defpackage.o40;
import defpackage.rq4;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new nj9(23);
    public final int a;
    public final Message b;

    public zzae(int i, Message message) {
        this.a = i;
        rq4.n(message);
        this.b = message;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzae) {
            return vy2.w(this.b, ((zzae) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        return o40.y("MessageWrapper{message=", this.b.toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.b, i, false);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}
