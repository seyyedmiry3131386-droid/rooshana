package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.node.i;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class r78 extends ti1 implements gv1 {
    public final c q;
    public final ez1 r;
    public RenderNode s;

    public r78(f fVar, c cVar, ez1 ez1Var) {
        this.q = cVar;
        this.r = ez1Var;
        C0(fVar);
    }

    public static boolean F0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode G0() {
        RenderNode renderNode = this.s;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = uc0.b();
        this.s = renderNodeB;
        return renderNodeB;
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        c cVar;
        boolean z;
        boolean zF0;
        char c;
        float f;
        float f2;
        float f3;
        vm0 vm0Var = iVar.a;
        long jA = vm0Var.b.A();
        c cVar2 = this.q;
        cVar2.i(jA);
        Canvas canvasA = ve.a(vm0Var.b.v());
        ((s08) cVar2.d).getValue();
        wv8 wv8Var = vm0Var.b;
        if (ey7.f(wv8Var.A())) {
            iVar.a();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        ez1 ez1Var = this.r;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = ez1Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = ez1Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = ez1Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = ez1Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = ez1Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = ez1Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = ez1Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = ez1Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            iVar.a();
            return;
        }
        float fS = iVar.S(ot0.a);
        boolean z2 = ez1.f(ez1Var.d) || ez1.g(ez1Var.h) || ez1.f(ez1Var.e) || ez1.g(ez1Var.i);
        boolean z3 = ez1.f(ez1Var.f) || ez1.g(ez1Var.j) || ez1.f(ez1Var.g) || ez1.g(ez1Var.k);
        if (z2 && z3) {
            G0().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z2) {
            G0().setPosition(0, 0, (ok4.V(fS) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z3) {
                iVar.a();
                return;
            }
            G0().setPosition(0, 0, canvasA.getWidth(), (ok4.V(fS) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = G0().beginRecording();
        if (ez1.g(ez1Var.j)) {
            EdgeEffect edgeEffectA = ez1Var.j;
            if (edgeEffectA == null) {
                edgeEffectA = ez1Var.a(Orientation.b);
                ez1Var.j = edgeEffectA;
            }
            F0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (ez1.f(ez1Var.f)) {
            EdgeEffect edgeEffectC = ez1Var.c();
            zF0 = F0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (ez1.g(ez1Var.f)) {
                z = z3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar2.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = ez1Var.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = ez1Var.a(Orientation.b);
                    ez1Var.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fJ = i >= 31 ? zc.j(edgeEffectC) : 0.0f;
                cVar = cVar2;
                float f4 = 1 - fIntBitsToFloat;
                if (i >= 31) {
                    zc.p(edgeEffectA2, fJ, f4);
                } else {
                    edgeEffectA2.onPull(fJ, f4);
                }
            } else {
                cVar = cVar2;
                z = z3;
            }
        } else {
            cVar = cVar2;
            z = z3;
            zF0 = false;
        }
        if (ez1.g(ez1Var.h)) {
            EdgeEffect edgeEffectA3 = ez1Var.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = ez1Var.a(Orientation.a);
                ez1Var.h = edgeEffectA3;
            }
            F0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (ez1.f(ez1Var.d)) {
            EdgeEffect edgeEffectE = ez1Var.e();
            boolean z4 = F0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zF0;
            if (ez1.g(ez1Var.d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.c() >> 32));
                EdgeEffect edgeEffectA4 = ez1Var.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = ez1Var.a(Orientation.a);
                    ez1Var.h = edgeEffectA4;
                }
                c = ' ';
                int i2 = Build.VERSION.SDK_INT;
                float fJ2 = i2 >= 31 ? zc.j(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    zc.p(edgeEffectA4, fJ2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fJ2, fIntBitsToFloat2);
                }
            } else {
                c = ' ';
            }
            zF0 = z4;
        } else {
            c = ' ';
        }
        if (ez1.g(ez1Var.k)) {
            EdgeEffect edgeEffectA5 = ez1Var.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = ez1Var.a(Orientation.b);
                ez1Var.k = edgeEffectA5;
            }
            F0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
            edgeEffectA5.finish();
        }
        if (ez1.f(ez1Var.g)) {
            EdgeEffect edgeEffectD = ez1Var.d();
            boolean z5 = F0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zF0;
            if (ez1.g(ez1Var.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = ez1Var.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = ez1Var.a(Orientation.b);
                    ez1Var.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fJ3 = i3 >= 31 ? zc.j(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    zc.p(edgeEffectA6, fJ3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fJ3, fIntBitsToFloat3);
                }
            }
            zF0 = z5;
        }
        if (ez1.g(ez1Var.i)) {
            EdgeEffect edgeEffectA7 = ez1Var.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = ez1Var.a(Orientation.a);
                ez1Var.i = edgeEffectA7;
            }
            f = 0.0f;
            F0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
            edgeEffectA7.finish();
        } else {
            f = 0.0f;
        }
        if (ez1.f(ez1Var.e)) {
            EdgeEffect edgeEffectB = ez1Var.b();
            boolean z6 = F0(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zF0;
            if (ez1.g(ez1Var.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (cVar.c() >> c));
                EdgeEffect edgeEffectA8 = ez1Var.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = ez1Var.a(Orientation.a);
                    ez1Var.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fJ4 = i4 >= 31 ? zc.j(edgeEffectB) : f;
                float f5 = 1 - fIntBitsToFloat4;
                if (i4 >= 31) {
                    zc.p(edgeEffectA8, fJ4, f5);
                } else {
                    edgeEffectA8.onPull(fJ4, f5);
                }
            }
            zF0 = z6;
        }
        if (zF0) {
            cVar.d();
        }
        float f6 = z ? 0.0f : fS;
        if (z2) {
            fS = 0.0f;
        }
        LayoutDirection layoutDirection = iVar.getLayoutDirection();
        ue ueVar = new ue();
        ueVar.a = recordingCanvasBeginRecording;
        long jA2 = wv8Var.A();
        qj1 qj1VarX = vm0Var.b.x();
        LayoutDirection layoutDirectionZ = vm0Var.b.z();
        tm0 tm0VarV = vm0Var.b.v();
        long jA3 = vm0Var.b.A();
        wv8 wv8Var2 = vm0Var.b;
        a aVar = (a) wv8Var2.c;
        wv8Var2.N(iVar);
        wv8Var2.O(layoutDirection);
        wv8Var2.M(ueVar);
        wv8Var2.P(jA2);
        wv8Var2.c = null;
        ueVar.e();
        try {
            ((nm5) iVar.a.b.b).z(f6, fS);
            try {
                iVar.a();
                ueVar.o();
                wv8 wv8Var3 = vm0Var.b;
                wv8Var3.N(qj1VarX);
                wv8Var3.O(layoutDirectionZ);
                wv8Var3.M(tm0VarV);
                wv8Var3.P(jA3);
                wv8Var3.c = aVar;
                G0().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f2, f3);
                canvasA.drawRenderNode(G0());
                canvasA.restoreToCount(iSave);
            } finally {
                ((nm5) iVar.a.b.b).z(-f6, -fS);
            }
        } catch (Throwable th) {
            ueVar.o();
            wv8 wv8Var4 = vm0Var.b;
            wv8Var4.N(qj1VarX);
            wv8Var4.O(layoutDirectionZ);
            wv8Var4.M(tm0VarV);
            wv8Var4.P(jA3);
            wv8Var4.c = aVar;
            throw th;
        }
    }
}
