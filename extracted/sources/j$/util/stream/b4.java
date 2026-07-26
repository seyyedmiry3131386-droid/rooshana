package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class b4 extends p4 implements o4, g5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ m d;

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        t3.K();
        throw null;
    }

    @Override // j$.util.stream.j5, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        t3.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.g5
    public final /* synthetic */ void n(Double d) {
        t3.E(this, d);
    }

    @Override // j$.util.stream.o4
    public final void i(o4 o4Var) {
        this.a = this.d.apply(this.a, ((b4) o4Var).a);
    }

    @Override // j$.util.stream.j5
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.j5
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    public b4(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, m mVar) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = mVar;
    }
}
