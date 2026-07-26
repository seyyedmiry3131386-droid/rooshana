package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class j90 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;

    public /* synthetic */ j90(r90 r90Var, int i) {
        this.a = i;
        this.b = r90Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r90 r90Var = this.b;
                r90Var.i.setScaleX(fFloatValue);
                r90Var.i.setScaleY(fFloatValue);
                break;
            case 2:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
