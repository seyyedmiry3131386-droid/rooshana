package com.google.common.collect;

import defpackage.pa5;
import defpackage.q18;
import defpackage.wn5;
import defpackage.zj3;
import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements q18, Collection {
    public static final /* synthetic */ int f = 0;
    private static final long serialVersionUID = 912559;
    public transient ImmutableSortedMultiset e;

    public static final class SerializedForm<E> implements Serializable {
        public final Comparator a;
        public final Object[] b;
        public final int[] c;

        public SerializedForm(ImmutableSortedMultiset immutableSortedMultiset) {
            this.a = immutableSortedMultiset.comparator();
            int size = immutableSortedMultiset.entrySet().size();
            this.b = new Object[size];
            this.c = new int[size];
            int i = 0;
            for (pa5 pa5Var : immutableSortedMultiset.entrySet()) {
                this.b[i] = pa5Var.b();
                this.c[i] = pa5Var.a();
                i++;
            }
        }

        public Object readResolve() {
            int i;
            Object[] objArr = this.b;
            int length = objArr.length;
            zj3 zj3Var = new zj3(this.a);
            for (int i2 = 0; i2 < length; i2++) {
                zj3Var.O(this.c[i2], objArr[i2]);
            }
            zj3Var.P(false);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = zj3Var.v;
                if (i3 >= i) {
                    break;
                }
                int[] iArr = zj3Var.u;
                int i5 = iArr[i3];
                if (i5 > 0) {
                    Object[] objArr2 = zj3Var.t;
                    objArr2[i4] = objArr2[i3];
                    iArr[i4] = i5;
                    i4++;
                }
                i3++;
            }
            Arrays.fill(zj3Var.t, i4, i, (Object) null);
            Arrays.fill(zj3Var.u, i4, zj3Var.v, 0);
            zj3Var.v = i4;
            Comparator comparator = zj3Var.s;
            if (i4 == 0) {
                int i6 = ImmutableSortedMultiset.f;
                return NaturalOrdering.c.equals(comparator) ? RegularImmutableSortedMultiset.l : new RegularImmutableSortedMultiset(comparator);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.v(comparator, i4, zj3Var.t);
            long[] jArr = new long[zj3Var.v + 1];
            int i7 = 0;
            while (i7 < zj3Var.v) {
                int i8 = i7 + 1;
                jArr[i8] = jArr[i7] + ((long) zj3Var.u[i7]);
                i7 = i8;
            }
            zj3Var.w = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, zj3Var.v);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.q18, defpackage.p18
    public final Comparator comparator() {
        return b().d;
    }

    @Override // defpackage.q18
    public final q18 h1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        wn5.k(b().d.compare(obj, obj2) <= 0, "Expected lowerBound <= upperBound but %s > %s", obj, obj2);
        return D0(obj, boundType).k0(obj2, boundType2);
    }

    @Override // defpackage.q18
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedMultiset J() {
        ImmutableSortedMultiset descendingImmutableSortedMultiset = this.e;
        if (descendingImmutableSortedMultiset == null) {
            if (isEmpty()) {
                p1 p1VarH = p1.b(b().d).h();
                descendingImmutableSortedMultiset = NaturalOrdering.c.equals(p1VarH) ? RegularImmutableSortedMultiset.l : new RegularImmutableSortedMultiset(p1VarH);
            } else {
                descendingImmutableSortedMultiset = new DescendingImmutableSortedMultiset(this);
            }
            this.e = descendingImmutableSortedMultiset;
        }
        return descendingImmutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: p */
    public abstract ImmutableSortedSet b();

    @Override // defpackage.q18
    public final pa5 pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q18
    public final pa5 pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q18
    /* JADX INFO: renamed from: q */
    public abstract ImmutableSortedMultiset k0(Object obj, BoundType boundType);

    @Override // defpackage.q18
    /* JADX INFO: renamed from: r */
    public abstract ImmutableSortedMultiset D0(Object obj, BoundType boundType);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
