package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import io.sentry.android.core.t0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public abstract class d70 {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile ey zzB;
    ex9 zza;
    final Handler zzb;
    protected b70 zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final bu2 zzn;
    private final hu2 zzo;
    private nf3 zzr;
    private IInterface zzs;
    private ho9 zzu;
    private final z60 zzw;
    private final a70 zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private ConnectionResult zzC = null;
    private boolean zzD = false;
    private volatile zzj zzE = null;
    protected AtomicInteger zzd = new AtomicInteger(0);

    public d70(Context context, Looper looper, gv9 gv9Var, hu2 hu2Var, int i, z60 z60Var, a70 a70Var, String str) {
        rq4.o(context, "Context must not be null");
        this.zzl = context;
        rq4.o(looper, "Looper must not be null");
        this.zzm = looper;
        rq4.o(gv9Var, "Supervisor must not be null");
        this.zzn = gv9Var;
        rq4.o(hu2Var, "API availability must not be null");
        this.zzo = hu2Var;
        this.zzb = new kl9(this, looper);
        this.zzy = i;
        this.zzw = z60Var;
        this.zzx = a70Var;
        this.zzz = str;
    }

    public final void a(int i, IInterface iInterface) {
        ex9 ex9Var;
        rq4.i((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    ho9 ho9Var = this.zzu;
                    if (ho9Var != null) {
                        bu2 bu2Var = this.zzn;
                        String str = this.zza.a;
                        rq4.n(str);
                        String str2 = this.zza.b;
                        zza();
                        bu2Var.d(str, str2, ho9Var, this.zza.c);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    ho9 ho9Var2 = this.zzu;
                    if (ho9Var2 != null && (ex9Var = this.zza) != null) {
                        String str3 = ex9Var.a;
                        String str4 = ex9Var.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        t0.d("GmsClient", sb.toString());
                        bu2 bu2Var2 = this.zzn;
                        String str5 = this.zza.a;
                        rq4.n(str5);
                        String str6 = this.zza.b;
                        zza();
                        bu2Var2.d(str5, str6, ho9Var2, this.zza.c);
                        this.zzd.incrementAndGet();
                    }
                    ho9 ho9Var3 = new ho9(this, this.zzd.get());
                    this.zzu = ho9Var3;
                    ex9 ex9Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new ex9(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new ex9(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = ex9Var2;
                    if (ex9Var2.c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a)));
                    }
                    bu2 bu2Var3 = this.zzn;
                    String str7 = this.zza.a;
                    rq4.n(str7);
                    ConnectionResult connectionResultC = bu2Var3.c(new us9(str7, this.zza.b, this.zza.c), ho9Var3, zza(), getBindServiceExecutor());
                    if (!(connectionResultC.b == 0)) {
                        ex9 ex9Var3 = this.zza;
                        String str8 = ex9Var3.a;
                        String str9 = ex9Var3.b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str8);
                        sb2.append(" on ");
                        sb2.append(str9);
                        t0.m("GmsClient", sb2.toString());
                        int i2 = connectionResultC.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (connectionResultC.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, connectionResultC.c);
                        }
                        zzb(i2, bundle, this.zzd.get());
                    }
                } else if (i == 4) {
                    rq4.n(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iB = this.zzo.b(this.zzl, getMinApkVersion());
        if (iB == 0) {
            connect(new ca7(this));
        } else {
            a(1, null);
            triggerNotAvailable(new ca7(this), iB, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(b70 b70Var) {
        rq4.o(b70Var, "Connection progress callbacks cannot be null.");
        this.zzc = b70Var;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((vj9) arrayList.get(i)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        nf3 nf3Var;
        long j;
        synchronized (this.zzp) {
            i = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            nf3Var = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append(Ssh2PublicKeyAlgorithmName.NULL);
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nf3Var == null) {
            printWriter.println(Ssh2PublicKeyAlgorithmName.NULL);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((wj9) nf3Var).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j2));
            j = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(str2).length());
            sb.append(j2);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        } else {
            j = 0;
        }
        if (this.zzg > j) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(str3).length());
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > j) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) tv8.t(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(str4).length());
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public ey getAttributionSourceWrapper() {
        return this.zzB;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        ex9 ex9Var;
        if (!isConnected() || (ex9Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return ex9Var.b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    /* JADX WARN: Multi-variable type inference failed */
    public void getRemoteService(bf3 bf3Var, Set<Scope> set) {
        AttributionSource attributionSource;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.zzB == null || (attributionSource = this.zzB.a) == null || attributionSource.getAttributionTag() == null) ? this.zzA : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.zzy;
        int i2 = hu2.a;
        Scope[] scopeArr = GetServiceRequest.o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.p;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.d = this.zzl.getPackageName();
        getServiceRequest.g = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.h = account;
            if (bf3Var != 0) {
                getServiceRequest.e = ((ph9) bf3Var).o;
            }
        } else if (requiresAccount()) {
            getServiceRequest.h = getAccount();
        }
        getServiceRequest.i = zze;
        getServiceRequest.j = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.m = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    nf3 nf3Var = this.zzr;
                    if (nf3Var != null) {
                        ((wj9) nf3Var).L(new nn9(this, this.zzd.get()), getServiceRequest);
                    } else {
                        t0.m("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            t0.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            t0.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            t0.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                rq4.o(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                nf3 nf3Var = this.zzr;
                if (nf3Var == null) {
                    return null;
                }
                return ((wj9) nf3Var).asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        vo9 vo9Var = new vo9(this, i, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, vo9Var));
    }

    public void onUserSignOut(c70 c70Var) {
        ut4 ut4Var = (ut4) c70Var;
        ut4Var.getClass();
        ((wh9) ut4Var.b).z.m.post(new fp7(ut4Var));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(ey eyVar) {
        this.zzB = eyVar;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i) {
        int i2 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i2, i));
    }

    public void triggerNotAvailable(b70 b70Var, int i, PendingIntent pendingIntent) {
        rq4.o(b70Var, "Connection progress callbacks cannot be null.");
        this.zzc = b70Var;
        int i2 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i2, i, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i, Bundle bundle, int i2) {
        sp9 sp9Var = new sp9(this, i, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, sp9Var));
    }

    public final void zzc(zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.d;
            ca7 ca7VarF = ca7.f();
            RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a;
            synchronized (ca7VarF) {
                if (rootTelemetryConfiguration == null) {
                    ca7VarF.b = ca7.d;
                    return;
                }
                RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) ca7VarF.b;
                if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
                    ca7VarF.b = rootTelemetryConfiguration;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i, IInterface iInterface) {
        a(i, null);
    }

    public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                a(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf(int i) {
        int i2;
        int i3;
        synchronized (this.zzp) {
            i2 = this.zzv;
        }
        if (i2 == 3) {
            this.zzD = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i3, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(nf3 nf3Var) {
        this.zzr = nf3Var;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ z60 zzk() {
        return this.zzw;
    }

    public final /* synthetic */ a70 zzl() {
        return this.zzx;
    }

    public final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
