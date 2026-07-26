package com.google.common.collect;

import defpackage.is8;
import defpackage.vb8;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;

    public static class Factory<C, V> implements vb8, Serializable {
        private static final long serialVersionUID = 0;

        @Override // defpackage.vb8
        public final Object get() {
            return new TreeMap((Comparator) null);
        }
    }

    @Override // com.google.common.collect.StandardTable, defpackage.z2
    public final void b() {
        throw null;
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, defpackage.he8
    public final Map f() {
        return super.f();
    }

    @Override // com.google.common.collect.StandardTable
    public final boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final Object j(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        throw null;
    }

    @Override // com.google.common.collect.StandardTable
    public final Map k(Object obj) {
        return new is8(this, obj, null, null);
    }

    @Override // com.google.common.collect.StandardTable, defpackage.he8
    public final int size() {
        throw null;
    }
}
