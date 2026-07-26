package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import defpackage.bp2;
import defpackage.br9;
import defpackage.k94;
import defpackage.nr5;
import defpackage.s3;
import defpackage.su0;
import defpackage.t3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = EmptyList.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iY = br9.y(arrayList);
                int i = 0;
                while (i < iY) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    c cVar = (c) obj2;
                    c cVar2 = (c) obj;
                    arrayList2.add(new nr5((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (cVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (cVar.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (cVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (cVar.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((nr5) kotlin.collections.a.o0(list)).a;
            } else {
                if (list.isEmpty()) {
                    k94.c("Empty collection can't be reduced.");
                }
                Object objO0 = kotlin.collections.a.o0(list);
                int iY2 = br9.y(list);
                if (1 <= iY2) {
                    int i2 = 1;
                    while (true) {
                        objO0 = new nr5(nr5.g(((nr5) objO0).a, ((nr5) list.get(i2)).a));
                        if (i2 == iY2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((nr5) objO0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void b(t3 t3Var, c cVar) {
        if (b.a(cVar.k(), d.g) != null) {
            throw new ClassCastException();
        }
        c cVarL = cVar.l();
        if (cVarL == null || b.a(cVarL.k(), d.e) == null) {
            return;
        }
        su0 su0Var = (su0) b.a(cVarL.k(), d.f);
        if (su0Var == null || (su0Var.a >= 0 && su0Var.b >= 0)) {
            if (cVar.k().a.c(d.I)) {
                ArrayList arrayList = new ArrayList();
                List listJ = c.j(4, cVarL);
                int size = listJ.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    c cVar2 = (c) listJ.get(i2);
                    if (cVar2.k().a.c(d.I)) {
                        arrayList.add(cVar2);
                        if (cVar2.c.G() < cVar.c.G()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zA = a(arrayList);
                int i3 = zA ? 0 : i;
                int i4 = zA ? i : 0;
                Object objG = cVar.k().a.g(d.I);
                if (objG == null) {
                    new bp2() { // from class: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1
                        @Override // defpackage.bp2
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Boolean.FALSE;
                        }
                    }.getClass();
                    objG = Boolean.FALSE;
                }
                t3Var.o(s3.a(i3, 1, i4, 1, false, ((Boolean) objG).booleanValue()));
            }
        }
    }
}
