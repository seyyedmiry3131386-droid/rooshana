package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class kk5 {
    public final l a = ja1.b(mk5.a);
    public final l b;
    public final rv6 c;
    public final ov d;
    public final ov e;
    public ek5 f;
    public int g;
    public jk5 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public kk5() {
        l lVarB = ja1.b(new hk5());
        this.b = lVarB;
        this.c = new rv6(lVarB);
        this.d = new ov();
        this.e = new ov();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(ai0 ai0Var, jk5 jk5Var, int i) {
        js3.p(ai0Var, "dispatcher");
        if (jk5Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(jk5Var);
            jk5Var.a = ai0Var;
            js3.p((hk5) this.c.a.getValue(), "history");
            jk5Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + jk5Var + "' is already added to dispatcher " + jk5Var.a + '.').toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        ov<ek5> ovVar = this.d;
        if (ovVar == null || !ovVar.isEmpty()) {
            for (ek5 ek5Var : ovVar) {
                if (ek5Var.a() || ek5Var.b()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        ov<ek5> ovVar2 = this.e;
        if (ovVar2 == null || !ovVar2.isEmpty()) {
            for (ek5 ek5Var2 : ovVar2) {
                if (ek5Var2.a() || ek5Var2.b()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        if (z4) {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((jk5) it.next()).b(z);
            }
        }
        if (z5) {
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ((jk5) it2.next()).b(z2);
            }
        }
        if (z6) {
            Iterator it3 = this.i.iterator();
            while (it3.hasNext()) {
                ((jk5) it3.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        ek5 ek5VarC = this.f;
        if (ek5VarC == null) {
            ek5VarC = c(0);
        }
        d(ek5VarC);
    }

    public final ek5 c(int i) {
        Object next;
        Object next2;
        Object next3;
        ov ovVar = this.e;
        ov ovVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = ovVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ek5) next).a()) {
                    break;
                }
            }
            ek5 ek5Var = (ek5) next;
            if (ek5Var != null) {
                return ek5Var;
            }
            Iterator it2 = ovVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next4 = it2.next();
                if (((ek5) next4).a()) {
                    obj = next4;
                    break;
                }
            }
            return (ek5) obj;
        }
        if (i == 0) {
            Iterator it3 = ovVar2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                ek5 ek5Var2 = (ek5) next2;
                if (ek5Var2.a() || ek5Var2.b()) {
                    break;
                }
            }
            ek5 ek5Var3 = (ek5) next2;
            if (ek5Var3 != null) {
                return ek5Var3;
            }
            for (Object obj2 : ovVar) {
                ek5 ek5Var4 = (ek5) obj2;
                if (ek5Var4.a() || ek5Var4.b()) {
                    obj = obj2;
                    break;
                }
            }
            return (ek5) obj;
        }
        if (i != 1) {
            throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
        }
        Iterator it4 = ovVar2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            if (((ek5) next3).b()) {
                break;
            }
        }
        ek5 ek5Var5 = (ek5) next3;
        if (ek5Var5 != null) {
            return ek5Var5;
        }
        Iterator it5 = ovVar.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (((ek5) next5).b()) {
                obj = next5;
                break;
            }
        }
        return (ek5) obj;
    }

    public final void d(ek5 ek5Var) {
        hk5 hk5Var;
        ek5 ek5VarC = this.f;
        if (ek5VarC == null) {
            ek5VarC = c(0);
        }
        if (js3.i(ek5VarC, ek5Var)) {
            if (ek5VarC == null) {
                hk5Var = new hk5();
            } else {
                ArrayList arrayList = new ArrayList();
                for (ek5 ek5Var2 : this.d) {
                    if (ek5Var2.a() && !ek5Var2.b.isEmpty()) {
                        arrayList.addAll(ek5Var2.b);
                    }
                }
                for (ek5 ek5Var3 : this.e) {
                    if (ek5Var3.a() && !ek5Var3.b.isEmpty()) {
                        arrayList.addAll(ek5Var3.b);
                    }
                }
                ik5 ik5Var = ek5VarC.a;
                List list = ek5VarC.c;
                js3.p(ik5Var, "currentInfo");
                js3.p(list, "forwardInfo");
                ListBuilder listBuilderS = br9.s();
                a.b0(arrayList, listBuilderS);
                listBuilderS.add(ik5Var);
                a.b0(list, listBuilderS);
                hk5Var = new hk5(br9.q(listBuilderS), arrayList.size());
            }
            l lVar = this.b;
            if (js3.i((hk5) lVar.getValue(), hk5Var)) {
                return;
            }
            lVar.getClass();
            lVar.p(null, hk5Var);
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((jk5) it.next()).getClass();
            }
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                ((jk5) it2.next()).getClass();
            }
            Iterator it3 = this.i.iterator();
            while (it3.hasNext()) {
                ((jk5) it3.next()).getClass();
            }
        }
    }
}
