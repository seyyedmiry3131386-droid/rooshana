package com.google.common.collect;

import defpackage.b47;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayListMultimap<K, V> extends ArrayListMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 0;
    public transient int h;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.h = 3;
        int i = objectInputStream.readInt();
        q(new CompactHashMap());
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

    @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: t */
    public final List l() {
        return new ArrayList(this.h);
    }
}
