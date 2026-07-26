package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kb0 {
    public static final kb0 e = new kb0(-9223372036854775807L, -3, -1);
    public static kb0 f;
    public final /* synthetic */ int a = 1;
    public long b;
    public long c;
    public int d;

    public /* synthetic */ kb0() {
    }

    public static void c(kb0 kb0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (kb0Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = kb0Var.b + j;
                kb0Var.b = j3;
                long j4 = kb0Var.c + j2;
                kb0Var.c = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d2) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.d = 1;
            this.b = -1L;
            this.c = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.d = 0;
                this.b = -1L;
                this.c = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.b = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.c = jRound;
            if (jRound >= j || this.b <= j) {
                this.d = 1;
            } else {
                this.d = 0;
            }
        }
    }

    public synchronized long b() {
        return this.b - this.c;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "WindowCounter(streamId=" + this.d + ", total=" + this.b + ", acknowledged=" + this.c + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public kb0(int i) {
        this.d = i;
    }

    public kb0(long j, int i, long j2) {
        this.d = i;
        this.b = j;
        this.c = j2;
    }
}
