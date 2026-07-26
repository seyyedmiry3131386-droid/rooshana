package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient ZoneOffset b;
    public final transient j$.time.w c;

    @Override // j$.time.chrono.j
    public final /* synthetic */ long B() {
        return j$.com.android.tools.r8.a.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.m(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.t(this, aVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.i(this, (j) obj);
    }

    public static l C(j$.time.w wVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new l(wVar, (ZoneOffset) wVar, gVar);
        }
        j$.time.zone.f fVarC = wVar.C();
        LocalDateTime localDateTimeD = LocalDateTime.D(gVar);
        List listF = fVarC.f(localDateTimeD);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            gVar = gVar;
        } else {
            Object objE = fVarC.e(localDateTimeD);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            gVar = gVar.E(gVar.a, 0L, 0L, Duration.i(bVar.d.a - bVar.c.a, 0).a, 0L);
            zoneOffset = bVar.d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(wVar, zoneOffset, gVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((g) p()).k(pVar);
            }
            return ((j$.time.temporal.a) pVar).b;
        }
        return pVar.j(this);
    }

    public static l o(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.h() + ", actual: " + lVar.a().h());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                return B();
            }
            if (i != 2) {
                return ((g) p()).w(pVar);
            }
            return g().a;
        }
        return pVar.l(this);
    }

    public l(j$.time.w wVar, ZoneOffset zoneOffset, g gVar) {
        this.a = (g) Objects.requireNonNull(gVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (j$.time.w) Objects.requireNonNull(wVar, "zone");
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final b f() {
        return ((g) p()).f();
    }

    @Override // j$.time.chrono.j
    public final j$.time.j b() {
        return ((g) p()).b();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.a) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.j
    public final e p() {
        return this.a;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.b;
        ZoneOffset zoneOffset = this.b;
        j$.time.w wVar = this.c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }

    @Override // j$.time.chrono.j
    public final j$.time.w v() {
        return this.c;
    }

    @Override // j$.time.chrono.j
    public final m a() {
        return f().a();
    }

    @Override // j$.time.chrono.j
    public final j r(j$.time.w wVar) {
        return C(wVar, this.b, this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return o(a(), pVar.o(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = k.a[aVar.ordinal()];
        if (i == 1) {
            return d(j - j$.com.android.tools.r8.a.w(this), j$.time.temporal.b.SECONDS);
        }
        if (i != 2) {
            return C(this.c, this.b, this.a.c(j, pVar));
        }
        ZoneOffset zoneOffsetI = ZoneOffset.I(aVar.b.a(j, aVar));
        g gVar = this.a;
        gVar.getClass();
        Instant instantD = Instant.D(j$.com.android.tools.r8.a.v(gVar, zoneOffsetI), gVar.b.d);
        j$.time.w wVar = this.c;
        m mVarA = a();
        ZoneOffset zoneOffsetD = wVar.C().d(instantD);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new l(wVar, zoneOffsetD, (g) mVarA.u(LocalDateTime.G(instantD.getEpochSecond(), instantD.getNano(), zoneOffsetD)));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final l d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            return o(a(), this.a.d(j, rVar).o(this));
        }
        return o(a(), rVar.i(this, j));
    }

    private Object writeReplace() {
        return new f0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && j$.com.android.tools.r8.a.i(this, (j) obj) == 0;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return o(a(), gVar.o(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return o(a(), j$.time.temporal.q.b(this, j, bVar));
    }
}
