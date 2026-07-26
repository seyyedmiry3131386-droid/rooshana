package com.google.common.collect;

import com.google.common.collect.ImmutableRangeSet;
import defpackage.zx8;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends e {
    public final defpackage.p0 c;
    public final zx8 d;

    public m0(ImmutableRangeSet.AsSet asSet) {
        asSet.getClass();
        throw null;
    }

    @Override // com.google.common.collect.e
    public final Object a() {
        zx8 zx8Var = this.d;
        if (zx8Var.hasNext()) {
            return (Comparable) zx8Var.next();
        }
        defpackage.p0 p0Var = this.c;
        if (!p0Var.hasNext()) {
            this.a = AbstractIterator$State.c;
            return null;
        }
        Range range = (Range) p0Var.next();
        int i = ContiguousSet.f;
        range.getClass();
        throw null;
    }
}
