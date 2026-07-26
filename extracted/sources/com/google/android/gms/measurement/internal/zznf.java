package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import defpackage.a70;
import defpackage.b21;
import defpackage.rq4;
import defpackage.z60;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zznf implements ServiceConnection, z60, a70 {
    final /* synthetic */ zznl zza;
    private volatile boolean zzb;
    private volatile zzgo zzc;

    public zznf(zznl zznlVar) {
        Objects.requireNonNull(zznlVar);
        this.zza = zznlVar;
    }

    @Override // defpackage.z60
    public final void onConnected(Bundle bundle) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            try {
                rq4.n(this.zzc);
                this.zza.zzu.zzaW().zzj(new zzna(this, (zzgb) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // defpackage.a70
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zznl zznlVar = this.zza;
        zznlVar.zzu.zzaW().zzd();
        zzgu zzguVarZzf = zznlVar.zzu.zzf();
        if (zzguVarZzf != null) {
            zzguVarZzf.zzk().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzu.zzaW().zzj(new zzne(this, connectionResult));
    }

    @Override // defpackage.z60
    public final void onConnectionSuspended(int i) {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzaW().zzd();
        zzicVar.zzaV().zzj().zza("Service connection suspended");
        zzicVar.zzaW().zzj(new zznb(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzu.zzaW().zzd();
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzu.zzaV().zzb().zza("Service connected with null binder");
                return;
            }
            zzgb zzfzVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzfzVar = iInterfaceQueryLocalInterface instanceof zzgb ? (zzgb) iInterfaceQueryLocalInterface : new zzfz(iBinder);
                    this.zza.zzu.zzaV().zzk().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzu.zzaV().zzb().zzb("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzu.zzaV().zzb().zza("Service connect failed to get IMeasurementService");
            }
            if (zzfzVar == null) {
                this.zzb = false;
                try {
                    b21 b21VarB = b21.b();
                    zznl zznlVar = this.zza;
                    b21VarB.c(zznlVar.zzu.zzaY(), zznlVar.zzY());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzu.zzaW().zzj(new zzmy(this, zzfzVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzic zzicVar = this.zza.zzu;
        zzicVar.zzaW().zzd();
        zzicVar.zzaV().zzj().zza("Service disconnected");
        zzicVar.zzaW().zzj(new zzmz(this, componentName));
    }

    public final void zza(Intent intent) {
        zznl zznlVar = this.zza;
        zznlVar.zzg();
        Context contextZzaY = zznlVar.zzu.zzaY();
        b21 b21VarB = b21.b();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                zznl zznlVar2 = this.zza;
                zznlVar2.zzu.zzaV().zzk().zza("Using local app measurement service");
                this.zzb = true;
                b21VarB.a(contextZzaY, intent, zznlVar2.zzY(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    public final void zzc() {
        zznl zznlVar = this.zza;
        zznlVar.zzg();
        Context contextZzaY = zznlVar.zzu.zzaY();
        synchronized (this) {
            try {
                if (this.zzb) {
                    this.zza.zzu.zzaV().zzk().zza("Connection attempt already in progress");
                    return;
                }
                if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                    this.zza.zzu.zzaV().zzk().zza("Already awaiting connection attempt");
                    return;
                }
                this.zzc = new zzgo(contextZzaY, Looper.getMainLooper(), this, this);
                this.zza.zzu.zzaV().zzk().zza("Connecting to remote service");
                this.zzb = true;
                rq4.n(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzd(boolean z) {
        this.zzb = false;
    }
}
