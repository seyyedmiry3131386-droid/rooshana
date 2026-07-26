package com.google.common.hash;

import defpackage.ct2;
import defpackage.nx2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Murmur3_128HashFunction extends ct2 implements Serializable {
    private static final long serialVersionUID = 0;

    static {
        int i = nx2.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof Murmur3_128HashFunction;
    }

    public final int hashCode() {
        return Murmur3_128HashFunction.class.hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_128(0)";
    }
}
