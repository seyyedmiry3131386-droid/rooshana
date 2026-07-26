package io.sentry.android.core.internal.tombstone;

import com.abovevacant.epitaph.core.Architecture;
import com.abovevacant.epitaph.core.MemoryError$Tool;
import com.abovevacant.epitaph.core.MemoryError$Type;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.aj0;
import defpackage.av;
import defpackage.c50;
import defpackage.c77;
import defpackage.cv;
import defpackage.e39;
import defpackage.gv;
import defpackage.hg0;
import defpackage.jt4;
import defpackage.mn8;
import defpackage.ql3;
import defpackage.rl3;
import defpackage.x27;
import io.sentry.SentryLevel;
import io.sentry.c2;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SentryStackTrace$InstructionAddressAdjustment;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.protocol.f;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.u;
import io.sentry.protocol.z;
import io.sentry.t;
import io.sentry.w4;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {
    public final InputStream a;
    public final List b;
    public final List c;
    public final String d;
    public final HashMap e;

    public a(InputStream inputStream, List list, List list2, String str) {
        HashMap map = new HashMap();
        this.e = map;
        this.a = inputStream;
        this.b = list;
        this.c = list2;
        this.d = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    public final w4 b() throws IOException {
        DebugImage debugImageI;
        DebugImage debugImageI2;
        e39 e39Var;
        ArrayList arrayList;
        HashMap map;
        int i;
        int i2;
        ArrayList arrayList2;
        HashMap map2;
        e39 e39Var2;
        HashMap map3;
        e39 e39Var3;
        e39 e39Var4;
        e39 e39Var5;
        e39 e39Var6;
        e39 e39Var7;
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new IOException("No InputStream provided; use parse(Tombstone) instead.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
        }
        e39 e39Var8 = new e39(byteArrayOutputStream.toByteArray());
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        String str = "";
        int i4 = 0;
        int i5 = 0;
        String strF = "";
        aj0 aj0Var = null;
        while (true) {
            int iG = e39Var8.g();
            if (iG == 0) {
                String str2 = str;
                int i6 = i5;
                List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                DesugarCollections.unmodifiableList(arrayList4);
                DesugarCollections.unmodifiableList(arrayList5);
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map4);
                DesugarCollections.unmodifiableMap(map5);
                List<jt4> listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList6);
                DesugarCollections.unmodifiableList(arrayList7);
                DesugarCollections.unmodifiableList(arrayList8);
                w4 w4Var = new w4();
                w4Var.u = SentryLevel.FATAL;
                w4Var.h = "native";
                o oVar = new o();
                StringBuilder sb = new StringBuilder();
                Iterator it = listUnmodifiableList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) " ");
                        }
                    }
                }
                String string = sb.toString();
                if (aj0Var != null) {
                    Locale locale = Locale.ROOT;
                    String strConcat = !strF.isEmpty() ? strF.concat(": ") : str2;
                    oVar.a = strConcat + "Fatal signal " + ((String) aj0Var.d) + " (" + aj0Var.b + "), " + ((String) aj0Var.e) + " (" + aj0Var.c + "), pid = " + i4 + " (" + string + ")";
                } else {
                    Locale locale2 = Locale.ROOT;
                    oVar.a = "Fatal exit pid = " + i4 + " (" + string + ")";
                }
                w4Var.q = oVar;
                ArrayList arrayList9 = new ArrayList();
                hg0 hg0Var = null;
                for (jt4 jt4Var : listUnmodifiableList2) {
                    boolean z = jt4Var.d;
                    String str3 = jt4Var.f;
                    String str4 = jt4Var.e;
                    long j = jt4Var.b;
                    if (z && !str4.isEmpty() && !str4.startsWith("/dev/")) {
                        boolean zIsEmpty = str3.isEmpty();
                        boolean z2 = jt4Var.c == 0;
                        if (zIsEmpty || !z2) {
                            if (hg0Var != null && str4.equals((String) hg0Var.c)) {
                                hg0Var.b = j;
                            }
                        } else if (hg0Var == null || !str4.equals((String) hg0Var.c)) {
                            if (hg0Var != null && (debugImageI2 = hg0Var.i()) != null) {
                                arrayList9.add(debugImageI2);
                            }
                            hg0 hg0Var2 = new hg0();
                            hg0Var2.c = str4;
                            hg0Var2.d = str3;
                            hg0Var2.a = jt4Var.a;
                            hg0Var2.b = j;
                            hg0Var = hg0Var2;
                        } else {
                            hg0Var.b = j;
                        }
                    }
                }
                if (hg0Var != null && (debugImageI = hg0Var.i()) != null) {
                    arrayList9.add(debugImageI);
                }
                f fVar = new f();
                fVar.b = new ArrayList(arrayList9);
                w4Var.n = fVar;
                u uVar = new u();
                if (aj0Var != null) {
                    String str5 = (String) aj0Var.d;
                    uVar.a = str5;
                    uVar.b = (String) this.e.get(str5);
                    n nVar = new n();
                    nVar.a = NativeExceptionMechanism.TOMBSTONE.getValue();
                    nVar.d = Boolean.FALSE;
                    nVar.g = Boolean.TRUE;
                    HashMap map6 = new HashMap();
                    map6.put("number", Integer.valueOf(aj0Var.b));
                    map6.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) aj0Var.d);
                    map6.put("code", Integer.valueOf(aj0Var.c));
                    map6.put("code_name", (String) aj0Var.e);
                    nVar.e = new HashMap(map6);
                    uVar.f = nVar;
                }
                uVar.d = Long.valueOf(i6);
                ArrayList arrayList10 = new ArrayList(1);
                arrayList10.add(uVar);
                w4Var.t = new c2(arrayList10);
                ArrayList arrayListD = w4Var.d();
                Objects.requireNonNull(arrayListD);
                u uVar2 = (u) arrayListD.get(0);
                ArrayList arrayList11 = new ArrayList();
                Iterator it2 = mapUnmodifiableMap.entrySet().iterator();
                while (it2.hasNext()) {
                    mn8 mn8Var = (mn8) ((Map.Entry) it2.next()).getValue();
                    c0 c0Var = new c0();
                    c0Var.a = Long.valueOf(((Integer) r5.getKey()).intValue());
                    c0Var.c = mn8Var.b;
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it3 = mn8Var.d.iterator();
                    while (it3.hasNext()) {
                        c50 c50Var = (c50) it3.next();
                        String str6 = c50Var.c;
                        String str7 = c50Var.b;
                        if (!str6.endsWith("libart.so") && (!str6.startsWith("<anonymous") || !str7.isEmpty())) {
                            z zVar = new z();
                            zVar.l = str6;
                            zVar.e = str7;
                            Iterator it4 = it3;
                            Iterator it5 = it2;
                            zVar.q = String.format("0x%x", Long.valueOf(c50Var.a));
                            Boolean boolD = str7.isEmpty() ? Boolean.FALSE : t.d(str7, this.b, this.c);
                            String str8 = this.d;
                            zVar.k = Boolean.valueOf((boolD != null && boolD.booleanValue()) || (str8 != null && str6.startsWith(str8)));
                            arrayList12.add(0, zVar);
                            it3 = it4;
                            it2 = it5;
                        }
                    }
                    Iterator it6 = it2;
                    a0 a0Var = new a0();
                    a0Var.a = arrayList12;
                    a0Var.d = SentryStackTrace$InstructionAddressAdjustment.NONE;
                    HashMap map7 = new HashMap();
                    for (x27 x27Var : mn8Var.c) {
                        map7.put(x27Var.a, String.format("0x%x", Long.valueOf(x27Var.b)));
                    }
                    a0Var.b = map7;
                    c0Var.i = a0Var;
                    if (i6 == mn8Var.a) {
                        c0Var.e = Boolean.TRUE;
                        uVar2.e = a0Var;
                    }
                    arrayList11.add(c0Var);
                    it2 = it6;
                }
                w4Var.s = new c2(arrayList11);
                return w4Var;
            }
            int i7 = iG >>> 3;
            int i8 = iG & 7;
            String str9 = str;
            switch (i7) {
                case 1:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    i = i5;
                    e39.b(i7, 0, i8);
                    int i9 = (int) e39Var.i();
                    Architecture[] architectureArrValues = Architecture.values();
                    int length = architectureArrValues.length;
                    for (int i10 = 0; i10 < length && architectureArrValues[i10].a != i9; i10++) {
                    }
                    i5 = i;
                    break;
                case 2:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    e39.b(i7, 2, i8);
                    e39Var.f();
                    break;
                case 3:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    e39.b(i7, 2, i8);
                    e39Var.f();
                    break;
                case 4:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    e39.b(i7, 2, i8);
                    e39Var.f();
                    break;
                case 5:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    i = i5;
                    e39.b(i7, 0, i8);
                    i4 = (int) e39Var.i();
                    i5 = i;
                    break;
                case 6:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    e39.b(i7, 0, i8);
                    i5 = (int) e39Var.i();
                    break;
                case 7:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    i = i5;
                    e39.b(i7, 0, i8);
                    e39Var.i();
                    i5 = i;
                    break;
                case 8:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    e39.b(i7, 2, i8);
                    e39Var.f();
                    break;
                case 9:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    i = i5;
                    e39.b(i7, 2, i8);
                    arrayList3.add(e39Var.f());
                    i5 = i;
                    break;
                case 10:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    int i11 = i5;
                    e39.b(i7, 2, i8);
                    e39 e39VarE = e39Var.e();
                    String strF2 = str9;
                    String strF3 = strF2;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int iG2 = e39VarE.g();
                        if (iG2 == 0) {
                            i5 = i11;
                            aj0Var = new aj0(i12, i13, 9, strF2, strF3);
                            break;
                        } else {
                            int i14 = iG2 >>> 3;
                            int i15 = iG2 & 7;
                            switch (i14) {
                                case 1:
                                    e39.b(i14, 0, i15);
                                    i12 = (int) e39VarE.i();
                                    break;
                                case 2:
                                    e39.b(i14, 2, i15);
                                    strF2 = e39VarE.f();
                                    break;
                                case 3:
                                    e39.b(i14, 0, i15);
                                    i13 = (int) e39VarE.i();
                                    break;
                                case 4:
                                    e39.b(i14, 2, i15);
                                    strF3 = e39VarE.f();
                                    break;
                                case 5:
                                    e39.b(i14, 0, i15);
                                    e39VarE.c();
                                    break;
                                case 6:
                                    e39.b(i14, 0, i15);
                                    e39VarE.i();
                                    break;
                                case 7:
                                    e39.b(i14, 0, i15);
                                    e39VarE.i();
                                    break;
                                case 8:
                                    e39.b(i14, 0, i15);
                                    e39VarE.c();
                                    break;
                                case 9:
                                    e39.b(i14, 0, i15);
                                    e39VarE.i();
                                    break;
                                case 10:
                                    e39.b(i14, 2, i15);
                                    c77.b(e39VarE.e());
                                    break;
                                default:
                                    e39VarE.j(i15);
                                    break;
                            }
                        }
                    }
                    break;
                case 11:
                case 12:
                case 13:
                default:
                    e39Var8.j(i8);
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    i = i5;
                    i5 = i;
                    break;
                case 14:
                    e39Var = e39Var8;
                    arrayList = arrayList4;
                    map = map4;
                    i = i5;
                    e39.b(i7, 2, i8);
                    strF = e39Var.f();
                    i5 = i;
                    break;
                case 15:
                    e39Var = e39Var8;
                    int i16 = 2;
                    i = i5;
                    e39.b(i7, 2, i8);
                    e39 e39VarE2 = e39Var.e();
                    while (true) {
                        int iG3 = e39VarE2.g();
                        if (iG3 == 0) {
                            arrayList = arrayList4;
                            map = map4;
                            arrayList5.add(new cv(7));
                            i5 = i;
                        } else {
                            int i17 = iG3 >>> 3;
                            int i18 = iG3 & 7;
                            if (i17 == 1) {
                                i2 = i16;
                                arrayList2 = arrayList4;
                                map2 = map4;
                                e39Var2 = e39VarE2;
                                e39.b(i17, i2, i18);
                                e39Var2.f();
                            } else if (i17 != i16) {
                                e39VarE2.j(i18);
                                i2 = i16;
                                arrayList2 = arrayList4;
                                map2 = map4;
                                e39Var2 = e39VarE2;
                            } else {
                                e39.b(i17, i16, i18);
                                e39 e39VarE3 = e39VarE2.e();
                                while (true) {
                                    int iG4 = e39VarE3.g();
                                    if (iG4 != 0) {
                                        int i19 = iG4 >>> 3;
                                        int i20 = iG4 & 7;
                                        ArrayList arrayList13 = arrayList4;
                                        if (i19 == 1) {
                                            map3 = map4;
                                            e39Var3 = e39VarE2;
                                            e39.b(i19, 0, i20);
                                            int i21 = (int) e39VarE3.i();
                                            MemoryError$Tool[] memoryError$ToolArrValues = MemoryError$Tool.values();
                                            int length2 = memoryError$ToolArrValues.length;
                                            for (int i22 = 0; i22 < length2 && memoryError$ToolArrValues[i22].a != i21; i22++) {
                                            }
                                        } else if (i19 != i16) {
                                            if (i19 != 3) {
                                                e39VarE3.j(i20);
                                                map3 = map4;
                                            } else {
                                                e39.b(i19, i16, i20);
                                                e39 e39VarE4 = e39VarE3.e();
                                                ArrayList arrayList14 = new ArrayList();
                                                ArrayList arrayList15 = new ArrayList();
                                                while (true) {
                                                    int iG5 = e39VarE4.g();
                                                    if (iG5 != 0) {
                                                        int i23 = iG5 >>> 3;
                                                        HashMap map8 = map4;
                                                        int i24 = iG5 & 7;
                                                        switch (i23) {
                                                            case 1:
                                                                e39Var4 = e39VarE4;
                                                                e39.b(i23, 0, i24);
                                                                e39Var4.i();
                                                                break;
                                                            case 2:
                                                                e39Var4 = e39VarE4;
                                                                e39.b(i23, 0, i24);
                                                                e39Var4.i();
                                                                break;
                                                            case 3:
                                                                e39Var4 = e39VarE4;
                                                                e39.b(i23, 0, i24);
                                                                e39Var4.i();
                                                                break;
                                                            case 4:
                                                                e39Var4 = e39VarE4;
                                                                e39.b(i23, 2, i24);
                                                                arrayList14.add(c77.a(e39Var4.e()));
                                                                break;
                                                            case 5:
                                                                e39Var4 = e39VarE4;
                                                                e39.b(i23, 0, i24);
                                                                e39Var4.i();
                                                                break;
                                                            case 6:
                                                                e39Var4 = e39VarE4;
                                                                e39.b(i23, 2, i24);
                                                                arrayList15.add(c77.a(e39Var4.e()));
                                                                break;
                                                            default:
                                                                e39VarE4.j(i24);
                                                                e39Var4 = e39VarE4;
                                                                break;
                                                        }
                                                        e39VarE4 = e39Var4;
                                                        map4 = map8;
                                                    } else {
                                                        map3 = map4;
                                                        DesugarCollections.unmodifiableList(arrayList14);
                                                        DesugarCollections.unmodifiableList(arrayList15);
                                                    }
                                                }
                                            }
                                            e39Var3 = e39VarE2;
                                        } else {
                                            map3 = map4;
                                            e39.b(i19, 0, i20);
                                            e39Var3 = e39VarE2;
                                            int i25 = (int) e39VarE3.i();
                                            MemoryError$Type[] memoryError$TypeArrValues = MemoryError$Type.values();
                                            int length3 = memoryError$TypeArrValues.length;
                                            for (int i26 = 0; i26 < length3 && memoryError$TypeArrValues[i26].a != i25; i26++) {
                                            }
                                        }
                                        e39VarE2 = e39Var3;
                                        arrayList4 = arrayList13;
                                        map4 = map3;
                                        i16 = 2;
                                    } else {
                                        arrayList2 = arrayList4;
                                        map2 = map4;
                                        e39Var2 = e39VarE2;
                                        i2 = 2;
                                    }
                                }
                            }
                            e39VarE2 = e39Var2;
                            i16 = i2;
                            arrayList4 = arrayList2;
                            map4 = map2;
                        }
                        break;
                    }
                    break;
                case 16:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 2, i8);
                    c77.c(e39Var.e(), map4);
                    arrayList = arrayList4;
                    map = map4;
                    i5 = i;
                    break;
                case 17:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 2, i8);
                    e39 e39VarE5 = e39Var.e();
                    String strF4 = str9;
                    String strF5 = strF4;
                    long jI = 0;
                    long jI2 = 0;
                    long jI3 = 0;
                    boolean zC = false;
                    while (true) {
                        int iG6 = e39VarE5.g();
                        if (iG6 == 0) {
                            arrayList6.add(new jt4(jI, jI2, jI3, zC, strF4, strF5));
                            arrayList = arrayList4;
                            map = map4;
                            i5 = i;
                            break;
                        } else {
                            int i27 = iG6 >>> 3;
                            int i28 = iG6 & 7;
                            switch (i27) {
                                case 1:
                                    e39.b(i27, 0, i28);
                                    jI = e39VarE5.i();
                                    break;
                                case 2:
                                    e39.b(i27, 0, i28);
                                    jI2 = e39VarE5.i();
                                    break;
                                case 3:
                                    e39.b(i27, 0, i28);
                                    jI3 = e39VarE5.i();
                                    break;
                                case 4:
                                    e39.b(i27, 0, i28);
                                    zC = e39VarE5.c();
                                    break;
                                case 5:
                                    e39.b(i27, 0, i28);
                                    e39VarE5.c();
                                    break;
                                case 6:
                                    e39.b(i27, 0, i28);
                                    e39VarE5.c();
                                    break;
                                case 7:
                                    e39.b(i27, 2, i28);
                                    strF4 = e39VarE5.f();
                                    break;
                                case 8:
                                    e39.b(i27, 2, i28);
                                    strF5 = e39VarE5.f();
                                    break;
                                case 9:
                                    e39.b(i27, 0, i28);
                                    e39VarE5.i();
                                    break;
                                default:
                                    e39VarE5.j(i28);
                                    break;
                            }
                        }
                    }
                    break;
                case 18:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 2, i8);
                    e39 e39VarE6 = e39Var.e();
                    ArrayList arrayList16 = new ArrayList();
                    while (true) {
                        int iG7 = e39VarE6.g();
                        if (iG7 == 0) {
                            ql3 ql3Var = new ql3();
                            DesugarCollections.unmodifiableList(arrayList16);
                            arrayList7.add(ql3Var);
                            arrayList = arrayList4;
                            map = map4;
                            i5 = i;
                        } else {
                            int i29 = iG7 >>> 3;
                            int i30 = iG7 & 7;
                            if (i29 == 1) {
                                e39Var5 = e39VarE6;
                                e39.b(i29, 2, i30);
                                e39Var5.f();
                            } else if (i29 != 2) {
                                e39VarE6.j(i30);
                                e39Var5 = e39VarE6;
                            } else {
                                e39.b(i29, 2, i30);
                                e39 e39VarE7 = e39VarE6.e();
                                while (true) {
                                    int iG8 = e39VarE7.g();
                                    if (iG8 != 0) {
                                        int i31 = iG8 >>> 3;
                                        int i32 = iG8 & 7;
                                        switch (i31) {
                                            case 1:
                                                e39Var6 = e39VarE6;
                                                e39.b(i31, 2, i32);
                                                e39VarE7.f();
                                                break;
                                            case 2:
                                                e39Var6 = e39VarE6;
                                                e39.b(i31, 0, i32);
                                                e39VarE7.i();
                                                break;
                                            case 3:
                                                e39Var6 = e39VarE6;
                                                e39.b(i31, 0, i32);
                                                e39VarE7.i();
                                                break;
                                            case 4:
                                                e39Var6 = e39VarE6;
                                                e39.b(i31, 0, i32);
                                                e39VarE7.i();
                                                break;
                                            case 5:
                                                e39Var6 = e39VarE6;
                                                e39.b(i31, 2, i32);
                                                e39VarE7.f();
                                                break;
                                            case 6:
                                                e39Var6 = e39VarE6;
                                                e39.b(i31, 2, i32);
                                                e39VarE7.f();
                                                break;
                                            default:
                                                e39VarE7.j(i32);
                                                e39Var6 = e39VarE6;
                                                break;
                                        }
                                        e39VarE6 = e39Var6;
                                    } else {
                                        e39Var5 = e39VarE6;
                                        arrayList16.add(new rl3());
                                    }
                                }
                            }
                            e39VarE6 = e39Var5;
                        }
                        break;
                    }
                    break;
                case 19:
                    e39Var = e39Var8;
                    int i33 = 2;
                    i = i5;
                    e39.b(i7, 2, i8);
                    e39 e39VarE8 = e39Var.e();
                    while (true) {
                        int iG9 = e39VarE8.g();
                        if (iG9 == 0) {
                            arrayList8.add(new gv(19));
                            arrayList = arrayList4;
                            map = map4;
                            i5 = i;
                        } else {
                            int i34 = iG9 >>> 3;
                            int i35 = iG9 & 7;
                            if (i34 == 1) {
                                e39.b(i34, 0, i35);
                                e39VarE8.i();
                            } else if (i34 == i33) {
                                e39.b(i34, i33, i35);
                                e39VarE8.f();
                            } else if (i34 == 3) {
                                e39.b(i34, i33, i35);
                                e39VarE8.f();
                            } else if (i34 != 4) {
                                e39VarE8.j(i35);
                            } else {
                                e39.b(i34, 0, i35);
                                e39VarE8.i();
                            }
                            i33 = 2;
                        }
                        break;
                    }
                    break;
                case 20:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 0, i8);
                    e39Var.i();
                    arrayList = arrayList4;
                    map = map4;
                    i5 = i;
                    break;
                case 21:
                    e39Var = e39Var8;
                    int i36 = 2;
                    i = i5;
                    e39.b(i7, 2, i8);
                    e39 e39VarE9 = e39Var.e();
                    while (true) {
                        int iG10 = e39VarE9.g();
                        if (iG10 == 0) {
                            arrayList4.add(new av(10));
                            arrayList = arrayList4;
                            map = map4;
                            i5 = i;
                        } else {
                            int i37 = iG10 >>> 3;
                            int i38 = iG10 & 7;
                            if (i37 == 1) {
                                e39.b(i37, i36, i38);
                                e39VarE9.d();
                            } else if (i37 != i36) {
                                e39VarE9.j(i38);
                            } else {
                                e39.b(i37, i36, i38);
                                e39VarE9.d();
                            }
                            i36 = 2;
                        }
                        break;
                    }
                    break;
                case 22:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 0, i8);
                    e39Var.i();
                    arrayList = arrayList4;
                    map = map4;
                    i5 = i;
                    break;
                case 23:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 0, i8);
                    e39Var.c();
                    arrayList = arrayList4;
                    map = map4;
                    i5 = i;
                    break;
                case 24:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 0, i8);
                    int i39 = (int) e39Var.i();
                    Architecture[] architectureArrValues2 = Architecture.values();
                    int length4 = architectureArrValues2.length;
                    for (int i40 = 0; i40 < length4 && architectureArrValues2[i40].a != i39; i40++) {
                    }
                    arrayList = arrayList4;
                    map = map4;
                    i5 = i;
                    break;
                case 25:
                    e39Var = e39Var8;
                    i = i5;
                    e39.b(i7, 2, i8);
                    c77.c(e39Var.e(), map5);
                    arrayList = arrayList4;
                    map = map4;
                    i5 = i;
                    break;
                case 26:
                    e39.b(i7, 2, i8);
                    e39 e39VarE10 = e39Var8.e();
                    ArrayList arrayList17 = new ArrayList();
                    while (true) {
                        int iG11 = e39VarE10.g();
                        if (iG11 == 0) {
                            e39Var = e39Var8;
                            i = i5;
                            DesugarCollections.unmodifiableList(arrayList17);
                            arrayList = arrayList4;
                            map = map4;
                            i5 = i;
                        } else {
                            int i41 = iG11 >>> 3;
                            e39 e39Var9 = e39Var8;
                            int i42 = iG11 & 7;
                            int i43 = i5;
                            if (i41 == 1) {
                                e39Var7 = e39VarE10;
                                e39.b(i41, 0, i42);
                                e39Var7.i();
                            } else if (i41 != 2) {
                                e39VarE10.j(i42);
                                e39Var7 = e39VarE10;
                            } else {
                                e39.b(i41, 2, i42);
                                e39 e39VarE11 = e39VarE10.e();
                                while (true) {
                                    int iG12 = e39VarE11.g();
                                    if (iG12 != 0) {
                                        int i44 = iG12 >>> 3;
                                        int i45 = iG12 & 7;
                                        e39 e39Var10 = e39VarE10;
                                        if (i44 == 1) {
                                            e39.b(i44, 2, i45);
                                            c77.a(e39VarE11.e());
                                        } else if (i44 == 2) {
                                            e39.b(i44, 0, i45);
                                            e39VarE11.i();
                                        } else if (i44 != 3) {
                                            e39VarE11.j(i45);
                                        } else {
                                            e39.b(i44, 0, i45);
                                            e39VarE11.i();
                                        }
                                        e39VarE10 = e39Var10;
                                    } else {
                                        e39Var7 = e39VarE10;
                                        arrayList17.add(new rl3());
                                    }
                                }
                            }
                            e39VarE10 = e39Var7;
                            e39Var8 = e39Var9;
                            i5 = i43;
                        }
                        break;
                    }
                    break;
            }
            str = str9;
            e39Var8 = e39Var;
            arrayList4 = arrayList;
            map4 = map;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
