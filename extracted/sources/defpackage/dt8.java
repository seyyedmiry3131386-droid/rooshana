package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dt8 implements v72 {
    public final int a;
    public final int b;
    public final List c;
    public final h26 d;
    public final SparseIntArray e;
    public final di1 f;
    public final ab8 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final sn6 k;
    public qd2 l;
    public x72 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public gt8 r;
    public int s;
    public int t;

    public dt8(int i, int i2, ab8 ab8Var, hm8 hm8Var, di1 di1Var) {
        this.f = di1Var;
        this.a = i;
        this.b = i2;
        this.g = ab8Var;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(hm8Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(hm8Var);
        }
        this.d = new h26(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new sn6(1);
        this.m = x72.j0;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (gt8) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new bl7(new bn6(this)));
        this.r = null;
    }

    @Override // defpackage.v72
    public final v72 b() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [gt8] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.v72
    public final int d(w72 w72Var, sd2 sd2Var) throws ParserException {
        w72 w72Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long jI = w72Var.i();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            sn6 sn6Var = this.k;
            if (jI != -1 && !z2 && !sn6Var.d) {
                int i6 = this.t;
                hm8 hm8Var = sn6Var.b;
                h26 h26Var = sn6Var.c;
                if (i6 <= 0) {
                    sn6Var.a(w72Var);
                    return 0;
                }
                if (sn6Var.f) {
                    if (sn6Var.h == -9223372036854775807L) {
                        sn6Var.a(w72Var);
                        return 0;
                    }
                    if (sn6Var.e) {
                        long j2 = sn6Var.g;
                        if (j2 == -9223372036854775807L) {
                            sn6Var.a(w72Var);
                            return 0;
                        }
                        sn6Var.i = hm8Var.c(sn6Var.h) - hm8Var.b(j2);
                        sn6Var.a(w72Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, w72Var.i());
                    long j3 = 0;
                    if (w72Var.getPosition() != j3) {
                        sd2Var.a = j3;
                        return 1;
                    }
                    h26Var.G(iMin);
                    w72Var.m();
                    w72Var.q(h26Var.a, 0, iMin);
                    int i7 = h26Var.b;
                    int i8 = h26Var.c;
                    while (true) {
                        if (i7 >= i8) {
                            break;
                        }
                        if (h26Var.a[i7] == 71) {
                            long jC = s17.c(h26Var, i7, i6);
                            if (jC != -9223372036854775807L) {
                                j = jC;
                                break;
                            }
                        }
                        i7++;
                    }
                    sn6Var.g = j;
                    sn6Var.e = true;
                    return 0;
                }
                long jI2 = w72Var.i();
                int iMin2 = (int) Math.min(112800, jI2);
                long j4 = jI2 - ((long) iMin2);
                if (w72Var.getPosition() != j4) {
                    sd2Var.a = j4;
                    return 1;
                }
                h26Var.G(iMin2);
                w72Var.m();
                w72Var.q(h26Var.a, 0, iMin2);
                int i9 = h26Var.b;
                int i10 = h26Var.c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = h26Var.a;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long jC2 = s17.c(h26Var, i11, i6);
                                if (jC2 != -9223372036854775807L) {
                                    j = jC2;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                sn6Var.h = j;
                sn6Var.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j5 = sn6Var.i;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    qd2 qd2Var = new qd2(new fv(2), new pg(this.t, sn6Var.b), j5, 1 + j5, 0L, jI, 188L, 940);
                    this.l = qd2Var;
                    this.m.t((hb0) qd2Var.c);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.t(new x30(j5));
                }
            }
            if (this.q) {
                this.q = z;
                h(0L, 0L);
                if (w72Var.getPosition() != 0) {
                    sd2Var.a = 0L;
                    return i;
                }
            }
            qd2 qd2Var2 = this.l;
            if (qd2Var2 != null && ((ib0) qd2Var2.e) != null) {
                return qd2Var2.w(w72Var, sd2Var);
            }
            w72Var2 = w72Var;
            r1 = z;
        } else {
            w72Var2 = w72Var;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        h26 h26Var2 = this.d;
        byte[] bArr2 = h26Var2.a;
        if (9400 - h26Var2.b < 188) {
            int iA = h26Var2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, h26Var2.b, bArr2, r1, iA);
            }
            h26Var2.H(iA, bArr2);
        }
        while (true) {
            int iA2 = h26Var2.a();
            ?? r7 = this.h;
            if (iA2 >= 188) {
                int i15 = h26Var2.b;
                int i16 = h26Var2.c;
                byte[] bArr3 = h26Var2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                h26Var2.J(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = h26Var2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iJ = h26Var2.j();
                if ((8388608 & iJ) != 0) {
                    h26Var2.J(i18);
                    return r1;
                }
                ?? r9 = (4194304 & iJ) != 0 ? 1 : r1;
                int i21 = (2096896 & iJ) >> 8;
                ?? r11 = (iJ & 32) != 0 ? 1 : r1;
                ?? r8 = (iJ & 16) != 0 ? (gt8) r7.get(i21) : 0;
                if (r8 == 0) {
                    h26Var2.J(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iJ & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        h26Var2.J(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.c();
                    }
                }
                if (r11 != 0) {
                    int iX = h26Var2.x();
                    r9 = (r9 == true ? 1 : 0) | ((h26Var2.x() & 64) != 0 ? i4 : r1);
                    h26Var2.K(iX - 1);
                }
                boolean z3 = this.o;
                if (i3 == i4 || z3 || !this.j.get(i21, r1)) {
                    h26Var2.I(i18);
                    r8.a(r9, h26Var2);
                    h26Var2.I(i20);
                }
                if (i3 != i4 && !z3 && this.o && jI != -1) {
                    this.q = true;
                }
                h26Var2.J(i18);
                return r1;
            }
            int i24 = h26Var2.c;
            int i25 = w72Var2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < r7.size(); r4++) {
                    gt8 gt8Var = (gt8) r7.valueAt(r4);
                    if (gt8Var instanceof e76) {
                        e76 e76Var = (e76) gt8Var;
                        ?? r3 = (!z2 || e76Var.e()) ? i : r1;
                        if (e76Var.c == 3 && e76Var.j == -1 && ((!z2 || !(e76Var.a instanceof ew2)) && r3 != 0)) {
                            e76Var.a(i, new h26());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            h26Var2.I(i24 + i25);
            i = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // defpackage.v72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.w72 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            h26 r0 = r6.d
            byte[] r0 = r0.a
            oe1 r7 = (defpackage.oe1) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.e(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.d(r2, r1)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt8.g(w72):boolean");
    }

    @Override // defpackage.v72
    public final void h(long j, long j2) {
        qd2 qd2Var;
        vy2.s(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hm8 hm8Var = (hm8) list.get(i);
            boolean z = hm8Var.e() == -9223372036854775807L;
            if (!z) {
                long jD = hm8Var.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                hm8Var.g(j2);
            }
        }
        if (j2 != 0 && (qd2Var = this.l) != null) {
            qd2Var.F(j2);
        }
        this.d.G(0);
        this.e.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i2 >= sparseArray.size()) {
                this.s = 0;
                return;
            } else {
                ((gt8) sparseArray.valueAt(i2)).c();
                i2++;
            }
        }
    }

    @Override // defpackage.v72
    public final List i() {
        return ImmutableList.q();
    }

    @Override // defpackage.v72
    public final void m(x72 x72Var) {
        if ((this.b & 1) == 0) {
            x72Var = new ry(x72Var, this.g);
        }
        this.m = x72Var;
    }

    @Override // defpackage.v72
    public final void a() {
    }
}
