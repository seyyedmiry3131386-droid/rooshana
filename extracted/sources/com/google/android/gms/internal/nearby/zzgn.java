package com.google.android.gms.internal.nearby;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgn> CREATOR = new up9(7);
    public final String a;
    public final String b;
    public final String c;
    public final BluetoothDevice d;
    public final byte[] e;
    public final int f;
    public final zzo g;

    public zzgn(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr, int i, zzo zzoVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bluetoothDevice;
        this.e = bArr;
        this.f = i;
        this.g = zzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgn) {
            zzgn zzgnVar = (zzgn) obj;
            if (vy2.w(this.a, zzgnVar.a) && vy2.w(this.b, zzgnVar.b) && vy2.w(this.c, zzgnVar.c) && vy2.w(this.d, zzgnVar.d) && Arrays.equals(this.e, zzgnVar.e) && vy2.w(Integer.valueOf(this.f), Integer.valueOf(zzgnVar.f)) && vy2.w(this.g, zzgnVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.w(parcel, 5, this.e, false);
        uy6.I(parcel, 6, 4);
        parcel.writeInt(this.f);
        uy6.C(parcel, 7, this.g, i, false);
        uy6.K(iJ, parcel);
    }
}
