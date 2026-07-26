package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum i implements r {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.i(31556952L, 0);
        Duration.i(7889238L, 0);
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.r
    public final m i(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            return mVar.c(j$.com.android.tools.r8.a.N(mVar.i(r0), j), j.c);
        }
        if (i == 2) {
            return mVar.d(j / 4, b.YEARS).d((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
