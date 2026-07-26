package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ee6 {
    public final String a;
    public final b41 b;
    public final Object c;

    static {
        new ee6("");
    }

    public ee6(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new b41() : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        b41 b41Var;
        b41Var = this.b;
        b41Var.getClass();
        return (LogSessionId) b41Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee6)) {
            return false;
        }
        ee6 ee6Var = (ee6) obj;
        return Objects.equals(this.a, ee6Var.a) && Objects.equals(this.b, ee6Var.b) && Objects.equals(this.c, ee6Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
