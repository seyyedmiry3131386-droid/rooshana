package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import androidx.coordinatorlayout.widget.c;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.a72;
import defpackage.as7;
import defpackage.b72;
import defpackage.dk1;
import defpackage.ez4;
import defpackage.mk4;
import defpackage.mo0;
import defpackage.mt6;
import defpackage.pj9;
import defpackage.pt2;
import defpackage.ql4;
import defpackage.qq4;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.wv8;
import defpackage.y62;
import defpackage.yt6;
import defpackage.z62;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements a {
    public static final int A0 = mt6.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    public static final mo0 B0;
    public static final mo0 C0;
    public static final mo0 D0;
    public static final mo0 E0;
    public int K;
    public boolean L;
    public final y62 M;
    public final y62 N;
    public final a72 O;
    public final z62 P;
    public final int Q;
    public int R;
    public int S;
    public final ExtendedFloatingActionButtonBehavior T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ColorStateList x0;
    public int y0;
    public int z0;

    static {
        Class<Float> cls = Float.class;
        B0 = new mo0(cls, "width", 13);
        C0 = new mo0(cls, "height", 14);
        D0 = new mo0(cls, "paddingStart", 15);
        E0 = new mo0(cls, "paddingEnd", 16);
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4, int r5) {
        /*
            r0 = 1
            r1 = 2
            if (r5 == 0) goto L20
            if (r5 == r0) goto L1d
            if (r5 == r1) goto L1a
            r2 = 3
            if (r5 != r2) goto Le
            y62 r2 = r4.N
            goto L22
        Le:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown strategy type: "
            java.lang.String r5 = defpackage.rm7.n(r5, r0)
            r4.<init>(r5)
            throw r4
        L1a:
            y62 r2 = r4.M
            goto L22
        L1d:
            z62 r2 = r4.P
            goto L22
        L20:
            a72 r2 = r4.O
        L22:
            boolean r3 = r2.h()
            if (r3 == 0) goto L29
            return
        L29:
            boolean r3 = r4.L
            if (r3 == 0) goto L95
            boolean r3 = r4.isLaidOut()
            if (r3 != 0) goto L47
            int r3 = r4.getVisibility()
            if (r3 == 0) goto L3e
            int r0 = r4.K
            if (r0 != r1) goto L43
            goto L95
        L3e:
            int r3 = r4.K
            if (r3 == r0) goto L43
            goto L95
        L43:
            boolean r0 = r4.W
            if (r0 == 0) goto L95
        L47:
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L95
            if (r5 != r1) goto L6a
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            if (r5 == 0) goto L5e
            int r0 = r5.width
            r4.y0 = r0
            int r5 = r5.height
            r4.z0 = r5
            goto L6a
        L5e:
            int r5 = r4.getWidth()
            r4.y0 = r5
            int r5 = r4.getHeight()
            r4.z0 = r5
        L6a:
            r5 = 0
            r4.measure(r5, r5)
            android.animation.AnimatorSet r4 = r2.a()
            s5 r5 = new s5
            r0 = 5
            r5.<init>(r0, r2)
            r4.addListener(r5)
            java.util.ArrayList r5 = r2.c
            java.util.Iterator r5 = r5.iterator()
        L81:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r5.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r4.addListener(r0)
            goto L81
        L91:
            r4.start()
            return
        L95:
            r2.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, int):void");
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.T;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.Q;
        if (i >= 0) {
            return i;
        }
        return getIconSize() + (Math.min(getPaddingStart(), getPaddingEnd()) * 2);
    }

    public ez4 getExtendMotionSpec() {
        return this.N.f;
    }

    public ez4 getHideMotionSpec() {
        return this.P.f;
    }

    public ez4 getShowMotionSpec() {
        return this.O.f;
    }

    public ez4 getShrinkMotionSpec() {
        return this.M.f;
    }

    public final void l(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.U && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.U = false;
            this.M.g();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.W = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.L = z;
    }

    public void setExtendMotionSpec(ez4 ez4Var) {
        this.N.f = ez4Var;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(ez4.b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.U == z) {
            return;
        }
        y62 y62Var = z ? this.N : this.M;
        if (y62Var.h()) {
            return;
        }
        y62Var.g();
    }

    public void setHideMotionSpec(ez4 ez4Var) {
        this.P.f = ez4Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(ez4.b(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.U || this.V) {
            return;
        }
        this.R = getPaddingStart();
        this.S = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.U || this.V) {
            return;
        }
        this.R = i;
        this.S = i3;
    }

    public void setShowMotionSpec(ez4 ez4Var) {
        this.O.f = ez4Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(ez4.b(getContext(), i));
    }

    public void setShrinkMotionSpec(ez4 ez4Var) {
        this.M.f = ez4Var;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(ez4.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.x0 = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = A0;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.K = 0;
        this.L = true;
        pj9 pj9Var = new pj9();
        a72 a72Var = new a72(this, pj9Var);
        this.O = a72Var;
        z62 z62Var = new z62(this, pj9Var);
        this.P = z62Var;
        this.U = true;
        this.V = false;
        this.W = false;
        Context context2 = getContext();
        this.T = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.ExtendedFloatingActionButton, i, i2, new int[0]);
        ez4 ez4VarA = ez4.a(context2, typedArrayD, yt6.ExtendedFloatingActionButton_showMotionSpec);
        ez4 ez4VarA2 = ez4.a(context2, typedArrayD, yt6.ExtendedFloatingActionButton_hideMotionSpec);
        ez4 ez4VarA3 = ez4.a(context2, typedArrayD, yt6.ExtendedFloatingActionButton_extendMotionSpec);
        ez4 ez4VarA4 = ez4.a(context2, typedArrayD, yt6.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.Q = typedArrayD.getDimensionPixelSize(yt6.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayD.getInt(yt6.ExtendedFloatingActionButton_extendStrategy, 1);
        this.R = getPaddingStart();
        this.S = getPaddingEnd();
        pj9 pj9Var2 = new pj9();
        b72 ql4Var = new ql4(19, this);
        qq4 qq4Var = new qq4((Object) this, (Object) ql4Var, false);
        y62 y62Var = new y62(this, pj9Var2, i3 != 1 ? i3 != 2 ? new wv8(this, qq4Var, ql4Var, false, 27) : qq4Var : ql4Var, true);
        this.N = y62Var;
        y62 y62Var2 = new y62(this, pj9Var2, new pt2(22, this), false);
        this.M = y62Var2;
        a72Var.f = ez4VarA;
        z62Var.f = ez4VarA2;
        y62Var.f = ez4VarA3;
        y62Var2.f = ez4VarA4;
        typedArrayD.recycle();
        setShapeAppearanceModel(as7.c(context2, attributeSet, i, i2, as7.m).a());
        this.x0 = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.x0 = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        public Rect a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.ExtendedFloatingActionButton_Behavior_Layout);
            this.b = typedArrayObtainStyledAttributes.getBoolean(yt6.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(yt6.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean e(Rect rect, View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void g(c cVar) {
            if (cVar.h == 0) {
                cVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof c ? ((c) layoutParams).a instanceof BottomSheetBehavior : false) {
                    z(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListO = coordinatorLayout.o(extendedFloatingActionButton);
            int size = arrayListO.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) arrayListO.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof c ? ((c) layoutParams).a instanceof BottomSheetBehavior : false) && z(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.v(i, extendedFloatingActionButton);
            return true;
        }

        public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            c cVar = (c) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || cVar.f != appBarLayout.getId()) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            dk1.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public final boolean z(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            c cVar = (c) extendedFloatingActionButton.getLayoutParams();
            boolean z = this.b;
            boolean z2 = this.c;
            if ((!z && !z2) || cVar.f != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((c) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z2 ? 2 : 1);
            } else {
                ExtendedFloatingActionButton.k(extendedFloatingActionButton, z2 ? 3 : 0);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }
}
