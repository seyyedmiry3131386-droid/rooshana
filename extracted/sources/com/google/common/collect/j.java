package com.google.common.collect;

import defpackage.ki4;
import defpackage.s7;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends ki4 {
    public final /* synthetic */ AbstractMapBasedMultimap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map) {
        super(map);
        this.b = abstractMapBasedMultimap;
    }

    @Override // defpackage.ki4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        s7.f(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.keySet().hashCode();
    }

    @Override // defpackage.ki4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this, this.a.entrySet().iterator(), 2);
    }

    @Override // defpackage.ki4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.a.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.b.g -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }
}
