package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class le6 {
    public final ke6 a;
    public final je6 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public le6(je6 je6Var, ke6 ke6Var, bm8 bm8Var, int i, Looper looper) {
        this.b = je6Var;
        this.a = ke6Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        vy2.s(!this.f);
        this.f = true;
        n62 n62Var = (n62) this.b;
        if (!n62Var.I && n62Var.j.getThread().isAlive()) {
            n62Var.h.a(14, this).b();
        } else {
            wn5.k0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
