package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new sk9(27);
    public final String a;
    public final byte[] b;

    public zzaz(String str, byte[] bArr) {
        rq4.n(str);
        this.a = str;
        rq4.n(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(1);
        uy6.D(parcel, 2, this.a, false);
        uy6.w(parcel, 3, this.b, false);
        uy6.K(iJ, parcel);
    }
}
