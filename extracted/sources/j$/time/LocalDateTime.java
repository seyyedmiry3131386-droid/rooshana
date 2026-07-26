package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, j$.time.chrono.e, Serializable {
    public static final LocalDateTime c = F(g.d, j.e);
    public static final LocalDateTime d = F(g.e, j.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final g a;
    public final j b;

    @Override // j$.time.chrono.e
    public final j$.time.chrono.m a() {
        return ((g) f()).a();
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.j m(ZoneOffset zoneOffset) {
        return z.C(this, zoneOffset, null);
    }

    public static LocalDateTime F(g gVar, j jVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(jVar, "time");
        return new LocalDateTime(gVar, jVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(((g) f()).x(), j$.time.temporal.a.EPOCH_DAY).c(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime G(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.s(j2);
        long j3 = j + ((long) zoneOffset.a);
        long j4 = 86400;
        return new LocalDateTime(g.L(j$.com.android.tools.r8.a.R(j3, j4)), j.G((((long) ((int) j$.com.android.tools.r8.a.Q(j3, j4))) * 1000000000) + j2));
    }

    public static LocalDateTime D(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof z)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(g.E(temporalAccessor), j.E(temporalAccessor));
            } catch (b e) {
                throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
            }
        }
        return ((z) temporalAccessor).a;
    }

    public LocalDateTime(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    public final LocalDateTime L(g gVar, j jVar) {
        return (this.a == gVar && this.b == jVar) ? this : new LocalDateTime(gVar, jVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.i(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.w();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).w()) {
                j jVar = this.b;
                jVar.getClass();
                return j$.time.temporal.q.d(jVar, pVar);
            }
            return this.a.k(pVar);
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).w() ? this.b.i(pVar) : this.a.i(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).w() ? this.b.w(pVar) : this.a.w(pVar);
        }
        return pVar.l(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.chrono.b f() {
        return this.a;
    }

    @Override // j$.time.chrono.e
    public final j b() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return L(gVar, this.b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).w()) {
                return L(this.a, this.b.c(j, pVar));
            }
            return L(this.a.c(j, pVar), this.b);
        }
        return (LocalDateTime) pVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) rVar.i(this, j);
        }
        switch (h.a[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return J(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime localDateTimeL = L(this.a.N(j / 86400000000L), this.b);
                return localDateTimeL.J(localDateTimeL.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeL2 = L(this.a.N(j / 86400000), this.b);
                return localDateTimeL2.J(localDateTimeL2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return I(j);
            case 5:
                return J(this.a, 0L, j, 0L, 0L);
            case 6:
                return J(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeL3 = L(this.a.N(j / 256), this.b);
                return localDateTimeL3.J(localDateTimeL3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return L(this.a.d(j, rVar), this.b);
        }
    }

    public final LocalDateTime I(long j) {
        return J(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    public final LocalDateTime J(g gVar, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return L(gVar, this.b);
        }
        long j5 = 1;
        long jN = this.b.N();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + jN;
        long jR = j$.com.android.tools.r8.a.R(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long jQ = j$.com.android.tools.r8.a.Q(j6, 86400000000000L);
        return L(gVar.N(jR), jQ == jN ? this.b : j.G(jQ));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f) {
            return this.a;
        }
        return j$.com.android.tools.r8.a.s(this, aVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return C((LocalDateTime) eVar);
        }
        return j$.com.android.tools.r8.a.h(this, eVar);
    }

    public final int C(LocalDateTime localDateTime) {
        int iC = this.a.C(localDateTime.a);
        return iC == 0 ? this.b.compareTo(localDateTime.b) : iC;
    }

    public final boolean E(j$.time.chrono.e eVar) {
        if (eVar instanceof LocalDateTime) {
            return C((LocalDateTime) eVar) < 0;
        }
        long jX = this.a.x();
        long jX2 = eVar.f().x();
        if (jX >= jX2) {
            return jX == jX2 && this.b.N() < eVar.b().N();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
