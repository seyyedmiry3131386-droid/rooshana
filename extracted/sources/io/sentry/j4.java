package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class j4 implements o4 {
    public final o4 a;

    public j4() {
        if (io.sentry.util.h.a || !io.sentry.util.h.b) {
            this.a = new d5(1);
        } else {
            this.a = new d5(0);
        }
    }

    @Override // io.sentry.o4
    public final n4 a() {
        return this.a.a();
    }
}
