package com.microsoft.clarity.m;

import com.microsoft.clarity.g.Q;
import com.microsoft.clarity.models.display.blobs.Slug;
import com.microsoft.clarity.models.display.blobs.TextBlob;
import com.microsoft.clarity.models.display.blobs.TextBlobRun;
import com.microsoft.clarity.models.display.commands.DisplayCommand;
import com.microsoft.clarity.models.display.commands.DrawViewAnnotation;
import com.microsoft.clarity.models.display.commands.Restore;
import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.models.display.common.Rect;
import com.microsoft.clarity.models.display.paths.Path;
import defpackage.br9;
import defpackage.js3;
import defpackage.ow8;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements b {
    public final s a;
    public final long b;
    public final Q c;

    public u(long j, Q q, s sVar) {
        js3.p(sVar, "parserFactory");
        this.a = sVar;
        this.b = j;
        this.c = q;
    }

    @Override // com.microsoft.clarity.m.c
    public final com.microsoft.clarity.l.a a() {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.microsoft.clarity.m.b
    public final Object a(d dVar) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        float fB;
        Integer num;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        ArrayList arrayList5;
        u uVar = this;
        d dVar2 = dVar;
        js3.p(dVar2, "buffer");
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        String strC = dVar2.c();
        ArrayList arrayList15 = arrayList6;
        ArrayList arrayList16 = arrayList8;
        ArrayList arrayList17 = arrayList9;
        ArrayList arrayList18 = arrayList10;
        ArrayList arrayList19 = arrayList11;
        ArrayList arrayList20 = arrayList12;
        ArrayList arrayList21 = arrayList13;
        while (!js3.i(strC, "eof ")) {
            switch (strC.hashCode()) {
                case 3002409:
                    arrayList = arrayList7;
                    if (!strC.equals("aray")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    dVar.l();
                    arrayList7 = arrayList;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3026845:
                    if (!strC.equals("blob")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    int iL = dVar2.l();
                    ArrayList arrayList22 = new ArrayList();
                    for (int i2 = 0; i2 < iL; i2++) {
                        Rect rectI = dVar2.i();
                        ArrayList arrayList23 = new ArrayList();
                        while (true) {
                            int iD = dVar2.d();
                            if (iD == 0) {
                            }
                            byte bA = dVar2.a();
                            boolean z = dVar2.a() != 0;
                            dVar2.a(2, false);
                            if (z) {
                                dVar2.l();
                            }
                            int i3 = iL;
                            Point point = new Point(dVar2.b(), dVar2.b());
                            int iL2 = dVar2.l();
                            if ((Integer.MIN_VALUE & iL2) != 0) {
                                i = iL2;
                                arrayList2 = arrayList7;
                                fB = (float) ((((double) 2) * ((double) 0)) + ((double) ((iL2 >>> 16) & 255)));
                            } else {
                                i = iL2;
                                arrayList2 = arrayList7;
                                fB = dVar2.b();
                            }
                            float f = fB;
                            Float fValueOf = (i & 1073741824) != 0 ? Float.valueOf(dVar2.b()) : null;
                            Float fValueOf2 = (i & 536870912) != 0 ? Float.valueOf(dVar2.b()) : null;
                            if ((i & 268435456) != 0) {
                                int iD2 = dVar2.d();
                                Integer numValueOf = Integer.valueOf(iD2);
                                if (iD2 < 0) {
                                    dVar2.a(iD2, false);
                                } else {
                                    numValueOf = Integer.valueOf(iD2 - 1);
                                }
                                num = numValueOf;
                            } else {
                                num = null;
                            }
                            int iL3 = dVar2.l();
                            int i4 = ((iL3 + 3) >>> 2) << 2;
                            ArrayList arrayList24 = new ArrayList();
                            int i5 = 0;
                            while (i5 < iD) {
                                arrayList24.add(new ow8((dVar2.k() << 8) + dVar2.k()));
                                i5++;
                                iL3 = iL3;
                            }
                            dVar2.a(i4 - iL3, false);
                            int iL4 = dVar2.l();
                            int i6 = ((iL4 + 3) >>> 2) << 2;
                            ArrayList arrayListO = br9.o(0, 1, 2, 4);
                            ArrayList arrayList25 = new ArrayList();
                            int i7 = 0;
                            while (i7 < iD) {
                                int i8 = i7;
                                ArrayList arrayList26 = new ArrayList();
                                ArrayList arrayList27 = arrayList22;
                                Object obj = arrayListO.get(bA);
                                ArrayList arrayList28 = arrayListO;
                                js3.o(obj, "scalarsPerPositions[pos]");
                                int i9 = 0;
                                for (int iIntValue = ((Number) obj).intValue(); i9 < iIntValue; iIntValue = iIntValue) {
                                    arrayList26.add(Float.valueOf(dVar2.b()));
                                    i9++;
                                }
                                arrayList25.add(arrayList26);
                                i7 = i8 + 1;
                                arrayList22 = arrayList27;
                                arrayListO = arrayList28;
                            }
                            ArrayList arrayList29 = arrayList22;
                            dVar2.a(i6 - iL4, false);
                            if (z) {
                                arrayList4 = new ArrayList();
                                int iL5 = dVar2.l();
                                int i10 = ((iL5 + 3) >>> 2) << 2;
                                int i11 = 0;
                                while (i11 < iD) {
                                    arrayList4.add(new ow8(dVar2.l()));
                                    i11++;
                                    arrayList25 = arrayList25;
                                }
                                arrayList3 = arrayList25;
                                dVar2.a(i10 - iL5, false);
                                int iL6 = dVar2.l();
                                String strA = dVar2.a(iL6);
                                dVar2.a((((iL6 + 3) >>> 2) << 2) - iL6, false);
                                str = strA;
                            } else {
                                arrayList3 = arrayList25;
                                arrayList4 = null;
                                str = null;
                            }
                            ArrayList arrayList30 = new ArrayList(wu0.V(arrayList24, 10));
                            Iterator it = arrayList24.iterator();
                            while (it.hasNext()) {
                                arrayList30.add(Long.valueOf(((long) ((ow8) it.next()).a) & 4294967295L));
                            }
                            ArrayList arrayListQ0 = kotlin.collections.a.Q0(arrayList30);
                            if (arrayList4 != null) {
                                ArrayList arrayList31 = new ArrayList(wu0.V(arrayList4, 10));
                                for (Iterator it2 = arrayList4.iterator(); it2.hasNext(); it2 = it2) {
                                    arrayList31.add(Long.valueOf(((long) ((ow8) it2.next()).a) & 4294967295L));
                                }
                                arrayList5 = arrayList31;
                            } else {
                                arrayList5 = null;
                            }
                            arrayList23.add(new TextBlobRun(point, f, fValueOf, fValueOf2, num, arrayListQ0, arrayList3, arrayList5, str));
                            dVar2 = dVar;
                            iL = i3;
                            arrayList7 = arrayList2;
                            arrayList22 = arrayList29;
                            break;
                        }
                        arrayList22.add(new TextBlob(rectI, arrayList23));
                    }
                    arrayList18 = arrayList22;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3135084:
                    if (!strC.equals("fact")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    dVar2.l();
                    int iD3 = dVar2.d();
                    arrayList7 = new ArrayList();
                    for (int i12 = 0; i12 < iD3; i12++) {
                        String strA2 = dVar2.a(dVar2.g());
                        js3.m(strA2);
                        arrayList7.add(strA2);
                    }
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3235914:
                    if (!strC.equals("imag")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    b gVar = uVar.b < 78 ? new g() : new f();
                    int iL7 = dVar2.l();
                    ArrayList arrayList32 = new ArrayList();
                    for (int i13 = 0; i13 < iL7; i13++) {
                        arrayList32.add(gVar.a(dVar2));
                    }
                    arrayList17 = arrayList32;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3435441:
                    if (!strC.equals("pctr")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    v vVar = new v(uVar.a, uVar.c);
                    int iL8 = dVar2.l();
                    for (int i14 = 0; i14 < iL8; i14++) {
                        arrayList14.add(vVar.a(dVar2));
                    }
                    arrayList = arrayList7;
                    arrayList7 = arrayList;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3445930:
                    if (!strC.equals("pnt ")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    l lVarA = uVar.a.a(uVar.b, uVar.c);
                    int iL9 = dVar2.l();
                    ArrayList arrayList33 = new ArrayList();
                    for (int i15 = 0; i15 < iL9; i15++) {
                        arrayList33.add(lVarA.a(dVar2, arrayList7));
                    }
                    arrayList20 = arrayList33;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3451324:
                    if (!strC.equals("pth ")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    int iL10 = dVar2.l();
                    dVar2.l();
                    ArrayList arrayList34 = new ArrayList();
                    for (int i16 = 0; i16 < iL10; i16++) {
                        Path pathB = t.b(dVar2);
                        if (pathB != null) {
                            arrayList34.add(pathB);
                        }
                    }
                    arrayList21 = arrayList34;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3496342:
                    if (!strC.equals("read")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    long j = uVar.b;
                    Q q = uVar.c;
                    b kVar = j < 75 ? new k(q) : j < 92 ? new i(q) : new j(j, q);
                    int iL11 = dVar2.b + dVar2.l();
                    ArrayList arrayList35 = new ArrayList();
                    while (true) {
                        boolean z2 = false;
                        while (dVar2.b < iL11) {
                            DisplayCommand displayCommandA = kVar.a(dVar2);
                            if (displayCommandA != null) {
                                if (!z2 || !(displayCommandA instanceof Restore)) {
                                    if (!arrayList35.isEmpty() && (displayCommandA instanceof DrawViewAnnotation) && ((DrawViewAnnotation) displayCommandA).isClipRectSource()) {
                                        arrayList35.set(br9.y(arrayList35), displayCommandA);
                                        z2 = true;
                                    } else {
                                        arrayList35.add(displayCommandA);
                                    }
                                }
                            }
                        }
                        arrayList15 = arrayList35;
                        strC = dVar.c();
                        uVar = this;
                        dVar2 = dVar;
                    }
                    break;
                case 3533483:
                    if (!strC.equals("slug")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    l lVarA2 = uVar.a.a(uVar.b, uVar.c);
                    js3.p(lVarA2, "paintParser");
                    int iL12 = dVar2.l();
                    ArrayList arrayList36 = new ArrayList();
                    for (int i17 = 0; i17 < iL12; i17++) {
                        dVar2.i();
                        int iL13 = dVar2.l();
                        ArrayList arrayList37 = new ArrayList();
                        for (int i18 = 0; i18 < iL13; i18++) {
                            arrayList37.add(lVarA2.a(dVar2, arrayList7));
                        }
                        new Point(dVar2.b(), dVar2.b());
                        int iD4 = dVar2.d();
                        if (iD4 < 0 || 65536 < iD4) {
                            iD4 = 128;
                        }
                        dVar2.a(iD4, false);
                        arrayList36.add(new Slug());
                    }
                    arrayList = arrayList7;
                    arrayList7 = arrayList;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3566649:
                    if (!strC.equals("tpfc")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    s sVar = uVar.a;
                    x xVar = new x(sVar.a, sVar.b);
                    int iL14 = dVar2.l();
                    ArrayList arrayList38 = new ArrayList();
                    for (int i19 = 0; i19 < iL14; i19++) {
                        arrayList38.add(xVar.a(dVar2));
                    }
                    arrayList16 = arrayList38;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                case 3616049:
                    if (!strC.equals("vert")) {
                        throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
                    }
                    b a = uVar.b < 75 ? new A() : new z();
                    int iL15 = dVar2.l();
                    ArrayList arrayList39 = new ArrayList();
                    for (int i20 = 0; i20 < iL15; i20++) {
                        arrayList39.add(a.a(dVar2));
                    }
                    arrayList19 = arrayList39;
                    strC = dVar.c();
                    uVar = this;
                    dVar2 = dVar;
                    break;
                    break;
                default:
                    throw new com.microsoft.clarity.c.d("Unknown SkPicture tag ".concat(strC), "Tag", u.class.getName());
            }
        }
        return new C0102a(arrayList15, arrayList16, arrayList17, arrayList18, arrayList19, arrayList20, arrayList21, arrayList14);
    }
}
