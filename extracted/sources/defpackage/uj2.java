package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class uj2 extends hs9 implements Collection {
    public abstract Collection Y();

    public boolean add(Object obj) {
        return Y().add(obj);
    }

    public boolean addAll(Collection collection) {
        return Y().addAll(collection);
    }

    public void clear() {
        Y().clear();
    }

    public boolean contains(Object obj) {
        return Y().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return Y().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return Y().isEmpty();
    }

    public Iterator iterator() {
        return Y().iterator();
    }

    public boolean remove(Object obj) {
        return Y().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return Y().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return Y().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return Y().size();
    }

    public Object[] toArray() {
        return Y().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return Y().toArray(objArr);
    }
}
