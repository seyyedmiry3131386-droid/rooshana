package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sk9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new sk9(22);
    public final int a;
    public final PendingIntent b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.e = i;
        this.a = i2;
        this.c = i3;
        this.f = bundle;
        this.d = bArr;
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.v(parcel, 4, this.f);
        uy6.w(parcel, 5, this.d, false);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.e);
        uy6.K(iJ, parcel);
    }
}
