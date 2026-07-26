package com.google.common.net;

import defpackage.s7;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HostAndPort) && s7.l(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, 0});
    }

    public final String toString() {
        throw null;
    }
}
