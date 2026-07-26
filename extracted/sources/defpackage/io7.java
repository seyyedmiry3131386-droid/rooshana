package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class io7 implements Iterator, g51, dx3 {
    public int a;
    public Object b;
    public Iterator c;
    public g51 d;

    public final RuntimeException a() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void b(g51 g51Var, Object obj) {
        this.b = obj;
        this.a = 3;
        this.d = g51Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        js3.p(g51Var, "frame");
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return EmptyCoroutineContext.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.c;
                js3.m(it);
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            g51 g51Var = this.d;
            js3.m(g51Var);
            this.d = null;
            g51Var.resumeWith(tx8.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.a = 1;
            Iterator it = this.c;
            js3.m(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        b.b(obj);
        this.a = 4;
    }
}
