package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import defpackage.dw1;
import defpackage.f69;
import defpackage.fr6;
import defpackage.g27;
import defpackage.hh2;
import defpackage.hm2;
import defpackage.i64;
import defpackage.j71;
import defpackage.js3;
import defpackage.m28;
import defpackage.mg;
import defpackage.o40;
import defpackage.o77;
import defpackage.p28;
import defpackage.pl2;
import defpackage.ps0;
import defpackage.q28;
import defpackage.q69;
import defpackage.rk2;
import defpackage.ry6;
import defpackage.ta4;
import defpackage.tk2;
import defpackage.u79;
import defpackage.va4;
import defpackage.vp7;
import defpackage.wl2;
import defpackage.yl2;
import defpackage.ym2;
import defpackage.zm2;
import defpackage.zn2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final hh2 a;
    public final vp7 b;
    public final d c;
    public boolean d = false;
    public int e = -1;

    public h(hh2 hh2Var, vp7 vp7Var, d dVar) {
        this.a = hh2Var;
        this.b = vp7Var;
        this.c = dVar;
    }

    public final void a() {
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        Bundle bundle = dVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        dVar.x.U();
        dVar.a = 3;
        dVar.H = false;
        dVar.T(bundle2);
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onActivityCreated()"));
        }
        if (g.N(3)) {
            dVar.toString();
        }
        if (dVar.J != null) {
            Bundle bundle3 = dVar.b;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = dVar.c;
            if (sparseArray != null) {
                dVar.J.restoreHierarchyState(sparseArray);
                dVar.c = null;
            }
            dVar.H = false;
            dVar.l0(bundle4);
            if (!dVar.H) {
                throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onViewStateRestored()"));
            }
            if (dVar.J != null) {
                dVar.V.a(Lifecycle$Event.ON_CREATE);
            }
        }
        dVar.b = null;
        wl2 wl2Var = dVar.x;
        wl2Var.I = false;
        wl2Var.J = false;
        wl2Var.P.g = false;
        wl2Var.v(4);
        this.a.j(dVar, false);
    }

    public final void b() {
        d dVar;
        View view;
        View view2;
        d dVar2 = this.c;
        View view3 = dVar2.I;
        while (true) {
            dVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(fr6.fragment_container_view_tag);
            d dVar3 = tag instanceof d ? (d) tag : null;
            if (dVar3 != null) {
                dVar = dVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        d dVar4 = dVar2.y;
        if (dVar != null && !dVar.equals(dVar4)) {
            int i = dVar2.A;
            ym2 ym2Var = zm2.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(dVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(dVar);
            sb.append(" via container with ID ");
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(dVar2, dw1.k(i, " without using parent's childFragmentManager", sb));
            zm2.c(wrongNestedHierarchyViolation);
            ym2 ym2VarA = zm2.a(dVar2);
            if (ym2VarA.a.contains(FragmentStrictMode$Flag.e) && zm2.e(ym2VarA, dVar2.getClass(), WrongNestedHierarchyViolation.class)) {
                zm2.b(ym2VarA, wrongNestedHierarchyViolation);
            }
        }
        ArrayList arrayList = (ArrayList) this.b.b;
        ViewGroup viewGroup = dVar2.I;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(dVar2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        d dVar5 = (d) arrayList.get(iIndexOf);
                        if (dVar5.I == viewGroup && (view = dVar5.J) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    d dVar6 = (d) arrayList.get(i2);
                    if (dVar6.I == viewGroup && (view2 = dVar6.J) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        dVar2.I.addView(dVar2.J, iIndexOfChild);
    }

    public final void c() {
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        d dVar2 = dVar.h;
        h hVar = null;
        vp7 vp7Var = this.b;
        if (dVar2 != null) {
            h hVar2 = (h) ((HashMap) vp7Var.c).get(dVar2.f);
            if (hVar2 == null) {
                throw new IllegalStateException("Fragment " + dVar + " declared target fragment " + dVar.h + " that does not belong to this FragmentManager!");
            }
            dVar.i = dVar.h.f;
            dVar.h = null;
            hVar = hVar2;
        } else {
            String str = dVar.i;
            if (str != null && (hVar = (h) ((HashMap) vp7Var.c).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(dVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(dw1.s(sb, dVar.i, " that does not belong to this FragmentManager!"));
            }
        }
        if (hVar != null) {
            hVar.k();
        }
        g gVar = dVar.v;
        dVar.w = gVar.x;
        dVar.y = gVar.z;
        hh2 hh2Var = this.a;
        hh2Var.p(dVar, false);
        ArrayList arrayList = dVar.x0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rk2) it.next()).a();
        }
        arrayList.clear();
        dVar.x.b(dVar.w, dVar.w(), dVar);
        dVar.a = 0;
        dVar.H = false;
        dVar.W(dVar.w.t);
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onAttach()"));
        }
        g gVar2 = dVar.v;
        Iterator it2 = gVar2.q.iterator();
        while (it2.hasNext()) {
            ((hm2) it2.next()).a(gVar2, dVar);
        }
        wl2 wl2Var = dVar.x;
        wl2Var.I = false;
        wl2Var.J = false;
        wl2Var.P.g = false;
        wl2Var.v(0);
        hh2Var.k(dVar, false);
    }

    public final int d() {
        d dVar = this.c;
        if (dVar.v == null) {
            return dVar.a;
        }
        int iMin = this.e;
        int iOrdinal = dVar.T.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (dVar.p) {
            if (dVar.q) {
                iMin = Math.max(this.e, 2);
                View view = dVar.J;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, dVar.a) : Math.min(iMin, 1);
            }
        }
        if (dVar.r && dVar.I == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!dVar.l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = dVar.I;
        if (viewGroup != null) {
            c cVarJ = c.j(viewGroup, dVar.J());
            p28 p28VarG = cVarJ.g(dVar);
            SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = p28VarG != null ? p28VarG.b : null;
            p28 p28VarH = cVarJ.h(dVar);
            specialEffectsController$Operation$LifecycleImpact = p28VarH != null ? p28VarH.b : null;
            int i = specialEffectsController$Operation$LifecycleImpact == null ? -1 : q28.a[specialEffectsController$Operation$LifecycleImpact.ordinal()];
            if (i != -1 && i != 1) {
                specialEffectsController$Operation$LifecycleImpact = specialEffectsController$Operation$LifecycleImpact;
            }
        }
        if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.b) {
            iMin = Math.min(iMin, 6);
        } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.c) {
            iMin = Math.max(iMin, 3);
        } else if (dVar.m) {
            iMin = dVar.S() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (dVar.K && dVar.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (dVar.n) {
            iMin = Math.max(iMin, 3);
        }
        if (g.N(2)) {
            Objects.toString(dVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        Bundle bundle2 = dVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (dVar.R) {
            dVar.a = 1;
            Bundle bundle4 = dVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            dVar.x.b0(bundle);
            wl2 wl2Var = dVar.x;
            wl2Var.I = false;
            wl2Var.J = false;
            wl2Var.P.g = false;
            wl2Var.v(1);
            return;
        }
        hh2 hh2Var = this.a;
        hh2Var.q(dVar, false);
        dVar.x.U();
        dVar.a = 1;
        dVar.H = false;
        dVar.U.a(new ry6(4, dVar));
        dVar.X(bundle3);
        dVar.R = true;
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onCreate()"));
        }
        dVar.U.d(Lifecycle$Event.ON_CREATE);
        hh2Var.l(dVar, bundle3, false);
    }

    public final void f() {
        String resourceName;
        d dVar = this.c;
        if (dVar.p) {
            return;
        }
        int i = 3;
        if (g.N(3)) {
            Objects.toString(dVar);
        }
        Bundle bundle = dVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterD0 = dVar.d0(bundle2);
        dVar.Q = layoutInflaterD0;
        ViewGroup viewGroup = dVar.I;
        if (viewGroup == null) {
            int i2 = dVar.A;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    throw new IllegalArgumentException(dw1.m("Cannot create fragment ", dVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) dVar.v.y.A(i2);
                if (viewGroup == null) {
                    if (!dVar.s && !dVar.r) {
                        try {
                            resourceName = dVar.K().getResourceName(dVar.A);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(dVar.A) + " (" + resourceName + ") for fragment " + dVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    ym2 ym2Var = zm2.a;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(dVar, "Attempting to add fragment " + dVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                    zm2.c(wrongFragmentContainerViolation);
                    ym2 ym2VarA = zm2.a(dVar);
                    if (ym2VarA.a.contains(FragmentStrictMode$Flag.h) && zm2.e(ym2VarA, dVar.getClass(), WrongFragmentContainerViolation.class)) {
                        zm2.b(ym2VarA, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        dVar.I = viewGroup;
        dVar.m0(layoutInflaterD0, viewGroup, bundle2);
        if (dVar.J != null) {
            if (g.N(3)) {
                Objects.toString(dVar);
            }
            dVar.J.setSaveFromParentEnabled(false);
            dVar.J.setTag(fr6.fragment_container_view_tag, dVar);
            if (viewGroup != null) {
                b();
            }
            if (dVar.C) {
                dVar.J.setVisibility(8);
            }
            if (dVar.J.isAttachedToWindow()) {
                View view = dVar.J;
                WeakHashMap weakHashMap = q69.a;
                f69.c(view);
            } else {
                View view2 = dVar.J;
                view2.addOnAttachStateChangeListener(new mg(i, view2));
            }
            Bundle bundle3 = dVar.b;
            dVar.k0(dVar.J, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            dVar.x.v(2);
            this.a.v(dVar, dVar.J, bundle2, false);
            int visibility = dVar.J.getVisibility();
            dVar.A().m = dVar.J.getAlpha();
            if (dVar.I != null && visibility == 0) {
                View viewFindFocus = dVar.J.findFocus();
                if (viewFindFocus != null) {
                    dVar.A().n = viewFindFocus;
                    if (g.N(2)) {
                        viewFindFocus.toString();
                        Objects.toString(dVar);
                    }
                }
                dVar.J.setAlpha(0.0f);
            }
        }
        dVar.a = 2;
    }

    public final void g() {
        d dVarC;
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = dVar.m && !dVar.S();
        vp7 vp7Var = this.b;
        if (z && !dVar.o) {
            vp7Var.y0(null, dVar.f);
        }
        if (!z) {
            yl2 yl2Var = (yl2) vp7Var.e;
            if (!((yl2Var.b.containsKey(dVar.f) && yl2Var.e) ? yl2Var.f : true)) {
                String str = dVar.i;
                if (str != null && (dVarC = vp7Var.C(str)) != null && dVarC.E) {
                    dVar.h = dVarC;
                }
                dVar.a = 0;
                return;
            }
        }
        tk2 tk2Var = dVar.w;
        if (tk2Var != null) {
            zIsChangingConfigurations = ((yl2) vp7Var.e).f;
        } else {
            FragmentActivity fragmentActivity = tk2Var.t;
            if (o40.O(fragmentActivity)) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z && !dVar.o) || zIsChangingConfigurations) {
            yl2 yl2Var2 = (yl2) vp7Var.e;
            yl2Var2.getClass();
            if (g.N(3)) {
                Objects.toString(dVar);
            }
            yl2Var2.f(dVar.f, false);
        }
        dVar.x.m();
        dVar.U.d(Lifecycle$Event.ON_DESTROY);
        dVar.a = 0;
        dVar.H = false;
        dVar.R = false;
        dVar.a0();
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onDestroy()"));
        }
        this.a.m(dVar, false);
        for (h hVar : vp7Var.J()) {
            if (hVar != null) {
                d dVar2 = hVar.c;
                if (dVar.f.equals(dVar2.i)) {
                    dVar2.h = dVar;
                    dVar2.i = null;
                }
            }
        }
        String str2 = dVar.i;
        if (str2 != null) {
            dVar.h = vp7Var.C(str2);
        }
        vp7Var.r0(this);
    }

    public final void h() {
        View view;
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        ViewGroup viewGroup = dVar.I;
        if (viewGroup != null && (view = dVar.J) != null) {
            viewGroup.removeView(view);
        }
        dVar.x.v(1);
        if (dVar.J != null) {
            zn2 zn2Var = dVar.V;
            zn2Var.b();
            if (zn2Var.e.d.compareTo(Lifecycle$State.c) >= 0) {
                dVar.V.a(Lifecycle$Event.ON_DESTROY);
            }
        }
        dVar.a = 1;
        dVar.H = false;
        dVar.b0();
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onDestroyView()"));
        }
        u79 u79VarM = dVar.m();
        js3.p(u79VarM, "store");
        j71 j71Var = j71.b;
        js3.p(j71Var, "defaultCreationExtras");
        o77 o77Var = new o77(u79VarM, va4.d, j71Var);
        ps0 ps0VarA = g27.a(va4.class);
        String strB = ps0VarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        m28 m28Var = ((va4) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
        int iF = m28Var.f();
        for (int i = 0; i < iF; i++) {
            ((ta4) m28Var.g(i)).i();
        }
        dVar.t = false;
        this.a.w(dVar, false);
        dVar.I = null;
        dVar.J = null;
        dVar.V = null;
        dVar.W.h(null);
        dVar.q = false;
    }

    public final void i() {
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        dVar.a = -1;
        dVar.H = false;
        dVar.c0();
        dVar.Q = null;
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onDetach()"));
        }
        wl2 wl2Var = dVar.x;
        if (!wl2Var.K) {
            wl2Var.m();
            dVar.x = new wl2();
        }
        this.a.n(dVar, false);
        dVar.a = -1;
        dVar.w = null;
        dVar.y = null;
        dVar.v = null;
        if (!dVar.m || dVar.S()) {
            yl2 yl2Var = (yl2) this.b.e;
            if (!((yl2Var.b.containsKey(dVar.f) && yl2Var.e) ? yl2Var.f : true)) {
                return;
            }
        }
        if (g.N(3)) {
            Objects.toString(dVar);
        }
        dVar.P();
    }

    public final void j() {
        d dVar = this.c;
        if (dVar.p && dVar.q && !dVar.t) {
            if (g.N(3)) {
                Objects.toString(dVar);
            }
            Bundle bundle = dVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterD0 = dVar.d0(bundle2);
            dVar.Q = layoutInflaterD0;
            dVar.m0(layoutInflaterD0, null, bundle2);
            View view = dVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                dVar.J.setTag(fr6.fragment_container_view_tag, dVar);
                if (dVar.C) {
                    dVar.J.setVisibility(8);
                }
                Bundle bundle3 = dVar.b;
                dVar.k0(dVar.J, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                dVar.x.v(2);
                this.a.v(dVar, dVar.J, bundle2, false);
                dVar.a = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0128, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.k():void");
    }

    public final void l() {
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        dVar.x.v(5);
        if (dVar.J != null) {
            dVar.V.a(Lifecycle$Event.ON_PAUSE);
        }
        dVar.U.d(Lifecycle$Event.ON_PAUSE);
        dVar.a = 6;
        dVar.H = false;
        dVar.f0();
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onPause()"));
        }
        this.a.o(dVar, false);
    }

    public final void m(ClassLoader classLoader) {
        d dVar = this.c;
        Bundle bundle = dVar.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (dVar.b.getBundle("savedInstanceState") == null) {
            dVar.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            dVar.c = dVar.b.getSparseParcelableArray("viewState");
            dVar.d = dVar.b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) dVar.b.getParcelable("state");
            if (fragmentState != null) {
                dVar.i = fragmentState.m;
                dVar.j = fragmentState.n;
                Boolean bool = dVar.e;
                if (bool != null) {
                    dVar.L = bool.booleanValue();
                    dVar.e = null;
                } else {
                    dVar.L = fragmentState.o;
                }
            }
            if (dVar.L) {
                return;
            }
            dVar.K = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + dVar, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.g.N(r0)
            androidx.fragment.app.d r1 = r6.c
            if (r0 == 0) goto Lc
            j$.util.Objects.toString(r1)
        Lc:
            qk2 r0 = r1.M
            r2 = 0
            if (r0 != 0) goto L13
            r0 = r2
            goto L15
        L13:
            android.view.View r0 = r0.n
        L15:
            if (r0 == 0) goto L45
            android.view.View r3 = r1.J
            if (r0 != r3) goto L1c
            goto L26
        L1c:
            android.view.ViewParent r3 = r0.getParent()
        L20:
            if (r3 == 0) goto L45
            android.view.View r4 = r1.J
            if (r3 != r4) goto L40
        L26:
            r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.g.N(r3)
            if (r3 == 0) goto L45
            r0.toString()
            j$.util.Objects.toString(r1)
            android.view.View r0 = r1.J
            android.view.View r0 = r0.findFocus()
            j$.util.Objects.toString(r0)
            goto L45
        L40:
            android.view.ViewParent r3 = r3.getParent()
            goto L20
        L45:
            qk2 r0 = r1.A()
            r0.n = r2
            wl2 r0 = r1.x
            r0.U()
            wl2 r0 = r1.x
            r3 = 1
            r0.B(r3)
            r0 = 7
            r1.a = r0
            r3 = 0
            r1.H = r3
            r1.g0()
            boolean r4 = r1.H
            if (r4 == 0) goto L95
            i64 r4 = r1.U
            androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle$Event.ON_RESUME
            r4.d(r5)
            android.view.View r4 = r1.J
            if (r4 == 0) goto L75
            zn2 r4 = r1.V
            i64 r4 = r4.e
            r4.d(r5)
        L75:
            wl2 r4 = r1.x
            r4.I = r3
            r4.J = r3
            yl2 r5 = r4.P
            r5.g = r3
            r4.v(r0)
            hh2 r0 = r6.a
            r0.r(r1, r3)
            vp7 r0 = r6.b
            java.lang.String r3 = r1.f
            r0.y0(r2, r3)
            r1.b = r2
            r1.c = r2
            r1.d = r2
            return
        L95:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = defpackage.dw1.m(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.n():void");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        d dVar = this.c;
        if (dVar.a == -1 && (bundle = dVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(dVar));
        if (dVar.a > 0) {
            Bundle bundle3 = new Bundle();
            dVar.h0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.s(dVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            dVar.Y.w(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleC0 = dVar.x.c0();
            if (!bundleC0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleC0);
            }
            if (dVar.J != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = dVar.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = dVar.d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = dVar.g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        d dVar = this.c;
        if (dVar.J == null) {
            return;
        }
        if (g.N(2)) {
            Objects.toString(dVar);
            Objects.toString(dVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        dVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            dVar.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        dVar.V.f.w(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        dVar.d = bundle;
    }

    public final void q() {
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        dVar.x.U();
        dVar.x.B(true);
        dVar.a = 5;
        dVar.H = false;
        dVar.i0();
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onStart()"));
        }
        i64 i64Var = dVar.U;
        Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_START;
        i64Var.d(lifecycle$Event);
        if (dVar.J != null) {
            dVar.V.e.d(lifecycle$Event);
        }
        wl2 wl2Var = dVar.x;
        wl2Var.I = false;
        wl2Var.J = false;
        wl2Var.P.g = false;
        wl2Var.v(5);
        this.a.t(dVar, false);
    }

    public final void r() {
        boolean zN = g.N(3);
        d dVar = this.c;
        if (zN) {
            Objects.toString(dVar);
        }
        wl2 wl2Var = dVar.x;
        wl2Var.J = true;
        wl2Var.P.g = true;
        wl2Var.v(4);
        if (dVar.J != null) {
            dVar.V.a(Lifecycle$Event.ON_STOP);
        }
        dVar.U.d(Lifecycle$Event.ON_STOP);
        dVar.a = 4;
        dVar.H = false;
        dVar.j0();
        if (!dVar.H) {
            throw new SuperNotCalledException(dw1.m("Fragment ", dVar, " did not call through to super.onStop()"));
        }
        this.a.u(dVar, false);
    }

    public h(hh2 hh2Var, vp7 vp7Var, ClassLoader classLoader, pl2 pl2Var, Bundle bundle) {
        this.a = hh2Var;
        this.b = vp7Var;
        d dVarA = ((FragmentState) bundle.getParcelable("state")).a(pl2Var);
        this.c = dVarA;
        dVarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        dVarA.u0(bundle2);
        if (g.N(2)) {
            Objects.toString(dVarA);
        }
    }

    public h(hh2 hh2Var, vp7 vp7Var, d dVar, Bundle bundle) {
        this.a = hh2Var;
        this.b = vp7Var;
        this.c = dVar;
        dVar.c = null;
        dVar.d = null;
        dVar.u = 0;
        dVar.q = false;
        dVar.l = false;
        d dVar2 = dVar.h;
        dVar.i = dVar2 != null ? dVar2.f : null;
        dVar.h = null;
        dVar.b = bundle;
        dVar.g = bundle.getBundle("arguments");
    }
}
