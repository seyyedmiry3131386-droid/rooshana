package com.google.android.material.sidesheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import defpackage.af0;
import defpackage.as7;
import defpackage.b79;
import defpackage.bl4;
import defpackage.cf0;
import defpackage.dw1;
import defpackage.f40;
import defpackage.fk4;
import defpackage.ft6;
import defpackage.h69;
import defpackage.i;
import defpackage.ja1;
import defpackage.jk4;
import defpackage.lj4;
import defpackage.mt6;
import defpackage.o3;
import defpackage.o44;
import defpackage.p52;
import defpackage.q69;
import defpackage.rm7;
import defpackage.s5;
import defpackage.yr7;
import defpackage.yt6;
import defpackage.za7;
import defpackage.zl;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements lj4 {
    public static final int x = ft6.side_sheet_accessibility_pane_title;
    public static final int y = mt6.Widget_Material3_SideSheet;
    public za7 a;
    public final fk4 b;
    public final ColorStateList c;
    public final as7 d;
    public final cf0 e;
    public final float f;
    public final boolean g;
    public int h;
    public b79 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public jk4 t;
    public int u;
    public final LinkedHashSet v;
    public final af0 w;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new cf0(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new af0(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.SideSheetBehavior_Layout_backgroundTint)) {
            this.c = ja1.r(context, typedArrayObtainStyledAttributes, yt6.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.SideSheetBehavior_Layout_shapeAppearance)) {
            this.d = as7.d(context, attributeSet, 0, y).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(yt6.SideSheetBehavior_Layout_coplanarSiblingViewId, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        as7 as7Var = this.d;
        if (as7Var != null) {
            fk4 fk4Var = new fk4(as7Var);
            this.b = fk4Var;
            fk4Var.o(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.s(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(yt6.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(yt6.SideSheetBehavior_Layout_behavior_draggable, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final boolean A() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public final void B(View view, int i, boolean z) {
        int iG;
        if (i == 3) {
            iG = this.a.g();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(rm7.n(i, "Invalid state to get outer edge offset: "));
            }
            iG = this.a.i();
        }
        b79 b79Var = this.i;
        if (b79Var == null || (!z ? b79Var.u(view, iG, view.getTop()) : b79Var.s(iG, view.getTop()))) {
            z(i);
        } else {
            z(2);
            this.e.c(i);
        }
    }

    public final void C() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        q69.n(262144, view);
        q69.j(0, view);
        q69.n(1048576, view);
        q69.j(0, view);
        int i = 5;
        if (this.h != 5) {
            q69.o(view, o3.n, null, new p52(i, 7, this));
        }
        int i2 = 3;
        if (this.h != 3) {
            q69.o(view, o3.l, null, new p52(i2, 7, this));
        }
    }

    @Override // defpackage.lj4
    public final void a() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        jk4 jk4Var = this.t;
        if (jk4Var == null) {
            return;
        }
        f40 f40Var = jk4Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        jk4Var.f = null;
        int i = 5;
        if (f40Var == null || Build.VERSION.SDK_INT < 34) {
            y(5);
            return;
        }
        za7 za7Var = this.a;
        if (za7Var != null && za7Var.o() != 0) {
            i = 3;
        }
        s5 s5Var = new s5(13, this);
        WeakReference weakReference = this.q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iF = this.a.f(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: pv7
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.a.y(marginLayoutParams, yk.c(valueAnimator.getAnimatedFraction(), iF, 0));
                    view.requestLayout();
                }
            };
        }
        jk4Var.c(f40Var, i, s5Var, animatorUpdateListener);
    }

    @Override // defpackage.lj4
    public final void b(f40 f40Var) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        jk4 jk4Var = this.t;
        if (jk4Var == null) {
            return;
        }
        za7 za7Var = this.a;
        int i = (za7Var == null || za7Var.o() == 0) ? 5 : 3;
        if (jk4Var.f == null) {
            t0.m("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f40 f40Var2 = jk4Var.f;
        jk4Var.f = f40Var;
        if (f40Var2 != null) {
            jk4Var.d(f40Var.c, i, f40Var.d == 0);
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.p.get();
        WeakReference weakReference2 = this.q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.a.y(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.o));
        view2.requestLayout();
    }

    @Override // defpackage.lj4
    public final void c(f40 f40Var) {
        jk4 jk4Var = this.t;
        if (jk4Var == null) {
            return;
        }
        jk4Var.f = f40Var;
    }

    @Override // defpackage.lj4
    public final void d() {
        jk4 jk4Var = this.t;
        if (jk4Var == null) {
            return;
        }
        jk4Var.b();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(c cVar) {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void j() {
        this.p = null;
        this.i = null;
        this.t = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b79 b79Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && q69.f(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (b79Var = this.i) == null || !b79Var.t(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        fk4 fk4Var = this.b;
        int iL = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            this.t = new jk4(view);
            if (fk4Var != null) {
                view.setBackground(fk4Var);
                float elevation = this.f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                fk4Var.r(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = q69.a;
                    h69.j(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            C();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (q69.f(view) == null) {
                q69.r(view, view.getResources().getString(x));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((c) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        za7 za7Var = this.a;
        if (za7Var == null || za7Var.o() != i5) {
            c cVar = null;
            as7 as7Var = this.d;
            if (i5 == 0) {
                this.a = new o44(this, i3);
                if (as7Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof c)) {
                        cVar = (c) view3.getLayoutParams();
                    }
                    if (cVar == null || ((ViewGroup.MarginLayoutParams) cVar).rightMargin <= 0) {
                        yr7 yr7VarH = as7Var.h();
                        yr7VarH.f = new i(0.0f);
                        yr7VarH.g = new i(0.0f);
                        as7 as7VarA = yr7VarH.a();
                        if (fk4Var != null) {
                            fk4Var.setShapeAppearanceModel(as7VarA);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(bl4.q(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.a = new o44(this, iL);
                if (as7Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof c)) {
                        cVar = (c) view2.getLayoutParams();
                    }
                    if (cVar == null || ((ViewGroup.MarginLayoutParams) cVar).leftMargin <= 0) {
                        yr7 yr7VarH2 = as7Var.h();
                        yr7VarH2.e = new i(0.0f);
                        yr7VarH2.h = new i(0.0f);
                        as7 as7VarA2 = yr7VarH2.a();
                        if (fk4Var != null) {
                            fk4Var.setShapeAppearanceModel(as7VarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new b79(coordinatorLayout.getContext(), coordinatorLayout, this.w);
        }
        int iL2 = this.a.l(view);
        coordinatorLayout.v(i, view);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.m(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.b(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iL = iL2 - this.a.l(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iL = this.a.i();
        }
        WeakHashMap weakHashMap2 = q69.a;
        view.offsetLeftAndRight(iL);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void s(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable t(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (A()) {
            this.i.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (A() && actionMasked == 2 && !this.j && A()) {
            float fAbs = Math.abs(this.u - motionEvent.getX());
            b79 b79Var = this.i;
            if (fAbs > b79Var.b) {
                b79Var.c(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.j;
    }

    public final void y(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(dw1.s(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.p;
        if (weakReference == null || weakReference.get() == null) {
            z(i);
            return;
        }
        View view = (View) this.p.get();
        zl zlVar = new zl(i, 10, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(zlVar);
        } else {
            zlVar.run();
        }
    }

    public final void z(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.v.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        C();
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior() {
        this.e = new cf0(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.v = new LinkedHashSet();
        this.w = new af0(this, 1);
    }
}
