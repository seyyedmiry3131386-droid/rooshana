package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import defpackage.ao3;
import defpackage.b41;
import defpackage.c41;
import defpackage.co;
import defpackage.d41;
import defpackage.do3;
import defpackage.f41;
import defpackage.im8;
import defpackage.iz1;
import defpackage.ko;
import defpackage.lm8;
import defpackage.mj8;
import defpackage.pt5;
import defpackage.q69;
import defpackage.qn;
import defpackage.qq4;
import defpackage.rk8;
import defpackage.s17;
import defpackage.sn;
import defpackage.v4;
import defpackage.xp6;
import defpackage.y40;
import defpackage.yb;
import defpackage.zn3;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements pt5, lm8 {
    public final yb a;
    public final ko b;
    public final do3 c;
    public final mj8 d;
    public final qq4 e;
    public qn f;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private qn getSuperCaller() {
        if (this.f == null) {
            this.f = new qn(this);
        }
        return this.f;
    }

    @Override // defpackage.pt5
    public final f41 a(f41 f41Var) {
        this.d.getClass();
        return mj8.a(this, f41Var);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        do3 do3Var;
        if (Build.VERSION.SDK_INT >= 28 || (do3Var = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) do3Var.b;
        return textClassifier == null ? co.a((TextView) do3Var.a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrH;
        InputConnection ao3Var;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            iz1.c(editorInfo, getText());
        }
        y40.z(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrH = q69.h(this)) != null) {
            iz1.b(editorInfo, strArrH);
            v4 v4Var = new v4(29, this);
            if (i >= 25) {
                ao3Var = new zn3(inputConnectionOnCreateInputConnection, v4Var);
            } else if (iz1.a(editorInfo).length != 0) {
                ao3Var = new ao3(inputConnectionOnCreateInputConnection, v4Var);
            }
            inputConnectionOnCreateInputConnection = ao3Var;
        }
        return this.e.w(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity2;
        int i = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && q69.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity2 = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity2 = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity2 == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = sn.a(dragEvent, this, activity2);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        c41 b41Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || q69.h(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                b41Var = new b41(primaryClip, 1);
            } else {
                d41 d41Var = new d41();
                d41Var.b = primaryClip;
                d41Var.c = 1;
                b41Var = d41Var;
            }
            b41Var.b(i == 16908322 ? 0 : 1);
            q69.m(this, b41Var.build());
        }
        return true;
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(s17.l(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.F(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.t(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        do3 do3Var;
        if (Build.VERSION.SDK_INT >= 28 || (do3Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            do3Var.b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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
        do3 do3Var = new do3();
        do3Var.a = this;
        this.c = do3Var;
        this.d = new mj8();
        qq4 qq4Var = new qq4(this, 7);
        this.e = qq4Var;
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
