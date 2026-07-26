package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p1 implements j5 {
    public boolean a;
    public boolean b;

    @Override // j$.util.stream.j5
    public /* synthetic */ void accept(double d) {
        t3.D();
        throw null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public /* synthetic */ void accept(int i) {
        t3.K();
        throw null;
    }

    @Override // j$.util.stream.j5, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j) {
        t3.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    public p1(q1 q1Var) {
        this.b = !q1Var.b;
    }

    @Override // j$.util.stream.j5
    public final boolean e() {
        return this.a;
    }
}
