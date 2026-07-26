package com.google.common.collect;

import defpackage.ak2;
import defpackage.fa5;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Multimaps$UnmodifiableMultimap<K, V> extends ak2 implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.ak2
    /* JADX INFO: renamed from: Y */
    public fa5 A() {
        return null;
    }

    public Collection a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fa5
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public Collection get(Object obj) {
        throw null;
    }

    @Override // defpackage.fa5
    public final Map h() {
        throw null;
    }

    @Override // defpackage.fa5
    public final Set keySet() {
        throw null;
    }

    @Override // defpackage.fa5
    public final boolean put(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.fa5
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fa5
    public final Collection values() {
        throw null;
    }
}
