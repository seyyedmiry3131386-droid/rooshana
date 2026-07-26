package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements n, Serializable {
    public static final z d;
    public static final z[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient j$.time.g b;
    public final transient String c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.q(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.n(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.u(this, aVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long w(j$.time.temporal.p pVar) {
        return j$.com.android.tools.r8.a.o(this, pVar);
    }

    static {
        z zVar = new z(-1, j$.time.g.K(1868, 1, 1), "Meiji");
        d = zVar;
        e = new z[]{zVar, new z(0, j$.time.g.K(1912, 7, 30), "Taisho"), new z(1, j$.time.g.K(1926, 12, 25), "Showa"), new z(2, j$.time.g.K(1989, 1, 8), "Heisei"), new z(3, j$.time.g.K(2019, 5, 1), "Reiwa")};
    }

    public final z n() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return q(this.a + 1);
    }

    public z(int i, j$.time.g gVar, String str) {
        this.a = i;
        this.b = gVar;
        this.c = str;
    }

    public static z q(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            z[] zVarArr = e;
            if (i2 < zVarArr.length) {
                return zVarArr[i2];
            }
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.ERA);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.chrono.z h(j$.time.g r5) {
        /*
            j$.time.g r0 = j$.time.chrono.y.d
            boolean r1 = j$.time.c.b(r0)
            r2 = 1
            if (r1 == 0) goto L13
            r5.getClass()
            int r0 = r5.C(r0)
            if (r0 >= 0) goto L21
            goto L1f
        L13:
            long r3 = r5.x()
            long r0 = r0.x()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L21
        L1f:
            r0 = r2
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L3c
            j$.time.chrono.z[] r0 = j$.time.chrono.z.e
            int r0 = r0.length
            int r0 = r0 - r2
        L28:
            if (r0 < 0) goto L3a
            j$.time.chrono.z[] r1 = j$.time.chrono.z.e
            r1 = r1[r0]
            j$.time.g r2 = r1.b
            int r2 = r5.compareTo(r2)
            if (r2 < 0) goto L37
            return r1
        L37:
            int r0 = r0 + (-1)
            goto L28
        L3a:
            r5 = 0
            return r5
        L3c:
            j$.time.b r5 = new j$.time.b
            java.lang.String r0 = "JapaneseDate before Meiji 6 are not supported"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.z.h(j$.time.g):j$.time.chrono.z");
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t k(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (pVar != aVar) {
            return j$.time.temporal.q.d(this, pVar);
        }
        return w.c.j(aVar);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 5, this);
    }
}
