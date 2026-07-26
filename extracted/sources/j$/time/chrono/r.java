package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient p a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.j jVar) {
        return new g(this, jVar);
    }

    public r(p pVar, int i, int i2, int i3) {
        pVar.l(i, i2, i3);
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public r(p pVar, long j) {
        int i = (int) j;
        pVar.j();
        if (i < pVar.e || i >= pVar.f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(pVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i2 = pVar.g;
        int[] iArr = {(iBinarySearch + i2) / 12, ((i2 + iBinarySearch) % 12) + 1, (i - pVar.d[iBinarySearch]) + 1};
        this.a = pVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return this.a;
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return s.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.j(this);
        }
        if (!j$.com.android.tools.r8.a.p(this, pVar)) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = q.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.w(aVar) : j$.time.temporal.t.e(1L, 5L) : j$.time.temporal.t.e(1L, this.a.C(this.b, 12)) : j$.time.temporal.t.e(1L, this.a.o(this.b, this.c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        switch (q.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return J();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.Q(x() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return x();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (r) super.c(j, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        this.a.w(aVar).b(j, aVar);
        int i = (int) j;
        switch (q.a[aVar.ordinal()]) {
            case 1:
                return M(this.b, this.c, i);
            case 2:
                return F(Math.min(i, this.a.C(this.b, 12)) - J());
            case 3:
                return F((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return F(j - ((long) (((int) j$.com.android.tools.r8.a.Q(x() + 3, 7)) + 1)));
            case 5:
                return F(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return F(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(this.a, j);
            case 8:
                return F((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return M(this.b, i, this.d);
            case 10:
                return G(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return M(i, this.c, this.d);
            case 12:
                return M(i, this.c, this.d);
            case 13:
                return M(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
    }

    public final r M(int i, int i2, int i3) {
        int iO = this.a.o(i, i2);
        if (i3 > iO) {
            i3 = iO;
        }
        return new r(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: I */
    public final b j(j$.time.temporal.n nVar) {
        return (r) super.j(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return (r) super.j(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.a.l(this.b, this.c, this.d);
    }

    public final int J() {
        return this.a.C(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return M(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final r G(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        p pVar = this.a;
        long jR = j$.com.android.tools.r8.a.R(j2, 12L);
        int i = pVar.g;
        if (jR >= i / 12 && jR <= (((pVar.d.length - 1) + i) / 12) - 1) {
            return M((int) jR, ((int) j$.com.android.tools.r8.a.Q(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jR);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final r F(long j) {
        return new r(this.a, x() + j);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j, j$.time.temporal.r rVar) {
        return (r) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return (r) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: E */
    public final b s(long j, j$.time.temporal.r rVar) {
        return (r) super.s(j, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return (r) super.s(j, bVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.b == rVar.b && this.c == rVar.c && this.d == rVar.d && this.a.equals(rVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return (((i << 11) + (i2 << 6)) + i3) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 6, this);
    }
}
