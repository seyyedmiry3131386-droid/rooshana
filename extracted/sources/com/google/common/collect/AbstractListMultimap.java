package com.google.common.collect;

import defpackage.d94;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements d94 {
    private static final long serialVersionUID = 6588350623831699109L;

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection p() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection r(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public final Collection s(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new defpackage.g1(this, obj, list, null) : new q(this, obj, list, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract List l();

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public List a(Object obj) {
        return (List) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public List get(Object obj) {
        return (List) super.get(obj);
    }
}
