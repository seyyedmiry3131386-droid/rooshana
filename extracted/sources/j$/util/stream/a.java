package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends t3 implements BaseStream {
    public final a h;
    public final a i;
    public final int j;
    public final a k;
    public int l;
    public int m;
    public Spliterator n;
    public boolean o;
    public final boolean p;
    public Runnable q;
    public boolean r;

    public abstract d2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction);

    public abstract boolean K0(Spliterator spliterator, j5 j5Var);

    public abstract w6 L0();

    public abstract boolean O0();

    public abstract j5 P0(int i, j5 j5Var);

    public abstract Spliterator S0(a aVar, Supplier supplier, boolean z);

    public a(Spliterator spliterator, int i, boolean z) {
        this.i = null;
        this.n = spliterator;
        this.h = this;
        int i2 = v6.g & i;
        this.j = i2;
        this.m = (~(i2 << 1)) & v6.l;
        this.l = 0;
        this.r = z;
    }

    public a(a aVar, int i) {
        if (aVar.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        aVar.o = true;
        aVar.k = this;
        this.i = aVar;
        this.j = v6.h & i;
        this.m = v6.i(i, aVar.m);
        a aVar2 = aVar.h;
        this.h = aVar2;
        if (O0()) {
            aVar2.p = true;
        }
        this.l = aVar.l + 1;
    }

    public final Object H0(b8 b8Var) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r) {
            return b8Var.j(this, Q0(b8Var.w()));
        }
        return b8Var.f(this, Q0(b8Var.w()));
    }

    public final d2 I0(IntFunction intFunction) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r && this.i != null && O0()) {
            this.l = 0;
            a aVar = this.i;
            return M0(aVar, aVar.Q0(0), intFunction);
        }
        return k0(Q0(0), true, intFunction);
    }

    public final Spliterator R0() {
        a aVar = this.h;
        if (this != aVar) {
            throw new IllegalStateException();
        }
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        Spliterator spliterator = aVar.n;
        if (spliterator != null) {
            aVar.n = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        this.h.r = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        a aVar = this.h;
        Runnable runnable = aVar.q;
        if (runnable != null) {
            aVar.q = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        a aVar = this.h;
        Runnable runnable2 = aVar.q;
        if (runnable2 != null) {
            runnable = new a8(runnable2, runnable);
        }
        aVar.q = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        a aVar = this.h;
        if (this == aVar) {
            Spliterator spliterator = aVar.n;
            if (spliterator != null) {
                aVar.n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return S0(this, new j$.util.p(2, this), aVar.r);
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.h.r;
    }

    @Override // j$.util.stream.t3
    public final d2 k0(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.h.r) {
            return J0(this, spliterator, z, intFunction);
        }
        v1 v1VarA0 = A0(l0(spliterator), intFunction);
        E0(spliterator, v1VarA0);
        return v1VarA0.build();
    }

    public final Spliterator Q0(int i) {
        int i2;
        int i3;
        a aVar = this.h;
        Spliterator spliteratorN0 = aVar.n;
        if (spliteratorN0 != null) {
            aVar.n = null;
            if (aVar.r && aVar.p) {
                a aVar2 = aVar.k;
                int i4 = 1;
                while (aVar != this) {
                    int i5 = aVar2.j;
                    if (aVar2.O0()) {
                        if (v6.SHORT_CIRCUIT.l(i5)) {
                            i5 &= ~v6.u;
                        }
                        spliteratorN0 = aVar2.N0(aVar, spliteratorN0);
                        if (spliteratorN0.hasCharacteristics(64)) {
                            i2 = (~v6.t) & i5;
                            i3 = v6.s;
                        } else {
                            i2 = (~v6.s) & i5;
                            i3 = v6.t;
                        }
                        i5 = i2 | i3;
                        i4 = 0;
                    }
                    int i6 = i4 + 1;
                    aVar2.l = i4;
                    aVar2.m = v6.i(i5, aVar.m);
                    a aVar3 = aVar2;
                    aVar2 = aVar2.k;
                    aVar = aVar3;
                    i4 = i6;
                }
            }
            if (i != 0) {
                this.m = v6.i(i, this.m);
            }
            return spliteratorN0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.t3
    public final long l0(Spliterator spliterator) {
        if (v6.SIZED.l(this.m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.t3
    public final j5 E0(Spliterator spliterator, j5 j5Var) {
        g0(spliterator, F0((j5) Objects.requireNonNull(j5Var)));
        return j5Var;
    }

    @Override // j$.util.stream.t3
    public final void g0(Spliterator spliterator, j5 j5Var) {
        Objects.requireNonNull(j5Var);
        if (!v6.SHORT_CIRCUIT.l(this.m)) {
            j5Var.c(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(j5Var);
            j5Var.end();
            return;
        }
        h0(spliterator, j5Var);
    }

    @Override // j$.util.stream.t3
    public final boolean h0(Spliterator spliterator, j5 j5Var) {
        a aVar = this;
        while (aVar.l > 0) {
            aVar = aVar.i;
        }
        j5Var.c(spliterator.getExactSizeIfKnown());
        boolean zK0 = aVar.K0(spliterator, j5Var);
        j5Var.end();
        return zK0;
    }

    @Override // j$.util.stream.t3
    public final j5 F0(j5 j5Var) {
        Objects.requireNonNull(j5Var);
        for (a aVar = this; aVar.l > 0; aVar = aVar.i) {
            j5Var = aVar.P0(aVar.i.m, j5Var);
        }
        return j5Var;
    }

    @Override // j$.util.stream.t3
    public final Spliterator G0(Spliterator spliterator) {
        return this.l == 0 ? spliterator : S0(this, new j$.util.p(3, spliterator), this.h.r);
    }

    public d2 M0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public Spliterator N0(a aVar, Spliterator spliterator) {
        return M0(aVar, spliterator, new j$.time.format.a(8)).spliterator();
    }
}
