package com.jsibbold.zoomage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.ch9;
import defpackage.dh9;
import defpackage.jf0;
import defpackage.ur0;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes3.dex */
public class ZoomageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener {
    public int A;
    public ScaleGestureDetector B;
    public ValueAnimator C;
    public GestureDetector D;
    public boolean E;
    public boolean F;
    public final jf0 G;
    public ImageView.ScaleType d;
    public final Matrix e;
    public Matrix f;
    public final float[] g;
    public float[] h;
    public float i;
    public float j;
    public float k;
    public float l;
    public final RectF m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public float t;
    public int u;
    public final PointF v;
    public float w;
    public float x;
    public float y;
    public int z;

    public ZoomageView(Context context) {
        super(context);
        this.e = new Matrix();
        this.f = new Matrix();
        this.g = new float[9];
        this.h = null;
        this.i = 0.6f;
        this.j = 8.0f;
        this.k = 0.6f;
        this.l = 8.0f;
        this.m = new RectF();
        this.v = new PointF(0.0f, 0.0f);
        this.w = 1.0f;
        this.x = 1.0f;
        this.y = 1.0f;
        this.z = 1;
        this.A = 0;
        this.E = false;
        this.F = false;
        this.G = new jf0(this, 1);
        g(context, null);
    }

    private float getCurrentDisplayedHeight() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicHeight() * this.g[4];
        }
        return 0.0f;
    }

    private float getCurrentDisplayedWidth() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicWidth() * this.g[0];
        }
        return 0.0f;
    }

    public final void c(int i, float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.g[i], f);
        valueAnimatorOfFloat.addUpdateListener(new dh9(this, i));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
    }

    public final void d(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix(getImageMatrix());
        float[] fArr2 = this.g;
        matrix2.getValues(fArr2);
        float f = fArr[0] - fArr2[0];
        float f2 = fArr[4] - fArr2[4];
        float f3 = fArr[2] - fArr2[2];
        float f4 = fArr[5] - fArr2[5];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ch9(this, matrix2, f3, f4, f, f2));
        this.C.addListener(new ur0(this, matrix, 2));
        this.C.setDuration(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        this.C.start();
    }

    public final void f() {
        if (this.s) {
            float currentDisplayedWidth = getCurrentDisplayedWidth();
            float width = getWidth();
            RectF rectF = this.m;
            if (currentDisplayedWidth > width) {
                if (rectF.left > 0.0f) {
                    c(2, 0.0f);
                } else if (rectF.right < getWidth()) {
                    c(2, (rectF.left + getWidth()) - rectF.right);
                }
            } else if (rectF.left < 0.0f) {
                c(2, 0.0f);
            } else if (rectF.right > getWidth()) {
                c(2, (rectF.left + getWidth()) - rectF.right);
            }
            if (getCurrentDisplayedHeight() > getHeight()) {
                if (rectF.top > 0.0f) {
                    c(5, 0.0f);
                    return;
                } else {
                    if (rectF.bottom < getHeight()) {
                        c(5, (rectF.top + getHeight()) - rectF.bottom);
                        return;
                    }
                    return;
                }
            }
            if (rectF.top < 0.0f) {
                c(5, 0.0f);
            } else if (rectF.bottom > getHeight()) {
                c(5, (rectF.top + getHeight()) - rectF.bottom);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0081 A[PHI: r0
      0x0081: PHI (r0v6 int) = (r0v5 int), (r0v7 int), (r0v8 int) binds: [B:3:0x0078, B:5:0x007b, B:7:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            android.view.ScaleGestureDetector r0 = new android.view.ScaleGestureDetector
            r0.<init>(r4, r3)
            r3.B = r0
            android.view.GestureDetector r0 = new android.view.GestureDetector
            jf0 r1 = r3.G
            r0.<init>(r4, r1)
            r3.D = r0
            android.view.ScaleGestureDetector r0 = r3.B
            r1 = 0
            r0.setQuickScaleEnabled(r1)
            android.widget.ImageView$ScaleType r0 = r3.getScaleType()
            r3.d = r0
            int[] r0 = defpackage.au6.ZoomageView
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            int r5 = defpackage.au6.ZoomageView_zoomage_zoomable
            r0 = 1
            boolean r5 = r4.getBoolean(r5, r0)
            r3.o = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_translatable
            boolean r5 = r4.getBoolean(r5, r0)
            r3.n = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_animateOnReset
            boolean r5 = r4.getBoolean(r5, r0)
            r3.r = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_autoCenter
            boolean r5 = r4.getBoolean(r5, r0)
            r3.s = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_restrictBounds
            boolean r5 = r4.getBoolean(r5, r1)
            r3.q = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_doubleTapToZoom
            boolean r5 = r4.getBoolean(r5, r0)
            r3.p = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_minScale
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r5 = r4.getFloat(r5, r2)
            r3.i = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_maxScale
            r2 = 1090519040(0x41000000, float:8.0)
            float r5 = r4.getFloat(r5, r2)
            r3.j = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_doubleTapToZoomScaleFactor
            r2 = 1077936128(0x40400000, float:3.0)
            float r5 = r4.getFloat(r5, r2)
            r3.t = r5
            int r5 = defpackage.au6.ZoomageView_zoomage_autoResetMode
            int r5 = r4.getInt(r5, r1)
            if (r5 == r0) goto L81
            r0 = 2
            if (r5 == r0) goto L81
            r0 = 3
            if (r5 == r0) goto L81
            goto L82
        L81:
            r1 = r0
        L82:
            r3.u = r1
            r3.i()
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jsibbold.zoomage.ZoomageView.g(android.content.Context, android.util.AttributeSet):void");
    }

    public boolean getAnimateOnReset() {
        return this.r;
    }

    public boolean getAutoCenter() {
        return this.s;
    }

    public int getAutoResetMode() {
        return this.u;
    }

    public float getCurrentScaleFactor() {
        return this.y;
    }

    public boolean getDoubleTapToZoom() {
        return this.p;
    }

    public float getDoubleTapToZoomScaleFactor() {
        return this.t;
    }

    public boolean getRestrictBounds() {
        return this.q;
    }

    public final void h() {
        if (this.r) {
            d(this.f);
        } else {
            setImageMatrix(this.f);
        }
    }

    public final void i() {
        float f = this.i;
        float f2 = this.j;
        if (f >= f2) {
            throw new IllegalStateException("minScale must be less than maxScale");
        }
        if (f < 0.0f) {
            throw new IllegalStateException("minScale must be greater than 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalStateException("maxScale must be greater than 0");
        }
        if (this.t > f2) {
            this.t = f2;
        }
        if (this.t < f) {
            this.t = f;
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.w;
        float f = this.g[0];
        float f2 = scaleFactor / f;
        this.x = f2;
        float f3 = f2 * f;
        float f4 = this.k;
        if (f3 < f4) {
            this.x = f4 / f;
        } else {
            float f5 = this.l;
            if (f3 > f5) {
                this.x = f5 / f;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.w = this.g[0];
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.x = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        char c;
        ValueAnimator valueAnimator;
        float f;
        float height;
        float f2;
        float width;
        float f3;
        if (isClickable() || !isEnabled() || (!this.o && !this.n)) {
            return super.onTouchEvent(motionEvent);
        }
        ImageView.ScaleType scaleType = getScaleType();
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType != scaleType2) {
            super.setScaleType(scaleType2);
        }
        if (this.h == null) {
            this.h = new float[9];
            Matrix matrix = new Matrix(getImageMatrix());
            this.f = matrix;
            matrix.getValues(this.h);
            float f4 = this.i;
            float f5 = this.h[0];
            this.k = f4 * f5;
            this.l = this.j * f5;
        }
        this.A = motionEvent.getPointerCount();
        Matrix imageMatrix = getImageMatrix();
        Matrix matrix2 = this.e;
        matrix2.set(imageMatrix);
        float[] fArr = this.g;
        matrix2.getValues(fArr);
        Drawable drawable = getDrawable();
        RectF rectF = this.m;
        if (drawable != null) {
            rectF.set(fArr[2], fArr[5], (getDrawable().getIntrinsicWidth() * fArr[0]) + fArr[2], (getDrawable().getIntrinsicHeight() * fArr[4]) + fArr[5]);
        }
        this.B.onTouchEvent(motionEvent);
        this.D.onTouchEvent(motionEvent);
        if (this.p && this.E) {
            this.E = false;
            this.F = false;
            if (fArr[0] != this.h[0]) {
                h();
                return true;
            }
            Matrix matrix3 = new Matrix(matrix2);
            float f6 = this.t;
            matrix3.postScale(f6, f6, this.B.getFocusX(), this.B.getFocusY());
            d(matrix3);
            return true;
        }
        if (this.F) {
            c = 0;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            PointF pointF = this.v;
            if (actionMasked == 0 || this.A != this.z) {
                c = 0;
                pointF.set(this.B.getFocusX(), this.B.getFocusY());
            } else if (motionEvent.getActionMasked() == 2) {
                float focusX = this.B.getFocusX();
                float focusY = this.B.getFocusY();
                if (!this.n || this.y <= 1.0f) {
                    c = 0;
                } else {
                    float width2 = focusX - pointF.x;
                    if (this.q) {
                        if (getCurrentDisplayedWidth() >= getWidth()) {
                            float f7 = rectF.left;
                            if (f7 <= 0.0f && f7 + width2 > 0.0f && !this.B.isInProgress()) {
                                width2 = -rectF.left;
                            } else if (rectF.right >= getWidth() && rectF.right + width2 < getWidth() && !this.B.isInProgress()) {
                                width = getWidth();
                                f3 = rectF.right;
                                width2 = width - f3;
                            }
                        } else if (!this.B.isInProgress()) {
                            float f8 = rectF.left;
                            if (f8 >= 0.0f && f8 + width2 < 0.0f) {
                                width2 = -f8;
                            } else if (rectF.right <= getWidth() && rectF.right + width2 > getWidth()) {
                                width = getWidth();
                                f3 = rectF.right;
                                width2 = width - f3;
                            }
                        }
                    }
                    float f9 = rectF.right;
                    if (f9 + width2 < 0.0f) {
                        width2 = -f9;
                    } else if (rectF.left + width2 > getWidth()) {
                        width2 = getWidth() - rectF.left;
                    }
                    float height2 = focusY - pointF.y;
                    if (this.q) {
                        c = 0;
                        if (getCurrentDisplayedHeight() >= getHeight()) {
                            float f10 = rectF.top;
                            if (f10 <= 0.0f && f10 + height2 > 0.0f && !this.B.isInProgress()) {
                                f = rectF.top;
                                height2 = -f;
                            } else if (rectF.bottom >= getHeight() && rectF.bottom + height2 < getHeight() && !this.B.isInProgress()) {
                                height = getHeight();
                                f2 = rectF.bottom;
                                height2 = height - f2;
                            }
                        } else if (!this.B.isInProgress()) {
                            f = rectF.top;
                            if (f >= 0.0f && f + height2 < 0.0f) {
                                height2 = -f;
                            } else if (rectF.bottom <= getHeight() && rectF.bottom + height2 > getHeight()) {
                                height = getHeight();
                                f2 = rectF.bottom;
                                height2 = height - f2;
                            }
                        }
                    } else {
                        c = 0;
                    }
                    float f11 = rectF.bottom;
                    if (f11 + height2 < 0.0f) {
                        height2 = -f11;
                    } else if (rectF.top + height2 > getHeight()) {
                        height2 = getHeight() - rectF.top;
                    }
                    matrix2.postTranslate(width2, height2);
                }
                if (this.o) {
                    float f12 = this.x;
                    matrix2.postScale(f12, f12, focusX, focusY);
                    this.y = fArr[c] / this.h[c];
                }
                setImageMatrix(matrix2);
                pointF.set(focusX, focusY);
            } else {
                c = 0;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.x = 1.0f;
                int i = this.u;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            h();
                        } else if (i == 3) {
                            f();
                        }
                    } else if (fArr[c] >= this.h[c]) {
                        h();
                    } else {
                        f();
                    }
                } else if (fArr[c] <= this.h[c]) {
                    h();
                } else {
                    f();
                }
            }
        }
        getParent().requestDisallowInterceptTouchEvent((this.A > 1 || this.y > 1.0f || ((valueAnimator = this.C) != null && valueAnimator.isRunning())) ? 1 : c);
        this.z = this.A;
        return true;
    }

    public void setAnimateOnReset(boolean z) {
        this.r = z;
    }

    public void setAutoCenter(boolean z) {
        this.s = z;
    }

    public void setAutoResetMode(int i) {
        this.u = i;
    }

    public void setDoubleTapToZoom(boolean z) {
        this.p = z;
    }

    public void setDoubleTapToZoomScaleFactor(float f) {
        this.t = f;
        i();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        setScaleType(this.d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setScaleType(this.d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        setScaleType(this.d);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.d);
    }

    public void setRestrictBounds(boolean z) {
        this.q = z;
    }

    public void setScaleRange(float f, float f2) {
        this.i = f;
        this.j = f2;
        this.h = null;
        i();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.d = scaleType;
            this.h = null;
        }
    }

    public void setTranslatable(boolean z) {
        this.n = z;
    }

    public void setZoomable(boolean z) {
        this.o = z;
    }

    public ZoomageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Matrix();
        this.f = new Matrix();
        this.g = new float[9];
        this.h = null;
        this.i = 0.6f;
        this.j = 8.0f;
        this.k = 0.6f;
        this.l = 8.0f;
        this.m = new RectF();
        this.v = new PointF(0.0f, 0.0f);
        this.w = 1.0f;
        this.x = 1.0f;
        this.y = 1.0f;
        this.z = 1;
        this.A = 0;
        this.E = false;
        this.F = false;
        this.G = new jf0(this, 1);
        g(context, attributeSet);
    }

    public ZoomageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Matrix();
        this.f = new Matrix();
        this.g = new float[9];
        this.h = null;
        this.i = 0.6f;
        this.j = 8.0f;
        this.k = 0.6f;
        this.l = 8.0f;
        this.m = new RectF();
        this.v = new PointF(0.0f, 0.0f);
        this.w = 1.0f;
        this.x = 1.0f;
        this.y = 1.0f;
        this.z = 1;
        this.A = 0;
        this.E = false;
        this.F = false;
        this.G = new jf0(this, 1);
        g(context, attributeSet);
    }
}
