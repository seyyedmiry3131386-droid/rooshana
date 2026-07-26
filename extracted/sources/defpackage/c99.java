package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class c99 extends f99 {
    public SparseArray f;
    public float[] g;

    @Override // defpackage.f99
    public final void b(int i, float f) {
        throw new RuntimeException("call of custom attribute setPoint");
    }

    @Override // defpackage.f99
    public final void c(View view, float f) {
        this.a.y(f, this.g);
        zk8.j0((w21) this.f.valueAt(0), view, this.g);
    }

    @Override // defpackage.f99
    public final void d(int i) {
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        int iC = ((w21) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            w21 w21Var = (w21) sparseArray.valueAt(i2);
            dArr[i2] = ((double) iKeyAt) * 0.01d;
            w21Var.b(this.g);
            int i3 = 0;
            while (true) {
                if (i3 < this.g.length) {
                    dArr2[i2][i3] = r7[i3];
                    i3++;
                }
            }
        }
        this.a = c26.u(i, dArr, dArr2);
    }
}
