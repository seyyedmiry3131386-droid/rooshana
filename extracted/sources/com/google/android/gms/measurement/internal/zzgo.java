package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.a70;
import defpackage.bu2;
import defpackage.d70;
import defpackage.gv9;
import defpackage.hu2;
import defpackage.rq4;
import defpackage.z60;

/* JADX INFO: loaded from: classes.dex */
public final class zzgo extends d70 {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzgo(Context context, Looper looper, z60 z60Var, a70 a70Var) {
        gv9 gv9VarA = bu2.a(context);
        hu2 hu2Var = hu2.b;
        rq4.n(z60Var);
        rq4.n(a70Var);
        super(context, looper, gv9VarA, hu2Var, 93, z60Var, a70Var, null);
    }

    @Override // defpackage.d70
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof zzgb ? (zzgb) iInterfaceQueryLocalInterface : new zzfz(iBinder);
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
