package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zu0 {
    public static final long b = gu9.f(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final long a;

    static {
        gu9.f(4282664004L);
        c = gu9.f(4287137928L);
        gu9.f(4291611852L);
        d = gu9.f(4294967295L);
        e = gu9.f(4294901760L);
        gu9.f(4278255360L);
        f = gu9.f(4278190335L);
        gu9.f(4294967040L);
        gu9.f(4278255615L);
        gu9.f(4294902015L);
        g = gu9.d(0);
        h = gu9.c(0.0f, 0.0f, 0.0f, 0.0f, pv0.u);
    }

    public /* synthetic */ zu0(long j) {
        this.a = j;
    }

    public static final long a(long j, nv0 nv0Var) {
        n21 n21VarQ;
        nv0 nv0VarF = f(j);
        int i2 = nv0VarF.c;
        int i3 = nv0Var.c;
        if ((i2 | i3) < 0) {
            n21VarQ = rf0.q(nv0VarF, nv0Var);
        } else {
            ya5 ya5Var = o21.a;
            int i4 = i2 | (i3 << 6);
            Object objB = ya5Var.b(i4);
            if (objB == null) {
                objB = rf0.q(nv0VarF, nv0Var);
                ya5Var.h(i4, objB);
            }
            n21VarQ = (n21) objB;
        }
        return n21VarQ.a(j);
    }

    public static long b(float f2, long j) {
        return gu9.c(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fR;
        float f2;
        if ((63 & j) == 0) {
            fR = (float) a77.r((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fR = (float) a77.r((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fR / f2;
    }

    public static final float e(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) a77.r((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - ae2.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final nv0 f(long j) {
        float[] fArr = pv0.a;
        return pv0.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) a77.r((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - ae2.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) a77.r((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - ae2.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return bl4.y(sb, f(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zu0) {
            return this.a == ((zu0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return tw8.a(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
