package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x18 implements ui3 {
    public final tb2 a;
    public final wn5 b;
    public final Object c = new Object();
    public boolean d;
    public final ph0 e;

    public x18(ph0 ph0Var, tb2 tb2Var, wn5 wn5Var) {
        this.a = tb2Var;
        this.b = wn5Var;
        this.e = ph0Var;
    }

    @Override // defpackage.ui3
    public final s26 Q0() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            ph0 ph0Var = this.e;
            if (ph0Var != null) {
                try {
                    ph0Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.ui3
    public final ph0 d1() {
        ph0 ph0Var;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                ph0Var = this.e;
                if (ph0Var == null) {
                    tb2 tb2Var = this.a;
                    js3.m(null);
                    tb2Var.k0(null);
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph0Var;
    }

    @Override // defpackage.ui3
    public final tb2 getFileSystem() {
        return this.a;
    }

    @Override // defpackage.ui3
    public final wn5 j() {
        return this.b;
    }
}
