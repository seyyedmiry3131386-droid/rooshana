package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.StateSet;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class fk4 extends Drawable implements bt7 {
    public static final Paint F;
    public static final ek4[] G;
    public m38 A;
    public final l38[] B;
    public float[] C;
    public float[] D;
    public qs3 E;
    public final ck4 a;
    public dk4 b;
    public final ts7[] c;
    public final ts7[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final vr7 q;
    public final ql4 r;
    public final zs4 s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public int v;
    public final RectF w;
    public boolean x;
    public boolean y;
    public as7 z;

    static {
        Paint paint = new Paint(1);
        F = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        G = new ek4[4];
        int i = 0;
        while (true) {
            ek4[] ek4VarArr = G;
            if (i >= ek4VarArr.length) {
                return;
            }
            ek4VarArr[i] = new ek4(i);
            i++;
        }
    }

    public fk4() {
        this(new as7());
    }

    public static float c(RectF rectF, as7 as7Var, float[] fArr) {
        if (fArr == null) {
            if (as7Var.g(rectF)) {
                return as7Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (as7Var.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final boolean A(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.d == null || color2 == (colorForState2 = this.b.d.getColorForState(iArr, (color2 = (paint2 = this.o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.b.e == null || color == (colorForState = this.b.e.getColorForState(iArr, (color = (paint = this.p).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void B(int[] iArr, boolean z) {
        as7 as7VarA;
        int i;
        RectF rectFH = h();
        if (this.b.b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        y48 y48Var = this.b.b;
        as7[] as7VarArr = y48Var.d;
        int i2 = y48Var.a;
        int[][] iArr2 = y48Var.c;
        x48 x48Var = y48Var.h;
        x48 x48Var2 = y48Var.g;
        x48 x48Var3 = y48Var.f;
        x48 x48Var4 = y48Var.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (x48Var4 == null && x48Var3 == null && x48Var2 == null && x48Var == null) {
            as7VarA = as7VarArr[i3];
        } else {
            yr7 yr7VarH = as7VarArr[i3].h();
            if (x48Var4 != null) {
                yr7VarH.e = x48Var4.c(iArr);
            }
            if (x48Var3 != null) {
                yr7VarH.f = x48Var3.c(iArr);
            }
            if (x48Var2 != null) {
                yr7VarH.h = x48Var2.c(iArr);
            }
            if (x48Var != null) {
                yr7VarH.g = x48Var.c(iArr);
            }
            as7VarA = yr7VarH.a();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.s.getClass();
            float fA = (i5 != 1 ? i5 != 2 ? i5 != 3 ? as7VarA.f : as7VarA.e : as7VarA.h : as7VarA.g).a(rectFH);
            if (z2) {
                this.C[i5] = fA;
            }
            l38[] l38VarArr = this.B;
            l38 l38Var = l38VarArr[i5];
            if (l38Var != null) {
                l38Var.a(fA);
                if (z2) {
                    l38VarArr[i5].d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean C() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        dk4 dk4Var = this.b;
        ColorStateList colorStateList = dk4Var.f;
        PorterDuff.Mode mode = dk4Var.g;
        if (colorStateList == null || mode == null) {
            int color = this.o.getColor();
            int iD = d(color);
            this.v = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.v = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.t = porterDuffColorFilter;
        this.b.getClass();
        this.u = null;
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.t) && Objects.equals(porterDuffColorFilter3, this.u)) ? false : true;
    }

    public final void D() {
        dk4 dk4Var = this.b;
        float f = dk4Var.n + 0.0f;
        dk4Var.p = (int) Math.ceil(0.75f * f);
        this.b.q = (int) Math.ceil(f * 0.25f);
        C();
        super.invalidateSelf();
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        dk4 dk4Var = this.b;
        this.s.b(dk4Var.a, this.C, dk4Var.j, rectF, this.r, path);
        if (this.b.i != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final int d(int i) {
        dk4 dk4Var = this.b;
        float f = dk4Var.n + 0.0f + dk4Var.m;
        pz1 pz1Var = dk4Var.c;
        return pz1Var != null ? pz1Var.a(i, f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint2 = this.o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.b.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        Paint paint3 = this.p;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.b.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.b.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.b.r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.f;
            paint = paint2;
            Path path = this.i;
            if (z) {
                b(h(), path);
                this.f = false;
            }
            dk4 dk4Var = this.b;
            int i3 = dk4Var.o;
            if (i3 != 1 && dk4Var.p > 0 && (i3 == 2 || (!p() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate((int) (Math.sin(Math.toRadians(0)) * ((double) this.b.q)), j());
                if (this.x) {
                    RectF rectF = this.w;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.b.p * 2) + ((int) rectF.width()) + iWidth, (this.b.p * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (getBounds().left - this.b.p) - iWidth;
                    float f2 = (getBounds().top - this.b.p) - iHeight;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.b.a, this.C, h());
        } else {
            paint = paint2;
        }
        if (n()) {
            if (this.g) {
                this.z = this.b.a.i(this.a);
                float[] fArr = this.C;
                if (fArr != null) {
                    if (this.D == null) {
                        this.D = new float[fArr.length];
                    }
                    float fK = k();
                    int i4 = 0;
                    while (true) {
                        float[] fArr2 = this.C;
                        if (i4 >= fArr2.length) {
                            break;
                        }
                        this.D[i4] = Math.max(0.0f, fArr2[i4] - fK);
                        i4++;
                    }
                } else {
                    this.D = null;
                }
                as7 as7Var = this.z;
                float[] fArr3 = this.D;
                float f3 = this.b.j;
                RectF rectFH = h();
                RectF rectF2 = this.l;
                rectF2.set(rectFH);
                float fK2 = k();
                rectF2.inset(fK2, fK2);
                this.s.b(as7Var, fArr3, f3, rectF2, null, this.j);
                this.g = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            t0.m("fk4", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.q;
        Path path = this.i;
        vr7 vr7Var = this.q;
        if (i != 0) {
            canvas.drawPath(path, vr7Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ts7 ts7Var = this.c[i2];
            int i3 = this.b.p;
            Matrix matrix = ts7.b;
            ts7Var.a(matrix, vr7Var, i3, canvas);
            this.d[i2].a(matrix, vr7Var, this.b.p, canvas);
        }
        if (this.x) {
            int iSin = (int) (Math.sin(Math.toRadians(0)) * ((double) this.b.q));
            int iJ = j();
            canvas.translate(-iSin, -iJ);
            canvas.drawPath(path, F);
            canvas.translate(iSin, iJ);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, as7 as7Var, float[] fArr, RectF rectF) {
        float fC = c(rectF, as7Var, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fC * this.b.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        as7 as7Var = this.z;
        float[] fArr = this.D;
        RectF rectFH = h();
        RectF rectF = this.l;
        rectF.set(rectFH);
        float fK = k();
        rectF.inset(fK, fK);
        f(canvas, this.p, this.j, as7Var, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.b.o == 2) {
            return;
        }
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.b.a, this.C);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.b.j);
            return;
        }
        boolean z = this.f;
        Path path = this.i;
        if (z) {
            b(rectFH, path);
            this.f = false;
        }
        te.Q(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.i;
        b(rectFH, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.C;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        as7 as7Var = this.b.a;
        zs4 zs4Var = this.s;
        zs4Var.getClass();
        float fA = as7Var.e.a(rectFH);
        as7 as7Var2 = this.b.a;
        zs4Var.getClass();
        float fA2 = as7Var2.h.a(rectFH) + fA;
        as7 as7Var3 = this.b.a;
        zs4Var.getClass();
        float fA3 = fA2 - as7Var3.g.a(rectFH);
        as7 as7Var4 = this.b.a;
        zs4Var.getClass();
        return (fA3 - as7Var4.f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.b.getClass();
        ColorStateList colorStateList2 = this.b.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.b.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        y48 y48Var = this.b.b;
        return y48Var != null && y48Var.d();
    }

    public final int j() {
        return (int) (Math.cos(Math.toRadians(0)) * ((double) this.b.q));
    }

    public final float k() {
        if (n()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float l() {
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.b.a.e.a(h());
    }

    public final float m() {
        float[] fArr = this.C;
        return fArr != null ? fArr[0] : this.b.a.f.a(h());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new dk4(this.b);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.b.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    public final void o(Context context) {
        this.b.c = new pz1(context);
        D();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (this.b.b != null && !rect.isEmpty()) {
            B(getState(), this.y);
        }
        this.y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.b.b != null) {
            B(iArr, false);
        }
        boolean z = A(iArr) || C();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        if (!this.b.a.g(h())) {
            float[] fArr = this.C;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f = fArr[0];
                    for (int i = 1; i < fArr.length; i++) {
                        if (fArr[i] != f) {
                            break;
                        }
                    }
                }
                if (this.b.a.f()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void q(m38 m38Var) {
        if (this.A == m38Var) {
            return;
        }
        this.A = m38Var;
        int i = 0;
        while (true) {
            l38[] l38VarArr = this.B;
            if (i >= l38VarArr.length) {
                B(getState(), true);
                invalidateSelf();
                return;
            }
            if (l38VarArr[i] == null) {
                l38VarArr[i] = new l38(this, G[i]);
            }
            l38 l38Var = l38VarArr[i];
            m38 m38Var2 = new m38();
            m38Var2.a((float) m38Var.b);
            double d = m38Var.a;
            m38Var2.b((float) (d * d));
            l38Var.m = m38Var2;
            i++;
        }
    }

    public final void r(float f) {
        dk4 dk4Var = this.b;
        if (dk4Var.n != f) {
            dk4Var.n = f;
            D();
        }
    }

    public final void s(ColorStateList colorStateList) {
        dk4 dk4Var = this.b;
        if (dk4Var.d != colorStateList) {
            dk4Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        dk4 dk4Var = this.b;
        if (dk4Var.l != i) {
            dk4Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.bt7
    public final void setShapeAppearanceModel(as7 as7Var) {
        dk4 dk4Var = this.b;
        dk4Var.a = as7Var;
        dk4Var.b = null;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.f = colorStateList;
        C();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        dk4 dk4Var = this.b;
        if (dk4Var.g != mode) {
            dk4Var.g = mode;
            C();
            super.invalidateSelf();
        }
    }

    public final void t(float f) {
        dk4 dk4Var = this.b;
        if (dk4Var.j != f) {
            dk4Var.j = f;
            this.f = true;
            this.g = true;
            invalidateSelf();
        }
    }

    public final void u() {
        this.b.r = Paint.Style.FILL;
        super.invalidateSelf();
    }

    public final void v() {
        this.q.a(-12303292);
        this.b.getClass();
        super.invalidateSelf();
    }

    public final void w(int i) {
        dk4 dk4Var = this.b;
        if (dk4Var.o != i) {
            dk4Var.o = i;
            super.invalidateSelf();
        }
    }

    public final void x(y48 y48Var) {
        dk4 dk4Var = this.b;
        if (dk4Var.b != y48Var) {
            dk4Var.b = y48Var;
            B(getState(), true);
            invalidateSelf();
        }
    }

    public final void y(ColorStateList colorStateList) {
        dk4 dk4Var = this.b;
        if (dk4Var.e != colorStateList) {
            dk4Var.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void z(float f) {
        this.b.k = f;
        invalidateSelf();
    }

    public fk4(as7 as7Var) {
        this(new dk4(as7Var));
    }

    public fk4(dk4 dk4Var) {
        zs4 zs4Var;
        this.a = new ck4(0, this);
        this.c = new ts7[4];
        this.d = new ts7[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new vr7();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            zs4Var = bs7.a;
        } else {
            zs4Var = new zs4();
        }
        this.s = zs4Var;
        this.w = new RectF();
        this.x = true;
        this.y = true;
        this.B = new l38[4];
        this.b = dk4Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        C();
        A(getState());
        this.r = new ql4(26, this);
    }

    public fk4(Context context, AttributeSet attributeSet, int i, int i2) {
        this(as7.d(context, attributeSet, i, i2).a());
    }
}
