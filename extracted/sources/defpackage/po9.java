package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class po9 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ yo9 d;

    public po9(yo9 yo9Var, boolean z) {
        Objects.requireNonNull(yo9Var);
        this.d = yo9Var;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        yo9 yo9Var = this.d;
        if (yo9Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            yo9Var.d(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
