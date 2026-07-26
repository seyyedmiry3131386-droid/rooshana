package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class q95 {
    public final rb4 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public q95(rb4 rb4Var, long j, int i, int i2) {
        boolean z;
        int i3;
        int iG;
        int i4;
        this.a = rb4Var;
        this.b = i;
        if (h31.j(j) != 0 || h31.i(j) != 0) {
            sn3.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) rb4Var.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            m16 m16Var = (m16) arrayList2.get(i5);
            ch chVar = m16Var.a;
            int iH = h31.h(j);
            if (h31.c(j)) {
                i3 = i5;
                iG = h31.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i3 = i5;
                iG = h31.g(j);
            }
            yg ygVar = new yg(chVar, this.b - i6, i2, j31.b(iH, iG, 5));
            float fB = ygVar.b() + f;
            pi8 pi8Var = ygVar.d;
            int i7 = i6 + pi8Var.g;
            arrayList.add(new l16(ygVar, m16Var.b, m16Var.c, i6, i7, f, fB));
            if (!pi8Var.d) {
                if (i7 == this.b) {
                    i4 = i3;
                    if (i4 != br9.y((ArrayList) this.a.e)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i7;
                f = fB;
            }
            z = true;
            i6 = i7;
            f = fB;
            break;
        }
        z = false;
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = h31.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            l16 l16Var = (l16) arrayList.get(i8);
            ?? r7 = l16Var.a.f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i9 = 0; i9 < size3; i9++) {
                sy6 sy6Var = (sy6) r7.get(i9);
                arrayList4.add(sy6Var != null ? l16Var.a(sy6Var) : null);
            }
            a.b0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.c).size()) {
            int size4 = ((List) this.a.c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = a.z0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public static void i(q95 q95Var, tm0 tm0Var, long j, ur7 ur7Var, qg8 qg8Var, iv1 iv1Var) {
        tm0Var.e();
        ArrayList arrayList = q95Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l16 l16Var = (l16) arrayList.get(i);
            l16Var.a.f(tm0Var, j, ur7Var, qg8Var, iv1Var);
            tm0Var.n(0.0f, l16Var.a.b());
        }
        tm0Var.o();
    }

    public static void j(q95 q95Var, tm0 tm0Var, ch0 ch0Var, float f, ur7 ur7Var, qg8 qg8Var, iv1 iv1Var) {
        tm0Var.e();
        ArrayList arrayList = q95Var.h;
        if (arrayList.size() <= 1 || (ch0Var instanceof k18)) {
            ct2.g(q95Var, tm0Var, ch0Var, f, ur7Var, qg8Var, iv1Var);
        } else {
            if (!(ch0Var instanceof sr7)) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                l16 l16Var = (l16) arrayList.get(i);
                fB += l16Var.a.b();
                fMax = Math.max(fMax, l16Var.a.d());
            }
            Shader shaderB = ((sr7) ch0Var).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                yg ygVar = ((l16) arrayList.get(i2)).a;
                ygVar.g(tm0Var, new dh0(shaderB), f, ur7Var, qg8Var, iv1Var);
                tm0Var.n(0.0f, ygVar.b());
                matrix.setTranslate(0.0f, -ygVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        tm0Var.o();
    }

    public final void a(long j, float[] fArr) {
        k(zi8.g(j));
        l(zi8.f(j));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.a = 0;
        dt2.m(this.h, j, new ke0(j, fArr, ref$IntRef, new Ref$FloatRef()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        l16 l16Var = (l16) arrayList.get(dt2.k(i, arrayList));
        yg ygVar = l16Var.a;
        return ygVar.d.e(i - l16Var.d) + l16Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        m(i);
        ArrayList arrayList = this.h;
        l16 l16Var = (l16) arrayList.get(dt2.k(i, arrayList));
        yg ygVar = l16Var.a;
        int i2 = i - l16Var.d;
        pi8 pi8Var = ygVar.d;
        if (z) {
            Layout layout = pi8Var.f;
            ThreadLocal threadLocal = ti8.a;
            if (layout.getEllipsisCount(i2) <= 0 || pi8Var.b != TextUtils.TruncateAt.END) {
                rb4 rb4VarC = pi8Var.c();
                Layout layout2 = (Layout) rb4VarC.b;
                iF = rb4VarC.E(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = pi8Var.f(i2);
        }
        return iF + l16Var.b;
    }

    public final int d(int i) {
        int length = ((ll) this.a.b).b.length();
        ArrayList arrayList = this.h;
        l16 l16Var = (l16) arrayList.get(i >= length ? br9.y(arrayList) : i < 0 ? 0 : dt2.j(i, arrayList));
        return l16Var.a.d.f.getLineForOffset(l16Var.d(i)) + l16Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        l16 l16Var = (l16) arrayList.get(dt2.l(arrayList, f));
        int i = l16Var.c - l16Var.b;
        int i2 = l16Var.d;
        if (i == 0) {
            return i2;
        }
        yg ygVar = l16Var.a;
        float f2 = f - l16Var.f;
        pi8 pi8Var = ygVar.d;
        return pi8Var.f.getLineForVertical(((int) f2) - pi8Var.h) + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        l16 l16Var = (l16) arrayList.get(dt2.k(i, arrayList));
        yg ygVar = l16Var.a;
        return ygVar.d.g(i - l16Var.d) + l16Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        l16 l16Var = (l16) arrayList.get(dt2.l(arrayList, fIntBitsToFloat));
        int i2 = l16Var.c;
        int i3 = l16Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        yg ygVar = l16Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) - l16Var.f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        pi8 pi8Var = ygVar.d;
        int lineForVertical = pi8Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - pi8Var.h);
        return pi8Var.f.getOffsetForHorizontal(lineForVertical, (pi8Var.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(sy6 sy6Var, int i, p58 p58Var) {
        long jB;
        long j;
        float f = sy6Var.b;
        ArrayList arrayList = this.h;
        int iL = dt2.l(arrayList, f);
        float f2 = ((l16) arrayList.get(iL)).g;
        float f3 = sy6Var.d;
        if (f2 >= f3 || iL == br9.y(arrayList)) {
            l16 l16Var = (l16) arrayList.get(iL);
            return l16Var.b(l16Var.a.c(l16Var.c(sy6Var), i, p58Var), true);
        }
        int iL2 = dt2.l(arrayList, f3);
        long jB2 = zi8.b;
        while (true) {
            jB = zi8.b;
            if (!zi8.c(jB2, jB) || iL > iL2) {
                break;
            }
            l16 l16Var2 = (l16) arrayList.get(iL);
            jB2 = l16Var2.b(l16Var2.a.c(l16Var2.c(sy6Var), i, p58Var), true);
            iL++;
        }
        if (zi8.c(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = zi8.b;
            if (!zi8.c(jB, j) || iL > iL2) {
                break;
            }
            l16 l16Var3 = (l16) arrayList.get(iL2);
            jB = l16Var3.b(l16Var3.a.c(l16Var3.c(sy6Var), i, p58Var), true);
            iL2--;
        }
        return zi8.c(jB, j) ? jB2 : uy6.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i) {
        boolean z = false;
        rb4 rb4Var = this.a;
        if (i >= 0 && i < ((ll) rb4Var.b).b.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbR = rm7.r(i, "offset(", ") is out of bounds [0, ");
        sbR.append(((ll) rb4Var.b).b.length());
        sbR.append(')');
        sn3.a(sbR.toString());
    }

    public final void l(int i) {
        boolean z = false;
        rb4 rb4Var = this.a;
        if (i >= 0 && i <= ((ll) rb4Var.b).b.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbR = rm7.r(i, "offset(", ") is out of bounds [0, ");
        sbR.append(((ll) rb4Var.b).b.length());
        sbR.append(']');
        sn3.a(sbR.toString());
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        sn3.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
