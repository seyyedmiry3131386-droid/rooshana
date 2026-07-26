package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends d {
    public static final j$.time.g d = j$.time.g.K(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.g a;
    public final transient z b;
    public final transient int c;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.j jVar) {
        return new g(this, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(j$.time.g r6) {
        /*
            r5 = this;
            r5.<init>()
            j$.time.g r0 = j$.time.chrono.y.d
            boolean r1 = j$.time.c.b(r0)
            r2 = 1
            if (r1 == 0) goto L16
            r6.getClass()
            int r0 = r6.C(r0)
            if (r0 >= 0) goto L24
            goto L22
        L16:
            long r3 = r6.x()
            long r0 = r0.x()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L24
        L22:
            r0 = r2
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3a
            j$.time.chrono.z r0 = j$.time.chrono.z.h(r6)
            r5.b = r0
            int r1 = r6.a
            j$.time.g r0 = r0.b
            int r0 = r0.a
            int r1 = r1 - r0
            int r1 = r1 + r2
            r5.c = r1
            r5.a = r6
            return
        L3a:
            j$.time.b r6 = new j$.time.b
            java.lang.String r0 = "JapaneseDate before Meiji 6 is not supported"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.<init>(j$.time.g):void");
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return w.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        w.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return this.b;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // j$.time.chrono.d, j$.time.temporal.TemporalAccessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.t k(j$.time.temporal.p r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            boolean r0 = r5.e(r6)
            if (r0 == 0) goto L8d
            j$.time.temporal.a r6 = (j$.time.temporal.a) r6
            int[] r0 = j$.time.chrono.x.a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 1
            if (r0 == r1) goto L81
            r4 = 2
            if (r0 == r4) goto L48
            r4 = 3
            if (r0 == r4) goto L26
            j$.time.chrono.w r0 = j$.time.chrono.w.c
            j$.time.temporal.t r6 = r0.j(r6)
            return r6
        L26:
            j$.time.chrono.z r6 = r5.b
            j$.time.g r0 = r6.b
            int r0 = r0.a
            j$.time.chrono.z r6 = r6.n()
            if (r6 == 0) goto L3e
            j$.time.g r6 = r6.b
            int r6 = r6.a
            int r6 = r6 - r0
            int r6 = r6 + r1
            long r0 = (long) r6
            j$.time.temporal.t r6 = j$.time.temporal.t.e(r2, r0)
            return r6
        L3e:
            r6 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r6 = r6 - r0
            long r0 = (long) r6
            j$.time.temporal.t r6 = j$.time.temporal.t.e(r2, r0)
            return r6
        L48:
            j$.time.chrono.z r6 = r5.b
            j$.time.chrono.z r6 = r6.n()
            if (r6 == 0) goto L60
            j$.time.g r6 = r6.b
            int r0 = r6.a
            j$.time.g r4 = r5.a
            int r4 = r4.a
            if (r0 != r4) goto L60
            int r6 = r6.H()
            int r6 = r6 - r1
            goto L6d
        L60:
            j$.time.g r6 = r5.a
            boolean r6 = r6.I()
            if (r6 == 0) goto L6b
            r6 = 366(0x16e, float:5.13E-43)
            goto L6d
        L6b:
            r6 = 365(0x16d, float:5.11E-43)
        L6d:
            int r0 = r5.c
            if (r0 != r1) goto L7b
            j$.time.chrono.z r0 = r5.b
            j$.time.g r0 = r0.b
            int r0 = r0.H()
            int r0 = r0 - r1
            int r6 = r6 - r0
        L7b:
            long r0 = (long) r6
            j$.time.temporal.t r6 = j$.time.temporal.t.e(r2, r0)
            return r6
        L81:
            j$.time.g r6 = r5.a
            int r6 = r6.J()
            long r0 = (long) r6
            j$.time.temporal.t r6 = j$.time.temporal.t.e(r2, r0)
            return r6
        L8d:
            j$.time.temporal.s r0 = new j$.time.temporal.s
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r6 = j$.time.c.a(r1, r6)
            r0.<init>(r6)
            throw r0
        L99:
            j$.time.temporal.t r6 = r6.j(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.k(j$.time.temporal.p):j$.time.temporal.t");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        switch (x.a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.H() - this.b.b.H()) + 1 : this.a.H();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
            case 8:
                return this.b.a;
            default:
                return this.a.w(pVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final y c(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (w(aVar) == j) {
                return this;
            }
            int[] iArr = x.a;
            int i = iArr[aVar.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                int iA = w.c.j(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return L(this.b, iA);
                }
                if (i2 == 8) {
                    return L(z.q(iA), this.c);
                }
                if (i2 == 9) {
                    return K(this.a.U(iA));
                }
            }
            return K(this.a.c(j, pVar));
        }
        return (y) super.c(j, pVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: I */
    public final b j(j$.time.temporal.n nVar) {
        return (y) super.j(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.g gVar) {
        return (y) super.j(gVar);
    }

    public final y L(z zVar, int i) {
        w.c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = zVar.b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || zVar != z.h(j$.time.g.K(i3, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return K(this.a.U(i3));
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        return K(this.a.P(j));
    }

    @Override // j$.time.chrono.d
    public final b G(long j) {
        return K(this.a.O(j));
    }

    @Override // j$.time.chrono.d
    public final b F(long j) {
        return K(this.a.N(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j, j$.time.temporal.r rVar) {
        return (y) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        return (y) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d
    /* JADX INFO: renamed from: E */
    public final b s(long j, j$.time.temporal.r rVar) {
        return (y) super.s(j, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return (y) super.s(j, bVar);
    }

    public final y K(j$.time.g gVar) {
        return gVar.equals(this.a) ? this : new y(gVar);
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
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 4, this);
    }
}
