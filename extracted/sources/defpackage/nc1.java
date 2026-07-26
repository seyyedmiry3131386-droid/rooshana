package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class nc1 implements yp1 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ wb5 d;

    public nc1(Set set, Object obj, Set set2, wb5 wb5Var) {
        this.a = set;
        this.b = obj;
        this.c = set2;
        this.d = wb5Var;
    }

    @Override // defpackage.yp1
    public final void a() {
        Set set = this.a;
        Object obj = this.b;
        boolean zRemove = set.remove(obj);
        if (this.c.contains(obj) || !zRemove) {
            return;
        }
        List list = (List) this.d.getValue();
        if (!(list instanceof RandomAccess)) {
            Iterator it = a.H0(list).iterator();
            while (it.hasNext()) {
                ((ej5) it.next()).a.invoke(obj);
            }
            return;
        }
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((ej5) list.get(size)).a.invoke(obj);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }
}
