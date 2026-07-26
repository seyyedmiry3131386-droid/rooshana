package com.microsoft.clarity.m;

import com.microsoft.clarity.models.display.common.Point;
import com.microsoft.clarity.models.display.common.RRect;
import com.microsoft.clarity.models.display.paths.AddRRectPathVerb;
import com.microsoft.clarity.models.display.paths.ClosePathVerb;
import com.microsoft.clarity.models.display.paths.ConicPathVerb;
import com.microsoft.clarity.models.display.paths.CubicPathVerb;
import com.microsoft.clarity.models.display.paths.DonePathVerb;
import com.microsoft.clarity.models.display.paths.LinePathVerb;
import com.microsoft.clarity.models.display.paths.MovePathVerb;
import com.microsoft.clarity.models.display.paths.Path;
import com.microsoft.clarity.models.display.paths.PathVerb;
import com.microsoft.clarity.models.display.paths.QuadPathVerb;
import defpackage.br9;
import defpackage.js3;
import defpackage.t87;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v18 */
    public static Path b(d dVar) {
        int i;
        PathVerb movePathVerb;
        PathVerb closePathVerb;
        js3.p(dVar, "buffer");
        int iD = dVar.d();
        int i2 = iD & 255;
        int i3 = (iD >> 8) & 3;
        if (i2 <= 3 || (i2 != 4 && i2 != 5)) {
            return null;
        }
        if (((iD >> 28) & 15) != 0) {
            boolean z = ((iD >> 26) & 3) != 0;
            RRect rRectH = dVar.h();
            dVar.l();
            return new Path(i3, br9.o(new AddRRectPathVerb(rRectH, z)));
        }
        boolean z2 = i2 != 5;
        int iD2 = dVar.d();
        int iD3 = dVar.d();
        int iD4 = dVar.d();
        int i4 = (iD3 * 4) + (iD2 * 8) + iD4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < iD2; i5++) {
            arrayList.add(new Point(dVar.b(), dVar.b()));
        }
        for (int i6 = 0; i6 < iD3; i6++) {
            arrayList2.add(Float.valueOf(dVar.b()));
        }
        for (int i7 = 0; i7 < iD4; i7++) {
            arrayList3.add(Integer.valueOf(dVar.a()));
        }
        if (z2) {
            arrayList3 = new t87(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            switch (((Number) it.next()).intValue()) {
                case 0:
                    i = i8 + 1;
                    movePathVerb = new MovePathVerb(((Point) arrayList.get(i8)).getX(), ((Point) arrayList.get(i8)).getY());
                    i8 = i;
                    closePathVerb = movePathVerb;
                    break;
                case 1:
                    i = i8 + 1;
                    movePathVerb = new LinePathVerb(((Point) arrayList.get(i8)).getX(), ((Point) arrayList.get(i8)).getY());
                    i8 = i;
                    closePathVerb = movePathVerb;
                    break;
                case 2:
                    i = i8 + 2;
                    float x = ((Point) arrayList.get(i8)).getX();
                    float y = ((Point) arrayList.get(i8)).getY();
                    int i10 = i8 + 1;
                    movePathVerb = new QuadPathVerb(x, y, ((Point) arrayList.get(i10)).getX(), ((Point) arrayList.get(i10)).getY());
                    i8 = i;
                    closePathVerb = movePathVerb;
                    break;
                case 3:
                    int i11 = i8 + 2;
                    float x2 = ((Point) arrayList.get(i8)).getX();
                    float y2 = ((Point) arrayList.get(i8)).getY();
                    int i12 = i8 + 1;
                    float x3 = ((Point) arrayList.get(i12)).getX();
                    float y3 = ((Point) arrayList.get(i12)).getY();
                    Object obj = arrayList2.get(i9);
                    js3.o(obj, "conics[conicIndex - 1]");
                    PathVerb conicPathVerb = new ConicPathVerb(x2, y2, x3, y3, ((Number) obj).floatValue());
                    i8 = i11;
                    i9++;
                    closePathVerb = conicPathVerb;
                    break;
                case 4:
                    i = i8 + 3;
                    int i13 = i8 + 1;
                    int i14 = i8 + 2;
                    movePathVerb = new CubicPathVerb(((Point) arrayList.get(i8)).getX(), ((Point) arrayList.get(i8)).getY(), ((Point) arrayList.get(i13)).getX(), ((Point) arrayList.get(i13)).getY(), ((Point) arrayList.get(i14)).getX(), ((Point) arrayList.get(i14)).getY());
                    i8 = i;
                    closePathVerb = movePathVerb;
                    break;
                case 5:
                    closePathVerb = new ClosePathVerb();
                    break;
                case 6:
                    closePathVerb = new DonePathVerb();
                    break;
                default:
                    closePathVerb = null;
                    break;
            }
            if (closePathVerb != null) {
                arrayList4.add(closePathVerb);
            }
        }
        dVar.a((((i4 + 3) >>> 2) << 2) - i4, false);
        return new Path(i3, arrayList4);
    }

    @Override // com.microsoft.clarity.m.b
    public final /* bridge */ /* synthetic */ Object a(d dVar) {
        return b(dVar);
    }
}
