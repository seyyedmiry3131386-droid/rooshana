package com.google.common.collect;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedDeque<E> extends Synchronized$SynchronizedQueue<E> implements Deque<E> {
    private static final long serialVersionUID = 0;

    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        synchronized (this.b) {
            ((Deque) super.e()).addFirst(obj);
        }
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        synchronized (this.b) {
            ((Deque) super.e()).addLast(obj);
        }
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        Iterator<E> itDescendingIterator;
        synchronized (this.b) {
            itDescendingIterator = ((Deque) super.e()).descendingIterator();
        }
        return itDescendingIterator;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedQueue, com.google.common.collect.Synchronized$SynchronizedCollection
    public final Collection e() {
        return (Deque) super.e();
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        Object first;
        synchronized (this.b) {
            first = ((Deque) super.e()).getFirst();
        }
        return first;
    }

    @Override // java.util.Deque
    public final Object getLast() {
        Object last;
        synchronized (this.b) {
            last = ((Deque) super.e()).getLast();
        }
        return last;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedQueue
    /* JADX INFO: renamed from: j */
    public final Queue e() {
        return (Deque) super.e();
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        boolean zOfferFirst;
        synchronized (this.b) {
            zOfferFirst = ((Deque) super.e()).offerFirst(obj);
        }
        return zOfferFirst;
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        boolean zOfferLast;
        synchronized (this.b) {
            zOfferLast = ((Deque) super.e()).offerLast(obj);
        }
        return zOfferLast;
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        Object objPeekFirst;
        synchronized (this.b) {
            objPeekFirst = ((Deque) super.e()).peekFirst();
        }
        return objPeekFirst;
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        Object objPeekLast;
        synchronized (this.b) {
            objPeekLast = ((Deque) super.e()).peekLast();
        }
        return objPeekLast;
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        Object objPollFirst;
        synchronized (this.b) {
            objPollFirst = ((Deque) super.e()).pollFirst();
        }
        return objPollFirst;
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        Object objPollLast;
        synchronized (this.b) {
            objPollLast = ((Deque) super.e()).pollLast();
        }
        return objPollLast;
    }

    @Override // java.util.Deque
    public final Object pop() {
        Object objPop;
        synchronized (this.b) {
            objPop = ((Deque) super.e()).pop();
        }
        return objPop;
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        synchronized (this.b) {
            ((Deque) super.e()).push(obj);
        }
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        Object objRemoveFirst;
        synchronized (this.b) {
            objRemoveFirst = ((Deque) super.e()).removeFirst();
        }
        return objRemoveFirst;
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        boolean zRemoveFirstOccurrence;
        synchronized (this.b) {
            zRemoveFirstOccurrence = ((Deque) super.e()).removeFirstOccurrence(obj);
        }
        return zRemoveFirstOccurrence;
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        Object objRemoveLast;
        synchronized (this.b) {
            objRemoveLast = ((Deque) super.e()).removeLast();
        }
        return objRemoveLast;
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        boolean zRemoveLastOccurrence;
        synchronized (this.b) {
            zRemoveLastOccurrence = ((Deque) super.e()).removeLastOccurrence(obj);
        }
        return zRemoveLastOccurrence;
    }
}
