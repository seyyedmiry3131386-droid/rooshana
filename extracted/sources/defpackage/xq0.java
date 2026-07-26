package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xq0 extends fk4 implements Drawable.Callback, yg8 {
    public static final int[] m1 = {R.attr.state_enabled};
    public static final ShapeDrawable n1 = new ShapeDrawable(new OvalShape());
    public ColorStateList A0;
    public ez4 B0;
    public ez4 C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public ColorStateList H;
    public float H0;
    public ColorStateList I;
    public float I0;
    public float J;
    public float J0;
    public float K;
    public float K0;
    public ColorStateList L;
    public final Context L0;
    public float M;
    public final Paint M0;
    public ColorStateList N;
    public final Paint.FontMetrics N0;
    public CharSequence O;
    public final RectF O0;
    public boolean P;
    public final PointF P0;
    public Drawable Q;
    public final Path Q0;
    public ColorStateList R;
    public final zg8 R0;
    public float S;
    public int S0;
    public boolean T;
    public int T0;
    public boolean U;
    public int U0;
    public Drawable V;
    public int V0;
    public RippleDrawable W;
    public int W0;
    public ColorStateList X;
    public int X0;
    public float Y;
    public boolean Y0;
    public SpannableStringBuilder Z;
    public int Z0;
    public int a1;
    public ColorFilter b1;
    public PorterDuffColorFilter c1;
    public ColorStateList d1;
    public PorterDuff.Mode e1;
    public int[] f1;
    public ColorStateList g1;
    public WeakReference h1;
    public TextUtils.TruncateAt i1;
    public boolean j1;
    public int k1;
    public boolean l1;
    public boolean x0;
    public boolean y0;
    public Drawable z0;

    public xq0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, Chip.x);
        this.K = -1.0f;
        this.M0 = new Paint(1);
        this.N0 = new Paint.FontMetrics();
        this.O0 = new RectF();
        this.P0 = new PointF();
        this.Q0 = new Path();
        this.a1 = 255;
        this.e1 = PorterDuff.Mode.SRC_IN;
        this.h1 = new WeakReference(null);
        o(context);
        this.L0 = context;
        zg8 zg8Var = new zg8(this);
        this.R0 = zg8Var;
        this.O = "";
        zg8Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = m1;
        setState(iArr);
        c0(iArr);
        this.j1 = true;
        n1.setTint(-1);
    }

    public static boolean J(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean K(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void l0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void E(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.V) {
            if (drawable.isStateful()) {
                drawable.setState(this.f1);
            }
            drawable.setTintList(this.X);
            return;
        }
        Drawable drawable2 = this.Q;
        if (drawable == drawable2 && this.T) {
            drawable2.setTintList(this.R);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void F(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (j0() || i0()) {
            float f = this.D0 + this.E0;
            Drawable drawable = this.Y0 ? this.z0 : this.Q;
            float intrinsicWidth = this.S;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.Y0 ? this.z0 : this.Q;
            float fCeil = this.S;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(o37.i(this.L0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float G() {
        if (!j0() && !i0()) {
            return 0.0f;
        }
        float f = this.E0;
        Drawable drawable = this.Y0 ? this.z0 : this.Q;
        float intrinsicWidth = this.S;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.F0;
    }

    public final float H() {
        if (k0()) {
            return this.I0 + this.Y + this.J0;
        }
        return 0.0f;
    }

    public final float I() {
        return this.l1 ? l() : this.K;
    }

    public final void L() {
        wq0 wq0Var = (wq0) this.h1.get();
        if (wq0Var != null) {
            Chip chip = (Chip) wq0Var;
            chip.c(chip.q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(int[] r10, int[] r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq0.M(int[], int[]):boolean");
    }

    public final void N(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            float fG = G();
            if (!z && this.Y0) {
                this.Y0 = false;
            }
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void O(Drawable drawable) {
        if (this.z0 != drawable) {
            float fG = G();
            this.z0 = drawable;
            float fG2 = G();
            l0(this.z0);
            E(this.z0);
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.A0 != colorStateList) {
            this.A0 = colorStateList;
            if (this.y0 && (drawable = this.z0) != null && this.x0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.y0 != z) {
            boolean zI0 = i0();
            this.y0 = z;
            boolean zI02 = i0();
            if (zI0 != zI02) {
                if (zI02) {
                    E(this.z0);
                } else {
                    l0(this.z0);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public final void R(float f) {
        if (this.K != f) {
            this.K = f;
            yr7 yr7VarH = this.b.a.h();
            yr7VarH.b(f);
            setShapeAppearanceModel(yr7VarH.a());
        }
    }

    public final void S(Drawable drawable) {
        Drawable drawable2 = this.Q;
        Drawable drawableP = drawable2 != null ? yh0.P(drawable2) : null;
        if (drawableP != drawable) {
            float fG = G();
            this.Q = drawable != null ? drawable.mutate() : null;
            float fG2 = G();
            l0(drawableP);
            if (j0()) {
                E(this.Q);
            }
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void T(float f) {
        if (this.S != f) {
            float fG = G();
            this.S = f;
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void U(ColorStateList colorStateList) {
        this.T = true;
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (j0()) {
                this.Q.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void V(boolean z) {
        if (this.P != z) {
            boolean zJ0 = j0();
            this.P = z;
            boolean zJ02 = j0();
            if (zJ0 != zJ02) {
                if (zJ02) {
                    E(this.Q);
                } else {
                    l0(this.Q);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (this.l1) {
                y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void X(float f) {
        if (this.M != f) {
            this.M = f;
            this.M0.setStrokeWidth(f);
            if (this.l1) {
                z(f);
            }
            invalidateSelf();
        }
    }

    public final void Y(Drawable drawable) {
        Drawable drawable2 = this.V;
        Drawable drawableP = drawable2 != null ? yh0.P(drawable2) : null;
        if (drawableP != drawable) {
            float fH = H();
            this.V = drawable != null ? drawable.mutate() : null;
            this.W = new RippleDrawable(u97.c(this.N), this.V, n1);
            float fH2 = H();
            l0(drawableP);
            if (k0()) {
                E(this.V);
            }
            invalidateSelf();
            if (fH != fH2) {
                L();
            }
        }
    }

    public final void Z(float f) {
        if (this.J0 != f) {
            this.J0 = f;
            invalidateSelf();
            if (k0()) {
                L();
            }
        }
    }

    @Override // defpackage.fk4, defpackage.yg8
    public final void a() {
        L();
        invalidateSelf();
    }

    public final void a0(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            if (k0()) {
                L();
            }
        }
    }

    public final void b0(float f) {
        if (this.I0 != f) {
            this.I0 = f;
            invalidateSelf();
            if (k0()) {
                L();
            }
        }
    }

    public final boolean c0(int[] iArr) {
        if (Arrays.equals(this.f1, iArr)) {
            return false;
        }
        this.f1 = iArr;
        if (k0()) {
            return M(getState(), iArr);
        }
        return false;
    }

    public final void d0(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (k0()) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.a1) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.l1;
        Paint paint = this.M0;
        RectF rectF = this.O0;
        if (!z) {
            paint.setColor(this.S0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, I(), I(), paint);
        }
        if (!this.l1) {
            paint.setColor(this.T0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.b1;
            if (colorFilter == null) {
                colorFilter = this.c1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, I(), I(), paint);
        }
        if (this.l1) {
            super.draw(canvas);
        }
        if (this.M > 0.0f && !this.l1) {
            paint.setColor(this.V0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.l1) {
                ColorFilter colorFilter2 = this.b1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.c1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.M / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.K - (this.M / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.W0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.l1) {
            RectF rectF2 = new RectF(bounds);
            dk4 dk4Var = this.b;
            as7 as7Var = dk4Var.a;
            float[] fArr = this.C;
            float f5 = dk4Var.j;
            ql4 ql4Var = this.r;
            zs4 zs4Var = this.s;
            f = 2.0f;
            Path path = this.Q0;
            zs4Var.b(as7Var, fArr, f5, rectF2, ql4Var, path);
            f(canvas2, paint, path, this.b.a, this.C, h());
        } else {
            canvas2.drawRoundRect(rectF, I(), I(), paint);
            f = 2.0f;
        }
        if (j0()) {
            F(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.Q.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Q.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (i0()) {
            F(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.z0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.z0.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.j1 && this.O != null) {
            PointF pointF = this.P0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.O;
            zg8 zg8Var = this.R0;
            if (charSequence != null) {
                float fG = G() + this.D0 + this.G0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fG;
                } else {
                    pointF.x = bounds.right - fG;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = zg8Var.a;
                Paint.FontMetrics fontMetrics = this.N0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.O != null) {
                float fG2 = G() + this.D0 + this.G0;
                float fH = H() + this.K0 + this.H0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fG2;
                    rectF.right = bounds.right - fH;
                } else {
                    rectF.left = bounds.left + fH;
                    rectF.right = bounds.right - fG2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            vf8 vf8Var = zg8Var.g;
            TextPaint textPaint2 = zg8Var.a;
            if (vf8Var != null) {
                textPaint2.drawableState = getState();
                zg8Var.g.d(this.L0, textPaint2, zg8Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(zg8Var.a(this.O.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.O;
            if (z2 && this.i1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.i1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (k0()) {
            rectF.setEmpty();
            if (k0()) {
                float f10 = this.K0 + this.J0;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.Y;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.Y;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.Y;
                float f14 = fExactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.W.setBounds(this.V.getBounds());
            this.W.jumpToCurrentState();
            this.W.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.a1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final void e0(boolean z) {
        if (this.U != z) {
            boolean zK0 = k0();
            this.U = z;
            boolean zK02 = k0();
            if (zK0 != zK02) {
                if (zK02) {
                    E(this.V);
                } else {
                    l0(this.V);
                }
                invalidateSelf();
                L();
            }
        }
    }

    public final void f0(float f) {
        if (this.F0 != f) {
            float fG = G();
            this.F0 = f;
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    public final void g0(float f) {
        if (this.E0 != f) {
            float fG = G();
            this.E0 = f;
            float fG2 = G();
            invalidateSelf();
            if (fG != fG2) {
                L();
            }
        }
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.b1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(H() + this.R0.a(this.O.toString()) + G() + this.D0 + this.G0 + this.H0 + this.K0), this.k1);
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.l1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.J, this.K);
        } else {
            outline.setRoundRect(bounds, this.K);
            outline2 = outline;
        }
        outline2.setAlpha(this.a1 / 255.0f);
    }

    public final void h0(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            this.g1 = null;
            onStateChange(getState());
        }
    }

    public final boolean i0() {
        return this.y0 && this.z0 != null && this.Y0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (J(this.H) || J(this.I) || J(this.L)) {
            return true;
        }
        vf8 vf8Var = this.R0.g;
        if (vf8Var == null || (colorStateList = vf8Var.k) == null || !colorStateList.isStateful()) {
            return (this.y0 && this.z0 != null && this.x0) || K(this.Q) || K(this.z0) || J(this.d1);
        }
        return true;
    }

    public final boolean j0() {
        return this.P && this.Q != null;
    }

    public final boolean k0() {
        return this.U && this.V != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (j0()) {
            zOnLayoutDirectionChanged |= this.Q.setLayoutDirection(i);
        }
        if (i0()) {
            zOnLayoutDirectionChanged |= this.z0.setLayoutDirection(i);
        }
        if (k0()) {
            zOnLayoutDirectionChanged |= this.V.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (j0()) {
            zOnLevelChange |= this.Q.setLevel(i);
        }
        if (i0()) {
            zOnLevelChange |= this.z0.setLevel(i);
        }
        if (k0()) {
            zOnLevelChange |= this.V.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.l1) {
            super.onStateChange(iArr);
        }
        return M(iArr, this.f1);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.a1 != i) {
            this.a1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b1 != colorFilter) {
            this.b1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.d1 != colorStateList) {
            this.d1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.e1 != mode) {
            this.e1 = mode;
            ColorStateList colorStateList = this.d1;
            this.c1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (j0()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (i0()) {
            visible |= this.z0.setVisible(z, z2);
        }
        if (k0()) {
            visible |= this.V.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
