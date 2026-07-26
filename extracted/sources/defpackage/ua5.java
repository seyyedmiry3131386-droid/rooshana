package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class ua5 extends h81 {
    public final void f(rn6 rn6Var, int i) {
        float[] fArr = this.a;
        float f = fArr[i];
        int i2 = i + 1;
        float f2 = fArr[i2];
        float[] fArr2 = (float[]) rn6Var.b;
        fArr2[0] = f;
        fArr2[1] = f2;
        ((Matrix) rn6Var.c).mapPoints(fArr2);
        long jA = ge2.a(fArr2[0], fArr2[1]);
        fArr[i] = Float.intBitsToFloat((int) (jA >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jA));
    }
}
