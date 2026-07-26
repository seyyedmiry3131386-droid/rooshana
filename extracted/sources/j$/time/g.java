package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j$.time.temporal.m, j$.time.temporal.n, j$.time.chrono.b, Serializable {
    public static final g d = K(-999999999, 1, 1);
    public static final g e = K(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        K(1970, 1, 1);
    }

    public static g K(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.s(i);
        j$.time.temporal.a.MONTH_OF_YEAR.s(i2);
        j$.time.temporal.a.DAY_OF_MONTH.s(i3);
        return D(i, i2, i3);
    }

    public static g L(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.s(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new g(aVar.b.a(j7, aVar), i3, i4);
    }

    public static g E(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        g gVar = (g) temporalAccessor.l(j$.time.temporal.q.f);
        if (gVar != null) {
            return gVar;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static g D(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.c.getClass();
                if (j$.time.chrono.t.j(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new b("Invalid date '" + l.F(i2).name() + " " + i3 + "'");
            }
        }
        return new g(i, i2, i3);
    }

    public static g Q(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.t.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.t.j((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new g(i, i2, i3);
    }

    public g(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.p(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.t.e(1L, J());
        }
        if (i == 2) {
            return j$.time.temporal.t.e(1L, I() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? aVar.b : this.a <= 0 ? j$.time.temporal.t.e(1L, 1000000000L) : j$.time.temporal.t.e(1L, 999999999L);
        }
        return j$.time.temporal.t.e(1L, (l.F(this.b) != l.FEBRUARY || I()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return F(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (pVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return F(pVar);
            }
            return ((((long) this.a) * 12) + ((long) this.b)) - 1;
        }
        return pVar.l(this);
    }

    public final int F(j$.time.temporal.p pVar) {
        switch (f.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return H();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return G().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((H() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((H() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.c;
    }

    public final int H() {
        return (l.F(this.b).C(I()) + this.c) - 1;
    }

    public final d G() {
        return d.C(((int) j$.com.android.tools.r8.a.Q(x() + 3, 7)) + 1);
    }

    public final boolean I() {
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        long j = this.a;
        tVar.getClass();
        return j$.time.chrono.t.j(j);
    }

    public final int J() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : I() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final g j(j$.time.temporal.n nVar) {
        if (nVar instanceof g) {
            return (g) nVar;
        }
        return (g) nVar.o(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final g c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (g) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.s(j);
        switch (f.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return K(this.a, this.b, i);
                }
                return this;
            case 2:
                return T((int) j);
            case 3:
                return N(j$.com.android.tools.r8.a.M(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return U((int) j);
            case 5:
                return N(j - ((long) G().getValue()));
            case 6:
                return N(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return N(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return L(j);
            case 9:
                return N(j$.com.android.tools.r8.a.M(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MONTH_OF_YEAR.s(i2);
                    return Q(this.a, i2, this.c);
                }
                return this;
            case 11:
                return O(j - (((((long) this.a) * 12) + ((long) this.b)) - 1));
            case 12:
                return U((int) j);
            case 13:
                if (w(j$.time.temporal.a.ERA) != j) {
                    return U(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    public final g U(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.s(i);
        return Q(i, this.b, this.c);
    }

    public final g T(int i) {
        if (H() == i) {
            return this;
        }
        int i2 = this.a;
        long j = i2;
        j$.time.temporal.a.YEAR.s(j);
        j$.time.temporal.a.DAY_OF_YEAR.s(i);
        j$.time.chrono.t.c.getClass();
        boolean zJ = j$.time.chrono.t.j(j);
        if (i == 366 && !zJ) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        l lVarF = l.F(((i - 1) / 31) + 1);
        if (i > (lVarF.D(zJ) + lVarF.C(zJ)) - 1) {
            lVarF = l.a[((((int) 1) + 12) + lVarF.ordinal()) % 12];
        }
        return new g(i2, lVarF.getValue(), (i - lVarF.C(zJ)) + 1);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final g d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.b) {
            switch (f.b[((j$.time.temporal.b) rVar).ordinal()]) {
                case 1:
                    return N(j);
                case 2:
                    return N(j$.com.android.tools.r8.a.M(j, 7));
                case 3:
                    return O(j);
                case 4:
                    return P(j);
                case 5:
                    return P(j$.com.android.tools.r8.a.M(j, 10));
                case 6:
                    return P(j$.com.android.tools.r8.a.M(j, 100));
                case 7:
                    return P(j$.com.android.tools.r8.a.M(j, 1000));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return c(j$.com.android.tools.r8.a.N(w(aVar), j), aVar);
                default:
                    throw new j$.time.temporal.s("Unsupported unit: " + rVar);
            }
        }
        return (g) rVar.i(this, j);
    }

    public final g P(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Q(aVar.b.a(((long) this.a) + j, aVar), this.b, this.c);
    }

    public final g O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return Q(aVar.b.a(j$.com.android.tools.r8.a.R(j2, j3), aVar), ((int) j$.com.android.tools.r8.a.Q(j2, j3)) + 1, this.c);
    }

    public final g N(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new g(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long J = J();
                if (j2 <= J) {
                    return new g(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new g(this.a, s + 1, (int) (j2 - J));
                }
                j$.time.temporal.a.YEAR.s(this.a + 1);
                return new g(this.a + 1, 1, (int) (j2 - J));
            }
        }
        return L(j$.com.android.tools.r8.a.N(x(), j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.q.f ? this : j$.com.android.tools.r8.a.r(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e y(j jVar) {
        return LocalDateTime.F(this, jVar);
    }

    @Override // j$.time.chrono.b
    public final long x() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (this.c - 1));
        if (j2 > 2) {
            j4 = !I() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof g) {
            return C((g) bVar);
        }
        return j$.com.android.tools.r8.a.g(this, bVar);
    }

    public final int C(g gVar) {
        int i = this.a - gVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - gVar.b;
        return i2 == 0 ? this.c - gVar.c : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && C((g) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
