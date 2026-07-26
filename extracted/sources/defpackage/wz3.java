package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wz3 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = j29.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public wz3(String str, String str2) {
        this.a = j29.W(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wz3.class == obj.getClass()) {
            wz3 wz3Var = (wz3) obj;
            if (Objects.equals(this.a, wz3Var.a) && Objects.equals(this.b, wz3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
