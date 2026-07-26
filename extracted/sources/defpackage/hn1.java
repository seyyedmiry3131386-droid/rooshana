package defpackage;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
@jl5("dialog")
public final class hn1 extends kl5 {
    public final Context c;
    public final g d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final ry6 f = new ry6(3, this);
    public final LinkedHashMap g = new LinkedHashMap();

    public hn1(Context context, g gVar) {
        this.c = context;
        this.d = gVar;
    }

    @Override // defpackage.kl5
    public final wi5 a() {
        return new fn1(this);
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
            k(ei5Var).F0(gVar, ei5Var.f);
            ei5 ei5Var2 = (ei5) a.v0((List) b().e.a.getValue());
            boolean zH0 = a.h0((Iterable) b().f.a.getValue(), ei5Var2);
            b().h(ei5Var);
            if (ei5Var2 != null && !zH0) {
                b().c(ei5Var2);
            }
        }
    }

    @Override // defpackage.kl5
    public final void e(li5 li5Var) {
        i64 i64Var;
        this.a = li5Var;
        this.b = true;
        Iterator it = ((List) li5Var.e.a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            g gVar = this.d;
            if (!zHasNext) {
                gVar.q.add(new hm2() { // from class: en1
                    @Override // defpackage.hm2
                    public final void a(g gVar2, d dVar) {
                        js3.p(gVar2, "<unused var>");
                        js3.p(dVar, "childFragment");
                        hn1 hn1Var = this.a;
                        LinkedHashSet linkedHashSet = hn1Var.e;
                        if (wu8.g(linkedHashSet).remove(dVar.B)) {
                            dVar.U.a(hn1Var.f);
                        }
                        LinkedHashMap linkedHashMap = hn1Var.g;
                        wu8.h(linkedHashMap).remove(dVar.B);
                    }
                });
                return;
            }
            ei5 ei5Var = (ei5) it.next();
            DialogFragment dialogFragment = (DialogFragment) gVar.G(ei5Var.f);
            if (dialogFragment == null || (i64Var = dialogFragment.U) == null) {
                this.e.add(ei5Var.f);
            } else {
                i64Var.a(this.f);
            }
        }
    }

    @Override // defpackage.kl5
    public final void f(ei5 ei5Var) {
        String str = ei5Var.f;
        g gVar = this.d;
        if (gVar.S()) {
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) this.g.get(str);
        if (dialogFragment == null) {
            d dVarG = gVar.G(str);
            dialogFragment = dVarG instanceof DialogFragment ? (DialogFragment) dVarG : null;
        }
        if (dialogFragment != null) {
            dialogFragment.U.f(this.f);
            dialogFragment.z0();
        }
        k(ei5Var).F0(gVar, str);
        li5 li5VarB = b();
        List list = (List) li5VarB.e.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            ei5 ei5Var2 = (ei5) listIterator.previous();
            if (js3.i(ei5Var2.f, str)) {
                l lVar = li5VarB.c;
                lVar.p(null, a77.n(a77.n((Set) lVar.getValue(), ei5Var2), ei5Var));
                li5VarB.d(ei5Var);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // defpackage.kl5
    public final void i(ei5 ei5Var, boolean z) {
        g gVar = this.d;
        if (gVar.S()) {
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(ei5Var);
        Iterator it = a.H0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            d dVarG = gVar.G(((ei5) it.next()).f);
            if (dVarG != null) {
                ((DialogFragment) dVarG).z0();
            }
        }
        l(iIndexOf, ei5Var, z);
    }

    public final DialogFragment k(ei5 ei5Var) {
        wi5 wi5Var = ei5Var.b;
        js3.n(wi5Var, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        fn1 fn1Var = (fn1) wi5Var;
        String str = fn1Var.g;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        pl2 pl2VarL = this.d.L();
        context.getClassLoader();
        d dVarA = pl2VarL.a(str);
        js3.o(dVarA, "instantiate(...)");
        if (DialogFragment.class.isAssignableFrom(dVarA.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) dVarA;
            dialogFragment.u0(ei5Var.h.a());
            dialogFragment.U.a(this.f);
            this.g.put(ei5Var.f, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = fn1Var.g;
        if (str2 != null) {
            throw new IllegalArgumentException(dw1.s(sb, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i, ei5 ei5Var, boolean z) {
        ei5 ei5Var2 = (ei5) a.q0(i - 1, (List) b().e.a.getValue());
        boolean zH0 = a.h0((Iterable) b().f.a.getValue(), ei5Var2);
        b().f(ei5Var, z);
        if (ei5Var2 == null || zH0) {
            return;
        }
        b().c(ei5Var2);
    }
}
