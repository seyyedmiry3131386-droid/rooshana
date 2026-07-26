package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.f;
import defpackage.rq4;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzab {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    public zzab(String str, int i) {
        this.zzb = str;
        this.zzc = i;
    }

    private static Boolean zzd(String str, int i, boolean z, String str2, List list, String str3, zzgu zzguVar) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 != null) {
                    try {
                    } catch (PatternSyntaxException unused) {
                        if (zzguVar != null) {
                            zzguVar.zze().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                    break;
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    public static Boolean zze(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public static Boolean zzf(String str, f fVar, zzgu zzguVar) {
        List list;
        rq4.n(fVar);
        if (str == null || !fVar.p() || fVar.x() == 1 || (fVar.x() != 7 ? !fVar.q() : fVar.v() == 0)) {
            return null;
        }
        int iX = fVar.x();
        boolean zT = fVar.t();
        String strR = (zT || iX == 2 || iX == 7) ? fVar.r() : fVar.r().toUpperCase(Locale.ENGLISH);
        if (fVar.v() == 0) {
            list = null;
        } else {
            List listU = fVar.u();
            if (!zT) {
                ArrayList arrayList = new ArrayList(listU.size());
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listU = DesugarCollections.unmodifiableList(arrayList);
            }
            list = listU;
        }
        return zzd(str, iX, zT, strR, list, iX == 2 ? strR : null, zzguVar);
    }

    public static Boolean zzg(long j, d dVar) {
        try {
            return zzj(new BigDecimal(j), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzh(double d, d dVar) {
        try {
            return zzj(new BigDecimal(d), dVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzi(String str, d dVar) {
        if (!zzpk.zzm(str)) {
            return null;
        }
        try {
            return zzj(new BigDecimal(str), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean zzj(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.d r9, double r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzab.zzj(java.math.BigDecimal, com.google.android.gms.internal.measurement.d, double):java.lang.Boolean");
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}
