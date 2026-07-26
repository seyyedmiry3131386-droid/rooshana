package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class vo9 extends vj9 {
    public final IBinder g;
    public final /* synthetic */ d70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo9(d70 d70Var, int i, IBinder iBinder, Bundle bundle) {
        super(d70Var, i, bundle);
        this.h = d70Var;
        this.g = iBinder;
    }

    @Override // defpackage.vj9
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            rq4.n(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            d70 d70Var = this.h;
            if (!d70Var.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = d70Var.getServiceDescriptor();
                t0.m("GmsClient", dw1.p("service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor, new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length())));
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = d70Var.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(d70Var.zze(2, 4, iInterfaceCreateServiceInterface) || d70Var.zze(3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            d70Var.zzn(null);
            z60 z60VarZzk = d70Var.zzk();
            Bundle connectionHint = d70Var.getConnectionHint();
            if (z60VarZzk == null) {
                return true;
            }
            d70Var.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            t0.m("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.vj9
    public final void b(ConnectionResult connectionResult) {
        d70 d70Var = this.h;
        if (d70Var.zzl() != null) {
            d70Var.zzl().onConnectionFailed(connectionResult);
        }
        d70Var.onConnectionFailed(connectionResult);
    }
}
