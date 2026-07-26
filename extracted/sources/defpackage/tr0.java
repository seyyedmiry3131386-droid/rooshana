package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class tr0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public tr0(y45 y45Var, View[] viewArr) {
        this.b = y45Var;
        this.c = viewArr;
    }

    public static tr0 a(View... viewArr) {
        return new tr0(new y45(5), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wr0 wr0Var = (wr0) this.c;
                vr0 vr0Var = (vr0) this.b;
                wr0.d(fFloatValue, vr0Var);
                wr0Var.a(fFloatValue, vr0Var, false);
                wr0Var.invalidateSelf();
                break;
            default:
                for (View view : (View[]) this.c) {
                    switch (((y45) this.b).a) {
                        case 4:
                            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 5:
                            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 6:
                            Float f = (Float) valueAnimator.getAnimatedValue();
                            view.setScaleX(f.floatValue());
                            view.setScaleY(f.floatValue());
                            break;
                        default:
                            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                    }
                }
                break;
        }
    }

    public tr0(wr0 wr0Var, vr0 vr0Var) {
        this.c = wr0Var;
        this.b = vr0Var;
    }
}
