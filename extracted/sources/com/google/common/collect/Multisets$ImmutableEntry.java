package com.google.common.collect;

import defpackage.pa5;
import defpackage.vy2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Multisets$ImmutableEntry<E> extends pa5 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;
    public final int b;

    public Multisets$ImmutableEntry(int i, Object obj) {
        this.a = obj;
        this.b = i;
        vy2.m(i, "count");
    }

    @Override // defpackage.pa5
    public final int a() {
        return this.b;
    }

    @Override // defpackage.pa5
    public final Object b() {
        return this.a;
    }
}
