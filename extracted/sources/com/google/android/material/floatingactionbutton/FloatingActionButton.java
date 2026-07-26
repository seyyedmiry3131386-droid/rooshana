package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import androidx.coordinatorlayout.widget.c;
import androidx.core.content.ContextCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import defpackage.as7;
import defpackage.b82;
import defpackage.bt7;
import defpackage.dk1;
import defpackage.dq6;
import defpackage.ez4;
import defpackage.h;
import defpackage.he0;
import defpackage.ja1;
import defpackage.js3;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.nc2;
import defpackage.o37;
import defpackage.oe2;
import defpackage.oq6;
import defpackage.pg;
import defpackage.pj9;
import defpackage.pn;
import defpackage.pt2;
import defpackage.q69;
import defpackage.qe0;
import defpackage.qe2;
import defpackage.r62;
import defpackage.re0;
import defpackage.se2;
import defpackage.te2;
import defpackage.u97;
import defpackage.ub1;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements r62, bt7, a {
    public static final int q = mt6.Widget_Design_FloatingActionButton;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final Rect l;
    public final Rect m;
    public final pg n;
    public final h o;
    public te2 p;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private te2 getImpl() {
        if (this.p == null) {
            this.p = new te2(this, new pj9(this));
        }
        return this.p;
    }

    public final void c(qe0 qe0Var) {
        te2 impl = getImpl();
        if (impl.t == null) {
            impl.t = new ArrayList();
        }
        impl.t.add(qe0Var);
    }

    public final void d(qe0 qe0Var) {
        te2 impl = getImpl();
        if (impl.s == null) {
            impl.s = new ArrayList();
        }
        impl.s.add(qe0Var);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e(pt2 pt2Var) {
        te2 impl = getImpl();
        oe2 oe2Var = new oe2(this, pt2Var);
        if (impl.u == null) {
            impl.u = new ArrayList();
        }
        impl.u.add(oe2Var);
    }

    public final void f(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int i = rect.left;
        Rect rect2 = this.l;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final int g(int i) {
        int i2 = this.h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(oq6.design_fab_size_normal) : resources.getDimensionPixelSize(oq6.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.h;
    }

    public int getExpandedComponentIdHint() {
        return this.o.a;
    }

    public ez4 getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public as7 getShapeAppearanceModel() {
        as7 as7Var = getImpl().a;
        as7Var.getClass();
        return as7Var;
    }

    public ez4 getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return g(this.g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    public final void h(js3 js3Var, boolean z) {
        te2 impl = getImpl();
        nc2 nc2Var = js3Var == null ? null : new nc2(1, this, js3Var, false);
        FloatingActionButton floatingActionButton = impl.v;
        FloatingActionButton floatingActionButton2 = impl.v;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.r == 1) {
                return;
            }
        } else if (impl.r != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.a(z ? 8 : 4, z);
            if (nc2Var != null) {
                ((js3) nc2Var.b).I((FloatingActionButton) nc2Var.c);
                return;
            }
            return;
        }
        ez4 ez4Var = impl.o;
        AnimatorSet animatorSetB = ez4Var != null ? impl.b(ez4Var, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, te2.E, te2.F);
        animatorSetB.addListener(new qe2(impl, z, nc2Var));
        ArrayList arrayList = impl.t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    public final boolean i() {
        te2 impl = getImpl();
        if (impl.v.getVisibility() == 0) {
            if (impl.r != 1) {
                return false;
            }
        } else if (impl.r == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        te2 impl = getImpl();
        if (impl.v.getVisibility() != 0) {
            if (impl.r != 2) {
                return false;
            }
        } else if (impl.r == 1) {
            return false;
        }
        return true;
    }

    public final void k() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(pn.c(colorForState, mode));
    }

    public final void l(re0 re0Var, boolean z) {
        te2 impl = getImpl();
        nc2 nc2Var = re0Var == null ? null : new nc2(1, this, re0Var, false);
        FloatingActionButton floatingActionButton = impl.v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.v;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.r == 2) {
                return;
            }
        } else if (impl.r != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (nc2Var != null) {
                ((js3) nc2Var.b).J();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z2 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z2 ? 0.4f : 0.0f);
            float f = z2 ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        ez4 ez4Var = impl.n;
        AnimatorSet animatorSetB = ez4Var != null ? impl.b(ez4Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, te2.C, te2.D);
        animatorSetB.addListener(new b82(impl, z, nc2Var));
        ArrayList arrayList = impl.s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        te2 impl = getImpl();
        se2 se2Var = impl.b;
        if (se2Var != null) {
            ub1.K(impl.v, se2Var);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.i = (sizeDimension - this.j) / 2;
        getImpl().i();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.l;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a);
        Bundle bundle = (Bundle) extendableSavedState.c.get("expandableWidgetHelper");
        bundle.getClass();
        h hVar = this.o;
        hVar.getClass();
        hVar.b = bundle.getBoolean("expanded", false);
        hVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (hVar.b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) hVar.c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).m(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        h hVar = this.o;
        hVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", hVar.b);
        bundle.putInt("expandedComponentIdHint", hVar.a);
        extendableSavedState.c.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.m;
            f(rect);
            te2 te2Var = this.p;
            int i = -(te2Var.f ? Math.max((te2Var.k - te2Var.v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            te2 impl = getImpl();
            se2 se2Var = impl.b;
            if (se2Var != null) {
                se2Var.setTintList(colorStateList);
            }
            he0 he0Var = impl.d;
            if (he0Var != null) {
                if (colorStateList != null) {
                    he0Var.m = colorStateList.getColorForState(he0Var.getState(), he0Var.m);
                }
                he0Var.p = colorStateList;
                he0Var.n = true;
                he0Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            se2 se2Var = getImpl().b;
            if (se2Var != null) {
                se2Var.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        te2 impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        te2 impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        te2 impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.h) {
            this.h = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        se2 se2Var = getImpl().b;
        if (se2Var != null) {
            se2Var.r(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.o.a = i;
    }

    public void setHideMotionSpec(ez4 ez4Var) {
        getImpl().o = ez4Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(ez4.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            te2 impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
            if (this.d != null) {
                k();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.n.u(i);
        k();
    }

    public void setMaxImageSize(int i) {
        this.j = i;
        te2 impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().f();
    }

    public void setShadowPaddingEnabled(boolean z) {
        te2 impl = getImpl();
        impl.g = z;
        impl.i();
    }

    @Override // defpackage.bt7
    public void setShapeAppearanceModel(as7 as7Var) {
        getImpl().h(as7Var);
    }

    public void setShowMotionSpec(ez4 ez4Var) {
        getImpl().n = ez4Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(ez4.b(getContext(), i));
    }

    public void setSize(int i) {
        this.h = 0;
        if (i != this.g) {
            this.g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            k();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            k();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().g();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().g();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.k != z) {
            this.k = z;
            getImpl().i();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            te2 impl = getImpl();
            ColorStateList colorStateList2 = this.f;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(u97.c(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(u97.c(colorStateList2));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        int i2 = q;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.l = new Rect();
        this.m = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.FloatingActionButton, i, i2, new int[0]);
        this.b = ja1.r(context2, typedArrayD, yt6.FloatingActionButton_backgroundTint);
        this.c = o37.t(typedArrayD.getInt(yt6.FloatingActionButton_backgroundTintMode, -1), null);
        this.f = ja1.r(context2, typedArrayD, yt6.FloatingActionButton_rippleColor);
        this.g = typedArrayD.getInt(yt6.FloatingActionButton_fabSize, -1);
        this.h = typedArrayD.getDimensionPixelSize(yt6.FloatingActionButton_fabCustomSize, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(yt6.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayD.getDimension(yt6.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayD.getDimension(yt6.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayD.getDimension(yt6.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.k = typedArrayD.getBoolean(yt6.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(oq6.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(yt6.FloatingActionButton_maxImageSize, 0));
        ez4 ez4VarA = ez4.a(context2, typedArrayD, yt6.FloatingActionButton_showMotionSpec);
        ez4 ez4VarA2 = ez4.a(context2, typedArrayD, yt6.FloatingActionButton_hideMotionSpec);
        as7 as7VarA = as7.c(context2, attributeSet, i, i2, as7.m).a();
        boolean z = typedArrayD.getBoolean(yt6.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayD.getBoolean(yt6.FloatingActionButton_android_enabled, true));
        typedArrayD.recycle();
        pg pgVar = new pg(this);
        this.n = pgVar;
        pgVar.q(attributeSet, i);
        h hVar = new h();
        hVar.b = false;
        hVar.a = 0;
        hVar.c = this;
        this.o = hVar;
        getImpl().h(as7VarA);
        te2 impl = getImpl();
        ColorStateList colorStateList2 = this.b;
        PorterDuff.Mode mode = this.c;
        ColorStateList colorStateList3 = this.f;
        FloatingActionButton floatingActionButton = impl.v;
        as7 as7Var = impl.a;
        as7Var.getClass();
        se2 se2Var = new se2(as7Var);
        impl.b = se2Var;
        se2Var.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.o(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            as7 as7Var2 = impl.a;
            as7Var2.getClass();
            he0 he0Var = new he0(as7Var2);
            int color = ContextCompat.getColor(context3, dq6.design_fab_stroke_top_outer_color);
            int color2 = ContextCompat.getColor(context3, dq6.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = ContextCompat.getColor(context3, dq6.design_fab_stroke_end_inner_color);
            int color4 = ContextCompat.getColor(context3, dq6.design_fab_stroke_end_outer_color);
            he0Var.i = color;
            he0Var.j = color2;
            he0Var.k = color3;
            he0Var.l = color4;
            float f = dimensionPixelSize;
            if (he0Var.h != f) {
                he0Var.h = f;
                he0Var.b.setStrokeWidth(f * 1.3333f);
                he0Var.n = true;
                he0Var.invalidateSelf();
            }
            if (colorStateList2 != null) {
                he0Var.m = colorStateList2.getColorForState(he0Var.getState(), he0Var.m);
            }
            he0Var.p = colorStateList2;
            he0Var.n = true;
            he0Var.invalidateSelf();
            impl.d = he0Var;
            he0 he0Var2 = impl.d;
            he0Var2.getClass();
            se2 se2Var2 = impl.b;
            se2Var2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{he0Var2, se2Var2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.d = null;
            layerDrawable = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(u97.c(colorStateList), layerDrawable, drawable);
        impl.c = rippleDrawable;
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        te2 impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        te2 impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        te2 impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = ez4VarA;
        getImpl().o = ez4VarA2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        public Rect a;
        public final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.FloatingActionButton_Behavior_Layout);
            this.b = typedArrayObtainStyledAttributes.getBoolean(yt6.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void g(c cVar) {
            if (cVar.h == 0) {
                cVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof c ? ((c) layoutParams).a instanceof BottomSheetBehavior : false) {
                    z(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListO = coordinatorLayout.o(floatingActionButton);
            int size = arrayListO.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListO.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof c ? ((c) layoutParams).a instanceof BottomSheetBehavior : false) && z(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.v(i, floatingActionButton);
            Rect rect = floatingActionButton.l;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                c cVar = (c) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) cVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) cVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) cVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = q69.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = q69.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            c cVar = (c) floatingActionButton.getLayoutParams();
            if (!this.b || cVar.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            dk1.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean z(View view, FloatingActionButton floatingActionButton) {
            c cVar = (c) floatingActionButton.getLayoutParams();
            if (!this.b || cVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((c) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }
}
