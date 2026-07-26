package com.google.common.collect;

import defpackage.h70;
import defpackage.oa5;
import defpackage.pa5;
import defpackage.sj3;
import defpackage.zx8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMultimap<K, V> extends h70 implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient ImmutableMap f;

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        public final ImmutableMultimap b;

        public EntryCollection(ImmutableMultimap immutableMultimap) {
            this.b = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.b.i(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return this.b.f.i();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final zx8 iterator() {
            ImmutableMultimap immutableMultimap = this.b;
            immutableMultimap.getClass();
            return new l0(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            this.b.getClass();
            return 0;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        public Keys() {
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return ImmutableMultimap.this.f.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableMultiset, defpackage.oa5, defpackage.q18
        /* JADX INFO: renamed from: l */
        public final ImmutableSet b() {
            return ImmutableMultimap.this.f.keySet();
        }

        @Override // com.google.common.collect.ImmutableMultiset
        public final pa5 n(int i) {
            Map.Entry entry = (Map.Entry) ImmutableMultimap.this.f.entrySet().a().get(i);
            return new Multisets$ImmutableEntry(((Collection) entry.getValue()).size(), entry.getKey());
        }

        @Override // defpackage.oa5
        public final int s0(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.f.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }
    }

    public static final class KeysSerializedForm implements Serializable {
        public final ImmutableMultimap a;

        public KeysSerializedForm(ImmutableMultimap immutableMultimap) {
            this.a = immutableMultimap;
        }

        public Object readResolve() {
            ImmutableMultimap immutableMultimap = this.a;
            oa5 keys = immutableMultimap.c;
            if (keys == null) {
                keys = new Keys();
                immutableMultimap.c = keys;
            }
            return (ImmutableMultiset) keys;
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        public final transient ImmutableMultimap b;

        public Values(ImmutableMultimap immutableMultimap) {
            this.b = immutableMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int c(int i, Object[] objArr) {
            zx8 it = this.b.f.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).c(i, objArr);
            }
            return i;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.b.b(obj);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final zx8 iterator() {
            ImmutableMultimap immutableMultimap = this.b;
            immutableMultimap.getClass();
            return new sj3(immutableMultimap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            this.b.getClass();
            return 0;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ImmutableMultimap(ImmutableMap immutableMap) {
        this.f = immutableMap;
    }

    @Override // defpackage.fa5
    public /* bridge */ /* synthetic */ Collection a(Object obj) {
        p();
        throw null;
    }

    @Override // defpackage.n1
    public final boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // defpackage.n1
    public final Map c() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.fa5
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fa5
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // defpackage.n1
    public final Set e() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.n1
    public final Collection f() {
        return new Values(this);
    }

    @Override // defpackage.n1
    public final Iterator j() {
        return new l0(this);
    }

    @Override // defpackage.n1
    public final Iterator k() {
        return new sj3(this);
    }

    @Override // defpackage.n1, defpackage.fa5
    public final Set keySet() {
        return this.f.keySet();
    }

    @Override // defpackage.n1, defpackage.fa5
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ImmutableMap h() {
        return this.f;
    }

    @Override // defpackage.n1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection g() {
        Collection entryCollection = this.a;
        if (entryCollection == null) {
            entryCollection = new EntryCollection(this);
            this.a = entryCollection;
        }
        return (ImmutableCollection) entryCollection;
    }

    public final zx8 n() {
        return new l0(this);
    }

    @Override // defpackage.fa5
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection get(Object obj);

    public ImmutableCollection p() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.n1, defpackage.fa5
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fa5
    public final int size() {
        return 0;
    }

    @Override // defpackage.n1, defpackage.fa5
    public final Collection values() {
        return (ImmutableCollection) super.values();
    }
}
