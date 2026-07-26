package com.microsoft.clarity.m;

import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.models.display.common.Vertices;
import defpackage.br9;
import defpackage.js3;
import defpackage.ow8;
import defpackage.wu0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends y {
    @Override // com.microsoft.clarity.m.y
    /* JADX INFO: renamed from: b */
    public final Vertices a(d dVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        int i;
        ArrayList arrayList3;
        ArrayList<ArrayList> arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        js3.p(dVar, "buffer");
        dVar.l();
        int iL = dVar.l();
        int iD = dVar.d();
        int iD2 = dVar.d();
        boolean z2 = (iL & 256) != 0;
        boolean z3 = (iL & 512) != 0;
        int i2 = iL & 255;
        boolean z4 = (iL & 1024) != 0;
        boolean z5 = (iL & 2048) == 0;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (int i3 = 0; i3 < iD; i3++) {
            arrayList7.add(new Point(dVar.b(), dVar.b()));
        }
        if (z2) {
            ArrayList arrayList9 = new ArrayList();
            for (int i4 = 0; i4 < iD; i4++) {
                arrayList9.add(new Point(dVar.b(), dVar.b()));
            }
            arrayList = arrayList9;
        } else {
            arrayList = null;
        }
        if (z3) {
            arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < iD; i5++) {
                arrayList2.add(new ow8(dVar.l()));
            }
        } else {
            arrayList2 = null;
        }
        if (z4) {
            arrayList4 = new ArrayList();
            arrayList3 = new ArrayList();
            int i6 = 0;
            i = 0;
            while (i6 < iD) {
                arrayList4.add(br9.o(new ow8(dVar.l()), new ow8(dVar.l()), new ow8(dVar.l()), new ow8(dVar.l())));
                i6++;
                z2 = z2;
            }
            z = z2;
            int i7 = 0;
            while (i7 < iD) {
                arrayList3.add(br9.o(Float.valueOf(dVar.b()), Float.valueOf(dVar.b()), Float.valueOf(dVar.b()), Float.valueOf(dVar.b())));
                i7++;
                iD = iD;
            }
        } else {
            z = z2;
            i = 0;
            arrayList3 = null;
            arrayList4 = null;
        }
        int i8 = iD;
        for (int i9 = i; i9 < iD2; i9++) {
            arrayList8.add(new ow8((dVar.k() << 8) + dVar.k()));
        }
        int i10 = i8 * 8;
        int i11 = z ? i10 : i;
        int i12 = z3 ? i8 * 4 : i;
        int i13 = z4 ? i8 * 16 : i;
        int i14 = z4 ? i8 * 16 : i;
        int i15 = iD2 * 2;
        dVar.a((((((((((((((i10 + i11) + i12) + i13) + i14) + i15) + 3) >>> 2) << 2) - i10) - i11) - i12) - i13) - i14) - i15, i);
        long j = ((long) i2) & 4294967295L;
        if (arrayList2 != null) {
            ArrayList arrayList10 = new ArrayList(wu0.V(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList10.add(Long.valueOf(((long) ((ow8) it.next()).a) & 4294967295L));
            }
            arrayList5 = arrayList10;
        } else {
            arrayList5 = null;
        }
        if (arrayList4 != null) {
            ArrayList arrayList11 = new ArrayList(wu0.V(arrayList4, 10));
            for (ArrayList arrayList12 : arrayList4) {
                ArrayList arrayList13 = new ArrayList(wu0.V(arrayList12, 10));
                Iterator it2 = arrayList12.iterator();
                while (it2.hasNext()) {
                    arrayList13.add(Long.valueOf(((long) ((ow8) it2.next()).a) & 4294967295L));
                }
                arrayList11.add(arrayList13);
            }
            arrayList6 = arrayList11;
        } else {
            arrayList6 = null;
        }
        ArrayList arrayList14 = new ArrayList(wu0.V(arrayList8, 10));
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            arrayList14.add(Long.valueOf(((long) ((ow8) it3.next()).a) & 4294967295L));
        }
        return new Vertices(j, z5, arrayList7, arrayList, arrayList5, arrayList6, arrayList3, arrayList14);
    }
}
