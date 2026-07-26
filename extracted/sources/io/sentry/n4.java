package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n4 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n4 n4Var) {
        return Long.valueOf(d()).compareTo(Long.valueOf(n4Var.d()));
    }

    public long b(n4 n4Var) {
        return d() - n4Var.d();
    }

    public long c(n4 n4Var) {
        return (n4Var == null || compareTo(n4Var) >= 0) ? d() : n4Var.d();
    }

    public abstract long d();
}
