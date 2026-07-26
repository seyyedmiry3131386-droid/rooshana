package io.sentry.protocol;

import defpackage.k31;
import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import io.sentry.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements g2 {
    public static final v b = new v("00000000-0000-0000-0000-000000000000".replace("-", ""));
    public final io.sentry.util.e a;

    public v() {
        this.a = new io.sentry.util.e(new u1(28));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return ((String) this.a.a()).equals(((v) obj).a.a());
    }

    public final int hashCode() {
        return ((String) this.a.a()).hashCode();
    }

    @Override // io.sentry.g2
    public final void serialize(i3 i3Var, u0 u0Var) {
        ((io.sentry.internal.debugmeta.c) i3Var).z(toString());
    }

    public final String toString() {
        return (String) this.a.a();
    }

    public v(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        }
        if (str2.length() == 36) {
            this.a = new io.sentry.util.e(new k31(this, str2));
        } else {
            this.a = new io.sentry.util.e(new k31(str2, 3));
        }
    }
}
