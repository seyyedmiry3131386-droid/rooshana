package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class li5 {
    public final ol3 a;
    public final l b;
    public final l c;
    public boolean d;
    public final rv6 e;
    public final rv6 f;
    public final kl5 g;
    public final /* synthetic */ ij5 h;

    public li5(ij5 ij5Var, kl5 kl5Var) {
        js3.p(kl5Var, "navigator");
        this.h = ij5Var;
        this.a = new ol3(27);
        l lVarB = ja1.b(EmptyList.a);
        this.b = lVarB;
        l lVarB2 = ja1.b(EmptySet.a);
        this.c = lVarB2;
        this.e = new rv6(lVarB);
        this.f = new rv6(lVarB2);
        this.g = kl5Var;
    }

    public final void a(ei5 ei5Var) {
        js3.p(ei5Var, "backStackEntry");
        synchronized (this.a) {
            l lVar = this.b;
            ArrayList arrayListA0 = a.A0(ei5Var, (Collection) lVar.getValue());
            lVar.getClass();
            lVar.p(null, arrayListA0);
        }
    }

    public final ei5 b(wi5 wi5Var, Bundle bundle) {
        ni5 ni5Var = this.h.b;
        ni5Var.getClass();
        return ql3.i(ni5Var.a.c, wi5Var, bundle, ni5Var.h(), ni5Var.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ei5 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "entry"
            defpackage.js3.p(r9, r0)
            ij5 r0 = r8.h
            ni5 r0 = r0.b
            ki5 r1 = new ki5
            r1.<init>(r8, r9)
            kotlinx.coroutines.flow.l r2 = r0.h
            java.lang.String r3 = r9.f
            java.util.LinkedHashMap r4 = r0.v
            java.lang.Object r5 = r4.get(r9)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = defpackage.js3.i(r5, r6)
            r1.invoke()
            r4.remove(r9)
            ov r1 = r0.f
            boolean r4 = r1.contains(r9)
            r6 = 0
            if (r4 != 0) goto L89
            r0.r(r9)
            gi5 r4 = r9.h
            i64 r4 = r4.j
            androidx.lifecycle.Lifecycle$State r4 = r4.d
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle$State.c
            int r4 = r4.compareTo(r7)
            if (r4 < 0) goto L43
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle$State.a
            r9.a(r4)
        L43:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L4a
            goto L63
        L4a:
            java.util.Iterator r9 = r1.iterator()
        L4e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r9.next()
            ei5 r1 = (defpackage.ei5) r1
            java.lang.String r1 = r1.f
            boolean r1 = defpackage.js3.i(r1, r3)
            if (r1 == 0) goto L4e
            goto L7b
        L63:
            if (r5 != 0) goto L7b
            oi5 r9 = r0.n
            if (r9 == 0) goto L7b
            java.lang.String r1 = "backStackEntryId"
            defpackage.js3.p(r3, r1)
            java.util.LinkedHashMap r9 = r9.b
            java.lang.Object r9 = r9.remove(r3)
            u79 r9 = (defpackage.u79) r9
            if (r9 == 0) goto L7b
            r9.a()
        L7b:
            r0.s()
            java.util.ArrayList r9 = r0.o()
            r2.getClass()
            r2.p(r6, r9)
            return
        L89:
            boolean r9 = r8.d
            if (r9 != 0) goto La6
            r0.s()
            kotlinx.coroutines.flow.l r9 = r0.g
            java.util.ArrayList r1 = kotlin.collections.a.Q0(r1)
            r9.getClass()
            r9.p(r6, r1)
            java.util.ArrayList r9 = r0.o()
            r2.getClass()
            r2.p(r6, r9)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li5.c(ei5):void");
    }

    public final void d(ei5 ei5Var) {
        int iNextIndex;
        synchronized (this.a) {
            try {
                ArrayList arrayListQ0 = a.Q0((Collection) this.e.a.getValue());
                ListIterator listIterator = arrayListQ0.listIterator(arrayListQ0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (js3.i(((ei5) listIterator.previous()).f, ei5Var.f)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListQ0.set(iNextIndex, ei5Var);
                l lVar = this.b;
                lVar.getClass();
                lVar.p(null, arrayListQ0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(ei5 ei5Var, boolean z) {
        ni5 ni5Var = this.h.b;
        ki5 ki5Var = new ki5(this, ei5Var, z);
        ni5Var.getClass();
        kl5 kl5VarB = ni5Var.r.b(ei5Var.b.a);
        ni5Var.v.put(ei5Var, Boolean.valueOf(z));
        if (!kl5VarB.equals(this.g)) {
            Object obj = ni5Var.s.get(kl5VarB);
            js3.m(obj);
            ((li5) obj).e(ei5Var, z);
            return;
        }
        u51 u51Var = ni5Var.u;
        if (u51Var != null) {
            u51Var.invoke(ei5Var);
            ki5Var.invoke();
            return;
        }
        ov ovVar = ni5Var.f;
        int iIndexOf = ovVar.indexOf(ei5Var);
        if (iIndexOf < 0) {
            js3.p("Ignoring pop of " + ei5Var + " as it was not found on the current back stack", "message");
            return;
        }
        int i = iIndexOf + 1;
        if (i != ovVar.c) {
            ni5Var.l(((ei5) ovVar.get(i)).b.b.a, true, false);
        }
        ni5.n(ni5Var, ei5Var);
        ki5Var.invoke();
        ni5Var.b.invoke();
        ni5Var.b();
    }

    public final void f(ei5 ei5Var, boolean z) {
        Object objPrevious;
        l lVar = this.c;
        Iterable iterable = (Iterable) lVar.getValue();
        boolean z2 = iterable instanceof Collection;
        rv6 rv6Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ei5) it.next()) == ei5Var) {
                    Iterable iterable2 = (Iterable) rv6Var.a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((ei5) it2.next()) == ei5Var) {
                        }
                    }
                    return;
                }
            }
        }
        lVar.p(null, a77.n((Set) lVar.getValue(), ei5Var));
        v48 v48Var = rv6Var.a;
        v48 v48Var2 = rv6Var.a;
        List list = (List) v48Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            ei5 ei5Var2 = (ei5) objPrevious;
            if (!js3.i(ei5Var2, ei5Var) && ((List) v48Var2.getValue()).lastIndexOf(ei5Var2) < ((List) v48Var2.getValue()).lastIndexOf(ei5Var)) {
                break;
            }
        }
        ei5 ei5Var3 = (ei5) objPrevious;
        if (ei5Var3 != null) {
            lVar.p(null, a77.n((Set) lVar.getValue(), ei5Var3));
        }
        e(ei5Var, z);
    }

    public final void g(ei5 ei5Var) {
        js3.p(ei5Var, "backStackEntry");
        ni5 ni5Var = this.h.b;
        ni5Var.getClass();
        kl5 kl5VarB = ni5Var.r.b(ei5Var.b.a);
        if (!kl5VarB.equals(this.g)) {
            Object obj = ni5Var.s.get(kl5VarB);
            if (obj == null) {
                throw new IllegalStateException(dw1.s(new StringBuilder("NavigatorBackStack for "), ei5Var.b.a, " should already be created").toString());
            }
            ((li5) obj).g(ei5Var);
            return;
        }
        dp2 dp2Var = ni5Var.t;
        if (dp2Var != null) {
            dp2Var.invoke(ei5Var);
            a(ei5Var);
        } else {
            js3.p("Ignoring add of destination " + ei5Var.b + " outside of the call to navigate(). ", "message");
        }
    }

    public final void h(ei5 ei5Var) {
        l lVar = this.c;
        Iterable iterable = (Iterable) lVar.getValue();
        boolean z = iterable instanceof Collection;
        rv6 rv6Var = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ei5) it.next()) == ei5Var) {
                    Iterable iterable2 = (Iterable) rv6Var.a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((ei5) it2.next()) == ei5Var) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        ei5 ei5Var2 = (ei5) a.v0((List) rv6Var.a.getValue());
        if (ei5Var2 != null) {
            LinkedHashSet linkedHashSetN = a77.n((Set) lVar.getValue(), ei5Var2);
            lVar.getClass();
            lVar.p(null, linkedHashSetN);
        }
        LinkedHashSet linkedHashSetN2 = a77.n((Set) lVar.getValue(), ei5Var);
        lVar.getClass();
        lVar.p(null, linkedHashSetN2);
        g(ei5Var);
    }
}
