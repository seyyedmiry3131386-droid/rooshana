package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import com.google.android.material.chip.Chip;
import defpackage.as7;
import defpackage.bt7;
import defpackage.eb0;
import defpackage.ez4;
import defpackage.ja1;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.q69;
import defpackage.qr6;
import defpackage.rf0;
import defpackage.s3;
import defpackage.tq0;
import defpackage.u97;
import defpackage.ub1;
import defpackage.uq0;
import defpackage.vf8;
import defpackage.vg8;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.vq0;
import defpackage.wj4;
import defpackage.wq0;
import defpackage.xe1;
import defpackage.xj4;
import defpackage.xq0;
import defpackage.yh0;
import defpackage.yt6;
import defpackage.zg8;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements wq0, bt7, xj4 {
    public xq0 e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public wj4 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public final vq0 s;
    public boolean t;
    public final Rect u;
    public final RectF v;
    public final tq0 w;
    public static final int x = mt6.Widget_MaterialComponents_Chip_Action;
    public static final Rect y = new Rect();
    public static final int[] z = {R.attr.state_selected};
    public static final int[] A = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.v;
        rectF.setEmpty();
        if (d() && this.h != null) {
            xq0 xq0Var = this.e;
            Rect bounds = xq0Var.getBounds();
            rectF.setEmpty();
            if (xq0Var.k0()) {
                float f = xq0Var.K0 + xq0Var.J0 + xq0Var.Y + xq0Var.I0 + xq0Var.H0;
                if (xq0Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.u;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private vf8 getTextAppearance() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.R0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.l != z2) {
            this.l = z2;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.q = i;
        if (!this.o) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.J));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        f();
    }

    public final boolean d() {
        xq0 xq0Var = this.e;
        if (xq0Var == null) {
            return false;
        }
        Drawable drawable = xq0Var.V;
        return (drawable != null ? yh0.P(drawable) : null) != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.t ? super.dispatchHoverEvent(motionEvent) : this.s.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.t
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            vq0 r0 = r9.s
            r0.getClass()
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L84
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6e
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L84
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L84
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r3
            goto L49
        L55:
            r4 = r7
            goto L84
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L84
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L84
            int r1 = r0.l
            if (r1 == r2) goto L6c
            r4 = 16
            r0.s(r1, r4, r6)
        L6c:
            r4 = r3
            goto L84
        L6e:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7a
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L84
        L7a:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L84
            boolean r4 = r0.q(r3, r6)
        L84:
            if (r4 == 0) goto L8b
            int r0 = r0.l
            if (r0 == r2) goto L8b
            return r3
        L8b:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        xq0 xq0Var = this.e;
        boolean zC0 = false;
        int i = 0;
        zC0 = false;
        if (xq0Var != null && xq0.K(xq0Var.V)) {
            xq0 xq0Var2 = this.e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.n) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.m) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.n) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.m) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.l) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zC0 = xq0Var2.c0(iArr);
        }
        if (zC0) {
            invalidate();
        }
    }

    public final void e() {
        xq0 xq0Var;
        if (!d() || (xq0Var = this.e) == null || !xq0Var.U || this.h == null) {
            q69.q(this, null);
            this.t = false;
        } else {
            q69.q(this, this.s);
            this.t = true;
        }
    }

    public final void f() {
        this.g = new RippleDrawable(u97.c(this.e.N), getBackgroundDrawable(), null);
        this.e.getClass();
        setBackground(this.g);
        g();
    }

    public final void g() {
        xq0 xq0Var;
        if (TextUtils.isEmpty(getText()) || (xq0Var = this.e) == null) {
            return;
        }
        int iH = (int) (xq0Var.H() + xq0Var.K0 + xq0Var.H0);
        xq0 xq0Var2 = this.e;
        int iG = (int) (xq0Var2.G() + xq0Var2.D0 + xq0Var2.G0);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iG += rect.left;
            iH += rect.right;
        }
        setPaddingRelative(iG, getPaddingTop(), iH, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.r)) {
            return this.r;
        }
        xq0 xq0Var = this.e;
        if (xq0Var == null || !xq0Var.x0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.z0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.A0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.I;
        }
        return null;
    }

    public float getChipCornerRadius() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return Math.max(0.0f, xq0Var.I());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.K0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        xq0 xq0Var = this.e;
        if (xq0Var == null || (drawable = xq0Var.Q) == null) {
            return null;
        }
        return yh0.P(drawable);
    }

    public float getChipIconSize() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.S;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.R;
        }
        return null;
    }

    public float getChipMinHeight() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.J;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.D0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.M;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        xq0 xq0Var = this.e;
        if (xq0Var == null || (drawable = xq0Var.V) == null) {
            return null;
        }
        return yh0.P(drawable);
    }

    public CharSequence getCloseIconContentDescription() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.Z;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.J0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.Y;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.I0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.X;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.i1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.t) {
            vq0 vq0Var = this.s;
            if (vq0Var.l == 1 || vq0Var.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public ez4 getHideMotionSpec() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.C0;
        }
        return null;
    }

    public float getIconEndPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.F0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.E0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.N;
        }
        return null;
    }

    public as7 getShapeAppearanceModel() {
        return this.e.b.a;
    }

    public ez4 getShowMotionSpec() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.B0;
        }
        return null;
    }

    public float getTextEndPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.H0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            return xq0Var.G0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            paint.drawableState = xq0Var.getState();
        }
        vf8 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ub1.K(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        xq0 xq0Var = this.e;
        if (xq0Var != null && xq0Var.x0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.t) {
            vq0 vq0Var = this.s;
            int i2 = vq0Var.l;
            if (i2 != Integer.MIN_VALUE) {
                vq0Var.j(i2);
            }
            if (z2) {
                vq0Var.q(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        xq0 xq0Var = this.e;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(xq0Var != null && xq0Var.x0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.c) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(qr6.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) s3.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.p != i) {
            this.p = i;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.l
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.t
            if (r0 == 0) goto L43
            vq0 r0 = r5.s
            r0.x(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            t0.m("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        t0.m("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            t0.m("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        t0.m("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        t0.m("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        t0.m("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.N(z2);
        }
    }

    public void setCheckableResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.N(xq0Var.L0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        xq0 xq0Var = this.e;
        if (xq0Var == null) {
            this.k = z2;
        } else if (xq0Var.x0) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.O(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.O(rf0.v(xq0Var.L0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.P(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.P(ContextCompat.getColorStateList(xq0Var.L0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.Q(xq0Var.L0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.I == colorStateList) {
            return;
        }
        xq0Var.I = colorStateList;
        xq0Var.onStateChange(xq0Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.I == (colorStateList = ContextCompat.getColorStateList(xq0Var.L0, i))) {
            return;
        }
        xq0Var.I = colorStateList;
        xq0Var.onStateChange(xq0Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.R(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.R(xq0Var.L0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(xq0 xq0Var) {
        xq0 xq0Var2 = this.e;
        if (xq0Var2 != xq0Var) {
            if (xq0Var2 != null) {
                xq0Var2.h1 = new WeakReference(null);
            }
            this.e = xq0Var;
            xq0Var.j1 = false;
            xq0Var.h1 = new WeakReference(this);
            c(this.q);
        }
    }

    public void setChipEndPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.K0 == f) {
            return;
        }
        xq0Var.K0 = f;
        xq0Var.invalidateSelf();
        xq0Var.L();
    }

    public void setChipEndPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            float dimension = xq0Var.L0.getResources().getDimension(i);
            if (xq0Var.K0 != dimension) {
                xq0Var.K0 = dimension;
                xq0Var.invalidateSelf();
                xq0Var.L();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.S(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.S(rf0.v(xq0Var.L0, i));
        }
    }

    public void setChipIconSize(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.T(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.T(xq0Var.L0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.U(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.U(ContextCompat.getColorStateList(xq0Var.L0, i));
        }
    }

    public void setChipIconVisible(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.V(xq0Var.L0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.J == f) {
            return;
        }
        xq0Var.J = f;
        xq0Var.invalidateSelf();
        xq0Var.L();
    }

    public void setChipMinHeightResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            float dimension = xq0Var.L0.getResources().getDimension(i);
            if (xq0Var.J != dimension) {
                xq0Var.J = dimension;
                xq0Var.invalidateSelf();
                xq0Var.L();
            }
        }
    }

    public void setChipStartPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.D0 == f) {
            return;
        }
        xq0Var.D0 = f;
        xq0Var.invalidateSelf();
        xq0Var.L();
    }

    public void setChipStartPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            float dimension = xq0Var.L0.getResources().getDimension(i);
            if (xq0Var.D0 != dimension) {
                xq0Var.D0 = dimension;
                xq0Var.invalidateSelf();
                xq0Var.L();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.W(ContextCompat.getColorStateList(xq0Var.L0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.X(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.X(xq0Var.L0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.Y(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.Z == charSequence) {
            return;
        }
        String str = eb0.b;
        eb0 eb0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? eb0.e : eb0.d;
        eb0Var.getClass();
        xe1 xe1Var = vg8.a;
        xq0Var.Z = eb0Var.c(charSequence);
        xq0Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.Z(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.Z(xq0Var.L0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.Y(rf0.v(xq0Var.L0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.a0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.a0(xq0Var.L0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.b0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.b0(xq0Var.L0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.d0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.d0(ContextCompat.getColorStateList(xq0Var.L0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.r(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.i1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.o = z2;
        c(this.q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            t0.m("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(ez4 ez4Var) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.C0 = ez4Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.C0 = ez4.b(xq0Var.L0, i);
        }
    }

    public void setIconEndPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.f0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.f0(xq0Var.L0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.g0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.g0(xq0Var.L0.getResources().getDimension(i));
        }
    }

    @Override // defpackage.xj4
    public void setInternalOnCheckedChangeListener(wj4 wj4Var) {
        this.j = wj4Var;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.k1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.h0(colorStateList);
        }
        this.e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.h0(ContextCompat.getColorStateList(xq0Var.L0, i));
            this.e.getClass();
            f();
        }
    }

    @Override // defpackage.bt7
    public void setShapeAppearanceModel(as7 as7Var) {
        this.e.setShapeAppearanceModel(as7Var);
    }

    public void setShowMotionSpec(ez4 ez4Var) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.B0 = ez4Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.B0 = ez4.b(xq0Var.L0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        xq0 xq0Var = this.e;
        if (xq0Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(xq0Var.j1 ? null : charSequence, bufferType);
        xq0 xq0Var2 = this.e;
        if (xq0Var2 == null || TextUtils.equals(xq0Var2.O, charSequence)) {
            return;
        }
        xq0Var2.O = charSequence;
        xq0Var2.R0.e = true;
        xq0Var2.invalidateSelf();
        xq0Var2.L();
    }

    public void setTextAppearance(vf8 vf8Var) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.R0.c(vf8Var, xq0Var.L0);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.H0 == f) {
            return;
        }
        xq0Var.H0 = f;
        xq0Var.invalidateSelf();
        xq0Var.L();
    }

    public void setTextEndPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            float dimension = xq0Var.L0.getResources().getDimension(i);
            if (xq0Var.H0 != dimension) {
                xq0Var.H0 = dimension;
                xq0Var.invalidateSelf();
                xq0Var.L();
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            zg8 zg8Var = xq0Var.R0;
            vf8 vf8Var = zg8Var.g;
            if (vf8Var != null) {
                vf8Var.l = fApplyDimension;
                zg8Var.a.setTextSize(fApplyDimension);
                xq0Var.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        xq0 xq0Var = this.e;
        if (xq0Var == null || xq0Var.G0 == f) {
            return;
        }
        xq0Var.G0 = f;
        xq0Var.invalidateSelf();
        xq0Var.L();
    }

    public void setTextStartPaddingResource(int i) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            float dimension = xq0Var.L0.getResources().getDimension(i);
            if (xq0Var.G0 != dimension) {
                xq0Var.G0 = dimension;
                xq0Var.invalidateSelf();
                xq0Var.L();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.chipStyle);
    }

    public void setCloseIconVisible(boolean z2) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.e0(z2);
        }
        e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int i2 = x;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.u = new Rect();
        this.v = new RectF();
        this.w = new tq0(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                t0.m("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    t0.m("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        xq0 xq0Var = new xq0(context2, attributeSet, i);
        TypedArray typedArrayD = vj8.d(xq0Var.L0, attributeSet, yt6.Chip, i, i2, new int[0]);
        xq0Var.l1 = typedArrayD.hasValue(yt6.Chip_shapeAppearance);
        int i3 = yt6.Chip_chipSurfaceColor;
        Context context3 = xq0Var.L0;
        ColorStateList colorStateListR = ja1.r(context3, typedArrayD, i3);
        if (xq0Var.H != colorStateListR) {
            xq0Var.H = colorStateListR;
            xq0Var.onStateChange(xq0Var.getState());
        }
        ColorStateList colorStateListR2 = ja1.r(context3, typedArrayD, yt6.Chip_chipBackgroundColor);
        if (xq0Var.I != colorStateListR2) {
            xq0Var.I = colorStateListR2;
            xq0Var.onStateChange(xq0Var.getState());
        }
        float dimension = typedArrayD.getDimension(yt6.Chip_chipMinHeight, 0.0f);
        if (xq0Var.J != dimension) {
            xq0Var.J = dimension;
            xq0Var.invalidateSelf();
            xq0Var.L();
        }
        if (typedArrayD.hasValue(yt6.Chip_chipCornerRadius)) {
            xq0Var.R(typedArrayD.getDimension(yt6.Chip_chipCornerRadius, 0.0f));
        }
        xq0Var.W(ja1.r(context3, typedArrayD, yt6.Chip_chipStrokeColor));
        xq0Var.X(typedArrayD.getDimension(yt6.Chip_chipStrokeWidth, 0.0f));
        xq0Var.h0(ja1.r(context3, typedArrayD, yt6.Chip_rippleColor));
        String text = typedArrayD.getText(yt6.Chip_android_text);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(xq0Var.O, text);
        zg8 zg8Var = xq0Var.R0;
        if (!zEquals) {
            xq0Var.O = text;
            zg8Var.e = true;
            xq0Var.invalidateSelf();
            xq0Var.L();
        }
        int i4 = yt6.Chip_android_textAppearance;
        vf8 vf8Var = (!typedArrayD.hasValue(i4) || (resourceId = typedArrayD.getResourceId(i4, 0)) == 0) ? null : new vf8(context3, resourceId);
        vf8Var.l = typedArrayD.getDimension(yt6.Chip_android_textSize, vf8Var.l);
        zg8Var.c(vf8Var, context3);
        int i5 = typedArrayD.getInt(yt6.Chip_android_ellipsize, 0);
        if (i5 == 1) {
            xq0Var.i1 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            xq0Var.i1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            xq0Var.i1 = TextUtils.TruncateAt.END;
        }
        xq0Var.V(typedArrayD.getBoolean(yt6.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            xq0Var.V(typedArrayD.getBoolean(yt6.Chip_chipIconEnabled, false));
        }
        xq0Var.S(ja1.v(context3, typedArrayD, yt6.Chip_chipIcon));
        if (typedArrayD.hasValue(yt6.Chip_chipIconTint)) {
            xq0Var.U(ja1.r(context3, typedArrayD, yt6.Chip_chipIconTint));
        }
        xq0Var.T(typedArrayD.getDimension(yt6.Chip_chipIconSize, -1.0f));
        xq0Var.e0(typedArrayD.getBoolean(yt6.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            xq0Var.e0(typedArrayD.getBoolean(yt6.Chip_closeIconEnabled, false));
        }
        xq0Var.Y(ja1.v(context3, typedArrayD, yt6.Chip_closeIcon));
        xq0Var.d0(ja1.r(context3, typedArrayD, yt6.Chip_closeIconTint));
        xq0Var.a0(typedArrayD.getDimension(yt6.Chip_closeIconSize, 0.0f));
        xq0Var.N(typedArrayD.getBoolean(yt6.Chip_android_checkable, false));
        xq0Var.Q(typedArrayD.getBoolean(yt6.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            xq0Var.Q(typedArrayD.getBoolean(yt6.Chip_checkedIconEnabled, false));
        }
        xq0Var.O(ja1.v(context3, typedArrayD, yt6.Chip_checkedIcon));
        if (typedArrayD.hasValue(yt6.Chip_checkedIconTint)) {
            xq0Var.P(ja1.r(context3, typedArrayD, yt6.Chip_checkedIconTint));
        }
        xq0Var.B0 = ez4.a(context3, typedArrayD, yt6.Chip_showMotionSpec);
        xq0Var.C0 = ez4.a(context3, typedArrayD, yt6.Chip_hideMotionSpec);
        float dimension2 = typedArrayD.getDimension(yt6.Chip_chipStartPadding, 0.0f);
        if (xq0Var.D0 != dimension2) {
            xq0Var.D0 = dimension2;
            xq0Var.invalidateSelf();
            xq0Var.L();
        }
        xq0Var.g0(typedArrayD.getDimension(yt6.Chip_iconStartPadding, 0.0f));
        xq0Var.f0(typedArrayD.getDimension(yt6.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayD.getDimension(yt6.Chip_textStartPadding, 0.0f);
        if (xq0Var.G0 != dimension3) {
            xq0Var.G0 = dimension3;
            xq0Var.invalidateSelf();
            xq0Var.L();
        }
        float dimension4 = typedArrayD.getDimension(yt6.Chip_textEndPadding, 0.0f);
        if (xq0Var.H0 != dimension4) {
            xq0Var.H0 = dimension4;
            xq0Var.invalidateSelf();
            xq0Var.L();
        }
        xq0Var.b0(typedArrayD.getDimension(yt6.Chip_closeIconStartPadding, 0.0f));
        xq0Var.Z(typedArrayD.getDimension(yt6.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayD.getDimension(yt6.Chip_chipEndPadding, 0.0f);
        if (xq0Var.K0 != dimension5) {
            xq0Var.K0 = dimension5;
            xq0Var.invalidateSelf();
            xq0Var.L();
        }
        xq0Var.k1 = typedArrayD.getDimensionPixelSize(yt6.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayD.recycle();
        int[] iArr = yt6.Chip;
        vj8.a(context2, attributeSet, i, i2);
        vj8.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.o = typedArrayObtainStyledAttributes.getBoolean(yt6.Chip_ensureMinTouchTargetSize, false);
        this.q = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(yt6.Chip_chipMinTouchTargetSize, yh0.I(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(xq0Var);
        xq0Var.r(getElevation());
        int[] iArr2 = yt6.Chip;
        vj8.a(context2, attributeSet, i, i2);
        vj8.b(context2, attributeSet, iArr2, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(yt6.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.s = new vq0(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new uq0(0, this));
        }
        setChecked(this.k);
        setText(xq0Var.O);
        setEllipsize(xq0Var.i1);
        h();
        if (!this.e.j1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.o) {
            setMinHeight(this.q);
        }
        this.p = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sq0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                Chip chip = this.a;
                wj4 wj4Var = chip.j;
                if (wj4Var != null) {
                    bq0 bq0Var = (bq0) ((pj9) wj4Var).a;
                    if (!z2 ? bq0Var.e(chip, bq0Var.e) : bq0Var.a(chip)) {
                        bq0Var.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    public void setCheckedIconVisible(boolean z2) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.Q(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            xq0Var.V(z2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            Context context2 = xq0Var.L0;
            xq0Var.R0.c(new vf8(context2, i), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        xq0 xq0Var = this.e;
        if (xq0Var != null) {
            Context context = xq0Var.L0;
            xq0Var.R0.c(new vf8(context, i), context);
        }
        h();
    }
}
