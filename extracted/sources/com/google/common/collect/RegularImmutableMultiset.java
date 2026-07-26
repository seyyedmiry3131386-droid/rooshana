package com.google.common.collect;

import defpackage.oa5;
import defpackage.pa5;
import defpackage.rq5;
import defpackage.sq5;
import defpackage.wn5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset h;
    public final transient sq5 e;
    public final transient int f;
    public transient ImmutableSet g;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i) {
            sq5 sq5Var = RegularImmutableMultiset.this.e;
            wn5.l(i, sq5Var.c);
            return sq5Var.a[i];
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableMultiset.this.e.c;
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;
        public final int[] b;

        public SerializedForm(oa5 oa5Var) {
            ImmutableMultiset immutableMultiset = (ImmutableMultiset) oa5Var;
            int size = immutableMultiset.entrySet().size();
            this.a = new Object[size];
            this.b = new int[size];
            int i = 0;
            for (pa5 pa5Var : immutableMultiset.entrySet()) {
                this.a[i] = pa5Var.b();
                this.b[i] = pa5Var.a();
                i++;
            }
        }

        public Object readResolve() {
            Object[] objArr = this.a;
            sq5 sq5Var = new sq5(objArr.length, 0);
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                int i2 = this.b[i];
                if (i2 != 0) {
                    obj.getClass();
                    sq5Var.k(sq5Var.c(obj) + i2, obj);
                }
            }
            if (sq5Var.c != 0) {
                return new RegularImmutableMultiset(sq5Var);
            }
            int i3 = ImmutableMultiset.d;
            return RegularImmutableMultiset.h;
        }
    }

    static {
        sq5 sq5Var = new sq5();
        sq5Var.f(3);
        h = new RegularImmutableMultiset(sq5Var);
    }

    public RegularImmutableMultiset(sq5 sq5Var) {
        this.e = sq5Var;
        long jD = 0;
        for (int i = 0; i < sq5Var.c; i++) {
            jD += (long) sq5Var.d(i);
        }
        this.f = com.google.common.primitives.a.f(jD);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset, defpackage.oa5, defpackage.q18
    /* JADX INFO: renamed from: l */
    public final ImmutableSet b() {
        ImmutableSet immutableSet = this.g;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.g = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final pa5 n(int i) {
        sq5 sq5Var = this.e;
        wn5.l(i, sq5Var.c);
        return new rq5(sq5Var, i);
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        return this.e.c(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
