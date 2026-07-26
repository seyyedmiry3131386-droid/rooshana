package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends x2 implements b2 {
    @Override // j$.util.stream.d2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.S(this, consumer);
    }

    @Override // j$.util.stream.x2, j$.util.stream.d2
    public final /* synthetic */ d2 j(long j, long j2, IntFunction intFunction) {
        return t3.V(this, j, j2);
    }

    @Override // j$.util.stream.x2, j$.util.stream.d2
    public final /* bridge */ /* synthetic */ d2 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.x2, j$.util.stream.d2
    public final c2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        t3.P(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.c2
    public final /* bridge */ /* synthetic */ Object b() {
        return t3.f;
    }

    @Override // j$.util.stream.d2
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.d2
    public final /* bridge */ /* synthetic */ j$.util.e1 spliterator() {
        return Spliterators.c;
    }
}
