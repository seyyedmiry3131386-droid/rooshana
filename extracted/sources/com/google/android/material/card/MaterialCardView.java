package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import defpackage.as7;
import defpackage.bt7;
import defpackage.fk4;
import defpackage.ja1;
import defpackage.m91;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.rf0;
import defpackage.tj4;
import defpackage.ub1;
import defpackage.vj4;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.xp6;
import defpackage.yr7;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, bt7 {
    public static final int[] l = {R.attr.state_checkable};
    public static final int[] m = {R.attr.state_checked};
    public static final int[] n = {vp6.state_dragged};
    public static final int o = mt6.Widget_MaterialComponents_CardView;
    public final vj4 h;
    public final boolean i;
    public boolean j;
    public boolean k;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.h.c.getBounds());
        return rectF;
    }

    public final void d() {
        vj4 vj4Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (vj4Var = this.h).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        vj4Var.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        vj4Var.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    public final void g(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.h.c.b.d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.h.d.b.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.h.j;
    }

    public int getCheckedIconGravity() {
        return this.h.g;
    }

    public int getCheckedIconMargin() {
        return this.h.e;
    }

    public int getCheckedIconSize() {
        return this.h.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.h.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.h.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.h.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.h.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.h.b.top;
    }

    public float getProgress() {
        return this.h.c.b.j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.h.c.l();
    }

    public ColorStateList getRippleColor() {
        return this.h.k;
    }

    public as7 getShapeAppearanceModel() {
        return this.h.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.h.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.h.n;
    }

    public int getStrokeWidth() {
        return this.h.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vj4 vj4Var = this.h;
        vj4Var.k();
        ub1.K(this, vj4Var.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        vj4 vj4Var = this.h;
        if (vj4Var != null && vj4Var.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, l);
        }
        if (this.j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, m);
        }
        if (this.k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.j);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        vj4 vj4Var = this.h;
        accessibilityNodeInfo.setCheckable(vj4Var != null && vj4Var.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.j);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.h.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            vj4 vj4Var = this.h;
            if (!vj4Var.r) {
                vj4Var.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.h.c.s(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        vj4 vj4Var = this.h;
        vj4Var.c.r(vj4Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        fk4 fk4Var = this.h.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fk4Var.s(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.h.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.j != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.h.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        vj4 vj4Var = this.h;
        if (vj4Var.g != i) {
            vj4Var.g = i;
            MaterialCardView materialCardView = vj4Var.a;
            vj4Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.h.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.h.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.h.g(rf0.v(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.h.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.h.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        vj4 vj4Var = this.h;
        vj4Var.l = colorStateList;
        Drawable drawable = vj4Var.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        vj4 vj4Var = this.h;
        if (vj4Var != null) {
            vj4Var.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        vj4 vj4Var = this.h;
        vj4Var.b.set(i, i2, i3, i4);
        vj4Var.l();
    }

    public void setDragged(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.h.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        vj4 vj4Var = this.h;
        vj4Var.m();
        vj4Var.l();
    }

    public void setProgress(float f) {
        vj4 vj4Var = this.h;
        vj4Var.c.t(f);
        fk4 fk4Var = vj4Var.d;
        if (fk4Var != null) {
            fk4Var.t(f);
        }
        fk4 fk4Var2 = vj4Var.q;
        if (fk4Var2 != null) {
            fk4Var2.t(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        vj4 vj4Var = this.h;
        yr7 yr7VarH = vj4Var.m.h();
        yr7VarH.b(f);
        vj4Var.h(yr7VarH.a());
        vj4Var.i.invalidateSelf();
        if (vj4Var.i() || (vj4Var.a.getPreventCornerOverlap() && !vj4Var.c.p())) {
            vj4Var.l();
        }
        if (vj4Var.i()) {
            vj4Var.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        vj4 vj4Var = this.h;
        vj4Var.k = colorStateList;
        RippleDrawable rippleDrawable = vj4Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), i);
        vj4 vj4Var = this.h;
        vj4Var.k = colorStateList;
        RippleDrawable rippleDrawable = vj4Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // defpackage.bt7
    public void setShapeAppearanceModel(as7 as7Var) {
        setClipToOutline(as7Var.g(getBoundsAsRectF()));
        this.h.h(as7Var);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        vj4 vj4Var = this.h;
        if (i != vj4Var.h) {
            vj4Var.h = i;
            fk4 fk4Var = vj4Var.d;
            ColorStateList colorStateList = vj4Var.n;
            fk4Var.z(i);
            fk4Var.y(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        vj4 vj4Var = this.h;
        vj4Var.m();
        vj4Var.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        vj4 vj4Var = this.h;
        if (vj4Var != null && vj4Var.s && isEnabled()) {
            this.j = !this.j;
            refreshDrawableState();
            d();
            vj4Var.f(this.j, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        vj4 vj4Var = this.h;
        if (vj4Var.n != colorStateList) {
            vj4Var.n = colorStateList;
            fk4 fk4Var = vj4Var.d;
            fk4Var.z(vj4Var.h);
            fk4Var.y(colorStateList);
        }
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int i2 = o;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.j = false;
        this.k = false;
        this.i = true;
        TypedArray typedArrayD = vj8.d(getContext(), attributeSet, yt6.MaterialCardView, i, i2, new int[0]);
        vj4 vj4Var = new vj4(this, attributeSet, i);
        this.h = vj4Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        fk4 fk4Var = vj4Var.c;
        fk4Var.s(cardBackgroundColor);
        vj4Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        vj4Var.l();
        MaterialCardView materialCardView = vj4Var.a;
        ColorStateList colorStateListR = ja1.r(materialCardView.getContext(), typedArrayD, yt6.MaterialCardView_strokeColor);
        vj4Var.n = colorStateListR;
        if (colorStateListR == null) {
            vj4Var.n = ColorStateList.valueOf(-1);
        }
        vj4Var.h = typedArrayD.getDimensionPixelSize(yt6.MaterialCardView_strokeWidth, 0);
        boolean z = typedArrayD.getBoolean(yt6.MaterialCardView_android_checkable, false);
        vj4Var.s = z;
        materialCardView.setLongClickable(z);
        vj4Var.l = ja1.r(materialCardView.getContext(), typedArrayD, yt6.MaterialCardView_checkedIconTint);
        vj4Var.g(ja1.v(materialCardView.getContext(), typedArrayD, yt6.MaterialCardView_checkedIcon));
        vj4Var.f = typedArrayD.getDimensionPixelSize(yt6.MaterialCardView_checkedIconSize, 0);
        vj4Var.e = typedArrayD.getDimensionPixelSize(yt6.MaterialCardView_checkedIconMargin, 0);
        vj4Var.g = typedArrayD.getInteger(yt6.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListR2 = ja1.r(materialCardView.getContext(), typedArrayD, yt6.MaterialCardView_rippleColor);
        vj4Var.k = colorStateListR2;
        if (colorStateListR2 == null) {
            vj4Var.k = ColorStateList.valueOf(m91.p(xp6.colorControlHighlight, materialCardView));
        }
        ColorStateList colorStateListR3 = ja1.r(materialCardView.getContext(), typedArrayD, yt6.MaterialCardView_cardForegroundColor);
        colorStateListR3 = colorStateListR3 == null ? ColorStateList.valueOf(0) : colorStateListR3;
        fk4 fk4Var2 = vj4Var.d;
        fk4Var2.s(colorStateListR3);
        RippleDrawable rippleDrawable = vj4Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(vj4Var.k);
        }
        fk4Var.r(materialCardView.getCardElevation());
        float f = vj4Var.h;
        ColorStateList colorStateList = vj4Var.n;
        fk4Var2.z(f);
        fk4Var2.y(colorStateList);
        materialCardView.setBackgroundInternal(vj4Var.d(fk4Var));
        Drawable drawableC = vj4Var.j() ? vj4Var.c() : fk4Var2;
        vj4Var.i = drawableC;
        materialCardView.setForeground(vj4Var.d(drawableC));
        typedArrayD.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.h.c.s(colorStateList);
    }

    public void setOnCheckedChangeListener(tj4 tj4Var) {
    }
}
