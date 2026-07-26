package com.google.common.collect;

import defpackage.pt3;
import defpackage.zx8;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends zx8 {
    public final zx8 a;
    public Object b = null;
    public zx8 c = pt3.d;

    public l0(ImmutableMultimap immutableMultimap) {
        this.a = immutableMultimap.f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((ImmutableCollection) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new ImmutableEntry(obj, this.c.next());
    }
}
