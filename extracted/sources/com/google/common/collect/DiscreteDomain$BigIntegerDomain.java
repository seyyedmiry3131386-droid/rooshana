package com.google.common.collect;

import defpackage.ct2;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class DiscreteDomain$BigIntegerDomain extends ct2 implements Serializable {
    public static final DiscreteDomain$BigIntegerDomain p = new DiscreteDomain$BigIntegerDomain();
    private static final long serialVersionUID = 0;

    static {
        BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger.valueOf(Long.MAX_VALUE);
    }

    public DiscreteDomain$BigIntegerDomain() {
        super(true);
    }

    private Object readResolve() {
        return p;
    }

    public final String toString() {
        return "DiscreteDomain.bigIntegers()";
    }
}
