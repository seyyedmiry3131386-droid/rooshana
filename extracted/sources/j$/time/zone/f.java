package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.j;
import j$.time.l;
import j$.time.temporal.n;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.i()) {
            if (localDateTime.E(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.E(bVar.b.I(bVar.d.a - bVar.c.a))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.E(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.E(bVar.b.I(bVar.d.a - bVar.c.a))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.i()) {
                    arrayList.add(bVar.b);
                    arrayList.add(bVar.b.I(bVar.d.a - bVar.c.a));
                } else {
                    arrayList.add(bVar.b.I(bVar.d.a - bVar.c.a));
                    arrayList.add(bVar.b);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset g(int i2) {
        return ZoneOffset.I(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.g.L(j$.com.android.tools.r8.a.R(j2 + ((long) zoneOffset.a), 86400)).a;
    }

    public final ZoneOffset d(Instant instant) {
        long jN;
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            if (this.c.length == 0) {
                return this.b[0];
            }
            long epochSecond = instant.getEpochSecond();
            if (this.f.length > 0) {
                if (epochSecond > this.c[r9.length - 1]) {
                    b[] bVarArrB = b(c(epochSecond, this.e[r9.length - 1]));
                    b bVar = null;
                    for (int i2 = 0; i2 < bVarArrB.length; i2++) {
                        bVar = bVarArrB[i2];
                        if (epochSecond < bVar.a) {
                            return bVar.c;
                        }
                    }
                    return bVar.d;
                }
            }
            int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return this.e[iBinarySearch + 1];
        }
        long j2 = instant.a;
        if (j2 < 0 && instant.b > 0) {
            jN = j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.M(j2 + 1, 1000), (instant.b / 1000000) - 1000);
        } else {
            jN = j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.M(j2, 1000), instant.b / 1000000);
        }
        return g(timeZone.getOffset(jN));
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        if (bVar.i()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.c, bVar.d};
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(Objects.requireNonNull(objArr[i2]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.C(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.b.N() <= r0.b.N()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        j$.time.g gVarD;
        b[] bVarArr = l;
        Integer numValueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) this.h.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        final int i3 = 0;
        final int i4 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            j$.time.g gVarK = j$.time.g.K(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.s(0);
            long jV = j$.com.android.tools.r8.a.v(new LocalDateTime(gVarK, j.h[0]), this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(jV * 1000);
            long j4 = 31968000 + jV;
            while (jV < j4) {
                long j5 = jV + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - jV > j2) {
                        long jR = j$.com.android.tools.r8.a.R(j5 + jV, 2L);
                        if (this.g.getOffset(jR * j6) == offset) {
                            jV = jR;
                        } else {
                            j5 = jR;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(jV * j6) == offset) {
                        jV = j5;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.g.getOffset(jV * j6);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(jV, zoneOffsetG2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jV, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    jV = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.h.putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i5 = 0;
        while (i5 < eVarArr.length) {
            e eVar = eVarArr[i5];
            byte b = eVar.b;
            if (b < 0) {
                l lVar = eVar.a;
                long j7 = i2;
                t.c.getClass();
                int iD = lVar.D(t.j(j7)) + 1 + eVar.b;
                j$.time.g gVar = j$.time.g.d;
                j$.time.temporal.a.YEAR.s(j7);
                Objects.requireNonNull(lVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(iD);
                gVarD = j$.time.g.D(i2, lVar.getValue(), iD);
                j$.time.d dVar = eVar.c;
                if (dVar != null) {
                    final int value = dVar.getValue();
                    gVarD = gVarD.j(new n() { // from class: j$.time.temporal.o
                        @Override // j$.time.temporal.n
                        public final m o(m mVar) {
                            switch (i4) {
                                case 0:
                                    int i6 = mVar.i(a.DAY_OF_WEEK);
                                    int i7 = value;
                                    if (i6 == i7) {
                                        return mVar;
                                    }
                                    return mVar.d(i6 - i7 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int i8 = mVar.i(a.DAY_OF_WEEK);
                                    int i9 = value;
                                    if (i8 == i9) {
                                        return mVar;
                                    }
                                    return mVar.s(i9 - i8 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            } else {
                l lVar2 = eVar.a;
                j$.time.g gVar2 = j$.time.g.d;
                j$.time.temporal.a.YEAR.s(i2);
                Objects.requireNonNull(lVar2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.s(b);
                gVarD = j$.time.g.D(i2, lVar2.getValue(), b);
                j$.time.d dVar2 = eVar.c;
                if (dVar2 != null) {
                    final int value2 = dVar2.getValue();
                    gVarD = gVarD.j(new n() { // from class: j$.time.temporal.o
                        @Override // j$.time.temporal.n
                        public final m o(m mVar) {
                            switch (i3) {
                                case 0:
                                    int i6 = mVar.i(a.DAY_OF_WEEK);
                                    int i7 = value2;
                                    if (i6 == i7) {
                                        return mVar;
                                    }
                                    return mVar.d(i6 - i7 >= 0 ? 7 - r0 : -r0, b.DAYS);
                                default:
                                    int i8 = mVar.i(a.DAY_OF_WEEK);
                                    int i9 = value2;
                                    if (i8 == i9) {
                                        return mVar;
                                    }
                                    return mVar.s(i9 - i8 >= 0 ? 7 - r1 : -r1, b.DAYS);
                            }
                        }
                    });
                }
            }
            if (eVar.e) {
                gVarD = gVarD.N(1L);
            }
            LocalDateTime localDateTimeF = LocalDateTime.F(gVarD, eVar.d);
            d dVar3 = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            dVar3.getClass();
            int i6 = c.a[dVar3.ordinal()];
            if (i6 == 1) {
                localDateTimeF = localDateTimeF.I(zoneOffset2.a - ZoneOffset.UTC.a);
            } else if (i6 == 2) {
                localDateTimeF = localDateTimeF.I(zoneOffset2.a - zoneOffset.a);
            }
            bVarArr3[i5] = new b(localDateTimeF, eVar.h, eVar.i);
            i5++;
            i3 = 0;
        }
        if (i2 < 2100) {
            this.h.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r0.length - 1] + "]";
    }
}
