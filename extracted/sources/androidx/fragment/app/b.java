package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b7;
import defpackage.bp2;
import defpackage.c79;
import defpackage.dn2;
import defpackage.f40;
import defpackage.g7;
import defpackage.h69;
import defpackage.ih1;
import defpackage.in2;
import defpackage.jh1;
import defpackage.jn2;
import defpackage.js3;
import defpackage.kn2;
import defpackage.o28;
import defpackage.p28;
import defpackage.q69;
import defpackage.qm0;
import defpackage.tx8;
import defpackage.wu0;
import defpackage.wv;
import defpackage.xt5;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o28 {
    public final ArrayList c;
    public final p28 d;
    public final p28 e;
    public final kn2 f;
    public final Object g;
    public final ArrayList h;
    public final ArrayList i;
    public final wv j;
    public final ArrayList k;
    public final ArrayList l;
    public final wv m;
    public final wv n;
    public final qm0 o = new qm0();
    public Object p;
    public boolean q;

    public b(ArrayList arrayList, p28 p28Var, p28 p28Var2, kn2 kn2Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, wv wvVar, ArrayList arrayList4, ArrayList arrayList5, wv wvVar2, wv wvVar3, boolean z) {
        this.c = arrayList;
        this.d = p28Var;
        this.e = p28Var2;
        this.f = kn2Var;
        this.g = obj;
        this.h = arrayList2;
        this.i = arrayList3;
        this.j = wvVar;
        this.k = arrayList4;
        this.l = arrayList5;
        this.m = wvVar2;
        this.n = wvVar3;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = c79.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // defpackage.o28
    public final boolean a() {
        kn2 kn2Var = this.f;
        if (!kn2Var.l()) {
            return false;
        }
        ArrayList arrayList = this.c;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                jh1 jh1Var = (jh1) it.next();
                if (Build.VERSION.SDK_INT < 34) {
                    return false;
                }
                jh1Var.getClass();
                return false;
            }
        }
        Object obj = this.g;
        return obj == null || kn2Var.m(obj);
    }

    @Override // defpackage.o28
    public final void b(ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        this.o.a();
    }

    @Override // defpackage.o28
    public final void c(final ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList<jh1> arrayList = this.c;
        if (!zIsLaidOut || this.q) {
            for (jh1 jh1Var : arrayList) {
                p28 p28Var = (p28) jh1Var.b;
                if (g.N(2)) {
                    if (this.q) {
                        Objects.toString(p28Var);
                    } else {
                        viewGroup.toString();
                        Objects.toString(p28Var);
                    }
                }
                ((p28) jh1Var.b).c(this);
            }
            this.q = false;
            return;
        }
        Object obj = this.p;
        kn2 kn2Var = this.f;
        p28 p28Var2 = this.e;
        p28 p28Var3 = this.d;
        if (obj != null) {
            kn2Var.c(obj);
            if (g.N(2)) {
                Objects.toString(p28Var3);
                Objects.toString(p28Var2);
                return;
            }
            return;
        }
        Pair pairG = g(viewGroup, p28Var2, p28Var3);
        ArrayList arrayList2 = (ArrayList) pairG.a;
        final Object obj2 = pairG.b;
        ArrayList<p28> arrayList3 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add((p28) ((jh1) it.next()).b);
        }
        for (p28 p28Var4 : arrayList3) {
            kn2Var.u(p28Var4.c, obj2, this.o, new ih1(p28Var4, this, 1));
        }
        i(arrayList2, viewGroup, new bp2() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.f.e(viewGroup, obj2);
                return tx8.a;
            }
        });
        if (g.N(2)) {
            Objects.toString(p28Var3);
            Objects.toString(p28Var2);
        }
    }

    @Override // defpackage.o28
    public final void d(f40 f40Var, ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        Object obj = this.p;
        if (obj != null) {
            this.f.r(obj, f40Var.c);
        }
    }

    @Override // defpackage.o28
    public final void e(final ViewGroup viewGroup) {
        Object obj;
        js3.p(viewGroup, "container");
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.c;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p28 p28Var = (p28) ((jh1) it.next()).b;
                if (g.N(2)) {
                    viewGroup.toString();
                    Objects.toString(p28Var);
                }
            }
            return;
        }
        boolean zH = h();
        p28 p28Var2 = this.e;
        p28 p28Var3 = this.d;
        if (zH && (obj = this.g) != null && !a()) {
            Objects.toString(obj);
            Objects.toString(p28Var3);
            Objects.toString(p28Var2);
        }
        if (a() && h()) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Pair pairG = g(viewGroup, p28Var2, p28Var3);
            ArrayList arrayList2 = (ArrayList) pairG.a;
            final Object obj2 = pairG.b;
            ArrayList<p28> arrayList3 = new ArrayList(wu0.V(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((p28) ((jh1) it2.next()).b);
            }
            for (p28 p28Var4 : arrayList3) {
                b7 b7Var = new b7(16, ref$ObjectRef);
                d dVar = p28Var4.c;
                this.f.v(obj2, this.o, b7Var, new ih1(p28Var4, this, 0));
            }
            i(arrayList2, viewGroup, new bp2() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    final b bVar = this.g;
                    kn2 kn2Var = bVar.f;
                    final ViewGroup viewGroup2 = viewGroup;
                    final Object obj3 = obj2;
                    Object objI = kn2Var.i(viewGroup2, obj3);
                    bVar.p = objI;
                    if (objI == null) {
                        bVar.q = true;
                    } else {
                        ref$ObjectRef.a = new bp2() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.bp2
                            public final Object invoke() {
                                b bVar2 = bVar;
                                ArrayList arrayList4 = bVar2.c;
                                kn2 kn2Var2 = bVar2.f;
                                if (arrayList4.isEmpty()) {
                                    Object obj4 = bVar2.p;
                                    js3.m(obj4);
                                    kn2Var2.d(obj4, new g7(bVar2, viewGroup2, 16));
                                } else {
                                    Iterator it3 = arrayList4.iterator();
                                    while (it3.hasNext()) {
                                        if (!((p28) ((jh1) it3.next()).b).g) {
                                            qm0 qm0Var = new qm0();
                                            kn2Var2.u(((p28) ((jh1) arrayList4.get(0)).b).c, obj3, qm0Var, new b7(18, bVar2));
                                            qm0Var.a();
                                            break;
                                        }
                                    }
                                    Object obj42 = bVar2.p;
                                    js3.m(obj42);
                                    kn2Var2.d(obj42, new g7(bVar2, viewGroup2, 16));
                                }
                                return tx8.a;
                            }
                        };
                        if (g.N(2)) {
                            Objects.toString(bVar.d);
                            Objects.toString(bVar.e);
                        }
                    }
                    return tx8.a;
                }
            });
        }
    }

    public final Pair g(ViewGroup viewGroup, p28 p28Var, p28 p28Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        kn2 kn2Var;
        Object obj2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList5 = this.c;
        Iterator it = arrayList5.iterator();
        View view2 = null;
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.i;
            arrayList2 = this.h;
            obj = this.g;
            kn2Var = this.f;
            if (!zHasNext) {
                break;
            }
            if (((jh1) it.next()).d == null || p28Var2 == null || p28Var == null || this.j.isEmpty() || obj == null) {
                arrayList4 = arrayList5;
            } else {
                d dVar = p28Var.c;
                d dVar2 = p28Var2.c;
                in2 in2Var = dn2.a;
                arrayList4 = arrayList5;
                js3.p(dVar, "inFragment");
                js3.p(dVar2, "outFragment");
                xt5.a(viewGroup, new g7(p28Var, p28Var2, this));
                wv wvVar = this.m;
                arrayList2.addAll(wvVar.values());
                ArrayList arrayList6 = this.l;
                if (!arrayList6.isEmpty()) {
                    Object obj3 = arrayList6.get(0);
                    js3.o(obj3, "exitingNames[0]");
                    View view3 = (View) wvVar.get((String) obj3);
                    kn2Var.s(view3, obj);
                    view2 = view3;
                }
                wv wvVar2 = this.n;
                arrayList.addAll(wvVar2.values());
                ArrayList arrayList7 = this.k;
                if (!arrayList7.isEmpty()) {
                    Object obj4 = arrayList7.get(0);
                    js3.o(obj4, "enteringNames[0]");
                    View view4 = (View) wvVar2.get((String) obj4);
                    if (view4 != null) {
                        xt5.a(viewGroup, new g7(kn2Var, view4, rect));
                        z = true;
                    }
                }
                kn2Var.w(obj, view, arrayList2);
                Object obj5 = this.g;
                kn2Var.q(obj5, null, null, obj5, arrayList);
            }
            arrayList5 = arrayList4;
        }
        ArrayList arrayList8 = arrayList5;
        ArrayList arrayList9 = arrayList;
        ArrayList arrayList10 = new ArrayList();
        Iterator it2 = arrayList8.iterator();
        Object objO = null;
        Object objO2 = null;
        while (it2.hasNext()) {
            jh1 jh1Var = (jh1) it2.next();
            ArrayList arrayList11 = arrayList9;
            p28 p28Var3 = (p28) jh1Var.b;
            Iterator it3 = it2;
            boolean z2 = z;
            Object objH = kn2Var.h(null);
            if (objH != null) {
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = arrayList2;
                d dVar3 = p28Var3.c;
                Object obj6 = obj;
                View view5 = dVar3.J;
                Object obj7 = objO2;
                js3.o(view5, "operation.fragment.mView");
                f(view5, arrayList12);
                if (obj6 != null && (p28Var3 == p28Var2 || p28Var3 == p28Var)) {
                    if (p28Var3 == p28Var2) {
                        arrayList12.removeAll(kotlin.collections.a.T0(arrayList13));
                    } else {
                        arrayList12.removeAll(kotlin.collections.a.T0(arrayList11));
                    }
                }
                if (arrayList12.isEmpty()) {
                    kn2Var.a(view, objH);
                    arrayList3 = arrayList12;
                    obj2 = objH;
                } else {
                    kn2Var.b(objH, arrayList12);
                    kn2Var.q(objH, objH, arrayList12, null, null);
                    obj2 = objH;
                    arrayList3 = arrayList12;
                    if (p28Var3.a == SpecialEffectsController$Operation$State.c) {
                        p28Var3.i = false;
                        ArrayList arrayList14 = new ArrayList(arrayList3);
                        arrayList14.remove(dVar3.J);
                        kn2Var.p(obj2, dVar3.J, arrayList14);
                        xt5.a(viewGroup, new b7(17, arrayList3));
                    }
                }
                if (p28Var3.a == SpecialEffectsController$Operation$State.b) {
                    arrayList10.addAll(arrayList3);
                    if (z2) {
                        kn2Var.t(obj2, rect);
                    }
                    if (g.N(2)) {
                        obj2.toString();
                        for (Object obj8 : arrayList3) {
                            js3.o(obj8, "transitioningViews");
                            ((View) obj8).toString();
                        }
                    }
                } else {
                    kn2Var.s(view2, obj2);
                    if (g.N(2)) {
                        obj2.toString();
                        for (Object obj9 : arrayList3) {
                            js3.o(obj9, "transitioningViews");
                            ((View) obj9).toString();
                        }
                    }
                }
                if (jh1Var.c) {
                    objO = kn2Var.o(objO, obj2);
                    z = z2;
                    arrayList9 = arrayList11;
                    it2 = it3;
                    arrayList2 = arrayList13;
                    obj = obj6;
                    objO2 = obj7;
                } else {
                    objO2 = kn2Var.o(obj7, obj2);
                    z = z2;
                    arrayList9 = arrayList11;
                    it2 = it3;
                    arrayList2 = arrayList13;
                    obj = obj6;
                }
            } else {
                z = z2;
                arrayList9 = arrayList11;
                it2 = it3;
            }
        }
        Object objN = kn2Var.n(objO, objO2, obj);
        if (g.N(2)) {
            Objects.toString(objN);
            viewGroup.toString();
        }
        return new Pair(arrayList10, objN);
    }

    public final boolean h() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((p28) ((jh1) it.next()).b).c.n) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, bp2 bp2Var) {
        dn2.a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.i;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = q69.a;
            arrayList2.add(h69.f(view));
            h69.n(view, null);
        }
        boolean zN = g.N(2);
        ArrayList arrayList4 = this.h;
        if (zN) {
            for (Object obj : arrayList4) {
                js3.o(obj, "sharedElementFirstOutViews");
                View view2 = (View) obj;
                view2.toString();
                WeakHashMap weakHashMap2 = q69.a;
                h69.f(view2);
            }
            for (Object obj2 : arrayList3) {
                js3.o(obj2, "sharedElementLastInViews");
                View view3 = (View) obj2;
                view3.toString();
                WeakHashMap weakHashMap3 = q69.a;
                h69.f(view3);
            }
        }
        bp2Var.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = q69.a;
            String strF = h69.f(view4);
            arrayList5.add(strF);
            if (strF != null) {
                h69.n(view4, null);
                String str = (String) this.j.get(strF);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        h69.n((View) arrayList3.get(i3), strF);
                        break;
                    }
                    i3++;
                }
            }
        }
        xt5.a(viewGroup, new jn2(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        dn2.a(0, arrayList);
        this.f.x(this.g, arrayList4, arrayList3);
    }
}
