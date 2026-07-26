package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient j$.time.j b;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.s(this, aVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int compareTo(e eVar) {
        return j$.com.android.tools.r8.a.h(this, eVar);
    }

    public static g C(m mVar, j$.time.temporal.m mVar2) {
        g gVar = (g) mVar2;
        if (mVar.equals(gVar.a.a())) {
            return gVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + gVar.a.a().h());
    }

    public g(b bVar, j$.time.j jVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(jVar, "time");
        this.a = bVar;
        this.b = jVar;
    }

    public final g G(j$.time.temporal.m mVar, j$.time.j jVar) {
        b bVar = this.a;
        return (bVar == mVar && this.b == jVar) ? this : new g(d.C(bVar.a(), mVar), jVar);
    }

    @Override // j$.time.chrono.e
    public final m a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.e
    public final b f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return C(this.a.a(), j$.time.temporal.q.b(this, j, bVar));
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.chrono.e
    public final j$.time.j b() {
        return this.b;
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
            if (!((j$.time.temporal.a) pVar).w()) {
                return this.a.k(pVar);
            }
            j$.time.j jVar = this.b;
            jVar.getClass();
            return j$.time.temporal.q.d(jVar, pVar);
        }
        return pVar.j(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).w() ? this.b.i(pVar) : this.a.i(pVar);
        }
        return k(pVar).a(w(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).w() ? this.b.w(pVar) : this.a.w(pVar);
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return G(gVar, this.b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final g c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).w()) {
                return G(this.a, this.b.c(j, pVar));
            }
            return G(this.a.c(j, pVar), this.b);
        }
        return C(this.a.a(), pVar.o(this, j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final g d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.b)) {
            return C(this.a.a(), rVar.i(this, j));
        }
        switch (f.a[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return E(this.a, 0L, 0L, 0L, j);
            case 2:
                g gVarG = G(this.a.d(j / 86400000000L, (j$.time.temporal.r) j$.time.temporal.b.DAYS), this.b);
                return gVarG.E(gVarG.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g gVarG2 = G(this.a.d(j / 86400000, (j$.time.temporal.r) j$.time.temporal.b.DAYS), this.b);
                return gVarG2.E(gVarG2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return E(this.a, 0L, 0L, j, 0L);
            case 5:
                return E(this.a, 0L, j, 0L, 0L);
            case 6:
                return E(this.a, j, 0L, 0L, 0L);
            case 7:
                g gVarG3 = G(this.a.d(j / 256, (j$.time.temporal.r) j$.time.temporal.b.DAYS), this.b);
                return gVarG3.E(gVarG3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return G(this.a.d(j, rVar), this.b);
        }
    }

    public final g E(b bVar, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return G(bVar, this.b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jN = this.b.N();
        long j7 = j6 + jN;
        long jR = j$.com.android.tools.r8.a.R(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jQ = j$.com.android.tools.r8.a.Q(j7, 86400000000000L);
        return G(bVar.d(jR, (j$.time.temporal.r) j$.time.temporal.b.DAYS), jQ == jN ? this.b : j$.time.j.G(jQ));
    }

    @Override // j$.time.chrono.e
    public final j m(ZoneOffset zoneOffset) {
        return l.C(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(f().x(), j$.time.temporal.a.EPOCH_DAY).c(b().N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new f0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && j$.com.android.tools.r8.a.h(this, (e) obj) == 0;
    }
}
