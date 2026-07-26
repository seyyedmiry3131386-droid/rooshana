package kotlin.collections.builders;

import defpackage.dx3;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ListIterator, dx3 {
    public final ListBuilder.BuilderSubList a;
    public int b;
    public int c = -1;
    public int d;

    public a(ListBuilder.BuilderSubList builderSubList, int i) {
        this.a = builderSubList;
        this.b = i;
        this.d = ((AbstractList) builderSubList).modCount;
    }

    public final void a() {
        if (((AbstractList) this.a.e).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        ListBuilder.BuilderSubList builderSubList = this.a;
        builderSubList.add(i, obj);
        this.c = -1;
        this.d = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b;
        ListBuilder.BuilderSubList builderSubList = this.a;
        if (i >= builderSubList.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        return builderSubList.a[builderSubList.b + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.b = i2;
        this.c = i2;
        ListBuilder.BuilderSubList builderSubList = this.a;
        return builderSubList.a[builderSubList.b + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        ListBuilder.BuilderSubList builderSubList = this.a;
        builderSubList.c(i);
        this.b = this.c;
        this.c = -1;
        this.d = ((AbstractList) builderSubList).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.a.set(i, obj);
    }
}
