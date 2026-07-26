package ir.mservices.market.views;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import defpackage.js3;
import defpackage.pq6;
import defpackage.t60;
import ir.mservices.market.views.ElasticFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ElasticFrameLayout extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public int a;
    public float b;
    public final float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public final ArrayList h;
    public final RectF i;
    public final Interpolator j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ElasticFrameLayout(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        this.d += i;
        View childAt = getChildAt(0);
        if (i < 0 && !this.f && !this.e) {
            this.e = true;
            childAt.setPivotY(getHeight());
        } else if (i > 0 && !this.e && !this.f) {
            this.f = true;
            childAt.setPivotY(0.0f);
        }
        float f = 1;
        float fLog10 = (float) Math.log10((Math.abs(this.d) / this.a) + f);
        float f2 = this.a * fLog10 * this.c;
        if (this.f) {
            f2 *= -1.0f;
        }
        childAt.setTranslationY(f2);
        RectF rectF = this.i;
        rectF.left = 0.0f;
        rectF.right = getWidth();
        float f3 = f - ((f - this.b) * fLog10);
        childAt.setScaleX(f3);
        childAt.setScaleY(f3);
        if ((this.e && this.d >= 0.0f) || (this.f && this.d <= 0.0f)) {
            this.d = 0.0f;
            this.f = false;
            this.e = false;
            childAt.setTranslationY(0.0f);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            f2 = 0.0f;
        }
        if (this.f) {
            rectF.bottom = getHeight();
            rectF.top = getHeight() + f2;
            invalidate();
        } else if (this.e) {
            rectF.top = 0.0f;
            rectF.bottom = f2;
            invalidate();
        }
        float fAbs = Math.abs(this.d) / this.a;
        if (1.0f <= fAbs) {
            fAbs = 1.0f;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((t60) it.next()).a.M0(1.0f - fAbs);
        }
    }

    public final int getDragDismissDistance() {
        return this.a;
    }

    public final float getDragDismissScale() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        js3.p(motionEvent, "ev");
        this.g = motionEvent.getAction();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        js3.p(view, "target");
        js3.p(iArr, "consumed");
        if ((!this.e || i2 <= 0) && (!this.f || i2 >= 0)) {
            return;
        }
        a(i2);
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        js3.p(view, "target");
        a(i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        js3.p(view, "child");
        js3.p(view2, "target");
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        js3.p(view, "child");
        float fAbs = Math.abs(this.d);
        float f = this.a;
        ArrayList arrayList = this.h;
        final int i = 0;
        if (fAbs >= f) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((t60) it.next()).a.A0(false, false);
            }
            return;
        }
        int i2 = this.g;
        ValueAnimator valueAnimatorOfFloat = null;
        Interpolator interpolator = this.j;
        if (i2 == 0) {
            setTranslationY(0.0f);
            setScaleX(1.0f);
            setScaleY(1.0f);
        } else {
            getChildAt(0).animate().translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(interpolator).setListener(null).start();
        }
        boolean z = this.f;
        final int i3 = 1;
        RectF rectF = this.i;
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(rectF.top, rectF.bottom);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jz1
                public final /* synthetic */ ElasticFrameLayout b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i4 = i;
                    ElasticFrameLayout elasticFrameLayout = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = ElasticFrameLayout.k;
                            js3.p(valueAnimator, "valueAnimator");
                            RectF rectF2 = elasticFrameLayout.i;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            rectF2.top = ((Float) animatedValue).floatValue();
                            elasticFrameLayout.invalidate();
                            break;
                        default:
                            int i6 = ElasticFrameLayout.k;
                            js3.p(valueAnimator, "valueAnimator");
                            RectF rectF3 = elasticFrameLayout.i;
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            rectF3.bottom = ((Float) animatedValue2).floatValue();
                            elasticFrameLayout.invalidate();
                            break;
                    }
                }
            });
        } else if (this.e) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(rectF.bottom, rectF.top);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: jz1
                public final /* synthetic */ ElasticFrameLayout b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i4 = i3;
                    ElasticFrameLayout elasticFrameLayout = this.b;
                    switch (i4) {
                        case 0:
                            int i5 = ElasticFrameLayout.k;
                            js3.p(valueAnimator, "valueAnimator");
                            RectF rectF2 = elasticFrameLayout.i;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            js3.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            rectF2.top = ((Float) animatedValue).floatValue();
                            elasticFrameLayout.invalidate();
                            break;
                        default:
                            int i6 = ElasticFrameLayout.k;
                            js3.p(valueAnimator, "valueAnimator");
                            RectF rectF3 = elasticFrameLayout.i;
                            Object animatedValue2 = valueAnimator.getAnimatedValue();
                            js3.n(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                            rectF3.bottom = ((Float) animatedValue2).floatValue();
                            elasticFrameLayout.invalidate();
                            break;
                    }
                }
            });
        }
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setInterpolator(interpolator);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.start();
        }
        this.d = 0.0f;
        this.f = false;
        this.e = false;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((t60) it2.next()).a.M0(1.0f);
        }
    }

    public final void setDragDismissDistance(int i) {
        this.a = i;
    }

    public final void setDragDismissScale(float f) {
        this.b = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ElasticFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElasticFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        this.b = 0.85f;
        this.c = 1.0f;
        this.g = Integer.MIN_VALUE;
        this.h = new ArrayList();
        this.i = new RectF();
        this.j = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        this.a = getResources().getDimensionPixelSize(pq6.drag_dismiss_distance);
    }

    public /* synthetic */ ElasticFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
