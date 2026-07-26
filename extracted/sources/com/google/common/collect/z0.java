package com.google.common.collect;

import defpackage.nq7;
import defpackage.oa5;
import defpackage.oq7;
import defpackage.p18;
import defpackage.pq7;
import defpackage.wn5;
import defpackage.yp2;
import defpackage.zi6;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {
    public static Collection a(Object obj, Collection collection) {
        return collection instanceof SortedSet ? new Synchronized$SynchronizedSortedSet((SortedSet) collection, obj) : collection instanceof Set ? new Synchronized$SynchronizedSet((Set) collection, obj) : collection instanceof List ? h(obj, (List) collection) : new Synchronized$SynchronizedCollection(collection, obj);
    }

    public static Map.Entry b(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new Synchronized$SynchronizedEntry(entry, obj);
    }

    public static boolean c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static oq7 d(Set set, zi6 zi6Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof oq7)) {
                return new pq7(set2, zi6Var);
            }
            oq7 oq7Var = (oq7) set2;
            return new pq7((SortedSet) oq7Var.a, com.google.common.base.b.b(oq7Var.b, zi6Var));
        }
        if (!(set instanceof oq7)) {
            set.getClass();
            return new oq7(set, zi6Var);
        }
        oq7 oq7Var2 = (oq7) set;
        return new oq7(oq7Var2.a, com.google.common.base.b.b(oq7Var2.b, zi6Var));
    }

    public static boolean e(Comparator comparator, Collection collection) {
        Comparator comparator2;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            comparator2 = ((SortedSet) collection).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.c;
            }
        } else {
            if (!(collection instanceof p18)) {
                return false;
            }
            comparator2 = ((p18) collection).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int f(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static nq7 g(Set set, ImmutableSet immutableSet) {
        wn5.m(set, "set1");
        wn5.m(immutableSet, "set2");
        return new nq7(set, immutableSet);
    }

    public static List h(Object obj, List list) {
        return list instanceof RandomAccess ? new Synchronized$SynchronizedRandomAccessList(list, obj) : new Synchronized$SynchronizedList(list, obj);
    }

    public static boolean i(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof oa5) {
            collection = ((oa5) collection).b();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static AbstractList j(yp2 yp2Var, List list) {
        return list instanceof RandomAccess ? new Lists$TransformingRandomAccessList(yp2Var, list) : new Lists$TransformingSequentialList(yp2Var, list);
    }

    public static NavigableSet k(NavigableSet navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof Sets$UnmodifiableNavigableSet)) ? navigableSet : new Sets$UnmodifiableNavigableSet(navigableSet);
    }
}
