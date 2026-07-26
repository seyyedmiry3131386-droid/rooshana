package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r4 extends u4 implements h5 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.h5
    public final /* synthetic */ void d(Integer num) {
        t3.G(this, num);
    }

    @Override // j$.util.stream.p4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.o4
    public final void i(o4 o4Var) {
        this.b += ((u4) o4Var).b;
    }

    @Override // j$.util.stream.u4, j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i) {
        this.b++;
    }
}
