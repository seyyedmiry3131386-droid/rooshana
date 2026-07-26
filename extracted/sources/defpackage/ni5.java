package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class ni5 {
    public final ij5 a;
    public final ji5 b;
    public fj5 c;
    public Bundle d;
    public Bundle[] e;
    public final ov f = new ov();
    public final l g;
    public final l h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public g64 m;
    public oi5 n;
    public final ArrayList o;
    public Lifecycle$State p;
    public final bm2 q;
    public final ll5 r;
    public final LinkedHashMap s;
    public dp2 t;
    public u51 u;
    public final LinkedHashMap v;
    public int w;
    public final ArrayList x;
    public final i y;

    public ni5(ij5 ij5Var, ji5 ji5Var) {
        this.a = ij5Var;
        this.b = ji5Var;
        EmptyList emptyList = EmptyList.a;
        this.g = ja1.b(emptyList);
        this.h = ja1.b(emptyList);
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.o = new ArrayList();
        this.p = Lifecycle$State.b;
        this.q = new bm2(1, this);
        this.r = new ll5();
        this.s = new LinkedHashMap();
        this.v = new LinkedHashMap();
        this.x = new ArrayList();
        this.y = vy2.e(1, 2, BufferOverflow.b);
    }

    public static wi5 d(int i, wi5 wi5Var, wi5 wi5Var2, boolean z) {
        if (wi5Var.b.a == i && (wi5Var2 == null || (wi5Var.equals(wi5Var2) && js3.i(wi5Var.c, wi5Var2.c)))) {
            return wi5Var;
        }
        fj5 fj5Var = wi5Var instanceof fj5 ? (fj5) wi5Var : null;
        if (fj5Var == null) {
            fj5Var = wi5Var.c;
            js3.m(fj5Var);
        }
        return fj5Var.g.f(i, fj5Var, wi5Var2, z);
    }

    public static /* synthetic */ void n(ni5 ni5Var, ei5 ei5Var) {
        ni5Var.m(ei5Var, false, new ov());
    }

    public final void a(wi5 wi5Var, Bundle bundle, ei5 ei5Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        jc0 jc0Var = this.a.c;
        wi5 wi5Var2 = ei5Var.b;
        boolean z = wi5Var2 instanceof ve2;
        ov ovVar = this.f;
        if (!z) {
            while (!ovVar.isEmpty() && (((ei5) ovVar.last()).b instanceof ve2) && l(((ei5) ovVar.last()).b.b.a, true, false)) {
            }
        }
        ov<ei5> ovVar2 = new ov();
        Object obj = null;
        if (wi5Var instanceof fj5) {
            wi5 wi5Var3 = wi5Var2;
            do {
                js3.m(wi5Var3);
                wi5Var3 = wi5Var3.c;
                if (wi5Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (js3.i(((ei5) objPrevious2).b, wi5Var3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    ei5 ei5VarI = (ei5) objPrevious2;
                    if (ei5VarI == null) {
                        ei5VarI = ql3.i(jc0Var, wi5Var3, bundle, h(), this.n);
                    }
                    ovVar2.addFirst(ei5VarI);
                    if (!ovVar.isEmpty() && ((ei5) ovVar.last()).b == wi5Var3) {
                        n(this, (ei5) ovVar.last());
                    }
                }
                if (wi5Var3 == null) {
                    break;
                }
            } while (wi5Var3 != wi5Var);
        }
        wi5 wi5Var4 = ovVar2.isEmpty() ? wi5Var2 : ((ei5) ovVar2.first()).b;
        while (wi5Var4 != null && c(wi5Var4.b.a, wi5Var4) != wi5Var4) {
            wi5Var4 = wi5Var4.c;
            if (wi5Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (js3.i(((ei5) objPrevious).b, wi5Var4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                ei5 ei5VarI2 = (ei5) objPrevious;
                if (ei5VarI2 == null) {
                    ei5VarI2 = ql3.i(jc0Var, wi5Var4, wi5Var4.a(bundle2), h(), this.n);
                }
                ovVar2.addFirst(ei5VarI2);
            }
        }
        if (!ovVar2.isEmpty()) {
            wi5Var2 = ((ei5) ovVar2.first()).b;
        }
        while (!ovVar.isEmpty() && (((ei5) ovVar.last()).b instanceof fj5)) {
            wi5 wi5Var5 = ((ei5) ovVar.last()).b;
            js3.n(wi5Var5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((m28) ((fj5) wi5Var5).g.c).c(wi5Var2.b.a) != null) {
                break;
            } else {
                n(this, (ei5) ovVar.last());
            }
        }
        ei5 ei5Var2 = (ei5) ovVar.h();
        if (ei5Var2 == null) {
            ei5Var2 = (ei5) ovVar2.h();
        }
        if (!js3.i(ei5Var2 != null ? ei5Var2.b : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                wi5 wi5Var6 = ((ei5) objPrevious3).b;
                fj5 fj5Var = this.c;
                js3.m(fj5Var);
                if (js3.i(wi5Var6, fj5Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            ei5 ei5VarI3 = (ei5) obj;
            if (ei5VarI3 == null) {
                fj5 fj5Var2 = this.c;
                js3.m(fj5Var2);
                fj5 fj5Var3 = this.c;
                js3.m(fj5Var3);
                ei5VarI3 = ql3.i(jc0Var, fj5Var2, fj5Var3.a(bundle), h(), this.n);
            }
            ovVar2.addFirst(ei5VarI3);
        }
        for (ei5 ei5Var3 : ovVar2) {
            Object obj2 = this.s.get(this.r.b(ei5Var3.b.a));
            if (obj2 == null) {
                throw new IllegalStateException(dw1.s(new StringBuilder("NavigatorBackStack for "), wi5Var.a, " should already be created").toString());
            }
            ((li5) obj2).a(ei5Var3);
        }
        ovVar.addAll(ovVar2);
        ovVar.addLast(ei5Var);
        for (ei5 ei5Var4 : a.A0(ei5Var, ovVar2)) {
            fj5 fj5Var4 = ei5Var4.b.c;
            if (fj5Var4 != null) {
                j(ei5Var4, e(fj5Var4.b.a));
            }
        }
    }

    public final boolean b() {
        ov ovVar;
        while (true) {
            ovVar = this.f;
            if (ovVar.isEmpty() || !(((ei5) ovVar.last()).b instanceof fj5)) {
                break;
            }
            n(this, (ei5) ovVar.last());
        }
        ei5 ei5Var = (ei5) ovVar.j();
        ArrayList arrayList = this.x;
        if (ei5Var != null) {
            arrayList.add(ei5Var);
        }
        this.w++;
        s();
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            ArrayList<ei5> arrayListQ0 = a.Q0(arrayList);
            arrayList.clear();
            for (ei5 ei5Var2 : arrayListQ0) {
                for (el5 el5Var : a.P0(this.o)) {
                    wi5 wi5Var = ei5Var2.b;
                    ei5Var2.h.a();
                    el5Var.a(this.a, wi5Var);
                }
                this.y.e(ei5Var2);
            }
            ArrayList arrayListQ02 = a.Q0(ovVar);
            l lVar = this.g;
            lVar.getClass();
            lVar.p(null, arrayListQ02);
            ArrayList arrayListO = o();
            l lVar2 = this.h;
            lVar2.getClass();
            lVar2.p(null, arrayListO);
        }
        return ei5Var != null;
    }

    public final wi5 c(int i, wi5 wi5Var) {
        wi5 wi5Var2;
        fj5 fj5Var = this.c;
        if (fj5Var == null) {
            return null;
        }
        if (fj5Var.b.a == i) {
            if (wi5Var == null) {
                return fj5Var;
            }
            if (js3.i(fj5Var, wi5Var) && wi5Var.c == null) {
                return this.c;
            }
        }
        ei5 ei5Var = (ei5) this.f.j();
        if (ei5Var == null || (wi5Var2 = ei5Var.b) == null) {
            wi5Var2 = this.c;
            js3.m(wi5Var2);
        }
        return d(i, wi5Var2, wi5Var, false);
    }

    public final ei5 e(int i) {
        Object objPrevious;
        ov ovVar = this.f;
        ListIterator<E> listIterator = ovVar.listIterator(ovVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((ei5) objPrevious).b.b.a == i) {
                break;
            }
        }
        ei5 ei5Var = (ei5) objPrevious;
        if (ei5Var != null) {
            return ei5Var;
        }
        StringBuilder sbR = rm7.r(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbR.append(f());
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final wi5 f() {
        ei5 ei5Var = (ei5) this.f.j();
        if (ei5Var != null) {
            return ei5Var.b;
        }
        return null;
    }

    public final fj5 g() {
        fj5 fj5Var = this.c;
        if (fj5Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        js3.n(fj5Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return fj5Var;
    }

    public final Lifecycle$State h() {
        return this.m == null ? Lifecycle$State.c : this.p;
    }

    public final fj5 i() {
        wi5 wi5Var;
        ei5 ei5Var = (ei5) this.f.j();
        if (ei5Var == null || (wi5Var = ei5Var.b) == null) {
            wi5Var = this.c;
            js3.m(wi5Var);
        }
        fj5 fj5Var = wi5Var instanceof fj5 ? (fj5) wi5Var : null;
        if (fj5Var != null) {
            return fj5Var;
        }
        fj5 fj5Var2 = wi5Var.c;
        js3.m(fj5Var2);
        return fj5Var2;
    }

    public final void j(ei5 ei5Var, ei5 ei5Var2) {
        this.i.put(ei5Var, ei5Var2);
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap.get(ei5Var2) == null) {
            linkedHashMap.put(ei5Var2, new zx());
        }
        Object obj = linkedHashMap.get(ei5Var2);
        js3.m(obj);
        ((zx) obj).a.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.wi5 r25, android.os.Bundle r26, defpackage.lj5 r27) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni5.k(wi5, android.os.Bundle, lj5):void");
    }

    public final boolean l(int i, boolean z, boolean z2) {
        wi5 wi5Var;
        ni5 ni5Var;
        boolean z3;
        ov ovVar = this.f;
        final int i2 = 0;
        if (ovVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a.H0(ovVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                wi5Var = null;
                break;
            }
            wi5Var = ((ei5) it.next()).b;
            String str = wi5Var.a;
            yb ybVar = wi5Var.b;
            kl5 kl5VarB = this.r.b(str);
            if (z || ybVar.a != i) {
                arrayList.add(kl5VarB);
            }
            if (ybVar.a == i) {
                break;
            }
        }
        if (wi5Var == null) {
            int i3 = wi5.f;
            js3.p("Ignoring popBackStack to destination " + m91.s(this.a.c, i) + " as it was not found on the current back stack", "message");
            return false;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ov ovVar2 = new ov();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                ni5Var = this;
                z3 = z2;
                break;
            }
            kl5 kl5Var = (kl5) it2.next();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            ei5 ei5Var = (ei5) ovVar.last();
            ni5Var = this;
            z3 = z2;
            u51 u51Var = new u51(ref$BooleanRef2, ref$BooleanRef, ni5Var, z3, ovVar2);
            js3.p(kl5Var, "navigator");
            js3.p(ei5Var, "popUpTo");
            ni5Var.u = u51Var;
            kl5Var.i(ei5Var, z3);
            ni5Var.u = null;
            if (!ref$BooleanRef2.a) {
                break;
            }
            z2 = z3;
        }
        if (z3) {
            int i4 = 4;
            LinkedHashMap linkedHashMap = ni5Var.k;
            if (!z) {
                oc2 oc2Var = new oc2(new gq1(mo7.s(new i25(15), wi5Var), new dp2(this) { // from class: mi5
                    public final /* synthetic */ ni5 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        wi5 wi5Var2 = (wi5) obj;
                        switch (i2) {
                            case 0:
                                js3.p(wi5Var2, "destination");
                                zContainsKey = this.b.k.containsKey(Integer.valueOf(wi5Var2.b.a));
                                break;
                            default:
                                js3.p(wi5Var2, "destination");
                                zContainsKey = this.b.k.containsKey(Integer.valueOf(wi5Var2.b.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, i4));
                while (oc2Var.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((wi5) oc2Var.next()).b.a);
                    hi5 hi5Var = (hi5) ovVar2.h();
                    linkedHashMap.put(numValueOf, hi5Var != null ? (String) hi5Var.a.b : null);
                }
            }
            if (!ovVar2.isEmpty()) {
                jx9 jx9Var = ((hi5) ovVar2.first()).a;
                final int i5 = 1;
                oc2 oc2Var2 = new oc2(new gq1(mo7.s(new i25(16), c(jx9Var.a, null)), new dp2(this) { // from class: mi5
                    public final /* synthetic */ ni5 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        wi5 wi5Var2 = (wi5) obj;
                        switch (i5) {
                            case 0:
                                js3.p(wi5Var2, "destination");
                                zContainsKey = this.b.k.containsKey(Integer.valueOf(wi5Var2.b.a));
                                break;
                            default:
                                js3.p(wi5Var2, "destination");
                                zContainsKey = this.b.k.containsKey(Integer.valueOf(wi5Var2.b.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, i4));
                while (oc2Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((wi5) oc2Var2.next()).b.a), (String) jx9Var.b);
                }
                if (linkedHashMap.values().contains((String) jx9Var.b)) {
                    ni5Var.l.put((String) jx9Var.b, ovVar2);
                }
            }
        }
        ni5Var.b.invoke();
        return ref$BooleanRef.a;
    }

    public final void m(ei5 ei5Var, boolean z, ov ovVar) {
        oi5 oi5Var;
        rv6 rv6Var;
        Set set;
        js3.p(ei5Var, "popUpTo");
        ov ovVar2 = this.f;
        ei5 ei5Var2 = (ei5) ovVar2.last();
        if (!js3.i(ei5Var2, ei5Var)) {
            throw new IllegalStateException(("Attempted to pop " + ei5Var.b + ", which is not the top of the back stack (" + ei5Var2.b + ')').toString());
        }
        a.F0(ovVar2);
        li5 li5Var = (li5) this.s.get(this.r.b(ei5Var2.b.a));
        boolean z2 = true;
        if ((li5Var == null || (rv6Var = li5Var.f) == null || (set = (Set) rv6Var.a.getValue()) == null || !set.contains(ei5Var2)) && !this.j.containsKey(ei5Var2)) {
            z2 = false;
        }
        Lifecycle$State lifecycle$State = ei5Var2.h.j.d;
        Lifecycle$State lifecycle$State2 = Lifecycle$State.c;
        if (lifecycle$State.compareTo(lifecycle$State2) >= 0) {
            if (z) {
                ei5Var2.a(lifecycle$State2);
                ovVar.addFirst(new hi5(ei5Var2));
            }
            if (z2) {
                ei5Var2.a(lifecycle$State2);
            } else {
                ei5Var2.a(Lifecycle$State.a);
                r(ei5Var2);
            }
        }
        if (z || z2 || (oi5Var = this.n) == null) {
            return;
        }
        String str = ei5Var2.f;
        js3.p(str, "backStackEntryId");
        u79 u79Var = (u79) oi5Var.b.remove(str);
        if (u79Var != null) {
            u79Var.a();
        }
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.s.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((li5) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                ei5 ei5Var = (ei5) obj;
                if (!arrayList.contains(ei5Var) && ei5Var.h.k.compareTo(Lifecycle$State.d) < 0) {
                    arrayList2.add(obj);
                }
            }
            a.b0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            ei5 ei5Var2 = (ei5) obj2;
            if (!arrayList.contains(ei5Var2) && ei5Var2.h.k.compareTo(Lifecycle$State.d) >= 0) {
                arrayList3.add(obj2);
            }
        }
        a.b0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((ei5) obj3).b instanceof fj5)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean p(int i, Bundle bundle, lj5 lj5Var) {
        wi5 wi5VarG;
        ei5 ei5Var;
        wi5 wi5Var;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.k;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        a.C0(linkedHashMap.values(), new kt(str, 8));
        ov<hi5> ovVar = (ov) wu8.h(this.l).remove(str);
        jc0 jc0Var = this.a.c;
        ArrayList arrayList = new ArrayList();
        ei5 ei5Var2 = (ei5) this.f.j();
        if (ei5Var2 == null || (wi5VarG = ei5Var2.b) == null) {
            wi5VarG = g();
        }
        if (ovVar != null) {
            for (hi5 hi5Var : ovVar) {
                jx9 jx9Var = hi5Var.a;
                jx9 jx9Var2 = hi5Var.a;
                wi5 wi5VarD = d(jx9Var.a, wi5VarG, null, true);
                if (wi5VarD == null) {
                    int i2 = wi5.f;
                    throw new IllegalStateException(("Restore State failed: destination " + m91.s(jc0Var, jx9Var2.a) + " cannot be found from the current destination " + wi5VarG).toString());
                }
                Lifecycle$State lifecycle$StateH = h();
                oi5 oi5Var = this.n;
                js3.p(jc0Var, "context");
                js3.p(lifecycle$StateH, "hostLifecycleState");
                Bundle bundle2 = (Bundle) jx9Var2.c;
                if (bundle2 != null) {
                    bundle2.setClassLoader(jc0Var.a.getClassLoader());
                } else {
                    bundle2 = null;
                }
                String str2 = (String) jx9Var2.b;
                Bundle bundle3 = (Bundle) jx9Var2.d;
                js3.p(str2, "id");
                arrayList.add(new ei5(jc0Var, wi5VarD, bundle2, lifecycle$StateH, oi5Var, str2, bundle3));
                wi5VarG = wi5VarD;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<ei5> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((ei5) obj).b instanceof fj5)) {
                arrayList3.add(obj);
            }
        }
        for (ei5 ei5Var3 : arrayList3) {
            List list = (List) a.v0(arrayList2);
            if (js3.i((list == null || (ei5Var = (ei5) a.u0(list)) == null || (wi5Var = ei5Var.b) == null) ? null : wi5Var.a, ei5Var3.b.a)) {
                list.add(ei5Var3);
            } else {
                arrayList2.add(br9.E(ei5Var3));
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List list2 : arrayList2) {
            kl5 kl5VarB = this.r.b(((ei5) a.o0(list2)).b.a);
            ArrayList arrayList4 = arrayList;
            this.t = new rg(ref$BooleanRef, arrayList4, new Ref$IntRef(), this, bundle, 3);
            kl5VarB.d(list2, lj5Var);
            this.t = null;
            arrayList = arrayList4;
        }
        return ref$BooleanRef.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0292  */
    /* JADX WARN: Type inference failed for: r20v1, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v15, types: [fj5, wi5] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(defpackage.fj5 r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 1389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni5.q(fj5, android.os.Bundle):void");
    }

    public final void r(ei5 ei5Var) {
        js3.p(ei5Var, "child");
        ei5 ei5Var2 = (ei5) this.i.remove(ei5Var);
        if (ei5Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.j;
        zx zxVar = (zx) linkedHashMap.get(ei5Var2);
        Integer numValueOf = zxVar != null ? Integer.valueOf(zxVar.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            li5 li5Var = (li5) this.s.get(this.r.b(ei5Var2.b.a));
            if (li5Var != null) {
                li5Var.c(ei5Var2);
            }
            linkedHashMap.remove(ei5Var2);
        }
    }

    public final void s() {
        zx zxVar;
        rv6 rv6Var;
        Set set;
        ArrayList<ei5> arrayListQ0 = a.Q0(this.f);
        if (arrayListQ0.isEmpty()) {
            return;
        }
        ArrayList arrayListE = br9.E(((ei5) a.u0(arrayListQ0)).b);
        ArrayList arrayList = new ArrayList();
        if (a.u0(arrayListE) instanceof ve2) {
            Iterator it = a.H0(arrayListQ0).iterator();
            while (it.hasNext()) {
                wi5 wi5Var = ((ei5) it.next()).b;
                arrayList.add(wi5Var);
                if (!(wi5Var instanceof ve2) && !(wi5Var instanceof fj5)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (ei5 ei5Var : a.H0(arrayListQ0)) {
            Lifecycle$State lifecycle$State = ei5Var.h.k;
            wi5 wi5Var2 = ei5Var.b;
            wi5 wi5Var3 = (wi5) a.p0(arrayListE);
            if (wi5Var3 != null && wi5Var3.b.a == wi5Var2.b.a) {
                Lifecycle$State lifecycle$State2 = Lifecycle$State.e;
                if (lifecycle$State != lifecycle$State2) {
                    li5 li5Var = (li5) this.s.get(this.r.b(ei5Var.b.a));
                    if (js3.i((li5Var == null || (rv6Var = li5Var.f) == null || (set = (Set) rv6Var.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(ei5Var)), Boolean.TRUE) || ((zxVar = (zx) this.j.get(ei5Var)) != null && zxVar.a.get() == 0)) {
                        map.put(ei5Var, Lifecycle$State.d);
                    } else {
                        map.put(ei5Var, lifecycle$State2);
                    }
                }
                wi5 wi5Var4 = (wi5) a.p0(arrayList);
                if (wi5Var4 != null && wi5Var4.b.a == wi5Var2.b.a) {
                    a.D0(arrayList);
                }
                a.D0(arrayListE);
                fj5 fj5Var = wi5Var2.c;
                if (fj5Var != null) {
                    arrayListE.add(fj5Var);
                }
            } else if (arrayList.isEmpty() || wi5Var2.b.a != ((wi5) a.o0(arrayList)).b.a) {
                ei5Var.a(Lifecycle$State.c);
            } else {
                wi5 wi5Var5 = (wi5) a.D0(arrayList);
                if (lifecycle$State == Lifecycle$State.e) {
                    ei5Var.a(Lifecycle$State.d);
                } else {
                    Lifecycle$State lifecycle$State3 = Lifecycle$State.d;
                    if (lifecycle$State != lifecycle$State3) {
                        map.put(ei5Var, lifecycle$State3);
                    }
                }
                fj5 fj5Var2 = wi5Var5.c;
                if (fj5Var2 != null && !arrayList.contains(fj5Var2)) {
                    arrayList.add(fj5Var2);
                }
            }
        }
        for (ei5 ei5Var2 : arrayListQ0) {
            Lifecycle$State lifecycle$State4 = (Lifecycle$State) map.get(ei5Var2);
            if (lifecycle$State4 != null) {
                ei5Var2.a(lifecycle$State4);
            } else {
                ei5Var2.h.b();
            }
        }
    }
}
