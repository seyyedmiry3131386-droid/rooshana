package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new nj9(11);
    public final String a;
    public final int b;
    public final long c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.e = i;
        this.a = str;
        this.b = i2;
        this.c = j;
        this.d = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.a + ", method: " + this.b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.I(parcel, 3, 8);
        parcel.writeLong(this.c);
        uy6.w(parcel, 4, this.d, false);
        uy6.v(parcel, 5, this.f);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.e);
        uy6.K(iJ, parcel);
    }
}
