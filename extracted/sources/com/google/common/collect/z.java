package com.google.common.collect;

import defpackage.at2;
import defpackage.hs9;
import defpackage.s7;
import defpackage.z2;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                ((CompactHashMap) this.b).clear();
                break;
            case 1:
                ((CompactHashMap) this.b).clear();
                break;
            default:
                ((z2) this.b).b();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        switch (this.a) {
            case 0:
                CompactHashMap compactHashMap = (CompactHashMap) this.b;
                Map mapG = compactHashMap.g();
                if (mapG != null) {
                    return mapG.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iL = compactHashMap.l(entry.getKey());
                    if (iL != -1 && s7.l(compactHashMap.t()[iL], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((CompactHashMap) this.b).containsKey(obj);
            default:
                if (!(obj instanceof u1)) {
                    return false;
                }
                Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) ((u1) obj);
                Map map = (Map) hs9.Q(((z2) this.b).f(), tables$ImmutableCell.a);
                if (map == null) {
                    return false;
                }
                Set setEntrySet = map.entrySet();
                ImmutableEntry immutableEntry = new ImmutableEntry(tables$ImmutableCell.b, tables$ImmutableCell.c);
                Set set = setEntrySet;
                set.getClass();
                try {
                    zContains = set.contains(immutableEntry);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    zContains = false;
                }
                return zContains;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                CompactHashMap compactHashMap = (CompactHashMap) this.b;
                Map mapG = compactHashMap.g();
                return mapG != null ? mapG.entrySet().iterator() : new y(compactHashMap, 1);
            case 1:
                CompactHashMap compactHashMap2 = (CompactHashMap) this.b;
                Map mapG2 = compactHashMap2.g();
                return mapG2 != null ? mapG2.keySet().iterator() : new y(compactHashMap2, 0);
            default:
                return ((z2) this.b).a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove;
        switch (this.a) {
            case 0:
                CompactHashMap compactHashMap = (CompactHashMap) this.b;
                Map mapG = compactHashMap.g();
                if (mapG != null) {
                    return mapG.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!compactHashMap.p()) {
                        int iJ = compactHashMap.j();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = compactHashMap.a;
                        Objects.requireNonNull(obj2);
                        int iJ0 = at2.j0(key, value, iJ, obj2, compactHashMap.r(), compactHashMap.s(), compactHashMap.t());
                        if (iJ0 != -1) {
                            compactHashMap.o(iJ0, iJ);
                            compactHashMap.f--;
                            compactHashMap.k();
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                CompactHashMap compactHashMap2 = (CompactHashMap) this.b;
                Map mapG2 = compactHashMap2.g();
                return mapG2 != null ? mapG2.keySet().remove(obj) : compactHashMap2.q(obj) != CompactHashMap.j;
            default:
                if (!(obj instanceof u1)) {
                    return false;
                }
                Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) ((u1) obj);
                Map map = (Map) hs9.Q(((z2) this.b).f(), tables$ImmutableCell.a);
                if (map == null) {
                    return false;
                }
                Set setEntrySet = map.entrySet();
                ImmutableEntry immutableEntry = new ImmutableEntry(tables$ImmutableCell.b, tables$ImmutableCell.c);
                Set set = setEntrySet;
                set.getClass();
                try {
                    zRemove = set.remove(immutableEntry);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    zRemove = false;
                }
                return zRemove;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
            case 0:
                return ((CompactHashMap) this.b).size();
            case 1:
                return ((CompactHashMap) this.b).size();
            default:
                return ((z2) this.b).size();
        }
    }
}
