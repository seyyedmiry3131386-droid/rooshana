package com.google.common.collect;

import defpackage.vb8;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
class Multimaps$CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    public transient vb8 h;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        vb8 vb8Var = (vb8) object;
        this.h = vb8Var;
        ((SortedSet) vb8Var.get()).comparator();
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

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: x */
    public final SortedSet l() {
        return (SortedSet) this.h.get();
    }
}
