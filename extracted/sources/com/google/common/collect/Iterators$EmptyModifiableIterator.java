package com.google.common.collect;

import defpackage.vy2;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Iterators$EmptyModifiableIterator implements Iterator<Object> {
    public static final Iterators$EmptyModifiableIterator a;
    public static final /* synthetic */ Iterators$EmptyModifiableIterator[] b;

    static {
        Iterators$EmptyModifiableIterator iterators$EmptyModifiableIterator = new Iterators$EmptyModifiableIterator("INSTANCE", 0);
        a = iterators$EmptyModifiableIterator;
        b = new Iterators$EmptyModifiableIterator[]{iterators$EmptyModifiableIterator};
    }

    public static Iterators$EmptyModifiableIterator valueOf(String str) {
        return (Iterators$EmptyModifiableIterator) Enum.valueOf(Iterators$EmptyModifiableIterator.class, str);
    }

    public static Iterators$EmptyModifiableIterator[] values() {
        return (Iterators$EmptyModifiableIterator[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        vy2.q(false);
    }
}
