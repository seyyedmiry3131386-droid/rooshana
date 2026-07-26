package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.g;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.q;
import defpackage.hl5;
import defpackage.jw9;
import defpackage.km9;
import defpackage.lg4;
import defpackage.lr9;
import defpackage.o77;
import defpackage.rq4;
import defpackage.t61;
import defpackage.vp9;
import defpackage.wp9;
import defpackage.ws9;
import defpackage.wv;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzht extends zzos implements zzak {
    final Map zza;
    final Map zzb;
    final Map zzc;
    final lg4 zzd;
    final jw9 zze;
    private final Map zzf;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    public zzht(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzf = new wv(0);
        this.zza = new wv(0);
        this.zzb = new wv(0);
        this.zzc = new wv(0);
        this.zzh = new wv(0);
        this.zzj = new wv(0);
        this.zzk = new wv(0);
        this.zzl = new wv(0);
        this.zzi = new wv(0);
        this.zzd = new zzhm(this, 20);
        this.zze = new zzhn(this);
    }

    private final void zzE(String str) throws Throwable {
        zzaw();
        zzg();
        rq4.k(str);
        Map map = this.zzh;
        if (map.get(str) == null) {
            zzaq zzaqVarZzy = this.zzg.zzj().zzy(str);
            if (zzaqVarZzy != null) {
                wp9 wp9Var = (wp9) zzH(str, zzaqVarZzy.zza).i();
                zzF(str, wp9Var);
                this.zzf.put(str, zzI((m) wp9Var.e()));
                map.put(str, (m) wp9Var.e());
                zzG(str, (m) wp9Var.e());
                this.zzj.put(str, ((m) wp9Var.b).A());
                this.zzk.put(str, zzaqVarZzy.zzb);
                this.zzl.put(str, zzaqVarZzy.zzc);
                return;
            }
            this.zzf.put(str, null);
            this.zzb.put(str, null);
            this.zza.put(str, null);
            this.zzc.put(str, null);
            map.put(str, null);
            this.zzj.put(str, null);
            this.zzk.put(str, null);
            this.zzl.put(str, null);
            this.zzi.put(str, null);
        }
    }

    private final void zzF(String str, wp9 wp9Var) {
        HashSet hashSet = new HashSet();
        wv wvVar = new wv(0);
        wv wvVar2 = new wv(0);
        wv wvVar3 = new wv(0);
        Iterator it = DesugarCollections.unmodifiableList(((m) wp9Var.b).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((k) it.next()).p());
        }
        for (int i = 0; i < ((m) wp9Var.b).u(); i++) {
            vp9 vp9Var = (vp9) ((m) wp9Var.b).v(i).i();
            if (vp9Var.h().isEmpty()) {
                t61.C(this.zzu, "EventConfig contained null event name");
            } else {
                String strH = vp9Var.h();
                String strZzb = zzjm.zzb(vp9Var.h());
                if (!TextUtils.isEmpty(strZzb)) {
                    vp9Var.b();
                    ((l) vp9Var.b).w(strZzb);
                    wp9Var.b();
                    ((m) wp9Var.b).H(i, (l) vp9Var.e());
                }
                if (((l) vp9Var.b).q() && ((l) vp9Var.b).r()) {
                    wvVar.put(strH, Boolean.TRUE);
                }
                if (((l) vp9Var.b).s() && ((l) vp9Var.b).t()) {
                    wvVar2.put(vp9Var.h(), Boolean.TRUE);
                }
                if (((l) vp9Var.b).u()) {
                    if (((l) vp9Var.b).v() < 2 || ((l) vp9Var.b).v() > 65535) {
                        this.zzu.zzaV().zze().zzc("Invalid sampling rate. Event name, sample rate", vp9Var.h(), Integer.valueOf(((l) vp9Var.b).v()));
                    } else {
                        wvVar3.put(vp9Var.h(), Integer.valueOf(((l) vp9Var.b).v()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, wvVar);
        this.zzc.put(str, wvVar2);
        this.zzi.put(str, wvVar3);
    }

    private final void zzG(final String str, m mVar) {
        if (mVar.y() == 0) {
            this.zzd.remove(str);
            return;
        }
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzb("EES programs found", Integer.valueOf(mVar.y()));
        m0 m0Var = (m0) mVar.x().get(0);
        try {
            km9 km9Var = new km9();
            o77 o77Var = km9Var.a;
            ((HashMap) ((hl5) o77Var.d).b).put("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzho zzhoVar = new zzho(this.zza, str);
                    ws9 ws9Var = new ws9("internal.remoteConfig", 0);
                    ws9Var.b.put("getValue", new lr9(ws9Var, zzhoVar));
                    return ws9Var;
                }
            });
            ((HashMap) ((hl5) o77Var.d).b).put("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhp
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final zzht zzhtVar = this.zza;
                    final String str2 = str;
                    return new lr9(new Callable() { // from class: com.google.android.gms.measurement.internal.zzhr
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            zzht zzhtVar2 = zzhtVar;
                            zzav zzavVarZzj = zzhtVar2.zzg.zzj();
                            String str3 = str2;
                            zzh zzhVarZzu = zzavVarZzj.zzu(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            zzhtVar2.zzu.zzc().zzi();
                            map.put("gmp_version", 133005L);
                            if (zzhVarZzu != null) {
                                String strZzr = zzhVarZzu.zzr();
                                if (strZzr != null) {
                                    map.put("app_version", strZzr);
                                }
                                map.put("app_version_int", Long.valueOf(zzhVarZzu.zzt()));
                                map.put("dynamite_version", Long.valueOf(zzhVarZzu.zzB()));
                            }
                            return map;
                        }
                    });
                }
            });
            ((HashMap) ((hl5) o77Var.d).b).put("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new lr9(this.zza.zze);
                }
            });
            km9Var.b(m0Var);
            this.zzd.put(str, km9Var);
            zzicVar.zzaV().zzk().zzc("EES program loaded for appId, activities", str, Integer.valueOf(m0Var.q().q()));
            Iterator it = m0Var.q().p().iterator();
            while (it.hasNext()) {
                zzicVar.zzaV().zzk().zzb("EES program activity", ((l0) it.next()).p());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzu.zzaV().zzb().zzb("Failed to load EES program. appId", str);
        }
    }

    private final m zzH(String str, byte[] bArr) {
        if (bArr == null) {
            return m.G();
        }
        try {
            m mVar = (m) ((wp9) zzpk.zzw(m.F(), bArr)).e();
            this.zzu.zzaV().zzk().zzc("Parsed config. version, gmp_app_id", mVar.p() ? Long.valueOf(mVar.q()) : null, mVar.r() ? mVar.s() : null);
            return mVar;
        } catch (com.google.android.gms.internal.measurement.zzmr e) {
            this.zzu.zzaV().zze().zzc("Unable to merge remote config. appId", zzgu.zzl(str), e);
            return m.G();
        } catch (RuntimeException e2) {
            this.zzu.zzaV().zze().zzc("Unable to merge remote config. appId", zzgu.zzl(str), e2);
            return m.G();
        }
    }

    private static final Map zzI(m mVar) {
        wv wvVar = new wv(0);
        if (mVar != null) {
            for (q qVar : mVar.t()) {
                wvVar.put(qVar.p(), qVar.q());
            }
        }
        return wvVar;
    }

    private static final zzjk zzJ(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return zzjk.AD_STORAGE;
        }
        if (i2 == 2) {
            return zzjk.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return zzjk.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return zzjk.AD_PERSONALIZATION;
    }

    public final zzji zzA(String str, zzjk zzjkVar) {
        zzg();
        zzE(str);
        j jVarZzx = zzx(str);
        if (jVarZzx == null) {
            return zzji.UNINITIALIZED;
        }
        for (g gVar : jVarZzx.u()) {
            if (zzJ(gVar.p()) == zzjkVar) {
                int iQ = gVar.q() - 1;
                return iQ != 1 ? iQ != 2 ? zzji.UNINITIALIZED : zzji.DENIED : zzji.GRANTED;
            }
        }
        return zzji.UNINITIALIZED;
    }

    public final boolean zzB(String str) throws Throwable {
        zzg();
        zzE(str);
        j jVarZzx = zzx(str);
        if (jVarZzx == null) {
            return false;
        }
        for (g gVar : jVarZzx.p()) {
            if (gVar.p() == 3 && gVar.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ km9 zzC(String str) throws Throwable {
        zzaw();
        rq4.k(str);
        zzaq zzaqVarZzy = this.zzg.zzj().zzy(str);
        if (zzaqVarZzy == null) {
            return null;
        }
        this.zzu.zzaV().zzk().zzb("Populate EES config from database on cache miss. appId", str);
        zzG(str, zzH(str, zzaqVarZzy.zza));
        return (km9) this.zzd.snapshot().get(str);
    }

    public final /* synthetic */ Map zzD() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzak
    public final String zza(String str, String str2) throws Throwable {
        zzg();
        zzE(str);
        Map map = (Map) this.zzf.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final m zzb(String str) {
        zzaw();
        zzg();
        rq4.k(str);
        zzE(str);
        return (m) this.zzh.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }

    public final String zzc(String str) {
        zzg();
        zzE(str);
        return (String) this.zzj.get(str);
    }

    public final String zzd(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    public final String zze(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    public final void zzf(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    public final void zzh(String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzi(String str, byte[] bArr, String str2, String str3) throws Throwable {
        zzaw();
        zzg();
        rq4.k(str);
        wp9 wp9Var = (wp9) zzH(str, bArr).i();
        zzF(str, wp9Var);
        zzG(str, (m) wp9Var.e());
        this.zzh.put(str, (m) wp9Var.e());
        this.zzj.put(str, ((m) wp9Var.b).A());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzf.put(str, zzI((m) wp9Var.e()));
        this.zzg.zzj().zzae(str, new ArrayList(DesugarCollections.unmodifiableList(((m) wp9Var.b).w())));
        try {
            wp9Var.b();
            ((m) wp9Var.b).I();
            bArr = ((m) wp9Var.e()).a();
        } catch (RuntimeException e) {
            this.zzu.zzaV().zze().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzgu.zzl(str), e);
        }
        zzav zzavVarZzj = this.zzg.zzj();
        rq4.k(str);
        zzavVarZzj.zzg();
        zzavVarZzj.zzaw();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzavVarZzj.zze().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzavVarZzj.zzu.zzaV().zzb().zzb("Failed to update remote config (got 0). appId", zzgu.zzl(str));
            }
        } catch (SQLiteException e2) {
            zzavVarZzj.zzu.zzaV().zzb().zzc("Error storing remote config. appId", zzgu.zzl(str), e2);
        }
        wp9Var.b();
        ((m) wp9Var.b).J();
        this.zzh.put(str, (m) wp9Var.e());
        return true;
    }

    public final boolean zzj(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzE(str);
        if (zzn(str) && zzpp.zzZ(str2)) {
            return true;
        }
        if (zzo(str) && zzpp.zzh(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzk(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzE(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final Set zzl(String str) {
        zzg();
        zzE(str);
        return (Set) this.zza.get(str);
    }

    public final int zzm(String str, String str2) throws Throwable {
        Integer num;
        zzg();
        zzE(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean zzn(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzo(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzp(String str) throws Throwable {
        zzg();
        zzE(str);
        Map map = this.zza;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean zzq(String str) throws Throwable {
        zzg();
        zzE(str);
        Map map = this.zza;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean zzr(String str) throws Throwable {
        zzg();
        zzE(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    public final boolean zzs(String str) throws Throwable {
        zzg();
        zzE(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    public final boolean zzt(String str) throws Throwable {
        zzg();
        zzE(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    public final boolean zzu(String str) throws Throwable {
        zzg();
        zzE(str);
        Map map = this.zza;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    public final boolean zzv(String str, zzjk zzjkVar) throws Throwable {
        zzg();
        zzE(str);
        j jVarZzx = zzx(str);
        if (jVarZzx == null) {
            return false;
        }
        Iterator it = jVarZzx.p().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g gVar = (g) it.next();
            if (zzjkVar == zzJ(gVar.p())) {
                if (gVar.q() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final zzjk zzw(String str, zzjk zzjkVar) {
        zzg();
        zzE(str);
        j jVarZzx = zzx(str);
        if (jVarZzx == null) {
            return null;
        }
        for (h hVar : jVarZzx.q()) {
            if (zzjkVar == zzJ(hVar.p())) {
                return zzJ(hVar.q());
            }
        }
        return null;
    }

    public final j zzx(String str) {
        zzg();
        zzE(str);
        m mVarZzb = zzb(str);
        if (mVarZzb == null || !mVarZzb.B()) {
            return null;
        }
        return mVarZzb.C();
    }

    public final boolean zzy(String str) {
        zzg();
        zzE(str);
        j jVarZzx = zzx(str);
        return jVarZzx == null || !jVarZzx.s() || jVarZzx.t();
    }

    public final SortedSet zzz(String str) {
        zzg();
        zzE(str);
        TreeSet treeSet = new TreeSet();
        j jVarZzx = zzx(str);
        if (jVarZzx != null) {
            Iterator it = jVarZzx.r().iterator();
            while (it.hasNext()) {
                treeSet.add(((i) it.next()).p());
            }
        }
        return treeSet;
    }
}
