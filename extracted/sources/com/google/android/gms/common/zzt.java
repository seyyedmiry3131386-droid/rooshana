package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dr5;
import defpackage.ix9;
import defpackage.kg3;
import defpackage.kr9;
import defpackage.kx9;
import defpackage.qx9;
import defpackage.uy6;
import defpackage.xq9;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new ix9(1);
    public final String a;
    public final kr9 b;
    public final boolean c;
    public final boolean d;

    public zzt(String str, kr9 kr9Var, boolean z, boolean z2) {
        this.a = str;
        this.b = kr9Var;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        kr9 kr9Var = this.b;
        if (kr9Var == null) {
            t0.m("GoogleCertificatesQuery", "certificate binder is null");
            kr9Var = null;
        }
        uy6.y(parcel, 2, kr9Var);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.K(iJ, parcel);
    }

    public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
        qx9 kx9Var;
        this.a = str;
        kr9 kr9Var = null;
        if (iBinder != null) {
            try {
                int i = xq9.p;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (iInterfaceQueryLocalInterface instanceof qx9) {
                    kx9Var = (qx9) iInterfaceQueryLocalInterface;
                } else {
                    kx9Var = new kx9(iBinder, "com.google.android.gms.common.internal.ICertData", 2);
                }
                kg3 kg3VarI = kx9Var.i();
                byte[] bArr = kg3VarI == null ? null : (byte[]) dr5.q0(kg3VarI);
                if (bArr != null) {
                    kr9Var = new kr9(bArr);
                } else {
                    t0.d("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                t0.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.b = kr9Var;
        this.c = z;
        this.d = z2;
    }
}
