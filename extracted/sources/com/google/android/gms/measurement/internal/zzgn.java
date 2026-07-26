package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.bl4;
import defpackage.o40;
import defpackage.rq4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        rq4.n(strArr);
        rq4.n(strArr2);
        rq4.n(atomicReference);
        rq4.i(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzc, zzjm.zza, zza);
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? o40.y("experiment_id(", str, ")") : zzg(str, zzjo.zzb, zzjo.zza, zzc);
    }

    public final String zzd(zzbg zzbgVar) {
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbgVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbgVar.zza));
        sb.append(",params=");
        zzbe zzbeVar = zzbgVar.zzb;
        sb.append(zzbeVar == null ? null : !zzgmVar.zza() ? zzbeVar.toString() : zze(zzbeVar.zzf()));
        return sb.toString();
    }

    public final String zze(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbC = bl4.C("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbC.length() != 8) {
                sbC.append(", ");
            }
            sbC.append(zzb(str));
            sbC.append(SimpleComparison.EQUAL_TO_OPERATION);
            Object obj = bundle.get(str);
            sbC.append(obj instanceof Bundle ? zzf(new Object[]{obj}) : obj instanceof Object[] ? zzf((Object[]) obj) : obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbC.append("}]");
        return sbC.toString();
    }

    public final String zzf(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbC = bl4.C("[");
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sbC.length() != 1) {
                    sbC.append(", ");
                }
                sbC.append(strZze);
            }
        }
        sbC.append("]");
        return sbC.toString();
    }
}
