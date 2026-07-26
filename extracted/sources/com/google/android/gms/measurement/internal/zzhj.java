package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import defpackage.bm9;
import defpackage.dm9;
import defpackage.em9;
import defpackage.t61;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzhj implements ServiceConnection {
    final /* synthetic */ zzhk zza;
    private final String zzb;

    public zzhj(zzhk zzhkVar, String str) {
        Objects.requireNonNull(zzhkVar);
        this.zza = zzhkVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            t61.C(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = dm9.n;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            em9 bm9Var = iInterfaceQueryLocalInterface instanceof em9 ? (em9) iInterfaceQueryLocalInterface : new bm9(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            zzic zzicVar = this.zza.zza;
            zzicVar.zzaV().zzk().zza("Install Referrer Service connected");
            zzicVar.zzaW().zzj(new zzhi(this, bm9Var, this));
        } catch (RuntimeException e) {
            this.zza.zza.zzaV().zze().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaV().zzk().zza("Install Referrer Service disconnected");
    }

    public final /* synthetic */ String zza() {
        return this.zzb;
    }
}
