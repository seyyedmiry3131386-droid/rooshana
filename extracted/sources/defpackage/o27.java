package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.protobuf.InvalidProtocolBufferException;
import io.sentry.android.core.t0;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class o27 {
    public static final /* synthetic */ int a = 0;

    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!g(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !g(b3) && !g(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public static void b(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || g(b2)) {
            throw InvalidProtocolBufferException.c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static void c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || g(b3)))) {
            throw InvalidProtocolBufferException.c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static boolean d(Method method, Class cls) {
        js3.p(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public static final qd7 e(View view) {
        js3.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(mr6.view_tree_saved_state_registry_owner);
            qd7 qd7Var = tag instanceof qd7 ? (qd7) tag : null;
            if (qd7Var != null) {
                return qd7Var;
            }
            Object objJ = h27.j(view);
            view = objJ instanceof View ? (View) objJ : null;
        }
        return null;
    }

    public static Handler f() {
        Handler handler;
        synchronized (zk8.class) {
            handler = zk8.a;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                zk8.a = handler;
            }
        }
        return handler;
    }

    public static boolean g(byte b) {
        return b > -65;
    }

    public static io7 h(qp2 qp2Var) {
        io7 io7Var = new io7();
        io7Var.d = ok4.x(io7Var, io7Var, qp2Var);
        return io7Var;
    }

    public static final void i(View view, qd7 qd7Var) {
        js3.p(view, "<this>");
        view.setTag(mr6.view_tree_saved_state_registry_owner, qd7Var);
    }

    public static final long j(String str, long j, long j2, long j3) {
        String property;
        int i = zd8.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lB0 = m88.b0(10, property);
        if (lB0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lB0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int k(String str, int i, int i2) {
        return (int) j(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final ow8 l(int i, String str) {
        int i2;
        js3.p(str, "<this>");
        js3.q(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (js3.r(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i4 = 119304647;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            int i5 = i3 ^ Integer.MIN_VALUE;
            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                if (i4 != 119304647) {
                    return null;
                }
                i4 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) i)));
                if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i6 = i3 * i;
            int i7 = iDigit + i6;
            if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = i7;
        }
        return new ow8(i3);
    }

    public static final tw8 m(String str) {
        int i;
        long j;
        js3.p(str, "<this>");
        int i2 = 10;
        js3.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i3 = 1;
        if (js3.r(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j2 = 10;
        long j3 = 0;
        long j4 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i2);
            if (iDigit < 0) {
                return null;
            }
            int i4 = length;
            long j5 = j3 ^ Long.MIN_VALUE;
            int i5 = i;
            if (Long.compare(j5, j4 ^ Long.MIN_VALUE) <= 0) {
                j = j2;
            } else {
                if (j4 != 512409557603043100L) {
                    return null;
                }
                if (j2 >= 0) {
                    long j6 = (Long.MAX_VALUE / j2) << i3;
                    j = j2;
                    j4 = j6 + ((long) ((((-1) - (j6 * j2)) ^ Long.MIN_VALUE) >= (j2 ^ Long.MIN_VALUE) ? i3 : 0));
                } else if (Long.MAX_VALUE < (j2 ^ Long.MIN_VALUE)) {
                    j = j2;
                    j4 = 0;
                } else {
                    j4 = 1;
                    j = j2;
                }
                if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j7 = j3 * j;
            long j8 = (((long) iDigit) & 4294967295L) + j7;
            if (Long.compare(j8 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i5 + 1;
            j3 = j8;
            length = i4;
            j2 = j;
            i2 = 10;
            i3 = 1;
        }
        return new tw8(j3);
    }

    public static final boolean n(String str, bp2 bp2Var) {
        js3.p(str, "errorMessage");
        try {
            boolean zBooleanValue = ((Boolean) bp2Var.invoke()).booleanValue();
            if (!zBooleanValue) {
                t0.d("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            t0.d("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            t0.d("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            t0.d("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static int o(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (wl9.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }
}
