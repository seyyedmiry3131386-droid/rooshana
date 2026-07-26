package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    static {
        D(-31557014167219200L, 0L);
        D(31556889864403199L, 999999999L);
    }

    public static Instant D(long j, long j2) {
        return C(j$.com.android.tools.r8.a.N(j, j$.com.android.tools.r8.a.R(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.Q(j2, 1000000000L));
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return C(j$.com.android.tools.r8.a.R(j, j2), ((int) j$.com.android.tools.r8.a.Q(j, j2)) * 1000000);
    }

    public static Instant C(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.q.d(this, pVar).a(pVar.l(this), pVar);
        }
        int i = e.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i2 = e.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
            }
            i = this.b / 1000000;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.s(j);
        int i = e.a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.b) {
                    return C(this.a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * 1000000;
                if (i3 != this.b) {
                    return C(this.a, i3);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
                }
                if (j != this.a) {
                    return C(j, this.b);
                }
            }
        } else if (j != this.b) {
            return C(this.a, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (Instant) rVar.i(this, j);
        }
        switch (e.b[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return E(0L, j);
            case 2:
                return E(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return E(j / 1000, (j % 1000) * 1000000);
            case 4:
                return E(j, 0L);
            case 5:
                return E(j$.com.android.tools.r8.a.M(j, 60), 0L);
            case 6:
                return E(j$.com.android.tools.r8.a.M(j, 3600), 0L);
            case 7:
                return E(j$.com.android.tools.r8.a.M(j, 43200), 0L);
            case 8:
                return E(j$.com.android.tools.r8.a.M(j, 86400), 0L);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public final Instant E(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return D(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.c) {
            return j$.time.temporal.b.NANOS;
        }
        if (aVar == j$.time.temporal.q.b || aVar == j$.time.temporal.q.a || aVar == j$.time.temporal.q.e || aVar == j$.time.temporal.q.d || aVar == j$.time.temporal.q.f || aVar == j$.time.temporal.q.g) {
            return null;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.a, j$.time.temporal.a.INSTANT_SECONDS).c(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (Instant) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
