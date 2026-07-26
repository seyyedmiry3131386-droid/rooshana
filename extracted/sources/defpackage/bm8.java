package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class bm8 {
    public static final xl8 a = new xl8();
    public static final String b;
    public static final String c;
    public static final String d;

    static {
        String str = j29.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
        d = Integer.toString(2, 36);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, yl8 yl8Var, am8 am8Var, int i2, boolean z) {
        int i3 = f(i, yl8Var, false).c;
        if (m(i3, am8Var, 0L).o != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, am8Var, 0L).n;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof bm8) {
                bm8 bm8Var = (bm8) obj;
                if (bm8Var.o() == o() && bm8Var.h() == h()) {
                    am8 am8Var = new am8();
                    yl8 yl8Var = new yl8();
                    am8 am8Var2 = new am8();
                    yl8 yl8Var2 = new yl8();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int iA = a(true);
                                    if (iA == bm8Var.a(true) && (iC = c(true)) == bm8Var.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == bm8Var.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, yl8Var, true).equals(bm8Var.f(i2, yl8Var2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, am8Var, 0L).equals(bm8Var.m(i, am8Var2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract yl8 f(int i, yl8 yl8Var, boolean z);

    public yl8 g(Object obj, yl8 yl8Var) {
        return f(b(obj), yl8Var, true);
    }

    public abstract int h();

    public int hashCode() {
        am8 am8Var = new am8();
        yl8 yl8Var = new yl8();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, am8Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, yl8Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(am8 am8Var, yl8 yl8Var, int i, long j) {
        Pair pairJ = j(am8Var, yl8Var, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(am8 am8Var, yl8 yl8Var, int i, long j, long j2) {
        vy2.l(i, o());
        m(i, am8Var, j2);
        if (j == -9223372036854775807L) {
            j = am8Var.l;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = am8Var.n;
        f(i2, yl8Var, false);
        while (i2 < am8Var.o && yl8Var.e != j) {
            int i3 = i2 + 1;
            if (f(i3, yl8Var, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, yl8Var, true);
        long jMin = j - yl8Var.e;
        long j3 = yl8Var.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = yl8Var.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract am8 m(int i, am8 am8Var, long j);

    public final void n(int i, am8 am8Var) {
        m(i, am8Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
