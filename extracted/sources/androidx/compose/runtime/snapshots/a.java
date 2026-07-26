package androidx.compose.runtime.snapshots;

import defpackage.dx3;
import defpackage.ew;
import defpackage.js3;
import defpackage.o27;
import defpackage.wu0;
import defpackage.z17;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterable, dx3 {
    public static final a e = new a(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public a(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final a a(a aVar) {
        a aVarC;
        long j;
        long[] jArr;
        a aVar2 = e;
        if (aVar == aVar2) {
            return this;
        }
        if (this == aVar2) {
            return aVar2;
        }
        long j2 = aVar.c;
        long j3 = aVar.c;
        long[] jArr2 = aVar.d;
        long j4 = aVar.b;
        long j5 = aVar.a;
        long j6 = this.c;
        if (j2 == j6 && jArr2 == (jArr = this.d)) {
            return new a(this.a & (~j5), this.b & (~j4), j6, jArr);
        }
        if (jArr2 != null) {
            aVarC = this;
            for (long j7 : jArr2) {
                aVarC = aVarC.c(j7);
            }
        } else {
            aVarC = this;
        }
        long j8 = 0;
        if (j4 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j4) != j8) {
                    j = j8;
                    aVarC = aVarC.c(((long) i) + j3);
                } else {
                    j = j8;
                }
                i++;
                j8 = j;
            }
        }
        long j9 = j8;
        if (j5 != j9) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != j9) {
                    aVarC = aVarC.c(((long) i2) + j3 + ((long) 64));
                }
            }
        }
        return aVarC;
    }

    public final a c(long j) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j2 = j - this.c;
        long j3 = 0;
        if (js3.s(j2, j3) >= 0 && js3.s(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.b;
            if ((j5 & j4) != 0) {
                return new a(this.a, j5 & (~j4), this.c, this.d);
            }
        } else if (js3.s(j2, 64) >= 0 && js3.s(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.a;
            if ((j7 & j6) != 0) {
                return new a(j7 & (~j6), this.b, this.c, this.d);
            }
        } else if (js3.s(j2, j3) < 0 && (jArr = this.d) != null && (iC = z17.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iC > 0) {
                    ew.A0(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i) {
                    ew.A0(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new a(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.c;
        long j3 = 0;
        return (js3.s(j2, j3) < 0 || js3.s(j2, (long) 64) >= 0) ? (js3.s(j2, (long) 64) < 0 || js3.s(j2, (long) 128) >= 0) ? js3.s(j2, j3) <= 0 && (jArr = this.d) != null && z17.c(jArr, j) >= 0 : ((1 << (((int) j2) - 64)) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final a e(a aVar) {
        a aVarF;
        a aVarF2;
        long[] jArr;
        a aVar2 = e;
        if (aVar == aVar2) {
            return this;
        }
        if (this == aVar2) {
            return aVar;
        }
        long j = aVar.c;
        long j2 = aVar.c;
        long[] jArr2 = aVar.d;
        long j3 = aVar.b;
        long j4 = aVar.a;
        long j5 = this.c;
        long j6 = this.b;
        long j7 = this.a;
        if (j == j5 && jArr2 == (jArr = this.d)) {
            return new a(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                aVarF = this;
                for (long j8 : jArr2) {
                    aVarF = aVarF.f(j8);
                }
            } else {
                aVarF = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        aVarF = aVarF.f(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        aVarF = aVarF.f(((long) i) + j2 + ((long) 64));
                    }
                    i++;
                }
            }
            return aVarF;
        }
        if (jArr3 != null) {
            aVarF2 = aVar;
            for (long j9 : jArr3) {
                aVarF2 = aVarF2.f(j9);
            }
        } else {
            aVarF2 = aVar;
        }
        long j10 = this.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    aVarF2 = aVarF2.f(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    aVarF2 = aVarF2.f(((long) i) + j10 + ((long) 64));
                }
                i++;
            }
        }
        return aVarF2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.a f(long r30) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.a.f(long):androidx.compose.runtime.snapshots.a");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return o27.h(new SnapshotIdSet$iterator$1(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(wu0.V(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
