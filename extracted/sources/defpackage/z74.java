package defpackage;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.x0;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class z74 implements Iterator {
    public final HashSet a;
    public b84 b;
    public b84 c;
    public int d;
    public final /* synthetic */ LinkedListMultimap e;

    public z74(LinkedListMultimap linkedListMultimap) {
        this.e = linkedListMultimap;
        this.a = new HashSet(hs9.v(linkedListMultimap.keySet().size()));
        this.b = linkedListMultimap.f;
        this.d = linkedListMultimap.j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e.j == this.d) {
            return this.b != null;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        b84 b84Var;
        if (this.e.j != this.d) {
            throw new ConcurrentModificationException();
        }
        b84 b84Var2 = this.b;
        if (b84Var2 == null) {
            throw new NoSuchElementException();
        }
        this.c = b84Var2;
        Object obj = b84Var2.a;
        HashSet hashSet = this.a;
        hashSet.add(obj);
        do {
            b84Var = this.b.c;
            this.b = b84Var;
            if (b84Var == null) {
                break;
            }
        } while (!hashSet.add(b84Var.a));
        return this.c.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        LinkedListMultimap linkedListMultimap = this.e;
        if (linkedListMultimap.j != this.d) {
            throw new ConcurrentModificationException();
        }
        wn5.s("no calls to next() since the last call to remove()", this.c != null);
        s7.f(new x0(linkedListMultimap, this.c.a));
        this.c = null;
        this.d = linkedListMultimap.j;
    }
}
