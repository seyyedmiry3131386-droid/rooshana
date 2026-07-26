package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class aj9 extends au2 {
    public final lf8 b;

    public aj9(Context context, Looper looper, on onVar, lf8 lf8Var, wh9 wh9Var, wh9 wh9Var2) {
        super(context, looper, 270, onVar, wh9Var, wh9Var2, 0);
        this.b = lf8Var;
    }

    @Override // defpackage.d70
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof ui9 ? (ui9) iInterfaceQueryLocalInterface : new ui9(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // defpackage.d70
    public final Feature[] getApiFeatures() {
        return gu9.f;
    }

    @Override // defpackage.d70
    public final Bundle getGetServiceRequestExtraArgs() {
        lf8 lf8Var = this.b;
        lf8Var.getClass();
        Bundle bundle = new Bundle();
        String str = lf8Var.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.d70
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
