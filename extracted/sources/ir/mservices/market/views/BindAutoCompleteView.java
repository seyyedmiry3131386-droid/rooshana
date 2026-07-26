package ir.mservices.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.bu6;
import defpackage.ca7;
import defpackage.dz2;
import defpackage.kh2;
import defpackage.mb0;
import defpackage.pb0;
import defpackage.pj9;
import defpackage.qb0;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.theme.ThemeMode;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class BindAutoCompleteView extends dz2 {
    public static final /* synthetic */ int u = 0;
    public qb0 o;
    public int p;
    public Drawable q;
    public Drawable r;
    public Drawable s;
    public Drawable t;

    public BindAutoCompleteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            d();
        }
        f(attributeSet);
    }

    public final void f(AttributeSet attributeSet) {
        setTypeface((Typeface) kh2.b.a.b);
        setHighlightColor(sj8.b().f);
        setDropDownBackgroundDrawable(new ColorDrawable(sj8.b().l));
        addTextChangedListener(new mb0(0, this));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bu6.BindHistoryAutoComplete);
        int i = typedArrayObtainStyledAttributes.getInt(bu6.BindHistoryAutoComplete_bindHistoryType, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (i != 1) {
            this.p = 0;
        } else {
            this.p = 1;
        }
        int i2 = this.p;
        pj9 pj9Var = new pj9(this);
        ca7 ca7Var = new ca7(10, this);
        qb0 qb0Var = this.o;
        if (i2 == 0) {
            qb0Var.r(pj9Var, ca7Var, this);
        } else {
            ArrayList arrayList = (ArrayList) qb0Var.b;
            pb0 pb0Var = new pb0(qb0Var, pj9Var, ca7Var, this, i2);
            pb0Var.b(new Void[0]);
            arrayList.add(pb0Var);
        }
        setThreshold(1);
        int i3 = sj8.g == ThemeMode.b ? yq6.search_cursor_night : yq6.search_cursor;
        if (Build.VERSION.SDK_INT >= 29) {
            setTextCursorDrawable(i3);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(i3));
        } catch (Exception unused) {
        }
    }

    public final void finalize() throws Throwable {
        this.q = null;
        this.t = null;
        this.r = null;
        this.s = null;
        super.finalize();
    }

    public int getHistoryType() {
        return this.p;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            this.r = drawable;
        }
        if (drawable2 != null) {
            this.s = drawable2;
        }
        if (drawable3 != null) {
            this.q = drawable3;
        }
        if (drawable4 != null) {
            this.t = drawable4;
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public BindAutoCompleteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            d();
        }
        f(attributeSet);
    }
}
