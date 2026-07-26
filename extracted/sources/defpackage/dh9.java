package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.jsibbold.zoomage.ZoomageView;

/* JADX INFO: loaded from: classes3.dex */
public final class dh9 implements ValueAnimator.AnimatorUpdateListener {
    public final float[] a = new float[9];
    public final Matrix b = new Matrix();
    public final /* synthetic */ int c;
    public final /* synthetic */ ZoomageView d;

    public dh9(ZoomageView zoomageView, int i) {
        this.d = zoomageView;
        this.c = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ZoomageView zoomageView = this.d;
        Matrix imageMatrix = zoomageView.getImageMatrix();
        Matrix matrix = this.b;
        matrix.set(imageMatrix);
        float[] fArr = this.a;
        matrix.getValues(fArr);
        fArr[this.c] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        matrix.setValues(fArr);
        zoomageView.setImageMatrix(matrix);
    }
}
