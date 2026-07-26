package io.sentry.cache.tape;

import defpackage.dw1;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final h c = new h(0, 0);
    public final long a;
    public final int b;

    public h(int i, long j) {
        this.a = j;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position=");
        sb.append(this.a);
        sb.append(", length=");
        return dw1.k(this.b, "]", sb);
    }
}
