package com.google.android.gms.internal.measurement;

import defpackage.ht9;
import defpackage.ip9;
import defpackage.tq9;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends q0 {
    private static final i0 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        i0 i0Var = new i0();
        zzg = i0Var;
        q0.m(i0.class, i0Var);
    }

    public static tq9 q() {
        return (tq9) zzg.h();
    }

    public static i0 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.q0
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ht9(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", ip9.n, "zze", ip9.l, "zzf", ip9.m});
        }
        if (i2 == 3) {
            return new i0();
        }
        if (i2 == 4) {
            return new tq9(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final zzin p() {
        zzin zzinVarA = zzin.a(this.zze);
        return zzinVarA == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : zzinVarA;
    }

    public final void s(zzin zzinVar) {
        this.zze = zzinVar.a;
        this.zzb |= 2;
    }

    public final int t() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[PHI: r3
      0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int u() {
        /*
            r4 = this;
            int r0 = r4.zzf
            r1 = 1
            if (r0 == 0) goto L19
            r2 = 2
            if (r0 == r1) goto L1a
            r3 = 3
            if (r0 == r2) goto L17
            r2 = 4
            if (r0 == r3) goto L1a
            r3 = 5
            if (r0 == r2) goto L17
            if (r0 == r3) goto L15
            r2 = 0
            goto L1a
        L15:
            r2 = 6
            goto L1a
        L17:
            r2 = r3
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i0.u():int");
    }

    public final /* synthetic */ void v(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
