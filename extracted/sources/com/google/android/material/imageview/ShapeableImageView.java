package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import defpackage.as7;
import defpackage.bs7;
import defpackage.bt7;
import defpackage.fk4;
import defpackage.gt7;
import defpackage.ja1;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.yt6;
import defpackage.zs4;

/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements bt7 {
    public static final int v = mt6.Widget_MaterialComponents_ShapeableImageView;
    public final zs4 d;
    public final RectF e;
    public final RectF f;
    public final Paint g;
    public final Paint h;
    public final Path i;
    public ColorStateList j;
    public fk4 k;
    public as7 l;
    public float m;
    public final Path n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.e;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        as7 as7Var = this.l;
        zs4 zs4Var = this.d;
        Path path = this.i;
        zs4Var.b(as7Var, null, 1.0f, rectF, null, path);
        Path path2 = this.n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.r;
    }

    public final int getContentPaddingEnd() {
        int i = this.t;
        return i != Integer.MIN_VALUE ? i : c() ? this.o : this.q;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (this.s != Integer.MIN_VALUE || this.t != Integer.MIN_VALUE) {
            if (c() && (i2 = this.t) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && (i = this.s) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.o;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (this.s != Integer.MIN_VALUE || this.t != Integer.MIN_VALUE) {
            if (c() && (i2 = this.s) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && (i = this.t) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.q;
    }

    public final int getContentPaddingStart() {
        int i = this.s;
        return i != Integer.MIN_VALUE ? i : c() ? this.q : this.o;
    }

    public int getContentPaddingTop() {
        return this.p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public as7 getShapeAppearanceModel() {
        return this.l;
    }

    public ColorStateList getStrokeColor() {
        return this.j;
    }

    public float getStrokeWidth() {
        return this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.n, this.h);
        if (this.j == null) {
            return;
        }
        float f = this.m;
        Paint paint = this.g;
        paint.setStrokeWidth(f);
        int colorForState = this.j.getColorForState(getDrawableState(), this.j.getDefaultColor());
        if (this.m <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.u && isLayoutDirectionResolved()) {
            this.u = true;
            if (!isPaddingRelative() && this.s == Integer.MIN_VALUE && this.t == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.o) + i, (super.getPaddingTop() - this.p) + i2, (super.getPaddingRight() - this.q) + i3, (super.getPaddingBottom() - this.r) + i4);
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.p) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.r) + i4);
        this.o = c() ? i3 : i;
        this.p = i2;
        if (!c()) {
            i = i3;
        }
        this.q = i;
        this.r = i4;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.bt7
    public void setShapeAppearanceModel(as7 as7Var) {
        this.l = as7Var;
        fk4 fk4Var = this.k;
        if (fk4Var != null) {
            fk4Var.setShapeAppearanceModel(as7Var);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.m != f) {
            this.m = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        int i2 = v;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.d = bs7.a;
        this.i = new Path();
        this.u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.e = new RectF();
        this.f = new RectF();
        this.n = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, yt6.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.j = ja1.r(context2, typedArrayObtainStyledAttributes, yt6.ShapeableImageView_strokeColor);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_contentPadding, 0);
        this.o = dimensionPixelSize;
        this.p = dimensionPixelSize;
        this.q = dimensionPixelSize;
        this.r = dimensionPixelSize;
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.l = as7.d(context2, attributeSet, i, i2).a();
        setOutlineProvider(new gt7(this));
    }
}
