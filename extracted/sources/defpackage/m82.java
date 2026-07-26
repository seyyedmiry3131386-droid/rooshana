package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class m82 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final Object d;

    public m82(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.a = 0;
        this.b = actionMenuView;
        this.c = actionMenuView2;
        this.d = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr = (float[]) this.d;
                y40.n(fFloatValue, fArr);
                View view = this.b;
                if (view != null) {
                    view.setAlpha(fArr[0]);
                }
                View view2 = this.c;
                if (view2 != null) {
                    view2.setAlpha(fArr[1]);
                }
                break;
            default:
                ((de8) this.d).c(this.b, this.c, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public m82(de8 de8Var, View view, View view2) {
        this.a = 1;
        this.d = de8Var;
        this.b = view;
        this.c = view2;
    }
}
