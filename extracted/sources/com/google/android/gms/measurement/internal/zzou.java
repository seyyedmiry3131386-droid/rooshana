package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.m;
import defpackage.rq4;
import defpackage.tq9;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzou extends zzol {
    public zzou(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final String zzd(String str) {
        String strZzc = this.zzg.zzh().zzc(str);
        if (TextUtils.isEmpty(strZzc)) {
            return (String) zzfy.zzq.zzb(null);
        }
        Uri uri = Uri.parse((String) zzfy.zzq.zzb(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzc).length() + 1 + String.valueOf(authority).length());
        sb.append(strZzc);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }

    private static final boolean zzf(String str) {
        String str2 = (String) zzfy.zzs.zzb(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final zzot zza(String str) {
        zzh zzhVarZzu;
        zzpg zzpgVar = this.zzg;
        zzh zzhVarZzu2 = zzpgVar.zzj().zzu(str);
        zzot zzotVar = null;
        if (zzhVarZzu2 == null || !zzhVarZzu2.zzai()) {
            return new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, null);
        }
        tq9 tq9VarQ = i0.q();
        tq9VarQ.b();
        ((i0) tq9VarQ.b).v(2);
        com.google.android.gms.internal.measurement.zzin zzinVarA = com.google.android.gms.internal.measurement.zzin.a(zzhVarZzu2.zzaL());
        rq4.n(zzinVarA);
        tq9VarQ.h(zzinVarA);
        String strZzd = zzhVarZzu2.zzd();
        m mVarZzb = zzpgVar.zzh().zzb(str);
        if (mVarZzb == null || (zzhVarZzu = zzpgVar.zzj().zzu(str)) == null || ((!mVarZzb.D() || mVarZzb.E().p() != 100) && !this.zzu.zzk().zzaa(str, zzhVarZzu.zzay()) && (TextUtils.isEmpty(strZzd) || Math.abs(strZzd.hashCode() % 100) >= mVarZzb.E().p()))) {
            tq9VarQ.b();
            ((i0) tq9VarQ.b).w(3);
            return new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (i0) tq9VarQ.e());
        }
        String strZzc = zzhVarZzu2.zzc();
        tq9VarQ.b();
        ((i0) tq9VarQ.b).v(2);
        m mVarZzb2 = zzpgVar.zzh().zzb(zzhVarZzu2.zzc());
        if (mVarZzb2 == null || !mVarZzb2.D()) {
            this.zzu.zzaV().zzk().zzb("[sgtm] Missing sgtm_setting in remote config. appId", strZzc);
            tq9VarQ.b();
            ((i0) tq9VarQ.b).w(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(zzhVarZzu2.zzay())) {
                map.put("x-gtm-server-preview", zzhVarZzu2.zzay());
            }
            String strQ = mVarZzb2.E().q();
            com.google.android.gms.internal.measurement.zzin zzinVarA2 = com.google.android.gms.internal.measurement.zzin.a(zzhVarZzu2.zzaL());
            com.google.android.gms.internal.measurement.zzin zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
            if (zzinVarA2 != null && zzinVarA2 != zzinVar) {
                tq9VarQ.h(zzinVarA2);
            } else if (zzf(zzhVarZzu2.zzc())) {
                tq9VarQ.h(com.google.android.gms.internal.measurement.zzin.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strQ)) {
                tq9VarQ.h(com.google.android.gms.internal.measurement.zzin.MISSING_SGTM_SERVER_URL);
            } else {
                this.zzu.zzaV().zzk().zzb("[sgtm] Eligible for client side upload. appId", strZzc);
                tq9VarQ.b();
                ((i0) tq9VarQ.b).v(3);
                tq9VarQ.h(zzinVar);
                zzotVar = new zzot(strQ, map, zzls.SGTM_CLIENT, (i0) tq9VarQ.e());
            }
            mVarZzb2.E().getClass();
            mVarZzb2.E().getClass();
            zzic zzicVar = this.zzu;
            zzicVar.zzaU();
            if (TextUtils.isEmpty(strQ)) {
                tq9VarQ.b();
                ((i0) tq9VarQ.b).w(6);
                zzicVar.zzaV().zzk().zzb("[sgtm] Local service, missing sgtm_server_url", zzhVarZzu2.zzc());
            } else {
                zzicVar.zzaV().zzk().zzb("[sgtm] Eligible for local service direct upload. appId", strZzc);
                tq9VarQ.b();
                ((i0) tq9VarQ.b).v(5);
                tq9VarQ.b();
                ((i0) tq9VarQ.b).w(2);
                zzotVar = new zzot(strQ, map, zzls.SGTM, (i0) tq9VarQ.e());
            }
        }
        return zzotVar != null ? zzotVar : new zzot(zzd(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (i0) tq9VarQ.e());
    }

    public final boolean zzc(String str, com.google.android.gms.internal.measurement.zzin zzinVar) {
        m mVarZzb;
        zzg();
        return (zzinVar != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE || zzf(str) || (mVarZzb = this.zzg.zzh().zzb(str)) == null || !mVarZzb.D() || mVarZzb.E().q().isEmpty()) ? false : true;
    }
}
