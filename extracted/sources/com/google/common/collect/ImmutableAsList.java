package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
abstract class ImmutableAsList<E> extends ImmutableList<E> {

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableCollection a;

        public SerializedForm(ImmutableCollection immutableCollection) {
            this.a = immutableCollection;
        }

        public Object readResolve() {
            return this.a.a();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return z().contains(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        ((RegularContiguousSet) z()).getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        ((RegularContiguousSet) z()).getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return z().size();
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(z());
    }

    public abstract ImmutableCollection z();
}
