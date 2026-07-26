package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import defpackage.ln2;
import defpackage.nr6;
import defpackage.sb7;
import defpackage.wr8;
import defpackage.yr0;

/* JADX INFO: loaded from: classes.dex */
public class Explode extends Visibility {
    public static final DecelerateInterpolator K = new DecelerateInterpolator();
    public static final AccelerateInterpolator L = new AccelerateInterpolator();
    public final int[] J;

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = new int[2];
        this.x = new yr0();
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var2 == null) {
            return null;
        }
        Rect rect = (Rect) wr8Var2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        U(viewGroup, rect, this.J);
        return sb7.g(view, wr8Var2, rect.left, rect.top, translationX + r0[0], translationY + r0[1], translationX, translationY, K, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator S(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        float f;
        float f2;
        if (wr8Var == null) {
            return null;
        }
        Rect rect = (Rect) wr8Var.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) wr8Var.b.getTag(nr6.transition_position);
        if (iArr != null) {
            f = (r7 - rect.left) + translationX;
            f2 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        U(viewGroup, rect, this.J);
        return sb7.g(view, wr8Var, i, i2, translationX, translationY, f + r0[0], f2 + r0[1], L, this);
    }

    public final void U(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.J;
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        ln2 ln2Var = this.y;
        Rect rectE = ln2Var == null ? null : ln2Var.e();
        if (rectE == null) {
            iCenterX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
            iCenterY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
        } else {
            iCenterX = rectE.centerX();
            iCenterY = rectE.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i3 = iCenterX - i;
        int i4 = iCenterY - i2;
        float fMax = Math.max(i3, viewGroup.getWidth() - i3);
        float fMax2 = Math.max(i4, viewGroup.getHeight() - i4);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void V(wr8 wr8Var) {
        View view = wr8Var.b;
        int[] iArr = this.J;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        wr8Var.a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        Visibility.P(wr8Var);
        V(wr8Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        Visibility.P(wr8Var);
        V(wr8Var);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
