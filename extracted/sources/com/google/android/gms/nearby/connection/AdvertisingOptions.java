package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nm9;
import defpackage.o40;
import defpackage.sk9;
import defpackage.t61;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;
import java.util.Locale;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new sk9(18);
    public int A;
    public byte[] B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public byte[] f;
    public boolean g;
    public ParcelUuid h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public byte[] q;
    public long r;
    public zzac[] s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int[] x;
    public int[] y;
    public boolean z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            if (vy2.w(this.a, advertisingOptions.a) && vy2.w(Boolean.valueOf(this.b), Boolean.valueOf(advertisingOptions.b)) && vy2.w(Boolean.valueOf(this.c), Boolean.valueOf(advertisingOptions.c)) && vy2.w(Boolean.valueOf(this.d), Boolean.valueOf(advertisingOptions.d)) && vy2.w(Boolean.valueOf(this.e), Boolean.valueOf(advertisingOptions.e)) && Arrays.equals(this.f, advertisingOptions.f) && vy2.w(Boolean.valueOf(this.g), Boolean.valueOf(advertisingOptions.g)) && vy2.w(this.h, advertisingOptions.h) && vy2.w(Boolean.valueOf(this.i), Boolean.valueOf(advertisingOptions.i)) && vy2.w(Boolean.valueOf(this.j), Boolean.valueOf(advertisingOptions.j)) && vy2.w(Boolean.valueOf(this.k), Boolean.valueOf(advertisingOptions.k)) && vy2.w(Boolean.valueOf(this.l), Boolean.valueOf(advertisingOptions.l)) && vy2.w(Boolean.valueOf(this.m), Boolean.valueOf(advertisingOptions.m)) && vy2.w(Boolean.valueOf(this.n), Boolean.valueOf(advertisingOptions.n)) && vy2.w(Integer.valueOf(this.o), Integer.valueOf(advertisingOptions.o)) && vy2.w(Integer.valueOf(this.p), Integer.valueOf(advertisingOptions.p)) && Arrays.equals(this.q, advertisingOptions.q) && vy2.w(Long.valueOf(this.r), Long.valueOf(advertisingOptions.r)) && Arrays.equals(this.s, advertisingOptions.s) && vy2.w(Boolean.valueOf(this.t), Boolean.valueOf(advertisingOptions.t)) && vy2.w(Boolean.valueOf(this.u), Boolean.valueOf(advertisingOptions.u)) && vy2.w(Boolean.valueOf(this.v), Boolean.valueOf(advertisingOptions.v)) && vy2.w(Boolean.valueOf(this.w), Boolean.valueOf(advertisingOptions.w)) && Arrays.equals(this.x, advertisingOptions.x) && Arrays.equals(this.y, advertisingOptions.y) && vy2.w(Boolean.valueOf(this.z), Boolean.valueOf(advertisingOptions.z)) && vy2.w(Integer.valueOf(this.A), Integer.valueOf(advertisingOptions.A)) && Arrays.equals(this.B, advertisingOptions.B) && vy2.w(Boolean.valueOf(this.C), Boolean.valueOf(advertisingOptions.C)) && vy2.w(Integer.valueOf(this.D), Integer.valueOf(advertisingOptions.D)) && vy2.w(Boolean.valueOf(this.E), Boolean.valueOf(advertisingOptions.E)) && vy2.w(Boolean.valueOf(this.F), Boolean.valueOf(advertisingOptions.F)) && vy2.w(Boolean.valueOf(this.G), Boolean.valueOf(advertisingOptions.G)) && vy2.w(Boolean.valueOf(this.H), Boolean.valueOf(advertisingOptions.H))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m), Boolean.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(Arrays.hashCode(this.q)), Long.valueOf(this.r), Integer.valueOf(Arrays.hashCode(this.s)), Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w), Integer.valueOf(Arrays.hashCode(this.x)), Integer.valueOf(Arrays.hashCode(this.y)), Boolean.valueOf(this.z), Integer.valueOf(this.A), Integer.valueOf(Arrays.hashCode(this.B)), Boolean.valueOf(this.C), Integer.valueOf(this.D), Boolean.valueOf(this.E), Boolean.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        byte[] bArr = this.f;
        String strA = bArr == null ? null : nm9.a(bArr);
        boolean z5 = this.g;
        ParcelUuid parcelUuid = this.h;
        boolean z6 = this.i;
        boolean z7 = this.j;
        boolean z8 = this.k;
        boolean z9 = this.l;
        boolean z10 = this.m;
        boolean z11 = this.n;
        int i = this.o;
        int i2 = this.p;
        byte[] bArr2 = this.q;
        String strA2 = bArr2 == null ? Ssh2PublicKeyAlgorithmName.NULL : nm9.a(bArr2);
        long j = this.r;
        String string = Arrays.toString(this.s);
        boolean z12 = this.t;
        boolean z13 = this.u;
        boolean z14 = this.w;
        byte[] bArr3 = this.B;
        String strA3 = bArr3 == null ? null : nm9.a(bArr3);
        boolean z15 = this.C;
        int i3 = this.D;
        boolean z16 = this.H;
        StringBuilder sb = new StringBuilder("AdvertisingOptions{strategy: ");
        sb.append(strategy);
        sb.append(", autoUpgradeBandwidth: ");
        sb.append(z);
        sb.append(", enforceTopologyConstraints: ");
        t61.A(sb, z2, ", enableBluetooth: ", z3, ", enableBle: ");
        t61.z(sb, z4, ", nearbyNotificationsBeaconData: ", strA, ", lowPower: ");
        sb.append(z5);
        sb.append(", fastAdvertisementServiceUuid: ");
        sb.append(parcelUuid);
        sb.append(", enableWifiLan: ");
        t61.A(sb, z6, ", enableNfc: ", z7, ", enableWifiAware: ");
        t61.A(sb, z8, ", enableBluetoothListening: ", z9, ", enableWebRtcListening: ");
        t61.A(sb, z10, ", enableUwbRanging: ", z11, ", uwbChannel: ");
        o40.J(sb, i, ", uwbPreambleIndex: ", i2, ", remoteUwbAddress: ");
        sb.append(strA2);
        sb.append(", flowId: ");
        sb.append(j);
        sb.append(", uwbSenderInfo: ");
        sb.append(string);
        sb.append(", enableOutOfBandConnection: ");
        sb.append(z12);
        sb.append(", disruptiveUpgrade: ");
        sb.append(z13);
        sb.append(", useStableIdentifiers: ");
        sb.append(z14);
        sb.append(", deviceInfo: ");
        sb.append(strA3);
        sb.append(",allowGattConnections: ");
        sb.append(z15);
        sb.append(", connectionType: ");
        sb.append(i3);
        sb.append(", enableBleL2capListening: ");
        sb.append(z16);
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
        uy6.w(parcel, 6, this.f, false);
        boolean z5 = this.g;
        uy6.I(parcel, 7, 4);
        parcel.writeInt(z5 ? 1 : 0);
        uy6.C(parcel, 8, this.h, i, false);
        boolean z6 = this.i;
        uy6.I(parcel, 9, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.j;
        uy6.I(parcel, 10, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.k;
        uy6.I(parcel, 11, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.l;
        uy6.I(parcel, 12, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.m;
        uy6.I(parcel, 13, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        uy6.I(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i2 = this.o;
        uy6.I(parcel, 15, 4);
        parcel.writeInt(i2);
        int i3 = this.p;
        uy6.I(parcel, 16, 4);
        parcel.writeInt(i3);
        uy6.w(parcel, 17, this.q, false);
        long j = this.r;
        uy6.I(parcel, 18, 8);
        parcel.writeLong(j);
        uy6.G(parcel, 19, this.s, i);
        boolean z12 = this.t;
        uy6.I(parcel, 20, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.u;
        uy6.I(parcel, 21, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.v;
        uy6.I(parcel, 22, 4);
        parcel.writeInt(z14 ? 1 : 0);
        boolean z15 = this.w;
        uy6.I(parcel, 23, 4);
        parcel.writeInt(z15 ? 1 : 0);
        uy6.z(parcel, 24, this.x);
        uy6.z(parcel, 25, this.y);
        boolean z16 = this.z;
        uy6.I(parcel, 26, 4);
        parcel.writeInt(z16 ? 1 : 0);
        int i4 = this.A;
        uy6.I(parcel, 27, 4);
        parcel.writeInt(i4);
        uy6.w(parcel, 28, this.B, false);
        boolean z17 = this.C;
        uy6.I(parcel, 29, 4);
        parcel.writeInt(z17 ? 1 : 0);
        int i5 = this.D;
        uy6.I(parcel, 30, 4);
        parcel.writeInt(i5);
        boolean z18 = this.E;
        uy6.I(parcel, 31, 4);
        parcel.writeInt(z18 ? 1 : 0);
        boolean z19 = this.F;
        uy6.I(parcel, 32, 4);
        parcel.writeInt(z19 ? 1 : 0);
        boolean z20 = this.G;
        uy6.I(parcel, 33, 4);
        parcel.writeInt(z20 ? 1 : 0);
        boolean z21 = this.H;
        uy6.I(parcel, 34, 4);
        parcel.writeInt(z21 ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
