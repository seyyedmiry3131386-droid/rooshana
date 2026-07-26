package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.t0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class zm9 extends au2 {
    public long b;
    public final zv c;
    public final zv d;
    public final zv e;
    public final zv f;
    public final zv g;
    public final zv h;
    public fq9 i;

    public zm9(Context context, Looper looper, on onVar, wh9 wh9Var, wh9 wh9Var2) {
        super(context, looper, 54, onVar, wh9Var, wh9Var2, 0);
        this.c = new zv(0);
        this.d = new zv(0);
        this.e = new zv(0);
        this.f = new zv(0);
        this.g = new zv(0);
        this.h = new zv(0);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            t0.d("NearbyConnections", "Cannot set null temp directory");
        } else {
            z67.c = cacheDir;
        }
    }

    public static Status b(int i) {
        String strT;
        if (i == 8025) {
            strT = "MISSING_SETTING_LOCATION_MUST_BE_ON";
        } else if (i != 8050) {
            switch (i) {
                case 8000:
                    strT = "STATUS_NETWORK_NOT_CONNECTED";
                    break;
                case 8001:
                    strT = "STATUS_ALREADY_ADVERTISING";
                    break;
                case 8002:
                    strT = "STATUS_ALREADY_DISCOVERING";
                    break;
                case 8003:
                    strT = "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
                    break;
                case 8004:
                    strT = "STATUS_CONNECTION_REJECTED";
                    break;
                case 8005:
                    strT = "STATUS_NOT_CONNECTED_TO_ENDPOINT";
                    break;
                case 8006:
                    strT = "STATUS_CAN_NOT_OBTAIN_DEVICE_PROVIDER";
                    break;
                case 8007:
                    strT = "STATUS_RADIO_ERROR";
                    break;
                case 8008:
                    strT = "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
                    break;
                case 8009:
                    strT = "STATUS_OUT_OF_ORDER_API_CALL";
                    break;
                case 8010:
                    strT = "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
                    break;
                case 8011:
                    strT = "STATUS_ENDPOINT_UNKNOWN";
                    break;
                case 8012:
                    strT = "STATUS_ENDPOINT_IO_ERROR";
                    break;
                case 8013:
                    strT = "STATUS_PAYLOAD_IO_ERROR";
                    break;
                case 8014:
                    strT = "STATUS_PAYLOAD_UNKNOWN";
                    break;
                case 8015:
                    strT = "STATUS_ALREADY_LISTENING";
                    break;
                case 8016:
                    strT = "STATUS_AUTH_ERROR";
                    break;
                default:
                    switch (i) {
                        case 8029:
                            strT = "MISSING_PERMISSION_NEARBY_WIFI_DEVICES";
                            break;
                        case 8030:
                            strT = "MISSING_PERMISSION_BLUETOOTH";
                            break;
                        case 8031:
                            strT = "MISSING_PERMISSION_BLUETOOTH_ADMIN";
                            break;
                        case 8032:
                            strT = "MISSING_PERMISSION_ACCESS_WIFI_STATE";
                            break;
                        case 8033:
                            strT = "MISSING_PERMISSION_CHANGE_WIFI_STATE";
                            break;
                        case 8034:
                            strT = "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
                            break;
                        case 8035:
                            strT = "MISSING_PERMISSION_RECORD_AUDIO";
                            break;
                        case 8036:
                            strT = "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
                            break;
                        case 8037:
                            strT = "MISSING_PERMISSION_BLUETOOTH_SCAN";
                            break;
                        case 8038:
                            strT = "MISSING_PERMISSION_BLUETOOTH_ADVERTISE";
                            break;
                        case 8039:
                            strT = "MISSING_PERMISSION_BLUETOOTH_CONNECT";
                            break;
                        default:
                            strT = tv8.t(i);
                            break;
                    }
                    break;
            }
        } else {
            strT = "API_CONNECTION_FAILED_ALREADY_IN_USE";
        }
        return new Status(i, strT, null, null);
    }

    public final void c() {
        zv zvVar = this.c;
        zvVar.getClass();
        sv svVar = new sv(zvVar);
        while (svVar.hasNext()) {
            cm9 cm9Var = (cm9) svVar.next();
            synchronized (cm9Var) {
                try {
                    zv zvVar2 = cm9Var.p;
                    zvVar2.getClass();
                    sv svVar2 = new sv(zvVar2);
                    while (svVar2.hasNext()) {
                        cm9Var.o.c(new rl9((String) svVar2.next(), 2));
                    }
                    cm9Var.p.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zv zvVar3 = this.d;
        zvVar3.getClass();
        sv svVar3 = new sv(zvVar3);
        if (svVar3.hasNext()) {
            svVar3.next().getClass();
            throw new ClassCastException();
        }
        zv zvVar4 = this.e;
        zvVar4.getClass();
        sv svVar4 = new sv(zvVar4);
        while (svVar4.hasNext()) {
            ((fm9) svVar4.next()).a();
        }
        zv zvVar5 = this.f;
        zvVar5.getClass();
        sv svVar5 = new sv(zvVar5);
        while (svVar5.hasNext()) {
            ((fm9) svVar5.next()).a();
        }
        zv zvVar6 = this.g;
        zvVar6.getClass();
        sv svVar6 = new sv(zvVar6);
        while (svVar6.hasNext()) {
            ((fm9) svVar6.next()).a();
        }
        zv zvVar7 = this.h;
        zvVar7.getClass();
        sv svVar7 = new sv(zvVar7);
        while (svVar7.hasNext()) {
            ((fm9) svVar7.next()).a();
        }
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        fq9 fq9Var = this.i;
        if (fq9Var != null) {
            fq9Var.c();
            this.i = null;
        }
    }

    @Override // defpackage.d70
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof kp9 ? (kp9) iInterfaceQueryLocalInterface : new kp9(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService", 3);
    }

    @Override // defpackage.d70
    public final void disconnect() {
        if (isConnected()) {
            try {
                kp9 kp9Var = (kp9) getService();
                Parcel parcelN0 = kp9Var.n0();
                int i = lm9.a;
                parcelN0.writeInt(1);
                uy6.K(uy6.J(20293, parcelN0), parcelN0);
                kp9Var.o0(2011, parcelN0);
            } catch (RemoteException e) {
                t0.n("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        c();
        super.disconnect();
    }

    @Override // defpackage.d70
    public final Feature[] getApiFeatures() {
        return new Feature[]{y40.e, y40.h, y40.l, y40.j, y40.m, y40.i, y40.f, y40.k, y40.g, y40.n};
    }

    @Override // defpackage.d70
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.b);
        return bundle;
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // defpackage.d70
    public final /* bridge */ /* synthetic */ void onConnectedLocked(IInterface iInterface) {
        super.onConnectedLocked((kp9) iInterface);
        this.i = new fq9();
    }

    @Override // defpackage.d70
    public final void onConnectionSuspended(int i) {
        if (i == 1) {
            c();
            i = 1;
        }
        super.onConnectionSuspended(i);
    }

    @Override // defpackage.d70, defpackage.sl
    public final boolean requiresGooglePlayServices() {
        return dt2.J(getContext());
    }

    @Override // defpackage.d70
    public final boolean usesClientTelemetry() {
        return true;
    }
}
