package com.google.common.collect;

import defpackage.wu8;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends o0 {
    public final Comparator v;

    public q0(Comparator comparator) {
        super(4);
        this.v = comparator;
    }

    @Override // com.google.common.collect.o0
    /* JADX INFO: renamed from: S */
    public final o0 e(Object obj) {
        super.e(obj);
        return this;
    }

    @Override // com.google.common.collect.o0
    public final ImmutableSet T() {
        ImmutableSortedSet immutableSortedSetV = ImmutableSortedSet.v(this.v, this.t, this.s);
        this.t = ((RegularImmutableSortedSet) immutableSortedSetV).f.size();
        this.u = true;
        return immutableSortedSetV;
    }

    @Override // com.google.common.collect.o0, defpackage.wu8
    public final wu8 e(Object obj) {
        super.e(obj);
        return this;
    }
}
