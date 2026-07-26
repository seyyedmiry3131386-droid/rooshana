package androidx.tv.material3;

import defpackage.bg0;
import defpackage.hs9;
import defpackage.ka7;
import defpackage.kv0;
import defpackage.la7;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rq4;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.yh0;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final o a = new o();

    static {
        float f = 16;
        float f2 = 10;
        yh0.e(f, f2, f, f2);
        ka7 ka7Var = la7.a;
    }

    public final void a(final int i, qz0 qz0Var) {
        qz0Var.c0(814364484);
        int i2 = (qz0Var.g(false) ? 4 : 2) | i | (qz0Var.f(null) ? 32 : 16);
        if ((i2 & 19) == 18 && qz0Var.B()) {
            qz0Var.U();
        } else {
            int i3 = (i2 >> 3) & 14;
            ((Boolean) androidx.compose.foundation.interaction.a.a(null, qz0Var, i3).getValue()).getClass();
            ((Boolean) androidx.compose.foundation.interaction.a.b(null, qz0Var, i3).getValue()).getClass();
            qz0Var.b0(603058958);
            long jB = zu0.b(0.4f, ((kv0) qz0Var.j(d.a)).d());
            qz0Var.q(false);
            bg0.a(rq4.f(androidx.compose.foundation.layout.b.c, jB, tt3.d), qz0Var, 0);
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(i) { // from class: androidx.tv.material3.WideButtonDefaults$Background$1
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(385);
                    this.g.a(iW, (qz0) obj);
                    return tx8.a;
                }
            };
        }
    }
}
