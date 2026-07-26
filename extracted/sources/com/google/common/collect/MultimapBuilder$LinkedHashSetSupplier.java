package com.google.common.collect;

import defpackage.vb8;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class MultimapBuilder$LinkedHashSetSupplier<V> implements vb8, Serializable {
    @Override // defpackage.vb8
    public final Object get() {
        return new CompactLinkedHashSet(0);
    }
}
