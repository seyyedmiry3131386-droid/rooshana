package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class az0 extends View.DragShadowBuilder {
    public final tj1 a;
    public final long b;
    public final dp2 c;

    public az0(tj1 tj1Var, long j, dp2 dp2Var) {
        this.a = tj1Var;
        this.b = j;
        this.c = dp2Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        vm0 vm0Var = new vm0();
        LayoutDirection layoutDirection = LayoutDirection.a;
        Canvas canvas2 = ve.a;
        ue ueVar = new ue();
        ueVar.a = canvas;
        um0 um0Var = vm0Var.a;
        qj1 qj1Var = um0Var.a;
        LayoutDirection layoutDirection2 = um0Var.b;
        tm0 tm0Var = um0Var.c;
        long j = um0Var.d;
        um0Var.a = this.a;
        um0Var.b = layoutDirection;
        um0Var.c = ueVar;
        um0Var.d = this.b;
        ueVar.e();
        this.c.invoke(vm0Var);
        ueVar.o();
        um0Var.a = qj1Var;
        um0Var.b = layoutDirection2;
        um0Var.c = tm0Var;
        um0Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        tj1 tj1Var = this.a;
        point.set(o40.a(tj1Var, fIntBitsToFloat / tj1Var.getDensity()), o40.a(tj1Var, Float.intBitsToFloat((int) (j & 4294967295L)) / tj1Var.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
