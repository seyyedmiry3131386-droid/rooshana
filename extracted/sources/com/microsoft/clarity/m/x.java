package com.microsoft.clarity.m;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.microsoft.clarity.g.j0;
import com.microsoft.clarity.g.k0;
import com.microsoft.clarity.models.display.typefaces.FontCoordinate;
import com.microsoft.clarity.models.display.typefaces.FontStyle;
import com.microsoft.clarity.models.display.typefaces.Typeface;
import defpackage.br9;
import defpackage.js3;
import defpackage.ow8;
import defpackage.uq3;
import defpackage.wu0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements b {
    public static final List c;
    public static final Set d;
    public final k0 a;
    public final com.microsoft.clarity.p.e b;

    static {
        List listC = br9.C(new uq3(48, 57, 1), new uq3(1632, 1641, 1), new uq3(1776, 1785, 1), new uq3(1984, 1993, 1), new uq3(2406, 2415, 1), new uq3(2534, 2543, 1), new uq3(2662, 2671, 1), new uq3(2790, 2799, 1), new uq3(2918, 2927, 1), new uq3(3046, 3055, 1), new uq3(3174, 3183, 1), new uq3(3302, 3311, 1), new uq3(3430, 3439, 1), new uq3(3558, 3567, 1), new uq3(3664, 3673, 1), new uq3(3792, 3801, 1), new uq3(3872, 3881, 1), new uq3(4160, 4169, 1), new uq3(4240, 4249, 1), new uq3(6112, 6121, 1), new uq3(6160, 6169, 1), new uq3(6470, 6479, 1), new uq3(6608, 6617, 1), new uq3(6784, 6793, 1), new uq3(6800, 6809, 1), new uq3(6992, 7001, 1), new uq3(7088, 7097, 1), new uq3(7232, 7241, 1), new uq3(7248, 7257, 1), new uq3(42528, 42537, 1), new uq3(43216, 43225, 1), new uq3(43264, 43273, 1), new uq3(43472, 43481, 1), new uq3(43504, 43513, 1), new uq3(43600, 43609, 1), new uq3(44016, 44025, 1), new uq3(65296, 65305, 1), new uq3(66720, 66729, 1), new uq3(68912, 68921, 1), new uq3(69734, 69743, 1), new uq3(69872, 69881, 1), new uq3(69942, 69951, 1), new uq3(70096, 70105, 1), new uq3(70384, 70393, 1), new uq3(70736, 70745, 1), new uq3(70864, 70873, 1), new uq3(71248, 71257, 1), new uq3(71360, 71369, 1), new uq3(71472, 71481, 1), new uq3(71904, 71913, 1), new uq3(72016, 72025, 1), new uq3(72784, 72793, 1), new uq3(73040, 73049, 1), new uq3(73120, 73129, 1), new uq3(73552, 73561, 1), new uq3(92768, 92777, 1), new uq3(92864, 92873, 1), new uq3(93008, 93017, 1), new uq3(120782, 120791, 1), new uq3(120792, 120801, 1), new uq3(120802, 120811, 1), new uq3(120812, 120821, 1), new uq3(120822, 120831, 1), new uq3(123200, 123209, 1), new uq3(123632, 123641, 1), new uq3(124144, 124153, 1), new uq3(125264, 125273, 1), new uq3(130032, 130041, 1));
        c = listC;
        d = kotlin.collections.a.T0(kotlin.collections.a.A0(8226, kotlin.collections.a.A0(64, kotlin.collections.a.A0(32, wu0.W(listC)))));
    }

    public x(k0 k0Var, com.microsoft.clarity.p.e eVar) {
        js3.p(k0Var, "typefaceCollection");
        js3.p(eVar, "typefaceStore");
        this.a = k0Var;
        this.b = eVar;
    }

    @Override // com.microsoft.clarity.m.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Typeface a(d dVar) throws IOException {
        Float f;
        j0 j0VarA;
        Float f2;
        js3.p(dVar, "buffer");
        int iG = dVar.g();
        int i = (iG >>> 16) & 65535;
        int i2 = 255;
        int i3 = (iG >>> 8) & 255;
        int i4 = iG & 255;
        ow8 ow8Var = null;
        String strA = null;
        String strA2 = null;
        String strA3 = null;
        ow8 ow8Var2 = null;
        Float fValueOf = null;
        Float fValueOf2 = null;
        Float fValueOf3 = null;
        Float fValueOf4 = null;
        ArrayList arrayList = null;
        while (true) {
            int iG2 = dVar.g();
            if (iG2 == 1) {
                strA = dVar.a(dVar.g());
            } else if (iG2 == 4) {
                strA2 = dVar.a(dVar.g());
            } else if (iG2 == 6) {
                strA3 = dVar.a(dVar.g());
            } else if (iG2 != i2) {
                switch (iG2) {
                    case 16:
                        fValueOf = Float.valueOf(dVar.b());
                        break;
                    case 17:
                        fValueOf2 = Float.valueOf(dVar.b());
                        break;
                    case 18:
                        fValueOf3 = Float.valueOf(dVar.b());
                        break;
                    case 19:
                        fValueOf4 = Float.valueOf(dVar.b());
                        break;
                    default:
                        int i5 = 0;
                        switch (iG2) {
                            case 248:
                                ow8Var2 = new ow8(dVar.g());
                                break;
                            case 249:
                                f2 = fValueOf;
                                int iG3 = dVar.g();
                                while (i5 < iG3) {
                                    dVar.g();
                                    dVar.c();
                                    i5++;
                                }
                                fValueOf = f2;
                                break;
                            case 250:
                                int iG4 = dVar.g();
                                ArrayList arrayList2 = new ArrayList();
                                while (i5 < iG4) {
                                    arrayList2.add(new FontCoordinate(dVar.c(), dVar.b()));
                                    i5++;
                                    iG4 = iG4;
                                    fValueOf = fValueOf;
                                }
                                arrayList = arrayList2;
                                break;
                            case 251:
                                int iG5 = dVar.g();
                                while (i5 < iG5) {
                                    dVar.d();
                                    i5++;
                                }
                                f2 = fValueOf;
                                fValueOf = f2;
                                break;
                            case 252:
                                dVar.g();
                                f2 = fValueOf;
                                fValueOf = f2;
                                break;
                            case 253:
                                ow8Var = new ow8(dVar.g());
                                break;
                            default:
                                f = fValueOf;
                                j0VarA = null;
                                break;
                        }
                        break;
                }
            } else {
                f = fValueOf;
                j0VarA = a(dVar, strA, strA3, strA2);
            }
            i2 = 255;
        }
        if (j0VarA != null) {
            k0 k0Var = this.a;
            if (!k0Var.a.containsKey(j0VarA.a)) {
                k0Var.a.put(j0VarA.a, j0VarA);
            }
        }
        return new Typeface(strA, strA2, strA3, new FontStyle(((long) i) & 4294967295L, ((long) i3) & 4294967295L, ((long) i4) & 4294967295L), ow8Var != null ? Long.valueOf(((long) ow8Var.a) & 4294967295L) : null, f, fValueOf2, fValueOf3, fValueOf4, ow8Var2 != null ? Long.valueOf(((long) ow8Var2.a) & 4294967295L) : null, arrayList, j0VarA != null ? j0VarA.a : null);
    }

    public static final void a(Set set, Set set2, Set set3, Ref$LongRef ref$LongRef, com.microsoft.clarity.d.i iVar) {
        com.microsoft.clarity.f.e eVar;
        js3.p(set, "$digitGlyphIds");
        js3.p(set2, "$spaceGlyphIds");
        js3.p(set3, "$atSignGlyphIds");
        js3.p(ref$LongRef, "$piiPlaceholderGlyphId");
        synchronized (iVar) {
            eVar = (com.microsoft.clarity.f.e) iVar.b.get("cmap");
            if (eVar != null && !eVar.e) {
                eVar.a(iVar);
            }
        }
        com.microsoft.clarity.f.b[] bVarArr = ((com.microsoft.clarity.f.c) eVar).f;
        js3.o(bVarArr, "ttf.cmap.cmaps");
        ArrayList<com.microsoft.clarity.f.b> arrayList = new ArrayList();
        for (com.microsoft.clarity.f.b bVar : bVarArr) {
            int i = bVar.a;
            if (i == 0 || i == 3) {
                arrayList.add(bVar);
            }
        }
        for (com.microsoft.clarity.f.b bVar2 : arrayList) {
            for (uq3 uq3Var : c) {
                int i2 = uq3Var.a;
                int i3 = uq3Var.b;
                if (i2 <= i3) {
                    while (true) {
                        set.add(Long.valueOf(((Integer) bVar2.c.get(Integer.valueOf(i2))) == null ? 0 : r8.intValue()));
                        if (i2 != i3) {
                            i2++;
                        }
                    }
                }
            }
            set2.add(Long.valueOf(((Integer) bVar2.c.get(32)) == null ? 0 : r4.intValue()));
            set3.add(Long.valueOf(((Integer) bVar2.c.get(64)) == null ? 0 : r4.intValue()));
            if (ref$LongRef.a == 0) {
                ref$LongRef.a = ((Integer) bVar2.c.get(8226)) == null ? 0 : r3.intValue();
            }
        }
        set.remove(0L);
        set2.remove(0L);
        set3.remove(0L);
    }

    public final j0 a(d dVar, String str, String str2, String str3) throws IOException {
        String str4;
        Object next;
        js3.p(dVar, "buffer");
        int iG = dVar.g();
        if (Integer.compare(iG ^ Integer.MIN_VALUE, Integer.MIN_VALUE) <= 0) {
            return null;
        }
        Collection collectionValues = this.a.a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (js3.i(((j0) obj).c, str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                str4 = str3;
                next = null;
                break;
            }
            next = it.next();
            j0 j0Var = (j0) next;
            if (iG == j0Var.b && js3.i(j0Var.d, str2)) {
                str4 = str3;
                if (js3.i(j0Var.e, str4)) {
                    break;
                }
            }
        }
        j0 j0Var2 = (j0) next;
        if (j0Var2 != null) {
            dVar.a(iG, true);
            return j0Var2;
        }
        String string = UUID.randomUUID().toString();
        js3.o(string, "randomUUID().toString()");
        File fileA = com.microsoft.clarity.p.f.a(this.b, string, false, true, 2);
        js3.p(fileA, "file");
        FileOutputStream fileOutputStream = new FileOutputStream(fileA, false);
        MessageDigest messageDigest = com.microsoft.clarity.q.c.a;
        DigestOutputStream digestOutputStream = new DigestOutputStream(fileOutputStream, MessageDigest.getInstance("MD5"));
        dVar.d = digestOutputStream;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        int i = dVar.b + iG;
        try {
            Iterator it2 = new com.microsoft.clarity.d.h().a(new com.microsoft.clarity.e.b(dVar), dVar.b, iG, d).iterator();
            while (it2.hasNext()) {
                a(linkedHashSet, linkedHashSet2, linkedHashSet3, ref$LongRef, (com.microsoft.clarity.d.i) it2.next());
            }
            dVar.a(i - dVar.b, false);
            dVar.d = null;
            digestOutputStream.close();
            fileOutputStream.close();
            MessageDigest messageDigest2 = com.microsoft.clarity.q.c.a;
            digestOutputStream.flush();
            digestOutputStream.close();
            MessageDigest messageDigest3 = digestOutputStream.getMessageDigest();
            js3.o(messageDigest3, "this.messageDigest");
            String strA = com.microsoft.clarity.q.c.a(messageDigest3, (byte[]) null);
            js3.p(strA, AppMeasurementSdk.ConditionalUserProperty.NAME);
            fileA.renameTo(com.microsoft.clarity.p.f.a(this.b, strA, false, false, 6));
            return new j0(strA, iG, str, str2, str4, linkedHashSet, linkedHashSet2, linkedHashSet3, ref$LongRef.a);
        } finally {
        }
    }
}
