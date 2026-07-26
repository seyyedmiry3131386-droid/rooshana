package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class e6 extends z4 {
    public final boolean s;
    public final Comparator t;

    public e6(b5 b5Var) {
        super(b5Var, v6.q | v6.o);
        this.s = true;
        this.t = j$.util.e.INSTANCE;
    }

    public e6(b5 b5Var, Comparator comparator) {
        super(b5Var, v6.q | v6.p);
        this.s = false;
        this.t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        Objects.requireNonNull(j5Var);
        if (v6.SORTED.l(i) && this.s) {
            return j5Var;
        }
        if (v6.SIZED.l(i)) {
            return new j6(j5Var, this.t);
        }
        return new f6(j5Var, this.t);
    }

    @Override // j$.util.stream.a
    public final d2 M0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        if (v6.SORTED.l(((a) t3Var).m) && this.s) {
            return t3Var.k0(spliterator, false, intFunction);
        }
        Object[] objArrM = t3Var.k0(spliterator, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.t);
        return new h2(objArrM);
    }
}
