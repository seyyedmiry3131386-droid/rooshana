package co.touchlab.stately.collections;

import defpackage.bp2;
import defpackage.js3;
import defpackage.tx8;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a implements ListIterator {
    public final Object c;
    public final ListIterator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, ListIterator listIterator) {
        super(obj, listIterator);
        js3.p(listIterator, "del");
        this.c = obj;
        this.d = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(final Object obj) {
        Object obj2 = this.c;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$add$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.d.add(obj);
                return tx8.a;
            }
        };
        synchronized (obj2) {
            bp2Var.invoke();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        Object objInvoke;
        Object obj = this.c;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$hasPrevious$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Boolean.valueOf(this.g.d.hasPrevious());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        Object objInvoke;
        Object obj = this.c;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$nextIndex$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Integer.valueOf(this.g.d.nextIndex());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object objInvoke;
        Object obj = this.c;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$previous$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return this.g.d.previous();
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return objInvoke;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        Object objInvoke;
        Object obj = this.c;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$previousIndex$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return Integer.valueOf(this.g.d.previousIndex());
            }
        };
        synchronized (obj) {
            objInvoke = bp2Var.invoke();
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // java.util.ListIterator
    public final void set(final Object obj) {
        Object obj2 = this.c;
        bp2 bp2Var = new bp2() { // from class: co.touchlab.stately.collections.ConcurrentMutableListIterator$set$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                this.g.d.set(obj);
                return tx8.a;
            }
        };
        synchronized (obj2) {
            bp2Var.invoke();
        }
    }
}
