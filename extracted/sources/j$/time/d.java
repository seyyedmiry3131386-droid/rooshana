package j$.time;

import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements TemporalAccessor, j$.time.temporal.n {
    public static final d FRIDAY;
    public static final d MONDAY;
    public static final d SATURDAY;
    public static final d SUNDAY;
    public static final d THURSDAY;
    public static final d TUESDAY;
    public static final d WEDNESDAY;
    public static final d[] a;
    public static final /* synthetic */ d[] b;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) b.clone();
    }

    static {
        d dVar = new d("MONDAY", 0);
        MONDAY = dVar;
        d dVar2 = new d("TUESDAY", 1);
        TUESDAY = dVar2;
        d dVar3 = new d("WEDNESDAY", 2);
        WEDNESDAY = dVar3;
        d dVar4 = new d("THURSDAY", 3);
        THURSDAY = dVar4;
        d dVar5 = new d("FRIDAY", 4);
        FRIDAY = dVar5;
        d dVar6 = new d("SATURDAY", 5);
        SATURDAY = dVar6;
        d dVar7 = new d("SUNDAY", 6);
        SUNDAY = dVar7;
        b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        a = values();
    }

    public static d C(int i) {
        if (i < 1 || i > 7) {
            throw new b("Invalid value for DayOfWeek: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.DAY_OF_WEEK : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return pVar.k();
        }
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.c) {
            return j$.time.temporal.b.DAYS;
        }
        return j$.time.temporal.q.c(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
