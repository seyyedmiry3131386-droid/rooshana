package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements h1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                s.a.set((c1) this.b);
                break;
            default:
                ((AutoClosableReentrantLock) this.b).unlock();
                break;
        }
    }
}
