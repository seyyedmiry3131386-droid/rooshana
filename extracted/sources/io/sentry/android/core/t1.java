package io.sentry.android.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 {
    public final Integer a;
    public final Boolean b;

    public t1(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return io.sentry.config.a.t(this.a, t1Var.a) && io.sentry.config.a.t(this.b, t1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
