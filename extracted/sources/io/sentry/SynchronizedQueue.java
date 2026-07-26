package io.sentry;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
    private static final long serialVersionUID = 1;

    @Override // io.sentry.SynchronizedCollection
    public final Collection a() {
        return (Queue) this.a;
    }

    @Override // java.util.Queue
    public final Object element() {
        r rVarA = this.b.a();
        try {
            Object objElement = ((Queue) this.a).element();
            rVarA.close();
            return objElement;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.SynchronizedCollection, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        r rVarA = this.b.a();
        try {
            boolean zEquals = ((Queue) this.a).equals(obj);
            rVarA.close();
            return zEquals;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.SynchronizedCollection, java.util.Collection
    public final int hashCode() {
        r rVarA = this.b.a();
        try {
            int iHashCode = ((Queue) this.a).hashCode();
            rVarA.close();
            return iHashCode;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        r rVarA = this.b.a();
        try {
            boolean zOffer = ((Queue) this.a).offer(obj);
            rVarA.close();
            return zOffer;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        r rVarA = this.b.a();
        try {
            Object objPeek = ((Queue) this.a).peek();
            rVarA.close();
            return objPeek;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        r rVarA = this.b.a();
        try {
            Object objPoll = ((Queue) this.a).poll();
            rVarA.close();
            return objPoll;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        r rVarA = this.b.a();
        try {
            Object objRemove = ((Queue) this.a).remove();
            rVarA.close();
            return objRemove;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.SynchronizedCollection, java.util.Collection
    public final Object[] toArray() {
        r rVarA = this.b.a();
        try {
            Object[] array = ((Queue) this.a).toArray();
            rVarA.close();
            return array;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.SynchronizedCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        r rVarA = this.b.a();
        try {
            Object[] array = ((Queue) this.a).toArray(objArr);
            rVarA.close();
            return array;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
