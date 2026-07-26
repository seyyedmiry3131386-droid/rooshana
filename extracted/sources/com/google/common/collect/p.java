package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a implements ListIterator {
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(qVar);
        this.e = qVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        q qVar = this.e;
        boolean zIsEmpty = qVar.isEmpty();
        b().add(obj);
        qVar.f.g++;
        if (zIsEmpty) {
            qVar.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, int i) {
        super(qVar, ((List) qVar.b).listIterator(i));
        this.e = qVar;
    }
}
