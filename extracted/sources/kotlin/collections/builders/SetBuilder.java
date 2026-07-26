package kotlin.collections.builders;

import defpackage.js3;
import defpackage.s1;
import defpackage.yg4;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class SetBuilder<E> extends s1 implements Set<E>, Serializable {
    public static final SetBuilder b;
    public final MapBuilder a;

    static {
        MapBuilder mapBuilder = MapBuilder.n;
        b = new SetBuilder(MapBuilder.n);
    }

    public SetBuilder(MapBuilder mapBuilder) {
        js3.p(mapBuilder, "backing");
        this.a = mapBuilder;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.a.m) {
            return new SerializedCollection(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // defpackage.s1
    public final int a() {
        return this.a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        js3.p(collection, "elements");
        this.a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.a;
        mapBuilder.getClass();
        return new yg4(mapBuilder, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.a;
        mapBuilder.c();
        int i = mapBuilder.i(obj);
        if (i < 0) {
            return false;
        }
        mapBuilder.m(i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        js3.p(collection, "elements");
        this.a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        js3.p(collection, "elements");
        this.a.c();
        return super.retainAll(collection);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }
}
