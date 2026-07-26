package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.vr8;
import defpackage.wr8;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeScroll extends Transition {
    public static final String[] H = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void P(wr8 wr8Var) {
        HashMap map = wr8Var.a;
        View view = wr8Var.b;
        map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        P(wr8Var);
    }

    @Override // androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        P(wr8Var);
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (wr8Var != null) {
            HashMap map = wr8Var.a;
            if (wr8Var2 != null) {
                HashMap map2 = wr8Var2.a;
                View view = wr8Var2.b;
                int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
                int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
                int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
                int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
                if (iIntValue != iIntValue2) {
                    view.setScrollX(iIntValue);
                    objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
                } else {
                    objectAnimatorOfInt = null;
                }
                if (iIntValue3 != iIntValue4) {
                    view.setScrollY(iIntValue3);
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
                }
                boolean z = vr8.a;
                if (objectAnimatorOfInt == null) {
                    return objectAnimatorOfInt2;
                }
                if (objectAnimatorOfInt2 == null) {
                    return objectAnimatorOfInt;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
                return animatorSet;
            }
        }
        return null;
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
