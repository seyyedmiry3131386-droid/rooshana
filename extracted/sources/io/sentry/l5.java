package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 extends n4 {
    public final Date a;
    public final long b;

    public l5(Date date, long j) {
        this.a = date;
        this.b = j;
    }

    @Override // io.sentry.n4, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(n4 n4Var) {
        if (!(n4Var instanceof l5)) {
            return super.compareTo(n4Var);
        }
        l5 l5Var = (l5) n4Var;
        long time = this.a.getTime();
        long time2 = l5Var.a.getTime();
        return time == time2 ? Long.valueOf(this.b).compareTo(Long.valueOf(l5Var.b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.n4
    public final long b(n4 n4Var) {
        return n4Var instanceof l5 ? this.b - ((l5) n4Var).b : super.b(n4Var);
    }

    @Override // io.sentry.n4
    public final long c(n4 n4Var) {
        if (n4Var == null || !(n4Var instanceof l5)) {
            return super.c(n4Var);
        }
        l5 l5Var = (l5) n4Var;
        long j = l5Var.b;
        int iCompareTo = compareTo(n4Var);
        long j2 = this.b;
        if (iCompareTo < 0) {
            return d() + (j - j2);
        }
        return l5Var.d() + (j2 - j);
    }

    @Override // io.sentry.n4
    public final long d() {
        return this.a.getTime() * 1000000;
    }

    public l5() {
        this(io.sentry.config.a.z(), System.nanoTime());
    }
}
