package com.google.common.collect;

import defpackage.kj3;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends kj3 {
    @Override // defpackage.wu8
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public o0 e(Object obj) {
        obj.getClass();
        O(obj);
        return this;
    }

    public ImmutableSet T() {
        int i = this.t;
        if (i == 0) {
            int i2 = ImmutableSet.c;
            return RegularImmutableSet.j;
        }
        if (i != 1) {
            ImmutableSet immutableSetM = ImmutableSet.m(i, this.s);
            this.t = immutableSetM.size();
            this.u = true;
            return immutableSetM;
        }
        Object obj = this.s[0];
        Objects.requireNonNull(obj);
        int i3 = ImmutableSet.c;
        return new SingletonImmutableSet(obj);
    }
}
