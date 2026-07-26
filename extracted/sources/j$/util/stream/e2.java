package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e2 implements IntFunction, LongFunction, BinaryOperator, Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ e2(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 1:
                return t3.i0(j);
            case 2:
            default:
                return t3.t0(j);
            case 3:
                return t3.s0(j);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Object[i];
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            default:
                return new Double[i];
            case 8:
                return new Object[i];
            case 9:
                return new Integer[i];
            case 10:
                return new Long[i];
            case 11:
                return new Double[i];
            case 14:
                return new Integer[i];
            case 15:
                return new Integer[i];
            case 16:
                return new Long[i];
            case 17:
                return new Long[i];
            case 18:
                return new Double[i];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new l2((x1) obj, (x1) obj2);
            case 3:
            case 5:
            default:
                return new p2((d2) obj, (d2) obj2);
            case 4:
                return new m2((z1) obj, (z1) obj2);
            case 6:
                return new n2((b2) obj, (b2) obj2);
        }
    }
}
