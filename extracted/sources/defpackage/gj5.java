package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class gj5 implements Iterator, dx3 {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ jx9 c;

    public gj5(jx9 jx9Var) {
        this.c = jx9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < ((m28) this.c.c).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = true;
        m28 m28Var = (m28) this.c.c;
        int i = this.a + 1;
        this.a = i;
        return (wi5) m28Var.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        m28 m28Var = (m28) this.c.c;
        ((wi5) m28Var.g(this.a)).c = null;
        int i = this.a;
        Object[] objArr = m28Var.c;
        Object obj = objArr[i];
        Object obj2 = m91.e;
        if (obj != obj2) {
            objArr[i] = obj2;
            m28Var.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
