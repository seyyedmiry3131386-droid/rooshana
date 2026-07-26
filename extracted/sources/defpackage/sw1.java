package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sw1 {
    public final int a;
    public final ks4 b;
    public final CopyOnWriteArrayList c;

    public sw1(CopyOnWriteArrayList copyOnWriteArrayList, int i, ks4 ks4Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = ks4Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tw1] */
    public final void a() {
        for (rw1 rw1Var : this.c) {
            j29.a0(rw1Var.a, new qw1(this, rw1Var.b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tw1] */
    public final void b() {
        for (rw1 rw1Var : this.c) {
            j29.a0(rw1Var.a, new qw1(this, rw1Var.b, 1));
        }
    }

    public final void c(int i) {
        for (rw1 rw1Var : this.c) {
            j29.a0(rw1Var.a, new cy0(this, rw1Var.b, i, 3));
        }
    }

    public final void d(Exception exc) {
        for (rw1 rw1Var : this.c) {
            j29.a0(rw1Var.a, new ii(this, rw1Var.b, exc, 7));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tw1] */
    public final void e() {
        for (rw1 rw1Var : this.c) {
            j29.a0(rw1Var.a, new qw1(this, rw1Var.b, 0));
        }
    }
}
