package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.do1;
import defpackage.dp2;
import defpackage.fv2;
import defpackage.qj1;
import defpackage.rq4;
import defpackage.tm0;
import defpackage.ue;
import defpackage.vm0;
import defpackage.wm0;
import defpackage.wv8;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View {
    public static final do1 k = new do1(3);
    public final DrawChildContainer a;
    public final wm0 b;
    public final vm0 c;
    public boolean d;
    public Outline e;
    public boolean f;
    public qj1 g;
    public LayoutDirection h;
    public dp2 i;
    public a j;

    public ViewLayer(DrawChildContainer drawChildContainer, wm0 wm0Var, vm0 vm0Var) {
        super(drawChildContainer.getContext());
        this.a = drawChildContainer;
        this.b = wm0Var;
        this.c = vm0Var;
        setOutlineProvider(k);
        this.f = true;
        this.g = rq4.a;
        this.h = LayoutDirection.a;
        fv2.a.getClass();
        this.i = b.b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wm0 wm0Var = this.b;
        ue ueVar = wm0Var.a;
        Canvas canvas2 = ueVar.a;
        ueVar.a = canvas;
        qj1 qj1Var = this.g;
        LayoutDirection layoutDirection = this.h;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        a aVar = this.j;
        dp2 dp2Var = this.i;
        vm0 vm0Var = this.c;
        qj1 qj1VarX = vm0Var.X().x();
        LayoutDirection layoutDirectionZ = vm0Var.X().z();
        tm0 tm0VarV = vm0Var.X().v();
        long jA = vm0Var.X().A();
        a aVar2 = (a) vm0Var.X().c;
        wv8 wv8VarX = vm0Var.X();
        wv8VarX.N(qj1Var);
        wv8VarX.O(layoutDirection);
        wv8VarX.M(ueVar);
        wv8VarX.P(jFloatToRawIntBits);
        wv8VarX.c = aVar;
        ueVar.e();
        try {
            dp2Var.invoke(vm0Var);
            ueVar.o();
            wv8 wv8VarX2 = vm0Var.X();
            wv8VarX2.N(qj1VarX);
            wv8VarX2.O(layoutDirectionZ);
            wv8VarX2.M(tm0VarV);
            wv8VarX2.P(jA);
            wv8VarX2.c = aVar2;
            wm0Var.a.a = canvas2;
            this.d = false;
        } catch (Throwable th) {
            ueVar.o();
            wv8 wv8VarX3 = vm0Var.X();
            wv8VarX3.N(qj1VarX);
            wv8VarX3.O(layoutDirectionZ);
            wv8VarX3.M(tm0VarV);
            wv8VarX3.P(jA);
            wv8VarX3.c = aVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f;
    }

    public final wm0 getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setDrawParams(qj1 qj1Var, LayoutDirection layoutDirection, a aVar, dp2 dp2Var) {
        this.g = qj1Var;
        this.h = layoutDirection;
        this.i = dp2Var;
        this.j = aVar;
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }
}
