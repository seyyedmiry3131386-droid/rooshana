package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class a81 implements hr8 {
    public final ax a;
    public final ti3 b;
    public final int c;

    public a81(ax axVar, ti3 ti3Var, int i) {
        this.a = axVar;
        this.b = ti3Var;
        this.c = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // defpackage.hr8
    public final void a() {
        this.a.getClass();
        ti3 ti3Var = this.b;
        if (ti3Var.b() != null) {
            throw new UnsupportedOperationException();
        }
        boolean z = ti3Var instanceof ib8;
        y71 y71Var = new y71(ti3Var.a().q, this.c, (z && ((ib8) ti3Var).g) ? false : true);
        if (z) {
            zk8.o(y71Var);
        } else {
            if (!(ti3Var instanceof p32)) {
                throw new NoWhenBranchMatchedException();
            }
            zk8.o(y71Var);
        }
    }
}
