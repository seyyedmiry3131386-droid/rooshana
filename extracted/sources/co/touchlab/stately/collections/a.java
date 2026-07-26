package co.touchlab.stately.collections;

import defpackage.bp2;
import defpackage.dx3;
import defpackage.js3;
import defpackage.tx8;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterator, dx3 {
    public final Object a;
    public final Iterator b;

    public a(Object obj, Iterator it) {
        js3.p(it, "del");
        this.a = obj;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object objInvoke;
        Object obj = this.a;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator$hasNext$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.b.hasNext());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objInvoke;
        Object obj = this.a;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator$next$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.b.next();
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return objInvoke;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Object obj = this.a;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableIterator$remove$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.b.remove();
                return tx8.a;
            }
        };
        synchronized (obj) {
            bp2Var.invoke();
        }
    }
}
