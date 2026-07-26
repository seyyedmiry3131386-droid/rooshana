package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import defpackage.bl4;
import defpackage.mg;
import defpackage.s5;
import defpackage.ub1;
import defpackage.uy2;
import defpackage.vp6;
import defpackage.w82;
import defpackage.yk;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int m = vp6.motionDurationLong2;
    public static final int n = vp6.motionDurationMedium4;
    public static final int o = vp6.motionEasingEmphasizedInterpolator;
    public final LinkedHashSet a;
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public int f;
    public AccessibilityManager g;
    public uy2 h;
    public final boolean i;
    public int j;
    public int k;
    public ViewPropertyAnimator l;

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashSet();
        this.f = 0;
        this.i = true;
        this.j = 2;
        this.k = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = ub1.G(view.getContext(), m, 225);
        this.c = ub1.G(view.getContext(), n, 175);
        Context context = view.getContext();
        w82 w82Var = yk.d;
        int i2 = o;
        this.d = ub1.H(context, i2, w82Var);
        this.e = ub1.H(view.getContext(), i2, yk.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager == null || this.h != null) {
            return false;
        }
        uy2 uy2Var = new uy2(this, view, 0);
        this.h = uy2Var;
        accessibilityManager.addTouchExplorationStateChangeListener(uy2Var);
        view.addOnAttachStateChangeListener(new mg(4, this));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 <= 0) {
            if (i2 < 0) {
                y(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        this.l = view.animate().translationY(this.f + this.k).setInterpolator(this.e).setDuration(this.c).setListener(new s5(6, this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void y(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        this.l = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.b).setListener(new s5(6, this));
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f = 0;
        this.i = true;
        this.j = 2;
        this.k = 0;
    }
}
