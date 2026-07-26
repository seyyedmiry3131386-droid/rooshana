package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yi1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi1 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ ca7 d;

    public /* synthetic */ yi1(zi1 zi1Var, Runnable runnable, ca7 ca7Var, int i) {
        this.a = i;
        this.b = zi1Var;
        this.c = runnable;
        this.d = ca7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i = 0;
                final Runnable runnable = this.c;
                final ca7 ca7Var = this.d;
                executorService.execute(new Runnable() { // from class: vi1
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((bj1) ca7Var.b).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((bj1) ca7Var.b).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                bj1 bj1Var = (bj1) ca7Var.b;
                                try {
                                    runnable2.run();
                                    bj1Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    bj1Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.b.a;
                final int i2 = 2;
                final Runnable runnable2 = this.c;
                final ca7 ca7Var2 = this.d;
                executorService2.execute(new Runnable() { // from class: vi1
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((bj1) ca7Var2.b).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((bj1) ca7Var2.b).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                bj1 bj1Var = (bj1) ca7Var2.b;
                                try {
                                    runnable22.run();
                                    bj1Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    bj1Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.b.a;
                final int i3 = 1;
                final Runnable runnable3 = this.c;
                final ca7 ca7Var3 = this.d;
                executorService3.execute(new Runnable() { // from class: vi1
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((bj1) ca7Var3.b).k(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((bj1) ca7Var3.b).k(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                bj1 bj1Var = (bj1) ca7Var3.b;
                                try {
                                    runnable22.run();
                                    bj1Var.j(null);
                                    return;
                                } catch (Exception e3) {
                                    bj1Var.k(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
