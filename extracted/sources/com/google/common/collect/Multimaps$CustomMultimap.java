package com.google.common.collect;

import defpackage.vb8;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
class Multimaps$CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {
    private static final long serialVersionUID = 0;
    public transient vb8 h;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.h = (vb8) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        q((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.h);
        objectOutputStream.writeObject(this.f);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    public final Map c() {
        return n();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    public final Set e() {
        return o();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection l() {
        return (Collection) this.h.get();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection r(Collection collection) {
        return collection instanceof NavigableSet ? z0.k((NavigableSet) collection) : collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? DesugarCollections.unmodifiableSet((Set) collection) : collection instanceof List ? DesugarCollections.unmodifiableList((List) collection) : DesugarCollections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection s(Object obj, Collection collection) {
        if (!(collection instanceof List)) {
            return collection instanceof NavigableSet ? new r(this, obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new t(this, obj, (SortedSet) collection, null) : collection instanceof Set ? new s(this, obj, (Set) collection) : new o(this, obj, collection, null);
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new defpackage.g1(this, obj, list, null) : new q(this, obj, list, null);
    }
}
