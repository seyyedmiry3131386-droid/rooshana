package com.google.common.collect;

import defpackage.hs9;
import defpackage.vb8;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HashBasedTable<R, C, V> extends StandardTable<R, C, V> {
    private static final long serialVersionUID = 0;

    public static class Factory<C, V> implements vb8, Serializable {
        private static final long serialVersionUID = 0;

        @Override // defpackage.vb8
        public final Object get() {
            return new LinkedHashMap(hs9.v(0));
        }
    }

    @Override // com.google.common.collect.StandardTable, defpackage.z2
    public final void b() {
        throw null;
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
        return new s1(this, obj);
    }

    @Override // com.google.common.collect.StandardTable, defpackage.he8
    public final int size() {
        throw null;
    }
}
