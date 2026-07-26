package com.google.common.collect;

import defpackage.vb8;
import defpackage.vy2;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class MultimapBuilder$ArrayListSupplier<V> implements vb8, Serializable {
    public final int a;

    public MultimapBuilder$ArrayListSupplier() {
        vy2.m(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // defpackage.vb8
    public final Object get() {
        return new ArrayList(this.a);
    }
}
