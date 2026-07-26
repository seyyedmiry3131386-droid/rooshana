package io.sentry;

import defpackage.k31;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m6 implements g2 {
    public static final m6 b = new m6("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));
    public final io.sentry.util.e a;

    public m6(String str) {
        Objects.requireNonNull(str, "value is required");
        this.a = new io.sentry.util.e(new k31(str, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m6.class != obj.getClass()) {
            return false;
        }
        return ((String) this.a.a()).equals(((m6) obj).a.a());
    }

    public final int hashCode() {
        return ((String) this.a.a()).hashCode();
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) {
        ((io.sentry.internal.debugmeta.c) i3Var).z((String) this.a.a());
    }

    public final String toString() {
        return (String) this.a.a();
    }

    public m6() {
        this.a = new io.sentry.util.e(new u1(5));
    }
}
