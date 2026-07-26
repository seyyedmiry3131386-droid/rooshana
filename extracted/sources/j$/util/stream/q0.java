package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends CountedCompleter {
    public Spliterator a;
    public final j5 b;
    public final t3 c;
    public long d;

    public q0(t3 t3Var, Spliterator spliterator, j5 j5Var) {
        super(null);
        this.b = j5Var;
        this.c = t3Var;
        this.a = spliterator;
        this.d = 0L;
    }

    public q0(q0 q0Var, Spliterator spliterator) {
        super(q0Var);
        this.a = spliterator;
        this.b = q0Var.b;
        this.d = q0Var.d;
        this.c = q0Var.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.d = jE;
        }
        boolean zL = v6.SHORT_CIRCUIT.l(((a) this.c).m);
        j5 j5Var = this.b;
        boolean z = false;
        q0 q0Var = this;
        while (true) {
            if (zL && j5Var.e()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            q0 q0Var2 = new q0(q0Var, spliteratorTrySplit);
            q0Var.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                q0 q0Var3 = q0Var;
                q0Var = q0Var2;
                q0Var2 = q0Var3;
            }
            z = !z;
            q0Var.fork();
            q0Var = q0Var2;
            jEstimateSize = spliterator.estimateSize();
        }
        q0Var.c.g0(spliterator, j5Var);
        q0Var.a = null;
        q0Var.propagateCompletion();
    }
}
