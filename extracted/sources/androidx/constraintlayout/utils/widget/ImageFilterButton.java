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
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.bi3;
import defpackage.eu6;
import defpackage.rf0;
import defpackage.v71;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {
    public final v71 d;
    public float e;
    public float f;
    public float g;
    public Path h;
    public ViewOutlineProvider i;
    public RectF j;
    public final Drawable[] k;
    public LayerDrawable l;
    public boolean m;
    public Drawable n;
    public Drawable o;
    public float p;
    public float q;
    public float r;
    public float s;

    public ImageFilterButton(Context context) {
        super(context);
        this.d = new v71();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        a(context, null);
    }

    private void setOverlay(boolean z) {
        this.m = z;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.n = typedArrayObtainStyledAttributes.getDrawable(eu6.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ImageFilterView_crossfade) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == eu6.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == eu6.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == eu6.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.m));
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
            this.o = drawable;
            Drawable drawable2 = this.n;
            Drawable[] drawableArr = this.k;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.o = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.o = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.o = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.n.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.l = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            if (!this.m) {
                this.l.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            super.setImageDrawable(this.l);
        }
    }

    public final void b() {
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

    public final void c() {
        if (Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r) && Float.isNaN(this.s)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    public float getContrast() {
        return this.d.c;
    }

    public float getCrossfade() {
        return this.e;
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
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
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
        b();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = rf0.v(getContext(), i).mutate();
        this.n = drawableMutate;
        Drawable drawable = this.o;
        Drawable[] drawableArr = this.k;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
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
        this.e = f;
        if (this.k != null) {
            if (!this.m) {
                this.l.getDrawable(0).setAlpha((int) ((1.0f - this.e) * 255.0f));
            }
            this.l.getDrawable(1).setAlpha((int) (this.e * 255.0f));
            super.setImageDrawable(this.l);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.n == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        Drawable[] drawableArr = this.k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.n;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImagePanX(float f) {
        this.p = f;
        c();
    }

    public void setImagePanY(float f) {
        this.q = f;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.n == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = rf0.v(getContext(), i).mutate();
        this.o = drawableMutate;
        Drawable[] drawableArr = this.k;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.n;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.l = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.e);
    }

    public void setImageRotate(float f) {
        this.s = f;
        c();
    }

    public void setImageZoom(float f) {
        this.r = f;
        c();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.g = f;
            float f2 = this.f;
            this.f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.g != f;
        this.g = f;
        if (f != 0.0f) {
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.j == null) {
                this.j = new RectF();
            }
            if (this.i == null) {
                bi3 bi3Var = new bi3(this, 1);
                this.i = bi3Var;
                setOutlineProvider(bi3Var);
            }
            setClipToOutline(true);
            this.j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.h.reset();
            Path path = this.h;
            RectF rectF = this.j;
            float f3 = this.g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f != f;
        this.f = f;
        if (f != 0.0f) {
            if (this.h == null) {
                this.h = new Path();
            }
            if (this.j == null) {
                this.j = new RectF();
            }
            if (this.i == null) {
                bi3 bi3Var = new bi3(this, 0);
                this.i = bi3Var;
                setOutlineProvider(bi3Var);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f) / 2.0f;
            this.j.set(0.0f, 0.0f, width, height);
            this.h.reset();
            this.h.addRoundRect(this.j, fMin, fMin, Path.Direction.CW);
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

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new v71();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        a(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new v71();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        a(context, attributeSet);
    }
}
