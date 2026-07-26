package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.bp9;
import defpackage.dp9;
import defpackage.op9;
import defpackage.pp9;
import defpackage.uo9;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import defpackage.zo9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzht extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzht> CREATOR = new up9(20);
    public pp9 a;
    public final uo9 b;
    public final dp9 c;
    public String d;
    public String e;
    public final byte[] f;
    public bp9 g;
    public final byte[] h;
    public final ConnectionOptions i;
    public final int j;
    public final zzjk k;
    public final zzo l;
    public final byte[] m;
    public final String n;

    public zzht() {
        this.j = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzht) {
            zzht zzhtVar = (zzht) obj;
            if (vy2.w(this.a, zzhtVar.a) && vy2.w(this.b, zzhtVar.b) && vy2.w(this.c, zzhtVar.c) && vy2.w(this.d, zzhtVar.d) && vy2.w(this.e, zzhtVar.e) && Arrays.equals(this.f, zzhtVar.f) && vy2.w(this.g, zzhtVar.g) && Arrays.equals(this.h, zzhtVar.h) && vy2.w(this.i, zzhtVar.i) && vy2.w(Integer.valueOf(this.j), Integer.valueOf(zzhtVar.j)) && vy2.w(this.k, zzhtVar.k) && vy2.w(this.l, zzhtVar.l) && Arrays.equals(this.m, zzhtVar.m) && vy2.w(this.n, zzhtVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), this.g, Integer.valueOf(Arrays.hashCode(this.h)), this.i, Integer.valueOf(this.j), this.k, this.l, Integer.valueOf(Arrays.hashCode(this.m)), this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        pp9 pp9Var = this.a;
        uy6.y(parcel, 1, pp9Var == null ? null : pp9Var.asBinder());
        uo9 uo9Var = this.b;
        uy6.y(parcel, 2, uo9Var == null ? null : uo9Var.o);
        dp9 dp9Var = this.c;
        uy6.y(parcel, 3, dp9Var == null ? null : dp9Var.o);
        uy6.D(parcel, 4, this.d, false);
        uy6.D(parcel, 5, this.e, false);
        uy6.w(parcel, 6, this.f, false);
        bp9 bp9Var = this.g;
        uy6.y(parcel, 7, bp9Var != null ? bp9Var.asBinder() : null);
        uy6.w(parcel, 8, this.h, false);
        uy6.C(parcel, 9, this.i, i, false);
        uy6.I(parcel, 10, 4);
        parcel.writeInt(this.j);
        uy6.C(parcel, 11, this.k, i, false);
        uy6.w(parcel, 12, this.m, false);
        uy6.D(parcel, 13, this.n, false);
        uy6.C(parcel, 14, this.l, i, false);
        uy6.K(iJ, parcel);
    }

    public zzht(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, ConnectionOptions connectionOptions, int i, zzjk zzjkVar, zzo zzoVar, byte[] bArr3, String str3) {
        pp9 op9Var;
        uo9 uo9Var;
        dp9 dp9Var;
        bp9 zo9Var = null;
        if (iBinder == null) {
            op9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            op9Var = iInterfaceQueryLocalInterface instanceof pp9 ? (pp9) iInterfaceQueryLocalInterface : new op9(iBinder);
        }
        if (iBinder2 == null) {
            uo9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            uo9Var = iInterfaceQueryLocalInterface2 instanceof uo9 ? (uo9) iInterfaceQueryLocalInterface2 : new uo9(iBinder2);
        }
        if (iBinder3 == null) {
            dp9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            if (iInterfaceQueryLocalInterface3 instanceof dp9) {
                dp9Var = (dp9) iInterfaceQueryLocalInterface3;
            } else {
                dp9Var = new dp9(iBinder3, "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener", 3);
            }
        }
        if (iBinder4 != null) {
            IInterface iInterfaceQueryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zo9Var = iInterfaceQueryLocalInterface4 instanceof bp9 ? (bp9) iInterfaceQueryLocalInterface4 : new zo9(iBinder4);
        }
        this.a = op9Var;
        this.b = uo9Var;
        this.c = dp9Var;
        this.d = str;
        this.e = str2;
        this.f = bArr;
        this.g = zo9Var;
        this.h = bArr2;
        this.i = connectionOptions;
        this.j = i;
        this.k = zzjkVar;
        this.l = zzoVar;
        this.m = bArr3;
        this.n = str3;
    }
}
