package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class a02 extends ct2 {
    public final /* synthetic */ ct2 p;
    public final /* synthetic */ ThreadPoolExecutor q;

    public a02(ct2 ct2Var, ThreadPoolExecutor threadPoolExecutor) {
        this.p = ct2Var;
        this.q = threadPoolExecutor;
    }

    @Override // defpackage.ct2
    public final void q(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.q(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.ct2
    public final void s(vp7 vp7Var) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        try {
            this.p.s(vp7Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
