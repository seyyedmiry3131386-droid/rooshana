package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class t5 extends b {
    public final a j;
    public final IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // j$.util.stream.b
    public final void f() {
        this.i = true;
        if (this.o) {
            d(t3.j0(this.j.L0()));
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        t5 t5Var;
        d2 d2VarJ0;
        d dVar = this.d;
        if (dVar != null) {
            this.n = ((t5) dVar).n + ((t5) this.e).n;
            if (this.i) {
                this.n = 0L;
                d2VarJ0 = t3.j0(this.j.L0());
            } else {
                d2VarJ0 = this.n == 0 ? t3.j0(this.j.L0()) : ((t5) this.d).n == 0 ? (d2) ((t5) this.e).i() : t3.f0(this.j.L0(), (d2) ((t5) this.d).i(), (d2) ((t5) this.e).i());
            }
            d2 d2VarJ = d2VarJ0;
            if (b()) {
                d2VarJ = d2VarJ.j(this.l, this.m >= 0 ? Math.min(d2VarJ.count(), this.l + this.m) : this.n, this.k);
            }
            d(d2VarJ);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 >= j) {
                g();
            } else {
                t5 t5Var2 = (t5) ((d) getCompleter());
                Object obj = this;
                while (true) {
                    if (t5Var2 == null) {
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        if (obj == t5Var2.e && (t5Var = (t5) t5Var2.d) != null) {
                            long j3 = t5Var.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        obj = t5Var2;
                        t5Var2 = (t5) ((d) t5Var2.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public t5(a aVar, t3 t3Var, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(t3Var, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    public t5(t5 t5Var, Spliterator spliterator) {
        super(t5Var, spliterator);
        this.j = t5Var.j;
        this.k = t5Var.k;
        this.l = t5Var.l;
        this.m = t5Var.m;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new t5(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return t3.j0(this.j.L0());
    }

    @Override // j$.util.stream.d
    public final Object a() {
        if (b()) {
            v6 v6Var = v6.SIZED;
            a aVar = this.j;
            int i = aVar.j;
            int i2 = v6Var.e;
            v1 v1VarA0 = this.j.A0((i & i2) == i2 ? aVar.l0(this.b) : -1L, this.k);
            j5 j5VarP0 = this.j.P0(((a) this.a).m, v1VarA0);
            t3 t3Var = this.a;
            t3Var.h0(this.b, t3Var.F0(j5VarP0));
            return v1VarA0.build();
        }
        v1 v1VarA02 = this.j.A0(-1L, this.k);
        if (this.l == 0) {
            j5 j5VarP02 = this.j.P0(((a) this.a).m, v1VarA02);
            t3 t3Var2 = this.a;
            t3Var2.h0(this.b, t3Var2.F0(j5VarP02));
        } else {
            this.a.E0(this.b, v1VarA02);
        }
        d2 d2VarBuild = v1VarA02.build();
        this.n = d2VarBuild.count();
        this.o = true;
        this.b = null;
        return d2VarBuild;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        t5 t5Var = (t5) this.d;
        t5 t5Var2 = (t5) this.e;
        if (t5Var == null || t5Var2 == null) {
            return this.n;
        }
        long j2 = t5Var.j(j);
        return j2 >= j ? j2 : t5Var2.j(j) + j2;
    }
}
