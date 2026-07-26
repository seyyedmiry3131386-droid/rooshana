package com.google.common.collect;

import defpackage.qj3;
import defpackage.vy2;
import defpackage.zx8;
import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable, j$.util.Map {
    private static final long serialVersionUID = 912559;
    public transient ImmutableSet a;
    public transient ImmutableSet b;
    public transient ImmutableCollection c;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableSet c() {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                public final Iterator iterator() {
                    return IteratorBasedImmutableMap.this.p();
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* JADX INFO: renamed from: j */
                public final zx8 iterator() {
                    return IteratorBasedImmutableMap.this.p();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap v() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet e() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap
        public final ImmutableCollection f() {
            return new ImmutableMapValues(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Set keySet() {
            return keySet();
        }

        public abstract zx8 p();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }

        @Override // com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet e() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean h() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final int hashCode() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final zx8 p() {
            throw null;
        }

        @Override // java.util.Map
        public final int size() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;
        public final Object[] b;

        public SerializedForm(ImmutableMap immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            zx8 it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                objArr[i] = entry.getKey();
                objArr2[i] = entry.getValue();
                i++;
            }
            this.a = objArr;
            this.b = objArr2;
        }

        public j0 a(int i) {
            return new j0(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object readResolve() {
            Object[] objArr = this.a;
            boolean z = objArr instanceof ImmutableSet;
            Object[] objArr2 = this.b;
            if (!z) {
                j0 j0VarA = a(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    j0VarA.c(objArr[i], objArr2[i]);
                }
                return j0VarA.b();
            }
            ImmutableSet immutableSet = (ImmutableSet) objArr;
            j0 j0VarA2 = a(immutableSet.size());
            zx8 it = immutableSet.iterator();
            zx8 it2 = ((ImmutableCollection) objArr2).iterator();
            while (it.hasNext()) {
                j0VarA2.c(it.next(), it2.next());
            }
            return j0VarA2.b();
        }
    }

    public static j0 a() {
        return new j0(4);
    }

    public static ImmutableMap b(Map map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap immutableMap = (ImmutableMap) map;
            if (!immutableMap.i()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        j0 j0Var = new j0(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        j0Var.d(setEntrySet);
        return j0Var.a(true);
    }

    public static ImmutableMap l() {
        return RegularImmutableMap.g;
    }

    public static ImmutableMap m(String str, String str2, String str3, String str4) {
        vy2.k("Purpose1", str);
        vy2.k("Purpose3", str2);
        vy2.k("Purpose4", str3);
        vy2.k("Purpose7", str4);
        return RegularImmutableMap.p(4, new Object[]{"Purpose1", str, "Purpose3", str2, "Purpose4", str3, "Purpose7", str4}, null);
    }

    public static ImmutableMap n(String str, String str2, String str3, String str4, String str5) {
        return RegularImmutableMap.p(5, new Object[]{"AuthorizePurpose1", str, "AuthorizePurpose3", str2, "AuthorizePurpose4", str3, "AuthorizePurpose7", str4, "PurposeDiagnostics", str5}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableSet c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    public abstract ImmutableCollection f();

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImmutableSet entrySet() {
        ImmutableSet immutableSet = this.a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetC = c();
        this.a = immutableSetC;
        return immutableSetC;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return z0.f(entrySet());
    }

    public abstract boolean i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public zx8 j() {
        return new qj3(entrySet().iterator(), 0);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public ImmutableSet keySet() {
        ImmutableSet immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet immutableSetE = e();
        this.b = immutableSetE;
        return immutableSetE;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection values() {
        ImmutableCollection immutableCollection = this.c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection immutableCollectionF = f();
        this.c = immutableCollectionF;
        return immutableCollectionF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        vy2.m(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
