package j$.time.chrono;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements b, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.com.android.tools.r8.a.g(this, bVar);
    }

    public abstract b F(long j);

    public abstract b G(long j);

    public abstract b H(long j);

    @Override // j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.p(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.t k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.r(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    public static b C(m mVar, j$.time.temporal.m mVar2) {
        b bVar = (b) mVar2;
        if (mVar.equals(bVar.a())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.h() + ", actual: " + bVar.a().h());
    }

    @Override // j$.time.chrono.b
    public e y(j$.time.j jVar) {
        return new g(this, jVar);
    }

    @Override // j$.time.temporal.m
    public b d(long j, j$.time.temporal.r rVar) {
        boolean z = rVar instanceof j$.time.temporal.b;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
            }
            return C(a(), rVar.i(this, j));
        }
        switch (c.a[((j$.time.temporal.b) rVar).ordinal()]) {
            case 1:
                return F(j);
            case 2:
                return F(j$.com.android.tools.r8.a.M(j, 7));
            case 3:
                return G(j);
            case 4:
                return H(j);
            case 5:
                return H(j$.com.android.tools.r8.a.M(j, 10));
            case 6:
                return H(j$.com.android.tools.r8.a.M(j, 100));
            case 7:
                return H(j$.com.android.tools.r8.a.M(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.N(w(aVar), j), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public n D() {
        return a().q(j$.time.temporal.q.a(this, j$.time.temporal.a.ERA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.com.android.tools.r8.a.g(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long jX = x();
        return ((int) (jX ^ (jX >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b j(j$.time.temporal.n nVar) {
        return C(a(), nVar.o(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jW = w(j$.time.temporal.a.YEAR_OF_ERA);
        long jW2 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long jW3 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(D());
        sb.append(" ");
        sb.append(jW);
        sb.append(jW2 < 10 ? "-0" : "-");
        sb.append(jW2);
        sb.append(jW3 < 10 ? "-0" : "-");
        sb.append(jW3);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public b c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
        return C(a(), pVar.o(this, j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b s(long j, j$.time.temporal.r rVar) {
        return C(a(), j$.time.temporal.q.b(this, j, rVar));
    }

    @Override // j$.time.chrono.b
    public long x() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }
}
