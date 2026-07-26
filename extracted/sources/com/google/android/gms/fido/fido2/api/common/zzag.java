package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.rq4;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new nj9(26);
    public final String a;

    public zzag(String str) {
        rq4.n(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.a.equals(((zzag) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.K(iJ, parcel);
    }
}
