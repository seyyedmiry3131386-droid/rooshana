package defpackage;

import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ia7 {
    public static final /* synthetic */ int a = 0;
    public static long b;
    public static Method c;

    public static final fa7 a(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new fa7(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final boolean b(int i, KeyEvent keyEvent) {
        return ((int) (dy3.w(keyEvent) >> 32)) == i;
    }

    public static final void c(hl5 hl5Var, ah6 ah6Var, long j) {
        fi1 fi1Var = (fi1) hl5Var.b;
        fi1Var.getClass();
        f49 f49Var = (f49) fi1Var.c;
        f49 f49Var2 = (f49) fi1Var.b;
        boolean zO = at2.O(ah6Var);
        long j2 = ah6Var.b;
        if (zO) {
            qa1[] qa1VarArr = f49Var2.d;
            ew.F0(0, qa1VarArr.length, null, qa1VarArr);
            f49Var2.e = 0;
            qa1[] qa1VarArr2 = f49Var.d;
            ew.F0(0, qa1VarArr2.length, null, qa1VarArr2);
            f49Var.e = 0;
            fi1Var.a = 0L;
        }
        if (!at2.Q(ah6Var)) {
            List list = ah6Var.k;
            if (list == null) {
                list = EmptyList.a;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                qz2 qz2Var = (qz2) list.get(i);
                fi1Var.a(qz2Var.a, nr5.g(qz2Var.c, j));
                i++;
            }
            fi1Var.a(j2, nr5.g(ah6Var.l, j));
        }
        if (at2.Q(ah6Var) && j2 - fi1Var.a > 40) {
            qa1[] qa1VarArr3 = f49Var2.d;
            ew.F0(0, qa1VarArr3.length, null, qa1VarArr3);
            f49Var2.e = 0;
            qa1[] qa1VarArr4 = f49Var.d;
            ew.F0(0, qa1VarArr4.length, null, qa1VarArr4);
            f49Var.e = 0;
            fi1Var.a = 0L;
        }
        fi1Var.a = j2;
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final float e(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static int f(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(rm7.n(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final void g(qz0 qz0Var, Integer num, qp2 qp2Var) {
        if (qz0Var.S) {
            qz0Var.b(qp2Var, num);
        }
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 29) {
            return to8.a();
        }
        try {
            if (c == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) c.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean i(u26 u26Var, float f, float f2) {
        sy6 sy6Var = new sy6(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        eh ehVarA = gh.a();
        bl4.i(ehVarA, sy6Var);
        eh ehVarA2 = gh.a();
        ehVarA2.b(u26Var, ehVarA, 1);
        boolean zIsEmpty = ehVarA2.a.isEmpty();
        ehVarA2.c();
        ehVarA.c();
        return !zIsEmpty;
    }

    public static final boolean j(fa7 fa7Var) {
        long j = fa7Var.e;
        return (j >>> 32) == (4294967295L & j) && j == fa7Var.f && j == fa7Var.g && j == fa7Var.h;
    }

    public static final boolean k(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static lv3 l(mw3 mw3Var) {
        boolean z;
        try {
            try {
                mw3Var.R();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (lv3) vu8.z.b(mw3Var);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return zv3.a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    public static final void m(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            rn3.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            js3.p(fArr8, "<this>");
            js3.p(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fE = e(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fE);
                }
            }
            float fSqrt = (float) Math.sqrt(e(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : e(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fE2 = e(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fE2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fE2 / fArr11[i14];
        }
    }

    public static final void n(qz0 qz0Var, dp2 dp2Var) {
        qz0Var.b(new a09(1, dp2Var), tx8.a);
    }

    public static final void o(qz0 qz0Var, qp2 qp2Var, Object obj) {
        if (qz0Var.S || !js3.i(qz0Var.M(), obj)) {
            qz0Var.l0(obj);
            qz0Var.b(qp2Var, obj);
        }
    }

    public static boolean p(byte b2) {
        return b2 > -65;
    }
}
