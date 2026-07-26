package com.google.common.base;

import com.google.common.collect.e0;

/* JADX INFO: loaded from: classes.dex */
final class Absent<T> extends Optional<T> {
    public static final Absent a = new Absent();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.base.Optional
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.Optional
    public final Object f(e0 e0Var) {
        return e0Var;
    }
}
