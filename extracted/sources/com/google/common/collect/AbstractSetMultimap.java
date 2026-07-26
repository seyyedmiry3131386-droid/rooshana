package com.google.common.collect;

import defpackage.kq7;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements kq7 {
    private static final long serialVersionUID = 7431625294878419160L;

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection r(Collection collection) {
        return DesugarCollections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection s(Object obj, Collection collection) {
        return new s(this, obj, (Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public abstract Set l();

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Set p() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Set g() {
        return (Set) super.g();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public Set a(Object obj) {
        return (Set) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public Set get(Object obj) {
        return (Set) super.get(obj);
    }
}
