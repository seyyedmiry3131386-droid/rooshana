package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import defpackage.im8;
import defpackage.ko;
import defpackage.lm8;
import defpackage.qq4;
import defpackage.rf0;
import defpackage.rk8;
import defpackage.sk6;
import defpackage.xp6;
import defpackage.y40;
import defpackage.yb;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements lm8 {
    public static final int[] d = {R.attr.popupBackground};
    public final yb a;
    public final ko b;
    public final qq4 c;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        y40.z(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.c.w(inputConnectionOnCreateInputConnection, editorInfo);
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(rf0.v(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.F(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.t(keyListener));
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

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        im8.a(context);
        rk8.a(this, getContext());
        sk6 sk6VarD = sk6.D(getContext(), attributeSet, d, i);
        if (((TypedArray) sk6VarD.c).hasValue(0)) {
            setDropDownBackgroundDrawable(sk6VarD.v(0));
        }
        sk6VarD.G();
        yb ybVar = new yb(this);
        this.a = ybVar;
        ybVar.n(attributeSet, i);
        ko koVar = new ko(this);
        this.b = koVar;
        koVar.f(attributeSet, i);
        koVar.b();
        qq4 qq4Var = new qq4(this, 7);
        this.c = qq4Var;
        qq4Var.v(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerT = qq4Var.t(keyListener);
        if (keyListenerT == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerT);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
