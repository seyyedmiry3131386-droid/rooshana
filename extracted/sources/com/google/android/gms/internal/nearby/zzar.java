package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.mp9;
import defpackage.np9;
import defpackage.op9;
import defpackage.pp9;
import defpackage.sk9;
import defpackage.uo9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new sk9(9);
    public pp9 a;
    public final uo9 b;
    public String c;
    public final byte[] d;
    public np9 e;
    public final int f;
    public final zzjk g;
    public final zzo h;

    public zzar() {
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzar) {
            zzar zzarVar = (zzar) obj;
            if (vy2.w(this.a, zzarVar.a) && vy2.w(this.b, zzarVar.b) && vy2.w(this.c, zzarVar.c) && Arrays.equals(this.d, zzarVar.d) && vy2.w(this.e, zzarVar.e) && vy2.w(Integer.valueOf(this.f), Integer.valueOf(zzarVar.f)) && vy2.w(this.g, zzarVar.g) && vy2.w(this.h, zzarVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Integer.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        pp9 pp9Var = this.a;
        uy6.y(parcel, 1, pp9Var == null ? null : pp9Var.asBinder());
        uo9 uo9Var = this.b;
        uy6.y(parcel, 2, uo9Var == null ? null : uo9Var.o);
        uy6.D(parcel, 3, this.c, false);
        uy6.w(parcel, 4, this.d, false);
        np9 np9Var = this.e;
        uy6.y(parcel, 5, np9Var != null ? np9Var.asBinder() : null);
        uy6.I(parcel, 6, 4);
        parcel.writeInt(this.f);
        uy6.C(parcel, 7, this.g, i, false);
        uy6.C(parcel, 8, this.h, i, false);
        uy6.K(iJ, parcel);
    }

    public zzar(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3, int i, zzjk zzjkVar, zzo zzoVar) {
        pp9 op9Var;
        uo9 uo9Var;
        np9 mp9Var = null;
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
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            if (iInterfaceQueryLocalInterface3 instanceof np9) {
                mp9Var = (np9) iInterfaceQueryLocalInterface3;
            } else {
                mp9Var = new mp9(iBinder3, "com.google.android.gms.nearby.internal.connection.IPayloadListener", 3);
            }
        }
        this.a = op9Var;
        this.b = uo9Var;
        this.c = str;
        this.d = bArr;
        this.e = mp9Var;
        this.f = i;
        this.g = zzjkVar;
        this.h = zzoVar;
    }
}
