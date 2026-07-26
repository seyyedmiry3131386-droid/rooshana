package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.mo0;
import defpackage.nr6;
import defpackage.rk4;
import defpackage.sk4;
import defpackage.so0;
import defpackage.to0;
import defpackage.ur8;
import defpackage.wr8;
import defpackage.y97;
import defpackage.zu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] H = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final zu I = new zu(2);
    public static final mo0 J = new mo0(Matrix.class, "animatedTransform", 5);

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void P(wr8 wr8Var, boolean z) {
        Matrix matrix;
        View view = wr8Var.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = wr8Var.a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z ? (Matrix) imageView.getTag(nr6.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = so0.a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float fMax = Math.max(width / f, height / f2);
                        int iRound = Math.round((width - (f * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        P(wr8Var, false);
    }

    @Override // androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        P(wr8Var, true);
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var == null) {
            return null;
        }
        HashMap map = wr8Var.a;
        if (wr8Var2 == null) {
            return null;
        }
        HashMap map2 = wr8Var2.a;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) wr8Var2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        mo0 mo0Var = J;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            rk4 rk4Var = sk4.a;
            return ObjectAnimator.ofObject(imageView, mo0Var, I, rk4Var, rk4Var);
        }
        if (matrix == null) {
            matrix = sk4.a;
        }
        if (matrix2 == null) {
            matrix2 = sk4.a;
        }
        mo0Var.getClass();
        y97.j(imageView, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, mo0Var, new ur8(), matrix, matrix2);
        to0 to0Var = new to0(imageView, matrix, matrix2);
        objectAnimatorOfObject.addListener(to0Var);
        objectAnimatorOfObject.addPauseListener(to0Var);
        a(to0Var);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return H;
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
