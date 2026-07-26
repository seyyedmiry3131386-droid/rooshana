package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 extends o2 implements b2 {
    @Override // j$.util.stream.d2
    public final /* synthetic */ void forEach(Consumer consumer) {
        t3.S(this, consumer);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ d2 j(long j, long j2, IntFunction intFunction) {
        return t3.V(this, j, j2);
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void k(Object[] objArr, int i) {
        t3.P(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.c2
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.d2
    public final Spliterator spliterator() {
        return new e3(this);
    }

    @Override // j$.util.stream.d2
    public final j$.util.e1 spliterator() {
        return new e3(this);
    }
}
