package androidx.compose.ui.semantics;

import defpackage.bp2;
import defpackage.dp2;
import defpackage.en7;
import defpackage.i14;
import defpackage.qp2;
import defpackage.rt1;
import defpackage.ya5;
import defpackage.yg2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Comparator[] a;
    public static final qp2 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            yg2 yg2Var = i == 0 ? yg2.e : yg2.c;
            i14 i14Var = androidx.compose.ui.node.h.S;
            comparatorArr[i] = new rt1(5, new rt1(yg2Var));
            i++;
        }
        a = comparatorArr;
        b = new qp2() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                Object objValueOf = Float.valueOf(0.0f);
                c cVar = (c) obj2;
                en7 en7Var = ((c) obj).d;
                g gVar = d.t;
                Object objG = en7Var.a.g(gVar);
                if (objG == null) {
                    new bp2() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.1
                        @Override // defpackage.bp2
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(0.0f);
                        }
                    }.getClass();
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = cVar.d.a.g(gVar);
                if (objG2 == null) {
                    new bp2() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1.2
                        @Override // defpackage.bp2
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(0.0f);
                        }
                    }.getClass();
                } else {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            }
        };
    }

    public static final void a(c cVar, ArrayList arrayList, dp2 dp2Var, dp2 dp2Var2, ya5 ya5Var) {
        en7 en7Var = cVar.d;
        Object objG = en7Var.a.g(d.m);
        if (objG == null) {
            new bp2() { // from class: androidx.compose.ui.semantics.SemanticsSortKt$geometryDepthFirstSearch$isTraversalGroup$1
                @Override // defpackage.bp2
                public final /* bridge */ /* synthetic */ Object invoke() {
                    return Boolean.FALSE;
                }
            }.getClass();
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) dp2Var2.invoke(cVar)).booleanValue()) && ((Boolean) dp2Var.invoke(cVar)).booleanValue()) {
            arrayList.add(cVar);
        }
        if (zBooleanValue) {
            ya5Var.h(cVar.g, b(cVar, dp2Var, dp2Var2, c.j(7, cVar)));
            return;
        }
        List listJ = c.j(7, cVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((c) listJ.get(i), arrayList, dp2Var, dp2Var2, ya5Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList b(androidx.compose.ui.semantics.c r18, defpackage.dp2 r19, defpackage.dp2 r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.h.b(androidx.compose.ui.semantics.c, dp2, dp2, java.util.List):java.util.ArrayList");
    }
}
