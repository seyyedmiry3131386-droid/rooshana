package defpackage;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class lw7 implements dc1 {
    public final kw7 a;
    public final fc1[] e;
    public final gc1[] f;
    public int g;
    public int h;
    public fc1 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public lw7(fc1[] fc1VarArr, gc1[] gc1VarArr) {
        this.e = fc1VarArr;
        this.g = fc1VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = g();
        }
        this.f = gc1VarArr;
        this.h = gc1VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = h();
        }
        kw7 kw7Var = new kw7(this);
        this.a = kw7Var;
        kw7Var.start();
    }

    @Override // defpackage.dc1
    public final void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.dc1
    public final void b(long j) {
        synchronized (this.b) {
            try {
                vy2.s(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dc1
    public final Object e() {
        fc1 fc1Var;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                vy2.s(this.i == null);
                int i = this.g;
                if (i == 0) {
                    fc1Var = null;
                } else {
                    fc1[] fc1VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    fc1Var = fc1VarArr[i2];
                }
                this.i = fc1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fc1Var;
    }

    @Override // defpackage.dc1
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                fc1 fc1Var = this.i;
                if (fc1Var != null) {
                    fc1Var.f();
                    fc1[] fc1VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    fc1VarArr[i] = fc1Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    fc1 fc1Var2 = (fc1) this.c.removeFirst();
                    fc1Var2.f();
                    fc1[] fc1VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    fc1VarArr2[i2] = fc1Var2;
                }
                while (!this.d.isEmpty()) {
                    ((gc1) this.d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract fc1 g();

    public abstract gc1 h();

    public abstract DecoderException i(Throwable th);

    public abstract DecoderException j(fc1 fc1Var, gc1 gc1Var, boolean z);

    public final boolean k() {
        DecoderException decoderExceptionI;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            fc1 fc1Var = (fc1) this.c.removeFirst();
            gc1[] gc1VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            gc1 gc1Var = gc1VarArr[i];
            boolean z = this.k;
            this.k = false;
            if (fc1Var.d(4)) {
                gc1Var.b(4);
            } else {
                gc1Var.c = fc1Var.g;
                if (fc1Var.d(134217728)) {
                    gc1Var.b(134217728);
                }
                if (!m(fc1Var.g)) {
                    gc1Var.d = true;
                }
                try {
                    decoderExceptionI = j(fc1Var, gc1Var, z);
                } catch (OutOfMemoryError e) {
                    decoderExceptionI = i(e);
                } catch (RuntimeException e2) {
                    decoderExceptionI = i(e2);
                }
                if (decoderExceptionI != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionI;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || gc1Var.d) {
                        gc1Var.g();
                    } else {
                        this.d.addLast(gc1Var);
                    }
                    fc1Var.f();
                    fc1[] fc1VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    fc1VarArr[i2] = fc1Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.dc1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final gc1 d() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (gc1) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.m;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // defpackage.dc1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void f(fc1 fc1Var) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                vy2.j(fc1Var == this.i);
                this.c.addLast(fc1Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(gc1 gc1Var) {
        synchronized (this.b) {
            gc1Var.f();
            gc1[] gc1VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            gc1VarArr[i] = gc1Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }
}
