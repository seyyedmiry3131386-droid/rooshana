package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.selection.f;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class za7 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static void A(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(rm7.n(i2, "at index "));
            }
        }
    }

    public static h09 a(String str) {
        String str2 = s26.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new h09(sb.toString(), str2, "file", null, str);
    }

    public static final int d(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int e(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final String h(h09 h09Var) {
        List listN = n(h09Var);
        String str = h09Var.b;
        if (listN.isEmpty()) {
            return null;
        }
        String str2 = h09Var.e;
        js3.m(str2);
        if (!m88.Z(str2, str, false)) {
            str = "";
        }
        return a.t0(listN, h09Var.b, str, null, null, 60);
    }

    public static final List n(h09 h09Var) {
        String str = h09Var.e;
        if (str == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iK0 = f88.k0('/', i2, 4, str);
            if (iK0 == -1) {
                iK0 = str.length();
            }
            String strSubstring = str.substring(i2, iK0);
            js3.o(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iK0;
        }
        return arrayList;
    }

    public static final boolean r(f fVar, boolean z) {
        v04 v04VarC;
        x44 x44Var = fVar.d;
        if (x44Var == null || (v04VarC = x44Var.c()) == null) {
            return false;
        }
        sy6 sy6VarK = s17.k(v04VarC);
        long jO = fVar.o(z);
        float f = sy6VarK.a;
        float f2 = sy6VarK.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = sy6VarK.b;
        float f4 = sy6VarK.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static final dl4 t(ya7 ya7Var, int i, int i2, int i3, int i4, int i5, el4 el4Var, List list, b96[] b96VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            yk4 yk4Var = (yk4) list2.get(i14);
            float fE = xa7.e(xa7.d(yk4Var));
            if (fE > 0.0f) {
                f2 += fE;
                i15++;
                j = j2;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                b96 b96VarT = b96VarArr[i14];
                j = j2;
                if (b96VarT == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    b96VarT = yk4Var.t(ya7Var.c(0, i12, false, i4));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                b96 b96Var = b96VarT;
                int iJ = ya7Var.j(b96Var);
                int iH = ya7Var.h(b96Var);
                iArr2[i10 - i6] = iJ;
                int i18 = i17 - iJ;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iJ + iMin;
                iMax = Math.max(iMax, iH);
                b96VarArr[i10] = b96Var;
                i15 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i19 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(xa7.e(xa7.d((yk4) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (b96VarArr[i21] == null) {
                    yk4 yk4Var2 = (yk4) list2.get(i21);
                    f = f3;
                    ab7 ab7VarD = xa7.d(yk4Var2);
                    float fE2 = xa7.e(ab7VarD);
                    if (fE2 <= 0.0f) {
                        pn3.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fE2 * f) + iSignum);
                    b96 b96VarT2 = yk4Var2.t(ya7Var.c((!(ab7VarD != null ? ab7VarD.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, true, i4));
                    int iJ2 = ya7Var.j(b96VarT2);
                    int iH2 = ya7Var.h(b96VarT2);
                    iArr2[i21 - i6] = iJ2;
                    i23 += iJ2;
                    int iMax3 = Math.max(i22, iH2);
                    b96VarArr[i21] = b96VarT2;
                    i22 = iMax3;
                    jRound = j5;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i23) + j4);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        ya7Var.a(iMax4, el4Var, iArr2, iArr3);
        return ya7Var.f(b96VarArr, el4Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static final String u(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    is3.h(0, i2, bArr.length);
                    return new String(bArr, 0, i2, zp0.a);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    js3.o(strSubstring, "substring(...)");
                    js3.q(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final wo3 w(no3 no3Var) {
        return new wo3(no3Var.a, no3Var.b, no3Var.c, no3Var.d);
    }

    public static h09 x(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = s26.b;
        String strX = !js3.i(str2, "/") ? m88.X(str, str2, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strX.length()) {
            char cCharAt = strX.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strX.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strX.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strX.substring(0, i6);
            js3.o(strSubstring2, "substring(...)");
            strSubstring = strX.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
            js3.o(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i3 != -1) {
            strSubstring3 = strX.substring(i3, iMin2);
            js3.o(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i4 != -1) {
            strSubstring4 = strX.substring(i4, iMin);
            js3.o(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i2 != -1) {
            strSubstring5 = strX.substring(i2, strX.length());
            js3.o(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strU = strSubstring2 != null ? u(strSubstring2, bArr) : null;
        String strU2 = strSubstring != null ? u(strSubstring, bArr) : null;
        String strU3 = strSubstring3 != null ? u(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            u(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            u(strSubstring5, bArr);
        }
        return new h09(strX, str2, strU, strU2, strU3);
    }

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float c(int i);

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int g();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(CoordinatorLayout coordinatorLayout);

    public abstract int o();

    public abstract boolean p(float f);

    public abstract boolean q(View view);

    public abstract boolean s(float f, float f2);

    public abstract boolean v(View view, float f);

    public abstract void y(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void z(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);
}
