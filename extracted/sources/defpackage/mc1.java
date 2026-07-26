package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class mc1 implements yp1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ wb5 d;
    public final /* synthetic */ wb5 e;

    public mc1(Object obj, Set set, Set set2, wb5 wb5Var, wb5 wb5Var2) {
        this.a = obj;
        this.b = set;
        this.c = set2;
        this.d = wb5Var;
        this.e = wb5Var2;
    }

    @Override // defpackage.yp1
    public final void a() {
        ArrayList arrayList;
        List list = (List) this.d.getValue();
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((dj5) list.get(i)).b);
            }
        } else {
            arrayList = new ArrayList(wu0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((dj5) it.next()).b);
            }
        }
        Object obj = this.a;
        if (!(arrayList.contains(obj) ? false : this.b.remove(obj)) || this.c.contains(obj)) {
            return;
        }
        List list2 = (List) this.e.getValue();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it2 = a.H0(list2).iterator();
            while (it2.hasNext()) {
                ((ej5) it2.next()).a.invoke(obj);
            }
            return;
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            ((ej5) list2.get(size2)).a.invoke(obj);
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }
}
