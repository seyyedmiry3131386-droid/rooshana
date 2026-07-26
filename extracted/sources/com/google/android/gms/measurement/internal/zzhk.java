package com.google.android.gms.measurement.internal;

import defpackage.k30;
import defpackage.sg9;

/* JADX INFO: loaded from: classes.dex */
public final class zzhk {
    final zzic zza;

    public zzhk(zzpg zzpgVar) {
        this.zza = zzpgVar.zzag();
    }

    public final boolean zza() {
        try {
            zzic zzicVar = this.zza;
            k30 k30VarA = sg9.a(zzicVar.zzaY());
            if (k30VarA != null) {
                return k30VarA.c(128, "com.android.vending").versionCode >= 80837300;
            }
            zzicVar.zzaV().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.zza.zzaV().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
