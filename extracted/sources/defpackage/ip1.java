package defpackage;

import coil3.disk.a;

/* JADX INFO: loaded from: classes.dex */
public final class ip1 implements AutoCloseable {
    public final gp1 a;
    public boolean b;
    public final /* synthetic */ a c;

    public ip1(a aVar, gp1 gp1Var) {
        this.c = aVar;
        this.a = gp1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        a aVar = this.c;
        synchronized (aVar.h) {
            gp1 gp1Var = this.a;
            int i = gp1Var.h - 1;
            gp1Var.h = i;
            if (i == 0 && gp1Var.f) {
                aVar.J(gp1Var);
            }
        }
    }
}
