package io.sentry.cache.tape;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements Iterable, Closeable {
    public void clear() {
        y(size());
    }

    public abstract void d(Object obj);

    public abstract int size();

    public final List u() {
        int iMin = Math.min(size(), size());
        ArrayList arrayList = new ArrayList(iMin);
        Iterator it = iterator();
        for (int i = 0; i < iMin; i++) {
            arrayList.add(it.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public abstract void y(int i);
}
