package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Comparable {
    public final long a;
    public final long b;

    public q(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        int iCompare = Long.compare(this.b, qVar.b);
        return iCompare != 0 ? iCompare : Long.compare(this.a, qVar.a);
    }
}
