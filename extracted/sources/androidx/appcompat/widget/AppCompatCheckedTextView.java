package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import defpackage.aw1;
import defpackage.im8;
import defpackage.ko;
import defpackage.lm8;
import defpackage.lu6;
import defpackage.q69;
import defpackage.rf0;
import defpackage.rk8;
import defpackage.rn;
import defpackage.s17;
import defpackage.sk6;
import defpackage.um;
import defpackage.xp6;
import defpackage.y40;
import defpackage.yb;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements lm8 {
    public final um a;
    public final yb b;
    public final ko c;
    public rn d;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    private rn getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new rn(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.c;
        if (koVar != null) {
            koVar.b();
        }
        yb ybVar = this.b;
        if (ybVar != null) {
            ybVar.b();
        }
        um umVar = this.a;
        if (umVar != null) {
            umVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return s17.j(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        um umVar = this.a;
        if (umVar != null) {
            return (ColorStateList) umVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        y40.z(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        um umVar = this.a;
        if (umVar != null) {
            if (umVar.e) {
                umVar.e = false;
            } else {
                umVar.e = true;
                umVar.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(s17.l(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        um umVar = this.a;
        if (umVar != null) {
            umVar.a = colorStateList;
            umVar.c = true;
            umVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        um umVar = this.a;
        if (umVar != null) {
            umVar.b = mode;
            umVar.d = true;
            umVar.b();
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ko koVar = this.c;
        if (koVar != null) {
            koVar.g(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i);
        im8.a(context);
        rk8.a(this, getContext());
        ko koVar = new ko(this);
        this.c = koVar;
        koVar.f(attributeSet, i);
        koVar.b();
        yb ybVar = new yb(this);
        this.b = ybVar;
        ybVar.n(attributeSet, i);
        this.a = new um(this);
        sk6 sk6VarD = sk6.D(getContext(), attributeSet, lu6.CheckedTextView, i);
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        q69.p(this, getContext(), lu6.CheckedTextView, attributeSet, (TypedArray) sk6VarD.c, i);
        try {
            if (typedArray.hasValue(lu6.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(lu6.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(rf0.v(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(lu6.CheckedTextView_android_checkMark)) {
                        setCheckMarkDrawable(rf0.v(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(lu6.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(lu6.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(rf0.v(getContext(), resourceId));
            }
            if (typedArray.hasValue(lu6.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(sk6VarD.t(lu6.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(lu6.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(aw1.c(typedArray.getInt(lu6.CheckedTextView_checkMarkTintMode, -1), null));
            }
            sk6VarD.G();
            getEmojiTextViewHelper().b(attributeSet, i);
        } catch (Throwable th) {
            sk6VarD.G();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(rf0.v(getContext(), i));
    }
}
