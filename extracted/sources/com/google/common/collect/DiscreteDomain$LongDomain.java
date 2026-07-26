package com.google.common.collect;

import defpackage.ct2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class DiscreteDomain$LongDomain extends ct2 implements Serializable {
    public static final DiscreteDomain$LongDomain p = new DiscreteDomain$LongDomain();
    private static final long serialVersionUID = 0;

    public DiscreteDomain$LongDomain() {
        super(true);
    }

    private Object readResolve() {
        return p;
    }

    public final String toString() {
        return "DiscreteDomain.longs()";
    }
}
