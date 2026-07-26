package com.google.common.collect;

import defpackage.yo8;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends j0 {
    @Override // com.google.common.collect.j0
    public final j0 c(Object obj, Object obj2) {
        super.c(obj, obj2);
        return this;
    }

    @Override // com.google.common.collect.j0
    public final j0 d(Iterable iterable) {
        super.d(iterable);
        return this;
    }

    @Override // com.google.common.collect.j0
    public final j0 e(Map map) {
        super.e(map);
        return this;
    }

    @Override // com.google.common.collect.j0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ImmutableBiMap b() {
        if (this.b == 0) {
            return RegularImmutableBiMap.i;
        }
        return new RegularImmutableBiMap(this.b, this.a);
    }

    public final void g(yo8 yo8Var, String str) {
        super.c(yo8Var, str);
    }
}
