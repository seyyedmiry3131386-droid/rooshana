package defpackage;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class r18 extends ii4 implements NavigableSet, SortedSet {
    public final q18 b;

    public r18(q18 q18Var) {
        super(1);
        this.b = q18Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return h27.a(this.b.D0(obj, BoundType.b).firstEntry());
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.b.comparator();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((r18) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new r18(this.b.J());
    }

    @Override // defpackage.ii4
    public final oa5 f() {
        return this.b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        pa5 pa5VarFirstEntry = this.b.firstEntry();
        if (pa5VarFirstEntry != null) {
            return pa5VarFirstEntry.b();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return h27.a(this.b.k0(obj, BoundType.b).lastEntry());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return this.b.k0(obj, BoundType.a).b();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return h27.a(this.b.D0(obj, BoundType.a).firstEntry());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return new gi4(this.b.entrySet().iterator(), 2);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        pa5 pa5VarLastEntry = this.b.lastEntry();
        if (pa5VarLastEntry != null) {
            return pa5VarLastEntry.b();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return h27.a(this.b.k0(obj, BoundType.a).lastEntry());
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return h27.a(this.b.pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return h27.a(this.b.pollLastEntry());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return this.b.h1(obj, BoundType.b, obj2, BoundType.a).b();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return this.b.D0(obj, BoundType.b).b();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new r18(this.b.h1(obj, BoundType.a(z), obj2, BoundType.a(z2)));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new r18(this.b.k0(obj, BoundType.a(z)));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new r18(this.b.D0(obj, BoundType.a(z)));
    }
}
