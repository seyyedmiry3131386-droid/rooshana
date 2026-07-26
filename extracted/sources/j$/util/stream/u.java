package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends x {
    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final a0 sequential() {
        this.h.r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final a0 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // j$.util.stream.x, j$.util.stream.a0
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEach(doubleConsumer);
        } else {
            x.T0(R0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.x, j$.util.stream.a0
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.h.r) {
            super.forEachOrdered(doubleConsumer);
        } else {
            x.T0(R0()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !v6.ORDERED.l(this.m) ? this : new t(this, v6.r, 0);
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
