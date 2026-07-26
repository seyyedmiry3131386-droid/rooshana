package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends h0 implements i5 {
    public static final b0 c;
    public static final b0 d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.h0, j$.util.stream.j5, java.util.function.LongConsumer
    public final void accept(long j) {
        n(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.e0(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        w6 w6Var = w6.LONG_VALUE;
        d0 d0Var = new d0(2);
        d0 d0Var2 = new d0(3);
        j$.util.e0 e0Var = j$.util.e0.c;
        c = new b0(true, w6Var, e0Var, d0Var, d0Var2);
        d = new b0(false, w6Var, e0Var, new d0(2), new d0(3));
    }
}
