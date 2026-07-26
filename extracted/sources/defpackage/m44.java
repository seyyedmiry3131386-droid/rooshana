package defpackage;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class m44 {
    public final long a;
    public final TreeSet b = new TreeSet(new mh(16));
    public long c;

    public m44(long j) {
        this.a = j;
    }

    public final void a(dk0 dk0Var, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            qk0 qk0Var = (qk0) this.b.first();
            hw7 hw7Var = (hw7) dk0Var;
            synchronized (hw7Var) {
                vy2.s(!hw7Var.i);
                hw7Var.k(qk0Var);
            }
        }
    }

    public final void b(hw7 hw7Var, iw7 iw7Var) {
        this.b.add(iw7Var);
        this.c += iw7Var.c;
        a(hw7Var, 0L);
    }
}
