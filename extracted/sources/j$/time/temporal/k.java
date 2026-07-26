package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum k implements p {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient t b;
    public final transient long c;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = t.e((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.p
    public final t k() {
        return this.b;
    }

    @Override // j$.time.temporal.p
    public final m o(m mVar, long j) {
        if (!this.b.d(j)) {
            throw new j$.time.b("Invalid value: " + this.a + " " + j);
        }
        return mVar.c(j$.com.android.tools.r8.a.S(j, this.c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final boolean i(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final t j(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.e(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final long l(TemporalAccessor temporalAccessor) {
        return temporalAccessor.w(a.EPOCH_DAY) + this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
