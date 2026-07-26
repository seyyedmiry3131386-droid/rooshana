package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class um9 {
    public final String a;
    public final long b;

    public um9(long j, String str) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof um9) {
            um9 um9Var = (um9) obj;
            if (vy2.w(this.a, um9Var.a)) {
                if (vy2.w(Long.valueOf(this.b), Long.valueOf(um9Var.b))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }
}
