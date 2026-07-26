package androidx.compose.animation;

import defpackage.a96;
import defpackage.b96;
import defpackage.br9;
import defpackage.cl4;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.es3;
import defpackage.jk;
import defpackage.s08;
import defpackage.tx8;
import defpackage.yk4;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements cl4 {
    public final jk a;
    public boolean b;

    public e(jk jkVar) {
        this.a = jkVar;
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = ((yk4) list.get(0)).n(i);
        int iY = br9.y(list);
        int i2 = 1;
        if (1 <= iY) {
            while (true) {
                int iN2 = ((yk4) list.get(i2)).n(i);
                if (iN2 > iN) {
                    iN = iN2;
                }
                if (i2 == iY) {
                    break;
                }
                i2++;
            }
        }
        return iN;
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            b96 b96VarT = ((yk4) list.get(i)).t(j);
            iMax = Math.max(iMax, b96VarT.a);
            iMax2 = Math.max(iMax2, b96VarT.b);
            arrayList.add(b96VarT);
        }
        boolean zQ = el4Var.Q();
        jk jkVar = this.a;
        if (zQ) {
            this.b = true;
            ((s08) jkVar.a).setValue(new zq3((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.b) {
            ((s08) jkVar.a).setValue(new zq3((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return el4Var.D(iMax, iMax2, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    a96Var.g((b96) arrayList2.get(i2), 0, 0, 0.0f);
                }
                return tx8.a;
            }
        });
    }

    @Override // defpackage.cl4
    public final int e(es3 es3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL = ((yk4) list.get(0)).l(i);
        int iY = br9.y(list);
        int i2 = 1;
        if (1 <= iY) {
            while (true) {
                int iL2 = ((yk4) list.get(i2)).l(i);
                if (iL2 > iL) {
                    iL = iL2;
                }
                if (i2 == iY) {
                    break;
                }
                i2++;
            }
        }
        return iL;
    }

    @Override // defpackage.cl4
    public final int g(es3 es3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = ((yk4) list.get(0)).a(i);
        int iY = br9.y(list);
        int i2 = 1;
        if (1 <= iY) {
            while (true) {
                int iA2 = ((yk4) list.get(i2)).a(i);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i2 == iY) {
                    break;
                }
                i2++;
            }
        }
        return iA;
    }

    @Override // defpackage.cl4
    public final int i(es3 es3Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iP = ((yk4) list.get(0)).P(i);
        int iY = br9.y(list);
        int i2 = 1;
        if (1 <= iY) {
            while (true) {
                int iP2 = ((yk4) list.get(i2)).P(i);
                if (iP2 > iP) {
                    iP = iP2;
                }
                if (i2 == iY) {
                    break;
                }
                i2++;
            }
        }
        return iP;
    }
}
