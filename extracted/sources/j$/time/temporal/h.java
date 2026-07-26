package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements p {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ h[] b;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final t k() {
                return t.f(90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.DAY_OF_YEAR) || !temporalAccessor.e(a.MONTH_OF_YEAR) || !temporalAccessor.e(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.a;
                return j$.com.android.tools.r8.a.K(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final t j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                long jW = temporalAccessor.w(h.QUARTER_OF_YEAR);
                if (jW == 1) {
                    long jW2 = temporalAccessor.w(a.YEAR);
                    j$.time.chrono.t.c.getClass();
                    return j$.time.chrono.t.j(jW2) ? t.e(1L, 91L) : t.e(1L, 90L);
                }
                if (jW == 2) {
                    return t.e(1L, 91L);
                }
                if (jW == 3 || jW == 4) {
                    return t.e(1L, 92L);
                }
                return k();
            }

            @Override // j$.time.temporal.p
            public final long l(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                int i = temporalAccessor.i(a.DAY_OF_YEAR);
                int i2 = temporalAccessor.i(a.MONTH_OF_YEAR);
                long jW = temporalAccessor.w(a.YEAR);
                int i3 = (i2 - 1) / 3;
                j$.time.chrono.t.c.getClass();
                return i - h.a[i3 + (j$.time.chrono.t.j(jW) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final m o(m mVar, long j) {
                long jL = l(mVar);
                k().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.c((j - jL) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final t k() {
                return t.e(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.a;
                return j$.com.android.tools.r8.a.K(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final long l(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.w(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final t j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return k();
            }

            @Override // j$.time.temporal.p
            public final m o(m mVar, long j) {
                long jL = l(mVar);
                k().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.c(((j - jL) * 3) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final t k() {
                return t.f(52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.a;
                return j$.com.android.tools.r8.a.K(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final t j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new s("Unsupported field: WeekOfWeekBasedYear");
                }
                return t.e(1L, h.C(h.w(j$.time.g.E(temporalAccessor))));
            }

            @Override // j$.time.temporal.p
            public final long l(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new s("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.s(j$.time.g.E(temporalAccessor));
            }

            @Override // j$.time.temporal.p
            public final m o(m mVar, long j) {
                k().b(j, this);
                return mVar.d(j$.com.android.tools.r8.a.S(j, l(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.p
            public final t k() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.a;
                return j$.com.android.tools.r8.a.K(temporalAccessor).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.p
            public final long l(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return h.w(j$.time.g.E(temporalAccessor));
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final t j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                return k();
            }

            @Override // j$.time.temporal.p
            public final m o(m mVar, long j) {
                if (!i(mVar)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.b.a(j, h.WEEK_BASED_YEAR);
                j$.time.g gVarE = j$.time.g.E(mVar);
                int i = gVarE.i(a.DAY_OF_WEEK);
                int iS = h.s(gVarE);
                if (iS == 53 && h.C(iA) == 52) {
                    iS = 52;
                }
                return mVar.j(j$.time.g.K(iA, 1, 4).N(((iS - 1) * 7) + (i - r6.i(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int C(int i) {
        j$.time.g gVarK = j$.time.g.K(i, 1, 1);
        if (gVarK.G() != j$.time.d.THURSDAY) {
            return (gVarK.G() == j$.time.d.WEDNESDAY && gVarK.I()) ? 53 : 52;
        }
        return 53;
    }

    public static int s(j$.time.g gVar) {
        int iOrdinal = gVar.G().ordinal();
        int iH = gVar.H() - 1;
        int i = (3 - iOrdinal) + iH;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iH < i3) {
            return (int) t.e(1L, C(w(gVar.T(180).P(-1L)))).d;
        }
        int i4 = ((iH - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && gVar.I())) {
            return i4;
        }
        return 1;
    }

    public static int w(j$.time.g gVar) {
        int i = gVar.a;
        int iH = gVar.H();
        if (iH <= 3) {
            return iH - gVar.G().ordinal() < -2 ? i - 1 : i;
        }
        if (iH >= 363) {
            return ((iH - 363) - (gVar.I() ? 1 : 0)) - gVar.G().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
