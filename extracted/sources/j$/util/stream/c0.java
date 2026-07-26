package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends h0 implements g5 {
    public static final b0 c;
    public static final b0 d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.h0, j$.util.stream.j5
    public final void accept(double d2) {
        n(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.c0(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        w6 w6Var = w6.DOUBLE_VALUE;
        j$.time.format.a aVar = new j$.time.format.a(28);
        j$.time.format.a aVar2 = new j$.time.format.a(29);
        j$.util.c0 c0Var = j$.util.c0.c;
        c = new b0(true, w6Var, c0Var, aVar, aVar2);
        d = new b0(false, w6Var, c0Var, new j$.time.format.a(28), new j$.time.format.a(29));
    }
}
