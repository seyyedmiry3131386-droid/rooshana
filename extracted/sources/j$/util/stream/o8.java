package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class o8 extends d {
    public final a h;
    public final IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                o8 o8Var = (o8) dVar;
                long j = o8Var.l;
                this.l = j;
                if (j == o8Var.k) {
                    this.l = j + ((o8) this.e).l;
                }
            }
            o8 o8Var2 = (o8) dVar;
            long j2 = o8Var2.k;
            o8 o8Var3 = (o8) this.e;
            this.k = j2 + o8Var3.k;
            d2 d2VarF0 = o8Var2.k == 0 ? (d2) o8Var3.f : o8Var3.k == 0 ? (d2) o8Var2.f : t3.f0(this.h.L0(), (d2) ((o8) this.d).f, (d2) ((o8) this.e).f);
            if (b() && this.j) {
                d2VarF0 = d2VarF0.j(this.l, d2VarF0.count(), this.i);
            }
            this.f = d2VarF0;
        }
        super.onCompletion(countedCompleter);
    }

    public o8(a aVar, t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        super(t3Var, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = v6.ORDERED.l(((a) t3Var).m);
    }

    public o8(o8 o8Var, Spliterator spliterator) {
        super(o8Var, spliterator);
        this.h = o8Var.h;
        this.i = o8Var.i;
        this.j = o8Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new o8(this, spliterator);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // j$.util.stream.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r5 = this;
            boolean r0 = r5.b()
            if (r0 != 0) goto L1c
            boolean r1 = r5.j
            if (r1 == 0) goto L1c
            j$.util.stream.v6 r1 = j$.util.stream.v6.SIZED
            j$.util.stream.a r2 = r5.h
            int r3 = r2.j
            int r1 = r1.e
            r3 = r3 & r1
            if (r3 != r1) goto L1c
            j$.util.Spliterator r1 = r5.b
            long r1 = r2.l0(r1)
            goto L1e
        L1c:
            r1 = -1
        L1e:
            j$.util.stream.t3 r3 = r5.a
            java.util.function.IntFunction r4 = r5.i
            j$.util.stream.v1 r1 = r3.A0(r1, r4)
            j$.util.stream.a r2 = r5.h
            j$.util.stream.m8 r2 = (j$.util.stream.m8) r2
            boolean r3 = r5.j
            if (r3 == 0) goto L32
            if (r0 != 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            j$.util.stream.n8 r0 = r2.i(r1, r0)
            j$.util.stream.t3 r2 = r5.a
            j$.util.Spliterator r3 = r5.b
            r2.E0(r3, r0)
            j$.util.stream.d2 r1 = r1.build()
            long r2 = r1.count()
            r5.k = r2
            long r2 = r0.h()
            r5.l = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.o8.a():java.lang.Object");
    }
}
