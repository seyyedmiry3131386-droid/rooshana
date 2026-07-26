package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class l3 extends p3 implements g5 {
    public final double[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.g5
    public final /* synthetic */ void n(Double d) {
        t3.E(this, d);
    }

    public l3(Spliterator spliterator, t3 t3Var, double[] dArr) {
        super(spliterator, t3Var, dArr.length);
        this.h = dArr;
    }

    public l3(l3 l3Var, Spliterator spliterator, long j, long j2) {
        super(l3Var, spliterator, j, j2, l3Var.h.length);
        this.h = l3Var.h;
    }

    @Override // j$.util.stream.p3
    public final p3 a(Spliterator spliterator, long j, long j2) {
        return new l3(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.p3, j$.util.stream.j5
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }
}
