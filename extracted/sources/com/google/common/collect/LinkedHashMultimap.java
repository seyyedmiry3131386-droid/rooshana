package com.google.common.collect;

import defpackage.gi4;
import defpackage.w74;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 1;
    public transient ValueEntry h;

    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements w74 {
        public final int c;
        public ValueEntry d;
        public w74 e;
        public w74 f;
        public ValueEntry g;
        public ValueEntry h;

        public ValueEntry(Object obj, Object obj2, int i, ValueEntry valueEntry) {
            super(obj, obj2);
            this.c = i;
            this.d = valueEntry;
        }

        @Override // defpackage.w74
        public final void a(w74 w74Var) {
            this.e = w74Var;
        }

        @Override // defpackage.w74
        public final w74 c() {
            w74 w74Var = this.f;
            Objects.requireNonNull(w74Var);
            return w74Var;
        }

        @Override // defpackage.w74
        public final void e(w74 w74Var) {
            this.f = w74Var;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ValueEntry valueEntry = new ValueEntry(null, null, 0, null);
        this.h = valueEntry;
        valueEntry.h = valueEntry;
        valueEntry.g = valueEntry;
        int i = objectInputStream.readInt();
        CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            compactLinkedHashMap.put(object, new u0(this, object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) compactLinkedHashMap.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        q(compactLinkedHashMap);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(this.g);
        for (Map.Entry entry : super.g()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final void clear() {
        super.clear();
        ValueEntry valueEntry = this.h;
        valueEntry.h = valueEntry;
        valueEntry.g = valueEntry;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    public final Collection g() {
        return super.g();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    public final Iterator j() {
        return new s0(this);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    public final Iterator k() {
        return new gi4(new s0(this), 1);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection m(Object obj) {
        return new u0(this, obj);
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
        return new CompactLinkedHashSet(2);
    }
}
