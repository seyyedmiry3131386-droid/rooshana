package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xh2 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2)) {
            return false;
        }
        xh2 xh2Var = (xh2) obj;
        return Objects.equals(this.a, xh2Var.a) && Objects.equals(this.b, xh2Var.b) && Objects.equals(this.c, xh2Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
