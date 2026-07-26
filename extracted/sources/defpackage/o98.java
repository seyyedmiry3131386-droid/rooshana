package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class o98 implements List, ex3 {
    public final SnapshotStateList a;
    public final int b;
    public int c;
    public int d;

    public o98(SnapshotStateList snapshotStateList, int i, int i2) {
        this.a = snapshotStateList;
        this.b = i;
        this.c = hs9.G(snapshotStateList);
        this.d = i2 - i;
    }

    public final void a() {
        if (hs9.G(this.a) != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.b + this.d;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, obj);
        this.d++;
        this.c = hs9.G(snapshotStateList);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d > 0) {
            a();
            int i = this.d;
            int i2 = this.b;
            SnapshotStateList snapshotStateList = this.a;
            snapshotStateList.e(i2, i + i2);
            this.d = 0;
            this.c = hs9.G(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final Object get(int i) {
        a();
        hs9.p(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        Iterator it = ok4.Z(i2, i + i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((mq3) it).nextInt();
            if (js3.i(obj, this.a.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (js3.i(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        a();
        SnapshotStateList snapshotStateList = this.a;
        int i2 = this.b;
        int i3 = this.d + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (hs9.f) {
                a58 a58Var = snapshotStateList.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            v66 v66VarH = w1Var.h();
            v66VarH.subList(i2, i3).retainAll(collection);
            w1 w1VarE = v66VarH.e();
            if (js3.i(w1VarE, w1Var)) {
                break;
            }
            a58 a58Var3 = snapshotStateList.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, snapshotStateList, c08VarJ), i, w1VarE, true);
            }
            g08.o(c08VarJ, snapshotStateList);
        } while (!zR);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.c = hs9.G(this.a);
            this.d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        hs9.p(i, this.d);
        a();
        int i2 = i + this.b;
        SnapshotStateList snapshotStateList = this.a;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.c = hs9.G(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.d)) {
            wi6.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new o98(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return tv8.B(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.a = i - 1;
        return new s87(ref$IntRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return tv8.C(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.b;
        SnapshotStateList snapshotStateList = this.a;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.d = collection.size() + this.d;
            this.c = hs9.G(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.b + i;
        SnapshotStateList snapshotStateList = this.a;
        Object objRemove = snapshotStateList.remove(i2);
        this.d--;
        this.c = hs9.G(snapshotStateList);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.b + i;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i2, obj);
        this.d++;
        this.c = hs9.G(snapshotStateList);
    }
}
