package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import defpackage.wu9;
import defpackage.za7;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzjk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjk> CREATOR = new uq9(12);
    public static final String[] p = {"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};
    public final long a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final byte[] g;
    public final byte[] h;
    public final List i;
    public final int j;
    public final byte[] k;
    public final zzje l;
    public final int m;
    public final int n;
    public final String o;

    public zzjk(long j, String str, int i, String str2, long j2, String str3, byte[] bArr, byte[] bArr2, ArrayList arrayList, int i2, byte[] bArr3, zzje zzjeVar, int i3, int i4, String str4) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = bArr;
        this.h = bArr2;
        this.i = arrayList;
        this.j = i2;
        this.k = bArr3;
        this.l = zzjeVar;
        this.m = i3;
        this.n = i4;
        this.o = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjk) {
            zzjk zzjkVar = (zzjk) obj;
            if (vy2.w(Long.valueOf(this.a), Long.valueOf(zzjkVar.a)) && vy2.w(this.b, zzjkVar.b) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zzjkVar.c)) && vy2.w(this.d, zzjkVar.d) && vy2.w(this.f, zzjkVar.f) && Arrays.equals(this.g, zzjkVar.g) && Arrays.equals(this.h, zzjkVar.h) && vy2.w(this.i, zzjkVar.i) && vy2.w(Integer.valueOf(this.j), Integer.valueOf(zzjkVar.j)) && Arrays.equals(this.k, zzjkVar.k) && vy2.w(this.l, zzjkVar.l) && vy2.w(Integer.valueOf(this.m), Integer.valueOf(zzjkVar.m)) && vy2.w(Integer.valueOf(this.n), Integer.valueOf(zzjkVar.n)) && vy2.w(this.o, zzjkVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.f, Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), this.i, Integer.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), this.l, Integer.valueOf(this.m), Integer.valueOf(this.n), this.o});
    }

    public final String toString() {
        char c;
        Long lValueOf = Long.valueOf(this.a);
        switch (this.c) {
            case 1:
                c = 1;
                break;
            case 2:
                c = 2;
                break;
            case 3:
                c = 3;
                break;
            case 4:
                c = 4;
                break;
            case 5:
                c = 5;
                break;
            case 6:
                c = 6;
                break;
            case 7:
                c = 7;
                break;
            case 8:
                c = '\b';
                break;
            case 9:
                c = '\t';
                break;
            case 10:
                c = '\n';
                break;
            default:
                c = 0;
                break;
        }
        String str = p[c];
        Long lValueOf2 = Long.valueOf(this.e);
        byte[] bArr = this.g;
        String string = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.h;
        Integer numValueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        Integer numValueOf2 = Integer.valueOf(this.j);
        byte[] bArr3 = this.k;
        String string2 = bArr3 != null ? Arrays.toString(bArr3) : null;
        Integer numValueOf3 = Integer.valueOf(this.m);
        int i = this.n;
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s>, Dusi: %s", lValueOf, this.b, str, this.d, lValueOf2, this.f, string, numValueOf, this.i, numValueOf2, string2, this.l, numValueOf3, i != 0 ? i != 1 ? i != 2 ? "OTHER" : "Secondary" : CommonDataKt.PLAYER_TYPE_MAIN : "UNKNOWN", this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzpt zzptVarM;
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 8);
        parcel.writeLong(this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.D(parcel, 4, this.d, false);
        uy6.I(parcel, 5, 8);
        parcel.writeLong(this.e);
        uy6.D(parcel, 6, this.f, false);
        byte[] bArr = this.g;
        uy6.w(parcel, 7, bArr == null ? null : (byte[]) bArr.clone(), false);
        byte[] bArr2 = this.h;
        uy6.w(parcel, 8, bArr2 != null ? (byte[]) bArr2.clone() : null, false);
        Collection collection = this.i;
        if (collection == null) {
            wu9 wu9Var = zzpt.b;
            zzptVarM = zzpv.e;
        } else {
            wu9 wu9Var2 = zzpt.b;
            if (collection instanceof zzpq) {
                zzptVarM = ((zzpq) collection).f();
                if (zzptVarM.i()) {
                    Object[] array = zzptVarM.toArray(zzpq.a);
                    zzptVarM = zzpt.m(array.length, array);
                }
            } else {
                Object[] array2 = collection.toArray();
                int length = array2.length;
                za7.A(length, array2);
                zzptVarM = zzpt.m(length, array2);
            }
        }
        uy6.H(parcel, 9, zzptVarM, false);
        uy6.I(parcel, 10, 4);
        parcel.writeInt(this.j);
        uy6.w(parcel, 11, this.k, false);
        uy6.C(parcel, 12, this.l, i, false);
        uy6.I(parcel, 13, 4);
        parcel.writeInt(this.m);
        uy6.I(parcel, 14, 4);
        parcel.writeInt(this.n);
        uy6.D(parcel, 15, this.o, false);
        uy6.K(iJ, parcel);
    }
}
