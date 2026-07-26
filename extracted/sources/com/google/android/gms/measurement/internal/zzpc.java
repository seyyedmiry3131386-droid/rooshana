package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.z;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzpc {
    e0 zza;
    List zzb;
    List zzc;
    long zzd;
    final /* synthetic */ zzpg zze;

    public /* synthetic */ zzpc(zzpg zzpgVar, byte[] bArr) {
        Objects.requireNonNull(zzpgVar);
        this.zze = zzpgVar;
    }

    private static final long zzb(z zVar) {
        return ((zVar.u() / 1000) / 60) / 60;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(long r8, com.google.android.gms.internal.measurement.z r10) {
        /*
            r7 = this;
            defpackage.rq4.n(r10)
            java.util.List r0 = r7.zzc
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.zzc = r0
        Le:
            java.util.List r0 = r7.zzb
            if (r0 != 0) goto L19
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.zzb = r0
        L19:
            java.util.List r0 = r7.zzc
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L36
            java.util.List r0 = r7.zzc
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.z r0 = (com.google.android.gms.internal.measurement.z) r0
            long r2 = zzb(r0)
            long r4 = zzb(r10)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L9b
        L36:
            long r2 = r7.zzd
            int r0 = r10.k()
            long r4 = (long) r0
            long r2 = r2 + r4
            com.google.android.gms.measurement.internal.zzpg r0 = r7.zze
            com.google.android.gms.measurement.internal.zzal r4 = r0.zzd()
            com.google.android.gms.measurement.internal.zzfx r5 = com.google.android.gms.measurement.internal.zzfy.zzbd
            r6 = 0
            boolean r4 = r4.zzp(r6, r5)
            if (r4 == 0) goto L62
            java.util.List r4 = r7.zzc
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L6f
            r0.zzd()
            int r4 = com.google.android.gms.measurement.internal.zzal.zzG()
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L9b
            goto L6f
        L62:
            r0.zzd()
            int r4 = com.google.android.gms.measurement.internal.zzal.zzG()
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L6f
            goto L9b
        L6f:
            r7.zzd = r2
            java.util.List r2 = r7.zzc
            r2.add(r10)
            java.util.List r10 = r7.zzb
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r10.add(r8)
            java.util.List r8 = r7.zzc
            int r8 = r8.size()
            r0.zzd()
            com.google.android.gms.measurement.internal.zzfx r9 = com.google.android.gms.measurement.internal.zzfy.zzj
            java.lang.Object r9 = r9.zzb(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10 = 1
            int r9 = java.lang.Math.max(r10, r9)
            if (r8 < r9) goto L9c
        L9b:
            return r1
        L9c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpc.zza(long, com.google.android.gms.internal.measurement.z):boolean");
    }
}
