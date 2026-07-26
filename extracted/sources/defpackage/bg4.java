package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bg4 {
    public final gf4 a;
    public final Throwable b;

    public bg4(gf4 gf4Var) {
        this.a = gf4Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg4)) {
            return false;
        }
        bg4 bg4Var = (bg4) obj;
        gf4 gf4Var = this.a;
        if (gf4Var != null && gf4Var.equals(bg4Var.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || bg4Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public bg4(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
