package com.google.common.base;

import com.google.common.collect.e0;

/* JADX INFO: loaded from: classes.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    public final Object a;

    public Present(Object obj) {
        this.a = obj;
    }

    @Override // com.google.common.base.Optional
    public final Object b() {
        return this.a;
    }

    @Override // com.google.common.base.Optional
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.a.equals(((Present) obj).a);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public final Object f(e0 e0Var) {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
