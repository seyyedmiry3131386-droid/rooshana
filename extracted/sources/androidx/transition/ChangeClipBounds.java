package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ba9;
import defpackage.nr6;
import defpackage.ro0;
import defpackage.ty6;
import defpackage.wr8;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] H = {"android:clipBounds:clip"};
    public static final Rect I = new Rect();

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void P(wr8 wr8Var, boolean z) {
        View view = wr8Var.b;
        HashMap map = wr8Var.a;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(nr6.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != I ? clipBounds : null;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
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
        View view = wr8Var2.b;
        HashMap map2 = wr8Var2.a;
        if (!map.containsKey("android:clipBounds:clip") || !map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        view.setClipBounds(rect);
        Rect rect5 = new Rect();
        ty6 ty6Var = new ty6();
        ty6Var.b = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, ba9.c, ty6Var, rect3, rect4);
        ro0 ro0Var = new ro0(view, rect, rect2);
        objectAnimatorOfObject.addListener(ro0Var);
        a(ro0Var);
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
