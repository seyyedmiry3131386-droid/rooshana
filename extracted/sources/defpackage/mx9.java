package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class mx9 extends pk9 {
    public final hl5 c;
    public final HashMap d;

    public mx9(hl5 hl5Var) {
        super("require");
        this.d = new HashMap();
        this.c = hl5Var;
    }

    @Override // defpackage.pk9
    public final xk9 b(o77 o77Var, List list) {
        xk9 xk9Var;
        c67.o(1, "require", list);
        String strL = ((rn6) o77Var.b).D(o77Var, (xk9) list.get(0)).l();
        HashMap map = this.d;
        if (map.containsKey(strL)) {
            return (xk9) map.get(strL);
        }
        HashMap map2 = (HashMap) this.c.b;
        if (map2.containsKey(strL)) {
            try {
                xk9Var = (xk9) ((Callable) map2.get(strL)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strL)));
            }
        } else {
            xk9Var = xk9.p0;
        }
        if (xk9Var instanceof pk9) {
            map.put(strL, (pk9) xk9Var);
        }
        return xk9Var;
    }
}
