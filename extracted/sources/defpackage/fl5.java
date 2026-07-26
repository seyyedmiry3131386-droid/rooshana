package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class fl5 {
    public static final boolean a(int i, wi5 wi5Var) {
        js3.p(wi5Var, "<this>");
        int i2 = wi5.f;
        Iterator it = m91.u(wi5Var).iterator();
        while (it.hasNext()) {
            if (((wi5) it.next()).b.a == i) {
                return true;
            }
        }
        return false;
    }
}
