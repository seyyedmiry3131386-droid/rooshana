package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse$Status;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v24 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public v24() {
        long[] jArr = ce7.a;
        this.a = new rb5();
        sb5 sb5Var = de7.a;
        this.c = new sb5();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new s24(this);
    }

    public static int f(int[] iArr, w34 w34Var) {
        w34Var.getClass();
        int i = iArr[0] + w34Var.l;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public long a() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        dw1.x(arrayList.get(0));
        throw null;
    }

    public void b(d30 d30Var, int i) {
        long j;
        byte[] bArr;
        od8 od8Var;
        g20 g20Var;
        String str;
        g20 g20Var2;
        g20 g20Var3;
        tn0 tn0VarD;
        int i2;
        String str2;
        Integer numValueOf;
        String str3;
        go8 go8Var;
        final v24 v24Var = this;
        final d30 d30Var2 = d30Var;
        byte[] bArr2 = d30Var2.b;
        od8 od8Var2 = (od8) v24Var.f;
        bs8 bs8VarA = ((kv4) v24Var.b).a(d30Var2.a);
        od8 od8Var3 = od8Var2;
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            qb7 qb7Var = (qb7) od8Var3;
            if (!((Boolean) qb7Var.y(new nd8(v24Var) { // from class: e09
                public final /* synthetic */ v24 b;

                {
                    this.b = v24Var;
                }

                @Override // defpackage.nd8
                public final Object execute() {
                    Boolean bool;
                    switch (i3) {
                        case 0:
                            d30 d30Var3 = d30Var2;
                            qb7 qb7Var2 = (qb7) ((i42) this.b.c);
                            SQLiteDatabase sQLiteDatabaseB = qb7Var2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lD = qb7.d(sQLiteDatabaseB, d30Var3);
                                if (lD == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = qb7Var2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lD.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseB.endTransaction();
                            }
                        default:
                            qb7 qb7Var3 = (qb7) ((i42) this.b.c);
                            qb7Var3.getClass();
                            return (Iterable) qb7Var3.g(new ur4(qb7Var3, d30Var2, 16));
                    }
                }
            })).booleanValue()) {
                qb7Var.y(new vn4(jMax, v24Var, d30Var2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) qb7Var.y(new nd8(v24Var) { // from class: e09
                public final /* synthetic */ v24 b;

                {
                    this.b = v24Var;
                }

                @Override // defpackage.nd8
                public final Object execute() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            d30 d30Var3 = d30Var2;
                            qb7 qb7Var2 = (qb7) ((i42) this.b.c);
                            SQLiteDatabase sQLiteDatabaseB = qb7Var2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lD = qb7.d(sQLiteDatabaseB, d30Var3);
                                if (lD == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = qb7Var2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lD.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseB.endTransaction();
                            }
                        default:
                            qb7 qb7Var3 = (qb7) ((i42) this.b.c);
                            qb7Var3.getClass();
                            return (Iterable) qb7Var3.g(new ur4(qb7Var3, d30Var2, 16));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            BackendResponse$Status backendResponse$Status = BackendResponse$Status.a;
            BackendResponse$Status backendResponse$Status2 = BackendResponse$Status.b;
            BackendResponse$Status backendResponse$Status3 = BackendResponse$Status.c;
            BackendResponse$Status backendResponse$Status4 = BackendResponse$Status.d;
            if (bs8VarA == null) {
                wn5.x("Uploader", "Unknown backend for %s, deleting event batch for it...", d30Var2);
                g20Var2 = new g20(backendResponse$Status3, -1L);
                j = jMax;
                bArr = bArr2;
                od8Var = od8Var3;
            } else {
                byte[] bArr3 = bArr2;
                ArrayList<l20> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((v20) it.next()).c);
                }
                String str4 = "proto";
                if (bArr3 != null) {
                    jt0 jt0Var = (jt0) v24Var.i;
                    Objects.requireNonNull(jt0Var);
                    j = jMax;
                    lt0 lt0Var = (lt0) qb7Var.y(new ts5(28, jt0Var));
                    on onVar = new on();
                    onVar.f = new HashMap();
                    onVar.d = Long.valueOf(((wt0) v24Var.g).a());
                    onVar.e = Long.valueOf(((wt0) v24Var.h).a());
                    onVar.a = "GDT_CLIENT_METRICS";
                    u12 u12Var = new u12("proto");
                    lt0Var.getClass();
                    sk6 sk6Var = dn6.a;
                    sk6Var.getClass();
                    bArr = bArr3;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        sk6Var.r(lt0Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    onVar.c = new o12(u12Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((un0) bs8VarA).a(onVar.f()));
                } else {
                    j = jMax;
                    bArr = bArr3;
                }
                un0 un0Var = (un0) bs8VarA;
                HashMap map = new HashMap();
                for (l20 l20Var : arrayList) {
                    String str5 = l20Var.a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(l20Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(l20Var);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    l20 l20Var2 = (l20) ((List) entry.getValue()).get(0);
                    QosTier qosTier = QosTier.a;
                    long jA = un0Var.f.a();
                    long jA2 = un0Var.e.a();
                    i20 i20Var = new i20(new f20(Integer.valueOf(l20Var2.b("sdk-version")), l20Var2.a("model"), l20Var2.a("hardware"), l20Var2.a("device"), l20Var2.a("product"), l20Var2.a("os-uild"), l20Var2.a("manufacturer"), l20Var2.a("fingerprint"), l20Var2.a("locale"), l20Var2.a("country"), l20Var2.a("mcc_mnc"), l20Var2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = ((List) entry.getValue()).iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = it2;
                        l20 l20Var3 = (l20) it3.next();
                        Iterator it5 = it3;
                        o12 o12Var = l20Var3.c;
                        i20 i20Var2 = i20Var;
                        u12 u12Var2 = o12Var.a;
                        byte[] bArr4 = o12Var.b;
                        od8 od8Var4 = od8Var3;
                        if (u12Var2.equals(new u12(str4))) {
                            go8Var = new go8();
                            go8Var.d = bArr4;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (u12Var2.equals(new u12("json"))) {
                                String str6 = new String(bArr4, Charset.forName("UTF-8"));
                                go8Var = new go8();
                                go8Var.e = str6;
                            } else {
                                String strO = wn5.O("CctTransportBackend");
                                if (Log.isLoggable(strO, 5)) {
                                    t0.m(strO, "Received event of unsupported encoding " + u12Var2 + ". Skipping...");
                                }
                                it3 = it5;
                                i20Var = i20Var2;
                                it2 = it4;
                                od8Var3 = od8Var4;
                                str4 = str3;
                            }
                        }
                        go8Var.a = Long.valueOf(l20Var3.d);
                        go8Var.c = Long.valueOf(l20Var3.e);
                        String str7 = (String) l20Var3.f.get("tz-offset");
                        go8Var.f = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        go8Var.g = new u20((NetworkConnectionInfo$NetworkType) NetworkConnectionInfo$NetworkType.a.get(l20Var3.b("net-type")), (NetworkConnectionInfo$MobileSubtype) NetworkConnectionInfo$MobileSubtype.a.get(l20Var3.b("mobile-subtype")));
                        Integer num = l20Var3.b;
                        if (num != null) {
                            go8Var.b = num;
                        }
                        String strI = ((Long) go8Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) go8Var.c) == null) {
                            strI = strI.concat(" eventUptimeMs");
                        }
                        if (((Long) go8Var.f) == null) {
                            strI = t61.i(strI, " timezoneOffsetSeconds");
                        }
                        if (!strI.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strI));
                        }
                        arrayList4.add(new r20(((Long) go8Var.a).longValue(), (Integer) go8Var.b, ((Long) go8Var.c).longValue(), (byte[]) go8Var.d, (String) go8Var.e, ((Long) go8Var.f).longValue(), (u20) go8Var.g));
                        it3 = it5;
                        i20Var = i20Var2;
                        it2 = it4;
                        od8Var3 = od8Var4;
                        str4 = str3;
                    }
                    arrayList3.add(new s20(jA, jA2, i20Var, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                od8Var = od8Var3;
                h20 h20Var = new h20(arrayList3);
                URL urlB = un0Var.d;
                if (bArr != null) {
                    try {
                        yj0 yj0VarA = yj0.a(bArr);
                        str = yj0VarA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = yj0VarA.a;
                        if (str8 != null) {
                            urlB = un0.b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        g20Var = new g20(backendResponse$Status3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    wv8 wv8Var = new wv8(urlB, h20Var, str);
                    v4 v4Var = new v4(11, un0Var);
                    int i5 = 5;
                    do {
                        tn0VarD = v4Var.d(wv8Var);
                        URL url = (URL) tn0VarD.c;
                        if (url != null) {
                            wn5.x("CctTransportBackend", "Following redirect to: %s", url);
                            wv8Var = new wv8(url, (h20) wv8Var.d, (String) wv8Var.c);
                        } else {
                            wv8Var = null;
                        }
                        if (wv8Var == null) {
                            break;
                        } else {
                            i5--;
                        }
                    } while (i5 >= 1);
                    i2 = tn0VarD.a;
                } catch (IOException e) {
                    e = e;
                }
                if (i2 == 200) {
                    g20Var2 = new g20(backendResponse$Status, tn0VarD.b);
                } else {
                    if (i2 >= 500 || i2 == 404) {
                        g20Var3 = new g20(backendResponse$Status2, -1L);
                    } else if (i2 == 400) {
                        try {
                            g20Var3 = new g20(backendResponse$Status4, -1L);
                        } catch (IOException e2) {
                            e = e2;
                            wn5.G("CctTransportBackend", "Could not make request to the backend", e);
                            g20Var3 = new g20(backendResponse$Status2, -1L);
                        }
                    } else {
                        g20Var = new g20(backendResponse$Status3, -1L);
                        g20Var2 = g20Var;
                    }
                    g20Var2 = g20Var3;
                }
            }
            BackendResponse$Status backendResponse$Status5 = g20Var2.a;
            if (backendResponse$Status5 == backendResponse$Status2) {
                qb7Var.y(new wi1(this, iterable, d30Var, j));
                ((pa2) this.d).y(d30Var, i + 1, true);
                return;
            }
            v24Var = this;
            d30Var2 = d30Var;
            jMax = j;
            qb7Var.y(new ur4(v24Var, iterable, 17));
            if (backendResponse$Status5 == backendResponse$Status) {
                jMax = Math.max(jMax, g20Var2.b);
                if (bArr != null) {
                    qb7Var.y(new f09(0, v24Var));
                }
            } else if (backendResponse$Status5 == backendResponse$Status4) {
                HashMap map2 = new HashMap();
                Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    String str9 = ((v20) it6.next()).c.a;
                    if (map2.containsKey(str9)) {
                        map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                    } else {
                        map2.put(str9, 1);
                    }
                }
                qb7Var.y(new ur4(v24Var, map2, 18));
            }
            bArr2 = bArr;
            od8Var3 = od8Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r30, int r31, java.util.ArrayList r32, androidx.compose.foundation.lazy.layout.e r33, defpackage.kc9 r34, boolean r35, boolean r36, int r37, int r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v24.c(int, int, java.util.ArrayList, androidx.compose.foundation.lazy.layout.e, kc9, boolean, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.a
            rb5 r0 = (defpackage.rb5) r0
            boolean r1 = r0.j()
            if (r1 == 0) goto L52
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4f
            r4 = 0
            r5 = r4
        L15:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4a
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2f:
            if (r10 >= r8) goto L48
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3e
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2f
        L3e:
            int r0 = r5 << 3
            int r0 = r0 + r10
            r0 = r1[r0]
            defpackage.dw1.x(r0)
            r0 = 0
            throw r0
        L48:
            if (r8 != r9) goto L4f
        L4a:
            if (r5 == r3) goto L4f
            int r5 = r5 + 1
            goto L15
        L4f:
            r0.a()
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v24.d():void");
    }

    public void e(w34 w34Var, boolean z) {
        Object objG = ((rb5) this.a).g(w34Var.g);
        js3.m(objG);
        dw1.x(objG);
        throw null;
    }
}
