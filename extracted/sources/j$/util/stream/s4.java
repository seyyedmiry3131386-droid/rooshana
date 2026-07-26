package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s4 extends u4 implements i5 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Long l) {
        t3.I(this, l);
    }

    @Override // j$.util.stream.p4, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.o4
    public final void i(o4 o4Var) {
        this.b += ((u4) o4Var).b;
    }

    @Override // j$.util.stream.u4, j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b++;
    }
}
