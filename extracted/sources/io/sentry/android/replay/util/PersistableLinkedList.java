package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import defpackage.js3;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class PersistableLinkedList extends ConcurrentLinkedDeque<io.sentry.rrweb.b> {
    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) obj;
        js3.p(bVar, "element");
        super.add(bVar);
        throw null;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean addAll(Collection collection) {
        js3.p(collection, "elements");
        super.addAll(collection);
        throw null;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof io.sentry.rrweb.b) {
            return super.contains((io.sentry.rrweb.b) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof io.sentry.rrweb.b) {
            return super.remove((io.sentry.rrweb.b) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque, java.util.Queue
    public final Object remove() {
        throw null;
    }
}
