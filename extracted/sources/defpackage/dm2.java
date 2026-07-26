package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.d;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@jl5("fragment")
public class dm2 extends kl5 {
    public final Context c;
    public final g d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final bm2 h = new bm2(0, this);
    public final m22 i = new m22(4, this);

    public static final class a extends k79 {
        public WeakReference b;

        @Override // defpackage.k79
        public final void d() {
            WeakReference weakReference = this.b;
            if (weakReference == null) {
                js3.V("completeTransition");
                throw null;
            }
            bp2 bp2Var = (bp2) weakReference.get();
            if (bp2Var != null) {
                bp2Var.invoke();
            }
        }
    }

    public dm2(Context context, g gVar, int i) {
        this.c = context;
        this.d = gVar;
        this.e = i;
    }

    public static void k(dm2 dm2Var, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = dm2Var.g;
        if (z2) {
            kotlin.collections.a.B0(new kt(str, 4), arrayList);
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // defpackage.kl5
    public final wi5 a() {
        return new em2(this);
    }

    @Override // defpackage.kl5
    public final void d(List list, lj5 lj5Var) {
        g gVar = this.d;
        if (gVar.S()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ei5 ei5Var = (ei5) it.next();
            boolean zIsEmpty = ((List) b().e.a.getValue()).isEmpty();
            if (lj5Var == null || zIsEmpty || !lj5Var.b || !this.f.remove(ei5Var.f)) {
                p40 p40VarM = m(ei5Var, lj5Var);
                String str = ei5Var.f;
                if (!zIsEmpty) {
                    ei5 ei5Var2 = (ei5) kotlin.collections.a.v0((List) b().e.a.getValue());
                    if (ei5Var2 != null) {
                        k(this, ei5Var2.f, 6);
                    }
                    k(this, str, 6);
                    if (!p40VarM.h) {
                        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    p40VarM.g = true;
                    p40VarM.i = str;
                }
                p40VarM.e();
                if (n()) {
                    ei5Var.toString();
                }
                b().h(ei5Var);
            } else {
                gVar.z(new f(gVar, ei5Var.f, 0), false);
                b().h(ei5Var);
            }
        }
    }

    @Override // defpackage.kl5
    public final void e(final li5 li5Var) {
        this.a = li5Var;
        this.b = true;
        hm2 hm2Var = new hm2() { // from class: cm2
            @Override // defpackage.hm2
            public final void a(g gVar, d dVar) {
                Object objPrevious;
                js3.p(gVar, "<unused var>");
                js3.p(dVar, "fragment");
                li5 li5Var2 = li5Var;
                List list = (List) li5Var2.e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (js3.i(((ei5) objPrevious).f, dVar.B)) {
                            break;
                        }
                    }
                }
                ei5 ei5Var = (ei5) objPrevious;
                boolean zN = dm2.n();
                dm2 dm2Var = this;
                if (zN) {
                    dVar.toString();
                    Objects.toString(ei5Var);
                    Objects.toString(dm2Var.d);
                }
                if (ei5Var != null) {
                    dVar.W.d(dVar, new gm2(new vt(dm2Var, dVar, ei5Var, 10)));
                    dVar.U.a(dm2Var.h);
                    dm2Var.l(dVar, ei5Var, li5Var2);
                }
            }
        };
        g gVar = this.d;
        gVar.q.add(hm2Var);
        gVar.o.add(new fm2(li5Var, this));
    }

    @Override // defpackage.kl5
    public final void f(ei5 ei5Var) {
        String str = ei5Var.f;
        g gVar = this.d;
        if (gVar.S()) {
            return;
        }
        p40 p40VarM = m(ei5Var, null);
        List list = (List) b().e.a.getValue();
        if (list.size() > 1) {
            ei5 ei5Var2 = (ei5) kotlin.collections.a.q0(br9.y(list) - 1, list);
            if (ei5Var2 != null) {
                k(this, ei5Var2.f, 6);
            }
            k(this, str, 4);
            gVar.z(new ul2(gVar, str, -1), false);
            k(this, str, 2);
            if (!p40VarM.h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            p40VarM.g = true;
            p40VarM.i = str;
        }
        p40VarM.e();
        b().d(ei5Var);
    }

    @Override // defpackage.kl5
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            kotlin.collections.a.b0(stringArrayList, linkedHashSet);
        }
    }

    @Override // defpackage.kl5
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return is3.g(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // defpackage.kl5
    public final void i(ei5 ei5Var, boolean z) {
        g gVar = this.d;
        if (gVar.S()) {
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(ei5Var);
        List listSubList = list.subList(iIndexOf, list.size());
        ei5 ei5Var2 = (ei5) kotlin.collections.a.o0(list);
        ei5 ei5Var3 = (ei5) kotlin.collections.a.q0(iIndexOf - 1, list);
        if (ei5Var3 != null) {
            k(this, ei5Var3.f, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            ei5 ei5Var4 = (ei5) obj;
            if (mo7.q(new vq8(kotlin.collections.a.e0(this.g), new sl0(14)), ei5Var4.f) || !js3.i(ei5Var4.f, ei5Var2.f)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(this, ((ei5) it.next()).f, 4);
        }
        if (z) {
            for (ei5 ei5Var5 : kotlin.collections.a.H0(listSubList)) {
                if (js3.i(ei5Var5, ei5Var2)) {
                    Objects.toString(ei5Var5);
                } else {
                    gVar.z(new f(gVar, ei5Var5.f, 1), false);
                    this.f.add(ei5Var5.f);
                }
            }
        } else {
            gVar.z(new ul2(gVar, ei5Var.f, -1), false);
        }
        if (n()) {
            ei5Var.toString();
        }
        b().f(ei5Var, z);
    }

    public final void l(d dVar, ei5 ei5Var, li5 li5Var) {
        js3.p(dVar, "fragment");
        u79 u79VarM = dVar.m();
        pj9 pj9Var = new pj9(23);
        pj9Var.k(g27.a(a.class), new sl0(15));
        z7 z7VarM = pj9Var.m();
        j71 j71Var = j71.b;
        js3.p(j71Var, "defaultCreationExtras");
        o77 o77Var = new o77(u79VarM, z7VarM, j71Var);
        ps0 ps0VarA = g27.a(a.class);
        String strB = ps0VarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        ((a) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b = new WeakReference(new d(ei5Var, li5Var, this, dVar));
    }

    public final p40 m(ei5 ei5Var, lj5 lj5Var) {
        wi5 wi5Var = ei5Var.b;
        js3.n(wi5Var, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleA = ei5Var.h.a();
        String str = ((em2) wi5Var).g;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        g gVar = this.d;
        pl2 pl2VarL = gVar.L();
        context.getClassLoader();
        d dVarA = pl2VarL.a(str);
        js3.o(dVarA, "instantiate(...)");
        dVarA.u0(bundleA);
        p40 p40Var = new p40(gVar);
        int i = lj5Var != null ? lj5Var.f : -1;
        int i2 = lj5Var != null ? lj5Var.g : -1;
        int i3 = lj5Var != null ? lj5Var.h : -1;
        int i4 = lj5Var != null ? lj5Var.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            p40Var.b = i;
            p40Var.c = i2;
            p40Var.d = i3;
            p40Var.e = i5;
        }
        p40Var.k(this.e, dVarA, ei5Var.f);
        p40Var.m(dVarA);
        p40Var.p = true;
        return p40Var;
    }
}
