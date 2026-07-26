package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import defpackage.as7;
import defpackage.at2;
import defpackage.aw1;
import defpackage.dk1;
import defpackage.dk4;
import defpackage.dq6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.eb0;
import defpackage.fi8;
import defpackage.fk4;
import defpackage.fp7;
import defpackage.ft6;
import defpackage.fz1;
import defpackage.gi8;
import defpackage.hi8;
import defpackage.hw1;
import defpackage.i;
import defpackage.i91;
import defpackage.j91;
import defpackage.ja1;
import defpackage.k91;
import defpackage.kb8;
import defpackage.m91;
import defpackage.ma7;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.mx1;
import defpackage.oq6;
import defpackage.ot6;
import defpackage.p48;
import defpackage.p58;
import defpackage.pn;
import defpackage.q69;
import defpackage.qr6;
import defpackage.qu0;
import defpackage.r61;
import defpackage.rf0;
import defpackage.rr8;
import defpackage.s58;
import defpackage.sk6;
import defpackage.sv0;
import defpackage.ts5;
import defpackage.ub1;
import defpackage.vg8;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.wm3;
import defpackage.x12;
import defpackage.xe1;
import defpackage.xm3;
import defpackage.xp6;
import defpackage.y12;
import defpackage.yh0;
import defpackage.yk;
import defpackage.yr7;
import defpackage.yt6;
import defpackage.ze0;
import io.sentry.android.core.t0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int a1 = mt6.Widget_Design_TextInputLayout;
    public static final int[][] b1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public ColorDrawable A0;
    public ColorStateList B;
    public int B0;
    public ColorStateList C;
    public final LinkedHashSet C0;
    public boolean D;
    public ColorDrawable D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public Drawable F0;
    public fk4 G;
    public ColorStateList G0;
    public fk4 H;
    public ColorStateList H0;
    public StateListDrawable I;
    public int I0;
    public boolean J;
    public int J0;
    public fk4 K;
    public int K0;
    public fk4 L;
    public ColorStateList L0;
    public as7 M;
    public int M0;
    public boolean N;
    public int N0;
    public final int O;
    public int O0;
    public int P;
    public int P0;
    public int Q;
    public int Q0;
    public int R;
    public int R0;
    public int S;
    public boolean S0;
    public int T;
    public final qu0 T0;
    public int U;
    public boolean U0;
    public int V;
    public boolean V0;
    public final Rect W;
    public ValueAnimator W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public final FrameLayout a;
    public final p48 b;
    public final y12 c;
    public final int d;
    public EditText e;
    public CharSequence f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final xm3 k;
    public boolean l;
    public int m;
    public boolean n;
    public hi8 o;
    public AppCompatTextView p;
    public int q;
    public int r;
    public CharSequence s;
    public boolean t;
    public AppCompatTextView u;
    public ColorStateList v;
    public int w;
    public Fade x;
    public final Rect x0;
    public Fade y;
    public final RectF y0;
    public ColorStateList z;
    public Typeface z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.G;
        }
        int iP = m91.p(xp6.colorControlHighlight, this.e);
        int i = this.P;
        int[][] iArr = b1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            fk4 fk4Var = this.G;
            int i2 = this.V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{m91.y(0.1f, iP, i2), i2}), fk4Var, fk4Var);
        }
        Context context = getContext();
        fk4 fk4Var2 = this.G;
        TypedValue typedValueJ = yh0.J(vp6.colorSurface, context, "TextInputLayout");
        int i3 = typedValueJ.resourceId;
        int color = i3 != 0 ? ContextCompat.getColor(context, i3) : typedValueJ.data;
        fk4 fk4Var3 = new fk4(fk4Var2.b.a);
        int iY = m91.y(0.1f, iP, color);
        fk4Var3.s(new ColorStateList(iArr, new int[]{iY, 0}));
        fk4Var3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iY, color});
        fk4 fk4Var4 = new fk4(fk4Var2.b.a);
        fk4Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fk4Var3, fk4Var4), fk4Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], h(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = h(true);
        }
        return this.H;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.e = editText;
        int i = this.g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i2 = this.h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.j);
        }
        this.J = false;
        k();
        setTextInputAccessibilityDelegate(new gi8(this));
        Typeface typeface = this.e.getTypeface();
        qu0 qu0Var = this.T0;
        boolean zT = qu0Var.t(typeface);
        boolean z = qu0Var.z(typeface);
        if (zT || z) {
            qu0Var.l(false);
        }
        qu0Var.y(this.e.getTextSize());
        float letterSpacing = this.e.getLetterSpacing();
        if (qu0Var.h0 != letterSpacing) {
            qu0Var.h0 = letterSpacing;
            qu0Var.l(false);
        }
        int gravity = this.e.getGravity();
        qu0Var.s((gravity & (-113)) | 48);
        qu0Var.x(gravity);
        this.R0 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new fi8(this, editText));
        if (this.G0 == null) {
            this.G0 = this.e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.p != null) {
            p(this.e.getText());
        }
        t();
        this.k.b();
        this.b.bringToFront();
        y12 y12Var = this.c;
        y12Var.bringToFront();
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((x12) it.next()).a(this);
        }
        y12Var.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        this.T0.B(charSequence);
        if (this.S0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.t == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView != null) {
                this.a.addView(appCompatTextView);
                this.u.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.u;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.u = null;
        }
        this.t = z;
    }

    public final void a() {
        if (this.e == null || this.P != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.T0.g() + this.d), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(oq6.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(oq6.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(oq6.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ja1.z(getContext())) {
            EditText editText3 = this.e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(oq6.material_filled_edittext_font_1_3_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(oq6.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        qu0 qu0Var = this.T0;
        if (qu0Var.b == f) {
            return;
        }
        if (this.W0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.W0 = valueAnimator;
            valueAnimator.setInterpolator(ub1.H(getContext(), vp6.motionEasingEmphasizedInterpolator, yk.b));
            this.W0.setDuration(ub1.G(getContext(), vp6.motionDurationMedium4, 167));
            this.W0.addUpdateListener(new ze0(6, this));
        }
        this.W0.setFloatValues(qu0Var.b, f);
        this.W0.start();
    }

    public final void c() {
        int i;
        int i2;
        fk4 fk4Var = this.G;
        if (fk4Var == null) {
            return;
        }
        as7 as7Var = fk4Var.b.a;
        as7 as7Var2 = this.M;
        if (as7Var != as7Var2) {
            fk4Var.setShapeAppearanceModel(as7Var2);
        }
        if (this.P == 2 && (i = this.R) > -1 && (i2 = this.U) != 0) {
            fk4 fk4Var2 = this.G;
            fk4Var2.z(i);
            fk4Var2.y(ColorStateList.valueOf(i2));
        }
        int iC = this.V;
        if (this.P == 1) {
            iC = sv0.c(this.V, m91.q(getContext(), vp6.colorSurface, 0));
        }
        this.V = iC;
        this.G.s(ColorStateList.valueOf(iC));
        fk4 fk4Var3 = this.K;
        if (fk4Var3 != null && this.L != null) {
            if (this.R > -1 && this.U != 0) {
                fk4Var3.s(this.e.isFocused() ? ColorStateList.valueOf(this.I0) : ColorStateList.valueOf(this.U));
                this.L.s(ColorStateList.valueOf(this.U));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.e == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.x0;
        rect2.bottom = i;
        int i2 = this.P;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.Q;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = i(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.e.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Y0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        fk4 fk4Var;
        super.draw(canvas);
        boolean z = this.D;
        qu0 qu0Var = this.T0;
        if (z) {
            qu0Var.f(canvas);
        }
        if (this.L == null || (fk4Var = this.K) == null) {
            return;
        }
        fk4Var.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f = qu0Var.b;
            int iCenterX = bounds2.centerX();
            bounds.left = yk.c(f, iCenterX, bounds2.left);
            bounds.right = yk.c(f, iCenterX, bounds2.right);
            this.L.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.X0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.X0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            qu0 r3 = r4.T0
            if (r3 == 0) goto L2f
            r3.S = r1
            android.content.res.ColorStateList r1 = r3.p
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.o
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.l(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.e
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.X0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.D) {
            int i = this.P;
            qu0 qu0Var = this.T0;
            if (i == 0) {
                return (int) qu0Var.g();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (qu0Var.g() / 2.0f);
                }
                float fG = qu0Var.g();
                TextPaint textPaint = qu0Var.V;
                textPaint.setTextSize(qu0Var.n);
                textPaint.setTypeface(qu0Var.x);
                textPaint.setLetterSpacing(qu0Var.g0);
                return Math.max(0, (int) (fG - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final Fade f() {
        Fade fade = new Fade();
        fade.c = ub1.G(getContext(), vp6.motionDurationShort2, 87);
        fade.d = ub1.H(getContext(), vp6.motionEasingLinearInterpolator, yk.a);
        return fade;
    }

    public final boolean g() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof k91);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public fk4 getBoxBackground() {
        int i = this.P;
        if (i == 1 || i == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.y0;
        return layoutDirection == 1 ? this.M.h.a(rectF) : this.M.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.y0;
        return layoutDirection == 1 ? this.M.g.a(rectF) : this.M.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.y0;
        return layoutDirection == 1 ? this.M.e.a(rectF) : this.M.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.y0;
        return layoutDirection == 1 ? this.M.f.a(rectF) : this.M.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.L0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.l && this.n && (appCompatTextView = this.p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.G0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.m;
    }

    public int getEndIconMode() {
        return this.c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.n;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.g;
    }

    public CharSequence getError() {
        xm3 xm3Var = this.k;
        if (xm3Var.q) {
            return xm3Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.k.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.k.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.k.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        xm3 xm3Var = this.k;
        if (xm3Var.x) {
            return xm3Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.k.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.T0.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        qu0 qu0Var = this.T0;
        return qu0Var.h(qu0Var.p);
    }

    public int getHintMaxLines() {
        return this.T0.o0;
    }

    public ColorStateList getHintTextColor() {
        return this.H0;
    }

    public hi8 getLengthCounter() {
        return this.o;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public as7 getShapeAppearanceModel() {
        return this.M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h;
    }

    public CharSequence getSuffixText() {
        return this.c.p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.q;
    }

    public Typeface getTypeface() {
        return this.z0;
    }

    public final fk4 h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(oq6.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(oq6.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(oq6.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ma7 ma7Var = new ma7();
        ma7 ma7Var2 = new ma7();
        ma7 ma7Var3 = new ma7();
        ma7 ma7Var4 = new ma7();
        int i = 0;
        fz1 fz1Var = new fz1(i);
        fz1 fz1Var2 = new fz1(i);
        fz1 fz1Var3 = new fz1(i);
        fz1 fz1Var4 = new fz1(i);
        i iVar = new i(f);
        i iVar2 = new i(f);
        i iVar3 = new i(dimensionPixelOffset);
        i iVar4 = new i(dimensionPixelOffset);
        as7 as7Var = new as7();
        as7Var.a = ma7Var;
        as7Var.b = ma7Var2;
        as7Var.c = ma7Var3;
        as7Var.d = ma7Var4;
        as7Var.e = iVar;
        as7Var.f = iVar2;
        as7Var.g = iVar4;
        as7Var.h = iVar3;
        as7Var.i = fz1Var;
        as7Var.j = fz1Var2;
        as7Var.k = fz1Var3;
        as7Var.l = fz1Var4;
        EditText editText2 = this.e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = fk4.F;
            TypedValue typedValueJ = yh0.J(vp6.colorSurface, context, fk4.class.getSimpleName());
            int i2 = typedValueJ.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? ContextCompat.getColor(context, i2) : typedValueJ.data);
        }
        fk4 fk4Var = new fk4();
        fk4Var.o(context);
        fk4Var.s(dropDownBackgroundTintList);
        fk4Var.r(popupElevation);
        fk4Var.setShapeAppearanceModel(as7Var);
        dk4 dk4Var = fk4Var.b;
        if (dk4Var.h == null) {
            dk4Var.h = new Rect();
        }
        fk4Var.b.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fk4Var.invalidateSelf();
        return fk4Var;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    public final void k() {
        int i = this.P;
        if (i == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i == 1) {
            this.G = new fk4(this.M);
            this.K = new fk4();
            this.L = new fk4();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(dw1.k(this.P, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.D || (this.G instanceof k91)) {
                this.G = new fk4(this.M);
            } else {
                as7 as7Var = this.M;
                int i2 = k91.I;
                if (as7Var == null) {
                    as7Var = new as7();
                }
                i91 i91Var = new i91(as7Var, new RectF());
                j91 j91Var = new j91(i91Var);
                j91Var.H = i91Var;
                this.G = j91Var;
            }
            this.K = null;
            this.L = null;
        }
        u();
        z();
        if (this.P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.Q = getResources().getDimensionPixelSize(oq6.material_font_2_0_box_collapsed_padding_top);
            } else if (ja1.z(getContext())) {
                this.Q = getResources().getDimensionPixelSize(oq6.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.P != 0) {
            v();
        }
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.P;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(ot6.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), dq6.design_error));
    }

    public final boolean o() {
        xm3 xm3Var = this.k;
        return (xm3Var.o != 1 || xm3Var.r == null || TextUtils.isEmpty(xm3Var.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.T0.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        y12 y12Var = this.c;
        y12Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.Z0 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (iMax = Math.max(y12Var.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.e.post(new kb8(3, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fI;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.W;
            dk1.a(this, editText, rect);
            fk4 fk4Var = this.K;
            if (fk4Var != null) {
                int i6 = rect.bottom;
                fk4Var.setBounds(rect.left, i6 - this.S, rect.right, i6);
            }
            fk4 fk4Var2 = this.L;
            if (fk4Var2 != null) {
                int i7 = rect.bottom;
                fk4Var2.setBounds(rect.left, i7 - this.T, rect.right, i7);
            }
            if (this.D) {
                float textSize = this.e.getTextSize();
                qu0 qu0Var = this.T0;
                qu0Var.y(textSize);
                TextPaint textPaint = qu0Var.V;
                int gravity = this.e.getGravity();
                qu0Var.s((gravity & (-113)) | 48);
                qu0Var.x(gravity);
                Rect rectD = d(rect);
                qu0Var.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
                if (this.e == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(qu0Var.m);
                    textPaint.setTypeface(qu0Var.A);
                    textPaint.setLetterSpacing(qu0Var.h0);
                    fI = -textPaint.ascent();
                } else {
                    fI = qu0Var.i() * qu0Var.q;
                }
                int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.x0;
                rect2.left = compoundPaddingLeft;
                if (this.P != 1 || this.e.getMinLines() > 1) {
                    if (this.P != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(qu0Var.m);
                        textPaint.setTypeface(qu0Var.A);
                        textPaint.setLetterSpacing(qu0Var.h0);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.e.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fI / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.P != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + fI);
                rect2.bottom = compoundPaddingBottom;
                qu0Var.u(true, rect2.left, rect2.top, rect2.right, compoundPaddingBottom);
                qu0Var.l(false);
                if (!g() || this.S0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.Z0;
        y12 y12Var = this.c;
        if (!z) {
            y12Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.Z0 = true;
        }
        if (this.u != null && (editText = this.e) != null) {
            this.u.setGravity(editText.getGravity());
            this.u.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        y12Var.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight();
        qu0 qu0Var = this.T0;
        TextPaint textPaint = qu0Var.V;
        textPaint.setTextSize(qu0Var.n);
        textPaint.setTypeface(qu0Var.x);
        textPaint.setLetterSpacing(qu0Var.g0);
        float f2 = measuredWidth;
        qu0Var.t0 = qu0Var.e(qu0Var.p0, textPaint, qu0Var.H, (qu0Var.n / qu0Var.m) * f2, qu0Var.J).getHeight();
        textPaint.setTextSize(qu0Var.m);
        textPaint.setTypeface(qu0Var.A);
        textPaint.setLetterSpacing(qu0Var.h0);
        qu0Var.u0 = qu0Var.e(qu0Var.o0, textPaint, qu0Var.H, f2, qu0Var.J).getHeight();
        EditText editText2 = this.e;
        Rect rect = this.W;
        dk1.a(this, editText2, rect);
        Rect rectD = d(rect);
        qu0Var.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
        v();
        a();
        if (this.e == null) {
            return;
        }
        int i3 = qu0Var.u0;
        if (i3 != -1) {
            f = i3;
        } else {
            TextPaint textPaint2 = qu0Var.V;
            textPaint2.setTextSize(qu0Var.m);
            textPaint2.setTypeface(qu0Var.A);
            textPaint2.setLetterSpacing(qu0Var.h0);
            f = -textPaint2.ascent();
        }
        float height = 0.0f;
        if (this.s != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.u.getPaint());
            textPaint3.setTextSize(this.u.getTextSize());
            textPaint3.setTypeface(this.u.getTypeface());
            textPaint3.setLetterSpacing(this.u.getLetterSpacing());
            try {
                s58 s58Var = new s58(this.s, textPaint3, measuredWidth);
                s58Var.k = getLayoutDirection() == 1;
                s58Var.j = true;
                float lineSpacingExtra = this.u.getLineSpacingExtra();
                float lineSpacingMultiplier = this.u.getLineSpacingMultiplier();
                s58Var.g = lineSpacingExtra;
                s58Var.h = lineSpacingMultiplier;
                s58Var.m = new ts5(25, this);
                height = s58Var.a().getHeight() + (this.P == 1 ? qu0Var.g() + this.Q + this.d : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                t0.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(f, height);
        if (this.e.getMeasuredHeight() < fMax) {
            this.e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setError(savedState.c);
        if (savedState.d) {
            post(new fp7(4, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.N) {
            r61 r61Var = this.M.e;
            RectF rectF = this.y0;
            float fA = r61Var.a(rectF);
            float fA2 = this.M.f.a(rectF);
            float fA3 = this.M.h.a(rectF);
            float fA4 = this.M.g.a(rectF);
            as7 as7Var = this.M;
            at2 at2Var = as7Var.a;
            at2 at2Var2 = as7Var.b;
            at2 at2Var3 = as7Var.d;
            at2 at2Var4 = as7Var.c;
            fz1 fz1Var = new fz1(0);
            fz1 fz1Var2 = new fz1(0);
            fz1 fz1Var3 = new fz1(0);
            fz1 fz1Var4 = new fz1(0);
            i iVar = new i(fA2);
            i iVar2 = new i(fA);
            i iVar3 = new i(fA4);
            i iVar4 = new i(fA3);
            as7 as7Var2 = new as7();
            as7Var2.a = at2Var2;
            as7Var2.b = at2Var;
            as7Var2.c = at2Var3;
            as7Var2.d = at2Var4;
            as7Var2.e = iVar;
            as7Var2.f = iVar2;
            as7Var2.g = iVar4;
            as7Var2.h = iVar3;
            as7Var2.i = fz1Var;
            as7Var2.j = fz1Var2;
            as7Var2.k = fz1Var3;
            as7Var2.l = fz1Var4;
            this.N = z;
            setShapeAppearanceModel(as7Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.c = getError();
        }
        y12 y12Var = this.c;
        savedState.d = y12Var.i != 0 && y12Var.g.d;
        return savedState;
    }

    public final void p(Editable editable) {
        ((p58) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.n;
        int i = this.m;
        if (i == -1) {
            this.p.setText(String.valueOf(length));
            this.p.setContentDescription(null);
            this.n = false;
        } else {
            this.n = length > i;
            Context context = getContext();
            this.p.setContentDescription(context.getString(this.n ? ft6.character_counter_overflowed_content_description : ft6.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.m)));
            if (z != this.n) {
                q();
            }
            String str = eb0.b;
            eb0 eb0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? eb0.e : eb0.d;
            AppCompatTextView appCompatTextView = this.p;
            String string = getContext().getString(ft6.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.m));
            eb0Var.getClass();
            xe1 xe1Var = vg8.a;
            appCompatTextView.setText(string != null ? eb0Var.c(string).toString() : null);
        }
        if (this.e == null || z == this.n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.p;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.n ? this.q : this.r);
            if (!this.n && (colorStateList2 = this.z) != null) {
                this.p.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.A) == null) {
                return;
            }
            this.p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.B
            if (r0 == 0) goto L5
            goto L25
        L5:
            android.content.Context r0 = r4.getContext()
            int r1 = defpackage.xp6.colorControlActivated
            android.util.TypedValue r1 = defpackage.yh0.G(r0, r1)
            r2 = 0
            if (r1 != 0) goto L14
        L12:
            r0 = r2
            goto L25
        L14:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1d
            android.content.res.ColorStateList r0 = androidx.core.content.ContextCompat.getColorStateList(r0, r3)
            goto L25
        L1d:
            int r0 = r1.data
            if (r0 == 0) goto L12
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L25:
            android.widget.EditText r1 = r4.e
            if (r1 == 0) goto L50
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            if (r1 != 0) goto L30
            goto L50
        L30:
            android.widget.EditText r1 = r4.e
            android.graphics.drawable.Drawable r1 = r1.getTextCursorDrawable()
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L48
            androidx.appcompat.widget.AppCompatTextView r2 = r4.p
            if (r2 == 0) goto L4d
            boolean r2 = r4.n
            if (r2 == 0) goto L4d
        L48:
            android.content.res.ColorStateList r2 = r4.C
            if (r2 == 0) goto L4d
            r0 = r2
        L4d:
            r1.setTintList(r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i) {
        if (this.V != i) {
            this.V = i;
            this.M0 = i;
            this.O0 = i;
            this.P0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.M0 = defaultColor;
        this.V = defaultColor;
        this.N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.O0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.P) {
            return;
        }
        this.P = i;
        if (this.e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.Q = i;
    }

    public void setBoxCornerFamily(int i) {
        yr7 yr7VarH = this.M.h();
        r61 r61Var = this.M.e;
        yr7VarH.a = ub1.q(i);
        yr7VarH.e = r61Var;
        r61 r61Var2 = this.M.f;
        yr7VarH.b = ub1.q(i);
        yr7VarH.f = r61Var2;
        r61 r61Var3 = this.M.h;
        yr7VarH.d = ub1.q(i);
        yr7VarH.h = r61Var3;
        r61 r61Var4 = this.M.g;
        yr7VarH.c = ub1.q(i);
        yr7VarH.g = r61Var4;
        this.M = yr7VarH.a();
        c();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean z = getLayoutDirection() == 1;
        this.N = z;
        float f5 = z ? f2 : f;
        if (!z) {
            f = f2;
        }
        float f6 = z ? f4 : f3;
        if (!z) {
            f3 = f4;
        }
        fk4 fk4Var = this.G;
        if (fk4Var != null && fk4Var.l() == f5 && this.G.m() == f) {
            fk4 fk4Var2 = this.G;
            float[] fArr = fk4Var2.C;
            if ((fArr != null ? fArr[2] : fk4Var2.b.a.h.a(fk4Var2.h())) == f6) {
                fk4 fk4Var3 = this.G;
                float[] fArr2 = fk4Var3.C;
                if ((fArr2 != null ? fArr2[1] : fk4Var3.b.a.g.a(fk4Var3.h())) == f3) {
                    return;
                }
            }
        }
        yr7 yr7VarH = this.M.h();
        yr7VarH.e = new i(f5);
        yr7VarH.f = new i(f);
        yr7VarH.h = new i(f6);
        yr7VarH.g = new i(f3);
        this.M = yr7VarH.a();
        c();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.K0 != i) {
            this.K0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.I0 = colorStateList.getDefaultColor();
            this.Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.K0 != colorStateList.getDefaultColor()) {
            this.K0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.S = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.T = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            xm3 xm3Var = this.k;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.p = appCompatTextView;
                appCompatTextView.setId(qr6.textinput_counter);
                Typeface typeface = this.z0;
                if (typeface != null) {
                    this.p.setTypeface(typeface);
                }
                this.p.setMaxLines(1);
                xm3Var.a(this.p, 2);
                ((ViewGroup.MarginLayoutParams) this.p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(oq6.mtrl_textinput_counter_margin_start));
                q();
                if (this.p != null) {
                    EditText editText = this.e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                xm3Var.g(this.p, 2);
                this.p = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i > 0) {
                this.m = i;
            } else {
                this.m = -1;
            }
            if (!this.l || this.p == null) {
                return;
            }
            EditText editText = this.e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.r != i) {
            this.r = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (o() || (this.p != null && this.n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.G0 = colorStateList;
        this.H0 = colorStateList;
        if (this.e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        y12 y12Var = this.c;
        CharSequence text = i != 0 ? y12Var.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = y12Var.g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        y12 y12Var = this.c;
        Drawable drawableV = i != 0 ? rf0.v(y12Var.getContext(), i) : null;
        TextInputLayout textInputLayout = y12Var.a;
        CheckableImageButton checkableImageButton = y12Var.g;
        checkableImageButton.setImageDrawable(drawableV);
        if (drawableV != null) {
            dt2.d(textInputLayout, checkableImageButton, y12Var.k, y12Var.l);
            dt2.x(textInputLayout, checkableImageButton, y12Var.k);
        }
    }

    public void setEndIconMinSize(int i) {
        y12 y12Var = this.c;
        if (i < 0) {
            y12Var.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != y12Var.m) {
            y12Var.m = i;
            CheckableImageButton checkableImageButton = y12Var.g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = y12Var.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        y12 y12Var = this.c;
        CheckableImageButton checkableImageButton = y12Var.g;
        View.OnLongClickListener onLongClickListener = y12Var.o;
        checkableImageButton.setOnClickListener(onClickListener);
        dt2.D(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y12 y12Var = this.c;
        y12Var.o = onLongClickListener;
        CheckableImageButton checkableImageButton = y12Var.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        dt2.D(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        y12 y12Var = this.c;
        y12Var.n = scaleType;
        y12Var.g.setScaleType(scaleType);
        y12Var.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        y12 y12Var = this.c;
        if (y12Var.k != colorStateList) {
            y12Var.k = colorStateList;
            dt2.d(y12Var.a, y12Var.g, colorStateList, y12Var.l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        y12 y12Var = this.c;
        if (y12Var.l != mode) {
            y12Var.l = mode;
            dt2.d(y12Var.a, y12Var.g, y12Var.k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        xm3 xm3Var = this.k;
        if (!xm3Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            xm3Var.f();
            return;
        }
        xm3Var.c();
        xm3Var.p = charSequence;
        xm3Var.r.setText(charSequence);
        int i = xm3Var.n;
        if (i != 1) {
            xm3Var.o = 1;
        }
        xm3Var.i(i, xm3Var.o, xm3Var.h(xm3Var.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        xm3 xm3Var = this.k;
        xm3Var.t = i;
        AppCompatTextView appCompatTextView = xm3Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        xm3 xm3Var = this.k;
        xm3Var.s = charSequence;
        AppCompatTextView appCompatTextView = xm3Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        xm3 xm3Var = this.k;
        TextInputLayout textInputLayout = xm3Var.h;
        if (xm3Var.q == z) {
            return;
        }
        xm3Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(xm3Var.g);
            xm3Var.r = appCompatTextView;
            appCompatTextView.setId(qr6.textinput_error);
            xm3Var.r.setTextAlignment(5);
            Typeface typeface = xm3Var.B;
            if (typeface != null) {
                xm3Var.r.setTypeface(typeface);
            }
            int i = xm3Var.u;
            xm3Var.u = i;
            AppCompatTextView appCompatTextView2 = xm3Var.r;
            if (appCompatTextView2 != null) {
                xm3Var.h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = xm3Var.v;
            xm3Var.v = colorStateList;
            AppCompatTextView appCompatTextView3 = xm3Var.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = xm3Var.s;
            xm3Var.s = charSequence;
            AppCompatTextView appCompatTextView4 = xm3Var.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = xm3Var.t;
            xm3Var.t = i2;
            AppCompatTextView appCompatTextView5 = xm3Var.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            xm3Var.r.setVisibility(4);
            xm3Var.a(xm3Var.r, 0);
        } else {
            xm3Var.f();
            xm3Var.g(xm3Var.r, 0);
            xm3Var.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        xm3Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        y12 y12Var = this.c;
        y12Var.i(i != 0 ? rf0.v(y12Var.getContext(), i) : null);
        dt2.x(y12Var.a, y12Var.c, y12Var.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        y12 y12Var = this.c;
        CheckableImageButton checkableImageButton = y12Var.c;
        View.OnLongClickListener onLongClickListener = y12Var.f;
        checkableImageButton.setOnClickListener(onClickListener);
        dt2.D(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y12 y12Var = this.c;
        y12Var.f = onLongClickListener;
        CheckableImageButton checkableImageButton = y12Var.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        dt2.D(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        y12 y12Var = this.c;
        if (y12Var.d != colorStateList) {
            y12Var.d = colorStateList;
            dt2.d(y12Var.a, y12Var.c, colorStateList, y12Var.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        y12 y12Var = this.c;
        if (y12Var.e != mode) {
            y12Var.e = mode;
            dt2.d(y12Var.a, y12Var.c, y12Var.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        xm3 xm3Var = this.k;
        xm3Var.u = i;
        AppCompatTextView appCompatTextView = xm3Var.r;
        if (appCompatTextView != null) {
            xm3Var.h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        xm3 xm3Var = this.k;
        xm3Var.v = colorStateList;
        AppCompatTextView appCompatTextView = xm3Var.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.U0 != z) {
            this.U0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        xm3 xm3Var = this.k;
        if (zIsEmpty) {
            if (xm3Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!xm3Var.x) {
            setHelperTextEnabled(true);
        }
        xm3Var.c();
        xm3Var.w = charSequence;
        xm3Var.y.setText(charSequence);
        int i = xm3Var.n;
        if (i != 2) {
            xm3Var.o = 2;
        }
        xm3Var.i(i, xm3Var.o, xm3Var.h(xm3Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        xm3 xm3Var = this.k;
        xm3Var.A = colorStateList;
        AppCompatTextView appCompatTextView = xm3Var.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        xm3 xm3Var = this.k;
        TextInputLayout textInputLayout = xm3Var.h;
        if (xm3Var.x == z) {
            return;
        }
        xm3Var.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(xm3Var.g);
            xm3Var.y = appCompatTextView;
            appCompatTextView.setId(qr6.textinput_helper_text);
            xm3Var.y.setTextAlignment(5);
            Typeface typeface = xm3Var.B;
            if (typeface != null) {
                xm3Var.y.setTypeface(typeface);
            }
            xm3Var.y.setVisibility(4);
            xm3Var.y.setAccessibilityLiveRegion(1);
            int i = xm3Var.z;
            xm3Var.z = i;
            AppCompatTextView appCompatTextView2 = xm3Var.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = xm3Var.A;
            xm3Var.A = colorStateList;
            AppCompatTextView appCompatTextView3 = xm3Var.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            xm3Var.a(xm3Var.y, 1);
            xm3Var.y.setAccessibilityDelegate(new wm3(xm3Var));
        } else {
            xm3Var.c();
            int i2 = xm3Var.n;
            if (i2 == 2) {
                xm3Var.o = 0;
            }
            xm3Var.i(i2, xm3Var.o, xm3Var.h(xm3Var.y, ""));
            xm3Var.g(xm3Var.y, 1);
            xm3Var.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        xm3Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        xm3 xm3Var = this.k;
        xm3Var.z = i;
        AppCompatTextView appCompatTextView = xm3Var.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.V0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.D) {
            this.D = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        qu0 qu0Var = this.T0;
        if (i != qu0Var.p0) {
            qu0Var.p0 = i;
            qu0Var.l(false);
        }
        qu0Var.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        qu0 qu0Var = this.T0;
        qu0Var.q(i);
        this.H0 = qu0Var.p;
        if (this.e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            if (this.G0 == null) {
                this.T0.r(colorStateList);
            }
            this.H0 = colorStateList;
            if (this.e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(hi8 hi8Var) {
        this.o = hi8Var;
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        y12 y12Var = this.c;
        y12Var.g.setContentDescription(i != 0 ? y12Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        y12 y12Var = this.c;
        y12Var.g.setImageDrawable(i != 0 ? rf0.v(y12Var.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        y12 y12Var = this.c;
        if (z && y12Var.i != 1) {
            y12Var.g(1);
        } else if (z) {
            y12Var.getClass();
        } else {
            y12Var.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        y12 y12Var = this.c;
        y12Var.k = colorStateList;
        dt2.d(y12Var.a, y12Var.g, colorStateList, y12Var.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        y12 y12Var = this.c;
        y12Var.l = mode;
        dt2.d(y12Var.a, y12Var.g, y12Var.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.u = appCompatTextView;
            appCompatTextView.setId(qr6.textinput_placeholder);
            this.u.setImportantForAccessibility(1);
            this.u.setAccessibilityLiveRegion(1);
            Fade fadeF = f();
            this.x = fadeF;
            fadeF.b = 67L;
            this.y = f();
            setPlaceholderTextAppearance(this.w);
            setPlaceholderTextColor(this.v);
            q69.q(this.u, new hw1(5));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        EditText editText = this.e;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.w = i;
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        p48 p48Var = this.b;
        p48Var.getClass();
        p48Var.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        p48Var.b.setText(charSequence);
        p48Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(as7 as7Var) {
        fk4 fk4Var = this.G;
        if (fk4Var == null || fk4Var.b.a == as7Var) {
            return;
        }
        this.M = as7Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? rf0.v(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        p48 p48Var = this.b;
        if (i < 0) {
            p48Var.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != p48Var.g) {
            p48Var.g = i;
            CheckableImageButton checkableImageButton = p48Var.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        p48 p48Var = this.b;
        CheckableImageButton checkableImageButton = p48Var.d;
        View.OnLongClickListener onLongClickListener = p48Var.i;
        checkableImageButton.setOnClickListener(onClickListener);
        dt2.D(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p48 p48Var = this.b;
        p48Var.i = onLongClickListener;
        CheckableImageButton checkableImageButton = p48Var.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        dt2.D(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        p48 p48Var = this.b;
        p48Var.h = scaleType;
        p48Var.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        p48 p48Var = this.b;
        if (p48Var.e != colorStateList) {
            p48Var.e = colorStateList;
            dt2.d(p48Var.a, p48Var.d, colorStateList, p48Var.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        p48 p48Var = this.b;
        if (p48Var.f != mode) {
            p48Var.f = mode;
            dt2.d(p48Var.a, p48Var.d, p48Var.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        y12 y12Var = this.c;
        y12Var.getClass();
        y12Var.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        y12Var.q.setText(charSequence);
        y12Var.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(gi8 gi8Var) {
        EditText editText = this.e;
        if (editText != null) {
            q69.q(editText, gi8Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.z0) {
            this.z0 = typeface;
            qu0 qu0Var = this.T0;
            boolean zT = qu0Var.t(typeface);
            boolean z = qu0Var.z(typeface);
            if (zT || z) {
                qu0Var.l(false);
            }
            xm3 xm3Var = this.k;
            if (typeface != xm3Var.B) {
                xm3Var.B = typeface;
                AppCompatTextView appCompatTextView = xm3Var.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = xm3Var.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = aw1.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(pn.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (appCompatTextView = this.p) != null) {
            drawableMutate.setColorFilter(pn.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            this.e.setBackground(getEditTextBoxBackground());
            this.J = true;
        }
    }

    public final void v() {
        if (this.P != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.G0;
        qu0 qu0Var = this.T0;
        if (colorStateList2 != null) {
            qu0Var.n(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.G0;
            qu0Var.n(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.Q0) : this.Q0));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.k.r;
            qu0Var.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.n && (appCompatTextView = this.p) != null) {
            qu0Var.n(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.H0) != null) {
            qu0Var.r(colorStateList);
        }
        y12 y12Var = this.c;
        p48 p48Var = this.b;
        if (z3 || !this.U0 || (isEnabled() && z4)) {
            if (z2 || this.S0) {
                ValueAnimator valueAnimator = this.W0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.W0.cancel();
                }
                if (z && this.V0) {
                    b(1.0f);
                } else {
                    qu0Var.A(1.0f);
                }
                this.S0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.e;
                x(editText3 != null ? editText3.getText() : null);
                p48Var.j = false;
                p48Var.e();
                y12Var.r = false;
                y12Var.n();
                return;
            }
            return;
        }
        if (z2 || !this.S0) {
            ValueAnimator valueAnimator2 = this.W0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.W0.cancel();
            }
            if (z && this.V0) {
                b(0.0f);
            } else {
                qu0Var.A(0.0f);
            }
            if (g() && !((k91) this.G).H.s.isEmpty() && g()) {
                ((k91) this.G).E(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.S0 = true;
            AppCompatTextView appCompatTextView3 = this.u;
            if (appCompatTextView3 != null && this.t) {
                appCompatTextView3.setText((CharSequence) null);
                rr8.a(this.a, this.y);
                this.u.setVisibility(4);
            }
            p48Var.j = true;
            p48Var.e();
            y12Var.r = true;
            y12Var.n();
        }
    }

    public final void x(Editable editable) {
        ((p58) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.S0) {
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || !this.t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            rr8.a(frameLayout, this.y);
            this.u.setVisibility(4);
            return;
        }
        if (this.u == null || !this.t || TextUtils.isEmpty(this.s)) {
            return;
        }
        this.u.setText(this.s);
        rr8.a(frameLayout, this.x);
        this.u.setVisibility(0);
        this.u.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.L0.getDefaultColor();
        int colorForState = this.L0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.L0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.U = colorForState2;
        } else if (z2) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.U = this.Q0;
        } else if (o()) {
            if (this.L0 != null) {
                y(z2, z);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.n || (appCompatTextView = this.p) == null) {
            if (z2) {
                this.U = this.K0;
            } else if (z) {
                this.U = this.J0;
            } else {
                this.U = this.I0;
            }
        } else if (this.L0 != null) {
            y(z2, z);
        } else {
            this.U = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        y12 y12Var = this.c;
        TextInputLayout textInputLayout = y12Var.a;
        CheckableImageButton checkableImageButton = y12Var.g;
        TextInputLayout textInputLayout2 = y12Var.a;
        y12Var.l();
        dt2.x(textInputLayout2, y12Var.c, y12Var.d);
        dt2.x(textInputLayout2, checkableImageButton, y12Var.k);
        if (y12Var.b() instanceof mx1) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                dt2.d(textInputLayout, checkableImageButton, y12Var.k, y12Var.l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        p48 p48Var = this.b;
        dt2.x(p48Var.a, p48Var.d, p48Var.e);
        if (this.P == 2) {
            int i = this.R;
            if (z2 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i && g() && !this.S0) {
                if (g()) {
                    ((k91) this.G).E(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.N0;
            } else if (z && !z2) {
                this.V = this.P0;
            } else if (z2) {
                this.V = this.O0;
            } else {
                this.V = this.M0;
            }
        }
        c();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.textInputStyle);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = a1;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = new xm3(this);
        this.o = new p58(4);
        this.W = new Rect();
        this.x0 = new Rect();
        this.y0 = new RectF();
        this.C0 = new LinkedHashSet();
        qu0 qu0Var = new qu0(this);
        this.T0 = qu0Var;
        this.Z0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = yk.a;
        qu0Var.X = linearInterpolator;
        qu0Var.l(false);
        qu0Var.W = linearInterpolator;
        qu0Var.l(false);
        qu0Var.s(8388659);
        sk6 sk6VarE = vj8.e(context2, attributeSet, yt6.TextInputLayout, i, i2, yt6.TextInputLayout_counterTextAppearance, yt6.TextInputLayout_counterOverflowTextAppearance, yt6.TextInputLayout_errorTextAppearance, yt6.TextInputLayout_helperTextTextAppearance, yt6.TextInputLayout_hintTextAppearance);
        p48 p48Var = new p48(this, sk6VarE);
        this.b = p48Var;
        int i3 = yt6.TextInputLayout_hintEnabled;
        TypedArray typedArray = (TypedArray) sk6VarE.c;
        this.D = typedArray.getBoolean(i3, true);
        setHint(typedArray.getText(yt6.TextInputLayout_android_hint));
        this.V0 = typedArray.getBoolean(yt6.TextInputLayout_hintAnimationEnabled, true);
        this.U0 = typedArray.getBoolean(yt6.TextInputLayout_expandedHintEnabled, true);
        if (typedArray.hasValue(yt6.TextInputLayout_android_minEms)) {
            setMinEms(typedArray.getInt(yt6.TextInputLayout_android_minEms, -1));
        } else if (typedArray.hasValue(yt6.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArray.getDimensionPixelSize(yt6.TextInputLayout_android_minWidth, -1));
        }
        if (typedArray.hasValue(yt6.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArray.getInt(yt6.TextInputLayout_android_maxEms, -1));
        } else if (typedArray.hasValue(yt6.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArray.getDimensionPixelSize(yt6.TextInputLayout_android_maxWidth, -1));
        }
        this.M = as7.d(context2, attributeSet, i, i2).a();
        this.O = context2.getResources().getDimensionPixelOffset(oq6.mtrl_textinput_box_label_cutout_padding);
        this.Q = typedArray.getDimensionPixelOffset(yt6.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.d = getResources().getDimensionPixelSize(oq6.m3_multiline_hint_filled_text_extra_space);
        this.S = typedArray.getDimensionPixelSize(yt6.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(oq6.mtrl_textinput_box_stroke_width_default));
        this.T = typedArray.getDimensionPixelSize(yt6.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(oq6.mtrl_textinput_box_stroke_width_focused));
        this.R = this.S;
        float dimension = typedArray.getDimension(yt6.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArray.getDimension(yt6.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArray.getDimension(yt6.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArray.getDimension(yt6.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        yr7 yr7VarH = this.M.h();
        if (dimension >= 0.0f) {
            yr7VarH.e = new i(dimension);
        }
        if (dimension2 >= 0.0f) {
            yr7VarH.f = new i(dimension2);
        }
        if (dimension3 >= 0.0f) {
            yr7VarH.g = new i(dimension3);
        }
        if (dimension4 >= 0.0f) {
            yr7VarH.h = new i(dimension4);
        }
        this.M = yr7VarH.a();
        ColorStateList colorStateListQ = ja1.q(context2, sk6VarE, yt6.TextInputLayout_boxBackgroundColor);
        if (colorStateListQ != null) {
            int defaultColor = colorStateListQ.getDefaultColor();
            this.M0 = defaultColor;
            this.V = defaultColor;
            if (colorStateListQ.isStateful()) {
                this.N0 = colorStateListQ.getColorForState(new int[]{-16842910}, -1);
                this.O0 = colorStateListQ.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.P0 = colorStateListQ.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.O0 = this.M0;
                ColorStateList colorStateList = ContextCompat.getColorStateList(context2, dq6.mtrl_filled_background_color);
                this.N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.V = 0;
            this.M0 = 0;
            this.N0 = 0;
            this.O0 = 0;
            this.P0 = 0;
        }
        if (typedArray.hasValue(yt6.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListT = sk6VarE.t(yt6.TextInputLayout_android_textColorHint);
            this.H0 = colorStateListT;
            this.G0 = colorStateListT;
        }
        ColorStateList colorStateListQ2 = ja1.q(context2, sk6VarE, yt6.TextInputLayout_boxStrokeColor);
        this.K0 = typedArray.getColor(yt6.TextInputLayout_boxStrokeColor, 0);
        this.I0 = ContextCompat.getColor(context2, dq6.mtrl_textinput_default_box_stroke_color);
        this.Q0 = ContextCompat.getColor(context2, dq6.mtrl_textinput_disabled_color);
        this.J0 = ContextCompat.getColor(context2, dq6.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListQ2 != null) {
            setBoxStrokeColorStateList(colorStateListQ2);
        }
        if (typedArray.hasValue(yt6.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(ja1.q(context2, sk6VarE, yt6.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArray.getResourceId(yt6.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(yt6.TextInputLayout_hintTextAppearance, 0));
        }
        this.B = sk6VarE.t(yt6.TextInputLayout_cursorColor);
        this.C = sk6VarE.t(yt6.TextInputLayout_cursorErrorColor);
        int resourceId = typedArray.getResourceId(yt6.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArray.getText(yt6.TextInputLayout_errorContentDescription);
        int i4 = typedArray.getInt(yt6.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArray.getBoolean(yt6.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArray.getResourceId(yt6.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = typedArray.getBoolean(yt6.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArray.getText(yt6.TextInputLayout_helperText);
        int resourceId3 = typedArray.getResourceId(yt6.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArray.getText(yt6.TextInputLayout_placeholderText);
        boolean z3 = typedArray.getBoolean(yt6.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArray.getInt(yt6.TextInputLayout_counterMaxLength, -1));
        this.r = typedArray.getResourceId(yt6.TextInputLayout_counterTextAppearance, 0);
        this.q = typedArray.getResourceId(yt6.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArray.getInt(yt6.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(yt6.TextInputLayout_errorTextColor)) {
            setErrorTextColor(sk6VarE.t(yt6.TextInputLayout_errorTextColor));
        }
        if (typedArray.hasValue(yt6.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(sk6VarE.t(yt6.TextInputLayout_helperTextTextColor));
        }
        if (typedArray.hasValue(yt6.TextInputLayout_hintTextColor)) {
            setHintTextColor(sk6VarE.t(yt6.TextInputLayout_hintTextColor));
        }
        if (typedArray.hasValue(yt6.TextInputLayout_counterTextColor)) {
            setCounterTextColor(sk6VarE.t(yt6.TextInputLayout_counterTextColor));
        }
        if (typedArray.hasValue(yt6.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(sk6VarE.t(yt6.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArray.hasValue(yt6.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(sk6VarE.t(yt6.TextInputLayout_placeholderTextColor));
        }
        y12 y12Var = new y12(this, sk6VarE);
        this.c = y12Var;
        boolean z4 = typedArray.getBoolean(yt6.TextInputLayout_android_enabled, true);
        setHintMaxLines(typedArray.getInt(yt6.TextInputLayout_hintMaxLines, 1));
        sk6VarE.G();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(p48Var);
        frameLayout.addView(y12Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        y12 y12Var = this.c;
        TextInputLayout textInputLayout = y12Var.a;
        CheckableImageButton checkableImageButton = y12Var.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            dt2.d(textInputLayout, checkableImageButton, y12Var.k, y12Var.l);
            dt2.x(textInputLayout, checkableImageButton, y12Var.k);
        }
    }
}
