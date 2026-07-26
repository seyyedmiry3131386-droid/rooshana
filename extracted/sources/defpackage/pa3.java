package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pa3 extends oa3 {
    public static final sk6 x;
    public long w;

    static {
        sk6 sk6Var = new sk6(2);
        x = sk6Var;
        sk6Var.J(0, new String[]{"holder_description"}, new int[]{1}, new int[]{js6.holder_description});
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.w = 0L;
        }
        this.v.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.w != 0) {
                    return true;
                }
                return this.v.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.w = 2L;
        }
        this.v.g0();
        k0();
    }
}
