package com.google.common.collect;

import com.google.common.base.Optional;
import defpackage.ag2;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements Iterable {
    public final Optional a;

    public e0() {
        this.a = Optional.a();
    }

    public static e0 a(Iterable iterable) {
        return iterable instanceof e0 ? (e0) iterable : new ag2(iterable, iterable);
    }

    public final ImmutableSet c() {
        Iterable iterable = (Iterable) this.a.f(this);
        int i = ImmutableSet.c;
        if (iterable instanceof Collection) {
            return ImmutableSet.n((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return RegularImmutableSet.j;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new SingletonImmutableSet(next);
        }
        o0 o0Var = new o0(4);
        o0Var.e(next);
        while (it.hasNext()) {
            o0Var.e(it.next());
        }
        return o0Var.T();
    }

    public final String toString() {
        Iterator it = ((Iterable) this.a.f(this)).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public e0(Iterable iterable) {
        this.a = Optional.e(iterable);
    }
}
