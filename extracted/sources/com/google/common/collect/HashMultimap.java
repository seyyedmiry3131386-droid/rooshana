package com.google.common.collect;

import defpackage.b47;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class HashMultimap<K, V> extends HashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        q(new CompactHashMap(12));
        b47.k(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b47.x(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final int size() {
        return this.g;
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: t */
    public final Set l() {
        return new CompactHashSet(2);
    }
}
