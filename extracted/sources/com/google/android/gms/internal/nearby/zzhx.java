package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.op9;
import defpackage.pp9;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzhx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhx> CREATOR = new up9(21);
    public pp9 a;
    public String[] b;
    public zzhk c;
    public final boolean d;
    public final int e;
    public final zzjk f;
    public final zzo g;

    public zzhx() {
        this.e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhx) {
            zzhx zzhxVar = (zzhx) obj;
            if (vy2.w(this.a, zzhxVar.a) && Arrays.equals(this.b, zzhxVar.b) && vy2.w(this.c, zzhxVar.c) && vy2.w(Boolean.valueOf(this.d), Boolean.valueOf(zzhxVar.d)) && vy2.w(Integer.valueOf(this.e), Integer.valueOf(zzhxVar.e)) && vy2.w(this.f, zzhxVar.f) && vy2.w(this.g, zzhxVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        pp9 pp9Var = this.a;
        uy6.y(parcel, 1, pp9Var == null ? null : pp9Var.asBinder());
        uy6.E(parcel, 2, this.b);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.C(parcel, 7, this.g, i, false);
        uy6.K(iJ, parcel);
    }

    public zzhx(IBinder iBinder, String[] strArr, zzhk zzhkVar, boolean z, int i, zzjk zzjkVar, zzo zzoVar) {
        pp9 op9Var;
        if (iBinder == null) {
            op9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            op9Var = iInterfaceQueryLocalInterface instanceof pp9 ? (pp9) iInterfaceQueryLocalInterface : new op9(iBinder);
        }
        this.a = op9Var;
        this.b = strArr;
        this.c = zzhkVar;
        this.d = z;
        this.e = i;
        this.f = zzjkVar;
        this.g = zzoVar;
    }
}
