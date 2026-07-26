package com.google.common.hash;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Funnels$SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
    public final boolean equals(Object obj) {
        if (obj instanceof Funnels$SequentialFunnel) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        Funnels$SequentialFunnel.class.hashCode();
        throw null;
    }

    public final String toString() {
        return "Funnels.sequentialFunnel(null)";
    }
}
