package defpackage;

import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class h81 {
    public final float[] a;

    public h81(float[] fArr) {
        this.a = fArr;
        if (fArr.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public final float a() {
        return this.a[6];
    }

    public final float b() {
        return this.a[7];
    }

    public final long c(float f) {
        float f2 = 1 - f;
        float[] fArr = this.a;
        float f3 = f2 * f2 * f2;
        float f4 = 3 * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = f * f * f;
        return ge2.a((a() * f7) + (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3), (b() * f7) + (fArr[5] * f6) + (fArr[3] * f5) + (fArr[1] * f3));
    }

    public final Pair d(float f) {
        float f2 = 1 - f;
        long jC = c(f);
        float[] fArr = this.a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2 * f2 * f;
        float f9 = f * f;
        return new Pair(rq4.a(f3, f4, (f5 * f) + (f3 * f2), (f6 * f) + (f4 * f2), (fArr[4] * f9) + (f5 * f8) + (f3 * f7), (fArr[5] * f9) + (f6 * f8) + (f4 * f7), yq2.i0(jC), yq2.j0(jC)), rq4.a(yq2.i0(jC), yq2.j0(jC), (a() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (b() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (a() * f) + (fArr[4] * f2), (b() * f) + (fArr[5] * f2), a(), b()));
    }

    public final ua5 e(rn6 rn6Var) {
        float[] fArr = new float[8];
        ua5 ua5Var = new ua5(fArr);
        float[] fArr2 = this.a;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        ua5Var.f(rn6Var, 0);
        ua5Var.f(rn6Var, 2);
        ua5Var.f(rn6Var, 4);
        ua5Var.f(rn6Var, 6);
        return ua5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h81)) {
            return false;
        }
        return Arrays.equals(this.a, ((h81) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(a());
        sb.append(", ");
        sb.append(b());
        sb.append(')');
        return sb.toString();
    }
}
