package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.SecondsView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yz3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ yz3(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
                break;
            case 1:
                int i2 = SecondsView.I;
                view.setScaleX(((Float) o40.v(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                Object animatedValue = valueAnimator.getAnimatedValue();
                js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setScaleY(((Float) animatedValue).floatValue());
                break;
            case 2:
                js3.p(valueAnimator, "it");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue2).intValue();
                view.requestLayout();
                break;
            default:
                js3.p(valueAnimator, "it");
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                js3.n(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.height = ((Integer) animatedValue3).intValue();
                view.requestLayout();
                break;
        }
    }
}
