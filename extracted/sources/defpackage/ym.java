package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ym implements Executor {
    public final /* synthetic */ int a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;
    public final Executor e;

    public ym(Executor executor) {
        this.a = 1;
        js3.p(executor, "executor");
        this.e = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    private final void a(Runnable runnable) {
        synchronized (this.d) {
            try {
                this.b.add(new g7(this, runnable, 2));
                if (this.c == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.d) {
            try {
                Runnable runnable = (Runnable) this.b.poll();
                this.c = runnable;
                if (runnable != null) {
                    ((ko9) this.e).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                c();
                return;
            default:
                synchronized (this.d) {
                    Object objPoll = this.b.poll();
                    Runnable runnable = (Runnable) objPoll;
                    this.c = runnable;
                    if (objPoll != null) {
                        this.e.execute(runnable);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                a(runnable);
                return;
            default:
                js3.p(runnable, "command");
                synchronized (this.d) {
                    this.b.offer(new lo4(runnable, this, 27));
                    if (this.c == null) {
                        b();
                    }
                    break;
                }
                return;
        }
    }

    public ym(ko9 ko9Var) {
        this.a = 0;
        this.d = new Object();
        this.b = new ArrayDeque();
        this.e = ko9Var;
    }
}
