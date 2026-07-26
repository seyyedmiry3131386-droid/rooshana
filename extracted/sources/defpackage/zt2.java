package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.c;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.node.i;

/* JADX INFO: loaded from: classes.dex */
public final class zt2 extends ti1 implements gv1 {
    public final c q;
    public final ez1 r;
    public final wy5 s;

    public zt2(f fVar, c cVar, ez1 ez1Var, wy5 wy5Var) {
        this.q = cVar;
        this.r = ez1Var;
        this.s = wy5Var;
        C0(fVar);
    }

    public static boolean F0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        boolean zF0;
        long j;
        vm0 vm0Var = iVar.a;
        long jA = vm0Var.b.A();
        c cVar = this.q;
        cVar.i(jA);
        if (ey7.f(vm0Var.b.A())) {
            iVar.a();
            return;
        }
        iVar.a();
        ((s08) cVar.d).getValue();
        Canvas canvasA = ve.a(vm0Var.b.v());
        ez1 ez1Var = this.r;
        boolean zF = ez1.f(ez1Var.f);
        wy5 wy5Var = this.s;
        if (zF) {
            zF0 = F0(270.0f, (((long) Float.floatToRawIntBits(iVar.S(wy5Var.a(iVar.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (iVar.d() & 4294967295L)))) << 32), ez1Var.c(), canvasA);
        } else {
            zF0 = false;
        }
        if (ez1.f(ez1Var.d)) {
            j = 4294967295L;
            zF0 = F0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(iVar.S(wy5Var.b))) & 4294967295L), ez1Var.e(), canvasA) || zF0;
        } else {
            j = 4294967295L;
        }
        if (ez1.f(ez1Var.g)) {
            zF0 = F0(90.0f, (((long) Float.floatToRawIntBits(iVar.S(wy5Var.b(iVar.getLayoutDirection())) + (-((float) ok4.V(Float.intBitsToFloat((int) (iVar.d() >> 32))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << 32), ez1Var.d(), canvasA) || zF0;
        }
        if (ez1.f(ez1Var.e)) {
            EdgeEffect edgeEffectB = ez1Var.b();
            zF0 = F0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (iVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (iVar.d() & j))) + iVar.S(wy5Var.d))) & j), edgeEffectB, canvasA) || zF0;
        }
        if (zF0) {
            cVar.d();
        }
    }
}
