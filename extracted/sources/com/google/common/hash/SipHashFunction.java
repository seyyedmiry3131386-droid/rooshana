package com.google.common.hash;

import defpackage.bl4;
import defpackage.ct2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class SipHashFunction extends ct2 implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(Object obj) {
        return (obj instanceof SipHashFunction) && 0 == 0 && 0 == 0;
    }

    public final int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ 0) ^ 0)) ^ 0) ^ 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Hashing.sipHash");
        sb.append(0);
        sb.append("");
        sb.append(0);
        sb.append("(");
        sb.append(0L);
        sb.append(", ");
        return bl4.s(0L, ")", sb);
    }
}
