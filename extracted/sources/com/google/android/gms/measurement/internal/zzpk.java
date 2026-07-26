package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.bl4;
import defpackage.ct9;
import defpackage.eq;
import defpackage.es9;
import defpackage.ft9;
import defpackage.hs9;
import defpackage.js9;
import defpackage.lq9;
import defpackage.mw9;
import defpackage.nq9;
import defpackage.nw9;
import defpackage.pq9;
import defpackage.ps9;
import defpackage.rq4;
import defpackage.t61;
import defpackage.wq9;
import defpackage.xj9;
import defpackage.yv9;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes.dex */
public final class zzpk extends zzos {
    public zzpk(zzpg zzpgVar) {
        super(zzpgVar);
    }

    public static final void zzC(lq9 lq9Var, String str, Object obj) {
        List listH = lq9Var.h();
        int i = 0;
        while (true) {
            if (i >= listH.size()) {
                i = -1;
                break;
            } else if (str.equals(((b0) listH.get(i)).q())) {
                break;
            } else {
                i++;
            }
        }
        nq9 nq9VarB = b0.B();
        nq9VarB.h(str);
        nq9VarB.j(((Long) obj).longValue());
        if (i < 0) {
            lq9Var.l(nq9VarB);
        } else {
            lq9Var.b();
            ((z) lq9Var.b).A(i, (b0) nq9VarB.e());
        }
    }

    public static final boolean zzD(zzbg zzbgVar, zzr zzrVar) {
        rq4.n(zzbgVar);
        rq4.n(zzrVar);
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    public static final Bundle zzE(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            String strQ = b0Var.q();
            if (b0Var.x()) {
                bundle.putDouble(strQ, b0Var.y());
            } else if (b0Var.v()) {
                bundle.putFloat(strQ, b0Var.w());
            } else if (b0Var.r()) {
                bundle.putString(strQ, b0Var.s());
            } else if (b0Var.t()) {
                bundle.putLong(strQ, b0Var.u());
            }
        }
        return bundle;
    }

    public static final b0 zzF(z zVar, String str) {
        for (b0 b0Var : zVar.p()) {
            if (b0Var.q().equals(str)) {
                return b0Var;
            }
        }
        return null;
    }

    public static final Map zzG(z zVar, String... strArr) {
        Object objZzP;
        HashMap map = new HashMap();
        for (b0 b0Var : zVar.p()) {
            if (Arrays.asList(strArr).contains(b0Var.q()) && (objZzP = zzP(b0Var)) != null) {
                map.put(b0Var.q(), objZzP);
            }
        }
        return map;
    }

    public static final Map zzH(z zVar, String str) {
        Object objZzP;
        HashMap map = new HashMap();
        for (b0 b0Var : zVar.p()) {
            if (b0Var.q().startsWith("gad_") && (objZzP = zzP(b0Var)) != null) {
                map.put(b0Var.q(), objZzP);
            }
        }
        return map;
    }

    public static final Object zzI(z zVar, String str) {
        b0 b0VarZzF = zzF(zVar, str);
        if (b0VarZzF == null) {
            return null;
        }
        return zzP(b0VarZzF);
    }

    public static final Object zzJ(z zVar, String str, Object obj) {
        Object objZzI = zzI(zVar, str);
        return objZzI == null ? obj : objZzI;
    }

