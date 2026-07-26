package com.google.common.collect;

import defpackage.fk2;
import defpackage.gi4;
import defpackage.hi4;
import defpackage.ml9;
import defpackage.rq8;
import defpackage.tv8;
import defpackage.vy2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends fk2 {
    public final /* synthetic */ int s;
    public final Set t;
    public final /* synthetic */ AbstractBiMap u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractBiMap abstractBiMap, int i) {
        super(16);
        this.s = i;
        switch (i) {
            case 1:
                super(16);
                this.u = abstractBiMap;
                this.t = abstractBiMap.t.keySet();
                break;
            default:
                this.u = abstractBiMap;
                this.t = abstractBiMap.s.entrySet();
                break;
        }
    }

    @Override // defpackage.fk2, defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        switch (this.s) {
        }
        return this.t;
    }

    @Override // defpackage.fk2, defpackage.uj2
    public final Collection Y() {
        switch (this.s) {
        }
        return this.t;
    }

    @Override // defpackage.fk2
    /* JADX INFO: renamed from: Z */
    public final Set Y() {
        switch (this.s) {
        }
        return this.t;
    }

    @Override // defpackage.uj2, java.util.Collection
    public void clear() {
        switch (this.s) {
            case 0:
                this.u.clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.s) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.t.contains(new hi4((Map.Entry) obj));
            default:
                return super.contains(obj);
        }
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.s) {
            case 0:
                return ml9.o(this, collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.uj2, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.s) {
            case 0:
                AbstractBiMap abstractBiMap = this.u;
                return new a(abstractBiMap, abstractBiMap.s.entrySet().iterator(), 0);
            default:
                return new gi4(this.u.entrySet().iterator(), 1);
        }
    }

    @Override // defpackage.uj2, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.s) {
            case 0:
                Set set = this.t;
                if (!set.contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                this.u.t.s.remove(entry.getValue());
                set.remove(entry);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // defpackage.uj2, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.s) {
            case 0:
                collection.getClass();
                return z0.i(this, collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // defpackage.uj2, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.s) {
            case 0:
                Iterator it = iterator();
                collection.getClass();
                boolean z = false;
                while (true) {
                    a aVar = (a) it;
                    if (!aVar.hasNext()) {
                        return z;
                    }
                    if (!collection.contains(aVar.next())) {
                        aVar.remove();
                        z = true;
                    }
                }
                break;
            default:
                return super.retainAll(collection);
        }
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        switch (this.s) {
            case 0:
                return toArray(new Object[size()]);
            default:
                return toArray(new Object[size()]);
        }
    }

    @Override // defpackage.hs9
    public String toString() {
        switch (this.s) {
            case 1:
                int size = size();
                vy2.m(size, "size");
                StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
                sb.append('[');
                Iterator it = iterator();
                boolean z = true;
                while (true) {
                    rq8 rq8Var = (rq8) it;
                    if (!rq8Var.a.hasNext()) {
                        sb.append(']');
                        return sb.toString();
                    }
                    Object next = rq8Var.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    if (next == this) {
                        sb.append("(this Collection)");
                    } else {
                        sb.append(next);
                    }
                    z = false;
                }
                break;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        switch (this.s) {
        }
        return tv8.D(this, objArr);
    }
}
