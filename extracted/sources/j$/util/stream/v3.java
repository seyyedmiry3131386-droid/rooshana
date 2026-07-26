package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class v3 extends p4 implements o4, i5 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjLongConsumer c;
    public final /* synthetic */ m d;

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.D();
        throw null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        t3.K();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Long l) {
        t3.I(this, l);
    }

    @Override // j$.util.stream.o4
    public final void i(o4 o4Var) {
        this.a = this.d.apply(this.a, ((v3) o4Var).a);
    }

    @Override // j$.util.stream.j5
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    public v3(Supplier supplier, ObjLongConsumer objLongConsumer, m mVar) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = mVar;
    }
}
