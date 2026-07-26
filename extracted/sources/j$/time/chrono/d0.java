package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient j$.time.g a;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.j jVar) {
        return new g(this, jVar);
    }

    public d0(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.a = gVar;
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return b0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        b0.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return J() >= 1 ? e0.ROC : e0.BEFORE_ROC;
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
        int i = c0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(pVar);
        }
        if (i != 4) {
            return b0.c.j(aVar);
        }
        j$.time.temporal.t tVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.t.e(1L, J() <= 0 ? (-tVar.a) + 1912 : tVar.d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = c0.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            if (i == 5) {
                return ((((long) J()) * 12) + ((long) this.a.b)) - 1;
            }
            if (i == 6) {
                return J();
            }
            if (i != 7) {
                return this.a.w(pVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return pVar.l(this);
    }

    public final int J() {
        return this.a.a - 1911;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.d0 c(long r8, j$.time.temporal.p r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9f
            r0 = r10
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r7.w(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.c0.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L49
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L49
            if (r2 == r3) goto L49
            goto L5f
        L25:
            j$.time.chrono.b0 r10 = j$.time.chrono.b0.c
            j$.time.temporal.t r10 = r10.j(r0)
            r10.b(r8, r0)
            int r10 = r7.J()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.g r10 = r7.a
            short r2 = r10.b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.g r8 = r10.O(r8)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L49:
            j$.time.chrono.b0 r2 = j$.time.chrono.b0.c
            j$.time.temporal.t r2 = r2.j(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L88
            if (r0 == r4) goto L7b
            if (r0 == r3) goto L6a
        L5f:
            j$.time.g r0 = r7.a
            j$.time.g r8 = r0.c(r8, r10)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L6a:
            j$.time.g r8 = r7.a
            int r9 = r7.J()
            int r9 = 1912 - r9
            j$.time.g r8 = r8.U(r9)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L7b:
            j$.time.g r8 = r7.a
            int r2 = r2 + 1911
            j$.time.g r8 = r8.U(r2)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L88:
            j$.time.g r8 = r7.a
            int r9 = r7.J()
            r10 = 1
            if (r9 < r10) goto L94
            int r2 = r2 + 1911
            goto L96
        L94:
            int r2 = 1912 - r2
        L96:
            j$.time.g r8 = r8.U(r2)
            j$.time.chrono.d0 r8 = r7.L(r8)
            return r8
        L9f:
            j$.time.chrono.b r8 = super.c(r8, r10)
            j$.time.chrono.d0 r8 = (j$.time.chrono.d0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.d0.c(long, j$.time.temporal.p):j$.time.chrono.d0");
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: I */
    public final b j(j$.time.temporal.n nVar) {
        return (d0) super.j(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return (d0) super.j(gVar);
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return L(this.a.P(j));
    }

    @Override // j$.time.chrono.d
    public final b G(long j) {
        return L(this.a.O(j));
    }

    @Override // j$.time.chrono.d
    public final b F(long j) {
        return L(this.a.N(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j, j$.time.temporal.r rVar) {
        return (d0) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return (d0) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: E */
    public final b s(long j, j$.time.temporal.r rVar) {
        return (d0) super.s(j, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return (d0) super.s(j, bVar);
    }

    public final d0 L(j$.time.g gVar) {
        return gVar.equals(this.a) ? this : new d0(gVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.a.x();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.a.equals(((d0) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 7, this);
    }
}
