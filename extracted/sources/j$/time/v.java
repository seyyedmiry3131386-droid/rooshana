package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i = this.a - vVar.a;
        return i == 0 ? this.b - vVar.b : i;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final v G(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new v(i, i2);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.e(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        return k(pVar).a(w(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        int i;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i2 = u.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return C();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }

    public final long C() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final v c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (v) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.s(j);
        int i = u.a[aVar.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.s(i2);
            return G(this.a, i2);
        }
        if (i == 2) {
            return E(j - C());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            j$.time.temporal.a.YEAR.s(i3);
            return G(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            j$.time.temporal.a.YEAR.s(i4);
            return G(i4, this.b);
        }
        if (i != 5) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        if (w(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        j$.time.temporal.a.YEAR.s(i5);
        return G(i5, this.b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final v d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            switch (u.b[((j$.time.temporal.b) rVar).ordinal()]) {
                case 1:
                    return E(j);
                case 2:
                    return F(j);
                case 3:
                    return F(j$.com.android.tools.r8.a.M(j, 10));
                case 4:
                    return F(j$.com.android.tools.r8.a.M(j, 100));
                case 5:
                    return F(j$.com.android.tools.r8.a.M(j, 1000));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return c(j$.com.android.tools.r8.a.N(w(aVar), j), aVar);
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + rVar);
            }
        }
        return (v) rVar.i(this, j);
    }

    public final v F(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return G(aVar.b.a(((long) this.a) + j, aVar), this.b);
    }

    public final v E(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return G(aVar.b.a(j$.com.android.tools.r8.a.R(j2, j3), aVar), ((int) j$.com.android.tools.r8.a.Q(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.b) {
            return j$.time.chrono.t.c;
        }
        if (aVar == j$.time.temporal.q.c) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.q.c(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.K(mVar).equals(j$.time.chrono.t.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return mVar.c(C(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.a == vVar.a && this.b == vVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ (this.b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.a);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(g gVar) {
        return (v) j$.com.android.tools.r8.a.a(gVar, this);
    }
}
