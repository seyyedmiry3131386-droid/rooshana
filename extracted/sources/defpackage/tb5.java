package defpackage;

import androidx.collection.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class tb5 implements kx3, Set, dx3 {
    public final sb5 a;
    public final sb5 b;

    public tb5(sb5 sb5Var) {
        this.a = sb5Var;
        this.b = sb5Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.b.d(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        js3.p(collection, "elements");
        sb5 sb5Var = this.b;
        int i = sb5Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sb5Var.k(it.next());
        }
        return i != sb5Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        js3.p(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tb5.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tb5) obj).a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        js3.p(collection, "elements");
        sb5 sb5Var = this.b;
        sb5Var.getClass();
        int i = sb5Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sb5Var.i(it.next());
        }
        return i != sb5Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z;
        js3.p(collection, "elements");
        sb5 sb5Var = this.b;
        sb5Var.getClass();
        Object[] objArr = sb5Var.b;
        int i = sb5Var.d;
        long[] jArr = sb5Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!a.h0(collection, objArr[i5])) {
                                sb5Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    z = false;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    z = false;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        } else {
            z = false;
        }
        if (i != sb5Var.d) {
            return true;
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return tv8.B(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        js3.p(objArr, "array");
        return tv8.C(this, objArr);
    }
}
