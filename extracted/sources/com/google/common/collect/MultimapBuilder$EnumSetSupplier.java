package com.google.common.collect;

import defpackage.vb8;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
final class MultimapBuilder$EnumSetSupplier<V extends Enum<V>> implements vb8, Serializable {
    @Override // defpackage.vb8
    public final Object get() {
        return EnumSet.noneOf(null);
    }
}
