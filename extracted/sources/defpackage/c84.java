package defpackage;

import com.google.common.collect.LinkedListMultimap;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c84 implements ListIterator {
    public int a;
    public b84 b;
    public b84 c;
    public b84 d;
    public int e;
    public final /* synthetic */ LinkedListMultimap f;

    public c84(LinkedListMultimap linkedListMultimap, int i) {
        this.f = linkedListMultimap;
        this.e = linkedListMultimap.j;
        int i2 = linkedListMultimap.i;
        wn5.n(i, i2);
        if (i < i2 / 2) {
            this.b = linkedListMultimap.f;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                a();
                b84 b84Var = this.b;
                if (b84Var == null) {
                    throw new NoSuchElementException();
                }
                this.c = b84Var;
                this.d = b84Var;
                this.b = b84Var.c;
                this.a++;
                i = i3;
            }
        } else {
            this.d = linkedListMultimap.g;
            this.a = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                a();
                b84 b84Var2 = this.d;
                if (b84Var2 == null) {
                    throw new NoSuchElementException();
                }
                this.c = b84Var2;
                this.b = b84Var2;
                this.d = b84Var2.d;
                this.a--;
                i = i4;
            }
        }
        this.c = null;
    }

    public final void a() {
        if (this.f.j != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return this.d != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        b84 b84Var = this.b;
        if (b84Var == null) {
            throw new NoSuchElementException();
        }
        this.c = b84Var;
        this.d = b84Var;
        this.b = b84Var.c;
        this.a++;
        return b84Var;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        b84 b84Var = this.d;
        if (b84Var == null) {
            throw new NoSuchElementException();
        }
        this.c = b84Var;
        this.b = b84Var;
        this.d = b84Var.d;
        this.a--;
        return b84Var;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        wn5.s("no calls to next() since the last call to remove()", this.c != null);
        b84 b84Var = this.c;
        if (b84Var != this.b) {
            this.d = b84Var.d;
            this.a--;
        } else {
            this.b = b84Var.c;
        }
        LinkedListMultimap linkedListMultimap = this.f;
        LinkedListMultimap.l(linkedListMultimap, b84Var);
        this.c = null;
        this.e = linkedListMultimap.j;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
