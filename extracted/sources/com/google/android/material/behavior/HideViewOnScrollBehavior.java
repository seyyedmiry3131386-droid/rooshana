package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import androidx.core.content.ContextCompat;
import defpackage.bl4;
import defpackage.mg;
import defpackage.s5;
import defpackage.ub1;
import defpackage.uy2;
import defpackage.vp6;
import defpackage.vy2;
import defpackage.w82;
import defpackage.yk;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int m = vp6.motionDurationLong2;
    public static final int n = vp6.motionDurationMedium4;
    public static final int o = vp6.motionEasingEmphasizedInterpolator;
    public vy2 a;
    public AccessibilityManager b;
    public uy2 c;
    public final boolean d;
    public final LinkedHashSet e;
    public int f;
    public int g;
    public TimeInterpolator h;
    public TimeInterpolator i;
    public int j;
    public int k;
    public ViewPropertyAnimator l;

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        if (this.b == null) {
            this.b = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            uy2 uy2Var = new uy2(this, view, 1);
            this.c = uy2Var;
            accessibilityManager.addTouchExplorationStateChangeListener(uy2Var);
            view.addOnAttachStateChangeListener(new mg(5, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((c) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            y(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            y((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.a.a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.j = measuredHeight + i2;
        this.f = ub1.G(view.getContext(), m, 225);
        this.g = ub1.G(view.getContext(), n, 175);
        Context context = view.getContext();
        w82 w82Var = yk.d;
        int i4 = o;
        this.h = ub1.H(context, i4, w82Var);
        this.i = ub1.H(view.getContext(), i4, yk.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i2 <= 0) {
            if (i2 < 0) {
                z(view);
                return;
            }
            return;
        }
        if (this.k == 1) {
            return;
        }
        if (this.d && (accessibilityManager = this.b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = 1;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        this.l = this.a.H(this.j, view).setInterpolator(this.i).setDuration(this.g).setListener(new s5(7, this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public final void y(int i) {
        int i2;
        vy2 vy2Var = this.a;
        if (vy2Var != null) {
            switch (vy2Var.a) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i == 0) {
            this.a = new vy2(2);
        } else if (i == 1) {
            this.a = new vy2(0);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(bl4.q(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
            this.a = new vy2(1);
        }
    }

    public final void z(View view) {
        if (this.k == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = 2;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        this.a.getClass();
        this.l = this.a.H(0, view).setInterpolator(this.h).setDuration(this.f).setListener(new s5(7, this));
    }

    public HideViewOnScrollBehavior() {
        this.d = true;
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }
}
