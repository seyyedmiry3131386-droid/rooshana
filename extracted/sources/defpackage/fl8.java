package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fl8 extends fv6 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = j29.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public fl8() {
        this.b = false;
        this.c = false;
    }

    @Override // defpackage.fv6
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.fv6
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(fv6.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fl8)) {
            return false;
        }
        fl8 fl8Var = (fl8) obj;
        return this.c == fl8Var.c && this.b == fl8Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public fl8(boolean z) {
        this.b = true;
        this.c = z;
    }
}
