package defpackage;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class e89 {
    public v24 a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    public static e89 c(String str) {
        if (str.startsWith("CUSTOM")) {
            b89 b89Var = new b89();
            b89Var.g = new float[1];
            return b89Var;
        }
        switch (str) {
            case "rotationX":
                return new a89(3);
            case "rotationY":
                return new a89(4);
            case "translationX":
                return new a89(7);
            case "translationY":
                return new a89(8);
            case "translationZ":
                return new a89(9);
            case "progress":
                d89 d89Var = new d89();
                d89Var.g = false;
                return d89Var;
            case "scaleX":
                return new a89(5);
            case "scaleY":
                return new a89(6);
            case "waveVariesBy":
                return new a89(0);
            case "rotation":
                return new a89(2);
            case "elevation":
                return new a89(1);
            case "transitionPathRotate":
                return new c89();
            case "alpha":
                return new a89(0);
            case "waveOffset":
                return new a89(0);
            default:
                return null;
        }
    }

    public final float a(float f) {
        v24 v24Var = this.a;
        c26 c26Var = (c26) v24Var.g;
        if (c26Var != null) {
            c26Var.x(f, (double[]) v24Var.h);
        } else {
            double[] dArr = (double[]) v24Var.h;
            dArr[0] = ((float[]) v24Var.e)[0];
            dArr[1] = ((float[]) v24Var.f)[0];
            dArr[2] = ((float[]) v24Var.b)[0];
        }
        double[] dArr2 = (double[]) v24Var.h;
        return (float) ((((jp8) v24Var.a).p(f, dArr2[1]) * ((double[]) v24Var.h)[2]) + dArr2[0]);
    }

    public final float b(float f) {
        char c;
        char c2;
        double dB;
        double d;
        double dSignum;
        double dSin;
        v24 v24Var = this.a;
        jp8 jp8Var = (jp8) v24Var.a;
        c26 c26Var = (c26) v24Var.g;
        double d2 = 0.0d;
        if (c26Var != null) {
            double d3 = f;
            c26Var.C(d3, (double[]) v24Var.i);
            ((c26) v24Var.g).x(d3, (double[]) v24Var.h);
        } else {
            double[] dArr = (double[]) v24Var.i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d4 = f;
        double dP = jp8Var.p(d4, ((double[]) v24Var.h)[1]);
        double d5 = ((double[]) v24Var.h)[1];
        double d6 = ((double[]) v24Var.i)[1];
        double dM = jp8Var.m(d4) + d5;
        if (d4 <= 0.0d) {
            c = 2;
            c2 = 0;
        } else if (d4 >= 1.0d) {
            c = 2;
            c2 = 0;
            d2 = 1.0d;
        } else {
            int iBinarySearch = Arrays.binarySearch((double[]) jp8Var.d, d4);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            float[] fArr = (float[]) jp8Var.c;
            float f2 = fArr[iBinarySearch];
            int i = iBinarySearch - 1;
            float f3 = fArr[i];
            c = 2;
            c2 = 0;
            double d7 = f2 - f3;
            double[] dArr2 = (double[]) jp8Var.d;
            double d8 = dArr2[iBinarySearch];
            double d9 = dArr2[i];
            double d10 = d7 / (d8 - d9);
            d2 = (((double) f3) - (d10 * d9)) + (d4 * d10);
        }
        double d11 = d2 + d6;
        double d12 = 2.0d;
        switch (jp8Var.b) {
            case 1:
                dB = 0.0d;
                break;
            case 2:
                d = d11 * 4.0d;
                dSignum = Math.signum((((dM * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                dB = d * dSignum;
                break;
            case 3:
                dB = d11 * 2.0d;
                break;
            case 4:
                dSin = -d11;
                dB = dSin * d12;
                break;
            case 5:
                d12 = (-6.283185307179586d) * d11;
                dSin = Math.sin(6.283185307179586d * dM);
                dB = dSin * d12;
                break;
            case 6:
                dB = d11 * 4.0d * ((((dM * 4.0d) + 2.0d) % 4.0d) - 2.0d);
                break;
            case 7:
                dB = ((px4) jp8Var.f).B(dM % 1.0d);
                break;
            default:
                d = d11 * 6.283185307179586d;
                dSignum = Math.cos(6.283185307179586d * dM);
                dB = d * dSignum;
                break;
        }
        double[] dArr3 = (double[]) v24Var.i;
        return (float) ((dB * ((double[]) v24Var.h)[c]) + (dP * dArr3[c]) + dArr3[c2]);
    }

    public abstract void e(View view, float f);

    public final void f() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        ArrayList<zx3> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new yg2(22));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.c;
        String str = this.d;
        v24 v24Var = new v24();
        jp8 jp8Var = new jp8(4);
        jp8Var.c = new float[0];
        jp8Var.d = new double[0];
        v24Var.a = jp8Var;
        jp8Var.b = i6;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int iIndexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i7 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i7++;
            }
            dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i7 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i8 = 0;
            while (i8 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i8];
                int i9 = i8 + length2;
                dArr4[i9][0] = d3;
                double d4 = d2;
                double d5 = ((double) i8) * d4;
                dArr5[i9] = d5;
                if (i8 > 0) {
                    int i10 = (length2 * 2) + i8;
                    dArr4[i10][0] = d3 + 1.0d;
                    dArr5[i10] = d5 + 1.0d;
                    int i11 = i8 - 1;
                    dArr4[i11][0] = (d3 - 1.0d) - d4;
                    dArr5[i11] = (d5 - 1.0d) - d4;
                }
                i8++;
                d2 = d4;
            }
            jp8Var.f = new px4(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        v24Var.b = new float[size];
        v24Var.c = new double[size];
        v24Var.d = new float[size];
        v24Var.e = new float[size];
        v24Var.f = new float[size];
        float[] fArr = new float[size];
        this.a = v24Var;
        int i12 = i4;
        for (zx3 zx3Var : arrayList) {
            float f = zx3Var.d;
            dArr[i12] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = zx3Var.b;
            dArr6[i4] = f2;
            float f3 = zx3Var.c;
            dArr6[i2] = f3;
            float f4 = zx3Var.e;
            dArr6[i] = f4;
            v24 v24Var2 = this.a;
            ((double[]) v24Var2.c)[i12] = ((double) zx3Var.a) / 100.0d;
            ((float[]) v24Var2.d)[i12] = f;
            ((float[]) v24Var2.e)[i12] = f3;
            ((float[]) v24Var2.f)[i12] = f4;
            ((float[]) v24Var2.b)[i12] = f2;
            i12++;
        }
        v24 v24Var3 = this.a;
        float[] fArr2 = (float[]) v24Var3.d;
        jp8 jp8Var2 = (jp8) v24Var3.a;
        double[] dArr7 = (double[]) v24Var3.c;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) v24Var3.b;
        v24Var3.h = new double[fArr3.length + i13];
        v24Var3.i = new double[fArr3.length + i13];
        double d6 = 0.0d;
        if (dArr7[i4] > 0.0d) {
            jp8Var2.c(0.0d, fArr2[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            jp8Var2.c(d, fArr2[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr9 = dArr8[i14];
            dArr9[i4] = ((float[]) v24Var3.e)[i14];
            dArr9[i2] = ((float[]) v24Var3.f)[i14];
            dArr9[2] = fArr3[i14];
            jp8Var2.c(dArr7[i14], fArr2[i14]);
        }
        double d7 = 0.0d;
        int i15 = i4;
        while (true) {
            float[] fArr4 = (float[]) jp8Var2.c;
            if (i15 >= fArr4.length) {
                break;
            }
            d7 += (double) fArr4[i15];
            i15++;
        }
        double d8 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr5 = (float[]) jp8Var2.c;
            if (i16 >= fArr5.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr5[i17] + fArr5[i16]) / 2.0f;
            double d9 = d6;
            double[] dArr10 = (double[]) jp8Var2.d;
            d8 = ((dArr10[i16] - dArr10[i17]) * ((double) f5)) + d8;
            i16++;
            d6 = d9;
        }
        double d10 = d6;
        int i18 = i4;
        while (true) {
            float[] fArr6 = (float[]) jp8Var2.c;
            if (i18 >= fArr6.length) {
                break;
            }
            fArr6[i18] = fArr6[i18] * ((float) (d7 / d8));
            i18++;
        }
        ((double[]) jp8Var2.e)[i4] = d10;
        int i19 = i2;
        while (true) {
            float[] fArr7 = (float[]) jp8Var2.c;
            if (i19 >= fArr7.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr7[i20] + fArr7[i19]) / 2.0f;
            double[] dArr11 = (double[]) jp8Var2.d;
            double d11 = dArr11[i19] - dArr11[i20];
            double[] dArr12 = (double[]) jp8Var2.e;
            dArr12[i19] = (d11 * ((double) f6)) + dArr12[i20];
            i19++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            v24Var3.g = c26.u(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            v24Var3.g = null;
        }
        c26.u(i5, dArr, dArr2);
    }

    public final String toString() {
        String string = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (zx3 zx3Var : this.f) {
            StringBuilder sbE = bl4.E(string, "[");
            sbE.append(zx3Var.a);
            sbE.append(" , ");
            sbE.append(decimalFormat.format(zx3Var.b));
            sbE.append("] ");
            string = sbE.toString();
        }
        return string;
    }

    public void d(w21 w21Var) {
    }
}
