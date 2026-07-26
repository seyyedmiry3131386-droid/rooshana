package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import defpackage.ft6;
import defpackage.gf0;
import defpackage.jf0;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.n90;
import defpackage.o3;
import defpackage.q69;
import defpackage.v4;
import defpackage.vp6;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final int m = mt6.Widget_Material3_BottomSheet_DragHandle;
    public final AccessibilityManager d;
    public BottomSheetBehavior e;
    public final GestureDetector f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final String j;
    public final String k;
    public final gf0 l;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.e;
        gf0 gf0Var = this.l;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.x0.remove(gf0Var);
            this.e.K(null);
            this.e.Y = null;
        }
        this.e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K(this);
            BottomSheetBehavior bottomSheetBehavior3 = this.e;
            bottomSheetBehavior3.getClass();
            bottomSheetBehavior3.Y = new WeakReference(this);
            d(this.e.N);
            this.e.y(gf0Var);
        }
        setClickable(this.e != null);
    }

    public final boolean c() {
        BottomSheetBehavior bottomSheetBehavior = this.e;
        if (bottomSheetBehavior == null) {
            return false;
        }
        boolean z = bottomSheetBehavior.b;
        int i = bottomSheetBehavior.N;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (z) {
                i2 = i3;
            }
        } else if (i != 3) {
            if (!this.g) {
                i3 = 4;
            }
            i2 = i3;
        } else if (z) {
            i2 = 4;
        }
        bottomSheetBehavior.O(i2);
        return true;
    }

    public final void d(int i) {
        if (i == 4) {
            this.g = true;
        } else if (i == 3) {
            this.g = false;
        }
        q69.o(this, o3.g, this.g ? this.j : this.k, new v4(10, this));
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof c) {
                CoordinatorLayout.Behavior behavior = ((c) layoutParams).a;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            accessibilityManager.isEnabled();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.d;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.i || this.h) ? super.onTouchEvent(motionEvent) : this.f.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.h = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.bottomSheetDragHandleStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(mk4.a(context, attributeSet, i, m), attributeSet, i);
        this.h = false;
        this.i = false;
        this.j = getResources().getString(ft6.bottomsheet_action_expand);
        this.k = getResources().getString(ft6.bottomsheet_action_collapse);
        this.l = new gf0(1, this);
        jf0 jf0Var = new jf0(this, 0);
        Context context2 = getContext();
        this.f = new GestureDetector(context2, jf0Var, new Handler(Looper.getMainLooper()));
        this.d = (AccessibilityManager) context2.getSystemService("accessibility");
        q69.q(this, new n90(2, this));
    }
}
