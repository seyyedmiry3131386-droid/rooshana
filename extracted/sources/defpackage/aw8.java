package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aw8 {
    public static final u58 a = new u58(new mw7(17));

    public static final void a(wf5 wf5Var, a aVar, qz0 qz0Var, int i) {
        js3.p(wf5Var, "typography");
        qz0Var.c0(972028713);
        int i2 = (qz0Var.f(wf5Var) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 19) != 18)) {
            zk8.b(a.a(wf5Var), aVar, qz0Var, 56);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new vf5(wf5Var, aVar, i);
        }
    }
}
