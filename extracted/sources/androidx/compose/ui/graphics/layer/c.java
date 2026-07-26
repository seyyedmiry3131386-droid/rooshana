package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dp2;
import defpackage.fv2;
import defpackage.gu9;
import defpackage.id0;
import defpackage.js3;
import defpackage.qj1;
import defpackage.tc0;
import defpackage.te;
import defpackage.tm0;
import defpackage.tt3;
import defpackage.u37;
import defpackage.ue;
import defpackage.v37;
import defpackage.ve;
import defpackage.vm0;
import defpackage.w37;
import defpackage.wm0;
import defpackage.wv8;
import defpackage.zq3;
import defpackage.zu0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c implements fv2 {
    public static final AtomicBoolean y = new AtomicBoolean(true);
    public final wm0 b;
    public final vm0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public float l;
    public boolean m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public id0 x;

    public c(AndroidComposeView androidComposeView, wm0 wm0Var, vm0 vm0Var) {
        this.b = wm0Var;
        this.c = vm0Var;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (y.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                w37.c(renderNodeCreate, w37.a(renderNodeCreate));
                w37.d(renderNodeCreate, w37.b(renderNodeCreate));
            }
            if (i >= 24) {
                v37.a(renderNodeCreate);
            } else {
                u37.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.k = 3;
        this.l = 1.0f;
        this.n = 1.0f;
        this.o = 1.0f;
        long j = zu0.b;
        this.q = j;
        this.r = j;
        this.t = 8.0f;
    }

    @Override // defpackage.fv2
    public final void A() {
        R();
    }

    @Override // defpackage.fv2
    public final void B(float f) {
        this.n = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.fv2
    public final float C() {
        return this.t;
    }

    @Override // defpackage.fv2
    public final float D() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void E(id0 id0Var) {
        this.x = id0Var;
    }

    @Override // defpackage.fv2
    public final void F() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.fv2
    public final void G(boolean z) {
        this.u = z;
        P();
    }

    @Override // defpackage.fv2
    public final float H() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void I(int i) {
        this.j = i;
        R();
    }

    @Override // defpackage.fv2
    public final void J(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.r = j;
            w37.d(this.d, gu9.E(j));
        }
    }

    @Override // defpackage.fv2
    public final Matrix K() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.fv2
    public final void L(float f) {
        this.t = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.fv2
    public final float M() {
        return this.p;
    }

    @Override // defpackage.fv2
    public final float N() {
        return this.o;
    }

    @Override // defpackage.fv2
    public final int O() {
        return this.k;
    }

    public final void P() {
        boolean z = this.u;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.v) {
            this.v = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.w) {
            this.w = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.j;
        if (i != 1 && this.k == 3) {
            Q(i);
        } else {
            Q(1);
        }
    }

    @Override // defpackage.fv2
    public final float a() {
        return this.l;
    }

    @Override // defpackage.fv2
    public final float b() {
        return this.n;
    }

    @Override // defpackage.fv2
    public final void c(float f) {
        this.p = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.fv2
    public final id0 d() {
        return this.x;
    }

    @Override // defpackage.fv2
    public final void e(float f) {
        this.s = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.fv2
    public final void f(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // defpackage.fv2
    public final void g(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(te.W(i)));
        R();
    }

    @Override // defpackage.fv2
    public final void h() {
        if (Build.VERSION.SDK_INT >= 24) {
            v37.a(this.d);
        } else {
            u37.a(this.d);
        }
    }

    @Override // defpackage.fv2
    public final void i(tm0 tm0Var) {
        DisplayListCanvas displayListCanvasA = ve.a(tm0Var);
        js3.n(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.d);
    }

    @Override // defpackage.fv2
    public final int j() {
        return this.j;
    }

    @Override // defpackage.fv2
    public final tc0 k() {
        return null;
    }

    @Override // defpackage.fv2
    public final void l(float f) {
        this.o = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.fv2
    public final void m(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (zq3.b(this.e, j)) {
            return;
        }
        if (this.m) {
            this.d.setPivotX(i3 / 2.0f);
            this.d.setPivotY(i4 / 2.0f);
        }
        this.e = j;
    }

    @Override // defpackage.fv2
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void o(qj1 qj1Var, LayoutDirection layoutDirection, a aVar, dp2 dp2Var) {
        Canvas canvasStart = this.d.start(Math.max((int) (this.e >> 32), (int) (this.i >> 32)), Math.max((int) (this.e & 4294967295L), (int) (4294967295L & this.i)));
        try {
            ue ueVar = this.b.a;
            Canvas canvas = ueVar.a;
            ueVar.a = canvasStart;
            vm0 vm0Var = this.c;
            wv8 wv8Var = vm0Var.b;
            long jM = tt3.M(this.e);
            qj1 qj1VarX = wv8Var.x();
            LayoutDirection layoutDirectionZ = wv8Var.z();
            tm0 tm0VarV = wv8Var.v();
            long jA = wv8Var.A();
            a aVar2 = (a) wv8Var.c;
            wv8Var.N(qj1Var);
            wv8Var.O(layoutDirection);
            wv8Var.M(ueVar);
            wv8Var.P(jM);
            wv8Var.c = aVar;
            ueVar.e();
            try {
                ((GraphicsLayer$clipDrawBlock$1) dp2Var).invoke(vm0Var);
                ueVar.o();
                wv8Var.N(qj1VarX);
                wv8Var.O(layoutDirectionZ);
                wv8Var.M(tm0VarV);
                wv8Var.P(jA);
                wv8Var.c = aVar2;
                ueVar.a = canvas;
                this.d.end(canvasStart);
            } catch (Throwable th) {
                ueVar.o();
                wv8 wv8Var2 = vm0Var.b;
                wv8Var2.N(qj1VarX);
                wv8Var2.O(layoutDirectionZ);
                wv8Var2.M(tm0VarV);
                wv8Var2.P(jA);
                wv8Var2.c = aVar2;
                throw th;
            }
        } catch (Throwable th2) {
            this.d.end(canvasStart);
            throw th2;
        }
    }

    @Override // defpackage.fv2
    public final boolean p() {
        return this.d.isValid();
    }

    @Override // defpackage.fv2
    public final float q() {
        return this.s;
    }

    @Override // defpackage.fv2
    public final void r(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.m = true;
            this.d.setPivotX(((int) (this.e >> 32)) / 2.0f);
            this.d.setPivotY(((int) (4294967295L & this.e)) / 2.0f);
        } else {
            this.m = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.fv2
    public final long s() {
        return this.q;
    }

    @Override // defpackage.fv2
    public final void t() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.fv2
    public final void u(float f) {
        this.l = f;
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
        return this.r;
    }

    @Override // defpackage.fv2
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q = j;
            w37.c(this.d, gu9.E(j));
        }
    }
}
