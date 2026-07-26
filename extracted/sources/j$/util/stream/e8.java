package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class e8 extends z4 implements m8 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Predicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(b5 b5Var, int i, Predicate predicate, int i2) {
        super(b5Var, i);
        this.s = i2;
        this.t = predicate;
    }

    @Override // j$.util.stream.a
    public final Spliterator N0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 0:
                return v6.ORDERED.l(aVar.m) ? M0(aVar, spliterator, new e2(0)).spliterator() : new t8(aVar.G0(spliterator), this.t, 1);
            default:
                return v6.ORDERED.l(aVar.m) ? M0(aVar, spliterator, new e2(0)).spliterator() : new t8(aVar.G0(spliterator), this.t, 0);
        }
    }

    @Override // j$.util.stream.a
    public final d2 M0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                return (d2) new p8(this, t3Var, spliterator, intFunction).invoke();
            default:
                return (d2) new o8(this, t3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                return new j(this, j5Var);
            default:
                return new f8(this, j5Var, false);
        }
    }

    @Override // j$.util.stream.m8
    public n8 i(v1 v1Var, boolean z) {
        return new f8(this, v1Var, z);
    }
}
