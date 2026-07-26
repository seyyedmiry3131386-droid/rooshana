package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class n5 extends w0 {
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(y0 y0Var, int i, long j, long j2) {
        super(y0Var, i);
        this.s = j;
        this.t = j2;
    }

    @Override // j$.util.stream.a
    public final Spliterator N0(a aVar, Spliterator spliterator) {
        long jL0 = aVar.l0(spliterator);
        if (jL0 > 0 && spliterator.hasCharacteristics(16384)) {
            j$.util.y0 y0Var = (j$.util.y0) aVar.G0(spliterator);
            long j = this.s;
            return new m7(y0Var, j, t3.a0(j, this.t));
        }
        if (v6.ORDERED.l(aVar.m)) {
            return ((d2) new t5(this, aVar, spliterator, new e2(9), this.s, this.t).invoke()).spliterator();
        }
        j$.util.y0 y0Var2 = (j$.util.y0) aVar.G0(spliterator);
        long j2 = this.s;
        long j3 = this.t;
        if (j2 <= jL0) {
            long jMin = jL0 - j2;
            if (j3 >= 0) {
                jMin = Math.min(j3, jMin);
            }
            j3 = jMin;
            j2 = 0;
        }
        return new s7(y0Var2, j2, j3);
    }

    @Override // j$.util.stream.a
    public final d2 M0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j;
        long jL0 = t3Var.l0(spliterator);
        if (jL0 > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar = (a) t3Var;
            while (aVar.l > 0) {
                aVar = aVar.i;
            }
            return t3.d0(t3Var, t3.Y(aVar.L0(), spliterator, this.s, this.t), true);
        }
        if (!v6.ORDERED.l(((a) t3Var).m)) {
            j$.util.y0 y0Var = (j$.util.y0) t3Var.G0(spliterator);
            long j2 = this.s;
            long j3 = this.t;
            if (j2 <= jL0) {
                long j4 = jL0 - j2;
                jMin = j3 >= 0 ? Math.min(j3, j4) : j4;
                j = 0;
            } else {
                jMin = j3;
                j = j2;
            }
            return t3.d0(this, new s7(y0Var, j, jMin), true);
        }
        return (d2) new t5(this, t3Var, spliterator, intFunction, this.s, this.t).invoke();
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        return new m5(this, j5Var);
    }
}
