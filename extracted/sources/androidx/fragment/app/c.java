package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ah1;
import defpackage.fr6;
import defpackage.h69;
import defpackage.js3;
import defpackage.o28;
import defpackage.p28;
import defpackage.q69;
import defpackage.qk2;
import defpackage.rm7;
import defpackage.wv;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public c(ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static void f(wv wvVar, View view) {
        WeakHashMap weakHashMap = q69.a;
        String strF = h69.f(view);
        if (strF != null) {
            wvVar.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(wvVar, childAt);
                }
            }
        }
    }

    public static final c j(ViewGroup viewGroup, g gVar) {
        js3.p(viewGroup, "container");
        js3.p(gVar, "fragmentManager");
        js3.o(gVar.M(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(fr6.special_effects_controller_view_tag);
        if (tag instanceof c) {
            return (c) tag;
        }
        c cVar = new c(viewGroup);
        viewGroup.setTag(fr6.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (it.hasNext()) {
                p28 p28Var = (p28) it.next();
                if (!p28Var.k.isEmpty()) {
                    ArrayList arrayList2 = p28Var.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((o28) it2.next()).a()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                kotlin.collections.a.b0(((p28) it3.next()).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(p28 p28Var) {
        js3.p(p28Var, "operation");
        if (p28Var.i) {
            p28Var.a.a(p28Var.c.s0(), this.a);
            p28Var.i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.b(java.util.ArrayList, boolean):void");
    }

    public final void c(List list) {
        js3.p(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.a.b0(((p28) it.next()).k, arrayList);
        }
        List listP0 = kotlin.collections.a.P0(kotlin.collections.a.T0(arrayList));
        int size = listP0.size();
        for (int i = 0; i < size; i++) {
            ((o28) listP0.get(i)).c(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((p28) list.get(i2));
        }
        List listP02 = kotlin.collections.a.P0(list);
        int size3 = listP02.size();
        for (int i3 = 0; i3 < size3; i3++) {
            p28 p28Var = (p28) listP02.get(i3);
            if (p28Var.k.isEmpty()) {
                p28Var.b();
            }
        }
    }

    public final void d(SpecialEffectsController$Operation$State specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact, h hVar) {
        synchronized (this.b) {
            try {
                d dVar = hVar.c;
                js3.o(dVar, "fragmentStateManager.fragment");
                p28 p28VarG = g(dVar);
                if (p28VarG == null) {
                    d dVar2 = hVar.c;
                    p28VarG = (dVar2.n || dVar2.m) ? h(dVar2) : null;
                }
                if (p28VarG != null) {
                    p28VarG.d(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact);
                    return;
                }
                p28 p28Var = new p28(specialEffectsController$Operation$State, specialEffectsController$Operation$LifecycleImpact, hVar);
                this.b.add(p28Var);
                p28Var.d.add(new ah1(this, p28Var, 1));
                p28Var.d.add(new ah1(this, p28Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<p28> arrayListQ0 = kotlin.collections.a.Q0(this.c);
                this.c.clear();
                Iterator it = arrayListQ0.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    p28 p28Var = (p28) it.next();
                    if (this.b.isEmpty() || !p28Var.c.n) {
                        z = false;
                    }
                    p28Var.g = z;
                }
                for (p28 p28Var2 : arrayListQ0) {
                    if (this.d) {
                        if (g.N(2)) {
                            Objects.toString(p28Var2);
                        }
                        p28Var2.b();
                    } else {
                        if (g.N(2)) {
                            Objects.toString(p28Var2);
                        }
                        p28Var2.a(this.a);
                    }
                    this.d = false;
                    if (!p28Var2.f) {
                        this.c.add(p28Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    n();
                    ArrayList arrayListQ02 = kotlin.collections.a.Q0(this.b);
                    if (arrayListQ02.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayListQ02);
                    b(arrayListQ02, this.e);
                    boolean zK = k(arrayListQ02);
                    Iterator it2 = arrayListQ02.iterator();
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        if (!((p28) it2.next()).c.n) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zK) {
                        z = false;
                    }
                    this.d = z;
                    if (!z2) {
                        m(arrayListQ02);
                        c(arrayListQ02);
                    } else if (zK) {
                        m(arrayListQ02);
                        int size = arrayListQ02.size();
                        for (int i = 0; i < size; i++) {
                            a((p28) arrayListQ02.get(i));
                        }
                    }
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p28 g(d dVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p28 p28Var = (p28) next;
            if (js3.i(p28Var.c, dVar) && !p28Var.e) {
                break;
            }
        }
        return (p28) next;
    }

    public final p28 h(d dVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p28 p28Var = (p28) next;
            if (js3.i(p28Var.c, dVar) && !p28Var.e) {
                break;
            }
        }
        return (p28) next;
    }

    public final void i() {
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                n();
                m(this.b);
                ArrayList<p28> arrayListQ0 = kotlin.collections.a.Q0(this.c);
                Iterator it = arrayListQ0.iterator();
                while (it.hasNext()) {
                    ((p28) it.next()).g = false;
                }
                for (p28 p28Var : arrayListQ0) {
                    if (g.N(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(p28Var);
                    }
                    p28Var.a(this.a);
                }
                ArrayList<p28> arrayListQ02 = kotlin.collections.a.Q0(this.b);
                Iterator it2 = arrayListQ02.iterator();
                while (it2.hasNext()) {
                    ((p28) it2.next()).g = false;
                }
                for (p28 p28Var2 : arrayListQ02) {
                    if (g.N(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(p28Var2);
                    }
                    p28Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        Object objPrevious;
        qk2 qk2Var;
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State;
        synchronized (this.b) {
            try {
                n();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    p28 p28Var = (p28) objPrevious;
                    View view = p28Var.c.J;
                    js3.o(view, "operation.fragment.mView");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.d;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.b;
                        } else if (visibility == 4) {
                            specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.d;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.c;
                        }
                    }
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State2 = p28Var.a;
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State3 = SpecialEffectsController$Operation$State.b;
                    if (specialEffectsController$Operation$State2 == specialEffectsController$Operation$State3 && specialEffectsController$Operation$State != specialEffectsController$Operation$State3) {
                        break;
                    }
                }
                p28 p28Var2 = (p28) objPrevious;
                d dVar = p28Var2 != null ? p28Var2.c : null;
                boolean z = false;
                if (dVar != null && (qk2Var = dVar.M) != null) {
                    z = qk2Var.o;
                }
                this.f = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            p28 p28Var = (p28) list.get(i);
            h hVar = p28Var.l;
            if (!p28Var.h) {
                p28Var.h = true;
                SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = p28Var.b;
                if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.b) {
                    d dVar = hVar.c;
                    js3.o(dVar, "fragmentStateManager.fragment");
                    View viewFindFocus = dVar.J.findFocus();
                    if (viewFindFocus != null) {
                        dVar.A().n = viewFindFocus;
                        if (g.N(2)) {
                            viewFindFocus.toString();
                            dVar.toString();
                        }
                    }
                    View viewS0 = p28Var.c.s0();
                    if (viewS0.getParent() == null) {
                        if (g.N(2)) {
                            dVar.toString();
                            viewS0.toString();
                        }
                        hVar.b();
                        viewS0.setAlpha(0.0f);
                    }
                    if (viewS0.getAlpha() == 0.0f && viewS0.getVisibility() == 0) {
                        if (g.N(2)) {
                            viewS0.toString();
                        }
                        viewS0.setVisibility(4);
                    }
                    qk2 qk2Var = dVar.M;
                    viewS0.setAlpha(qk2Var == null ? 1.0f : qk2Var.m);
                    g.N(2);
                } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.c) {
                    d dVar2 = hVar.c;
                    js3.o(dVar2, "fragmentStateManager.fragment");
                    View viewS02 = dVar2.s0();
                    if (g.N(2)) {
                        Objects.toString(viewS02.findFocus());
                        viewS02.toString();
                        dVar2.toString();
                    }
                    viewS02.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.a.b0(((p28) it.next()).k, arrayList);
        }
        List listP0 = kotlin.collections.a.P0(kotlin.collections.a.T0(arrayList));
        int size2 = listP0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            o28 o28Var = (o28) listP0.get(i2);
            o28Var.getClass();
            ViewGroup viewGroup = this.a;
            js3.p(viewGroup, "container");
            if (!o28Var.a) {
                o28Var.e(viewGroup);
            }
            o28Var.a = true;
        }
    }

    public final void n() {
        SpecialEffectsController$Operation$State specialEffectsController$Operation$State;
        for (p28 p28Var : this.b) {
            if (p28Var.b == SpecialEffectsController$Operation$LifecycleImpact.b) {
                int visibility = p28Var.c.s0().getVisibility();
                if (visibility == 0) {
                    specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.b;
                } else if (visibility == 4) {
                    specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.d;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(rm7.n(visibility, "Unknown visibility "));
                    }
                    specialEffectsController$Operation$State = SpecialEffectsController$Operation$State.c;
                }
                p28Var.d(specialEffectsController$Operation$State, SpecialEffectsController$Operation$LifecycleImpact.a);
            }
        }
    }
}
