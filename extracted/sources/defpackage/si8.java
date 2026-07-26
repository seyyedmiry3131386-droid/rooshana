package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class si8 {
    public final ri8 a;
    public v04 b = null;
    public v04 c;

    public si8(ri8 ri8Var, v04 v04Var) {
        this.a = ri8Var;
        this.c = v04Var;
    }

    public final long a(long j) {
        sy6 sy6VarI;
        v04 v04Var = this.b;
        sy6 sy6Var = sy6.e;
        if (v04Var != null) {
            if (v04Var.h()) {
                v04 v04Var2 = this.c;
                sy6VarI = v04Var2 != null ? v04Var2.I(v04Var, true) : null;
            } else {
                sy6VarI = sy6Var;
            }
            if (sy6VarI != null) {
                sy6Var = sy6VarI;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = sy6Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = sy6Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = sy6Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = sy6Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        ri8 ri8Var = this.a;
        int iE = ri8Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= ri8Var.d(iE) && Float.intBitsToFloat(i) <= ri8Var.e(iE);
    }

    public final long d(long j) {
        v04 v04Var;
        v04 v04Var2 = this.b;
        if (v04Var2 == null) {
            return j;
        }
        if (!v04Var2.h()) {
            v04Var2 = null;
        }
        if (v04Var2 == null || (v04Var = this.c) == null) {
            return j;
        }
        v04 v04Var3 = v04Var.h() ? v04Var : null;
        return v04Var3 == null ? j : v04Var2.C(v04Var3, j);
    }

    public final long e(long j) {
        v04 v04Var;
        v04 v04Var2 = this.b;
        if (v04Var2 == null) {
            return j;
        }
        if (!v04Var2.h()) {
            v04Var2 = null;
        }
        if (v04Var2 == null || (v04Var = this.c) == null) {
            return j;
        }
        v04 v04Var3 = v04Var.h() ? v04Var : null;
        return v04Var3 == null ? j : v04Var3.C(v04Var2, j);
    }
}
