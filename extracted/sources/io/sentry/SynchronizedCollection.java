package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class SynchronizedCollection<E> implements Collection<E>, Serializable {
    private static final long serialVersionUID = 2412805092710877986L;
    public final Collection a;
    public final AutoClosableReentrantLock b = new AutoClosableReentrantLock();

    public SynchronizedCollection(Collection collection) {
        this.a = collection;
    }

    public Collection a() {
        return this.a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        r rVarA = this.b.a();
        try {
            boolean zAdd = a().add(obj);
            rVarA.close();
            return zAdd;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        r rVarA = this.b.a();
        try {
            boolean zAddAll = a().addAll(collection);
            rVarA.close();
            return zAddAll;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        r rVarA = this.b.a();
        try {
            a().clear();
            rVarA.close();
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        r rVarA = this.b.a();
        try {
            boolean zContains = a().contains(obj);
            rVarA.close();
            return zContains;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        r rVarA = this.b.a();
        try {
            boolean zContainsAll = a().containsAll(collection);
            rVarA.close();
            return zContainsAll;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        r rVarA = this.b.a();
        boolean z = true;
        if (obj == this) {
            rVarA.close();
            return true;
        }
        if (obj != this) {
            try {
                if (!a().equals(obj)) {
                    z = false;
                }
            } catch (Throwable th) {
                try {
                    rVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        rVarA.close();
        return z;
    }

    @Override // java.util.Collection
    public int hashCode() {
        r rVarA = this.b.a();
        try {
            int iHashCode = a().hashCode();
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

    @Override // java.util.Collection
    public final boolean isEmpty() {
        r rVarA = this.b.a();
        try {
            boolean zIsEmpty = a().isEmpty();
            rVarA.close();
            return zIsEmpty;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        r rVarA = this.b.a();
        try {
            boolean zRemove = a().remove(obj);
            rVarA.close();
            return zRemove;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        r rVarA = this.b.a();
        try {
            boolean zRemoveAll = a().removeAll(collection);
            rVarA.close();
            return zRemoveAll;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        r rVarA = this.b.a();
        try {
            boolean zRetainAll = a().retainAll(collection);
            rVarA.close();
            return zRetainAll;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        r rVarA = this.b.a();
        try {
            int size = a().size();
            rVarA.close();
            return size;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        r rVarA = this.b.a();
        try {
            Object[] array = a().toArray();
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

    public final String toString() {
        r rVarA = this.b.a();
        try {
            String string = a().toString();
            rVarA.close();
            return string;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        r rVarA = this.b.a();
        try {
            Object[] array = a().toArray(objArr);
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
