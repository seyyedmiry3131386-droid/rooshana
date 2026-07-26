package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum a implements p {
    NANO_OF_SECOND("NanoOfSecond", t.e(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", t.e(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", t.e(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", t.e(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", t.e(0, 999)),
    MILLI_OF_DAY("MilliOfDay", t.e(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", t.e(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", t.e(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", t.e(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", t.e(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", t.e(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", t.e(1, 12)),
    HOUR_OF_DAY("HourOfDay", t.e(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", t.e(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", t.e(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", t.e(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", t.e(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", t.e(1, 7)),
    DAY_OF_MONTH("DayOfMonth", t.f(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", t.f(365, 366)),
    EPOCH_DAY("EpochDay", t.e(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", t.f(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", t.e(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", t.e(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", t.e(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", t.f(999999999, 1000000000)),
    YEAR("Year", t.e(-999999999, 999999999), 0),
    ERA("Era", t.e(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", t.e(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", t.e(-64800, 64800));

    public final String a;
    public final t b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, t tVar) {
        this.a = str;
        this.b = tVar;
    }

    a(String str, t tVar, int i) {
        this.a = str;
        this.b = tVar;
    }

    @Override // j$.time.temporal.p
    public final t k() {
        return this.b;
    }

    public final void s(long j) {
        this.b.b(j, this);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean w() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.p
    public final boolean i(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(this);
    }

    @Override // j$.time.temporal.p
    public final t j(TemporalAccessor temporalAccessor) {
        return temporalAccessor.k(this);
    }

    @Override // j$.time.temporal.p
    public final long l(TemporalAccessor temporalAccessor) {
        return temporalAccessor.w(this);
    }

    @Override // j$.time.temporal.p
    public final m o(m mVar, long j) {
        return mVar.c(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
