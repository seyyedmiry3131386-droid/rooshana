package defpackage;

import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class sl8 implements Comparable {
    public final long a;

    public /* synthetic */ sl8(long j) {
        this.a = j;
    }

    public static long a(long j) {
        long jA = rx4.a();
        DurationUnit durationUnit = DurationUnit.b;
        js3.p(durationUnit, "unit");
        return (1 | (j - 1)) == Long.MAX_VALUE ? qx1.j(wu8.A(j)) : wu8.H(jA, j, durationUnit);
    }

    public static final long b(long j, long j2) {
        int i = rx4.b;
        DurationUnit durationUnit = DurationUnit.b;
        js3.p(durationUnit, "unit");
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? wu8.A(j) : wu8.H(j, j2, durationUnit);
        }
        if (j != j2) {
            return qx1.j(wu8.A(j2));
        }
        int i2 = qx1.d;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sl8 sl8Var = (sl8) obj;
        js3.p(sl8Var, "other");
        return qx1.c(b(this.a, sl8Var.a), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sl8) {
            return this.a == ((sl8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
