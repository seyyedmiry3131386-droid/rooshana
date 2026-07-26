package me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.c11;
import defpackage.cu6;
import defpackage.e60;
import defpackage.kp6;
import defpackage.sq6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class BaseCircleIndicator extends LinearLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Animator f;
    public Animator g;
    public Animator h;
    public Animator i;
    public int j;

    public BaseCircleIndicator(Context context) {
        super(context);
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.j = -1;
        d(context, null);
    }

    public void a(int i) {
        View childAt;
        if (this.j == i) {
            return;
        }
        if (this.g.isRunning()) {
            this.g.end();
            this.g.cancel();
        }
        if (this.f.isRunning()) {
            this.f.end();
            this.f.cancel();
        }
        int i2 = this.j;
        if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
            childAt.setBackgroundResource(this.e);
            this.g.setTarget(childAt);
            this.g.start();
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            childAt2.setBackgroundResource(this.d);
            this.f.setTarget(childAt2);
            this.f.start();
        }
        this.j = i;
    }

    public final Animator b(c11 c11Var) {
        if (c11Var.e != 0) {
            return AnimatorInflater.loadAnimator(getContext(), c11Var.e);
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), c11Var.d);
        animatorLoadAnimator.setInterpolator(new e60(0));
        return animatorLoadAnimator;
    }

    public void c(int i, int i2) {
        if (this.h.isRunning()) {
            this.h.end();
            this.h.cancel();
        }
        if (this.i.isRunning()) {
            this.i.end();
            this.i.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i3 = i - childCount;
            int orientation = getOrientation();
            for (int i4 = 0; i4 < i3; i4++) {
                View view = new View(getContext());
                LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
                layoutParamsGenerateDefaultLayoutParams.width = this.b;
                layoutParamsGenerateDefaultLayoutParams.height = this.c;
                if (orientation == 0) {
                    int i5 = this.a;
                    layoutParamsGenerateDefaultLayoutParams.leftMargin = i5;
                    layoutParamsGenerateDefaultLayoutParams.rightMargin = i5;
                } else {
                    int i6 = this.a;
                    layoutParamsGenerateDefaultLayoutParams.topMargin = i6;
                    layoutParamsGenerateDefaultLayoutParams.bottomMargin = i6;
                }
                addView(view, layoutParamsGenerateDefaultLayoutParams);
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            View childAt = getChildAt(i7);
            if (i2 == i7) {
                childAt.setBackgroundResource(this.d);
                this.h.setTarget(childAt);
                this.h.start();
                this.h.end();
            } else {
                childAt.setBackgroundResource(this.e);
                this.i.setTarget(childAt);
                this.i.start();
                this.i.end();
            }
        }
        this.j = i2;
    }

    public final void d(Context context, AttributeSet attributeSet) {
        c11 c11Var = new c11();
        c11Var.a = -1;
        c11Var.b = -1;
        c11Var.c = -1;
        c11Var.d = kp6.scale_with_alpha;
        c11Var.e = 0;
        c11Var.f = sq6.white_radius;
        c11Var.h = 0;
        c11Var.i = 17;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cu6.BaseCircleIndicator);
            c11Var.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(cu6.BaseCircleIndicator_ci_width, -1);
            c11Var.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(cu6.BaseCircleIndicator_ci_height, -1);
            c11Var.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(cu6.BaseCircleIndicator_ci_margin, -1);
            c11Var.d = typedArrayObtainStyledAttributes.getResourceId(cu6.BaseCircleIndicator_ci_animator, kp6.scale_with_alpha);
            c11Var.e = typedArrayObtainStyledAttributes.getResourceId(cu6.BaseCircleIndicator_ci_animator_reverse, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(cu6.BaseCircleIndicator_ci_drawable, sq6.white_radius);
            c11Var.f = resourceId;
            c11Var.g = typedArrayObtainStyledAttributes.getResourceId(cu6.BaseCircleIndicator_ci_drawable_unselected, resourceId);
            c11Var.h = typedArrayObtainStyledAttributes.getInt(cu6.BaseCircleIndicator_ci_orientation, -1);
            c11Var.i = typedArrayObtainStyledAttributes.getInt(cu6.BaseCircleIndicator_ci_gravity, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        int iApplyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i = c11Var.a;
        if (i < 0) {
            i = iApplyDimension;
        }
        this.b = i;
        int i2 = c11Var.b;
        if (i2 < 0) {
            i2 = iApplyDimension;
        }
        this.c = i2;
        int i3 = c11Var.c;
        if (i3 >= 0) {
            iApplyDimension = i3;
        }
        this.a = iApplyDimension;
        this.f = AnimatorInflater.loadAnimator(getContext(), c11Var.d);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), c11Var.d);
        this.h = animatorLoadAnimator;
        animatorLoadAnimator.setDuration(0L);
        this.g = b(c11Var);
        Animator animatorB = b(c11Var);
        this.i = animatorB;
        animatorB.setDuration(0L);
        int i4 = c11Var.f;
        this.d = i4 == 0 ? sq6.white_radius : i4;
        int i5 = c11Var.g;
        if (i5 != 0) {
            i4 = i5;
        }
        this.e = i4;
        setOrientation(c11Var.h != 1 ? 0 : 1);
        int i6 = c11Var.i;
        if (i6 < 0) {
            i6 = 17;
        }
        setGravity(i6);
        if (isInEditMode()) {
            c(3, 1);
        }
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.j = -1;
        d(context, attributeSet);
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.j = -1;
        d(context, attributeSet);
    }
}
