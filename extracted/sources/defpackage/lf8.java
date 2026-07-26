package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lf8 implements ql {
    public static final lf8 b = new lf8(null);
    public final String a;

    public /* synthetic */ lf8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lf8) {
            return vy2.w(this.a, ((lf8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
