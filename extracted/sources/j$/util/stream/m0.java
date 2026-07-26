package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends o0 implements i5 {
    public final LongConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Long l) {
        t3.I(this, l);
    }

    @Override // j$.util.stream.b8
    public final Object f(a aVar, Spliterator spliterator) {
        aVar.E0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.b8
    public final /* bridge */ /* synthetic */ Object j(t3 t3Var, Spliterator spliterator) {
        a(t3Var, spliterator);
        return null;
    }

    public m0(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.o0, j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) {
        this.b.accept(j);
    }
}
