package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class kl5 {
    public li5 a;
    public boolean b;

    public abstract wi5 a();

    public final li5 b() {
        li5 li5Var = this.a;
        if (li5Var != null) {
            return li5Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, lj5 lj5Var) {
        oc2 oc2Var = new oc2(new pc2(new vq8(a.e0(list), new v25(this, lj5Var, 5)), false, new vd7(23)));
        while (oc2Var.hasNext()) {
            b().g((ei5) oc2Var.next());
        }
    }

    public void e(li5 li5Var) {
        this.a = li5Var;
        this.b = true;
    }

    public void f(ei5 ei5Var) {
        wi5 wi5Var = ei5Var.b;
        if (wi5Var == null) {
            wi5Var = null;
        }
        if (wi5Var == null) {
            return;
        }
        mj5 mj5Var = new mj5();
        mj5Var.b = true;
        boolean z = mj5Var.b;
        boolean z2 = mj5Var.c;
        int i = mj5Var.d;
        boolean z3 = mj5Var.e;
        ba4 ba4Var = mj5Var.a;
        c(wi5Var, null, new lj5(z, z2, i, false, z3, ba4Var.a, ba4Var.b, -1, -1));
        b().d(ei5Var);
    }

    public Bundle h() {
        return null;
    }

    public void i(ei5 ei5Var, boolean z) {
        List list = (List) b().e.a.getValue();
        if (!list.contains(ei5Var)) {
            throw new IllegalStateException(("popBackStack was called with " + ei5Var + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        ei5 ei5Var2 = null;
        while (j()) {
            ei5Var2 = (ei5) listIterator.previous();
            if (js3.i(ei5Var2, ei5Var)) {
                break;
            }
        }
        if (ei5Var2 != null) {
            b().e(ei5Var2, z);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public wi5 c(wi5 wi5Var, Bundle bundle, lj5 lj5Var) {
        return wi5Var;
    }
}
