package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zz3 extends Transition {
    public final /* synthetic */ int H;

    public /* synthetic */ zz3(int i) {
        this.H = i;
    }

    @Override // androidx.transition.Transition
    public final void d(wr8 wr8Var) {
        switch (this.H) {
            case 0:
                wr8Var.a.put("NavigationRailLabelVisibility", Integer.valueOf(wr8Var.b.getVisibility()));
                break;
            default:
                View view = wr8Var.b;
                if (view instanceof TextView) {
                    wr8Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
                }
                break;
        }
    }

    @Override // androidx.transition.Transition
    public final void g(wr8 wr8Var) {
        switch (this.H) {
            case 0:
                wr8Var.a.put("NavigationRailLabelVisibility", Integer.valueOf(wr8Var.b.getVisibility()));
                break;
            default:
                View view = wr8Var.b;
                if (view instanceof TextView) {
                    wr8Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
                }
                break;
        }
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        switch (this.H) {
            case 0:
                if (wr8Var == null) {
                    return null;
                }
                HashMap map = wr8Var.a;
                if (wr8Var2 == null) {
                    return null;
                }
                HashMap map2 = wr8Var2.a;
                if (map.get("NavigationRailLabelVisibility") == null || map2.get("NavigationRailLabelVisibility") == null || ((Integer) map.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) map2.get("NavigationRailLabelVisibility")).intValue() != 0) {
                    return null;
                }
                View view = wr8Var2.b;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new yz3(0, view));
                return valueAnimatorOfFloat;
            default:
                if (wr8Var == null || wr8Var2 == null || !(wr8Var.b instanceof TextView)) {
                    return null;
                }
                View view2 = wr8Var2.b;
                if (!(view2 instanceof TextView)) {
                    return null;
                }
                TextView textView = (TextView) view2;
                HashMap map3 = wr8Var.a;
                HashMap map4 = wr8Var2.a;
                float fFloatValue = map3.get("android:textscale:scale") != null ? ((Float) map3.get("android:textscale:scale")).floatValue() : 1.0f;
                float fFloatValue2 = map4.get("android:textscale:scale") != null ? ((Float) map4.get("android:textscale:scale")).floatValue() : 1.0f;
                if (fFloatValue == fFloatValue2) {
                    return null;
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
                valueAnimatorOfFloat2.addUpdateListener(new ze0(7, textView));
                return valueAnimatorOfFloat2;
        }
    }
}
