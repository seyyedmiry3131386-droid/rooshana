package com.google.common.collect;

import java.util.Map;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.StandardTable
    public final Map i() {
        return new r1(this);
    }

    @Override // com.google.common.collect.StandardTable, defpackage.he8
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public SortedMap f() {
        return (SortedMap) super.f();
    }
}
