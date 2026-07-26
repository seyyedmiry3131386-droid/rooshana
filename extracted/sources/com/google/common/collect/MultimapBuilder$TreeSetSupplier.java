package com.google.common.collect;

import defpackage.vb8;
import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class MultimapBuilder$TreeSetSupplier<V> implements vb8, Serializable {
    @Override // defpackage.vb8
    public final Object get() {
        return new TreeSet((Comparator) null);
    }
}
