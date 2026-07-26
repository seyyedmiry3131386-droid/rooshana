package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.draw.d;
import com.google.android.gms.internal.measurement.zzlh;

/* JADX INFO: loaded from: classes.dex */
public abstract class j97 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static void c(zh8 zh8Var, tg8 tg8Var, ri8 ri8Var, v04 v04Var, ji8 ji8Var, boolean z, rr5 rr5Var) {
        if (z) {
            int iQ = rr5Var.q(zi8.f(zh8Var.b));
            String str = gh8.a;
            sy6 sy6VarB = iQ < ri8Var.a.a.b.length() ? ri8Var.b(iQ) : iQ != 0 ? ri8Var.b(iQ - 1) : new sy6(0.0f, 0.0f, 1.0f, (int) (gh8.a(tg8Var.b, tg8Var.g, tg8Var.h, gh8.a, 1) & 4294967295L));
            float f = sy6VarB.b;
            float f2 = sy6VarB.a;
            long jK = v04Var.K((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            sy6 sy6VarC = ry7.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK >> 32)))) << 32), (((long) Float.floatToRawIntBits(sy6VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(sy6VarB.d - f)) & 4294967295L));
            if (js3.i((ji8) ji8Var.a.b.get(), ji8Var)) {
                ji8Var.b.h(sy6VarC);
            }
        }
    }

    public static void d(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            p3.t(window, z);
        } else {
            if (i >= 30) {
                p3.s(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static hx4 e(hx4 hx4Var, float f, ka7 ka7Var, long j, long j2, int i) {
        xr7 xr7Var = ka7Var;
        if ((i & 2) != 0) {
            xr7Var = tt3.d;
        }
        xr7 xr7Var2 = xr7Var;
        boolean z = au1.a(f, (float) 0) > 0;
        if ((i & 8) != 0) {
            j = gv2.a;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = gv2.a;
        }
        return (au1.a(f, (float) 0) > 0 || z) ? hx4Var.d(new d(f, xr7Var2, z, j3, j2)) : hx4Var;
    }

    public static String f(zzlh zzlhVar) {
        StringBuilder sb = new StringBuilder(zzlhVar.e());
        for (int i = 0; i < zzlhVar.e(); i++) {
            byte bA = zzlhVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
