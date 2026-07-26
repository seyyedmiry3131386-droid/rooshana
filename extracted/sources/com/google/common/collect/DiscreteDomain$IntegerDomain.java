package com.google.common.collect;

import defpackage.ct2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class DiscreteDomain$IntegerDomain extends ct2 implements Serializable {
    public static final DiscreteDomain$IntegerDomain p = new DiscreteDomain$IntegerDomain();
    private static final long serialVersionUID = 0;

    public DiscreteDomain$IntegerDomain() {
        super(true);
    }

    private Object readResolve() {
        return p;
    }

    public final String toString() {
        return "DiscreteDomain.integers()";
    }
}
