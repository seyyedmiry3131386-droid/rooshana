package com.google.common.collect;

import defpackage.wn5;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj, Iterator it, int i) {
        this.a = i;
        this.b = it;
        this.d = obj;
    }

    public void a() {
        o oVar = (o) this.d;
        oVar.c();
        if (oVar.b != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                a();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = entry;
                return new b((AbstractBiMap) this.d, entry, 0);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = (Collection) entry2.getValue();
                return ((h) this.d).c(entry2);
            case 2:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                this.c = entry3;
                return entry3.getKey();
            default:
                a();
                return this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.c;
                if (entry == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Object value = entry.getValue();
                this.b.remove();
                ((AbstractBiMap) this.d).t.s.remove(value);
                this.c = null;
                return;
            case 1:
                wn5.s("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                this.b.remove();
                ((h) this.d).e.g -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 2:
                wn5.s("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                this.b.remove();
                ((j) this.d).b.g -= collection.size();
                collection.clear();
                this.c = null;
                return;
            default:
                this.b.remove();
                o oVar = (o) this.d;
                AbstractMapBasedMultimap abstractMapBasedMultimap = oVar.e;
                abstractMapBasedMultimap.g--;
                oVar.d();
                return;
        }
    }

    public a(o oVar) {
        this.a = 3;
        this.d = oVar;
        Collection collection = oVar.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public a(o oVar, Iterator it) {
        this.a = 3;
        this.d = oVar;
        this.c = oVar.b;
        this.b = it;
    }

    public a(h hVar) {
        this.a = 1;
        this.d = hVar;
        this.b = hVar.d.entrySet().iterator();
    }
}
