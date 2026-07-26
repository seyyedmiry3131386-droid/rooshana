package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.ca7;
import defpackage.ca9;
import defpackage.co;
import defpackage.do3;
import defpackage.dv8;
import defpackage.h27;
import defpackage.i3;
import defpackage.im8;
import defpackage.iz1;
import defpackage.ko;
import defpackage.lm8;
import defpackage.lo;
import defpackage.mo;
import defpackage.no;
import defpackage.rf0;
import defpackage.rk8;
import defpackage.rn;
import defpackage.s17;
import defpackage.so;
import defpackage.ui6;
import defpackage.vi6;
import defpackage.y40;
import defpackage.yb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements lm8 {
    public final yb a;
    public final ko b;
    public final do3 c;
    public rn d;
    public boolean e;
    public ca7 f;
    public Future g;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private rn getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new rn(this);
        }
        return this.d;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public lo getSuperCaller() {
        if (this.f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f = new no(this);
            } else if (i >= 28) {
                this.f = new mo(this);
            } else if (i >= 26) {
                this.f = new ca7(6, this);
            }
        }
        return this.f;
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
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                s17.b(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
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

    public ui6 getTextMetricsParamsCompat() {
        return s17.b(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            iz1.c(editorInfo, getText());
        }
        y40.z(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ko koVar = this.b;
        if (koVar == null || ca9.c) {
            return;
        }
        koVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                s17.b(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            s17.g(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            s17.h(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        s17.i(this, i);
    }

    public void setPrecomputedText(vi6 vi6Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        s17.b(this);
        throw null;
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

    public void setTextFuture(Future<vi6> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(ui6 ui6Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = ui6Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(ui6Var.a);
        setBreakStrategy(ui6Var.c);
        setHyphenationFrequency(ui6Var.d);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            h27 h27Var = dv8.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().e(i, f);
        } else if (i2 >= 34) {
            i3.z(this, i, f);
        } else {
            s17.i(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        im8.a(context);
        this.e = false;
        this.f = null;
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
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? rf0.v(context, i) : null, i2 != 0 ? rf0.v(context, i2) : null, i3 != 0 ? rf0.v(context, i3) : null, i4 != 0 ? rf0.v(context, i4) : null);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? rf0.v(context, i) : null, i2 != 0 ? rf0.v(context, i2) : null, i3 != 0 ? rf0.v(context, i3) : null, i4 != 0 ? rf0.v(context, i4) : null);
        ko koVar = this.b;
        if (koVar != null) {
            koVar.b();
        }
    }
}
