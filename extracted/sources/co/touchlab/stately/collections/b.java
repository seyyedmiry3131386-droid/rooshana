package co.touchlab.stately.collections;

import defpackage.bp2;
import defpackage.ex3;
import defpackage.js3;
import defpackage.tv8;
import defpackage.tx8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements List, Collection, ex3 {
    public final Collection a;
    public final Object b;
    public final List c;

    public b(Object obj, List list) {
        js3.p(list, "del");
        js3.p(list, "del");
        this.a = list;
        this.b = obj;
        this.c = list;
    }

    @Override // java.util.List
    public final void add(final int i, final Object obj) {
        Object obj2 = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$add$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.c.add(i, obj);
                return tx8.a;
            }
        };
        synchronized (obj2) {
            bp2Var.invoke();
        }
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        Object objInvoke;
        js3.p(collection, "elements");
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$addAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.c.addAll(i, collection));
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$clear$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.a.clear();
                return tx8.a;
            }
        };
        synchronized (obj) {
            bp2Var.invoke();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(final Object obj) {
        Object objInvoke;
        Object obj2 = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$contains$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.contains(obj));
            }
        };
        synchronized (obj2) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(final Collection collection) {
        Object objInvoke;
        js3.p(collection, "elements");
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$containsAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.containsAll(collection));
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object get(final int i) {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$get$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.c.get(i);
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return objInvoke;
    }

    @Override // java.util.List
    public final int indexOf(final Object obj) {
        Object objInvoke;
        Object obj2 = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$indexOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Integer.valueOf(this.g.c.indexOf(obj));
            }
        };
        synchronized (obj2) {
            objInvoke = bp2Var.invoke();
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$isEmpty$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.isEmpty());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$iterator$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                b bVar = this.g;
                return new a(bVar.b, bVar.a.iterator());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return (Iterator) objInvoke;
    }

    @Override // java.util.List
    public final int lastIndexOf(final Object obj) {
        Object objInvoke;
        Object obj2 = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$lastIndexOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Integer.valueOf(this.g.c.lastIndexOf(obj));
            }
        };
        synchronized (obj2) {
            objInvoke = bp2Var.invoke();
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$listIterator$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                b bVar = this.g;
                return new c(bVar, bVar.c.listIterator());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return (ListIterator) objInvoke;
    }

    @Override // java.util.List
    public final Object remove(final int i) {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$removeAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.c.remove(i);
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return objInvoke;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(final Collection collection) {
        Object objInvoke;
        js3.p(collection, "elements");
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.removeAll(collection));
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection collection) {
        Object objInvoke;
        js3.p(collection, "elements");
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$retainAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.retainAll(collection));
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object set(final int i, final Object obj) {
        Object objInvoke;
        Object obj2 = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$set$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.c.set(i, obj);
            }
        };
        synchronized (obj2) {
            objInvoke = bp2Var.invoke();
        }
        return objInvoke;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$size$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Integer.valueOf(this.g.a.size());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // java.util.List
    public final List subList(final int i, final int i2) {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$subList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                b bVar = this.g;
                return new b(bVar, bVar.c.subList(i, i2));
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return (List) objInvoke;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return tv8.B(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        js3.p(objArr, "array");
        return tv8.C(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(final Object obj) {
        Object objInvoke;
        Object obj2 = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$add$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.add(obj));
            }
        };
        synchronized (obj2) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(final Collection collection) {
        Object objInvoke;
        js3.p(collection, "elements");
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$addAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.addAll(collection));
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final ListIterator listIterator(final int i) {
        Object objInvoke;
        Object obj = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableList$listIterator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                b bVar = this.g;
                return new c(bVar, bVar.c.listIterator(i));
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return (ListIterator) objInvoke;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(final Object obj) {
        Object objInvoke;
        Object obj2 = this.b;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableCollection$remove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.a.remove(obj));
            }
        };
        synchronized (obj2) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }
}
