package androidx.tv.material3;

import defpackage.ex4;
import defpackage.hs9;
import defpackage.my6;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import defpackage.z27;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final l a = new l();

    static {
        int i = zu0.i;
    }

    public final void a(final int i, qz0 qz0Var) {
        qz0Var.c0(-562414269);
        if ((i & 1) == 0 && qz0Var.B()) {
            qz0Var.U();
        } else {
            z27.a(qz0Var, androidx.compose.foundation.layout.b.l(ex4.b, 8));
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(i) { // from class: androidx.tv.material3.TabRowDefaults$TabSeparator$1
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(7);
                    this.g.a(iW, (qz0) obj);
                    return tx8.a;
                }
            };
        }
    }
}
