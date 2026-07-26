package defpackage;

import com.google.common.util.concurrent.b;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Runnable {
    public final b a;
    public final n94 b;

    public f0(b bVar, n94 n94Var) {
        this.a = bVar;
        this.b = n94Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (b.f.n(this.a, this, b.h(this.b))) {
            b.d(this.a, false);
        }
    }
}
