package com.google.common.collect;

import defpackage.wn5;
import defpackage.zx8;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends zx8 {
    public AbstractIterator$State a = AbstractIterator$State.b;
    public Object b;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractIterator$State abstractIterator$State = this.a;
        AbstractIterator$State abstractIterator$State2 = AbstractIterator$State.d;
        wn5.t(abstractIterator$State != abstractIterator$State2);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.a = abstractIterator$State2;
            this.b = a();
            if (this.a != AbstractIterator$State.c) {
                this.a = AbstractIterator$State.a;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = AbstractIterator$State.b;
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
