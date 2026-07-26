package com.google.common.collect;

import defpackage.hs9;
import defpackage.tt3;
import defpackage.vy2;
import defpackage.x01;
import defpackage.y01;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class ConcurrentHashMultiset<E> extends w implements Serializable {
    private static final long serialVersionUID = 1;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        y01.a.m(this, (ConcurrentMap) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.w, defpackage.oa5
    public final boolean K(int i, Object obj) {
        obj.getClass();
        vy2.m(i, "oldCount");
        vy2.m(0, "newCount");
        hs9.Q(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.w
    public final Set a() {
        throw null;
    }

    @Override // defpackage.oa5
    public final int add(int i, Object obj) {
        obj.getClass();
        if (i == 0) {
            hs9.Q(null, obj);
            throw null;
        }
        vy2.p(i, "occurrences");
        hs9.Q(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.w
    public final Set c() {
        return new x01(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // com.google.common.collect.w
    public final int e() {
        throw null;
    }

    @Override // com.google.common.collect.w
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.w
    public final Iterator h() {
        throw null;
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return tt3.D(this);
    }

    @Override // defpackage.oa5
    public final int j1(Object obj) {
        obj.getClass();
        vy2.m(0, "count");
        hs9.Q(null, obj);
        throw null;
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        hs9.Q(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        throw null;
    }

    @Override // defpackage.oa5
    public final int w0(int i, Object obj) {
        if (i == 0) {
            hs9.Q(null, obj);
            throw null;
        }
        vy2.p(i, "occurrences");
        hs9.Q(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw null;
    }
}
