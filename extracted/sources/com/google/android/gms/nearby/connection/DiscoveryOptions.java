package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ix9;
import defpackage.nm9;
import defpackage.o40;
import defpackage.t61;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;
import java.util.Locale;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new ix9(3);
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ParcelUuid f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public long n;
    public int[] o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            if (vy2.w(this.a, discoveryOptions.a) && vy2.w(Boolean.valueOf(this.b), Boolean.valueOf(discoveryOptions.b)) && vy2.w(Boolean.valueOf(this.c), Boolean.valueOf(discoveryOptions.c)) && vy2.w(Boolean.valueOf(this.d), Boolean.valueOf(discoveryOptions.d)) && vy2.w(Boolean.valueOf(this.e), Boolean.valueOf(discoveryOptions.e)) && vy2.w(this.f, discoveryOptions.f) && vy2.w(Boolean.valueOf(this.g), Boolean.valueOf(discoveryOptions.g)) && vy2.w(Boolean.valueOf(this.h), Boolean.valueOf(discoveryOptions.h)) && vy2.w(Boolean.valueOf(this.i), Boolean.valueOf(discoveryOptions.i)) && vy2.w(Boolean.valueOf(this.j), Boolean.valueOf(discoveryOptions.j)) && vy2.w(Integer.valueOf(this.k), Integer.valueOf(discoveryOptions.k)) && vy2.w(Integer.valueOf(this.l), Integer.valueOf(discoveryOptions.l)) && Arrays.equals(this.m, discoveryOptions.m) && vy2.w(Long.valueOf(this.n), Long.valueOf(discoveryOptions.n)) && Arrays.equals(this.o, discoveryOptions.o) && vy2.w(Boolean.valueOf(this.p), Boolean.valueOf(discoveryOptions.p)) && vy2.w(Boolean.valueOf(this.q), Boolean.valueOf(discoveryOptions.q)) && vy2.w(Boolean.valueOf(this.r), Boolean.valueOf(discoveryOptions.r)) && vy2.w(Boolean.valueOf(this.s), Boolean.valueOf(discoveryOptions.s))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(Arrays.hashCode(this.m)), Long.valueOf(this.n), Integer.valueOf(Arrays.hashCode(this.o)), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        ParcelUuid parcelUuid = this.f;
        boolean z5 = this.g;
        boolean z6 = this.h;
        boolean z7 = this.i;
        boolean z8 = this.j;
        int i = this.k;
        int i2 = this.l;
        byte[] bArr = this.m;
        String strA = bArr == null ? Ssh2PublicKeyAlgorithmName.NULL : nm9.a(bArr);
        long j = this.n;
        boolean z9 = this.p;
        StringBuilder sb = new StringBuilder("DiscoveryOptions{strategy: ");
        sb.append(strategy);
        sb.append(", forwardUnrecognizedBluetoothDevices: ");
        sb.append(z);
        sb.append(", enableBluetooth: ");
        t61.A(sb, z2, ", enableBle: ", z3, ", lowPower: ");
        sb.append(z4);
        sb.append(", fastAdvertisementServiceUuid: ");
        sb.append(parcelUuid);
        sb.append(", enableWifiLan: ");
        t61.A(sb, z5, ", enableNfc: ", z6, ", enableWifiAware: ");
        t61.A(sb, z7, ", enableUwbRanging: ", z8, ", uwbChannel: ");
        o40.J(sb, i, ", uwbPreambleIndex: ", i2, ", uwbAddress: ");
        sb.append(strA);
        sb.append(", flowId: ");
        sb.append(j);
        sb.append(", allowGattConnections: ");
        sb.append(z9);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        boolean z = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.d;
        uy6.I(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.e;
        uy6.I(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        uy6.C(parcel, 6, this.f, i, false);
        boolean z5 = this.g;
        uy6.I(parcel, 8, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.h;
        uy6.I(parcel, 9, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.i;
        uy6.I(parcel, 10, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.j;
        uy6.I(parcel, 11, 4);
        parcel.writeInt(z8 ? 1 : 0);
        int i2 = this.k;
        uy6.I(parcel, 12, 4);
        parcel.writeInt(i2);
        int i3 = this.l;
        uy6.I(parcel, 13, 4);
        parcel.writeInt(i3);
        uy6.w(parcel, 14, this.m, false);
        long j = this.n;
        uy6.I(parcel, 15, 8);
        parcel.writeLong(j);
        uy6.z(parcel, 16, this.o);
        boolean z9 = this.p;
        uy6.I(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.q;
        uy6.I(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.r;
        uy6.I(parcel, 19, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.s;
        uy6.I(parcel, 20, 4);
        parcel.writeInt(z12 ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
