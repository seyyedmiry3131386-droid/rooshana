package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class d6 extends e1 implements m8 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(a aVar, int i, int i2) {
        super(aVar, i);
        this.s = i2;
    }

    @Override // j$.util.stream.a
    public Spliterator N0(a aVar, Spliterator spliterator) {
        switch (this.s) {
            case 1:
                return v6.ORDERED.l(aVar.m) ? M0(aVar, spliterator, new e2(16)).spliterator() : new s8((j$.util.b1) aVar.G0(spliterator), 1);
            case 2:
                return v6.ORDERED.l(aVar.m) ? M0(aVar, spliterator, new e2(17)).spliterator() : new s8((j$.util.b1) aVar.G0(spliterator), 0);
            default:
                return super.N0(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final d2 M0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                if (v6.SORTED.l(((a) t3Var).m)) {
                    return t3Var.k0(spliterator, false, intFunction);
                }
                long[] jArr = (long[]) ((b2) t3Var.k0(spliterator, true, intFunction)).b();
                Arrays.sort(jArr);
                return new i3(jArr);
            case 1:
                return (d2) new p8(this, t3Var, spliterator, intFunction).invoke();
            default:
                return (d2) new o8(this, t3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        switch (this.s) {
            case 0:
                Objects.requireNonNull(j5Var);
                if (v6.SORTED.l(i)) {
                    return j5Var;
                }
                return v6.SIZED.l(i) ? new i6(j5Var) : new a6(j5Var);
            case 1:
                return new i8(this, j5Var);
            default:
                return new j8(this, j5Var, false);
        }
    }

    @Override // j$.util.stream.m8
    public n8 i(v1 v1Var, boolean z) {
        return new j8(this, v1Var, z);
    }
}
