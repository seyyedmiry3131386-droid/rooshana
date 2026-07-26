package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.y;
import defpackage.av9;
import defpackage.hq9;
import defpackage.kq9;
import defpackage.rq9;
import defpackage.sq9;
import defpackage.wv;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzy {
    final /* synthetic */ zzad zza;
    private String zzb;
    private boolean zzc;
    private g0 zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    public zzy(zzad zzadVar, String str, g0 g0Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new wv(0);
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = g0Var;
    }

    public final void zza(zzab zzabVar) {
        int iZza = zzabVar.zza();
        if (zzabVar.zzd != null) {
            this.zzf.set(iZza, true);
        }
        Boolean bool = zzabVar.zze;
        if (bool != null) {
            this.zze.set(iZza, bool.booleanValue());
        }
        if (zzabVar.zzf != null) {
            Map map = this.zzg;
            Integer numValueOf = Integer.valueOf(iZza);
            Long l = (Long) map.get(numValueOf);
            long jLongValue = zzabVar.zzf.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.zzg.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (zzabVar.zzg != null) {
            Map map2 = this.zzh;
            Integer numValueOf2 = Integer.valueOf(iZza);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.zzh.put(numValueOf2, arrayList);
            }
            if (zzabVar.zzb()) {
                arrayList.clear();
            }
            av9.a();
            zzic zzicVar = this.zza.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            String str = this.zzb;
            zzfx zzfxVar = zzfy.zzaF;
            if (zzalVarZzc.zzp(str, zzfxVar) && zzabVar.zzc()) {
                arrayList.clear();
            }
            av9.a();
            if (!zzicVar.zzc().zzp(this.zzb, zzfxVar)) {
                arrayList.add(Long.valueOf(zzabVar.zzg.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(zzabVar.zzg.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final v zzb(int i) {
        ArrayList arrayList;
        List list;
        hq9 hq9VarW = v.w();
        hq9VarW.b();
        ((v) hq9VarW.b).x(i);
        boolean z = this.zzc;
        hq9VarW.b();
        ((v) hq9VarW.b).A(z);
        g0 g0Var = this.zzd;
        if (g0Var != null) {
            hq9VarW.b();
            ((v) hq9VarW.b).z(g0Var);
        }
        rq9 rq9VarX = g0.x();
        List listZzp = zzpk.zzp(this.zze);
        rq9VarX.b();
        ((g0) rq9VarX.b).B(listZzp);
        List listZzp2 = zzpk.zzp(this.zzf);
        rq9VarX.b();
        ((g0) rq9VarX.b).z(listZzp2);
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) this.zzg.get(num);
                if (l != null) {
                    kq9 kq9VarT = y.t();
                    kq9VarT.b();
                    ((y) kq9VarT.b).u(iIntValue);
                    long jLongValue = l.longValue();
                    kq9VarT.b();
                    ((y) kq9VarT.b).v(jLongValue);
                    arrayList2.add((y) kq9VarT.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            rq9VarX.b();
            ((g0) rq9VarX.b).D(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                sq9 sq9VarU = h0.u();
                int iIntValue2 = num2.intValue();
                sq9VarU.b();
                ((h0) sq9VarU.b).v(iIntValue2);
                List list2 = (List) this.zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    sq9VarU.b();
                    ((h0) sq9VarU.b).w(list2);
                }
                arrayList3.add((h0) sq9VarU.e());
            }
            list = arrayList3;
        }
        rq9VarX.b();
        ((g0) rq9VarX.b).F(list);
        hq9VarW.b();
        ((v) hq9VarW.b).y((g0) rq9VarX.e());
        return (v) hq9VarW.e();
    }

    public final /* synthetic */ BitSet zzc() {
        return this.zze;
    }

    public zzy(zzad zzadVar, String str, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new wv(0);
        this.zzh = new wv(0);
    }
}
