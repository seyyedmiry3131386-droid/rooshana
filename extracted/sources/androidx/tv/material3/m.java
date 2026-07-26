package androidx.tv.material3;

import defpackage.bp2;
import defpackage.ew8;
import defpackage.gj8;
import defpackage.hs9;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s01;
import defpackage.tx8;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final s01 a = new s01(new bp2() { // from class: androidx.tv.material3.TextKt$LocalTextStyle$1
        @Override // defpackage.bp2
        public final Object invoke() {
            return ew8.a;
        }
    });

    public static final void a(final gj8 gj8Var, final qp2 qp2Var, qz0 qz0Var, final int i) {
        qz0Var.c0(1119446463);
        int i2 = (qz0Var.f(gj8Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(qp2Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && qz0Var.B()) {
            qz0Var.U();
        } else {
            s01 s01Var = a;
            zk8.b(s01Var.a(((gj8) qz0Var.j(s01Var)).d(gj8Var)), qp2Var, qz0Var, (i2 & 112) | 8);
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: androidx.tv.material3.TextKt$ProvideTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(i | 1);
                    m.a(gj8Var, qp2Var, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }
}
