package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ei1 {
    public final String a;
    public final pt2 b;

    public ei1(Set set, pt2 pt2Var) {
        this.a = b(set);
        this.b = pt2Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            q20 q20Var = (q20) it.next();
            sb.append(q20Var.a);
            sb.append('/');
            sb.append(q20Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        String str = this.a;
        pt2 pt2Var = this.b;
        synchronized (((HashSet) pt2Var.b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) pt2Var.b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(pt2Var.u());
    }
}
