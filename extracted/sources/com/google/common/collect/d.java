package com.google.common.collect;

import defpackage.fk2;
import defpackage.gi4;
import defpackage.rq8;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d extends fk2 {
    public final /* synthetic */ AbstractBiMap s;

    public d(AbstractBiMap abstractBiMap) {
        super(16);
        this.s = abstractBiMap;
    }

    @Override // defpackage.fk2
    /* JADX INFO: renamed from: Z */
    public final Set Y() {
        return this.s.s.keySet();
    }

    @Override // defpackage.uj2, java.util.Collection
    public final void clear() {
        this.s.clear();
    }

    @Override // defpackage.uj2, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gi4(this.s.entrySet().iterator(), 0);
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        AbstractBiMap abstractBiMap = this.s;
        abstractBiMap.t.s.remove(abstractBiMap.s.remove(obj));
        return true;
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return z0.i(this, collection);
    }

    @Override // defpackage.uj2, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = iterator();
        collection.getClass();
        boolean z = false;
        while (true) {
            rq8 rq8Var = (rq8) it;
            if (!rq8Var.hasNext()) {
                return z;
            }
            if (!collection.contains(rq8Var.next())) {
                rq8Var.remove();
                z = true;
            }
        }
    }
}
