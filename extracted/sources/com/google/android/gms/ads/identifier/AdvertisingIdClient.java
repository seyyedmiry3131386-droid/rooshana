package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import defpackage.b21;
import defpackage.fd0;
import defpackage.hu2;
import defpackage.io9;
import defpackage.pn9;
import defpackage.rq4;
import defpackage.sm9;
import defpackage.wo9;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    fd0 zza;
    wo9 zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzi;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws Throwable {
        Info infoZzf;
        AdvertisingIdClient advertisingIdClient = zzh;
        if (advertisingIdClient == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient = zzh;
                    if (advertisingIdClient == null) {
                        advertisingIdClient = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient;
                    }
                } finally {
                }
            }
        }
        AdvertisingIdClient advertisingIdClient2 = advertisingIdClient;
        zzd zzdVarZza = zzd.zza(context);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = -1;
        try {
            infoZzf = advertisingIdClient2.zzf(-1);
            advertisingIdClient2.zze(infoZzf, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            zzdVarZza.zzc(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            return infoZzf;
        } catch (Throwable th2) {
            th = th2;
            zzdVarZza = zzdVarZza;
            jElapsedRealtime = jElapsedRealtime;
            Throwable th3 = th;
            advertisingIdClient2.zze(null, true, 0.0f, -1L, "", th3);
            if (th3 instanceof IOException) {
                i = 1;
            } else if (th3 instanceof GooglePlayServicesNotAvailableException) {
                i = 9;
            } else if (th3 instanceof GooglePlayServicesRepairableException) {
                i = 16;
            } else if (th3 instanceof IllegalStateException) {
                i = 8;
            }
            zzdVarZza.zzc(35401, i, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            throw th3;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean z;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            rq4.m("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                rq4.n(advertisingIdClient.zza);
                rq4.n(advertisingIdClient.zzb);
                try {
                    pn9 pn9Var = (pn9) advertisingIdClient.zzb;
                    pn9Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelL = pn9Var.L(6, parcelObtain);
                    int i = sm9.a;
                    z = parcelL.readInt() != 0;
                    parcelL.recycle();
                } catch (RemoteException e) {
                    throw new IOException("Remote exception", e);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return z;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzf(int i) throws IOException {
        Info info;
        rq4.m("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            rq4.n(this.zza);
            rq4.n(this.zzb);
            try {
                pn9 pn9Var = (pn9) this.zzb;
                pn9Var.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                Parcel parcelL = pn9Var.L(1, parcelObtain);
                String string = parcelL.readString();
                parcelL.recycle();
                pn9 pn9Var2 = (pn9) this.zzb;
                pn9Var2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                int i2 = sm9.a;
                parcelObtain2.writeInt(1);
                Parcel parcelL2 = pn9Var2.L(2, parcelObtain2);
                if (parcelL2.readInt() == 0) {
                    z = false;
                }
                parcelL2.recycle();
                info = new Info(string, z);
            } catch (RemoteException e) {
                throw new IOException("Remote exception", e);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzc(true);
    }

    public final void zza() {
        rq4.m("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        b21.b().c(this.zzi, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public final void zzc(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        IOException iOException;
        rq4.m("Calling this from your main thread can lead to deadlock");
        if (z) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = hu2.b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    fd0 fd0Var = new fd0();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!b21.b().a(context, intent, fd0Var, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = fd0Var;
                        try {
                            try {
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                IBinder iBinderA = fd0Var.a();
                                int i = io9.n;
                                IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                this.zzb = iInterfaceQueryLocalInterface instanceof wo9 ? (wo9) iInterfaceQueryLocalInterface : new pn9(iBinderA);
                                this.zzc = true;
                            } finally {
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    zzc(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final boolean zze(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new zza(this, map).start();
        return true;
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        rq4.n(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }
}
