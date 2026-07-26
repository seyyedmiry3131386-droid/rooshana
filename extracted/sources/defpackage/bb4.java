package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bb4 {
    public final long a;
    public final float b;
    public final long c;

    public bb4(ab4 ab4Var) {
        this.a = ab4Var.a;
        this.b = ab4Var.b;
        this.c = ab4Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb4)) {
            return false;
        }
        bb4 bb4Var = (bb4) obj;
        return this.a == bb4Var.a && this.b == bb4Var.b && this.c == bb4Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
