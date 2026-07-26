package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class us9 {
    public final String a;
    public final String b;
    public final boolean c;

    public us9(String str, String str2, boolean z) {
        rq4.k(str);
        this.a = str;
        rq4.k(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us9)) {
            return false;
        }
        us9 us9Var = (us9) obj;
        return vy2.w(this.a, us9Var.a) && vy2.w(this.b, us9Var.b) && vy2.w(null, null) && this.c == us9Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        rq4.n(null);
        throw null;
    }
}
