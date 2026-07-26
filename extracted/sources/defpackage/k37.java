package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class k37 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ vj3 b;

    public k37(ExecutorService executorService, vj3 vj3Var) {
        this.a = executorService;
        this.b = vj3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
