package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ug1 extends ef7 {
    public static final ug1 d;

    static {
        int i = if8.c;
        int i2 = if8.d;
        long j = if8.e;
        String str = if8.a;
        ug1 ug1Var = new ug1();
        ug1Var.c = new d71(i, i2, j, str);
        d = ug1Var;
    }

    @Override // defpackage.y61
    public final y61 F0(int i) {
        bt2.r(i);
        return i >= if8.c ? this : super.F0(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.y61
    public final String toString() {
        return "Dispatchers.Default";
    }
}
