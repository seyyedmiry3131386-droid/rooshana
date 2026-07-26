package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends h0 {
    public static final b0 c;
    public static final b0 d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new Optional(this.b);
        }
        return null;
    }

    static {
        w6 w6Var = w6.REFERENCE;
        d0 d0Var = new d0(4);
        d0 d0Var2 = new d0(5);
        Optional optional = Optional.b;
        c = new b0(true, w6Var, optional, d0Var, d0Var2);
        d = new b0(false, w6Var, optional, new d0(4), new d0(5));
    }
}
