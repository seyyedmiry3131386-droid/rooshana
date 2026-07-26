package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class rz2 implements ListIterator, dx3 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rz2(tz2 tz2Var, int i, int i2) {
        this(tz2Var, (i2 & 1) != 0 ? 0 : i, 0, tz2Var.a.b);
        this.a = 0;
    }

    public void a() {
        if (((AbstractList) ((ListBuilder) this.e)).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                ListBuilder listBuilder = (ListBuilder) this.e;
                int i = this.b;
                this.b = i + 1;
                listBuilder.add(i, obj);
                this.c = -1;
                this.d = ((AbstractList) listBuilder).modCount;
                return;
            default:
                b();
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.e;
                snapshotStateList.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = hs9.G(snapshotStateList);
                return;
        }
    }

    public void b() {
        if (hs9.G((SnapshotStateList) this.e) != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < this.d;
            case 1:
                return this.b < ((ListBuilder) this.e).b;
            default:
                return this.b < ((SnapshotStateList) this.e).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > this.c) {
                }
                break;
            case 1:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                mb5 mb5Var = ((tz2) this.e).a;
                int i = this.b;
                this.b = i + 1;
                Object objB = mb5Var.b(i);
                js3.n(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (gx4) objB;
            case 1:
                a();
                int i2 = this.b;
                ListBuilder listBuilder = (ListBuilder) this.e;
                if (i2 >= listBuilder.b) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                this.c = i2;
                return listBuilder.a[i2];
            default:
                b();
                int i3 = this.b + 1;
                this.c = i3;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.e;
                hs9.p(i3, snapshotStateList.size());
                Object obj = snapshotStateList.get(i3);
                this.b = i3;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                mb5 mb5Var = ((tz2) this.e).a;
                int i = this.b - 1;
                this.b = i;
                Object objB = mb5Var.b(i);
                js3.n(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (gx4) objB;
            case 1:
                a();
                int i2 = this.b;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.b = i3;
                this.c = i3;
                return ((ListBuilder) this.e).a[i3];
            default:
                b();
                int i4 = this.b;
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.e;
                hs9.p(i4, snapshotStateList.size());
                int i5 = this.b;
                this.c = i5;
                this.b--;
                return snapshotStateList.get(i5);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                i = this.b - this.c;
                break;
            case 1:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ListBuilder listBuilder = (ListBuilder) this.e;
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                listBuilder.c(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) listBuilder).modCount;
                return;
            default:
                b();
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.e;
                snapshotStateList.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = hs9.G(snapshotStateList);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((ListBuilder) this.e).set(i, obj);
                return;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.e;
                b();
                int i2 = this.c;
                if (i2 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                snapshotStateList.set(i2, obj);
                this.d = hs9.G(snapshotStateList);
                return;
        }
    }

    public rz2(ListBuilder listBuilder, int i) {
        this.a = 1;
        this.e = listBuilder;
        this.b = i;
        this.c = -1;
        this.d = ((AbstractList) listBuilder).modCount;
    }

    public rz2(SnapshotStateList snapshotStateList, int i) {
        this.a = 2;
        this.e = snapshotStateList;
        this.b = i - 1;
        this.c = -1;
        this.d = hs9.G(snapshotStateList);
    }

    public rz2(tz2 tz2Var, int i, int i2, int i3) {
        this.a = 0;
        this.e = tz2Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
