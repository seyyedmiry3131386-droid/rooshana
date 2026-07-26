package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class oi0 {
    public final Boolean a;
    public final int b;
    public final int c;

    public oi0(Boolean bool, int i, int i2) {
        this.a = bool;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && oi0.class == obj.getClass()) {
                oi0 oi0Var = (oi0) obj;
                if (this.b == oi0Var.b && this.c == oi0Var.c) {
                    Boolean bool = oi0Var.a;
                    Boolean bool2 = this.a;
                    if (bool2 == null ? bool == null : bool2.equals(bool)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
