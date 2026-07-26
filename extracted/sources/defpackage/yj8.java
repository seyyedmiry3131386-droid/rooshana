package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yj8 {
    public static final u58 a = new u58(new mw7(10));

    public static final void a(xj8 xj8Var, a aVar, qz0 qz0Var, int i) {
        qz0Var.c0(-512810425);
        int i2 = (qz0Var.f(xj8Var) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            zk8.b(a.a(xj8Var), aVar, qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new iz(xj8Var, aVar, i, 24);
        }
    }
}
