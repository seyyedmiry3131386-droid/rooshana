package com.google.common.collect;

import defpackage.a84;
import defpackage.b84;
import defpackage.wn5;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements ListIterator {
    public final Object a;
    public int b;
    public b84 c;
    public b84 d;
    public b84 e;
    public final /* synthetic */ LinkedListMultimap f;

    public x0(LinkedListMultimap linkedListMultimap, Object obj) {
        this.f = linkedListMultimap;
        this.a = obj;
        a84 a84Var = (a84) ((CompactHashMap) linkedListMultimap.h).get(obj);
        this.c = a84Var == null ? null : a84Var.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.e = this.f.m(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        b84 b84Var = this.c;
        if (b84Var == null) {
            throw new NoSuchElementException();
        }
        this.d = b84Var;
        this.e = b84Var;
        this.c = b84Var.e;
        this.b++;
        return b84Var.b;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b84 b84Var = this.e;
        if (b84Var == null) {
            throw new NoSuchElementException();
        }
        this.d = b84Var;
        this.c = b84Var;
        this.e = b84Var.f;
        this.b--;
        return b84Var.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        wn5.s("no calls to next() since the last call to remove()", this.d != null);
        b84 b84Var = this.d;
        if (b84Var != this.c) {
            this.e = b84Var.f;
            this.b--;
        } else {
            this.c = b84Var.e;
        }
        LinkedListMultimap.l(this.f, b84Var);
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        wn5.t(this.d != null);
        this.d.b = obj;
    }

    public x0(LinkedListMultimap linkedListMultimap, Object obj, int i) {
        this.f = linkedListMultimap;
        a84 a84Var = (a84) ((CompactHashMap) linkedListMultimap.h).get(obj);
        int i2 = a84Var == null ? 0 : a84Var.c;
        wn5.n(i, i2);
        if (i >= i2 / 2) {
            this.e = a84Var == null ? null : a84Var.b;
            this.b = i2;
            while (true) {
                int i3 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i3;
            }
        } else {
            this.c = a84Var == null ? null : a84Var.a;
            while (true) {
                int i4 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i4;
            }
        }
        this.a = obj;
        this.d = null;
    }
}
