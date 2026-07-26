package io.sentry.android.replay.capture;

import defpackage.js3;
import io.sentry.c1;
import io.sentry.c6;
import io.sentry.h0;
import io.sentry.u3;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends j {
    public final c6 a;
    public final u3 b;

    public h(c6 c6Var, u3 u3Var) {
        this.a = c6Var;
        this.b = u3Var;
    }

    public static void a(h hVar, c1 c1Var) {
        h0 h0Var = new h0();
        if (c1Var == null) {
            hVar.getClass();
            return;
        }
        c6 c6Var = hVar.a;
        h0Var.h = hVar.b;
        c1Var.u(c6Var, h0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return js3.i(this.a, hVar.a) && js3.i(this.b, hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.a + ", recording=" + this.b + ')';
    }
}
