package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public final class q {
    public final ReusableCountLatch$Sync a = new ReusableCountLatch$Sync();

    public final void a() {
        int i = ReusableCountLatch$Sync.a;
        this.a.releaseShared(1);
    }

    public final int b() {
        return ReusableCountLatch$Sync.a(this.a);
    }

    public final void c() {
        ReusableCountLatch$Sync.b(this.a);
    }
}
