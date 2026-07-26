package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ab5;
import defpackage.ah6;
import defpackage.ah7;
import defpackage.bh7;
import defpackage.bt2;
import defpackage.c35;
import defpackage.dy3;
import defpackage.e3;
import defpackage.e71;
import defpackage.ez1;
import defpackage.g51;
import defpackage.hh6;
import defpackage.hy3;
import defpackage.in7;
import defpackage.js3;
import defpackage.nn7;
import defpackage.ox3;
import defpackage.qe1;
import defpackage.qj1;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.rf0;
import defpackage.ru1;
import defpackage.t17;
import defpackage.tx3;
import defpackage.tx8;
import defpackage.ub1;
import defpackage.vg6;
import defpackage.wb1;
import defpackage.xg7;
import defpackage.y40;
import defpackage.zc;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class n extends e implements hy3, in7 {
    public androidx.compose.foundation.c I;
    public qe1 J;
    public final androidx.compose.ui.input.nestedscroll.a K;
    public final xg7 L;
    public final qe1 M;
    public final o N;
    public final l O;
    public final androidx.compose.ui.focus.d P;
    public final b Q;
    public m R;
    public qp2 S;
    public i T;

    public n(qe1 qe1Var, ab5 ab5Var, bh7 bh7Var, androidx.compose.foundation.c cVar, Orientation orientation, boolean z, boolean z2) {
        super(h.a, z, ab5Var, orientation);
        this.I = cVar;
        this.J = qe1Var;
        androidx.compose.ui.input.nestedscroll.a aVar = new androidx.compose.ui.input.nestedscroll.a();
        this.K = aVar;
        xg7 xg7Var = new xg7();
        xg7Var.o = z;
        C0(xg7Var);
        this.L = xg7Var;
        qe1 qe1Var2 = new qe1(new wb1(new c35(h.d)));
        this.M = qe1Var2;
        androidx.compose.foundation.c cVar2 = this.I;
        qe1 qe1Var3 = this.J;
        o oVar = new o(bh7Var, cVar2, qe1Var3 == null ? qe1Var2 : qe1Var3, orientation, z2, aVar, this, new ah7(this, 0));
        this.N = oVar;
        l lVar = new l(oVar, z);
        this.O = lVar;
        androidx.compose.ui.focus.d dVar = new androidx.compose.ui.focus.d(2, null, 10);
        C0(dVar);
        this.P = dVar;
        b bVar = new b(orientation, oVar, z2, new ah7(this, 1));
        C0(bVar);
        this.Q = bVar;
        C0(new androidx.compose.ui.input.nestedscroll.d(lVar, aVar));
        androidx.compose.foundation.relocation.b bVar2 = new androidx.compose.foundation.relocation.b();
        bVar2.o = bVar;
        C0(bVar2);
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.e
    public final Object J0(qp2 qp2Var, g51 g51Var) {
        MutatePriority mutatePriority = MutatePriority.b;
        o oVar = this.N;
        Object objF = oVar.f(mutatePriority, new ScrollableNode$drag$2$1(null, qp2Var, oVar), (ContinuationImpl) g51Var);
        return objF == CoroutineSingletons.a ? objF : tx8.a;
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void O0(long j) {
    }

    @Override // androidx.compose.foundation.gestures.e
    public final void P0(ru1 ru1Var) {
        bt2.G(this.K.c(), null, null, new ScrollableNode$onDragStopped$1(ru1Var, this, null), 3);
    }

    @Override // androidx.compose.foundation.gestures.e
    public final boolean U0() {
        o oVar = this.N;
        if (oVar.a.a()) {
            return true;
        }
        androidx.compose.foundation.c cVar = oVar.b;
        if (cVar == null) {
            return false;
        }
        ez1 ez1Var = cVar.c;
        EdgeEffect edgeEffect = ez1Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? zc.j(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = ez1Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? zc.j(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = ez1Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? zc.j(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = ez1Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? zc.j(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void X0(qe1 qe1Var, ab5 ab5Var, bh7 bh7Var, androidx.compose.foundation.c cVar, Orientation orientation, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.s != z) {
            this.O.b = z;
            this.L.o = z;
            z3 = true;
        } else {
            z3 = false;
        }
        qe1 qe1Var2 = qe1Var == null ? this.M : qe1Var;
        o oVar = this.N;
        if (!js3.i(oVar.a, bh7Var)) {
            oVar.a = bh7Var;
            z5 = true;
        }
        oVar.b = cVar;
        if (oVar.d != orientation) {
            oVar.d = orientation;
            z5 = true;
        }
        if (oVar.e != z2) {
            oVar.e = z2;
        } else {
            z4 = z5;
        }
        oVar.c = qe1Var2;
        oVar.f = this.K;
        b bVar = this.Q;
        bVar.o = orientation;
        bVar.q = z2;
        this.I = cVar;
        this.J = qe1Var;
        Orientation orientation2 = oVar.d;
        Orientation orientation3 = Orientation.a;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.b;
        }
        W0(h.a, z, ab5Var, orientation3, z4);
        if (z3) {
            this.R = null;
            this.S = null;
            t17.f(this);
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.hy3
    public final boolean i(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.foundation.gestures.m] */
    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        if (this.s && (this.R == null || this.S == null)) {
            this.R = new qp2() { // from class: androidx.compose.foundation.gestures.m
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj).floatValue();
                    float fFloatValue2 = ((Float) obj2).floatValue();
                    n nVar = this.a;
                    bt2.G(nVar.o0(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(nVar, fFloatValue, fFloatValue2, null), 3);
                    return Boolean.TRUE;
                }
            };
            this.S = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        m mVar = this.R;
        if (mVar != null) {
            ox3[] ox3VarArr = androidx.compose.ui.semantics.f.a;
            nn7Var.a(androidx.compose.ui.semantics.a.d, new e3(null, mVar));
        }
        qp2 qp2Var = this.S;
        if (qp2Var != null) {
            ox3[] ox3VarArr2 = androidx.compose.ui.semantics.f.a;
            nn7Var.a(androidx.compose.ui.semantics.a.e, qp2Var);
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.gx4
    public final void s0() {
        if (this.n) {
            qj1 qj1Var = y40.H(this).A;
            qe1 qe1Var = this.M;
            qe1Var.getClass();
            qe1Var.a = new wb1(new c35(qj1Var));
        }
        i iVar = this.T;
        if (iVar != null) {
            iVar.d = y40.H(this).A;
        }
    }

    @Override // androidx.compose.foundation.gestures.e, defpackage.dh6
    public final void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        List list = vg6Var.a;
        List list2 = vg6Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.r.invoke(new hh6(((ah6) list.get(i)).i))).booleanValue()) {
                super.t(vg6Var, pointerEventPass, j);
                break;
            }
            i++;
        }
        if (this.s) {
            if (pointerEventPass == PointerEventPass.a && vg6Var.f == 6) {
                if (this.T == null) {
                    this.T = new i(this.N, new ql4(3, ViewConfiguration.get(rf0.J(this).getContext())), new ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(2, this, n.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), y40.H(this).A);
                }
                i iVar = this.T;
                if (iVar != null) {
                    e71 e71VarO0 = o0();
                    if (iVar.g == null) {
                        iVar.g = bt2.G(e71VarO0, null, null, new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(iVar, null), 3);
                    }
                }
            }
            i iVar2 = this.T;
            if (iVar2 == null || vg6Var.f != 6) {
                return;
            }
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (((ah6) list2.get(i2)).b()) {
                    return;
                }
            }
            if (pointerEventPass == PointerEventPass.a && iVar2.f) {
                iVar2.d(vg6Var, j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((ah6) list2.get(i3)).a();
                }
            }
            if (pointerEventPass == PointerEventPass.b && !iVar2.f && iVar2.d(vg6Var, j)) {
                int size4 = list2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ah6) list2.get(i4)).a();
                }
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.e, defpackage.gx4
    public final void t0() {
        B();
        if (this.n) {
            qj1 qj1Var = y40.H(this).A;
            qe1 qe1Var = this.M;
            qe1Var.getClass();
            qe1Var.a = new wb1(new c35(qj1Var));
        }
        i iVar = this.T;
        if (iVar != null) {
            iVar.d = y40.H(this).A;
        }
    }

    @Override // defpackage.hy3
    public final boolean x(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.s) {
            return false;
        }
        if ((!tx3.a(dy3.w(keyEvent), tx3.D) && !tx3.a(ub1.d(keyEvent.getKeyCode()), tx3.C)) || dy3.z(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        Orientation orientation = this.N.d;
        Orientation orientation2 = Orientation.a;
        b bVar = this.Q;
        if (orientation == orientation2) {
            int i = (int) (bVar.u & 4294967295L);
            float f = tx3.a(ub1.d(keyEvent.getKeyCode()), tx3.C) ? i : -i;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            int i2 = (int) (bVar.u >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(tx3.a(ub1.d(keyEvent.getKeyCode()), tx3.C) ? i2 : -i2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        bt2.G(o0(), null, null, new ScrollableNode$onKeyEvent$1(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null), 3);
        return true;
    }
}
