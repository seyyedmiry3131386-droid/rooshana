package ir.mservices.market.version2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bu6;
import defpackage.eq5;
import defpackage.kh2;
import defpackage.kz2;
import defpackage.ot5;
import defpackage.wp6;

/* JADX INFO: loaded from: classes3.dex */
public class NumberProgressBar extends kz2 {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public String k;
    public String l;
    public float m;
    public float n;
    public float o;
    public String p;
    public Paint q;
    public Paint r;
    public Paint s;
    public final RectF t;
    public final RectF u;
    public final float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public String z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ProgressTextVisibility {
        public static final ProgressTextVisibility a;
        public static final ProgressTextVisibility b;
        public static final /* synthetic */ ProgressTextVisibility[] c;

        static {
            ProgressTextVisibility progressTextVisibility = new ProgressTextVisibility("Visible", 0);
            a = progressTextVisibility;
            ProgressTextVisibility progressTextVisibility2 = new ProgressTextVisibility("Invisible", 1);
            b = progressTextVisibility2;
            c = new ProgressTextVisibility[]{progressTextVisibility, progressTextVisibility2};
        }

        public static ProgressTextVisibility valueOf(String str) {
            return (ProgressTextVisibility) Enum.valueOf(ProgressTextVisibility.class, str);
        }

        public static ProgressTextVisibility[] values() {
            return (ProgressTextVisibility[]) c.clone();
        }
    }

