package com.google.common.hash;

import defpackage.hd0;
import defpackage.wn5;
import defpackage.zi6;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class BloomFilter<T> implements zi6, Serializable {
    private static final long serialVersionUID = 912559;
    public final hd0 a;

    public static class SerialForm<T> implements Serializable {
        private static final long serialVersionUID = 1;
        public final long[] a;

        public SerialForm(BloomFilter bloomFilter) {
            this.a = hd0.a(bloomFilter.a.a);
        }

        public Object readResolve() {
            new BloomFilter(new hd0(this.a));
            throw null;
        }
    }

    public interface Strategy extends Serializable {
    }

    public BloomFilter(hd0 hd0Var) {
        wn5.h("numHashFunctions (%s) must be > 0", 0, false);
        this.a = hd0Var;
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // defpackage.zi6
    public final boolean apply(Object obj) {
        throw null;
    }

    @Override // defpackage.zi6
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, null, null, this.a});
    }
}
