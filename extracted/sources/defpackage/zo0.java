package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zo0 {
    public final Matrix a = new Matrix();
    public final View b;
    public final float[] c;
    public float d;
    public float e;

    public zo0(View view, float[] fArr) {
        this.b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.c = fArr2;
        this.d = fArr2[2];
        this.e = fArr2[5];
        a();
    }

    public final void a() {
        float f = this.d;
        float[] fArr = this.c;
        fArr[2] = f;
        fArr[5] = this.e;
        Matrix matrix = this.a;
        matrix.setValues(fArr);
        ba9.a.A(this.b, matrix);
    }
}
