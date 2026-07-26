package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.ci3;
import defpackage.eu6;
import defpackage.rf0;
import defpackage.v71;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {
    public final v71 d;
    public boolean e;
    public Drawable f;
    public Drawable g;
    public float h;
    public float i;
    public float j;
    public Path k;
    public ViewOutlineProvider l;
    public RectF m;
    public final Drawable[] n;
    public LayerDrawable o;
    public float p;
    public float q;
    public float r;
    public float s;

    public ImageFilterView(Context context) {
        super(context);
        this.d = new v71();
        this.e = true;
        this.f = null;
        this.g = null;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = Float.NaN;
        this.n = new Drawable[2];
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
    }

    private void setOverlay(boolean z) {
        this.e = z;
    }

    public final void c(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f = typedArrayObtainStyledAttributes.getDrawable(eu6.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ImageFilterView_crossfade) {
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == eu6.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == eu6.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.e));
                } else if (index == eu6.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.p));
                } else if (index == eu6.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.q));
                } else if (index == eu6.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.s));
                } else if (index == eu6.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.r));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.g = drawable;
            Drawable drawable2 = this.f;
            Drawable[] drawableArr = this.n;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.g = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.g = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.g = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.o = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.h * 255.0f));
            if (!this.e) {
                this.o.getDrawable(0).setAlpha((int) ((1.0f - this.h) * 255.0f));
            }
            super.setImageDrawable(this.o);
        }
    }

    public final void d() {
        if (Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r) && Float.isNaN(this.s)) {
            return;
        }
        float f = Float.isNaN(this.p) ? 0.0f : this.p;
        float f2 = Float.isNaN(this.q) ? 0.0f : this.q;
        float f3 = Float.isNaN(this.r) ? 1.0f : this.r;
        float f4 = Float.isNaN(this.s) ? 0.0f : this.s;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void f() {
        if (Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r) && Float.isNaN(this.s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    public float getBrightness() {
        return this.d.a;
    }

    public float getContrast() {
        return this.d.c;
    }

    public float getCrossfade() {
        return this.h;
    }

    public float getImagePanX() {
        return this.p;
    }

    public float getImagePanY() {
        return this.q;
    }

    public float getImageRotate() {
        return this.s;
    }

    public float getImageZoom() {
        return this.r;
    }

    public float getRound() {
        return this.j;
    }

    public float getRoundPercent() {
        return this.i;
    }

    public float getSaturation() {
        return this.d.b;
    }

    public float getWarmth() {
        return this.d.d;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        d();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f = drawableMutate;
        Drawable drawable2 = this.g;
        Drawable[] drawableArr = this.n;
        drawableArr[0] = drawable2;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.h);
    }

    public void setAltImageResource(int i) {
        Drawable drawableV = rf0.v(getContext(), i);
        this.f = drawableV;
        setAltImageDrawable(drawableV);
    }

    public void setBrightness(float f) {
        v71 v71Var = this.d;
        v71Var.a = f;
        v71Var.b(this);
    }

    public void setContrast(float f) {
        v71 v71Var = this.d;
        v71Var.c = f;
        v71Var.b(this);
    }

    public void setCrossfade(float f) {
        this.h = f;
        if (this.n != null) {
            if (!this.e) {
                this.o.getDrawable(0).setAlpha((int) ((1.0f - this.h) * 255.0f));
            }
            this.o.getDrawable(1).setAlpha((int) (this.h * 255.0f));
            super.setImageDrawable(this.o);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.g = drawableMutate;
        Drawable[] drawableArr = this.n;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.h);
    }

    public void setImagePanX(float f) {
        this.p = f;
        f();
    }

    public void setImagePanY(float f) {
        this.q = f;
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = rf0.v(getContext(), i).mutate();
        this.g = drawableMutate;
        Drawable[] drawableArr = this.n;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.o = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.h);
    }

    public void setImageRotate(float f) {
        this.s = f;
        f();
    }

    public void setImageZoom(float f) {
        this.r = f;
        f();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.j = f;
            float f2 = this.i;
            this.i = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.j != f;
        this.j = f;
        if (f != 0.0f) {
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.l == null) {
                ci3 ci3Var = new ci3(this, 1);
                this.l = ci3Var;
                setOutlineProvider(ci3Var);
            }
            setClipToOutline(true);
            this.m.set(0.0f, 0.0f, getWidth(), getHeight());
            this.k.reset();
            Path path = this.k;
            RectF rectF = this.m;
            float f3 = this.j;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.i != f;
        this.i = f;
        if (f != 0.0f) {
            if (this.k == null) {
                this.k = new Path();
            }
            if (this.m == null) {
                this.m = new RectF();
            }
            if (this.l == null) {
                ci3 ci3Var = new ci3(this, 0);
                this.l = ci3Var;
                setOutlineProvider(ci3Var);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.i) / 2.0f;
            this.m.set(0.0f, 0.0f, width, height);
            this.k.reset();
            this.k.addRoundRect(this.m, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        v71 v71Var = this.d;
        v71Var.b = f;
        v71Var.b(this);
    }

    public void setWarmth(float f) {
        v71 v71Var = this.d;
        v71Var.d = f;
        v71Var.b(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new v71();
        this.e = true;
        this.f = null;
        this.g = null;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = Float.NaN;
        this.n = new Drawable[2];
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        c(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new v71();
        this.e = true;
        this.f = null;
        this.g = null;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = Float.NaN;
        this.n = new Drawable[2];
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        c(context, attributeSet);
    }
}
