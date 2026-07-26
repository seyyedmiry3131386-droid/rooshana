package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ l(a0 a0Var, int i) {
        this.a = i;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((m) this.b).c(5000L);
                break;
            default:
                ((o) this.b).c(5000L);
                break;
        }
    }
}
