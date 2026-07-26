package ir.mservices.market.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import defpackage.js3;
import defpackage.p97;
import defpackage.pq6;
import defpackage.sj8;
import ir.mservices.market.views.RippleBackground;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class RippleBackground extends RelativeLayout {
    public static final /* synthetic */ int g = 0;
    public final long a;
    public boolean b;
    public final Paint c;
    public final AnimatorSet d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleBackground(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RippleBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        this.e = new ArrayList();
        this.f = new ArrayList();
        float dimension = getResources().getDimension(pq6.dialog_header_circle_margin);
        this.a = 833L;
        Paint paint = new Paint();
        final int i2 = 1;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(sj8.b().c);
        this.c = paint;
        final int i3 = 2;
        int i4 = (int) (2 * dimension);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i4);
        layoutParams.addRule(13, -1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.d = animatorSet;
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        final int i5 = 0;
        for (int i6 = 0; i6 < 6; i6++) {
            final p97 p97Var = new p97(this, getContext());
            p97Var.setScaleX(0.0f);
            p97Var.setScaleY(0.0f);
            addView(p97Var, layoutParams);
            this.e.add(p97Var);
            ArrayList arrayList = this.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 3.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o97
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i7 = i5;
                    p97 p97Var2 = p97Var;
                    switch (i7) {
                        case 0:
                            int i8 = RippleBackground.g;
                            p97Var2.setScaleX(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                        case 1:
                            int i9 = RippleBackground.g;
                            p97Var2.setScaleY(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                        default:
                            int i10 = RippleBackground.g;
                            p97Var2.setAlpha(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            long j = i6;
            valueAnimatorOfFloat.setStartDelay(this.a * j);
            valueAnimatorOfFloat.setDuration(5000L);
            arrayList.add(valueAnimatorOfFloat);
            ArrayList arrayList2 = this.f;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 3.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o97
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i7 = i2;
                    p97 p97Var2 = p97Var;
                    switch (i7) {
                        case 0:
                            int i8 = RippleBackground.g;
                            p97Var2.setScaleX(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                        case 1:
                            int i9 = RippleBackground.g;
                            p97Var2.setScaleY(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                        default:
                            int i10 = RippleBackground.g;
                            p97Var2.setAlpha(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                    }
                }
            });
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.setRepeatMode(1);
            valueAnimatorOfFloat2.setStartDelay(this.a * j);
            valueAnimatorOfFloat2.setDuration(5000L);
            arrayList2.add(valueAnimatorOfFloat2);
            ArrayList arrayList3 = this.f;
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o97
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i7 = i3;
                    p97 p97Var2 = p97Var;
                    switch (i7) {
                        case 0:
                            int i8 = RippleBackground.g;
                            p97Var2.setScaleX(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                        case 1:
                            int i9 = RippleBackground.g;
                            p97Var2.setScaleY(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                        default:
                            int i10 = RippleBackground.g;
                            p97Var2.setAlpha(((Float) o40.v(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue());
                            break;
                    }
                }
            });
            valueAnimatorOfFloat3.setRepeatCount(-1);
            valueAnimatorOfFloat3.setRepeatMode(1);
            valueAnimatorOfFloat3.setStartDelay(j * this.a);
            valueAnimatorOfFloat3.setDuration(5000L);
            arrayList3.add(valueAnimatorOfFloat3);
        }
        this.d.playTogether(this.f);
    }

    public /* synthetic */ RippleBackground(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
