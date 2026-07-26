package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            ZoneOffset zoneOffset = this.b;
            localDateTime.getClass();
            long jV = j$.com.android.tools.r8.a.v(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            ZoneOffset zoneOffset2 = offsetDateTime2.b;
            localDateTime2.getClass();
            iCompare = Long.compare(jV, j$.com.android.tools.r8.a.v(localDateTime2, zoneOffset2));
            if (iCompare == 0) {
                iCompare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.f;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime C(Instant instant, w wVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(wVar, "zone");
        ZoneOffset zoneOffsetD = wVar.C().d(instant);
        return new OffsetDateTime(LocalDateTime.G(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final OffsetDateTime E(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.k(pVar);
            }
            return ((j$.time.temporal.a) pVar).b;
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = o.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.a;
            }
            return this.a.i(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = o.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.w(pVar) : this.b.a;
        }
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.v(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        LocalDateTime localDateTime = this.a;
        return E(localDateTime.L(gVar, localDateTime.b), this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i = o.a[aVar.ordinal()];
            if (i == 1) {
                return C(Instant.D(j, this.a.b.d), this.b);
            }
            if (i == 2) {
                return E(this.a, ZoneOffset.I(aVar.b.a(j, aVar)));
            }
            return E(this.a.c(j, pVar), this.b);
        }
        return (OffsetDateTime) pVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            return E(this.a.d(j, rVar), this.b);
        }
        return (OffsetDateTime) rVar.i(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.d || aVar == j$.time.temporal.q.e) {
            return this.b;
        }
        if (aVar == j$.time.temporal.q.a) {
            return null;
        }
        if (aVar == j$.time.temporal.q.f) {
            return this.a.a;
        }
        if (aVar == j$.time.temporal.q.g) {
            return this.a.b;
        }
        if (aVar == j$.time.temporal.q.b) {
            return j$.time.chrono.t.c;
        }
        if (aVar == j$.time.temporal.q.c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.a.a.x(), j$.time.temporal.a.EPOCH_DAY).c(this.a.b.N(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.b;
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
