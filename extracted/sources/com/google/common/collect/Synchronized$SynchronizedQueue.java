package com.google.common.collect;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedQueue<E> extends Synchronized$SynchronizedCollection<E> implements Queue<E> {
    private static final long serialVersionUID = 0;

    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.b) {
            objElement = e().element();
        }
        return objElement;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Queue e() {
        return (Queue) ((Collection) this.a);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean zOffer;
        synchronized (this.b) {
            zOffer = e().offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.b) {
            objPeek = e().peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.b) {
            objPoll = e().poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.b) {
            objRemove = e().remove();
        }
        return objRemove;
    }
}
