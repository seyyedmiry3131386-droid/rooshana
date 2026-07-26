package j$.time;

import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements TemporalAccessor, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i = this.a - nVar.a;
        return i == 0 ? this.b - nVar.b : i;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.d("--");
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public n(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.k();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.q.d(this, pVar);
        }
        l lVarF = l.F(this.a);
        lVarF.getClass();
        int i = k.a[lVarF.ordinal()];
        return j$.time.temporal.t.f(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, l.F(this.a).E());
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
        int i2 = m.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.q.b) {
            return j$.time.chrono.t.c;
        }
        return j$.time.temporal.q.c(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.K(mVar).equals(j$.time.chrono.t.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarC = mVar.c(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarC.c(Math.min(mVarC.k(aVar).d, this.b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
