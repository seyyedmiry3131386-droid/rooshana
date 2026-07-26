package com.google.common.collect;

import defpackage.b47;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class TreeMultimap<K, V> extends AbstractSortedKeySortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    public transient Comparator h;
    public transient Comparator i;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        Objects.requireNonNull(comparator);
        this.h = comparator;
        Comparator comparator2 = (Comparator) objectInputStream.readObject();
        Objects.requireNonNull(comparator2);
        this.i = comparator2;
        q(new TreeMap(this.h));
        b47.k(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.h);
        objectOutputStream.writeObject(this.i);
        b47.x(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    public final Map c() {
        return n();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final Collection get(Object obj) {
        return (NavigableSet) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, defpackage.n1, defpackage.fa5
    public final Map h() {
        return (NavigableMap) super.h();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, defpackage.n1, defpackage.fa5
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection m(Object obj) {
        if (obj == null) {
            this.h.compare(obj, obj);
        }
        return l();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final int size() {
        return this.g;
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: x */
    public final SortedSet l() {
        return new TreeSet(this.i);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* JADX INFO: renamed from: y */
    public final SortedMap h() {
        return (NavigableMap) super.h();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap
    /* JADX INFO: renamed from: z */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final Set get(Object obj) {
        return (NavigableSet) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final SortedSet get(Object obj) {
        return (NavigableSet) super.get(obj);
    }
}
