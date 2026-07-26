package defpackage;

import com.bumptech.glide.load.engine.b;

/* JADX INFO: loaded from: classes.dex */
public final class ng4 extends nd1 {
    public b d;

    @Override // defpackage.nd1
    public final int c(Object obj) {
        g67 g67Var = (g67) obj;
        if (g67Var == null) {
            return 1;
        }
        return g67Var.c();
    }

    @Override // defpackage.nd1
    public final void d(Object obj, Object obj2) {
        g67 g67Var = (g67) obj2;
        b bVar = this.d;
        if (bVar == null || g67Var == null) {
            return;
        }
        bVar.e.v(g67Var, true);
    }

    public final void l(int i) {
        long j;
        if (i >= 40) {
            j(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.a;
            }
            j(j / 2);
        }
    }
}
