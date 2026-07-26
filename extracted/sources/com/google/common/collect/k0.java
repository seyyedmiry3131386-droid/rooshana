package com.google.common.collect;

import defpackage.zx8;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends zx8 {
    public final zx8 a;

    public k0(ImmutableMapValues immutableMapValues) {
        this.a = immutableMapValues.b.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
