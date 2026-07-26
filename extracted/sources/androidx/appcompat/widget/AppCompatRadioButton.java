package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import defpackage.im8;
import defpackage.km8;
import defpackage.ko;
import defpackage.lm8;
import defpackage.rf0;
import defpackage.rk8;
import defpackage.rn;
import defpackage.um;
import defpackage.xp6;
import defpackage.yb;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements km8, lm8 {
    public final um a;
    public final yb b;
    public final ko c;
    public rn d;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    private rn getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new rn(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        yb ybVar = this.b;
        if (ybVar != null) {
            ybVar.b();
        }
        ko koVar = this.c;
        if (koVar != null) {
            koVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        yb ybVar = this.b;
        if (ybVar != null) {
            return ybVar.k();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        yb ybVar = this.b;
        if (ybVar != null) {
            return ybVar.l();
        }
        return null;
    }

    @Override // defpackage.km8
    public ColorStateList getSupportButtonTintList() {
        um umVar = this.a;
        if (umVar != null) {
            return (ColorStateList) umVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        um umVar = this.a;
        if (umVar != null) {
            return (PorterDuff.Mode) umVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        yb ybVar = this.b;
        if (ybVar != null) {
            ybVar.p();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        yb ybVar = this.b;
        if (ybVar != null) {
            ybVar.q(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        um umVar = this.a;
        if (umVar != null) {
            if (umVar.e) {
                umVar.e = false;
            } else {
                umVar.e = true;
                umVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ko koVar = this.c;
        if (koVar != null) {
            koVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ko koVar = this.c;
        if (koVar != null) {
            koVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        yb ybVar = this.b;
        if (ybVar != null) {
            ybVar.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        yb ybVar = this.b;
        if (ybVar != null) {
            ybVar.y(mode);
        }
    }

    @Override // defpackage.km8
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        um umVar = this.a;
        if (umVar != null) {
            umVar.a = colorStateList;
            umVar.c = true;
            umVar.a();
        }
    }

    @Override // defpackage.km8
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        um umVar = this.a;
        if (umVar != null) {
            umVar.b = mode;
            umVar.d = true;
            umVar.a();
        }
    }

    @Override // defpackage.lm8
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ko koVar = this.c;
        koVar.k(colorStateList);
        koVar.b();
    }

    @Override // defpackage.lm8
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ko koVar = this.c;
        koVar.l(mode);
        koVar.b();
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.radioButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        im8.a(context);
        rk8.a(this, getContext());
        um umVar = new um(this);
        this.a = umVar;
        umVar.d(attributeSet, i);
        yb ybVar = new yb(this);
        this.b = ybVar;
        ybVar.n(attributeSet, i);
        ko koVar = new ko(this);
        this.c = koVar;
        koVar.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(rf0.v(getContext(), i));
    }
}
