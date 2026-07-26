package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import defpackage.ca9;
import defpackage.im8;
import defpackage.ko;
import defpackage.lm8;
import defpackage.rk8;
import defpackage.rn;
import defpackage.s17;
import defpackage.so;
import defpackage.xp6;
import defpackage.yb;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements lm8 {
    public final yb a;
    public final ko b;
    public rn c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private rn getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new rn(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.b();
        }
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (ca9.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ko koVar = this.b;
        if (koVar != null) {
            return Math.round(koVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ca9.c) {
            return super.getAutoSizeMinTextSize();
        }
        ko koVar = this.b;
        if (koVar != null) {
            return Math.round(koVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ca9.c) {
            return super.getAutoSizeStepGranularity();
        }
        ko koVar = this.b;
        if (koVar != null) {
            return Math.round(koVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ca9.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ko koVar = this.b;
        return koVar != null ? koVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (ca9.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ko koVar = this.b;
        if (koVar != null) {
            return koVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return s17.j(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        yb ybVar = this.a;
        if (ybVar != null) {
            return ybVar.k();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yb ybVar = this.a;
        if (ybVar != null) {
            return ybVar.l();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ko koVar = this.b;
        if (koVar == null || ca9.c) {
            return;
        }
        koVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ko koVar = this.b;
        if (koVar != null) {
            so soVar = koVar.i;
            if (ca9.c || !soVar.f()) {
                return;
            }
            soVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (ca9.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ko koVar = this.b;
        if (koVar != null) {
            koVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (ca9.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ko koVar = this.b;
        if (koVar != null) {
            koVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ca9.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ko koVar = this.b;
        if (koVar != null) {
            koVar.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.p();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.q(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(s17.l(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        ko koVar = this.b;
        if (koVar != null) {
            koVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        yb ybVar = this.a;
        if (ybVar != null) {
            ybVar.y(mode);
        }
    }

    @Override // defpackage.lm8
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ko koVar = this.b;
        koVar.k(colorStateList);
        koVar.b();
    }

    @Override // defpackage.lm8
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ko koVar = this.b;
        koVar.l(mode);
        koVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = ca9.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        ko koVar = this.b;
        if (koVar != null) {
            so soVar = koVar.i;
            if (z || soVar.f()) {
                return;
            }
            soVar.g(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        im8.a(context);
        rk8.a(this, getContext());
        yb ybVar = new yb(this);
        this.a = ybVar;
        ybVar.n(attributeSet, i);
        ko koVar = new ko(this);
        this.b = koVar;
        koVar.f(attributeSet, i);
        koVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
