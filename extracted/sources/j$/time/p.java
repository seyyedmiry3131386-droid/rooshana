package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final j a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        if (this.b.equals(pVar.b)) {
            return this.a.compareTo(pVar.a);
        }
        int iCompare = Long.compare(this.a.N() - (((long) this.b.a) * 1000000000), pVar.a.N() - (((long) pVar.b.a) * 1000000000));
        return iCompare == 0 ? this.a.compareTo(pVar.a) : iCompare;
    }

    static {
        j jVar = j.e;
        ZoneOffset zoneOffset = ZoneOffset.f;
        jVar.getClass();
        new p(jVar, zoneOffset);
        j jVar2 = j.f;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        jVar2.getClass();
        new p(jVar2, zoneOffset2);
    }

    public p(j jVar, ZoneOffset zoneOffset) {
        this.a = (j) Objects.requireNonNull(jVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final p D(j jVar, ZoneOffset zoneOffset) {
        return (this.a == jVar && this.b.equals(zoneOffset)) ? this : new p(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).w() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                j jVar = this.a;
                jVar.getClass();
                return j$.time.temporal.q.d(jVar, pVar);
            }
            return ((j$.time.temporal.a) pVar).b;
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.a;
            }
            return this.a.w(pVar);
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
                return D(this.a, ZoneOffset.I(aVar.b.a(j, aVar)));
            }
            return D(this.a.c(j, pVar), this.b);
        }
        return (p) pVar.o(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final p d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            return D(this.a.d(j, rVar), this.b);
        }
        return (p) rVar.i(this, j);
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
        if (((aVar == j$.time.temporal.q.a) || (aVar == j$.time.temporal.q.b)) || aVar == j$.time.temporal.q.f) {
            return null;
        }
        if (aVar == j$.time.temporal.q.g) {
            return this.a;
        }
        if (aVar == j$.time.temporal.q.c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(this.a.N(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
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
        return new r((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (p) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