    private final void zzK(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var != null) {
                zzM(sb, i2);
                sb.append("param {\n");
                zzS(sb, i2, AppMeasurementSdk.ConditionalUserProperty.NAME, b0Var.p() ? this.zzu.zzl().zzb(b0Var.q()) : null);
                zzS(sb, i2, "string_value", b0Var.r() ? b0Var.s() : null);
                zzS(sb, i2, "int_value", b0Var.t() ? Long.valueOf(b0Var.u()) : null);
                zzS(sb, i2, "double_value", b0Var.x() ? Double.valueOf(b0Var.y()) : null);
                if (b0Var.A() > 0) {
                    zzK(sb, i2, b0Var.z());
                }
                zzM(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zzL(StringBuilder sb, int i, c cVar) {
        String str;
        if (cVar == null) {
            return;
        }
        zzM(sb, i);
        sb.append("filter {\n");
        if (cVar.t()) {
            zzS(sb, i, "complement", Boolean.valueOf(cVar.u()));
        }
        if (cVar.v()) {
            zzS(sb, i, "param_name", this.zzu.zzl().zzb(cVar.w()));
        }
        if (cVar.p()) {
            int i2 = i + 1;
            f fVarQ = cVar.q();
            if (fVarQ != null) {
                zzM(sb, i2);
                sb.append("string_filter {\n");
                if (fVarQ.p()) {
                    switch (fVarQ.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzS(sb, i2, "match_type", str);
                }
                if (fVarQ.q()) {
                    zzS(sb, i2, "expression", fVarQ.r());
                }
                if (fVarQ.s()) {
                    zzS(sb, i2, "case_sensitive", Boolean.valueOf(fVarQ.t()));
                }
                if (fVarQ.v() > 0) {
                    zzM(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : fVarQ.u()) {
                        zzM(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzM(sb, i2);
                sb.append("}\n");
            }
        }
        if (cVar.r()) {
            zzT(sb, i + 1, "number_filter", cVar.s());
        }
        zzM(sb, i);
        sb.append("}\n");
    }

    private static final void zzM(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final void zzN(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static final String zzO(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final Object zzP(b0 b0Var) {
        if (b0Var.r()) {
            return b0Var.s();
        }
        if (b0Var.t()) {
            return Long.valueOf(b0Var.u());
        }
        if (b0Var.x()) {
            return Double.valueOf(b0Var.y());
        }
        if (b0Var.A() > 0) {
            return zzy(b0Var.z());
        }
        return null;
    }

    private static final void zzQ(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zzN(builder, str3, string, set);
            }
        }
    }

    private static final void zzR(StringBuilder sb, int i, String str, g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        zzM(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (g0Var.s() != 0) {
            zzM(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : g0Var.r()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (g0Var.q() != 0) {
            zzM(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : g0Var.p()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (g0Var.u() != 0) {
            zzM(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (y yVar : g0Var.t()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(yVar.p() ? Integer.valueOf(yVar.q()) : null);
                sb.append(":");
                sb.append(yVar.r() ? Long.valueOf(yVar.s()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (g0Var.w() != 0) {
            zzM(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (h0 h0Var : g0Var.v()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(h0Var.p() ? Integer.valueOf(h0Var.q()) : null);
                sb.append(": [");
                Iterator it = h0Var.r().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        zzM(sb, 3);
        sb.append("}\n");
    }

    private static final void zzS(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzM(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzT(StringBuilder sb, int i, String str, d dVar) {
        if (dVar == null) {
            return;
        }
        zzM(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (dVar.p()) {
            int iZ = dVar.z();
            zzS(sb, i, "comparison_type", iZ != 1 ? iZ != 2 ? iZ != 3 ? iZ != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (dVar.q()) {
            zzS(sb, i, "match_as_float", Boolean.valueOf(dVar.r()));
        }
        if (dVar.s()) {
            zzS(sb, i, "comparison_value", dVar.t());
        }
        if (dVar.u()) {
            zzS(sb, i, "min_comparison_value", dVar.v());
        }
        if (dVar.w()) {
            zzS(sb, i, "max_comparison_value", dVar.x());
        }
        zzM(sb, i);
        sb.append("}\n");
    }

    public static boolean zzm(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean zzn(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List zzp(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static ct9 zzw(ct9 ct9Var, byte[] bArr) throws com.google.android.gms.internal.measurement.zzmr {
        es9 es9VarX;
        es9 es9Var = es9.a;
        if (es9Var == null) {
            synchronized (es9.class) {
                try {
                    es9VarX = es9.a;
                    if (es9VarX == null) {
                        ft9 ft9Var = ft9.c;
                        es9VarX = hs9.X();
                        es9.a = es9VarX;
                    }
                } finally {
                }
            }
            es9Var = es9VarX;
        }
        if (es9Var != null) {
            js9 js9Var = (js9) ct9Var;
            js9Var.getClass();
            js9Var.g(bArr, bArr.length, es9Var);
            return js9Var;
        }
        js9 js9Var2 = (js9) ct9Var;
        js9Var2.getClass();
        int length = bArr.length;
        es9 es9Var2 = es9.a;
        ft9 ft9Var2 = ft9.c;
        js9Var2.g(bArr, length, es9.b);
        return js9Var2;
    }

    public static int zzx(pq9 pq9Var, String str) {
        for (int i = 0; i < ((e0) pq9Var.b).X1(); i++) {
            if (str.equals(((e0) pq9Var.b).Y1(i).r())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] zzy(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (b0Var != null) {
                Bundle bundle = new Bundle();
                for (b0 b0Var2 : b0Var.z()) {
                    if (b0Var2.r()) {
                        bundle.putString(b0Var2.q(), b0Var2.s());
                    } else if (b0Var2.t()) {
                        bundle.putLong(b0Var2.q(), b0Var2.u());
                    } else if (b0Var2.x()) {
                        bundle.putDouble(b0Var2.q(), b0Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final zzbg zzA(xj9 xj9Var) {
        Object obj;
        Bundle bundleZzB = zzB(xj9Var.c, true);
        String string = (!bundleZzB.containsKey("_o") || (obj = bundleZzB.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzjm.zzb(xj9Var.a);
        if (strZzb == null) {
            strZzb = xj9Var.a;
        }
        return new zzbg(strZzb, new zzbe(bundleZzB), string, xj9Var.b);
    }

    public final Bundle zzB(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzB((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }

    public final void zzc(wq9 wq9Var, Object obj) {
        rq4.n(obj);
        wq9Var.b();
        ((j0) wq9Var.b).E();
        wq9Var.b();
        ((j0) wq9Var.b).G();
        wq9Var.b();
        ((j0) wq9Var.b).I();
        if (obj instanceof String) {
            wq9Var.b();
            ((j0) wq9Var.b).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            wq9Var.b();
            ((j0) wq9Var.b).F(jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) user attribute value", obj);
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            wq9Var.b();
            ((j0) wq9Var.b).H(dDoubleValue);
        }
    }

    public final void zzd(nq9 nq9Var, Object obj) {
        rq4.n(obj);
        nq9Var.b();
        ((b0) nq9Var.b).E();
        nq9Var.b();
        ((b0) nq9Var.b).G();
        nq9Var.b();
        ((b0) nq9Var.b).I();
        nq9Var.b();
        ((b0) nq9Var.b).L();
        if (obj instanceof String) {
            nq9Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            nq9Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            nq9Var.b();
            ((b0) nq9Var.b).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzu.zzaV().zzb().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                nq9 nq9VarB = b0.B();
                for (String str : bundle.keySet()) {
                    nq9 nq9VarB2 = b0.B();
                    nq9VarB2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        nq9VarB2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        nq9VarB2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        nq9VarB2.b();
                        ((b0) nq9VarB2.b).H(dDoubleValue2);
                    }
                    nq9VarB.b();
                    ((b0) nq9VarB.b).J((b0) nq9VarB2.e());
                }
                if (((b0) nq9VarB.b).A() > 0) {
                    arrayList.add((b0) nq9VarB.e());
                }
            }
        }
        nq9Var.b();
        ((b0) nq9Var.b).K(arrayList);
    }

    @TargetApi(30)
    public final zzoh zzf(String str, pq9 pq9Var, lq9 lq9Var, String str2) {
        int iIndexOf;
        yv9.a();
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzp(str, zzfy.zzaP)) {
            return null;
        }
        ((eq) zzicVar.zzaZ()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = zzicVar.zzc().zzk(str, zzfy.zzau).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        zzpg zzpgVar = this.zzg;
        zzou zzouVarZzf = zzpgVar.zzf();
        String strZzc = zzouVarZzf.zzg.zzh().zzc(str);
        Uri.Builder builder = new Uri.Builder();
        zzic zzicVar2 = zzouVarZzf.zzu;
        builder.scheme(zzicVar2.zzc().zzk(str, zzfy.zzan));
        if (TextUtils.isEmpty(strZzc)) {
            builder.authority(zzicVar2.zzc().zzk(str, zzfy.zzao));
        } else {
            String strZzk = zzicVar2.zzc().zzk(str, zzfy.zzao);
            StringBuilder sb = new StringBuilder(String.valueOf(strZzc).length() + 1 + String.valueOf(strZzk).length());
            sb.append(strZzc);
            sb.append(".");
            sb.append(strZzk);
            builder.authority(sb.toString());
        }
        builder.path(zzicVar2.zzc().zzk(str, zzfy.zzap));
        zzN(builder, "gmp_app_id", ((e0) pq9Var.b).E(), setUnmodifiableSet);
        zzicVar.zzc().zzi();
        zzN(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strY = ((e0) pq9Var.b).y();
        zzal zzalVarZzc = zzicVar.zzc();
        zzfx zzfxVar = zzfy.zzaS;
        if (zzalVarZzc.zzp(str, zzfxVar) && zzpgVar.zzh().zzt(str)) {
            strY = "";
        }
        zzN(builder, "app_instance_id", strY, setUnmodifiableSet);
        zzN(builder, "rdid", ((e0) pq9Var.b).v(), setUnmodifiableSet);
        zzN(builder, "bundle_id", pq9Var.i(), setUnmodifiableSet);
        String strN = lq9Var.n();
        String strZza = zzjm.zza(strN);
        if (true != TextUtils.isEmpty(strZza)) {
            strN = strZza;
        }
        zzN(builder, "app_event_name", strN, setUnmodifiableSet);
        zzN(builder, "app_version", String.valueOf(((e0) pq9Var.b).K()), setUnmodifiableSet);
        String strK2 = ((e0) pq9Var.b).k2();
        if (zzicVar.zzc().zzp(str, zzfxVar) && zzpgVar.zzh().zzq(str) && !TextUtils.isEmpty(strK2) && (iIndexOf = strK2.indexOf(".")) != -1) {
            strK2 = strK2.substring(0, iIndexOf);
        }
        zzN(builder, "os_version", strK2, setUnmodifiableSet);
        zzN(builder, "timestamp", String.valueOf(lq9Var.p()), setUnmodifiableSet);
        if (((e0) pq9Var.b).x()) {
            zzN(builder, "lat", "1", setUnmodifiableSet);
        }
        zzN(builder, "privacy_sandbox_version", String.valueOf(((e0) pq9Var.b).H0()), setUnmodifiableSet);
        zzN(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        zzN(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        zzN(builder, "request_uuid", str2, setUnmodifiableSet);
        List<b0> listH = lq9Var.h();
        Bundle bundle = new Bundle();
        for (b0 b0Var : listH) {
            String strQ = b0Var.q();
            if (b0Var.x()) {
                bundle.putString(strQ, String.valueOf(b0Var.y()));
            } else if (b0Var.v()) {
                bundle.putString(strQ, String.valueOf(b0Var.w()));
            } else if (b0Var.r()) {
                bundle.putString(strQ, b0Var.s());
            } else if (b0Var.t()) {
                bundle.putString(strQ, String.valueOf(b0Var.u()));
            }
        }
        zzQ(builder, zzicVar.zzc().zzk(str, zzfy.zzat).split("\\|"), bundle, setUnmodifiableSet);
        List<j0> listUnmodifiableList = DesugarCollections.unmodifiableList(((e0) pq9Var.b).W1());
        Bundle bundle2 = new Bundle();
        for (j0 j0Var : listUnmodifiableList) {
            String strR = j0Var.r();
            if (j0Var.y()) {
                bundle2.putString(strR, String.valueOf(j0Var.z()));
            } else if (j0Var.w()) {
                bundle2.putString(strR, String.valueOf(j0Var.x()));
            } else if (j0Var.s()) {
                bundle2.putString(strR, j0Var.t());
            } else if (j0Var.u()) {
                bundle2.putString(strR, String.valueOf(j0Var.v()));
            }
        }
        zzQ(builder, zzicVar.zzc().zzk(str, zzfy.zzas).split("\\|"), bundle2, setUnmodifiableSet);
        zzN(builder, "dma", true != ((e0) pq9Var.b).E0() ? "0" : "1", setUnmodifiableSet);
        if (!((e0) pq9Var.b).G0().isEmpty()) {
            zzN(builder, "dma_cps", ((e0) pq9Var.b).G0(), setUnmodifiableSet);
        }
        if (((e0) pq9Var.b).M0()) {
            s sVarN0 = ((e0) pq9Var.b).N0();
            if (!sVarN0.z().isEmpty()) {
                zzN(builder, "dl_gclid", sVarN0.z(), setUnmodifiableSet);
            }
            if (!sVarN0.B().isEmpty()) {
                zzN(builder, "dl_gbraid", sVarN0.B(), setUnmodifiableSet);
            }
            if (!sVarN0.D().isEmpty()) {
                zzN(builder, "dl_gs", sVarN0.D(), setUnmodifiableSet);
            }
            if (sVarN0.F() > 0) {
                zzN(builder, "dl_ss_ts", String.valueOf(sVarN0.F()), setUnmodifiableSet);
            }
            if (!sVarN0.H().isEmpty()) {
                zzN(builder, "mr_gclid", sVarN0.H(), setUnmodifiableSet);
            }
            if (!sVarN0.J().isEmpty()) {
                zzN(builder, "mr_gbraid", sVarN0.J(), setUnmodifiableSet);
            }
            if (!sVarN0.L().isEmpty()) {
                zzN(builder, "mr_gs", sVarN0.L(), setUnmodifiableSet);
            }
            if (sVarN0.N() > 0) {
                zzN(builder, "mr_click_ts", String.valueOf(sVarN0.N()), setUnmodifiableSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final z zzh(zzbb zzbbVar) {
        lq9 lq9VarZ = z.z();
        long j = zzbbVar.zze;
        lq9VarZ.b();
        ((z) lq9VarZ.b).H(j);
        zzbe zzbeVar = zzbbVar.zzf;
        zzbd zzbdVar = new zzbd(zzbeVar);
        while (zzbdVar.hasNext()) {
            String next = zzbdVar.next();
            nq9 nq9VarB = b0.B();
            nq9VarB.h(next);
            Object objZza = zzbeVar.zza(next);
            rq4.n(objZza);
            zzd(nq9VarB, objZza);
            lq9VarZ.l(nq9VarB);
        }
        String str = zzbbVar.zzc;
        if (!TextUtils.isEmpty(str) && zzbeVar.zza("_o") == null) {
            nq9 nq9VarB2 = b0.B();
            nq9VarB2.h("_o");
            nq9VarB2.i(str);
            lq9VarZ.k((b0) nq9VarB2.e());
        }
        return (z) lq9VarZ.e();
    }

    public final String zzi(d0 d0Var) {
        u uVarJ0;
        if (d0Var == null) {
            return "";
        }
        StringBuilder sbC = bl4.C("\nbatch {\n");
        if (d0Var.u()) {
            zzS(sbC, 0, "upload_subdomain", d0Var.v());
        }
        if (d0Var.s()) {
            zzS(sbC, 0, "sgtm_join_id", d0Var.t());
        }
        for (e0 e0Var : d0Var.p()) {
            if (e0Var != null) {
                zzM(sbC, 1);
                sbC.append("bundle {\n");
                if (e0Var.P()) {
                    zzS(sbC, 1, "protocol_version", Integer.valueOf(e0Var.Q0()));
                }
                ((nw9) mw9.b.a.get()).getClass();
                zzic zzicVar = this.zzu;
                if (zzicVar.zzc().zzp(e0Var.p(), zzfy.zzaM) && e0Var.w0()) {
                    zzS(sbC, 1, "session_stitching_token", e0Var.x0());
                }
                zzS(sbC, 1, "platform", e0Var.j2());
                if (e0Var.r()) {
                    zzS(sbC, 1, "gmp_version", Long.valueOf(e0Var.s()));
                }
                if (e0Var.t()) {
                    zzS(sbC, 1, "uploading_gmp_version", Long.valueOf(e0Var.u()));
                }
                if (e0Var.s0()) {
                    zzS(sbC, 1, "dynamite_version", Long.valueOf(e0Var.t0()));
                }
                if (e0Var.L()) {
                    zzS(sbC, 1, "config_version", Long.valueOf(e0Var.M()));
                }
                zzS(sbC, 1, "gmp_app_id", e0Var.E());
                zzS(sbC, 1, "app_id", e0Var.p());
                zzS(sbC, 1, "app_version", e0Var.q());
                if (e0Var.J()) {
                    zzS(sbC, 1, "app_version_major", Integer.valueOf(e0Var.K()));
                }
                zzS(sbC, 1, "firebase_instance_id", e0Var.I());
                if (e0Var.z()) {
                    zzS(sbC, 1, "dev_cert_hash", Long.valueOf(e0Var.A()));
                }
                zzS(sbC, 1, "app_store", e0Var.p2());
                if (e0Var.Z1()) {
                    zzS(sbC, 1, "upload_timestamp_millis", Long.valueOf(e0Var.a2()));
                }
                if (e0Var.b2()) {
                    zzS(sbC, 1, "start_timestamp_millis", Long.valueOf(e0Var.c2()));
                }
                if (e0Var.d2()) {
                    zzS(sbC, 1, "end_timestamp_millis", Long.valueOf(e0Var.e2()));
                }
                if (e0Var.f2()) {
                    zzS(sbC, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(e0Var.g2()));
                }
                if (e0Var.h2()) {
                    zzS(sbC, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(e0Var.i2()));
                }
                zzS(sbC, 1, "app_instance_id", e0Var.y());
                zzS(sbC, 1, "resettable_device_id", e0Var.v());
                zzS(sbC, 1, "ds_id", e0Var.O());
                if (e0Var.w()) {
                    zzS(sbC, 1, "limited_ad_tracking", Boolean.valueOf(e0Var.x()));
                }
                zzS(sbC, 1, "os_version", e0Var.k2());
                zzS(sbC, 1, "device_model", e0Var.l2());
                zzS(sbC, 1, "user_default_language", e0Var.m2());
                if (e0Var.n2()) {
                    zzS(sbC, 1, "time_zone_offset_minutes", Integer.valueOf(e0Var.o2()));
                }
                if (e0Var.B()) {
                    zzS(sbC, 1, "bundle_sequential_index", Integer.valueOf(e0Var.C()));
                }
                if (e0Var.K0()) {
                    zzS(sbC, 1, "delivery_index", Integer.valueOf(e0Var.L0()));
                }
                if (e0Var.F()) {
                    zzS(sbC, 1, "service_upload", Boolean.valueOf(e0Var.G()));
                }
                zzS(sbC, 1, "health_monitor", e0Var.D());
                if (e0Var.q0()) {
                    zzS(sbC, 1, "retry_counter", Integer.valueOf(e0Var.r0()));
                }
                if (e0Var.u0()) {
                    zzS(sbC, 1, "consent_signals", e0Var.v0());
                }
                if (e0Var.D0()) {
                    zzS(sbC, 1, "is_dma_region", Boolean.valueOf(e0Var.E0()));
                }
                if (e0Var.F0()) {
                    zzS(sbC, 1, "core_platform_services", e0Var.G0());
                }
                if (e0Var.B0()) {
                    zzS(sbC, 1, "consent_diagnostics", e0Var.C0());
                }
                if (e0Var.y0()) {
                    zzS(sbC, 1, "target_os_version", Long.valueOf(e0Var.z0()));
                }
                yv9.a();
                if (zzicVar.zzc().zzp(e0Var.p(), zzfy.zzaP)) {
                    zzS(sbC, 1, "ad_services_version", Integer.valueOf(e0Var.H0()));
                    if (e0Var.I0() && (uVarJ0 = e0Var.J0()) != null) {
                        zzM(sbC, 2);
                        sbC.append("attribution_eligibility_status {\n");
                        zzS(sbC, 2, "eligible", Boolean.valueOf(uVarJ0.p()));
                        zzS(sbC, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(uVarJ0.q()));
                        zzS(sbC, 2, "pre_r", Boolean.valueOf(uVarJ0.r()));
                        zzS(sbC, 2, "r_extensions_too_old", Boolean.valueOf(uVarJ0.s()));
                        zzS(sbC, 2, "adservices_extension_too_old", Boolean.valueOf(uVarJ0.t()));
                        zzS(sbC, 2, "ad_storage_not_allowed", Boolean.valueOf(uVarJ0.u()));
                        zzS(sbC, 2, "measurement_manager_disabled", Boolean.valueOf(uVarJ0.v()));
                        zzM(sbC, 2);
                        sbC.append("}\n");
                    }
                }
                if (e0Var.M0()) {
                    s sVarN0 = e0Var.N0();
                    zzM(sbC, 2);
                    sbC.append("ad_campaign_info {\n");
                    if (sVarN0.y()) {
                        zzS(sbC, 2, "deep_link_gclid", sVarN0.z());
                    }
                    if (sVarN0.A()) {
                        zzS(sbC, 2, "deep_link_gbraid", sVarN0.B());
                    }
                    if (sVarN0.C()) {
                        zzS(sbC, 2, "deep_link_gad_source", sVarN0.D());
                    }
                    if (sVarN0.E()) {
                        zzS(sbC, 2, "deep_link_session_millis", Long.valueOf(sVarN0.F()));
                    }
                    if (sVarN0.G()) {
                        zzS(sbC, 2, "market_referrer_gclid", sVarN0.H());
                    }
                    if (sVarN0.I()) {
                        zzS(sbC, 2, "market_referrer_gbraid", sVarN0.J());
                    }
                    if (sVarN0.K()) {
                        zzS(sbC, 2, "market_referrer_gad_source", sVarN0.L());
                    }
                    if (sVarN0.M()) {
                        zzS(sbC, 2, "market_referrer_click_millis", Long.valueOf(sVarN0.N()));
                    }
                    zzM(sbC, 2);
                    sbC.append("}\n");
                }
                if (e0Var.Q()) {
                    zzS(sbC, 1, "batching_timestamp_millis", Long.valueOf(e0Var.R()));
                }
                if (e0Var.O0()) {
                    i0 i0VarP0 = e0Var.P0();
                    zzM(sbC, 2);
                    sbC.append("sgtm_diagnostics {\n");
                    int iT = i0VarP0.t();
                    zzS(sbC, 2, "upload_type", iT != 1 ? iT != 2 ? iT != 3 ? iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    zzS(sbC, 2, "client_upload_eligibility", i0VarP0.p().name());
                    int iU = i0VarP0.u();
                    zzS(sbC, 2, "service_upload_eligibility", iU != 1 ? iU != 2 ? iU != 3 ? iU != 4 ? iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    zzM(sbC, 2);
                    sbC.append("}\n");
                }
                if (e0Var.S()) {
                    x xVarT = e0Var.T();
                    zzM(sbC, 2);
                    sbC.append("consent_info_extra {\n");
                    for (w wVar : xVarT.p()) {
                        zzM(sbC, 3);
                        sbC.append("limited_data_modes {\n");
                        int iQ = wVar.q();
                        zzS(sbC, 3, "type", iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int iR = wVar.r();
                        zzS(sbC, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        zzM(sbC, 3);
                        sbC.append("}\n");
                    }
                    zzM(sbC, 2);
                    sbC.append("}\n");
                }
                ps9<j0> ps9VarW1 = e0Var.W1();
                if (ps9VarW1 != null) {
                    for (j0 j0Var : ps9VarW1) {
                        if (j0Var != null) {
                            zzM(sbC, 2);
                            sbC.append("user_property {\n");
                            zzS(sbC, 2, "set_timestamp_millis", j0Var.p() ? Long.valueOf(j0Var.q()) : null);
                            zzS(sbC, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzicVar.zzl().zzc(j0Var.r()));
                            zzS(sbC, 2, "string_value", j0Var.t());
                            zzS(sbC, 2, "int_value", j0Var.u() ? Long.valueOf(j0Var.v()) : null);
                            zzS(sbC, 2, "double_value", j0Var.y() ? Double.valueOf(j0Var.z()) : null);
                            zzM(sbC, 2);
                            sbC.append("}\n");
                        }
                    }
                }
                ps9<v> ps9VarH = e0Var.H();
                if (ps9VarH != null) {
                    for (v vVar : ps9VarH) {
                        if (vVar != null) {
                            zzM(sbC, 2);
                            sbC.append("audience_membership {\n");
                            if (vVar.p()) {
                                zzS(sbC, 2, "audience_id", Integer.valueOf(vVar.q()));
                            }
                            if (vVar.u()) {
                                zzS(sbC, 2, "new_audience", Boolean.valueOf(vVar.v()));
                            }
                            zzR(sbC, 2, "current_data", vVar.r());
                            if (vVar.s()) {
                                zzR(sbC, 2, "previous_data", vVar.t());
                            }
                            zzM(sbC, 2);
                            sbC.append("}\n");
                        }
                    }
                }
                List<z> listR1 = e0Var.R1();
                if (listR1 != null) {
                    for (z zVar : listR1) {
                        if (zVar != null) {
                            zzM(sbC, 2);
                            sbC.append("event {\n");
                            zzS(sbC, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzicVar.zzl().zza(zVar.s()));
                            if (zVar.t()) {
                                zzS(sbC, 2, "timestamp_millis", Long.valueOf(zVar.u()));
                            }
                            if (zVar.v()) {
                                zzS(sbC, 2, "previous_timestamp_millis", Long.valueOf(zVar.w()));
                            }
                            if (zVar.x()) {
                                zzS(sbC, 2, "count", Integer.valueOf(zVar.y()));
                            }
                            if (zVar.q() != 0) {
                                zzK(sbC, 2, zVar.p());
                            }
                            zzM(sbC, 2);
                            sbC.append("}\n");
                        }
                    }
                }
                zzM(sbC, 1);
                sbC.append("}\n");
            }
        }
        sbC.append("} // End-of-batch\n");
        return sbC.toString();
    }

    public final String zzj(b bVar) {
        if (bVar == null) {
            return Ssh2PublicKeyAlgorithmName.NULL;
        }
        StringBuilder sbC = bl4.C("\nevent_filter {\n");
        if (bVar.p()) {
            zzS(sbC, 0, "filter_id", Integer.valueOf(bVar.q()));
        }
        zzS(sbC, 0, "event_name", this.zzu.zzl().zza(bVar.r()));
        String strZzO = zzO(bVar.x(), bVar.y(), bVar.A());
        if (!strZzO.isEmpty()) {
            zzS(sbC, 0, "filter_type", strZzO);
        }
        if (bVar.v()) {
            zzT(sbC, 1, "event_count_filter", bVar.w());
        }
        if (bVar.t() > 0) {
            sbC.append("  filters {\n");
            Iterator it = bVar.s().iterator();
            while (it.hasNext()) {
                zzL(sbC, 2, (c) it.next());
            }
        }
        zzM(sbC, 1);
        sbC.append("}\n}\n");
        return sbC.toString();
    }

    public final String zzk(e eVar) {
        if (eVar == null) {
            return Ssh2PublicKeyAlgorithmName.NULL;
        }
        StringBuilder sbC = bl4.C("\nproperty_filter {\n");
        if (eVar.p()) {
            zzS(sbC, 0, "filter_id", Integer.valueOf(eVar.q()));
        }
        zzS(sbC, 0, "property_name", this.zzu.zzl().zzc(eVar.r()));
        String strZzO = zzO(eVar.t(), eVar.u(), eVar.w());
        if (!strZzO.isEmpty()) {
            zzS(sbC, 0, "filter_type", strZzO);
        }
        zzL(sbC, 1, eVar.s());
        sbC.append("}\n");
        return sbC.toString();
    }

    public final Parcelable zzl(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (SafeParcelReader$ParseException unused) {
                this.zzu.zzaV().zzb().zza("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final List zzq(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzu.zzaV().zze().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzu.zzaV().zze().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean zzs(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((eq) this.zzu.zzaZ()).getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long zzt(byte[] bArr) {
        rq4.n(bArr);
        zzic zzicVar = this.zzu;
        zzicVar.zzk().zzg();
        MessageDigest messageDigestZzO = zzpp.zzO();
        if (messageDigestZzO != null) {
            return zzpp.zzP(messageDigestZzO.digest(bArr));
        }
        t61.u(zzicVar, "Failed to get MD5");
        return 0L;
    }

    public final long zzu(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzt(str.getBytes(Charset.forName("UTF-8")));
    }

    public final byte[] zzv(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzu.zzaV().zzb().zzb("Failed to gzip content", e);
            throw e;
        }
    }

    public final Map zzz(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzz((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzz((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzz((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }
}
