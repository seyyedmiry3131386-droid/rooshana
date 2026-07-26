package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.transition.Transition;
import ir.mservices.market.reels.ui.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public final class m07 extends pr8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m07(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void d(Transition transition) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                js3.p(transition, "transition");
                final a aVar = (a) obj;
                final int i2 = sj8.b().N;
                final int i3 = sj8.b().I.a;
                final int i4 = sj8.c(sj8.f).I.a;
                final int i5 = sj8.c(sj8.f).J.a;
                final int i6 = sj8.d(sj8.f).v;
                final int i7 = sj8.c(sj8.f).I.a;
                View view = aVar.a;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_24);
                final int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
                final GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimensionPixelSize);
                g07 g07Var = aVar.G;
                if (g07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                g07Var.v.setBackground(gradientDrawable);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: j07
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        js3.p(valueAnimator, "animator");
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        Object objEvaluate = new ArgbEvaluator().evaluate(animatedFraction, Integer.valueOf(i2), Integer.valueOf(i3));
                        js3.n(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) objEvaluate).intValue();
                        Object objEvaluate2 = new ArgbEvaluator().evaluate(animatedFraction, Integer.valueOf(i4), Integer.valueOf(i5));
                        js3.n(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue2 = ((Integer) objEvaluate2).intValue();
                        Object objEvaluate3 = new ArgbEvaluator().evaluate(animatedFraction, Integer.valueOf(i6), Integer.valueOf(i7));
                        js3.n(objEvaluate3, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue3 = ((Integer) objEvaluate3).intValue();
                        GradientDrawable gradientDrawable2 = gradientDrawable;
                        gradientDrawable2.setColor(iIntValue);
                        gradientDrawable2.setStroke(dimensionPixelSize2, iIntValue3);
                        g07 g07Var2 = aVar.G;
                        if (g07Var2 != null) {
                            g07Var2.v.setTextColor(iIntValue2);
                        } else {
                            js3.V("binding");
                            throw null;
                        }
                    }
                });
                valueAnimatorOfFloat.start();
                aVar.F = valueAnimatorOfFloat;
                return;
            default:
                ((Transition) obj).F();
                transition.C(this);
                return;
        }
    }
}
