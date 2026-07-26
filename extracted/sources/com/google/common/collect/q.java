package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class q extends o implements List {
    public final /* synthetic */ AbstractMapBasedMultimap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, List list, o oVar) {
        super(abstractMapBasedMultimap, obj, list, oVar);
        this.f = abstractMapBasedMultimap;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.g++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (zAddAll) {
            this.f.g += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new p(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = ((List) this.b).remove(i);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.f;
        abstractMapBasedMultimap.g--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        List listSubList = ((List) this.b).subList(i, i2);
        o oVar = this.c;
        if (oVar == null) {
            oVar = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.f;
        Object obj = this.a;
        return z ? new defpackage.g1(abstractMapBasedMultimap, obj, listSubList, oVar) : new q(abstractMapBasedMultimap, obj, listSubList, oVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new p(this, i);
    }
}
