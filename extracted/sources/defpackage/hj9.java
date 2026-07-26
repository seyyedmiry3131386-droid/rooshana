package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class hj9 extends au2 {
    public final ij9 b;

    public hj9(Context context, Looper looper, on onVar, ij9 ij9Var, wh9 wh9Var, wh9 wh9Var2) {
        super(context, looper, 68, onVar, wh9Var, wh9Var2, 0);
        ij9Var = ij9Var == null ? ij9.c : ij9Var;
        bn6 bn6Var = new bn6(22);
        bn6Var.b = Boolean.FALSE;
        bn6Var.b = Boolean.valueOf(ij9Var.a);
        bn6Var.c = ij9Var.b;
        byte[] bArr = new byte[16];
        cj9.a.nextBytes(bArr);
        bn6Var.c = Base64.encodeToString(bArr, 11);
        this.b = new ij9(bn6Var);
    }

    @Override // defpackage.d70
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof jj9 ? (jj9) iInterfaceQueryLocalInterface : new jj9(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // defpackage.d70
    public final Bundle getGetServiceRequestExtraArgs() {
        ij9 ij9Var = this.b;
        ij9Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", ij9Var.a);
        bundle.putString("log_session_id", ij9Var.b);
        return bundle;
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
