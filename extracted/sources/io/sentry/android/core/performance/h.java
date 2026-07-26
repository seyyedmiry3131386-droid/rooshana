package io.sentry.android.core.performance;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Comparable {
    public String a;
    public long b;
    public long c;
    public long d;

    public final long a() {
        long j = this.d;
        if (j != 0) {
            return j - this.c;
        }
        return 0L;
    }

    public final boolean b() {
        return this.c != 0;
    }

    public final void c(long j) {
        this.c = j;
        this.b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((h) obj).b);
    }
}
