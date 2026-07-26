package com.google.common.collect;

import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    @Override // com.google.common.collect.AbstractMapBasedMultimap, defpackage.n1
    public final Set e() {
        return o();
    }

    @Override // defpackage.n1, defpackage.fa5
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public SortedMap h() {
        return (SortedMap) super.h();
    }

    @Override // defpackage.n1, defpackage.fa5
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        return (SortedSet) super.keySet();
    }
}
