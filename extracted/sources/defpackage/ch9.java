package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.jsibbold.zoomage.ZoomageView;

/* JADX INFO: loaded from: classes3.dex */
public final class ch9 implements ValueAnimator.AnimatorUpdateListener {
    public final Matrix a;
    public final float[] b = new float[9];
    public final /* synthetic */ Matrix c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ ZoomageView h;

    public ch9(ZoomageView zoomageView, Matrix matrix, float f, float f2, float f3, float f4) {
        this.h = zoomageView;
        this.c = matrix;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.a = new Matrix(zoomageView.getImageMatrix());
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.c;
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        float[] fArr = this.b;
        matrix2.getValues(fArr);
        fArr[2] = (this.d * fFloatValue) + fArr[2];
        fArr[5] = (this.e * fFloatValue) + fArr[5];
        fArr[0] = (this.f * fFloatValue) + fArr[0];
        fArr[4] = (this.g * fFloatValue) + fArr[4];
        matrix2.setValues(fArr);
        this.h.setImageMatrix(matrix2);
    }
}
