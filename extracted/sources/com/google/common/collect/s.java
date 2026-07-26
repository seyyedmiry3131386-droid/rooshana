package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s extends o implements Set {
    public final /* synthetic */ AbstractMapBasedMultimap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, Set set) {
        super(abstractMapBasedMultimap, obj, set, null);
        this.f = abstractMapBasedMultimap;
    }

    @Override // com.google.common.collect.o, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zI = z0.i((Set) this.b, collection);
        if (zI) {
            this.f.g += this.b.size() - size;
            d();
        }
        return zI;
    }
}
