package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yk9 {
    public static final wv d = new wv(0);
    public final wv a = new wv(0);
    public final zv b = new zv(0);
    public final wv c = new wv(0);

    public final synchronized x41 a(bo9 bo9Var, Object obj, String str) {
        x41 x41VarD;
        try {
            rq4.n(obj);
            x41VarD = bo9Var.d(obj, str);
            o94 o94Var = (o94) x41VarD.b;
            rq4.o(o94Var, "Key must not be null");
            Set zvVar = (Set) this.a.get(str);
            if (zvVar == null) {
                zvVar = new zv(0);
                this.a.put(str, zvVar);
            }
            zvVar.add(o94Var);
        } catch (Throwable th) {
            throw th;
        }
        return x41VarD;
    }

    public final synchronized ox9 b(bo9 bo9Var, rn6 rn6Var) {
        ox9 ox9VarB;
        o94 o94Var = (o94) ((x41) ((cf0) rn6Var.b).d).b;
        rq4.o(o94Var, "Key must not be null");
        boolean zAdd = this.b.add(o94Var);
        ox9VarB = bo9Var.b(rn6Var);
        ry ryVar = new ry(this, bo9Var, o94Var, zAdd);
        ox9VarB.getClass();
        ox9VarB.a(df8.a, ryVar);
        return ox9VarB;
    }

    public final synchronized ox9 c(fu2 fu2Var, String str) {
        zv zvVar = new zv(0);
        Set set = (Set) this.a.get(str);
        if (set == null) {
            return z67.m(zvVar);
        }
        zv zvVar2 = new zv(0);
        zvVar2.addAll(set);
        sv svVar = new sv(zvVar2);
        while (svVar.hasNext()) {
            o94 o94Var = (o94) svVar.next();
            if (this.b.contains(o94Var)) {
                zvVar.add(d(fu2Var, o94Var));
            }
        }
        this.a.remove(str);
        return z67.m(zvVar);
    }

    public final synchronized ox9 d(fu2 fu2Var, o94 o94Var) {
        String str;
        try {
            this.b.remove(o94Var);
            Iterator it = ((tv) this.a.keySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = (String) it.next();
                Set set = (Set) this.a.get(str);
                if (set.contains(o94Var)) {
                    set.remove(o94Var);
                    break;
                }
            }
            if (str != null) {
                Iterator it2 = ((rv) this.c.entrySet()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object value = entry.getValue();
                    rq4.o(value, "Listener must not be null");
                    rq4.l(str, "Listener type must not be empty");
                    if (new o94(value, str).equals(o94Var)) {
                        this.c.remove(entry.getKey());
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return fu2Var.c(o94Var);
    }
}
