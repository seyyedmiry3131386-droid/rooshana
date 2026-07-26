package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class y12 extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final aj0 h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public AccessibilityManager.TouchExplorationStateChangeListener u;
    public final w12 v;

    public y12(TextInputLayout textInputLayout, sk6 sk6Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new w12(this);
        x12 x12Var = new x12(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, qr6.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, qr6.text_input_end_icon);
        this.g = checkableImageButtonA2;
        this.h = new aj0(this, sk6Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.q = appCompatTextView;
        int i = yt6.TextInputLayout_errorIconTint;
        TypedArray typedArray = (TypedArray) sk6Var.c;
        if (typedArray.hasValue(i)) {
            this.d = ja1.q(getContext(), sk6Var, yt6.TextInputLayout_errorIconTint);
        }
        if (typedArray.hasValue(yt6.TextInputLayout_errorIconTintMode)) {
            this.e = o37.t(typedArray.getInt(yt6.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray.hasValue(yt6.TextInputLayout_errorIconDrawable)) {
            i(sk6Var.v(yt6.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(ft6.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(yt6.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(yt6.TextInputLayout_endIconTint)) {
                this.k = ja1.q(getContext(), sk6Var, yt6.TextInputLayout_endIconTint);
            }
            if (typedArray.hasValue(yt6.TextInputLayout_endIconTintMode)) {
                this.l = o37.t(typedArray.getInt(yt6.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray.hasValue(yt6.TextInputLayout_endIconMode)) {
            g(typedArray.getInt(yt6.TextInputLayout_endIconMode, 0));
            if (typedArray.hasValue(yt6.TextInputLayout_endIconContentDescription) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(yt6.TextInputLayout_endIconContentDescription))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(yt6.TextInputLayout_endIconCheckable, true));
        } else if (typedArray.hasValue(yt6.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(yt6.TextInputLayout_passwordToggleTint)) {
                this.k = ja1.q(getContext(), sk6Var, yt6.TextInputLayout_passwordToggleTint);
            }
            if (typedArray.hasValue(yt6.TextInputLayout_passwordToggleTintMode)) {
                this.l = o37.t(typedArray.getInt(yt6.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            g(typedArray.getBoolean(yt6.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(yt6.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(yt6.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(oq6.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(yt6.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeH = dt2.h(typedArray.getInt(yt6.TextInputLayout_endIconScaleType, -1));
            this.n = scaleTypeH;
            checkableImageButtonA2.setScaleType(scaleTypeH);
            checkableImageButtonA.setScaleType(scaleTypeH);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(qr6.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(yt6.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray.hasValue(yt6.TextInputLayout_suffixTextColor)) {
            appCompatTextView.setTextColor(sk6Var.t(yt6.TextInputLayout_suffixTextColor));
        }
        CharSequence text3 = typedArray.getText(yt6.TextInputLayout_suffixText);
        this.p = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.C0.add(x12Var);
        if (textInputLayout.e != null) {
            x12Var.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new mg(2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(is6.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ja1.z(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final z12 b() {
        z12 y81Var;
        int i = this.i;
        aj0 aj0Var = this.h;
        SparseArray sparseArray = (SparseArray) aj0Var.d;
        z12 z12Var = (z12) sparseArray.get(i);
        if (z12Var != null) {
            return z12Var;
        }
        y12 y12Var = (y12) aj0Var.e;
        if (i == -1) {
            y81Var = new y81(y12Var, 0);
        } else if (i == 0) {
            y81Var = new y81(y12Var, 1);
        } else if (i == 1) {
            y81Var = new r26(y12Var, aj0Var.c);
        } else if (i == 2) {
            y81Var = new at0(y12Var);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(rm7.n(i, "Invalid end icon mode: "));
            }
            y81Var = new mx1(y12Var);
        }
        sparseArray.append(i, y81Var);
        return y81Var;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        z12 z12VarB = b();
        boolean zJ = z12VarB.j();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.d) == z12VarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(z12VarB instanceof mx1) || (zIsActivated = checkableImageButton.isActivated()) == ((mx1) z12VarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            dt2.x(this.a, checkableImageButton, this.k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        z12 z12VarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.u = null;
        z12VarB.r();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        h(i != 0);
        z12 z12VarB2 = b();
        int iD = this.h.b;
        if (iD == 0) {
            iD = z12VarB2.d();
        }
        Drawable drawableV = iD != 0 ? rf0.v(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawableV);
        TextInputLayout textInputLayout = this.a;
        if (drawableV != null) {
            dt2.d(textInputLayout, checkableImageButton, this.k, this.l);
            dt2.x(textInputLayout, checkableImageButton, this.k);
        }
        int iC = z12VarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(z12VarB2.j());
        if (!z12VarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        z12VarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = z12VarB2.h();
        this.u = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.u);
        }
        View.OnClickListener onClickListenerF = z12VarB2.f();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        dt2.D(checkableImageButton, onLongClickListener);
        EditText editText = this.s;
        if (editText != null) {
            z12VarB2.l(editText);
            j(z12VarB2);
        }
        dt2.d(textInputLayout, checkableImageButton, this.k, this.l);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.g.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        dt2.d(this.a, checkableImageButton, this.d, this.e);
    }

    public final void j(z12 z12Var) {
        if (this.s == null) {
            return;
        }
        if (z12Var.e() != null) {
            this.s.setOnFocusChangeListener(z12Var.e());
        }
        if (z12Var.g() != null) {
            this.g.setOnFocusChangeListener(z12Var.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.p == null || this.r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.k.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.e == null) {
            return;
        }
        this.q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(oq6.material_input_text_to_prefix_suffix_padding), textInputLayout.e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.q;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.s();
    }
}
