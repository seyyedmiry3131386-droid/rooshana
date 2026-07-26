package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cm {
    public final int a;
    public final qq4 b;
    public final ql c;
    public final String d;

    public cm(qq4 qq4Var, ql qlVar, String str) {
        this.b = qq4Var;
        this.c = qlVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{qq4Var, qlVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cm)) {
            return false;
        }
        cm cmVar = (cm) obj;
        return vy2.w(this.b, cmVar.b) && vy2.w(this.c, cmVar.c) && vy2.w(this.d, cmVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
