package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends h0 implements h5 {
    public static final b0 c;
    public static final b0 d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.h0, j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i) {
        n(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.d0(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        w6 w6Var = w6.INT_VALUE;
        d0 d0Var = new d0(0);
        d0 d0Var2 = new d0(1);
        j$.util.d0 d0Var3 = j$.util.d0.c;
        c = new b0(true, w6Var, d0Var3, d0Var, d0Var2);
        d = new b0(false, w6Var, d0Var3, new d0(0), new d0(1));
    }
}
