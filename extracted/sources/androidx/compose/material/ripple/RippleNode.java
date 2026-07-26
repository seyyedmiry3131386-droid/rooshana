package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material3.c;
import androidx.compose.material3.d;
import androidx.compose.ui.node.i;
import androidx.compose.ui.platform.e;
import defpackage.ab5;
import defpackage.ai0;
import defpackage.bn6;
import defpackage.br9;
import defpackage.bt2;
import defpackage.ey7;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.iv0;
import defpackage.m01;
import defpackage.mb5;
import defpackage.n97;
import defpackage.nm5;
import defpackage.nr5;
import defpackage.o40;
import defpackage.ok4;
import defpackage.ph;
import defpackage.qj1;
import defpackage.qj6;
import defpackage.rf0;
import defpackage.rj6;
import defpackage.sj6;
import defpackage.t04;
import defpackage.tj6;
import defpackage.tm0;
import defpackage.tt3;
import defpackage.v04;
import defpackage.ve;
import defpackage.vm0;
import defpackage.wv8;
import defpackage.x2;
import defpackage.y40;
import defpackage.y97;
import defpackage.zu0;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class RippleNode extends gx4 implements m01, gv1, t04 {
    private final iv0 color;
    public final ab5 o;
    public final boolean p;
    public final float q;
    public final c r;
    public ai0 s;
    public float t;
    public boolean v;
    public long u = 0;
    public final mb5 w = new mb5();

    public RippleNode(ab5 ab5Var, boolean z, float f, d dVar, c cVar) {
        this.o = ab5Var;
        this.p = z;
        this.q = f;
        this.color = dVar;
        this.r = cVar;
    }

    public final void C0(tj6 tj6Var) {
        RippleHostView rippleHostView;
        if (!(tj6Var instanceof rj6)) {
            if (tj6Var instanceof sj6) {
                RippleHostView rippleHostView2 = ((ph) this).y;
                if (rippleHostView2 != null) {
                    rippleHostView2.d();
                    return;
                }
                return;
            }
            if (!(tj6Var instanceof qj6) || (rippleHostView = ((ph) this).y) == null) {
                return;
            }
            rippleHostView.d();
            return;
        }
        rj6 rj6Var = (rj6) tj6Var;
        long j = this.u;
        float f = this.t;
        ph phVar = (ph) this;
        RippleContainer rippleContainer = phVar.x;
        if (rippleContainer == null) {
            Object obj = (View) y97.t(phVar, e.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    RippleContainer rippleContainer2 = new RippleContainer(viewGroup.getContext());
                    viewGroup.addView(rippleContainer2);
                    rippleContainer = rippleContainer2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof RippleContainer) {
                        rippleContainer = (RippleContainer) childAt;
                        break;
                    }
                    i++;
                }
            }
            phVar.x = rippleContainer;
        }
        ArrayList arrayList = rippleContainer.b;
        bn6 bn6Var = rippleContainer.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) bn6Var.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) bn6Var.b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) bn6Var.c;
        RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap.get(phVar);
        if (rippleHostView3 == null) {
            rippleHostView3 = (RippleHostView) kotlin.collections.a.E0(rippleContainer.c);
            if (rippleHostView3 == null) {
                if (rippleContainer.e > br9.y(arrayList)) {
                    rippleHostView3 = new RippleHostView(rippleContainer.getContext());
                    rippleContainer.addView(rippleHostView3);
                    arrayList.add(rippleHostView3);
                } else {
                    rippleHostView3 = (RippleHostView) arrayList.get(rippleContainer.e);
                    ph phVar2 = (ph) linkedHashMap3.get(rippleHostView3);
                    if (phVar2 != null) {
                        phVar2.y = null;
                        rf0.z(phVar2);
                        RippleHostView rippleHostView4 = (RippleHostView) linkedHashMap2.get(phVar2);
                        if (rippleHostView4 != null) {
                        }
                        linkedHashMap2.remove(phVar2);
                        rippleHostView3.c();
                    }
                }
                int i2 = rippleContainer.e;
                if (i2 < rippleContainer.a - 1) {
                    rippleContainer.e = i2 + 1;
                } else {
                    rippleContainer.e = 0;
                }
            }
            linkedHashMap2.put(phVar, rippleHostView3);
            linkedHashMap3.put(rippleHostView3, phVar);
        }
        RippleHostView rippleHostView5 = rippleHostView3;
        int iV = ok4.V(f);
        long jA = phVar.color.a();
        phVar.r.invoke();
        rippleHostView5.b(rj6Var, phVar.p, j, iV, jA, new x2(2, phVar));
        phVar.y = rippleHostView5;
        rf0.z(phVar);
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        vm0 vm0Var = iVar.a;
        iVar.a();
        ai0 ai0Var = this.s;
        if (ai0Var != null) {
            float f = this.t;
            long jA = this.color.a();
            float fFloatValue = ((Number) ((androidx.compose.animation.core.a) ai0Var.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = zu0.b(fFloatValue, jA);
                if (ai0Var.a) {
                    float fE = ey7.e(iVar.d());
                    float fC = ey7.c(iVar.d());
                    wv8 wv8Var = vm0Var.b;
                    long jA2 = wv8Var.A();
                    wv8Var.v().e();
                    try {
                        ((wv8) ((nm5) wv8Var.b).b).v().m(0.0f, 0.0f, fE, fC, 1);
                        o40.g(iVar, jB, f, 0L, null, 124);
                    } finally {
                        o40.F(wv8Var, jA2);
                    }
                } else {
                    o40.g(iVar, jB, f, 0L, null, 124);
                }
            }
        }
        ph phVar = (ph) this;
        tm0 tm0VarV = vm0Var.b.v();
        RippleHostView rippleHostView = phVar.y;
        if (rippleHostView != null) {
            long j = phVar.u;
            int iV = ok4.V(phVar.t);
            long jA3 = phVar.color.a();
            phVar.r.invoke();
            rippleHostView.m0setRipplePropertiesbiQXAtU(j, iV, jA3, 0.1f);
            rippleHostView.draw(ve.a(tm0VarV));
        }
    }

    @Override // defpackage.t04
    public final /* synthetic */ void k(v04 v04Var) {
    }

    @Override // defpackage.t04
    public final void n(long j) {
        float fS;
        this.v = true;
        qj1 qj1Var = y40.H(this).A;
        this.u = tt3.M(j);
        float f = this.q;
        if (Float.isNaN(f)) {
            long j2 = this.u;
            float f2 = n97.a;
            fS = nr5.d(y40.f(ey7.e(j2), ey7.c(j2))) / 2.0f;
            if (this.p) {
                fS += qj1Var.S(n97.a);
            }
        } else {
            fS = qj1Var.S(f);
        }
        this.t = fS;
        mb5 mb5Var = this.w;
        Object[] objArr = mb5Var.a;
        int i = mb5Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            C0((tj6) objArr[i2]);
        }
        mb5Var.j();
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.gx4
    public final void s0() {
        bt2.G(o0(), null, null, new RippleNode$onAttach$1(this, null), 3);
    }
}
