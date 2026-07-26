package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.nm9;
import defpackage.t61;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new ds9(16);
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public byte[] i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int[] o;
    public int[] p;
    public byte[] q;
    public Strategy r;
    public int s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj;
            if (vy2.w(Boolean.valueOf(this.a), Boolean.valueOf(connectionOptions.a)) && vy2.w(Boolean.valueOf(this.b), Boolean.valueOf(connectionOptions.b)) && vy2.w(Boolean.valueOf(this.c), Boolean.valueOf(connectionOptions.c)) && vy2.w(Boolean.valueOf(this.d), Boolean.valueOf(connectionOptions.d)) && vy2.w(Boolean.valueOf(this.e), Boolean.valueOf(connectionOptions.e)) && vy2.w(Boolean.valueOf(this.f), Boolean.valueOf(connectionOptions.f)) && vy2.w(Boolean.valueOf(this.g), Boolean.valueOf(connectionOptions.g)) && vy2.w(Boolean.valueOf(this.h), Boolean.valueOf(connectionOptions.h)) && Arrays.equals(this.i, connectionOptions.i) && vy2.w(Boolean.valueOf(this.j), Boolean.valueOf(connectionOptions.j)) && vy2.w(Boolean.valueOf(this.k), Boolean.valueOf(connectionOptions.k)) && vy2.w(Boolean.valueOf(this.l), Boolean.valueOf(connectionOptions.l)) && vy2.w(Integer.valueOf(this.m), Integer.valueOf(connectionOptions.m)) && vy2.w(Integer.valueOf(this.n), Integer.valueOf(connectionOptions.n)) && Arrays.equals(this.o, connectionOptions.o) && Arrays.equals(this.p, connectionOptions.p) && Arrays.equals(this.q, connectionOptions.q) && vy2.w(this.r, connectionOptions.r) && vy2.w(Integer.valueOf(this.s), Integer.valueOf(connectionOptions.s)) && vy2.w(Long.valueOf(this.t), Long.valueOf(connectionOptions.t)) && vy2.w(Boolean.valueOf(this.u), Boolean.valueOf(connectionOptions.u)) && vy2.w(Boolean.valueOf(this.v), Boolean.valueOf(connectionOptions.v)) && vy2.w(Boolean.valueOf(this.w), Boolean.valueOf(connectionOptions.w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(Arrays.hashCode(this.q)), this.r, Integer.valueOf(this.s), Long.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        byte[] bArr = this.i;
        String strA = bArr == null ? null : nm9.a(bArr);
        boolean z9 = this.j;
        boolean z10 = this.k;
        boolean z11 = this.l;
        byte[] bArr2 = this.q;
        String strA2 = bArr2 != null ? nm9.a(bArr2) : null;
        Strategy strategy = this.r;
        int i = this.s;
        long j = this.t;
        StringBuilder sb = new StringBuilder("ConnectionOptions{lowPower: ");
        sb.append(z);
        sb.append(", enableBluetooth: ");
        sb.append(z2);
        sb.append(", enableBle: ");
        t61.A(sb, z3, ", enableWifiLan: ", z4, ", enableNfc: ");
        t61.A(sb, z5, ", enableWifiAware: ", z6, ", enableWifiHotspot: ");
        t61.A(sb, z7, ", enableWifiDirect: ", z8, ", remoteBluetoothMacAddress: ");
        sb.append(strA);
        sb.append(", enableWebRtc: ");
        sb.append(z9);
        sb.append(", enforceTopologyConstraints: ");
        t61.A(sb, z10, ", disruptiveUpgrade: ", z11, ",deviceInfo: ");
        sb.append(strA2);
        sb.append(",strategy: ");
        sb.append(strategy);
        sb.append(",connectionType: ");
        sb.append(i);
        sb.append("flowId: ");
        sb.append(j);
        sb.append(", }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        boolean z = this.a;
        uy6.I(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.d;
        uy6.I(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.e;
        uy6.I(parcel, 5, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.f;
        uy6.I(parcel, 6, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.g;
        uy6.I(parcel, 7, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.h;
        uy6.I(parcel, 8, 4);
        parcel.writeInt(z8 ? 1 : 0);
        uy6.w(parcel, 9, this.i, false);
        boolean z9 = this.j;
        uy6.I(parcel, 10, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.k;
        uy6.I(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.l;
        uy6.I(parcel, 12, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i2 = this.m;
        uy6.I(parcel, 13, 4);
        parcel.writeInt(i2);
        int i3 = this.n;
        uy6.I(parcel, 14, 4);
        parcel.writeInt(i3);
        uy6.z(parcel, 15, this.o);
        uy6.z(parcel, 16, this.p);
        uy6.w(parcel, 17, this.q, false);
        uy6.C(parcel, 18, this.r, i, false);
        int i4 = this.s;
        uy6.I(parcel, 19, 4);
        parcel.writeInt(i4);
        long j = this.t;
        uy6.I(parcel, 20, 8);
        parcel.writeLong(j);
        boolean z12 = this.u;
        uy6.I(parcel, 21, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.v;
        uy6.I(parcel, 22, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.w;
        uy6.I(parcel, 23, 4);
        parcel.writeInt(z14 ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
