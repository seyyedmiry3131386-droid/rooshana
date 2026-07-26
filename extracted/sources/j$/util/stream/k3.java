package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class k3 extends q6 implements b2, u1 {
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

    @Override // j$.util.stream.u1, j$.util.stream.v1
    public final b2 build() {
        return this;
    }

    @Override // j$.util.stream.v1
    public final d2 build() {
        return this;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.j5
    public final void end() {
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ d2 j(long j, long j2, IntFunction intFunction) {
        return t3.V(this, j, j2);
    }

    @Override // j$.util.stream.i5
    public final /* synthetic */ void l(Long l) {
        t3.I(this, l);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return t3.M(this, intFunction);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.d2
    public final /* bridge */ /* synthetic */ d2 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.c2, j$.util.stream.d2
    public final c2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        t3.P(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.s6, j$.util.stream.c2
    public final void f(int i, Object obj) {
        super.f(i, (long[]) obj);
    }

    @Override // j$.util.stream.s6, j$.util.stream.c2
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // j$.util.stream.q6, j$.util.stream.s6, java.lang.Iterable, j$.util.stream.d2
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.q6, j$.util.stream.s6, java.lang.Iterable, j$.util.stream.d2
    public final j$.util.e1 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.j5
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // j$.util.stream.s6, j$.util.stream.c2
    public final Object b() {
        return (long[]) super.b();
    }
}
