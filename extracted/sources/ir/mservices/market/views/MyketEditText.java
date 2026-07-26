package ir.mservices.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.bu6;
import defpackage.d04;
import defpackage.iz2;
import defpackage.ke5;
import defpackage.kh2;
import defpackage.mb0;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.theme.ThemeMode;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class MyketEditText extends iz2 {
    public final boolean k;
    public Drawable l;
    public Drawable m;
    public Drawable n;
    public Drawable o;
    public d04 p;
    public boolean q;

    public MyketEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            b();
        }
        this.q = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.MyketEditText);
        this.k = typedArrayObtainStyledAttributes.getBoolean(bu6.MyketEditText_has_background, true);
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public final void c() {
        setTypeface((Typeface) kh2.b.a.b);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(2);
        }
        setInputType(getInputType() | 524288);
        addTextChangedListener(new mb0(5, this));
        if (this.k) {
            setBackgroundResource(yq6.edittext_dialog_style);
            getBackground().setColorFilter(sj8.b().w, PorterDuff.Mode.MULTIPLY);
        }
        setInputType(getInputType() | 176);
        setCursorDrawable(sj8.g == ThemeMode.b ? yq6.search_cursor_night : yq6.search_cursor);
        setHighlightColor(sj8.b().f);
    }

    public final void finalize() throws Throwable {
        this.l = null;
        this.o = null;
        this.m = null;
        this.n = null;
        super.finalize();
    }

    public Drawable getEditTextDrawable() {
        return this.p.f() ? this.l : this.m;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Drawable drawable = this.o;
            if (drawable != null && drawable.getBounds().contains(x, y)) {
                throw null;
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null && drawable2.getBounds().contains(x, y)) {
                throw null;
            }
            Drawable drawable3 = this.m;
            if (drawable3 != null) {
                Rect bounds = drawable3.getBounds();
                int i3 = (int) (((double) (getResources().getDisplayMetrics().density * 13.0f)) + 0.5d);
                if (bounds.contains(x, y)) {
                    i = x;
                    i2 = y;
                } else {
                    i = x - i3;
                    i2 = y - i3;
                    if (i <= 0) {
                        i = x;
                    }
                    if (i2 <= 0) {
                        i2 = y;
                    }
                    if (i < i2) {
                        i2 = i;
                    }
                }
                bounds.contains(i, i2);
            }
            Drawable drawable4 = this.l;
            if (drawable4 != null) {
                Rect bounds2 = drawable4.getBounds();
                int i4 = y - 13;
                int width = getWidth() - (x + 13);
                if (width <= 0) {
                    width += 13;
                }
                if (i4 > 0) {
                    y = i4;
                }
                bounds2.contains(width, y);
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            this.m = drawable;
        }
        if (drawable2 != null) {
            this.n = drawable2;
        }
        if (drawable3 != null) {
            this.l = drawable3;
        }
        if (drawable4 != null) {
            this.o = drawable4;
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCursorDrawable(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            setTextCursorDrawable(i);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public void setEditTextDrawable(Drawable drawable) {
        if (this.p.f()) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public MyketEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            b();
        }
        this.q = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.MyketEditText);
        this.k = typedArrayObtainStyledAttributes.getBoolean(bu6.MyketEditText_has_background, true);
        typedArrayObtainStyledAttributes.recycle();
        c();
    }

    public void setDrawableClickListener(ke5 ke5Var) {
    }
}
