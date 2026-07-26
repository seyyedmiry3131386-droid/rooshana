package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 extends b {
    public final j$.util.concurrent.t j;

    public r1(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.j = tVar;
    }

    public r1(r1 r1Var, Spliterator spliterator) {
        super(r1Var, spliterator);
        this.j = r1Var.j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new r1(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        t3 t3Var = this.a;
        p1 p1Var = (p1) ((Supplier) this.j.c).get();
        t3Var.E0(this.b, p1Var);
        boolean z = p1Var.b;
        if (z == ((q1) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((q1) this.j.b).b);
    }
}
