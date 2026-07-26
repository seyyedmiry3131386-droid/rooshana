package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends g1 {
    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j1 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j1 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.g1, j$.util.stream.j1
    public final void forEach(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEach(longConsumer);
        } else {
            g1.T0(R0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.g1, j$.util.stream.j1
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.h.r) {
            super.forEachOrdered(longConsumer);
        } else {
            g1.T0(R0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !v6.ORDERED.l(this.m) ? this : new r(this, v6.r, 4);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.a
    public final boolean O0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        throw new UnsupportedOperationException();
    }
}
