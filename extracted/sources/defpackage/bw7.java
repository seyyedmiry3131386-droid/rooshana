package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class bw7 extends au2 implements sl {
    public final boolean b;
    public final on c;
    public final Bundle d;
    public final Integer e;

    public bw7(Context context, Looper looper, on onVar, Bundle bundle, iu2 iu2Var, ju2 ju2Var) {
        super(context, looper, 44, onVar, iu2Var, ju2Var, 0);
        this.b = true;
        this.c = onVar;
        this.d = bundle;
        this.e = (Integer) onVar.f;
    }

    @Override // defpackage.d70
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof ni9 ? (ni9) iInterfaceQueryLocalInterface : new ni9(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // defpackage.d70
    public final Bundle getGetServiceRequestExtraArgs() {
        on onVar = this.c;
        boolean zEquals = getContext().getPackageName().equals((String) onVar.c);
        Bundle bundle = this.d;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) onVar.c);
        }
        return bundle;
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.d70, defpackage.sl
    public final boolean requiresSignIn() {
        return this.b;
    }
}
