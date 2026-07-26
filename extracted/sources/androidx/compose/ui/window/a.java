package androidx.compose.ui.window;

import defpackage.a96;
import defpackage.b96;
import defpackage.bl4;
import defpackage.cl4;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.es3;
import defpackage.h31;
import defpackage.tx8;
import defpackage.yk4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements cl4 {
    public static final a a = new a();

    @Override // defpackage.cl4
    public final /* synthetic */ int b(es3 es3Var, List list, int i) {
        return bl4.c(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iJ = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b96 b96VarT = ((yk4) list.get(i2)).t(j);
            iJ = Math.max(iJ, b96VarT.a);
            i = Math.max(i, b96VarT.b);
            arrayList.add(b96VarT);
        }
        if (list.isEmpty()) {
            iJ = h31.j(j);
            i = h31.i(j);
        }
        return el4Var.D(iJ, i, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                ArrayList arrayList2 = arrayList;
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    a96.j(a96Var, (b96) arrayList2.get(i3), 0, 0);
                }
                return tx8.a;
            }
        });
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int e(es3 es3Var, List list, int i) {
        return bl4.e(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int g(es3 es3Var, List list, int i) {
        return bl4.b(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int i(es3 es3Var, List list, int i) {
        return bl4.d(this, es3Var, list, i);
    }
}
