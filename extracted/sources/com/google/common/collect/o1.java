package com.google.common.collect;

import defpackage.cy;
import defpackage.qq7;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends qq7 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Multimaps$MapMultimap b;

    public o1(Multimaps$MapMultimap multimaps$MapMultimap, Object obj) {
        this.a = obj;
        this.b = multimaps$MapMultimap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new cy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.b.getClass();
        throw null;
    }
}
