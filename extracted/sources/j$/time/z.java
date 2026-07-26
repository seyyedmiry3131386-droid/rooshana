package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements j$.time.temporal.m, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final w c;

    @Override // j$.time.chrono.j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.w(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.i(this, (j$.time.chrono.j) obj);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.m a() {
        return ((g) f()).a();
    }

    public static z C(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new z(localDateTime, wVar, (ZoneOffset) wVar);
        }
        j$.time.zone.f fVarC = wVar.C();
        List listF = fVarC.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listF.get(0), "offset");
            }
        } else {
            Object objE = fVarC.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.I(Duration.i(bVar.d.a - bVar.c.a, 0).a);
            zoneOffset = bVar.d;
        }
        return new z(localDateTime, wVar, zoneOffset);
    }

    public static z o(long j, int i, w wVar) {
        ZoneOffset zoneOffsetD = wVar.C().d(Instant.D(j, i));
        return new z(LocalDateTime.G(j, i, zoneOffsetD), wVar, zoneOffsetD);
    }

    public z(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = wVar;
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
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).b;
            }
            return this.a.k(pVar);
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = y.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.a;
            }
            return this.a.i(pVar);
        }
        return j$.com.android.tools.r8.a.m(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = y.a[((j$.time.temporal.a) pVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.w(pVar) : this.b.a : j$.com.android.tools.r8.a.w(this);
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final w v() {
        return this.c;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j r(w wVar) {
        Objects.requireNonNull(wVar, "zone");
        return this.c.equals(wVar) ? this : C(this.a, wVar, this.b);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e p() {
        return this.a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b f() {
        return this.a.a;
    }

    @Override // j$.time.chrono.j
    public final j b() {
        return this.a.b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return C(LocalDateTime.F(gVar, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i = y.a[aVar.ordinal()];
            if (i == 1) {
                return o(j, this.a.b.d, this.c);
            }
            if (i != 2) {
                return C(this.a.c(j, pVar), this.c, this.b);
            }
            ZoneOffset zoneOffsetI = ZoneOffset.I(aVar.b.a(j, aVar));
            return (zoneOffsetI.equals(this.b) || !this.c.C().f(this.a).contains(zoneOffsetI)) ? this : new z(this.a, this.c, zoneOffsetI);
        }
        return (z) pVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final z d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return (z) rVar.i(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) rVar;
        if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return C(this.a.d(j, rVar), this.c, this.b);
        }
        LocalDateTime localDateTimeD = this.a.d(j, rVar);
        ZoneOffset zoneOffset = this.b;
        w wVar = this.c;
        Objects.requireNonNull(localDateTimeD, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(wVar, "zone");
        if (wVar.C().f(localDateTimeD).contains(zoneOffset)) {
            return new z(localDateTimeD, wVar, zoneOffset);
        }
        localDateTimeD.getClass();
        return o(j$.com.android.tools.r8.a.v(localDateTimeD, zoneOffset), localDateTimeD.b.d, wVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.f) {
            return this.a.a;
        }
        return j$.com.android.tools.r8.a.t(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.a.equals(zVar.a) && this.b.equals(zVar.b) && this.c.equals(zVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.a) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.a.toString() + this.b.b;
        ZoneOffset zoneOffset = this.b;
        w wVar = this.c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
