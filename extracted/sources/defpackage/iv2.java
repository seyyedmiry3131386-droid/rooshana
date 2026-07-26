package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.ViewLayer;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class iv2 implements fv2 {
    public static final hv2 y = new hv2();
    public final DrawChildContainer b;
    public final wm0 c;
    public final ViewLayer d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public id0 x;

    public iv2(DrawChildContainer drawChildContainer) {
        wm0 wm0Var = new wm0();
        vm0 vm0Var = new vm0();
        this.b = drawChildContainer;
        this.c = wm0Var;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, wm0Var, vm0Var);
        this.d = viewLayer;
        this.e = drawChildContainer.getResources();
        this.f = new Rect();
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = zu0.b;
        this.u = j;
        this.v = j;
    }

    @Override // defpackage.fv2
    public final void A() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // defpackage.fv2
    public final void B(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.fv2
    public final float C() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.fv2
    public final float D() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void E(id0 id0Var) {
        this.x = id0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            zc.y(this.d, id0Var);
        }
    }

    @Override // defpackage.fv2
    public final void F() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.fv2
    public final void G(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.fv2
    public final float H() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void I(int i) {
        this.o = i;
        Q();
    }

    @Override // defpackage.fv2
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            ul.G(gu9.E(j), this.d);
        }
    }

    @Override // defpackage.fv2
    public final Matrix K() {
        return this.d.getMatrix();
    }

    @Override // defpackage.fv2
    public final void L(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.fv2
    public final float M() {
        return this.t;
    }

    @Override // defpackage.fv2
    public final float N() {
        return this.s;
    }

    @Override // defpackage.fv2
    public final int O() {
        return this.n;
    }

    public final void P(int i) {
        ViewLayer viewLayer = this.d;
        boolean z = true;
        if (i == 1) {
            viewLayer.setLayerType(2, this.g);
        } else if (i == 2) {
            viewLayer.setLayerType(0, this.g);
            z = false;
        } else {
            viewLayer.setLayerType(0, this.g);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void Q() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            P(i);
        } else {
            P(1);
        }
    }

    @Override // defpackage.fv2
    public final float a() {
        return this.p;
    }

    @Override // defpackage.fv2
    public final float b() {
        return this.r;
    }

    @Override // defpackage.fv2
    public final void c(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.fv2
    public final id0 d() {
        return this.x;
    }

    @Override // defpackage.fv2
    public final void e(float f) {
        this.w = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.fv2
    public final void f(Outline outline, long j) {
        ViewLayer viewLayer = this.d;
        viewLayer.e = outline;
        viewLayer.invalidateOutline();
        if ((this.m || viewLayer.getClipToOutline()) && outline != null) {
            viewLayer.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.fv2
    public final void g(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(te.W(i)));
        Q();
    }

    @Override // defpackage.fv2
    public final void h() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.fv2
    public final void i(tm0 tm0Var) {
        Rect rect;
        boolean z = this.k;
        ViewLayer viewLayer = this.d;
        if (z) {
            if ((this.m || viewLayer.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = viewLayer.getWidth();
                rect.bottom = viewLayer.getHeight();
            } else {
                rect = null;
            }
            viewLayer.setClipBounds(rect);
        }
        if (ve.a(tm0Var).isHardwareAccelerated()) {
            this.b.a(tm0Var, viewLayer, viewLayer.getDrawingTime());
        }
    }

    @Override // defpackage.fv2
    public final int j() {
        return this.o;
    }

    @Override // defpackage.fv2
    public final tc0 k() {
        return null;
    }

    @Override // defpackage.fv2
    public final void l(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.fv2
    public final void m(int i, int i2, long j) {
        boolean zB = zq3.b(this.j, j);
        ViewLayer viewLayer = this.d;
        if (zB) {
            int i3 = this.h;
            if (i3 != i) {
                viewLayer.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                viewLayer.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || viewLayer.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            viewLayer.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                viewLayer.setPivotX(i5 / 2.0f);
                viewLayer.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.fv2
    public final float n() {
        return 0.0f;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.fv2
    public final void o(qj1 qj1Var, LayoutDirection layoutDirection, a aVar, dp2 dp2Var) {
        ViewLayer viewLayer = this.d;
        ViewParent parent = viewLayer.getParent();
        DrawChildContainer drawChildContainer = this.b;
        if (parent == null) {
            drawChildContainer.addView(viewLayer);
        }
        viewLayer.setDrawParams(qj1Var, layoutDirection, aVar, dp2Var);
        if (viewLayer.isAttachedToWindow()) {
            viewLayer.setVisibility(4);
            viewLayer.setVisibility(0);
            try {
                wm0 wm0Var = this.c;
                hv2 hv2Var = y;
                ue ueVar = wm0Var.a;
                Canvas canvas = ueVar.a;
                ueVar.a = hv2Var;
                drawChildContainer.a(ueVar, viewLayer, viewLayer.getDrawingTime());
                wm0Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.fv2
    public final /* synthetic */ boolean p() {
        return true;
    }

    @Override // defpackage.fv2
    public final float q() {
        return this.w;
    }

    @Override // defpackage.fv2
    public final void r(long j) {
        long j2 = 9223372034707292159L & j;
        ViewLayer viewLayer = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            viewLayer.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            viewLayer.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ul.y(viewLayer);
                return;
            }
            this.q = true;
            viewLayer.setPivotX(((int) (this.j >> 32)) / 2.0f);
            viewLayer.setPivotY(((int) (4294967295L & this.j)) / 2.0f);
        }
    }

    @Override // defpackage.fv2
    public final long s() {
        return this.u;
    }

    @Override // defpackage.fv2
    public final void t() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.fv2
    public final void u(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.fv2
    public final float v() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void w() {
        this.d.setTranslationY(0.0f);
    }

    @Override // defpackage.fv2
    public final void x() {
        this.d.setRotationY(0.0f);
    }

    @Override // defpackage.fv2
    public final long y() {
        return this.v;
    }

    @Override // defpackage.fv2
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            ul.F(gu9.E(j), this.d);
        }
    }
}
