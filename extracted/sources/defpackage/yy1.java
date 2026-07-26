package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class yy1 implements dq2 {
    public static final yy1 c = new yy1();
    public static final String[] d = {"standard", "accelerate", "decelerate", "linear"};
    public final /* synthetic */ int a;
    public String b;

    public yy1() {
        this.a = 0;
        this.b = "identity";
    }

    public static yy1 c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new xy1(str);
        }
        if (str.startsWith("spline")) {
            y58 y58Var = new y58();
            y58Var.b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i = 0;
            while (iIndexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < dArrCopyOf.length; i2++) {
                double d3 = dArrCopyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d3;
                double d4 = ((double) i2) * d2;
                dArr3[i3] = d4;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d3 + 1.0d;
                    dArr3[i4] = d4 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d3 - 1.0d) - d2;
                    dArr3[i5] = (d4 - 1.0d) - d2;
                }
            }
            px4 px4Var = new px4(dArr3, dArr2);
            System.out.println(" 0 " + px4Var.w(0.0d));
            System.out.println(" 1 " + px4Var.w(1.0d));
            y58Var.e = px4Var;
            return y58Var;
        }
        if (str.startsWith("Schlick")) {
            kf7 kf7Var = new kf7();
            kf7Var.b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            kf7Var.e = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            kf7Var.f = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return kf7Var;
        }
        switch (str) {
            case "accelerate":
                return new xy1("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new xy1("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new xy1("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new xy1("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new xy1("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new xy1("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(d));
                return c;
        }
    }

    public double b(double d2) {
        return 1.0d;
    }

    @Override // defpackage.dq2
    public void onFailure(Throwable th) {
        wn5.l0("MediaNtfMng", "custom command " + this.b + " produced an error: " + th.getMessage(), th);
    }

    @Override // defpackage.dq2
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public yy1(String str) {
        this.a = 1;
        this.b = str;
    }

    public double a(double d2) {
        return d2;
    }
}
