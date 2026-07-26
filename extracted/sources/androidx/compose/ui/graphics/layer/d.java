package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dp2;
import defpackage.fv2;
import defpackage.gu9;
import defpackage.id0;
import defpackage.qj1;
import defpackage.tc0;
import defpackage.te;
import defpackage.tm0;
import defpackage.tt3;
import defpackage.ue;
import defpackage.ve;
import defpackage.vm0;
import defpackage.wm0;
import defpackage.wv8;
import defpackage.zc;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements fv2 {
    public final wm0 b;
    public final vm0 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean t;
    public id0 u;
    public int v;

    public d() {
        wm0 wm0Var = new wm0();
        vm0 vm0Var = new vm0();
        this.b = wm0Var;
        this.c = vm0Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        Q(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.k = 1.0f;
        this.l = 1.0f;
        long j = zu0.b;
        this.n = j;
        this.o = j;
        this.q = 8.0f;
        this.v = 0;
    }

    @Override // defpackage.fv2
    public final void A() {
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // defpackage.fv2
    public final void B(float f) {
        this.k = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.fv2
    public final float C() {
        return this.q;
    }

    @Override // defpackage.fv2
    public final float D() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void E(id0 id0Var) {
        this.u = id0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            zc.x(this.d, id0Var);
        }
    }

    @Override // defpackage.fv2
    public final void F() {
        this.d.setTranslationX(0.0f);
    }

    @Override // defpackage.fv2
    public final void G(boolean z) {
        this.r = z;
        P();
    }

    @Override // defpackage.fv2
    public final float H() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void I(int i) {
        this.v = i;
        R();
    }

    @Override // defpackage.fv2
    public final void J(long j) {
        this.o = j;
        this.d.setSpotShadowColor(gu9.E(j));
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
        this.q = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.fv2
    public final float M() {
        return this.m;
    }

    @Override // defpackage.fv2
    public final float N() {
        return this.l;
    }

    @Override // defpackage.fv2
    public final int O() {
        return this.j;
    }

    public final void P() {
        boolean z = this.r;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.s) {
            this.s = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.t) {
            this.t = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void Q(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i = this.v;
        if (i != 1 && this.j == 3 && this.u == null) {
            Q(this.d, i);
        } else {
            Q(this.d, 1);
        }
    }

    @Override // defpackage.fv2
    public final float a() {
        return this.i;
    }

    @Override // defpackage.fv2
    public final float b() {
        return this.k;
    }

    @Override // defpackage.fv2
    public final void c(float f) {
        this.m = f;
        this.d.setElevation(f);
    }

    @Override // defpackage.fv2
    public final id0 d() {
        return this.u;
    }

    @Override // defpackage.fv2
    public final void e(float f) {
        this.p = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.fv2
    public final void f(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // defpackage.fv2
    public final void g(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(te.U(i));
        R();
    }

    @Override // defpackage.fv2
    public final void h() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.fv2
    public final void i(tm0 tm0Var) {
        ve.a(tm0Var).drawRenderNode(this.d);
    }

    @Override // defpackage.fv2
    public final int j() {
        return this.v;
    }

    @Override // defpackage.fv2
    public final tc0 k() {
        return null;
    }

    @Override // defpackage.fv2
    public final void l(float f) {
        this.l = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.fv2
    public final void m(int i, int i2, long j) {
        this.d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.e = tt3.M(j);
    }

    @Override // defpackage.fv2
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.fv2
    public final void o(qj1 qj1Var, LayoutDirection layoutDirection, a aVar, dp2 dp2Var) {
        vm0 vm0Var = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        try {
            wm0 wm0Var = this.b;
            ue ueVar = wm0Var.a;
            Canvas canvas = ueVar.a;
            ueVar.a = recordingCanvasBeginRecording;
            wv8 wv8Var = vm0Var.b;
            wv8Var.N(qj1Var);
            wv8Var.O(layoutDirection);
            wv8Var.c = aVar;
            wv8Var.P(this.e);
            wv8Var.M(ueVar);
            ((GraphicsLayer$clipDrawBlock$1) dp2Var).invoke(vm0Var);
            wm0Var.a.a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // defpackage.fv2
    public final boolean p() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.fv2
    public final float q() {
        return this.p;
    }

    @Override // defpackage.fv2
    public final void r(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.d.resetPivot();
        } else {
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // defpackage.fv2
    public final long s() {
        return this.n;
    }

    @Override // defpackage.fv2
    public final void t() {
        this.d.setRotationX(0.0f);
    }

    @Override // defpackage.fv2
    public final void u(float f) {
        this.i = f;
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
        return this.o;
    }

    @Override // defpackage.fv2
    public final void z(long j) {
        this.n = j;
        this.d.setAmbientShadowColor(gu9.E(j));
    }
}
