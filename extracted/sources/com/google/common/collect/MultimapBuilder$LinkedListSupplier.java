package com.google.common.collect;

import defpackage.vb8;
import java.util.LinkedList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class MultimapBuilder$LinkedListSupplier implements vb8 {
    public static final /* synthetic */ MultimapBuilder$LinkedListSupplier[] a = {new MultimapBuilder$LinkedListSupplier("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    MultimapBuilder$LinkedListSupplier EF5;

    public static MultimapBuilder$LinkedListSupplier valueOf(String str) {
        return (MultimapBuilder$LinkedListSupplier) Enum.valueOf(MultimapBuilder$LinkedListSupplier.class, str);
    }

    public static MultimapBuilder$LinkedListSupplier[] values() {
        return (MultimapBuilder$LinkedListSupplier[]) a.clone();
    }

    @Override // defpackage.vb8
    public final Object get() {
        return new LinkedList();
    }
}
