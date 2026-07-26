package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class kx implements Executor {
    public final /* synthetic */ int a;
    public final ArrayDeque b;
    public Runnable c;

    public kx(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayDeque();
                break;
            default:
                this.b = new ArrayDeque();
                break;
        }
    }

    private final synchronized void a(Runnable runnable) {
        this.b.offer(new g6(this, runnable, 7));
        if (this.c == null) {
            c();
        }
    }

    private final synchronized void b(Runnable runnable) {
        this.b.offer(new g6(this, runnable, 6));
        if (this.c == null) {
            c();
        }
    }

    private final synchronized void d() {
        Runnable runnable = (Runnable) this.b.poll();
        this.c = runnable;
        if (runnable != null) {
            mx.f.execute(runnable);
        }
    }

    private final synchronized void e() {
        Runnable runnable = (Runnable) this.b.poll();
        this.c = runnable;
        if (runnable != null) {
            lx.f.execute(runnable);
        }
    }

    public final synchronized void c() {
        switch (this.a) {
            case 0:
                e();
                break;
            default:
                d();
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                b(runnable);
                break;
            default:
                a(runnable);
                break;
        }
    }
}
