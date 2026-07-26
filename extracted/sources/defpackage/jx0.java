package defpackage;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class jx0 extends CompletableFuture {
    public final dl0 a;

    public jx0(dl0 dl0Var) {
        this.a = dl0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.a.cancel();
        }
        return super.cancel(z);
    }
}
