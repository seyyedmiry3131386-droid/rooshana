package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import defpackage.a27;
import defpackage.ov7;
import defpackage.ry7;
import defpackage.sb7;
import defpackage.sy7;
import defpackage.ty7;
import defpackage.wq2;
import defpackage.wr8;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class Slide extends Visibility {
    public static final DecelerateInterpolator K = new DecelerateInterpolator();
    public static final AccelerateInterpolator L = new AccelerateInterpolator();
    public static final ry7 M = new ry7(0);
    public static final ry7 N = new ry7(1);
    public static final sy7 O = new sy7(0);
    public static final ry7 P = new ry7(2);
    public static final ry7 Q = new ry7(3);
    public static final sy7 R = new sy7(1);
    public final ty7 J;

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sy7 sy7Var = R;
        this.J = sy7Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wq2.l);
        int iF = a27.f(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        if (iF == 3) {
            this.J = M;
        } else if (iF == 5) {
            this.J = P;
        } else if (iF == 48) {
            this.J = O;
        } else if (iF == 80) {
            this.J = sy7Var;
        } else if (iF == 8388611) {
            this.J = N;
        } else {
            if (iF != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.J = Q;
        }
        ov7 ov7Var = new ov7();
        ov7Var.s = iF;
        this.x = ov7Var;
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) wr8Var2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return sb7.g(view, wr8Var2, iArr[0], iArr[1], this.J.a(view, viewGroup), this.J.b(view, viewGroup), translationX, translationY, K, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator S(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var == null) {
            return null;
        }
        int[] iArr = (int[]) wr8Var.a.get("android:slide:screenPosition");
        return sb7.g(view, wr8Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.J.a(view, viewGroup), this.J.b(view, viewGroup), L, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        Visibility.P(wr8Var);
        int[] iArr = new int[2];
        wr8Var.b.getLocationOnScreen(iArr);
        wr8Var.a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        Visibility.P(wr8Var);
        int[] iArr = new int[2];
        wr8Var.b.getLocationOnScreen(iArr);
        wr8Var.a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
