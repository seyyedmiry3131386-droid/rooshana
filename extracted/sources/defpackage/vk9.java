package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vk9 extends pk9 {
    public final ArrayList c;
    public final ArrayList d;
    public final o77 e;

    public vk9(vk9 vk9Var) {
        super(vk9Var.a);
        ArrayList arrayList = new ArrayList(vk9Var.c.size());
        this.c = arrayList;
        arrayList.addAll(vk9Var.c);
        ArrayList arrayList2 = new ArrayList(vk9Var.d.size());
        this.d = arrayList2;
        arrayList2.addAll(vk9Var.d);
        this.e = vk9Var.e;
    }

    @Override // defpackage.pk9
    public final xk9 b(o77 o77Var, List list) {
        dl9 dl9Var;
        o77 o77VarK = this.e.K();
        rn6 rn6Var = (rn6) o77VarK.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            dl9Var = xk9.p0;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                o77VarK.N((String) arrayList.get(i), ((rn6) o77Var.b).D(o77Var, (xk9) list.get(i)));
            } else {
                o77VarK.N((String) arrayList.get(i), dl9Var);
            }
            i++;
        }
        for (xk9 xk9Var : this.d) {
            xk9 xk9VarD = rn6Var.D(o77VarK, xk9Var);
            if (xk9VarD instanceof zk9) {
                xk9VarD = rn6Var.D(o77VarK, xk9Var);
            }
            if (xk9VarD instanceof mk9) {
                return ((mk9) xk9VarD).a;
            }
        }
        return dl9Var;
    }

    @Override // defpackage.pk9, defpackage.xk9
    public final xk9 m() {
        return new vk9(this);
    }

    public vk9(String str, ArrayList arrayList, List list, o77 o77Var) {
        super(str);
        this.c = new ArrayList();
        this.e = o77Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(((xk9) it.next()).l());
            }
        }
        this.d = new ArrayList(list);
    }
}
