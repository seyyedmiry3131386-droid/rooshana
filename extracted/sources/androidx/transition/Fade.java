package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a27;
import defpackage.ba9;
import defpackage.i82;
import defpackage.nr6;
import defpackage.wq2;
import defpackage.wr8;

/* JADX INFO: loaded from: classes.dex */
public class Fade extends Visibility {
    public Fade(int i) {
        T(i);
    }

    public static float V(wr8 wr8Var, float f) {
        Float f2;
        return (wr8Var == null || (f2 = (Float) wr8Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Visibility
    public final Animator R(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        ba9.a.getClass();
        return U(view, V(wr8Var, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public final Animator S(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2) {
        ba9.a.getClass();
        ObjectAnimator objectAnimatorU = U(view, V(wr8Var, 1.0f), 0.0f);
        if (objectAnimatorU == null) {
            ba9.b(view, V(wr8Var2, 1.0f));
        }
        return objectAnimatorU;
    }

    public final ObjectAnimator U(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        ba9.b(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, ba9.b, f2);
        i82 i82Var = new i82(view);
        objectAnimatorOfFloat.addListener(i82Var);
        q().a(i82Var);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        Visibility.P(wr8Var);
        View view = wr8Var.b;
        Float fValueOf = (Float) view.getTag(nr6.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(ba9.a.h(view)) : Float.valueOf(0.0f);
        }
        wr8Var.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wq2.j);
        T(a27.f(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.H));
        typedArrayObtainStyledAttributes.recycle();
    }
}
