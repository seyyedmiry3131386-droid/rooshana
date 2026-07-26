package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class w1 extends z0 implements List, Collection, dx3 {
    public abstract w1 c(int i, Object obj);

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.o, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract w1 e(Object obj);

    public w1 f(Collection collection) {
        v66 v66VarH = h();
        v66VarH.addAll(collection);
        return v66VarH.e();
    }

    public abstract v66 h();

    public abstract w1 i(u1 u1Var);

    @Override // defpackage.z0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract w1 j(int i);

    public abstract w1 l(int i, Object obj);

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.z0, java.util.List
    public final List subList(int i, int i2) {
        return new oj3(this, i, i2);
    }
}
