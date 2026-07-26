package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import defpackage.as7;
import defpackage.bt7;
import defpackage.ca7;
import defpackage.fk4;
import defpackage.ft6;
import defpackage.ja1;
import defpackage.kk4;
import defpackage.l38;
import defpackage.m38;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.pk1;
import defpackage.qj4;
import defpackage.qs3;
import defpackage.rf0;
import defpackage.rj4;
import defpackage.u03;
import defpackage.u97;
import defpackage.ub1;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.y48;
import defpackage.yh0;
import defpackage.yr7;
import defpackage.yt6;
import defpackage.z48;
import io.sentry.android.core.t0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, bt7 {
    public static final int[] F = {R.attr.state_checkable};
    public static final int[] G = {R.attr.state_checked};
    public static final int H = mt6.Widget_MaterialComponents_Button;
    public static final int I = vp6.materialSizeOverlay;
    public static final pk1 J = new pk1(2);
    public z48 A;
    public int B;
    public float C;
    public float D;
    public l38 E;
    public final rj4 d;
    public final LinkedHashSet e;
    public qj4 f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;
    public LinearLayout.LayoutParams v;
    public boolean w;
    public int x;
    public boolean y;
    public int z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.x = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        fk4 fk4VarA;
        if (this.w && this.y && (fk4VarA = this.d.a(false)) != null) {
            return (int) (fk4VarA.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        rj4 rj4Var = this.d;
        if (rj4Var == null || !rj4Var.t || this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.o;
            if (!materialButtonToggleGroup.m) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.p) {
            return;
        }
        this.p = true;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            setStateDescription(((kk4) it.next()).a.getResources().getString(this.o ? ft6.mtrl_button_expanded_content_description : ft6.mtrl_button_collapsed_content_description));
        }
        this.p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.C != f) {
            this.C = f;
            j();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) getParent();
                int i = (int) this.C;
                int iIndexOfChild = materialButtonGroup.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i2 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (materialButtonGroup.c(i2)) {
                            materialButton2 = (MaterialButton) materialButtonGroup.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = materialButtonGroup.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (materialButtonGroup.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) materialButtonGroup.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final m38 d() {
        Context context = getContext();
        int i = vp6.motionSpringFastSpatial;
        int i2 = mt6.Motion_Material3_Spring_Standard_Fast_Spatial;
        TypedValue typedValueG = yh0.G(context, i);
        TypedArray typedArrayObtainStyledAttributes = typedValueG == null ? context.obtainStyledAttributes(null, yt6.MaterialSpring, 0, i2) : context.obtainStyledAttributes(typedValueG.resourceId, yt6.MaterialSpring);
        m38 m38Var = new m38();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(yt6.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(yt6.MaterialSpring_damping, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            m38Var.b(f);
            m38Var.a(f2);
            return m38Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        rj4 rj4Var = this.d;
        return (rj4Var == null || rj4Var.r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            z48 r0 = r8.A
            if (r0 != 0) goto L6
            goto L89
        L6:
            l38 r0 = r8.E
            if (r0 != 0) goto L19
            l38 r0 = new l38
            pk1 r1 = com.google.android.material.button.MaterialButton.J
            r0.<init>(r8, r1)
            r8.E = r0
            m38 r1 = r8.d()
            r0.m = r1
        L19:
            boolean r0 = r8.y
            if (r0 == 0) goto L89
            int r0 = r8.B
            z48 r1 = r8.A
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L42:
            int r6 = r1.a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            hl5 r1 = r1.b
            goto L5d
        L59:
            hl5[] r1 = r1.d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.b
            r70 r1 = (defpackage.r70) r1
            int r2 = r8.getWidth()
            float r3 = r1.b
            java.lang.Object r1 = r1.c
            com.google.android.material.shape.StateListSizeChange$SizeChangeType r1 = (com.google.android.material.shape.StateListSizeChange$SizeChangeType) r1
            com.google.android.material.shape.StateListSizeChange$SizeChangeType r5 = com.google.android.material.shape.StateListSizeChange$SizeChangeType.a
            if (r1 != r5) goto L73
            float r1 = (float) r2
            float r3 = r3 * r1
        L71:
            int r4 = (int) r3
            goto L78
        L73:
            com.google.android.material.shape.StateListSizeChange$SizeChangeType r2 = com.google.android.material.shape.StateListSizeChange$SizeChangeType.b
            if (r1 != r2) goto L78
            goto L71
        L78:
            int r0 = java.lang.Math.min(r0, r4)
            l38 r1 = r8.E
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L89
            l38 r9 = r8.E
            r9.d()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i = this.q;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        rj4 rj4Var = this.d;
        return ((rj4Var == null || !rj4Var.t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.z;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.d.j;
        }
        return 0;
    }

    public m38 getCornerSpringForce() {
        return this.d.d;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.i;
    }

    public int getInsetTop() {
        return this.d.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.d.o;
        }
        return null;
    }

    public as7 getShapeAppearanceModel() {
        if (e()) {
            return this.d.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public y48 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.d.c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.d.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.d.k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.d.m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.d.l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            drawableMutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.l;
            int i2 = this.m;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.q;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.i) || (((i3 == 3 || i3 == 4) && drawable5 != this.i) || ((i3 == 16 || i3 == 32) && drawable4 != this.i))) {
            g();
        }
    }

    public final void i(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.l = 0;
                if (i3 == 16) {
                    this.m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.n) - getPaddingBottom()) / 2);
                if (this.m != iMax) {
                    this.m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.l != textLayoutWidth) {
            this.l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    public final void j() {
        int i = (int) (this.C - this.D);
        int i2 = (i / 2) + this.x;
        getLayoutParams().width = (int) (this.s + i);
        setPaddingRelative(this.t + i2, getPaddingTop(), (this.u + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            ub1.K(this, this.d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        rj4 rj4Var = this.d;
        if (rj4Var != null && rj4Var.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        if (this.o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        rj4 rj4Var = this.d;
        accessibilityNodeInfo.setCheckable(rj4Var != null && rj4Var.t);
        accessibilityNodeInfo.setChecked(this.o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.r != i6) {
            this.r = i6;
            this.s = -1.0f;
        }
        if (this.s == -1.0f) {
            this.s = getMeasuredWidth();
            if (this.v == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.v);
                layoutParams.width = (int) this.s;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.z == -1) {
            if (this.i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.i.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.z = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.t == -1) {
            this.t = getPaddingStart();
        }
        if (this.u == -1) {
            this.u = getPaddingEnd();
        }
        if ((getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.y = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setChecked(savedState.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.d.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!e()) {
            super.setBackgroundColor(i);
            return;
        }
        rj4 rj4Var = this.d;
        if (rj4Var.a(false) != null) {
            rj4Var.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        t0.m("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        rj4 rj4Var = this.d;
        rj4Var.r = true;
        MaterialButton materialButton = rj4Var.a;
        materialButton.setSupportBackgroundTintList(rj4Var.m);
        materialButton.setSupportBackgroundTintMode(rj4Var.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? rf0.v(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.d.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            rj4 rj4Var = this.d;
            if (rj4Var.s && rj4Var.j == i) {
                return;
            }
            rj4Var.j = i;
            rj4Var.s = true;
            yr7 yr7VarH = rj4Var.b.h();
            yr7VarH.b(i);
            rj4Var.b = yr7VarH.a();
            rj4Var.c = null;
            rj4Var.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(m38 m38Var) {
        rj4 rj4Var = this.d;
        rj4Var.d = m38Var;
        if (rj4Var.c != null) {
            rj4Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.D = Math.min(i, this.z);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.d.a(false).r(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? rf0.v(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i) {
            this.k = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        rj4 rj4Var = this.d;
        rj4Var.b(rj4Var.h, i);
    }

    public void setInsetTop(int i) {
        rj4 rj4Var = this.d;
        rj4Var.b(i, rj4Var.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(qj4 qj4Var) {
        this.f = qj4Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.w != z) {
            this.w = z;
            rj4 rj4Var = this.d;
            if (z) {
                qs3 qs3Var = new qs3(2, this);
                rj4Var.e = qs3Var;
                fk4 fk4VarA = rj4Var.a(false);
                if (fk4VarA != null) {
                    fk4VarA.E = qs3Var;
                }
            } else {
                rj4Var.e = null;
                fk4 fk4VarA2 = rj4Var.a(false);
                if (fk4VarA2 != null) {
                    fk4VarA2.E = null;
                }
            }
            post(new u03(5, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        qj4 qj4Var = this.f;
        if (qj4Var != null) {
            ((MaterialButtonGroup) ((ca7) qj4Var).b).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            rj4 rj4Var = this.d;
            MaterialButton materialButton = rj4Var.a;
            if (rj4Var.o != colorStateList) {
                rj4Var.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(u97.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(ContextCompat.getColorStateList(getContext(), i));
        }
    }

    @Override // defpackage.bt7
    public void setShapeAppearanceModel(as7 as7Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        rj4 rj4Var = this.d;
        rj4Var.b = as7Var;
        rj4Var.c = null;
        rj4Var.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            rj4 rj4Var = this.d;
            rj4Var.q = z;
            rj4Var.e();
        }
    }

    public void setSizeChange(z48 z48Var) {
        if (this.A != z48Var) {
            this.A = z48Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(y48 y48Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        rj4 rj4Var = this.d;
        if (rj4Var.d == null && y48Var.d()) {
            rj4Var.d = d();
            if (rj4Var.c != null) {
                rj4Var.d();
            }
        }
        rj4Var.c = y48Var;
        rj4Var.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            rj4 rj4Var = this.d;
            if (rj4Var.n != colorStateList) {
                rj4Var.n = colorStateList;
                rj4Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(ContextCompat.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            rj4 rj4Var = this.d;
            if (rj4Var.k != i) {
                rj4Var.k = i;
                rj4Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        rj4 rj4Var = this.d;
        if (rj4Var.m != colorStateList) {
            rj4Var.m = colorStateList;
            if (rj4Var.a(false) != null) {
                rj4Var.a(false).setTintList(rj4Var.m);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        rj4 rj4Var = this.d;
        if (rj4Var.l != mode) {
            rj4Var.l = mode;
            if (rj4Var.a(false) == null || rj4Var.l == null) {
                return;
            }
            rj4Var.a(false).setTintMode(rj4Var.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.s = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.B != i) {
            this.B = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        as7 as7VarA;
        int[] iArr = {I};
        int i2 = H;
        super(mk4.b(context, attributeSet, i, i2, iArr), attributeSet, i);
        this.e = new LinkedHashSet();
        this.o = false;
        this.p = false;
        this.r = -1;
        this.s = -1.0f;
        this.t = -1;
        this.u = -1;
        this.z = -1;
        Context context2 = getContext();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.MaterialButton, i, i2, new int[0]);
        this.n = typedArrayD.getDimensionPixelSize(yt6.MaterialButton_iconPadding, 0);
        int i3 = typedArrayD.getInt(yt6.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = o37.t(i3, mode);
        this.h = ja1.r(getContext(), typedArrayD, yt6.MaterialButton_iconTint);
        this.i = ja1.v(getContext(), typedArrayD, yt6.MaterialButton_icon);
        this.q = typedArrayD.getInteger(yt6.MaterialButton_iconGravity, 1);
        this.k = typedArrayD.getDimensionPixelSize(yt6.MaterialButton_iconSize, 0);
        y48 y48VarB = y48.b(context2, typedArrayD, yt6.MaterialButton_shapeAppearance);
        if (y48VarB != null) {
            as7VarA = y48VarB.c();
        } else {
            as7VarA = as7.d(context2, attributeSet, i, i2).a();
        }
        boolean z = typedArrayD.getBoolean(yt6.MaterialButton_opticalCenterEnabled, false);
        rj4 rj4Var = new rj4(this, as7VarA);
        this.d = rj4Var;
        rj4Var.f = typedArrayD.getDimensionPixelOffset(yt6.MaterialButton_android_insetLeft, 0);
        rj4Var.g = typedArrayD.getDimensionPixelOffset(yt6.MaterialButton_android_insetRight, 0);
        rj4Var.h = typedArrayD.getDimensionPixelOffset(yt6.MaterialButton_android_insetTop, 0);
        rj4Var.i = typedArrayD.getDimensionPixelOffset(yt6.MaterialButton_android_insetBottom, 0);
        if (typedArrayD.hasValue(yt6.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(yt6.MaterialButton_cornerRadius, -1);
            rj4Var.j = dimensionPixelSize;
            yr7 yr7VarH = rj4Var.b.h();
            yr7VarH.b(dimensionPixelSize);
            rj4Var.b = yr7VarH.a();
            rj4Var.c = null;
            rj4Var.d();
            rj4Var.s = true;
        }
        rj4Var.k = typedArrayD.getDimensionPixelSize(yt6.MaterialButton_strokeWidth, 0);
        rj4Var.l = o37.t(typedArrayD.getInt(yt6.MaterialButton_backgroundTintMode, -1), mode);
        rj4Var.m = ja1.r(getContext(), typedArrayD, yt6.MaterialButton_backgroundTint);
        rj4Var.n = ja1.r(getContext(), typedArrayD, yt6.MaterialButton_strokeColor);
        rj4Var.o = ja1.r(getContext(), typedArrayD, yt6.MaterialButton_rippleColor);
        rj4Var.t = typedArrayD.getBoolean(yt6.MaterialButton_android_checkable, false);
        rj4Var.w = typedArrayD.getDimensionPixelSize(yt6.MaterialButton_elevation, 0);
        rj4Var.u = typedArrayD.getBoolean(yt6.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(yt6.MaterialButton_android_background)) {
            rj4Var.r = true;
            setSupportBackgroundTintList(rj4Var.m);
            setSupportBackgroundTintMode(rj4Var.l);
        } else {
            rj4Var.c();
        }
        setPaddingRelative(paddingStart + rj4Var.f, paddingTop + rj4Var.h, paddingEnd + rj4Var.g, paddingBottom + rj4Var.i);
        setCheckedInternal(typedArrayD.getBoolean(yt6.MaterialButton_android_checked, false));
        if (y48VarB != null) {
            rj4Var.d = d();
            if (rj4Var.c != null) {
                rj4Var.d();
            }
            rj4Var.c = y48VarB;
            rj4Var.d();
        }
        setOpticalCenterEnabled(z);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.n);
        h(this.i != null);
    }
}
