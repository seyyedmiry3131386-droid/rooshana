package com.google.common.collect;

import defpackage.rh4;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractMap b;

    public /* synthetic */ b0(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((CompactHashMap) this.b).clear();
                break;
            default:
                ((MapMakerInternalMap) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                return ((MapMakerInternalMap) this.b).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return ((MapMakerInternalMap) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                CompactHashMap compactHashMap = (CompactHashMap) this.b;
                Map mapG = compactHashMap.g();
                return mapG != null ? mapG.values().iterator() : new y(compactHashMap, 2);
            default:
                return new rh4((MapMakerInternalMap) this.b, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((CompactHashMap) this.b).size();
            default:
                return ((MapMakerInternalMap) this.b).size();
        }
    }
}
