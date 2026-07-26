package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public class k2 extends d {
    public final t3 h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.d;
        if (dVar != null) {
            this.f = (d2) this.j.apply((d2) ((k2) dVar).f, (d2) ((k2) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public k2(t3 t3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(t3Var, spliterator);
        this.h = t3Var;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public k2(k2 k2Var, Spliterator spliterator) {
        super(k2Var, spliterator);
        this.h = k2Var.h;
        this.i = k2Var.i;
        this.j = k2Var.j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new k2(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final d2 a() {
        v1 v1Var = (v1) this.i.apply(this.h.l0(this.b));
        this.h.E0(this.b, v1Var);
        return v1Var.build();
    }
}
