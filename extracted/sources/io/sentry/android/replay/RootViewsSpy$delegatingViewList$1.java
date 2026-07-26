package io.sentry.android.replay;

import android.view.View;
import defpackage.js3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class RootViewsSpy$delegatingViewList$1 extends ArrayList<View> {
    public final /* synthetic */ o a;

    public RootViewsSpy$delegatingViewList$1(o oVar) {
        this.a = oVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View view = (View) obj;
        js3.p(view, "element");
        Iterator<d> it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next().b(view, true);
        }
        return super.add(view);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        js3.p(collection, "elements");
        for (d dVar : this.a.c) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                dVar.b((View) it.next(), true);
            }
        }
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = super.remove(i);
        js3.o(objRemove, "removeAt(...)");
        View view = (View) objRemove;
        Iterator<d> it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next().b(view, false);
        }
        return view;
    }
}
