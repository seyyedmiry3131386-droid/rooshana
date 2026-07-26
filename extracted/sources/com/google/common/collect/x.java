package com.google.common.collect;

import defpackage.pa5;
import defpackage.q18;
import defpackage.r18;
import defpackage.w2;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class x extends w implements q18 {
    public final Comparator c;
    public transient w2 d;

    public x(Comparator comparator) {
        comparator.getClass();
        this.c = comparator;
    }

    @Override // defpackage.q18
    public final q18 J() {
        w2 w2Var = this.d;
        if (w2Var != null) {
            return w2Var;
        }
        w2 w2Var2 = new w2(this);
        this.d = w2Var2;
        return w2Var2;
    }

    @Override // com.google.common.collect.w
    public final Set a() {
        return new r18(this);
    }

    @Override // com.google.common.collect.w, defpackage.oa5, defpackage.q18
    public final NavigableSet b() {
        return (NavigableSet) super.b();
    }

    @Override // defpackage.q18, defpackage.p18
    public final Comparator comparator() {
        return this.c;
    }

    @Override // defpackage.q18
    public final pa5 firstEntry() {
        throw null;
    }

    @Override // defpackage.q18
    public final q18 h1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return ((TreeMultiset) ((TreeMultiset) this).D0(obj, boundType)).k0(obj2, boundType2);
    }

    @Override // defpackage.q18
    public final pa5 lastEntry() {
        throw null;
    }

    @Override // defpackage.q18
    public final pa5 pollFirstEntry() {
        throw null;
    }

    @Override // defpackage.q18
    public final pa5 pollLastEntry() {
        throw null;
    }

    @Override // com.google.common.collect.w, defpackage.oa5, defpackage.q18
    public final Set b() {
        return (NavigableSet) super.b();
    }

    public x() {
        this(NaturalOrdering.c);
    }
}