    public NumberProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((eq5) e()).getClass();
        }
        this.c = 100;
        this.d = 0;
        this.k = "";
        this.l = "";
        int iRgb = Color.rgb(66, 145, 241);
        int iRgb2 = Color.rgb(66, 145, 241);
        int iRgb3 = Color.rgb(204, 204, 204);
        this.t = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.u = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.w = true;
        this.x = true;
        this.y = true;
        float f = (1.5f * getResources().getDisplayMetrics().density) + 0.5f;
        float f2 = (1.0f * getResources().getDisplayMetrics().density) + 0.5f;
        float f3 = 10.0f * getResources().getDisplayMetrics().scaledDensity;
        float f4 = (3.0f * getResources().getDisplayMetrics().density) + 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bu6.NumberProgressBar, i, 0);
        this.e = typedArrayObtainStyledAttributes.getColor(bu6.NumberProgressBar_progress_reached_color, iRgb2);
        this.f = typedArrayObtainStyledAttributes.getColor(bu6.NumberProgressBar_progress_unreached_color, iRgb3);
        this.g = typedArrayObtainStyledAttributes.getColor(bu6.NumberProgressBar_progress_text_color, iRgb);
        this.h = typedArrayObtainStyledAttributes.getDimension(bu6.NumberProgressBar_progress_text_size, f3);
        this.i = typedArrayObtainStyledAttributes.getDimension(bu6.NumberProgressBar_progress_reached_bar_height, f);
        this.j = typedArrayObtainStyledAttributes.getDimension(bu6.NumberProgressBar_progress_unreached_bar_height, f2);
        this.v = typedArrayObtainStyledAttributes.getDimension(bu6.NumberProgressBar_progress_text_offset, f4);
        if (typedArrayObtainStyledAttributes.getInt(bu6.NumberProgressBar_progress_text_visibility, 0) != 0) {
            this.y = false;
        }
        setProgress(typedArrayObtainStyledAttributes.getInt(bu6.NumberProgressBar_progress_current, 0));
        setMax(typedArrayObtainStyledAttributes.getInt(bu6.NumberProgressBar_progress_max, 100));
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    private String getExactValue() {
        return this.z;
    }

    public final void a() {
        Paint paint = new Paint(1);
        this.q = paint;
        paint.setColor(this.e);
        Paint paint2 = new Paint(1);
        this.r = paint2;
        paint2.setColor(this.f);
        Paint paint3 = new Paint(1);
        this.s = paint3;
        paint3.setTypeface((Typeface) kh2.b.b.b);
        this.s.setColor(this.g);
        this.s.setTextSize(this.h);
    }

    public final int b(int i, boolean z) {
        int paddingTop;
        int paddingBottom;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (z) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i2 = paddingBottom + paddingTop;
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinimumWidth = (z ? getSuggestedMinimumWidth() : getSuggestedMinimumHeight()) + i2;
        return mode == Integer.MIN_VALUE ? z ? Math.max(suggestedMinimumWidth, size) : Math.min(suggestedMinimumWidth, size) : suggestedMinimumWidth;
    }

    public int getMax() {
        return this.c;
    }

    public String getPrefix() {
        return this.l;
    }

    public int getProgress() {
        return this.d;
    }

    public float getProgressTextSize() {
        return this.h;
    }

    public boolean getProgressTextVisibility() {
        return this.y;
    }

    public int getReachedBarColor() {
        return this.e;
    }

    public float getReachedBarHeight() {
        return this.i;
    }

    public String getSuffix() {
        return this.k;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max((int) this.h, Math.max((int) this.i, (int) this.j));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) this.h;
    }

    public int getTextColor() {
        return this.g;
    }

    public int getUnreachedBarColor() {
        return this.f;
    }

    public float getUnreachedBarHeight() {
        return this.j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = this.y;
        RectF rectF = this.u;
        RectF rectF2 = this.t;
        if (z) {
            this.p = getExactValue();
            String str = this.l + this.p + this.k;
            this.p = str;
            this.m = this.s.measureText(str);
            int progress = getProgress();
            float f = this.v;
            if (progress == 0) {
                this.x = false;
                this.n = getPaddingLeft();
            } else {
                this.x = true;
                rectF.left = getPaddingLeft();
                rectF.top = (getHeight() / 2.0f) - (this.i / 2.0f);
                rectF.right = (((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (getMax() * 1.0f)) * getProgress()) - f) + getPaddingLeft();
                rectF.bottom = (this.i / 2.0f) + (getHeight() / 2.0f);
                this.n = rectF.right + f;
            }
            this.o = (int) ((getHeight() / 2.0f) - ((this.s.ascent() + this.s.descent()) / 2.0f));
            if (this.n + this.m >= getWidth() - getPaddingRight()) {
                float width = (getWidth() - getPaddingRight()) - this.m;
                this.n = width;
                rectF.right = width - f;
            }
            float f2 = this.n + this.m + f;
            if (f2 >= getWidth() - getPaddingRight()) {
                this.w = false;
            } else {
                this.w = true;
                rectF2.left = f2;
                rectF2.right = getWidth() - getPaddingRight();
                rectF2.top = ((-this.j) / 2.0f) + (getHeight() / 2.0f);
                rectF2.bottom = (this.j / 2.0f) + (getHeight() / 2.0f);
            }
        } else {
            rectF.left = getPaddingLeft();
            rectF.top = (getHeight() / 2.0f) - (this.i / 2.0f);
            rectF.right = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) / (getMax() * 1.0f)) * getProgress()) + getPaddingLeft();
            rectF.bottom = (this.i / 2.0f) + (getHeight() / 2.0f);
            rectF2.left = rectF.right;
            rectF2.right = getWidth() - getPaddingRight();
            rectF2.top = ((-this.j) / 2.0f) + (getHeight() / 2.0f);
            rectF2.bottom = (this.j / 2.0f) + (getHeight() / 2.0f);
        }
        if (this.x) {
            canvas.drawRect(rectF, this.q);
        }
        if (this.w) {
            canvas.drawRect(rectF2, this.r);
        }
        if (this.y) {
            canvas.drawText(this.p, this.n, this.o, this.s);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(b(i, true), b(i2, false));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.g = bundle.getInt("text_color");
        this.h = bundle.getFloat("text_size");
        this.i = bundle.getFloat("reached_bar_height");
        this.j = bundle.getFloat("unreached_bar_height");
        this.e = bundle.getInt("reached_bar_color");
        this.f = bundle.getInt("unreached_bar_color");
        a();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt("progress"));
        setPrefix(bundle.getString("prefix"));
        setSuffix(bundle.getString("suffix"));
        setProgressTextVisibility(bundle.getBoolean("text_visibility") ? ProgressTextVisibility.a : ProgressTextVisibility.b);
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getProgressTextSize());
        bundle.putFloat("reached_bar_height", getReachedBarHeight());
        bundle.putFloat("unreached_bar_height", getUnreachedBarHeight());
        bundle.putInt("reached_bar_color", getReachedBarColor());
        bundle.putInt("unreached_bar_color", getUnreachedBarColor());
        bundle.putInt("max", getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString("suffix", getSuffix());
        bundle.putString("prefix", getPrefix());
        bundle.putBoolean("text_visibility", getProgressTextVisibility());
        return bundle;
    }

    public void setExactValue(String str) {
        this.z = str;
    }

    public void setMax(int i) {
        if (i > 0) {
            this.c = i;
            invalidate();
        }
    }

    public void setPrefix(String str) {
        if (str == null) {
            this.l = "";
        } else {
            this.l = str;
        }
    }

    public void setProgress(int i) {
        if (i > getMax() || i < 0) {
            return;
        }
        this.d = i;
        invalidate();
    }

    public void setProgressTextColor(int i) {
        this.g = i;
        this.s.setColor(i);
        invalidate();
    }

    public void setProgressTextSize(float f) {
        this.h = f;
        this.s.setTextSize(f);
        invalidate();
    }

    public void setProgressTextVisibility(ProgressTextVisibility progressTextVisibility) {
        this.y = progressTextVisibility == ProgressTextVisibility.a;
        invalidate();
    }

    public void setReachedBarColor(int i) {
        this.e = i;
        this.q.setColor(i);
        invalidate();
    }

    public void setReachedBarHeight(float f) {
        this.i = f;
    }

    public void setSuffix(String str) {
        if (str == null) {
            this.k = "";
        } else {
            this.k = str;
        }
    }

    public void setUnreachedBarColor(int i) {
        this.f = i;
        this.r.setColor(i);
        invalidate();
    }

    public void setUnreachedBarHeight(float f) {
        this.j = f;
    }

    public void setOnProgressBarListener(ot5 ot5Var) {
    }

    public NumberProgressBar(Context context) {
        this(context, null);
    }

    public NumberProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, wp6.numberProgressBarStyle);
    }
}
