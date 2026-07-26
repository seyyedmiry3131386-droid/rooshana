package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.as7;
import defpackage.fk4;
import defpackage.fw7;
import defpackage.fz1;
import defpackage.i;
import defpackage.ja1;
import defpackage.jp6;
import defpackage.ma7;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.oq6;
import defpackage.pe0;
import defpackage.pp1;
import defpackage.pt2;
import defpackage.qe0;
import defpackage.ql4;
import defpackage.se0;
import defpackage.te0;
import defpackage.ub1;
import defpackage.ue0;
import defpackage.ve0;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yk;
import defpackage.yt6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements androidx.coordinatorlayout.widget.a {
    public Integer a;
    public final fk4 b;
    public AnimatorSet c;
    public AnimatorSet d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j;
    public final boolean k;
    public boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public Behavior s;
    public int t;
    public int u;
    public int v;
    public final qe0 w;
    public final pt2 x;
    public static final int y = mt6.Widget_MaterialComponents_BottomAppBar;
    public static final int z = vp6.motionDurationLong2;
    public static final int A = vp6.motionEasingEmphasizedInterpolator;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();
        public int c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public static void P(BottomAppBar bottomAppBar, View view) {
        c cVar = (c) view.getLayoutParams();
        cVar.d = 17;
        int i = bottomAppBar.g;
        if (i == 1) {
            cVar.d = 49;
        }
        if (i == 0) {
            cVar.d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.t;
    }

    private int getFabAlignmentAnimationDuration() {
        return ub1.G(getContext(), z, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return I(this.e);
    }

    private float getFabTranslationY() {
        if (this.g == 1) {
            return -getTopEdgeTreatment().A;
        }
        return G() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ve0 getTopEdgeTreatment() {
        return (ve0) this.b.b.a.i;
    }

    public final View G() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((fw7) coordinatorLayout.b.c).get(this);
        ArrayList<View> arrayList = coordinatorLayout.d;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        for (View view : arrayList) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int H(ActionMenuView actionMenuView, int i, boolean z2) {
        int i2 = 0;
        if (this.j != 1 && (i != 1 || !z2)) {
            return 0;
        }
        boolean z3 = getLayoutDirection() == 1;
        int measuredWidth = z3 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = z3 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = z3 ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i4 = z3 ? this.u : -this.v;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(oq6.m3_bottomappbar_horizontal_padding);
            if (!z3) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
            i2 = dimensionPixelOffset;
        }
        return measuredWidth - ((right + i4) + i2);
    }

    public final float I(int i) {
        boolean z2 = getLayoutDirection() == 1;
        if (i != 1) {
            return 0.0f;
        }
        View viewG = G();
        int i2 = z2 ? this.v : this.u;
        return ((getMeasuredWidth() / 2) - ((this.i == -1 || viewG == null) ? this.h + i2 : ((viewG.getMeasuredWidth() / 2) + this.i) + i2)) * (z2 ? -1 : 1);
    }

    public final boolean J() {
        View viewG = G();
        FloatingActionButton floatingActionButton = viewG instanceof FloatingActionButton ? (FloatingActionButton) viewG : null;
        return floatingActionButton != null && floatingActionButton.j();
    }

    public final void K(int i, boolean z2) {
        if (!isLaidOut()) {
            this.q = false;
            int i2 = this.p;
            if (i2 != 0) {
                this.p = 0;
                getMenu().clear();
                p(i2);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!J()) {
            i = 0;
            z2 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        int i3 = 2;
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - H(actionMenuView, i, z2)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new te0(this, actionMenuView, i, z2));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.d = animatorSet3;
        animatorSet3.addListener(new qe0(this, i3));
        this.d.start();
    }

    public final void L() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.d != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (J()) {
            O(actionMenuView, this.e, this.r, false);
        } else {
            O(actionMenuView, 0, false, false);
        }
    }

    public final void M() {
        getTopEdgeTreatment().B = getFabTranslationX();
        this.b.t((this.r && J() && this.g == 1) ? 1.0f : 0.0f);
        View viewG = G();
        if (viewG != null) {
            viewG.setTranslationY(getFabTranslationY());
            viewG.setTranslationX(getFabTranslationX());
        }
    }

    public final void N(int i) {
        float f = i;
        if (f != getTopEdgeTreatment().z) {
            getTopEdgeTreatment().z = f;
            this.b.invalidateSelf();
        }
    }

    public final void O(ActionMenuView actionMenuView, int i, boolean z2, boolean z3) {
        ue0 ue0Var = new ue0(this, actionMenuView, i, z2);
        if (z3) {
            actionMenuView.post(ue0Var);
        } else {
            ue0Var.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.b.b.f;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().A;
    }

    public int getFabAlignmentMode() {
        return this.e;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.i;
    }

    public int getFabAnchorMode() {
        return this.g;
    }

    public int getFabAnimationMode() {
        return this.f;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().y;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().x;
    }

    public boolean getHideOnScroll() {
        return this.l;
    }

    public int getMenuAlignmentMode() {
        return this.j;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ub1.K(this, this.b);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (z2) {
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.c;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            M();
            View viewG = G();
            if (viewG != null && viewG.isLaidOut()) {
                viewG.post(new pe0(0, viewG));
            }
        }
        L();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        this.e = savedState.c;
        this.r = savedState.d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.e;
        savedState.d = this.r;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.b.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().s(f);
            this.b.invalidateSelf();
            M();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        fk4 fk4Var = this.b;
        fk4Var.r(f);
        int iJ = fk4Var.b.p - fk4Var.j();
        Behavior behavior = getBehavior();
        behavior.k = iJ;
        if (behavior.j == 1) {
            setTranslationY(behavior.f + iJ);
        }
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.p = i2;
        int i3 = 1;
        this.q = true;
        K(i, this.r);
        if (this.e != i && isLaidOut()) {
            AnimatorSet animatorSet = this.c;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f == 1) {
                View viewG = G();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewG instanceof FloatingActionButton ? (FloatingActionButton) viewG : null, "translationX", I(i));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                View viewG2 = G();
                FloatingActionButton floatingActionButton = viewG2 instanceof FloatingActionButton ? (FloatingActionButton) viewG2 : null;
                if (floatingActionButton != null && !floatingActionButton.i()) {
                    floatingActionButton.h(new se0(this, i), true);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(ub1.H(getContext(), A, yk.a));
            this.c = animatorSet2;
            animatorSet2.addListener(new qe0(this, i3));
            this.c.start();
        }
        this.e = i;
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.i != i) {
            this.i = i;
            M();
        }
    }

    public void setFabAnchorMode(int i) {
        this.g = i;
        M();
        View viewG = G();
        if (viewG != null) {
            P(this, viewG);
            viewG.requestLayout();
            this.b.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.f = i;
    }

    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().C) {
            getTopEdgeTreatment().C = f;
            this.b.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().y = f;
            this.b.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().x = f;
            this.b.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z2) {
        this.l = z2;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.j != i) {
            this.j = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                O(actionMenuView, this.e, J(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.a != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.a.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public Behavior getBehavior() {
        if (this.s == null) {
            this.s = new Behavior();
        }
        return this.s;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect p;
        public WeakReference q;
        public int r;
        public final a s;

        public Behavior() {
            this.s = new a(this);
            this.p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.q = new WeakReference(bottomAppBar);
            int i2 = BottomAppBar.y;
            View viewG = bottomAppBar.G();
            if (viewG != null && !viewG.isLaidOut()) {
                BottomAppBar.P(bottomAppBar, viewG);
                this.r = ((ViewGroup.MarginLayoutParams) ((c) viewG.getLayoutParams())).bottomMargin;
                if (viewG instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewG;
                    if (bottomAppBar.g == 0 && bottomAppBar.k) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(jp6.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(jp6.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.c(bottomAppBar.w);
                    floatingActionButton.d(new qe0(bottomAppBar, 3));
                    floatingActionButton.e(bottomAppBar.x);
                }
                viewG.addOnLayoutChangeListener(this.s);
                bottomAppBar.M();
            }
            coordinatorLayout.v(i, bottomAppBar);
            super.l(coordinatorLayout, bottomAppBar, i);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.v(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.s = new a(this);
            this.p = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        int i2 = y;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        fk4 fk4Var = new fk4();
        this.b = fk4Var;
        this.p = 0;
        this.q = false;
        this.r = true;
        this.w = new qe0(this, 0);
        this.x = new pt2(12, this);
        Context context2 = getContext();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.BottomAppBar, i, i2, new int[0]);
        ColorStateList colorStateListR = ja1.r(context2, typedArrayD, yt6.BottomAppBar_backgroundTint);
        if (typedArrayD.hasValue(yt6.BottomAppBar_navigationIconTint)) {
            setNavigationIconTint(typedArrayD.getColor(yt6.BottomAppBar_navigationIconTint, -1));
        }
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(yt6.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(yt6.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayD.getDimensionPixelOffset(yt6.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayD.getDimensionPixelOffset(yt6.BottomAppBar_fabCradleVerticalOffset, 0);
        this.e = typedArrayD.getInt(yt6.BottomAppBar_fabAlignmentMode, 0);
        this.f = typedArrayD.getInt(yt6.BottomAppBar_fabAnimationMode, 0);
        this.g = typedArrayD.getInt(yt6.BottomAppBar_fabAnchorMode, 1);
        this.k = typedArrayD.getBoolean(yt6.BottomAppBar_removeEmbeddedFabElevation, true);
        this.j = typedArrayD.getInt(yt6.BottomAppBar_menuAlignmentMode, 0);
        this.l = typedArrayD.getBoolean(yt6.BottomAppBar_hideOnScroll, false);
        this.m = typedArrayD.getBoolean(yt6.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.n = typedArrayD.getBoolean(yt6.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.o = typedArrayD.getBoolean(yt6.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.i = typedArrayD.getDimensionPixelOffset(yt6.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z2 = typedArrayD.getBoolean(yt6.BottomAppBar_addElevationShadow, true);
        typedArrayD.recycle();
        this.h = getResources().getDimensionPixelOffset(oq6.mtrl_bottomappbar_fabOffsetEndMode);
        ve0 ve0Var = new ve0(0);
        ve0Var.C = -1.0f;
        ve0Var.y = dimensionPixelOffset;
        ve0Var.x = dimensionPixelOffset2;
        ve0Var.s(dimensionPixelOffset3);
        ve0Var.B = 0.0f;
        ma7 ma7Var = new ma7();
        ma7 ma7Var2 = new ma7();
        ma7 ma7Var3 = new ma7();
        ma7 ma7Var4 = new ma7();
        i iVar = new i(0.0f);
        i iVar2 = new i(0.0f);
        i iVar3 = new i(0.0f);
        i iVar4 = new i(0.0f);
        fz1 fz1Var = new fz1(0);
        fz1 fz1Var2 = new fz1(0);
        fz1 fz1Var3 = new fz1(0);
        as7 as7Var = new as7();
        as7Var.a = ma7Var;
        as7Var.b = ma7Var2;
        as7Var.c = ma7Var3;
        as7Var.d = ma7Var4;
        as7Var.e = iVar;
        as7Var.f = iVar2;
        as7Var.g = iVar3;
        as7Var.h = iVar4;
        as7Var.i = ve0Var;
        as7Var.j = fz1Var;
        as7Var.k = fz1Var2;
        as7Var.l = fz1Var3;
        fk4Var.setShapeAppearanceModel(as7Var);
        if (z2) {
            fk4Var.w(2);
        } else {
            fk4Var.w(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        Paint.Style style = Paint.Style.FILL;
        fk4Var.u();
        fk4Var.o(context2);
        fk4Var.setTintList(colorStateListR);
        setElevation(dimensionPixelSize);
        setBackground(fk4Var);
        ql4 ql4Var = new ql4(10, this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, yt6.Insets, i, i2);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(yt6.Insets_paddingBottomSystemWindowInsets, false);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(yt6.Insets_paddingLeftSystemWindowInsets, false);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(yt6.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        o37.h(this, new pp1(z3, z4, z5, ql4Var));
    }
}
