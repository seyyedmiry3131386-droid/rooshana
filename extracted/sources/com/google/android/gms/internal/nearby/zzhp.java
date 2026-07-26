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
public final class zzhp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhp> CREATOR = new up9(19);
    public pp9 a;
    public String b;
    public final int c;
    public final zzjk d;
    public final zzo e;

    public zzhp() {
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhp) {
            zzhp zzhpVar = (zzhp) obj;
            if (vy2.w(this.a, zzhpVar.a) && vy2.w(this.b, zzhpVar.b) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zzhpVar.c)) && vy2.w(this.d, zzhpVar.d) && vy2.w(this.e, zzhpVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        pp9 pp9Var = this.a;
        uy6.y(parcel, 1, pp9Var == null ? null : pp9Var.asBinder());
        uy6.D(parcel, 2, this.b, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.K(iJ, parcel);
    }

    public zzhp(IBinder iBinder, String str, int i, zzjk zzjkVar, zzo zzoVar) {
        pp9 op9Var;
        if (iBinder == null) {
            op9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            op9Var = iInterfaceQueryLocalInterface instanceof pp9 ? (pp9) iInterfaceQueryLocalInterface : new op9(iBinder);
        }
        this.a = op9Var;
        this.b = str;
        this.c = i;
        this.d = zzjkVar;
        this.e = zzoVar;
    }
}
