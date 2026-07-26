package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u7 extends x7 implements j$.util.e1 {
    public abstract void g(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public abstract b7 j(int i);

    @Override // j$.util.e1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (f() != w7.NO_MORE && ((j$.util.e1) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.e1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        b7 b7VarJ = null;
        while (true) {
            w7 w7VarF = f();
            if (w7VarF == w7.NO_MORE) {
                return;
            }
            w7 w7Var = w7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (w7VarF == w7Var) {
                int i = this.c;
                if (b7VarJ == null) {
                    b7VarJ = j(i);
                } else {
                    b7VarJ.b = 0;
                }
                long j = 0;
                while (((j$.util.e1) spliterator).tryAdvance(b7VarJ)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    b7VarJ.a(obj, a(j));
                }
            } else {
                ((j$.util.e1) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
