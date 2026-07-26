package com.google.common.collect;

import defpackage.oa5;
import defpackage.pa5;
import defpackage.q18;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class UnmodifiableSortedMultiset<E> extends Multisets$UnmodifiableMultiset<E> implements q18 {
    private static final long serialVersionUID = 0;
    public transient UnmodifiableSortedMultiset v;

    @Override // defpackage.bk2, defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        return (q18) this.s;
    }

    @Override // defpackage.q18
    public final q18 D0(Object obj, BoundType boundType) {
        q18 q18VarD0 = ((q18) this.s).D0(obj, boundType);
        q18VarD0.getClass();
        return new UnmodifiableSortedMultiset(q18VarD0);
    }

    @Override // defpackage.q18
    public final q18 J() {
        UnmodifiableSortedMultiset unmodifiableSortedMultiset = this.v;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset(((q18) this.s).J());
        unmodifiableSortedMultiset2.v = this;
        this.v = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // defpackage.bk2, defpackage.uj2
    public final Collection Y() {
        return (q18) this.s;
    }

    @Override // com.google.common.collect.Multisets$UnmodifiableMultiset, defpackage.bk2
    /* JADX INFO: renamed from: Z */
    public final oa5 Y() {
        return (q18) this.s;
    }

    @Override // com.google.common.collect.Multisets$UnmodifiableMultiset
    public final Set a0() {
        return z0.k(((q18) this.s).b());
    }

    @Override // com.google.common.collect.Multisets$UnmodifiableMultiset, defpackage.oa5, defpackage.q18
    public final NavigableSet b() {
        return (NavigableSet) super.b();
    }

    @Override // defpackage.q18, defpackage.p18
    public final Comparator comparator() {
        return ((q18) this.s).comparator();
    }

    @Override // defpackage.q18
    public final pa5 firstEntry() {
        return ((q18) this.s).firstEntry();
    }

    @Override // defpackage.q18
    public final q18 h1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        q18 q18VarH1 = ((q18) this.s).h1(obj, boundType, obj2, boundType2);
        q18VarH1.getClass();
        return new UnmodifiableSortedMultiset(q18VarH1);
    }

    @Override // defpackage.q18
    public final q18 k0(Object obj, BoundType boundType) {
        q18 q18VarK0 = ((q18) this.s).k0(obj, boundType);
        q18VarK0.getClass();
        return new UnmodifiableSortedMultiset(q18VarK0);
    }

    @Override // defpackage.q18
    public final pa5 lastEntry() {
        return ((q18) this.s).lastEntry();
    }

    @Override // defpackage.q18
    public final pa5 pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q18
    public final pa5 pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multisets$UnmodifiableMultiset, defpackage.oa5, defpackage.q18
    public final Set b() {
        return (NavigableSet) super.b();
    }
}
