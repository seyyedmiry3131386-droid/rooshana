package androidx.compose.ui.layout;

import defpackage.a96;
import defpackage.b96;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.h31;
import defpackage.j14;
import defpackage.j31;
import defpackage.tx8;
import defpackage.yk4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j14 {
    public static final l b = new l("Undefined intrinsics block and it is required");

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return el4Var.D(h31.j(j), h31.i(j), kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                @Override // defpackage.dp2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return tx8.a;
                }
            });
        }
        if (size == 1) {
            final b96 b96VarT = ((yk4) list.get(0)).t(j);
            return el4Var.D(j31.g(b96VarT.a, j), j31.f(b96VarT.b, j), kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    a96.k((a96) obj, b96VarT, 0, 0);
                    return tx8.a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            b96 b96VarT2 = ((yk4) list.get(i)).t(j);
            iMax = Math.max(b96VarT2.a, iMax);
            iMax2 = Math.max(b96VarT2.b, iMax2);
            arrayList.add(b96VarT2);
        }
        return el4Var.D(j31.g(iMax, j), j31.f(iMax2, j), kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                ArrayList arrayList2 = arrayList;
                int size3 = arrayList2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    a96.k(a96Var, (b96) arrayList2.get(i2), 0, 0);
                }
                return tx8.a;
            }
        });
    }
}
