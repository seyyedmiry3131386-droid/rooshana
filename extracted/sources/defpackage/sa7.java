package defpackage;

import android.os.SystemClock;
import android.text.SpannableString;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class sa7 {
    public static final /* synthetic */ int a = 0;

    public static final ra7 a(int i, float f, q61 q61Var, List list) {
        js3.p(q61Var, "rounding");
        float[] fArr = new float[i * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long jU0 = yq2.u0(p29.e(f, (p29.b / i) * 2 * i3), ge2.a(0.0f, 0.0f));
            int i4 = i2 + 1;
            fArr[i2] = yq2.i0(jU0);
            i2 += 2;
            fArr[i4] = yq2.j0(jU0);
        }
        return b(fArr, q61Var, list, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ra7 b(float[] fArr, q61 q61Var, List list, float f, float f2) {
        float f3;
        long jA;
        ArrayList arrayList;
        ArrayList arrayList2;
        List listB;
        h81 h81VarA;
        q61 q61Var2;
        Float fValueOf = Float.valueOf(1.0f);
        js3.p(q61Var, "rounding");
        if (fArr.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i = 2;
        int i2 = 1;
        if (fArr.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != fArr.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList3 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList4 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            q61 q61Var3 = (list == null || (q61Var2 = (q61) list.get(i4)) == null) ? q61Var : q61Var2;
            int i5 = (((i4 + length) - 1) % length) * 2;
            int i6 = i4 + 1;
            int i7 = (i6 % length) * 2;
            int i8 = i4 * 2;
            arrayList4.add(new ja7(ge2.a(fArr[i5], fArr[i5 + 1]), ge2.a(fArr[i8], fArr[i8 + 1]), ge2.a(fArr[i7], fArr[i7 + 1]), q61Var3));
            i4 = i6;
        }
        uq3 uq3VarZ = ok4.Z(0, length);
        ArrayList arrayList5 = new ArrayList(wu0.V(uq3VarZ, 10));
        Iterator it = uq3VarZ.iterator();
        while (true) {
            f3 = 0.0f;
            if (!((tq3) it).c) {
                break;
            }
            int iNextInt = ((mq3) it).nextInt();
            int i9 = (iNextInt + 1) % length;
            float f4 = ((ja7) arrayList4.get(iNextInt)).h + ((ja7) arrayList4.get(i9)).h;
            float fC = ((ja7) arrayList4.get(i9)).c() + ((ja7) arrayList4.get(iNextInt)).c();
            int i10 = iNextInt * 2;
            float f5 = fArr[i10];
            float f6 = fArr[i10 + 1];
            int i11 = i9 * 2;
            float f7 = f5 - fArr[i11];
            float f8 = f6 - fArr[i11 + 1];
            float f9 = p29.b;
            float fSqrt = (float) Math.sqrt((f8 * f8) + (f7 * f7));
            arrayList5.add(f4 > fSqrt ? new Pair(Float.valueOf(fSqrt / f4), Float.valueOf(0.0f)) : fC > fSqrt ? new Pair(fValueOf, Float.valueOf((fSqrt - f4) / (fC - f4))) : new Pair(fValueOf, fValueOf));
        }
        int i12 = 0;
        while (i12 < length) {
            float[] fArr2 = new float[i];
            int i13 = i3;
            int i14 = i13;
            while (i13 < i) {
                int i15 = i3;
                Pair pair = (Pair) arrayList5.get((((i12 + length) - 1) + i13) % length);
                float f10 = f3;
                int i16 = i;
                float f11 = dw1.f(((ja7) arrayList4.get(i12)).c(), ((ja7) arrayList4.get(i12)).h, ((Number) pair.b).floatValue(), ((ja7) arrayList4.get(i12)).h * ((Number) pair.a).floatValue());
                int i17 = i14 + 1;
                if (fArr2.length < i17) {
                    float[] fArrCopyOf = Arrays.copyOf(fArr2, Math.max(i17, (fArr2.length * 3) / 2));
                    js3.o(fArrCopyOf, "copyOf(...)");
                    fArr2 = fArrCopyOf;
                }
                fArr2[i14] = f11;
                i13++;
                f3 = f10;
                i14 = i17;
                i3 = i15;
                i = i16;
            }
            int i18 = i;
            int i19 = i3;
            float f12 = f3;
            ja7 ja7Var = (ja7) arrayList4.get(i12);
            if (i14 <= 0) {
                lb7.k("Index must be between 0 and size");
                throw null;
            }
            float f13 = fArr2[i19];
            if (i2 >= i14) {
                lb7.k("Index must be between 0 and size");
                throw null;
            }
            float f14 = fArr2[i2];
            long j = ja7Var.e;
            long j2 = ja7Var.d;
            int i20 = i2;
            float f15 = ja7Var.f;
            ArrayList arrayList6 = arrayList3;
            long j3 = ja7Var.b;
            float fMin = Math.min(f13, f14);
            int i21 = i12;
            float f16 = ja7Var.h;
            if (f16 < 1.0E-4f || fMin < 1.0E-4f || f15 < 1.0E-4f) {
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                ja7Var.i = j3;
                float fI0 = yq2.i0(j3);
                float fJ0 = yq2.j0(j3);
                float fI02 = yq2.i0(j3);
                float fJ02 = yq2.j0(j3);
                listB = br9.B(rq4.a(fI0, fJ0, p29.c(fI0, fI02, 0.33333334f), p29.c(fJ0, fJ02, 0.33333334f), p29.c(fI0, fI02, 0.6666667f), p29.c(fJ0, fJ02, 0.6666667f), fI02, fJ02));
            } else {
                float fMin2 = Math.min(fMin, f16);
                float fA = ja7Var.a(f13);
                float fA2 = ja7Var.a(f14);
                float f17 = (f15 * fMin2) / f16;
                float f18 = p29.b;
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                ja7Var.i = yq2.u0(j3, yq2.w0((float) Math.sqrt((fMin2 * fMin2) + (f17 * f17)), yq2.d0(yq2.Y(2.0f, yq2.u0(j2, j)))));
                long jU0 = yq2.u0(j3, yq2.w0(fMin2, j2));
                long jU02 = yq2.u0(j3, yq2.w0(fMin2, j));
                h81 h81VarB = ja7.b(fMin2, fA, ja7Var.b, ja7Var.a, jU0, jU02, ja7Var.i, f17);
                h81 h81VarB2 = ja7.b(fMin2, fA2, ja7Var.b, ja7Var.c, jU02, jU0, ja7Var.i, f17);
                float fA3 = h81VarB2.a();
                float fB = h81VarB2.b();
                float[] fArr3 = h81VarB2.a;
                h81 h81VarA2 = rq4.a(fA3, fB, fArr3[4], fArr3[5], fArr3[i18], fArr3[3], fArr3[i19], fArr3[i20]);
                float fI03 = yq2.i0(ja7Var.i);
                float fJ03 = yq2.j0(ja7Var.i);
                float fA4 = h81VarB.a();
                float fB2 = h81VarB.b();
                float[] fArr4 = h81VarA2.a;
                float f19 = fArr4[i19];
                float f20 = fArr4[i20];
                long jB = p29.b(fA4 - fI03, fB2 - fJ03);
                float f21 = f19 - fI03;
                float f22 = f20 - fJ03;
                long jB2 = p29.b(f21, f22);
                long jA2 = ge2.a(-yq2.j0(jB), yq2.i0(jB));
                long jA3 = ge2.a(-yq2.j0(jB2), yq2.i0(jB2));
                int i22 = (yq2.j0(jA2) * f22) + (yq2.i0(jA2) * f21) >= f12 ? i20 : i19;
                float fZ = yq2.Z(jB, jB2);
                if (fZ > 0.999f) {
                    h81VarA = rq4.a(fA4, fB2, p29.c(fA4, f19, 0.33333334f), p29.c(fB2, f20, 0.33333334f), p29.c(fA4, f19, 0.6666667f), p29.c(fB2, f20, 0.6666667f), f19, f20);
                } else {
                    float fSqrt2 = (((((float) Math.sqrt(i18 * r6)) - ((float) Math.sqrt(r9 - (fZ * fZ)))) * ((((float) Math.sqrt((r11 * r11) + (r10 * r10))) * 4.0f) / 3.0f)) / (i20 - fZ)) * (i22 != 0 ? 1.0f : -1.0f);
                    h81VarA = rq4.a(fA4, fB2, (yq2.i0(jA2) * fSqrt2) + fA4, (yq2.j0(jA2) * fSqrt2) + fB2, f19 - (yq2.i0(jA3) * fSqrt2), f20 - (yq2.j0(jA3) * fSqrt2), f19, f20);
                }
                h81[] h81VarArr = new h81[3];
                h81VarArr[i19] = h81VarB;
                h81VarArr[1] = h81VarA;
                h81VarArr[2] = h81VarA2;
                listB = br9.C(h81VarArr);
            }
            arrayList6.add(listB);
            i12 = i21 + 1;
            f3 = f12;
            arrayList3 = arrayList6;
            arrayList5 = arrayList;
            i3 = i19;
            arrayList4 = arrayList2;
            i = 2;
            i2 = 1;
        }
        ArrayList arrayList7 = arrayList3;
        ArrayList arrayList8 = arrayList4;
        int i23 = i3;
        float f23 = f3;
        ArrayList arrayList9 = new ArrayList();
        int i24 = i23;
        while (i24 < length) {
            int i25 = i24 + 1;
            int i26 = i25 % length;
            int i27 = i24 * 2;
            long jA4 = ge2.a(fArr[i27], fArr[i27 + 1]);
            int i28 = (((i24 + length) - 1) % length) * 2;
            long jA5 = ge2.a(fArr[i28], fArr[i28 + 1]);
            int i29 = i26 * 2;
            long jA6 = ge2.a(fArr[i29], fArr[i29 + 1]);
            long jQ0 = yq2.q0(jA4, jA5);
            long jQ02 = yq2.q0(jA6, jA4);
            ArrayList arrayList10 = arrayList8;
            arrayList9.add(new c92((List) arrayList7.get(i24), jA4, ((ja7) arrayList10.get(i24)).i, (yq2.j0(jQ02) * yq2.i0(jQ0)) - (yq2.i0(jQ02) * yq2.j0(jQ0)) > f23 ? 1 : i23));
            float fA5 = ((h81) a.u0((List) arrayList7.get(i24))).a();
            float fB3 = ((h81) a.u0((List) arrayList7.get(i24))).b();
            float f24 = ((h81) a.o0((List) arrayList7.get(i26))).a[i23];
            float f25 = ((h81) a.o0((List) arrayList7.get(i26))).a[1];
            arrayList9.add(new d92(br9.B(rq4.a(fA5, fB3, p29.c(fA5, f24, 0.33333334f), p29.c(fB3, f25, 0.33333334f), p29.c(fA5, f24, 0.6666667f), p29.c(fB3, f25, 0.6666667f), f24, f25))));
            arrayList8 = arrayList10;
            i24 = i25;
        }
        if (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) {
            float f26 = f23;
            float f27 = f26;
            int i30 = i23;
            while (i30 < fArr.length) {
                int i31 = i30 + 1;
                f27 += fArr[i30];
                i30 += 2;
                f26 += fArr[i31];
            }
            float f28 = 2;
            jA = ge2.a((f27 / fArr.length) / f28, (f26 / fArr.length) / f28);
        } else {
            jA = ge2.a(f, f2);
        }
        return new ra7(arrayList9, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }

    public static final sy6 c(a96 a96Var, int i, tq8 tq8Var, ri8 ri8Var, boolean z, int i2) {
        sy6 sy6VarC = ri8Var != null ? ri8Var.c(tq8Var.b.q(i)) : sy6.e;
        float f = sy6VarC.a;
        float f2 = eh8.a;
        a96Var.getClass();
        int iA = o40.a(a96Var, f2);
        return new sy6(z ? (i2 - f) - iA : f, sy6VarC.b, z ? i2 - f : iA + f, sy6VarC.d);
    }

    public static ra7 d(int i) {
        return a((i & 1) != 0 ? 8 : 10, 1.0f / ((float) Math.cos(p29.b / r3)), new q61(2), null);
    }

    public static ba4 e(p62 p62Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = p62Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (p62Var.a(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new ba4(length, i);
    }

    public static final pk7 f(pj3 pj3Var, String str) {
        Object next;
        js3.p(pj3Var, "<this>");
        js3.p(str, "seasonId");
        Iterator<E> it = pj3Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (js3.i(((pk7) next).a, str)) {
                break;
            }
        }
        return (pk7) next;
    }

    public static final String h(String str, bp2 bp2Var) {
        return (str == null || f88.n0(str)) ? (String) bp2Var.invoke() : str;
    }

    public static j49 j(String str) {
        String strGroup;
        if (str == null || f88.n0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i2 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i3 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
        js3.m(strGroup4);
        return new j49(strGroup4, i, i2, i3);
    }

    public static final ra7 k(float f, q61 q61Var, List list) {
        js3.p(q61Var, "rounding");
        float f2 = 2;
        float f3 = f / f2;
        float f4 = 0.0f - f3;
        float f5 = 1.0f / f2;
        float f6 = 0.0f - f5;
        float f7 = f3 + 0.0f;
        float f8 = f5 + 0.0f;
        return b(new float[]{f7, f8, f4, f8, f4, f6, f7, f6}, q61Var, list, 0.0f, 0.0f);
    }

    public static final ra7 p(int i, float f, q61 q61Var) {
        js3.p(q61Var, "rounding");
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f >= 1.0f) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = p29.b / i;
            long jE = p29.e(1.0f, 2 * f2 * i3);
            fArr[i2] = yq2.i0(jE) + 0.0f;
            fArr[i2 + 1] = yq2.j0(jE) + 0.0f;
            long jE2 = p29.e(f, f2 * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = yq2.i0(jE2) + 0.0f;
            i2 += 4;
            fArr[i4] = yq2.j0(jE2) + 0.0f;
        }
        return b(fArr, q61Var, null, 0.0f, 0.0f);
    }

    public static final SpannableString q(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.a.c, 0, spannableString.length(), 33);
        return spannableString;
    }

    public static void r(int i, int i2) {
        String strI;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strI = xa7.i("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(rm7.n(i2, "negative size: "));
                }
                strI = xa7.i("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strI);
        }
    }

    public static void s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? t("start index", i, i3) : (i2 < 0 || i2 > i3) ? t("end index", i2, i3) : xa7.i("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String t(String str, int i, int i2) {
        if (i < 0) {
            return xa7.i("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return xa7.i("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(rm7.n(i2, "negative size: "));
    }

    public abstract void g(int i);

    public abstract boolean i();

    public abstract void m(boolean z);

    public abstract void n();

    public abstract void o(int i);

    public void l(boolean z) {
    }
}
