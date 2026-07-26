package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class q4 extends u4 implements g5 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.g5
    public final /* synthetic */ void n(Double d) {
        t3.E(this, d);
    }

    @Override // j$.util.stream.p4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.o4
    public final void i(o4 o4Var) {
        this.b += ((u4) o4Var).b;
    }

    @Override // j$.util.stream.u4, j$.util.stream.j5
    public final void accept(double d) {
        this.b++;
    }
}
