package defpackage;

import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$State;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public final class fm2 {
    public final /* synthetic */ li5 a;
    public final /* synthetic */ dm2 b;

    public fm2(li5 li5Var, dm2 dm2Var) {
        this.a = li5Var;
        this.b = dm2Var;
    }

    public final void a(d dVar, boolean z) {
        Object obj;
        Object objPrevious;
        dm2 dm2Var = this.b;
        ArrayList arrayList = dm2Var.g;
        js3.p(dVar, "fragment");
        li5 li5Var = this.a;
        ArrayList arrayListZ0 = a.z0((Iterable) li5Var.f.a.getValue(), (Collection) li5Var.e.a.getValue());
        ListIterator listIterator = arrayListZ0.listIterator(arrayListZ0.size());
        while (true) {
            obj = null;
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
        boolean z2 = z && arrayList.isEmpty() && dVar.m;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (js3.i(((Pair) next).a, dVar.B)) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z2 && dm2.n()) {
            dVar.toString();
            Objects.toString(ei5Var);
        }
        boolean z3 = pair != null && ((Boolean) pair.b).booleanValue();
        if (!z && !z3 && ei5Var == null) {
            throw new IllegalArgumentException(dw1.m("The fragment ", dVar, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (ei5Var != null) {
            dm2Var.l(dVar, ei5Var, li5Var);
            if (z2) {
                if (dm2.n()) {
                    dVar.toString();
                    ei5Var.toString();
                }
                li5Var.f(ei5Var, false);
            }
        }
    }

    public final void b(d dVar, boolean z) {
        Object objPrevious;
        js3.p(dVar, "fragment");
        if (z) {
            li5 li5Var = this.a;
            List list = (List) li5Var.e.a.getValue();
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
            if (dm2.n()) {
                dVar.toString();
                Objects.toString(ei5Var);
            }
            if (ei5Var != null) {
                l lVar = li5Var.c;
                lVar.p(null, a77.n((Set) lVar.getValue(), ei5Var));
                ni5 ni5Var = li5Var.h.b;
                ni5Var.getClass();
                if (!ni5Var.f.contains(ei5Var)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                ei5Var.a(Lifecycle$State.d);
            }
        }
    }
}
