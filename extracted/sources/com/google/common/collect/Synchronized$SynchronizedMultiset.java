package com.google.common.collect;

import defpackage.oa5;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedMultiset<E> extends Synchronized$SynchronizedCollection<E> implements oa5 {
    private static final long serialVersionUID = 0;

    @Override // defpackage.oa5
    public final boolean K(int i, Object obj) {
        boolean zK;
        synchronized (this.b) {
            zK = e().K(i, obj);
        }
        return zK;
    }

    @Override // defpackage.oa5
    public final int add(int i, Object obj) {
        int iAdd;
        synchronized (this.b) {
            iAdd = e().add(i, obj);
        }
        return iAdd;
    }

    @Override // defpackage.oa5, defpackage.q18
    public final Set b() {
        synchronized (this.b) {
        }
        return null;
    }

    @Override // defpackage.oa5
    public final Set entrySet() {
        synchronized (this.b) {
        }
        return null;
    }

    @Override // java.util.Collection, defpackage.oa5
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.b) {
            zEquals = e().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, defpackage.oa5
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = e().hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final oa5 e() {
        return (oa5) ((Collection) this.a);
    }

    @Override // defpackage.oa5
    public final int j1(Object obj) {
        int iJ1;
        synchronized (this.b) {
            iJ1 = e().j1(obj);
        }
        return iJ1;
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        int iS0;
        synchronized (this.b) {
            iS0 = e().s0(obj);
        }
        return iS0;
    }

    @Override // defpackage.oa5
    public final int w0(int i, Object obj) {
        int iW0;
        synchronized (this.b) {
            iW0 = e().w0(i, obj);
        }
        return iW0;
    }
}
