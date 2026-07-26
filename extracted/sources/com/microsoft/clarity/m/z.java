package com.microsoft.clarity.m;

import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.models.display.common.Vertices;
import defpackage.js3;
import defpackage.ow8;
import defpackage.wu0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends y {
    @Override // com.microsoft.clarity.m.y
    /* JADX INFO: renamed from: b */
    public final Vertices a(d dVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        js3.p(dVar, "buffer");
        int iL = dVar.l();
        int iD = dVar.d();
        int iD2 = dVar.d();
        boolean z = (iL & 256) != 0;
        boolean z2 = (iL & 512) != 0;
        int i = iL & 255;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        dVar.l();
        for (int i2 = 0; i2 < iD; i2++) {
            arrayList3.add(new Point(dVar.b(), dVar.b()));
        }
        ArrayList arrayList5 = null;
        if (dVar.l() != 0) {
            ArrayList arrayList6 = new ArrayList();
            for (int i3 = 0; i3 < iD; i3++) {
                arrayList6.add(new Point(dVar.b(), dVar.b()));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        if (dVar.l() != 0) {
            arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < iD; i4++) {
                arrayList2.add(new ow8(dVar.l()));
            }
        } else {
            arrayList2 = null;
        }
        dVar.l();
        for (int i5 = 0; i5 < iD2; i5++) {
            arrayList4.add(new ow8((dVar.k() << 8) + dVar.k()));
        }
        int i6 = iD * 8;
        int i7 = z ? i6 : 0;
        int i8 = z2 ? iD * 4 : 0;
        int i9 = iD2 * 2;
        dVar.a((((((((((i6 + i7) + i8) + i9) + 3) >>> 2) << 2) - i6) - i7) - i8) - i9, false);
        long j = ((long) i) & 4294967295L;
        if (arrayList2 != null) {
            arrayList5 = new ArrayList(wu0.V(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList5.add(Long.valueOf(((long) ((ow8) it.next()).a) & 4294967295L));
            }
        }
        ArrayList arrayList7 = arrayList5;
        ArrayList arrayList8 = new ArrayList(wu0.V(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList8.add(Long.valueOf(((long) ((ow8) it2.next()).a) & 4294967295L));
        }
        return new Vertices(j, false, arrayList3, arrayList, arrayList7, null, null, arrayList8);
    }
}
