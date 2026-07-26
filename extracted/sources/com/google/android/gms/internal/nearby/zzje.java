package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzje extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzje> CREATOR = new uq9(9);
    public final zzjm a;
    public final zzjc b;
    public final byte[] c;
    public final boolean d;
    public final List e;
    public final List f;
    public final List g;
    public final zzjo h;
    public final zzjg i;

    public zzje(zzjm zzjmVar, zzjc zzjcVar, byte[] bArr, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, zzjo zzjoVar, zzjg zzjgVar) {
        this.a = zzjmVar;
        this.b = zzjcVar;
        this.c = bArr;
        this.d = z;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = zzjoVar;
        this.i = zzjgVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzje) {
            zzje zzjeVar = (zzje) obj;
            if (vy2.w(this.a, zzjeVar.a) && vy2.w(this.b, zzjeVar.b) && Arrays.equals(this.c, zzjeVar.c) && this.d == zzjeVar.d && vy2.w(this.e, zzjeVar.e) && vy2.w(this.f, zzjeVar.f) && vy2.w(this.g, zzjeVar.g) && vy2.w(this.h, zzjeVar.h) && vy2.w(this.i, zzjeVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.d), this.e, this.f, this.g, this.h, this.i});
    }

    public final String toString() {
        return String.format(Locale.US, "<DataElementCollection: sequenceNumber=%s, castId=%s, deduplicationHint=%s, deduplicationHintEnabled=%s, bleGattConnectivityInfo = %s, wifiLanConnectivityInfoList = %s, bluetoothConnectivityInfoList = %s, connectivityCapability = %s, deviceType = %s>", this.a, this.b, Arrays.toString(this.c), Boolean.valueOf(this.d), this.e, this.f, this.g, this.h, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.w(parcel, 3, this.c, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.H(parcel, 5, this.e, false);
        uy6.H(parcel, 6, this.f, false);
        uy6.H(parcel, 7, this.g, false);
        uy6.C(parcel, 8, this.h, i, false);
        uy6.C(parcel, 9, this.i, i, false);
        uy6.K(iJ, parcel);
    }
}
