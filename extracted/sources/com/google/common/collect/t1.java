package com.google.common.collect;

import defpackage.mi4;
import defpackage.n48;
import j$.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t1 extends mi4 {
    public final /* synthetic */ StandardTable d;

    public t1(StandardTable standardTable) {
        this.d = standardTable;
    }

    @Override // defpackage.mi4
    public final Set a() {
        return new n48(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.h(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        StandardTable standardTable = this.d;
        if (!standardTable.h(obj)) {
            return null;
        }
        Objects.requireNonNull(obj);
        return standardTable.k(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        throw null;
    }
}
