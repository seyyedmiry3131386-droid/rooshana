package com.google.common.collect;

import com.google.common.collect.LinkedHashMultimap;
import defpackage.wn5;
import j$.util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Iterator {
    public LinkedHashMultimap.ValueEntry a;
    public LinkedHashMultimap.ValueEntry b;
    public final /* synthetic */ LinkedHashMultimap c;

    public s0(LinkedHashMultimap linkedHashMultimap) {
        this.c = linkedHashMultimap;
        LinkedHashMultimap.ValueEntry valueEntry = linkedHashMultimap.h.h;
        Objects.requireNonNull(valueEntry);
        this.a = valueEntry;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.c.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        LinkedHashMultimap.ValueEntry valueEntry = this.a;
        this.b = valueEntry;
        LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry.h;
        Objects.requireNonNull(valueEntry2);
        this.a = valueEntry2;
        return valueEntry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        wn5.s("no calls to next() since the last call to remove()", this.b != null);
        LinkedHashMultimap.ValueEntry valueEntry = this.b;
        this.c.remove(valueEntry.a, valueEntry.b);
        this.b = null;
    }
}
