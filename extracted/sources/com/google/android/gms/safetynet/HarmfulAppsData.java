package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new hm9(2);
    public final String a;
    public final byte[] b;
    public final int c;

    public HarmfulAppsData(String str, byte[] bArr, int i) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 2, this.a, false);
        uy6.w(parcel, 3, this.b, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.c);
        uy6.K(iJ, parcel);
    }
}
