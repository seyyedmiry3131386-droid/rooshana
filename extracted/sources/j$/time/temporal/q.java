package j$.time.temporal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    public static final j$.time.format.a a = new j$.time.format.a(1);
    public static final j$.time.format.a b = new j$.time.format.a(2);
    public static final j$.time.format.a c = new j$.time.format.a(3);
    public static final j$.time.format.a d = new j$.time.format.a(4);
    public static final j$.time.format.a e = new j$.time.format.a(5);
    public static final j$.time.format.a f = new j$.time.format.a(6);
    public static final j$.time.format.a g = new j$.time.format.a(7);

    public static t d(TemporalAccessor temporalAccessor, p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.j(temporalAccessor);
        }
        if (temporalAccessor.e(pVar)) {
            return ((a) pVar).b;
        }
        throw new s(j$.time.c.a("Unsupported field: ", pVar));
    }

    public static int a(TemporalAccessor temporalAccessor, p pVar) {
        t tVarK = temporalAccessor.k(pVar);
        if (tVarK.a < -2147483648L || tVarK.d > 2147483647L) {
            throw new s("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long jW = temporalAccessor.w(pVar);
        if (tVarK.d(jW)) {
            return (int) jW;
        }
        throw new j$.time.b("Invalid value for " + pVar + " (valid values " + tVarK + "): " + jW);
    }

    public static Object c(TemporalAccessor temporalAccessor, j$.time.format.a aVar) {
        if (aVar == a || aVar == b || aVar == c) {
            return null;
        }
        return aVar.a(temporalAccessor);
    }

    public static m b(m mVar, long j, r rVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            mVar = mVar.d(Long.MAX_VALUE, rVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return mVar.d(j2, rVar);
    }
}
